package se.umu.cs.ads.a2.interfaces;

import se.umu.cs.ads.a2.types.Message;
import se.umu.cs.ads.a2.types.MessageId;

public interface Chord {
    public Message retrieve(MessageId id);
    public void store(Message message);
    public void delete(MessageId id);
}
