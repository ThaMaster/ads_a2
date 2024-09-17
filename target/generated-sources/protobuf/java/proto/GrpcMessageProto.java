// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

package proto;

public final class GrpcMessageProto {
  private GrpcMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_MessageId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_MessageId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_MessageIds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_MessageIds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Timestamp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Timestamp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Username_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Username_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Usernames_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Usernames_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Topic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Topic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Topics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Topics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Content_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Content_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Messages_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Messages_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ngrpc.proto\022\004grpc\032\033google/protobuf/empt" +
      "y.proto\"\032\n\tMessageId\022\r\n\005value\030\001 \001(\t\"1\n\nM" +
      "essageIds\022#\n\nmessageIds\030\001 \003(\0132\017.grpc.Mes" +
      "sageId\"\032\n\tTimestamp\022\r\n\005value\030\001 \001(\003\"\031\n\010Us" +
      "ername\022\r\n\005value\030\001 \001(\t\".\n\tUsernames\022!\n\tus" +
      "ernames\030\001 \003(\0132\016.grpc.Username\"(\n\005Topic\022\r" +
      "\n\005value\030\001 \001(\t\022\020\n\010wildcard\030\002 \001(\010\"%\n\006Topic" +
      "s\022\033\n\006topics\030\001 \003(\0132\013.grpc.Topic\"\030\n\007Conten" +
      "t\022\r\n\005value\030\001 \001(\t\"\024\n\004Data\022\014\n\004data\030\001 \001(\014\"\302" +
      "\001\n\007Message\022\033\n\002id\030\001 \001(\0132\017.grpc.MessageId\022",
      "\"\n\ttimestamp\030\002 \001(\0132\017.grpc.Timestamp\022 \n\010u" +
      "sername\030\003 \001(\0132\016.grpc.Username\022\032\n\005topic\030\004" +
      " \001(\0132\013.grpc.Topic\022\036\n\007content\030\005 \001(\0132\r.grp" +
      "c.Content\022\030\n\004data\030\006 \001(\0132\n.grpc.Data\"+\n\010M" +
      "essages\022\037\n\010messages\030\001 \003(\0132\r.grpc.Message" +
      "2\226\005\n\020MessengerService\0225\n\014storeMessage\022\r." +
      "grpc.Message\032\026.google.protobuf.Empty\0227\n\r" +
      "storeMessages\022\016.grpc.Messages\032\026.google.p" +
      "rotobuf.Empty\0221\n\017retrieveMessage\022\017.grpc." +
      "MessageId\032\r.grpc.Message\0224\n\020retrieveMess",
      "ages\022\020.grpc.MessageIds\032\016.grpc.Messages\0228" +
      "\n\rdeleteMessage\022\017.grpc.MessageId\032\026.googl" +
      "e.protobuf.Empty\022:\n\016deleteMessages\022\020.grp" +
      "c.MessageIds\032\026.google.protobuf.Empty\0224\n\t" +
      "listUsers\022\026.google.protobuf.Empty\032\017.grpc" +
      ".Usernames\0222\n\nlistTopics\022\026.google.protob" +
      "uf.Empty\032\014.grpc.Topics\022.\n\016listUserTopics" +
      "\022\016.grpc.Username\032\014.grpc.Topics\022/\n\017listSu" +
      "bscribers\022\013.grpc.Topic\032\017.grpc.Usernames\022" +
      "4\n\020listUserMessages\022\016.grpc.Username\032\020.gr",
      "pc.MessageIds\0222\n\021listTopicMessages\022\013.grp" +
      "c.Topic\032\020.grpc.MessageIdsB\033\n\005protoB\020Grpc" +
      "MessageProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_grpc_MessageId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_MessageId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_MessageId_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_grpc_MessageIds_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_MessageIds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_MessageIds_descriptor,
        new java.lang.String[] { "MessageIds", });
    internal_static_grpc_Timestamp_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpc_Timestamp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Timestamp_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_grpc_Username_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpc_Username_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Username_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_grpc_Usernames_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpc_Usernames_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Usernames_descriptor,
        new java.lang.String[] { "Usernames", });
    internal_static_grpc_Topic_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grpc_Topic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Topic_descriptor,
        new java.lang.String[] { "Value", "Wildcard", });
    internal_static_grpc_Topics_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_grpc_Topics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Topics_descriptor,
        new java.lang.String[] { "Topics", });
    internal_static_grpc_Content_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_grpc_Content_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Content_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_grpc_Data_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_grpc_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Data_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_grpc_Message_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_grpc_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Message_descriptor,
        new java.lang.String[] { "Id", "Timestamp", "Username", "Topic", "Content", "Data", });
    internal_static_grpc_Messages_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_grpc_Messages_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Messages_descriptor,
        new java.lang.String[] { "Messages", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
