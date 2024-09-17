package se.umu.cs.ads.a2.types;

import se.umu.cs.ads.a2.adts.AbstractStringType;
import se.umu.cs.ads.a2.util.Util;

public class NodeId extends AbstractStringType {
    public NodeId (String value)
    {
        super(value);

        if (!Util.validateNodeId(value))
            throw new IllegalArgumentException(value);
    }
}
