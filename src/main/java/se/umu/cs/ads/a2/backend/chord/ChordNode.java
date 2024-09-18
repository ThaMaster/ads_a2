package se.umu.cs.ads.a2.backend.chord;

import se.umu.cs.ads.a2.types.Key;
import se.umu.cs.ads.a2.types.Message;
import se.umu.cs.ads.a2.types.NodeId;
import se.umu.cs.ads.a2.util.Util;

import java.util.HashMap;

public class ChordNode {

    private NodeId nodeId;
    private HashMap<Key, Message> messageMap;

    // The server that will handle all request from external nodes.
    private NodeServer server;
    private NodeClient client;

    private NodeId successor;

    private int bitSize;

    public ChordNode(int bitSize) {
        this.bitSize = bitSize;
        nodeId = new NodeId(Util.getLocalIP(), Util.getFreePort(), bitSize);
        server = new NodeServer(nodeId, bitSize);
        messageMap = new HashMap<>();
    }

    public NodeId getNodeId() {
        return this.nodeId;
    }

    public void create() {

    }

    public void findSuccessor(NodeId id) {
    }

    public void findPredecessor(NodeId id) {
    }

    public void findClosestPrecedingFinger(NodeId id) {
    }

    public void join(NodeId id) {
        client = new NodeClient(nodeId);
        client.create(id.getIp(), id.getPort());

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

    public void shutdown() {
        client.destroy();
    }


    //----------------------------------------------------------
}