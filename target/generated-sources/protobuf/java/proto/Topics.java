// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

package proto;

/**
 * Protobuf type {@code grpc.Topics}
 */
public  final class Topics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.Topics)
    TopicsOrBuilder {
  // Use Topics.newBuilder() to construct.
  private Topics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Topics() {
    topics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Topics(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              topics_ = new java.util.ArrayList<proto.Topic>();
              mutable_bitField0_ |= 0x00000001;
            }
            topics_.add(
                input.readMessage(proto.Topic.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        topics_ = java.util.Collections.unmodifiableList(topics_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.GrpcMessageProto.internal_static_grpc_Topics_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.GrpcMessageProto.internal_static_grpc_Topics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.Topics.class, proto.Topics.Builder.class);
  }

  public static final int TOPICS_FIELD_NUMBER = 1;
  private java.util.List<proto.Topic> topics_;
  /**
   * <code>repeated .grpc.Topic topics = 1;</code>
   */
  public java.util.List<proto.Topic> getTopicsList() {
    return topics_;
  }
  /**
   * <code>repeated .grpc.Topic topics = 1;</code>
   */
  public java.util.List<? extends proto.TopicOrBuilder> 
      getTopicsOrBuilderList() {
    return topics_;
  }
  /**
   * <code>repeated .grpc.Topic topics = 1;</code>
   */
  public int getTopicsCount() {
    return topics_.size();
  }
  /**
   * <code>repeated .grpc.Topic topics = 1;</code>
   */
  public proto.Topic getTopics(int index) {
    return topics_.get(index);
  }
  /**
   * <code>repeated .grpc.Topic topics = 1;</code>
   */
  public proto.TopicOrBuilder getTopicsOrBuilder(
      int index) {
    return topics_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < topics_.size(); i++) {
      output.writeMessage(1, topics_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < topics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, topics_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto.Topics)) {
      return super.equals(obj);
    }
    proto.Topics other = (proto.Topics) obj;

    boolean result = true;
    result = result && getTopicsList()
        .equals(other.getTopicsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTopicsCount() > 0) {
      hash = (37 * hash) + TOPICS_FIELD_NUMBER;
      hash = (53 * hash) + getTopicsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.Topics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Topics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Topics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Topics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Topics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Topics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Topics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Topics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Topics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.Topics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Topics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Topics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.Topics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.Topics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.Topics)
      proto.TopicsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.GrpcMessageProto.internal_static_grpc_Topics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.GrpcMessageProto.internal_static_grpc_Topics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.Topics.class, proto.Topics.Builder.class);
    }

    // Construct using proto.Topics.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTopicsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (topicsBuilder_ == null) {
        topics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        topicsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.GrpcMessageProto.internal_static_grpc_Topics_descriptor;
    }

    public proto.Topics getDefaultInstanceForType() {
      return proto.Topics.getDefaultInstance();
    }

    public proto.Topics build() {
      proto.Topics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.Topics buildPartial() {
      proto.Topics result = new proto.Topics(this);
      int from_bitField0_ = bitField0_;
      if (topicsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          topics_ = java.util.Collections.unmodifiableList(topics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.topics_ = topics_;
      } else {
        result.topics_ = topicsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.Topics) {
        return mergeFrom((proto.Topics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.Topics other) {
      if (other == proto.Topics.getDefaultInstance()) return this;
      if (topicsBuilder_ == null) {
        if (!other.topics_.isEmpty()) {
          if (topics_.isEmpty()) {
            topics_ = other.topics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTopicsIsMutable();
            topics_.addAll(other.topics_);
          }
          onChanged();
        }
      } else {
        if (!other.topics_.isEmpty()) {
          if (topicsBuilder_.isEmpty()) {
            topicsBuilder_.dispose();
            topicsBuilder_ = null;
            topics_ = other.topics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            topicsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTopicsFieldBuilder() : null;
          } else {
            topicsBuilder_.addAllMessages(other.topics_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      proto.Topics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.Topics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto.Topic> topics_ =
      java.util.Collections.emptyList();
    private void ensureTopicsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        topics_ = new java.util.ArrayList<proto.Topic>(topics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Topic, proto.Topic.Builder, proto.TopicOrBuilder> topicsBuilder_;

    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public java.util.List<proto.Topic> getTopicsList() {
      if (topicsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(topics_);
      } else {
        return topicsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public int getTopicsCount() {
      if (topicsBuilder_ == null) {
        return topics_.size();
      } else {
        return topicsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public proto.Topic getTopics(int index) {
      if (topicsBuilder_ == null) {
        return topics_.get(index);
      } else {
        return topicsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public Builder setTopics(
        int index, proto.Topic value) {
      if (topicsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicsIsMutable();
        topics_.set(index, value);
        onChanged();
      } else {
        topicsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public Builder setTopics(
        int index, proto.Topic.Builder builderForValue) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.set(index, builderForValue.build());
        onChanged();
      } else {
        topicsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public Builder addTopics(proto.Topic value) {
      if (topicsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicsIsMutable();
        topics_.add(value);
        onChanged();
      } else {
        topicsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public Builder addTopics(
        int index, proto.Topic value) {
      if (topicsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicsIsMutable();
        topics_.add(index, value);
        onChanged();
      } else {
        topicsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public Builder addTopics(
        proto.Topic.Builder builderForValue) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.add(builderForValue.build());
        onChanged();
      } else {
        topicsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public Builder addTopics(
        int index, proto.Topic.Builder builderForValue) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.add(index, builderForValue.build());
        onChanged();
      } else {
        topicsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public Builder addAllTopics(
        java.lang.Iterable<? extends proto.Topic> values) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, topics_);
        onChanged();
      } else {
        topicsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public Builder clearTopics() {
      if (topicsBuilder_ == null) {
        topics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        topicsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public Builder removeTopics(int index) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.remove(index);
        onChanged();
      } else {
        topicsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public proto.Topic.Builder getTopicsBuilder(
        int index) {
      return getTopicsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public proto.TopicOrBuilder getTopicsOrBuilder(
        int index) {
      if (topicsBuilder_ == null) {
        return topics_.get(index);  } else {
        return topicsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public java.util.List<? extends proto.TopicOrBuilder> 
         getTopicsOrBuilderList() {
      if (topicsBuilder_ != null) {
        return topicsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(topics_);
      }
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public proto.Topic.Builder addTopicsBuilder() {
      return getTopicsFieldBuilder().addBuilder(
          proto.Topic.getDefaultInstance());
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public proto.Topic.Builder addTopicsBuilder(
        int index) {
      return getTopicsFieldBuilder().addBuilder(
          index, proto.Topic.getDefaultInstance());
    }
    /**
     * <code>repeated .grpc.Topic topics = 1;</code>
     */
    public java.util.List<proto.Topic.Builder> 
         getTopicsBuilderList() {
      return getTopicsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Topic, proto.Topic.Builder, proto.TopicOrBuilder> 
        getTopicsFieldBuilder() {
      if (topicsBuilder_ == null) {
        topicsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Topic, proto.Topic.Builder, proto.TopicOrBuilder>(
                topics_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        topics_ = null;
      }
      return topicsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.Topics)
  }

  // @@protoc_insertion_point(class_scope:grpc.Topics)
  private static final proto.Topics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.Topics();
  }

  public static proto.Topics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Topics>
      PARSER = new com.google.protobuf.AbstractParser<Topics>() {
    public Topics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Topics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Topics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Topics> getParserForType() {
    return PARSER;
  }

  public proto.Topics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

