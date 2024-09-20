package se.umu.cs.ads.a2.types;

import java.util.ArrayList;

public class FingerTable {

    private ArrayList<Long> starts;
    private ArrayList<KeyInterval> intervals;
    private ArrayList<NodeId> successorIds;

    public FingerTable() {
        this.starts = new ArrayList<>();
        this.intervals = new ArrayList<>();
        this.successorIds = new ArrayList<>();
    }

    public void addRow(Long start, KeyInterval interval, NodeId successorId) {
        this.starts.add(start);
        this.intervals.add(interval);
        this.successorIds.add(successorId);
    }

    public Long getStart(int i) {
        return starts.get(i);
    }

    public KeyInterval getInterval(int i) {
        return intervals.get(i);
    }

    public NodeId getSuccessor(int i) {
        return successorIds.get(i);
    }
}
