package proto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: grpc.proto")
public final class MessengerServiceGrpc {

  private MessengerServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.MessengerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.Message,
      com.google.protobuf.Empty> METHOD_STORE_MESSAGE =
      io.grpc.MethodDescriptor.<proto.Message, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "storeMessage"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Message.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.Messages,
      com.google.protobuf.Empty> METHOD_STORE_MESSAGES =
      io.grpc.MethodDescriptor.<proto.Messages, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "storeMessages"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Messages.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.MessageId,
      proto.Message> METHOD_RETRIEVE_MESSAGE =
      io.grpc.MethodDescriptor.<proto.MessageId, proto.Message>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "retrieveMessage"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.MessageId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Message.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.MessageIds,
      proto.Messages> METHOD_RETRIEVE_MESSAGES =
      io.grpc.MethodDescriptor.<proto.MessageIds, proto.Messages>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "retrieveMessages"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.MessageIds.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Messages.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.MessageId,
      com.google.protobuf.Empty> METHOD_DELETE_MESSAGE =
      io.grpc.MethodDescriptor.<proto.MessageId, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "deleteMessage"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.MessageId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.MessageIds,
      com.google.protobuf.Empty> METHOD_DELETE_MESSAGES =
      io.grpc.MethodDescriptor.<proto.MessageIds, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "deleteMessages"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.MessageIds.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.Usernames> METHOD_LIST_USERS =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.Usernames>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "listUsers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Usernames.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.Topics> METHOD_LIST_TOPICS =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.Topics>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "listTopics"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Topics.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.Username,
      proto.Topics> METHOD_LIST_USER_TOPICS =
      io.grpc.MethodDescriptor.<proto.Username, proto.Topics>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "listUserTopics"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Username.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Topics.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.Topic,
      proto.Usernames> METHOD_LIST_SUBSCRIBERS =
      io.grpc.MethodDescriptor.<proto.Topic, proto.Usernames>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "listSubscribers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Topic.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Usernames.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.Username,
      proto.MessageIds> METHOD_LIST_USER_MESSAGES =
      io.grpc.MethodDescriptor.<proto.Username, proto.MessageIds>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "listUserMessages"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Username.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.MessageIds.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<proto.Topic,
      proto.MessageIds> METHOD_LIST_TOPIC_MESSAGES =
      io.grpc.MethodDescriptor.<proto.Topic, proto.MessageIds>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.MessengerService", "listTopicMessages"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.Topic.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              proto.MessageIds.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessengerServiceStub newStub(io.grpc.Channel channel) {
    return new MessengerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessengerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessengerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessengerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessengerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MessengerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void storeMessage(proto.Message request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STORE_MESSAGE, responseObserver);
    }

    /**
     */
    public void storeMessages(proto.Messages request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STORE_MESSAGES, responseObserver);
    }

    /**
     */
    public void retrieveMessage(proto.MessageId request,
        io.grpc.stub.StreamObserver<proto.Message> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_MESSAGE, responseObserver);
    }

    /**
     */
    public void retrieveMessages(proto.MessageIds request,
        io.grpc.stub.StreamObserver<proto.Messages> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_MESSAGES, responseObserver);
    }

    /**
     */
    public void deleteMessage(proto.MessageId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_MESSAGE, responseObserver);
    }

    /**
     */
    public void deleteMessages(proto.MessageIds request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_MESSAGES, responseObserver);
    }

    /**
     */
    public void listUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.Usernames> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_USERS, responseObserver);
    }

    /**
     */
    public void listTopics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.Topics> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TOPICS, responseObserver);
    }

    /**
     */
    public void listUserTopics(proto.Username request,
        io.grpc.stub.StreamObserver<proto.Topics> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_USER_TOPICS, responseObserver);
    }

    /**
     */
    public void listSubscribers(proto.Topic request,
        io.grpc.stub.StreamObserver<proto.Usernames> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SUBSCRIBERS, responseObserver);
    }

    /**
     */
    public void listUserMessages(proto.Username request,
        io.grpc.stub.StreamObserver<proto.MessageIds> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_USER_MESSAGES, responseObserver);
    }

    /**
     */
    public void listTopicMessages(proto.Topic request,
        io.grpc.stub.StreamObserver<proto.MessageIds> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TOPIC_MESSAGES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_STORE_MESSAGE,
            asyncUnaryCall(
              new MethodHandlers<
                proto.Message,
                com.google.protobuf.Empty>(
                  this, METHODID_STORE_MESSAGE)))
          .addMethod(
            METHOD_STORE_MESSAGES,
            asyncUnaryCall(
              new MethodHandlers<
                proto.Messages,
                com.google.protobuf.Empty>(
                  this, METHODID_STORE_MESSAGES)))
          .addMethod(
            METHOD_RETRIEVE_MESSAGE,
            asyncUnaryCall(
              new MethodHandlers<
                proto.MessageId,
                proto.Message>(
                  this, METHODID_RETRIEVE_MESSAGE)))
          .addMethod(
            METHOD_RETRIEVE_MESSAGES,
            asyncUnaryCall(
              new MethodHandlers<
                proto.MessageIds,
                proto.Messages>(
                  this, METHODID_RETRIEVE_MESSAGES)))
          .addMethod(
            METHOD_DELETE_MESSAGE,
            asyncUnaryCall(
              new MethodHandlers<
                proto.MessageId,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_MESSAGE)))
          .addMethod(
            METHOD_DELETE_MESSAGES,
            asyncUnaryCall(
              new MethodHandlers<
                proto.MessageIds,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_MESSAGES)))
          .addMethod(
            METHOD_LIST_USERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.Usernames>(
                  this, METHODID_LIST_USERS)))
          .addMethod(
            METHOD_LIST_TOPICS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.Topics>(
                  this, METHODID_LIST_TOPICS)))
          .addMethod(
            METHOD_LIST_USER_TOPICS,
            asyncUnaryCall(
              new MethodHandlers<
                proto.Username,
                proto.Topics>(
                  this, METHODID_LIST_USER_TOPICS)))
          .addMethod(
            METHOD_LIST_SUBSCRIBERS,
            asyncUnaryCall(
              new MethodHandlers<
                proto.Topic,
                proto.Usernames>(
                  this, METHODID_LIST_SUBSCRIBERS)))
          .addMethod(
            METHOD_LIST_USER_MESSAGES,
            asyncUnaryCall(
              new MethodHandlers<
                proto.Username,
                proto.MessageIds>(
                  this, METHODID_LIST_USER_MESSAGES)))
          .addMethod(
            METHOD_LIST_TOPIC_MESSAGES,
            asyncUnaryCall(
              new MethodHandlers<
                proto.Topic,
                proto.MessageIds>(
                  this, METHODID_LIST_TOPIC_MESSAGES)))
          .build();
    }
  }

  /**
   */
  public static final class MessengerServiceStub extends io.grpc.stub.AbstractStub<MessengerServiceStub> {
    private MessengerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessengerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessengerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessengerServiceStub(channel, callOptions);
    }

    /**
     */
    public void storeMessage(proto.Message request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_STORE_MESSAGE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void storeMessages(proto.Messages request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_STORE_MESSAGES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveMessage(proto.MessageId request,
        io.grpc.stub.StreamObserver<proto.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_MESSAGE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveMessages(proto.MessageIds request,
        io.grpc.stub.StreamObserver<proto.Messages> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_MESSAGES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMessage(proto.MessageId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_MESSAGE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMessages(proto.MessageIds request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_MESSAGES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.Usernames> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_USERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTopics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.Topics> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TOPICS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUserTopics(proto.Username request,
        io.grpc.stub.StreamObserver<proto.Topics> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_USER_TOPICS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSubscribers(proto.Topic request,
        io.grpc.stub.StreamObserver<proto.Usernames> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SUBSCRIBERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUserMessages(proto.Username request,
        io.grpc.stub.StreamObserver<proto.MessageIds> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_USER_MESSAGES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTopicMessages(proto.Topic request,
        io.grpc.stub.StreamObserver<proto.MessageIds> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TOPIC_MESSAGES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessengerServiceBlockingStub extends io.grpc.stub.AbstractStub<MessengerServiceBlockingStub> {
    private MessengerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessengerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessengerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessengerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty storeMessage(proto.Message request) {
      return blockingUnaryCall(
          getChannel(), METHOD_STORE_MESSAGE, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty storeMessages(proto.Messages request) {
      return blockingUnaryCall(
          getChannel(), METHOD_STORE_MESSAGES, getCallOptions(), request);
    }

    /**
     */
    public proto.Message retrieveMessage(proto.MessageId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_MESSAGE, getCallOptions(), request);
    }

    /**
     */
    public proto.Messages retrieveMessages(proto.MessageIds request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_MESSAGES, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteMessage(proto.MessageId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_MESSAGE, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteMessages(proto.MessageIds request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_MESSAGES, getCallOptions(), request);
    }

    /**
     */
    public proto.Usernames listUsers(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_USERS, getCallOptions(), request);
    }

    /**
     */
    public proto.Topics listTopics(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TOPICS, getCallOptions(), request);
    }

    /**
     */
    public proto.Topics listUserTopics(proto.Username request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_USER_TOPICS, getCallOptions(), request);
    }

    /**
     */
    public proto.Usernames listSubscribers(proto.Topic request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SUBSCRIBERS, getCallOptions(), request);
    }

    /**
     */
    public proto.MessageIds listUserMessages(proto.Username request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_USER_MESSAGES, getCallOptions(), request);
    }

    /**
     */
    public proto.MessageIds listTopicMessages(proto.Topic request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TOPIC_MESSAGES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessengerServiceFutureStub extends io.grpc.stub.AbstractStub<MessengerServiceFutureStub> {
    private MessengerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessengerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessengerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessengerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> storeMessage(
        proto.Message request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_STORE_MESSAGE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> storeMessages(
        proto.Messages request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_STORE_MESSAGES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Message> retrieveMessage(
        proto.MessageId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_MESSAGE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Messages> retrieveMessages(
        proto.MessageIds request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_MESSAGES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMessage(
        proto.MessageId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_MESSAGE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMessages(
        proto.MessageIds request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_MESSAGES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Usernames> listUsers(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_USERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Topics> listTopics(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TOPICS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Topics> listUserTopics(
        proto.Username request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_USER_TOPICS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Usernames> listSubscribers(
        proto.Topic request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SUBSCRIBERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.MessageIds> listUserMessages(
        proto.Username request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_USER_MESSAGES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.MessageIds> listTopicMessages(
        proto.Topic request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TOPIC_MESSAGES, getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_MESSAGE = 0;
  private static final int METHODID_STORE_MESSAGES = 1;
  private static final int METHODID_RETRIEVE_MESSAGE = 2;
  private static final int METHODID_RETRIEVE_MESSAGES = 3;
  private static final int METHODID_DELETE_MESSAGE = 4;
  private static final int METHODID_DELETE_MESSAGES = 5;
  private static final int METHODID_LIST_USERS = 6;
  private static final int METHODID_LIST_TOPICS = 7;
  private static final int METHODID_LIST_USER_TOPICS = 8;
  private static final int METHODID_LIST_SUBSCRIBERS = 9;
  private static final int METHODID_LIST_USER_MESSAGES = 10;
  private static final int METHODID_LIST_TOPIC_MESSAGES = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessengerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessengerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STORE_MESSAGE:
          serviceImpl.storeMessage((proto.Message) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_STORE_MESSAGES:
          serviceImpl.storeMessages((proto.Messages) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RETRIEVE_MESSAGE:
          serviceImpl.retrieveMessage((proto.MessageId) request,
              (io.grpc.stub.StreamObserver<proto.Message>) responseObserver);
          break;
        case METHODID_RETRIEVE_MESSAGES:
          serviceImpl.retrieveMessages((proto.MessageIds) request,
              (io.grpc.stub.StreamObserver<proto.Messages>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGE:
          serviceImpl.deleteMessage((proto.MessageId) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGES:
          serviceImpl.deleteMessages((proto.MessageIds) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.Usernames>) responseObserver);
          break;
        case METHODID_LIST_TOPICS:
          serviceImpl.listTopics((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.Topics>) responseObserver);
          break;
        case METHODID_LIST_USER_TOPICS:
          serviceImpl.listUserTopics((proto.Username) request,
              (io.grpc.stub.StreamObserver<proto.Topics>) responseObserver);
          break;
        case METHODID_LIST_SUBSCRIBERS:
          serviceImpl.listSubscribers((proto.Topic) request,
              (io.grpc.stub.StreamObserver<proto.Usernames>) responseObserver);
          break;
        case METHODID_LIST_USER_MESSAGES:
          serviceImpl.listUserMessages((proto.Username) request,
              (io.grpc.stub.StreamObserver<proto.MessageIds>) responseObserver);
          break;
        case METHODID_LIST_TOPIC_MESSAGES:
          serviceImpl.listTopicMessages((proto.Topic) request,
              (io.grpc.stub.StreamObserver<proto.MessageIds>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class MessengerServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.GrpcMessageProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MessengerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessengerServiceDescriptorSupplier())
              .addMethod(METHOD_STORE_MESSAGE)
              .addMethod(METHOD_STORE_MESSAGES)
              .addMethod(METHOD_RETRIEVE_MESSAGE)
              .addMethod(METHOD_RETRIEVE_MESSAGES)
              .addMethod(METHOD_DELETE_MESSAGE)
              .addMethod(METHOD_DELETE_MESSAGES)
              .addMethod(METHOD_LIST_USERS)
              .addMethod(METHOD_LIST_TOPICS)
              .addMethod(METHOD_LIST_USER_TOPICS)
              .addMethod(METHOD_LIST_SUBSCRIBERS)
              .addMethod(METHOD_LIST_USER_MESSAGES)
              .addMethod(METHOD_LIST_TOPIC_MESSAGES)
              .build();
        }
      }
    }
    return result;
  }
}
