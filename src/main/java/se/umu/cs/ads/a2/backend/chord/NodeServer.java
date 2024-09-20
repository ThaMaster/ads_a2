package se.umu.cs.ads.a2.backend.chord;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import proto.MessengerDHTServiceGrpc;
import se.umu.cs.ads.a2.types.NodeId;
import se.umu.cs.ads.a2.util.GrpcUtil;


import java.io.IOException;

public class NodeServer {

    private NodeClient nodeClient;
    private Server server;

    public NodeServer(NodeClient client) {
        this.nodeClient = client;
    }

    public void start(int port) {
        try {
            server = ServerBuilder.forPort(port)
                    .addService(new MessengerDHTService())
                    .build()
                    .start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
            try {
                if (!server.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS)) {
                    server.shutdownNow();
                }
            } catch (InterruptedException e) {
                server.shutdownNow();
            }
        }
    }

    // gRPC implementation below
    private class MessengerDHTService extends MessengerDHTServiceGrpc.MessengerDHTServiceImplBase {
        @Override
        public void findSuccessor(proto.NodeId request, StreamObserver<proto.NodeId> responseObserver) {
            super.findSuccessor(request, responseObserver);
        }

        @Override
        public void findClosestPrecedingNode(proto.NodeId request, StreamObserver<proto.NodeId> responseObserver) {
            super.findClosestPrecedingNode(request, responseObserver);
        }
    }
}
