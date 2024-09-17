package se.umu.cs.ads.a2.backend;

import se.umu.cs.ads.a2.types.Key;
import se.umu.cs.ads.a2.types.Message;
import se.umu.cs.ads.a2.types.NodeId;

import java.util.HashMap;

public class ChordNode {

    private NodeId id;
    private HashMap<Key, Message> messageMap;

    public ChordNode() {
        System.out.println("Created Node!");
    }

    public void findSuccessor(NodeId id) {
    }

    public void findPredecessor(NodeId id) {
    }

    public void findClosestPrecedingFinger(NodeId id) {
    }

    public void join() {
    }

    public void initFingerTable() {
    }

    public void updateOthers() {
    }

    public void updateFingerTable() {
    }

    //----------------------------------------------------------
    // Maybe optional - handle concurrent operations and failures?
    public void newJoin() {
    }

    public void stabilize() {
    }

    public void notifyNode() {
    }

    public void fixFingers() {
    }
    //----------------------------------------------------------
}