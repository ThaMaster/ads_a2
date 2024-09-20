package se.umu.cs.ads.a2.backend.chord;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.*;
import se.umu.cs.ads.a2.types.FingerTable;
import se.umu.cs.ads.a2.types.KeyInterval;
import se.umu.cs.ads.a2.types.NodeId;
import se.umu.cs.ads.a2.util.Util;

public class NodeClient {

    private NodeId myId;
    private NodeId successor;
    private NodeId predecessor;
    private FingerTable fingerTable;
    private int bitSize;

    // The server that will handle all request from external nodes.
    private NodeServer server;

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
    }

    public NodeId findSuccessor(NodeId idToFind) {
        if (KeyInterval.isKeyInside(myId.getId(), successor.getId(), idToFind.getId())) {
            return successor;
        } else {
            NodeId n0 = findClosestPrecedingFinger(idToFind);
            connect(n0);
            // TODO: MAKE PROTO UTIL
            // NodeId foundSuccessor = stub.findSuccessor(idToFind);
            disconnect();
            return foundSuccessor;
        }
    }

    public NodeId findPredecessor(NodeId idToFind) {
        return null;
    }

    public NodeId findClosestPrecedingFinger(NodeId id) {
        return null;
    }

    public void join(NodeId id) {
    }

    public void leave() {
    }

    public void initFingerTable() {
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