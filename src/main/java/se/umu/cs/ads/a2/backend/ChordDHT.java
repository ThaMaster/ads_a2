package se.umu.cs.ads.a2.backend;

import se.umu.cs.ads.a2.backend.chord.NodeClient;
import se.umu.cs.ads.a2.interfaces.MessengerDHT;
import se.umu.cs.ads.a2.types.Message;
import se.umu.cs.ads.a2.types.MessageId;
import se.umu.cs.ads.a2.types.NodeId;

/**
 * This implementation of the distributed hash table utilizes the
 * Chord algorithm to handle the communication and fetching of
 * entries. The implementation handles the communication using
 * gRPC.
 */
public class ChordDHT implements MessengerDHT {

    private NodeId localId;
    private final int bitSize;

    public ChordDHT(int bitSize) {
        this.bitSize = bitSize;
    }

    /**
     * Function for starting a new network.
     *
     * @param nrNodes number of nodes to be inserted on start.
     */
    public void initNetwork(int nrNodes) {
        NodeClient startingNode = new NodeClient(bitSize);
        this.localId = startingNode.getNodeId();
        addNodes(nrNodes-1);
    }

    /**
     * Function for starting a network and connecting it to another
     * running network of chord nodes.
     *
     * @param nrNodes number of nodes to be inserted on start.
     * @param remoteId remote id of a node in another network.
     */
    public void initNetwork(int nrNodes, NodeId remoteId) {
        NodeClient startingNode = new NodeClient(bitSize);
        // Initiates the join with the other network.
        startingNode.join(remoteId);
        this.localId = startingNode.getNodeId();
        addNodes(nrNodes-1);
    }

    public void addNodes(int amount) {
        for(int i = 0; i < amount; i++) {
            NodeClient newNode = new NodeClient(4);
            newNode.join(localId);
        }
    }

    public void addNode() {
        NodeClient newNode = new NodeClient(bitSize);
        newNode.join(localId);
    }

    @Override
    public Message retrieve(MessageId id) {
        return null;
    }

    @Override
    public void store(Message message) {
    }

    @Override
    public void delete(MessageId id) {
    }
}
