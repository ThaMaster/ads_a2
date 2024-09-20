package se.umu.cs.ads.a2.types;

import se.umu.cs.ads.a2.util.Util;

public class NodeId {
    private final Key id;
    private final String ip;
    private final int port;

    public NodeId(String ip, int port, int bitSize) {
        this.id = new Key(Util.sha1Hash((ip + port), bitSize), bitSize);
        this.ip = ip;
        this.port = port;
    }

    public Key getId() {
        return id;
    }

    public String getIp() {
        return this.ip;
    }

    public int getPort() {
        return port;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || o.getClass() != this.getClass()) {
            return false;
        }

        NodeId exNode = (NodeId) o;
        return (id.getValue() == exNode.getId().getValue());
    }
}
