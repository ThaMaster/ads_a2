package se.umu.cs.ads.a2.backend.chord;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.*;
import se.umu.cs.ads.a2.types.FingerTable;
import se.umu.cs.ads.a2.types.KeyInterval;
import se.umu.cs.ads.a2.types.NodeId;
import se.umu.cs.ads.a2.util.GrpcUtil;
import se.umu.cs.ads.a2.util.Util;

public class NodeClient {

    private final NodeId myId;
    private final int bitSize;

    private NodeId mySuccessor;
    private NodeId myPredecessor;

    private FingerTable fingerTable;

    // The server that will handle all request from external nodes.
    private final NodeServer server;

    // Client attributes
    private ManagedChannel channel = null;
    private MessengerDHTServiceGrpc.MessengerDHTServiceBlockingStub stub;
    private NodeId clientId;

    public NodeClient(int bitSize) {
        this.bitSize = bitSize;
        this.myId = new NodeId(Util.getLocalIP(), Util.getFreePort(), bitSize);
        this.server = new NodeServer(this);
        this.fingerTable = new FingerTable();
    }

    public NodeId getNodeId() {
        return this.myId;
    }

    public void create() {
        myPredecessor = null;
        mySuccessor = myId;
    }

    public void join(NodeId id) {
        myPredecessor = null;
        connect(id);
        proto.NodeId foundSuccessor = stub.findSuccessor(GrpcUtil.toProto(id));
        disconnect();
        mySuccessor = GrpcUtil.fromProto(foundSuccessor);

    }

    public void initFingerTable() {
    }

    public NodeId findSuccessor(NodeId idToFind) {
        if (KeyInterval.isKeyInside(myId.getId(), mySuccessor.getId(), idToFind.getId()) || idToFind.getId() == mySuccessor.getId()) {
            return mySuccessor;
        } else {
            NodeId n0 = closestPrecedingFinger(idToFind);

            connect(n0);
            proto.NodeId successorNode = stub.findSuccessor(GrpcUtil.toProto(idToFind));
            disconnect();

            return GrpcUtil.fromProto(successorNode);
        }
    }

    public NodeId closestPrecedingFinger(NodeId id) {
        for(int i = bitSize-1; i >= 0; i--) {
            NodeId sucId = fingerTable.getSuccessor(i);
            if(KeyInterval.isKeyInside(myId.getId(), id.getId(), sucId.getId()))
                return sucId;
        }

        return myId;
    }

    public void updateOthers() {
    }

    public void updateFingerTable() {
    }

    public void stabilize() {
    }

    public void notifyNode() {
    }

    public void fixFingers() {
    }

    //----------------------------------------------------------

    public void connect(NodeId id) {
        if (channel != null) {
            disconnect();
        }
        channel = ManagedChannelBuilder.forAddress(id.getIp(), id.getPort()).usePlaintext().build();
        stub = MessengerDHTServiceGrpc.newBlockingStub(channel);
    }

    public void disconnect() {
        if (channel != null) {
            channel.shutdown();
            try {
                if (!channel.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS)) {
                    channel.shutdownNow();
                }
            } catch (InterruptedException e) {
                channel.shutdownNow();
            }
        }
    }

    //----------------------------------------------------------
}