package se.umu.cs.ads.a2.backend.chord;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import proto.*;
import se.umu.cs.ads.a2.types.NodeId;

import java.io.IOException;

public class NodeServer {

    private NodeId nodeId;
    private Server server;

    public NodeServer(NodeId id, int bitSize) {
        this.nodeId = id;
    }

    public void start(int port) {
        try {
            server = ServerBuilder.forPort(port).addService(new MessengerDHTService()).build();
            server.start();
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
    }
}
