// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

package proto;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grpc.MessageId id = 1;</code>
   */
  boolean hasId();
  /**
   * <code>.grpc.MessageId id = 1;</code>
   */
  proto.MessageId getId();
  /**
   * <code>.grpc.MessageId id = 1;</code>
   */
  proto.MessageIdOrBuilder getIdOrBuilder();

  /**
   * <code>.grpc.Timestamp timestamp = 2;</code>
   */
  boolean hasTimestamp();
  /**
   * <code>.grpc.Timestamp timestamp = 2;</code>
   */
  proto.Timestamp getTimestamp();
  /**
   * <code>.grpc.Timestamp timestamp = 2;</code>
   */
  proto.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>.grpc.Username username = 3;</code>
   */
  boolean hasUsername();
  /**
   * <code>.grpc.Username username = 3;</code>
   */
  proto.Username getUsername();
  /**
   * <code>.grpc.Username username = 3;</code>
   */
  proto.UsernameOrBuilder getUsernameOrBuilder();

  /**
   * <code>.grpc.Topic topic = 4;</code>
   */
  boolean hasTopic();
  /**
   * <code>.grpc.Topic topic = 4;</code>
   */
  proto.Topic getTopic();
  /**
   * <code>.grpc.Topic topic = 4;</code>
   */
  proto.TopicOrBuilder getTopicOrBuilder();

  /**
   * <code>.grpc.Content content = 5;</code>
   */
  boolean hasContent();
  /**
   * <code>.grpc.Content content = 5;</code>
   */
  proto.Content getContent();
  /**
   * <code>.grpc.Content content = 5;</code>
   */
  proto.ContentOrBuilder getContentOrBuilder();

  /**
   * <code>.grpc.Data data = 6;</code>
   */
  boolean hasData();
  /**
   * <code>.grpc.Data data = 6;</code>
   */
  proto.Data getData();
  /**
   * <code>.grpc.Data data = 6;</code>
   */
  proto.DataOrBuilder getDataOrBuilder();
}
