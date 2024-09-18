package se.umu.cs.ads.a2.backend.chord;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.MessengerDHTServiceGrpc;
import se.umu.cs.ads.a2.types.NodeId;

public class NodeClient {

    private ManagedChannel channel = null;
    private MessengerDHTServiceGrpc.MessengerDHTServiceBlockingStub stub;
    private NodeId clientId;

    public NodeClient(NodeId id) {
        this.clientId = id;
    }

    public void create(String ip, int port) {
        if (channel != null) {
            destroy();
        }

        channel = ManagedChannelBuilder.forAddress(ip, port).usePlaintext().build();
        stub = MessengerDHTServiceGrpc.newBlockingStub(channel);
    }

    public void destroy() {
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
}
