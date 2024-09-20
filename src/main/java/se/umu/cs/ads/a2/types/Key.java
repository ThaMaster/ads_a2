package se.umu.cs.ads.a2.types;

import se.umu.cs.ads.a2.adts.AbstractLongType;
import se.umu.cs.ads.a2.adts.AbstractStringType;
import se.umu.cs.ads.a2.util.Util;

public class Key extends AbstractLongType {

    private final int bitSize;

    public Key (long value, int bitSize)
    {
        super(value);
        this.bitSize = bitSize;
    }

    public int getBitSize() {
        return bitSize;
    }
}
