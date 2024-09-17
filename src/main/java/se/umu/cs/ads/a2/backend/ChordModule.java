package se.umu.cs.ads.a2.backend;

import se.umu.cs.ads.a2.interfaces.Chord;
import se.umu.cs.ads.a2.types.Message;
import se.umu.cs.ads.a2.types.MessageId;

public class ChordModule implements Chord {
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
