package se.umu.cs.ads.a2.types;

import se.umu.cs.ads.a2.adts.AbstractStringType;
import se.umu.cs.ads.a2.util.Util;

public class NodeId extends AbstractStringType {
    private final String ip;
    private final int port;

    public NodeId(String ip, int port, int bitSize) {
        super(Util.sha1Hash((ip + port), bitSize));

        this.ip = ip;
        this.port = port;
    }

    public String getIp() {
        return this.ip;
    }

    public int getPort() {
        return port;
    }
}
