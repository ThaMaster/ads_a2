package se.umu.cs.ads.a2.types;

public class KeyInterval {

    private final Key start;
    private final Key end;

    public KeyInterval(Key start, Key end) {
        this.start = start;
        this.end = end;
    }

    public boolean isKeyInside(Key key) {
        long kVal = key.getValue();
        long sVal = start.getValue();
        long eVal = end.getValue();

        // Ex. ( 3, 8 )
        if (sVal < eVal)
            return sVal < kVal && eVal > kVal;

        // Ex. ( 8, 3 )
        if (sVal > eVal)
            return (sVal < kVal && kVal <= Math.pow(2, key.getBitSize()) - 1) || (0 <= kVal && kVal < eVal);

        // Ex. ( 3, 3 )
        return sVal == kVal;
    }

    // Static variant that you can call directly
    public static boolean isKeyInside(Key start, Key end, Key key) {
        long kVal = key.getValue();
        long sVal = start.getValue();
        long eVal = end.getValue();

        // Ex. ( 3, 8 )
        if (sVal < eVal)
            return sVal < kVal && eVal > kVal;

        // Ex. ( 8, 3 )
        if (sVal > eVal)
            return (sVal < kVal && kVal <= Math.pow(2, key.getBitSize()) - 1) || (0 <= kVal && kVal < eVal);

        // Ex. ( 3, 3 )
        return sVal == kVal;
    }
}
