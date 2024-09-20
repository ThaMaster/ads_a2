package se.umu.cs.ads.a2.util;

import com.google.protobuf.ByteString;
import se.umu.cs.ads.a2.types.*;

/**
 * Utility class for parsing data between the generated
 * proto data types and the java data types. Will be
 * used at the endpoints to send and retrieve data.
 */
public class GrpcUtil {

    /**
     * Converts the java MessageId class to the proto version.
     *
     * @param javaId the java class of MessageId
     * @return the proto version of the MessageId
     */
    public static proto.MessageId toProto(MessageId javaId) {
        return proto.MessageId.newBuilder().setValue(javaId.getValue()).build();
    }

    /**
     * Converts the proto MessageId type to the java class.
     *
     * @param protoId the proto version of MessageId
     * @return the java version of MessageId
     */
    public static MessageId fromProto(proto.MessageId protoId) {
        return new MessageId(protoId.getValue());
    }

    /**
     * Converts the java class of Timestamp to the proto version.
     *
     * @param javaTimestamp the java class of Timestamp
     * @return the proto version of Timestamp
     */
    public static proto.Timestamp toProto(Timestamp javaTimestamp) {
        return proto.Timestamp.newBuilder().setValue(javaTimestamp.getValue()).build();
    }

    /**
     * Converts the proto version of Timestamp to the java class.
     *
     * @param protoTimestamp the proto version of Timestamp
     * @return the java class of Timestamp
     */
    public static Timestamp fromProto(proto.Timestamp protoTimestamp) {
        return new Timestamp(protoTimestamp.getValue());
    }

    /**
     * Converts the java class of Username to the proto version.
     *
     * @param javaUsername the java class of Username
     * @return the proto version of Username
     */
    public static proto.Username toProto(Username javaUsername) {
        return proto.Username.newBuilder().setValue(javaUsername.getValue()).build();
    }

    /**
     * Converts the proto version of Username to the java class.
     *
     * @param protoUsername the proto version of Username
     * @return the java class of Username
     */
    public static Username fromProto(proto.Username protoUsername) {
        return new Username(protoUsername.getValue());
    }

    public static proto.Topic toProto(Topic javaTopic) {
        return proto.Topic.newBuilder()
                .setValue(javaTopic.getValue())
                .setWildcard(javaTopic.getWildcard()).build();
    }

    public static Topic fromProto(proto.Topic protoTopic) {
        if (protoTopic.getWildcard()) {
            return new Topic(protoTopic.getValue() + "*");
        } else {
            return new Topic(protoTopic.getValue());
        }
    }

    public static proto.Content toProto(Content javaContent) {
        return proto.Content.newBuilder().setValue(javaContent.getValue()).build();
    }

    public static Content fromProto(proto.Content protoContent) {
        return new Content(protoContent.getValue());
    }

    public static proto.Data toProto(Data javaData) {
        return proto.Data.newBuilder().setData(ByteString.copyFrom(javaData.getValue())).build();
    }

    public static Data fromProto(proto.Data protoData) {
        return new Data(protoData.getData().toByteArray());
    }

    public static proto.Key toProto(Key javaKey) {
        return proto.Key.newBuilder().setValue(javaKey.getValue()).setBitSize(javaKey.getBitSize()).build();
    }

    public static Key fromProto(proto.Key protoKey) {
        return new Key(protoKey.getValue(), protoKey.getBitSize());
    }

    public static proto.NodeId toProto(NodeId javaNodeId) {
        return proto.NodeId.newBuilder()
                .setId(toProto(javaNodeId.getId()))
                .setIp(javaNodeId.getIp())
                .setPort(javaNodeId.getPort())
                .build();
    }

    public static NodeId fromProto(proto.NodeId protoNodeId) {
        return new NodeId(fromProto(protoNodeId.getId()), protoNodeId.getIp(), protoNodeId.getPort());

    }

    public static proto.Message toProto(Message javaMessage) {
        return proto.Message.newBuilder()
                .setId(toProto(javaMessage.getId()))
                .setTimestamp(toProto(javaMessage.getTimestamp()))
                .setUsername(toProto(javaMessage.getUsername()))
                .setTopic(toProto(javaMessage.getTopic()))
                .setContent(toProto(javaMessage.getContent()))
                .setData(toProto(javaMessage.getData()))
                .build();
    }

    public static Message fromProto(proto.Message protoMessage) {
        return new Message(
                fromProto(protoMessage.getId()),
                fromProto(protoMessage.getTimestamp()),
                fromProto(protoMessage.getUsername()),
                fromProto(protoMessage.getTopic()),
                fromProto(protoMessage.getContent()),
                fromProto(protoMessage.getData())
        );
    }
}
