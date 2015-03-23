// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poll_service.proto

package io.grpc.examples.pollservice;

/**
 * Protobuf type {@code grpc.example.pollservice.PollQuestion}
 */
public  final class PollQuestion extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.example.pollservice.PollQuestion)
    PollQuestionOrBuilder {
  // Use PollQuestion.newBuilder() to construct.
  private PollQuestion(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private PollQuestion() {
    question_ = "";
    startedAt_ = 0L;
    expiredAt_ = 0L;
    choices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PollQuestion(
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
            io.grpc.examples.pollservice.PollId.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(io.grpc.examples.pollservice.PollId.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            question_ = bs;
            break;
          }
          case 24: {

            startedAt_ = input.readInt64();
            break;
          }
          case 32: {

            expiredAt_ = input.readInt64();
            break;
          }
          case 42: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              choices_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            choices_.add(bs);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        choices_ = choices_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollQuestion_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollQuestion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.pollservice.PollQuestion.class, io.grpc.examples.pollservice.PollQuestion.Builder.class);
  }

  public static final com.google.protobuf.Parser<PollQuestion> PARSER =
      new com.google.protobuf.AbstractParser<PollQuestion>() {
    public PollQuestion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PollQuestion(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<PollQuestion> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private io.grpc.examples.pollservice.PollId id_;
  /**
   * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
   */
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
   */
  public io.grpc.examples.pollservice.PollId getId() {
    return id_ == null ? io.grpc.examples.pollservice.PollId.getDefaultInstance() : id_;
  }
  /**
   * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
   */
  public io.grpc.examples.pollservice.PollIdOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int QUESTION_FIELD_NUMBER = 2;
  private java.lang.Object question_;
  /**
   * <code>optional string question = 2;</code>
   */
  public java.lang.String getQuestion() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        question_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string question = 2;</code>
   */
  public com.google.protobuf.ByteString
      getQuestionBytes() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      question_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTED_AT_FIELD_NUMBER = 3;
  private long startedAt_;
  /**
   * <code>optional int64 started_at = 3;</code>
   */
  public long getStartedAt() {
    return startedAt_;
  }

  public static final int EXPIRED_AT_FIELD_NUMBER = 4;
  private long expiredAt_;
  /**
   * <code>optional int64 expired_at = 4;</code>
   */
  public long getExpiredAt() {
    return expiredAt_;
  }

  public static final int CHOICES_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList choices_;
  /**
   * <code>repeated string choices = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getChoicesList() {
    return choices_;
  }
  /**
   * <code>repeated string choices = 5;</code>
   */
  public int getChoicesCount() {
    return choices_.size();
  }
  /**
   * <code>repeated string choices = 5;</code>
   */
  public java.lang.String getChoices(int index) {
    return choices_.get(index);
  }
  /**
   * <code>repeated string choices = 5;</code>
   */
  public com.google.protobuf.ByteString
      getChoicesBytes(int index) {
    return choices_.getByteString(index);
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
    getSerializedSize();
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (!getQuestionBytes().isEmpty()) {
      output.writeBytes(2, getQuestionBytes());
    }
    if (startedAt_ != 0L) {
      output.writeInt64(3, startedAt_);
    }
    if (expiredAt_ != 0L) {
      output.writeInt64(4, expiredAt_);
    }
    for (int i = 0; i < choices_.size(); i++) {
      output.writeBytes(5, choices_.getByteString(i));
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (!getQuestionBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getQuestionBytes());
    }
    if (startedAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, startedAt_);
    }
    if (expiredAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, expiredAt_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < choices_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(choices_.getByteString(i));
      }
      size += dataSize;
      size += 1 * getChoicesList().size();
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.examples.pollservice.PollQuestion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.pollservice.PollQuestion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.pollservice.PollQuestion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.pollservice.PollQuestion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.pollservice.PollQuestion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.pollservice.PollQuestion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.pollservice.PollQuestion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.examples.pollservice.PollQuestion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.pollservice.PollQuestion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.pollservice.PollQuestion parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(io.grpc.examples.pollservice.PollQuestion prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.example.pollservice.PollQuestion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.example.pollservice.PollQuestion)
      io.grpc.examples.pollservice.PollQuestionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollQuestion_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollQuestion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.pollservice.PollQuestion.class, io.grpc.examples.pollservice.PollQuestion.Builder.class);
    }

    // Construct using io.grpc.examples.pollservice.PollQuestion.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      question_ = "";

      startedAt_ = 0L;

      expiredAt_ = 0L;

      choices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollQuestion_descriptor;
    }

    public io.grpc.examples.pollservice.PollQuestion getDefaultInstanceForType() {
      return io.grpc.examples.pollservice.PollQuestion.getDefaultInstance();
    }

    public io.grpc.examples.pollservice.PollQuestion build() {
      io.grpc.examples.pollservice.PollQuestion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.examples.pollservice.PollQuestion buildPartial() {
      io.grpc.examples.pollservice.PollQuestion result = new io.grpc.examples.pollservice.PollQuestion(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      result.question_ = question_;
      result.startedAt_ = startedAt_;
      result.expiredAt_ = expiredAt_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        choices_ = choices_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.choices_ = choices_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.pollservice.PollQuestion) {
        return mergeFrom((io.grpc.examples.pollservice.PollQuestion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.pollservice.PollQuestion other) {
      if (other == io.grpc.examples.pollservice.PollQuestion.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (!other.getQuestion().isEmpty()) {
        question_ = other.question_;
        onChanged();
      }
      if (other.getStartedAt() != 0L) {
        setStartedAt(other.getStartedAt());
      }
      if (other.getExpiredAt() != 0L) {
        setExpiredAt(other.getExpiredAt());
      }
      if (!other.choices_.isEmpty()) {
        if (choices_.isEmpty()) {
          choices_ = other.choices_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureChoicesIsMutable();
          choices_.addAll(other.choices_);
        }
        onChanged();
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
      io.grpc.examples.pollservice.PollQuestion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.pollservice.PollQuestion) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private io.grpc.examples.pollservice.PollId id_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.examples.pollservice.PollId, io.grpc.examples.pollservice.PollId.Builder, io.grpc.examples.pollservice.PollIdOrBuilder> idBuilder_;
    /**
     * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
     */
    public io.grpc.examples.pollservice.PollId getId() {
      if (idBuilder_ == null) {
        return id_ == null ? io.grpc.examples.pollservice.PollId.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
     */
    public Builder setId(io.grpc.examples.pollservice.PollId value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
     */
    public Builder setId(
        io.grpc.examples.pollservice.PollId.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
     */
    public Builder mergeId(io.grpc.examples.pollservice.PollId value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            io.grpc.examples.pollservice.PollId.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
     */
    public io.grpc.examples.pollservice.PollId.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
     */
    public io.grpc.examples.pollservice.PollIdOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            io.grpc.examples.pollservice.PollId.getDefaultInstance() : id_;
      }
    }
    /**
     * <code>optional .grpc.example.pollservice.PollId id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.examples.pollservice.PollId, io.grpc.examples.pollservice.PollId.Builder, io.grpc.examples.pollservice.PollIdOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.grpc.examples.pollservice.PollId, io.grpc.examples.pollservice.PollId.Builder, io.grpc.examples.pollservice.PollIdOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private java.lang.Object question_ = "";
    /**
     * <code>optional string question = 2;</code>
     */
    public java.lang.String getQuestion() {
      java.lang.Object ref = question_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          question_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string question = 2;</code>
     */
    public com.google.protobuf.ByteString
        getQuestionBytes() {
      java.lang.Object ref = question_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        question_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string question = 2;</code>
     */
    public Builder setQuestion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      question_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string question = 2;</code>
     */
    public Builder clearQuestion() {
      
      question_ = getDefaultInstance().getQuestion();
      onChanged();
      return this;
    }
    /**
     * <code>optional string question = 2;</code>
     */
    public Builder setQuestionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      question_ = value;
      onChanged();
      return this;
    }

    private long startedAt_ ;
    /**
     * <code>optional int64 started_at = 3;</code>
     */
    public long getStartedAt() {
      return startedAt_;
    }
    /**
     * <code>optional int64 started_at = 3;</code>
     */
    public Builder setStartedAt(long value) {
      
      startedAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 started_at = 3;</code>
     */
    public Builder clearStartedAt() {
      
      startedAt_ = 0L;
      onChanged();
      return this;
    }

    private long expiredAt_ ;
    /**
     * <code>optional int64 expired_at = 4;</code>
     */
    public long getExpiredAt() {
      return expiredAt_;
    }
    /**
     * <code>optional int64 expired_at = 4;</code>
     */
    public Builder setExpiredAt(long value) {
      
      expiredAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 expired_at = 4;</code>
     */
    public Builder clearExpiredAt() {
      
      expiredAt_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList choices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureChoicesIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        choices_ = new com.google.protobuf.LazyStringArrayList(choices_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string choices = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getChoicesList() {
      return choices_.getUnmodifiableView();
    }
    /**
     * <code>repeated string choices = 5;</code>
     */
    public int getChoicesCount() {
      return choices_.size();
    }
    /**
     * <code>repeated string choices = 5;</code>
     */
    public java.lang.String getChoices(int index) {
      return choices_.get(index);
    }
    /**
     * <code>repeated string choices = 5;</code>
     */
    public com.google.protobuf.ByteString
        getChoicesBytes(int index) {
      return choices_.getByteString(index);
    }
    /**
     * <code>repeated string choices = 5;</code>
     */
    public Builder setChoices(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureChoicesIsMutable();
      choices_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string choices = 5;</code>
     */
    public Builder addChoices(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureChoicesIsMutable();
      choices_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string choices = 5;</code>
     */
    public Builder addAllChoices(
        java.lang.Iterable<java.lang.String> values) {
      ensureChoicesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, choices_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string choices = 5;</code>
     */
    public Builder clearChoices() {
      choices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string choices = 5;</code>
     */
    public Builder addChoicesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureChoicesIsMutable();
      choices_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.example.pollservice.PollQuestion)
  }

  // @@protoc_insertion_point(class_scope:grpc.example.pollservice.PollQuestion)
  private static final io.grpc.examples.pollservice.PollQuestion defaultInstance;static {
    defaultInstance = new io.grpc.examples.pollservice.PollQuestion();
  }

  public static io.grpc.examples.pollservice.PollQuestion getDefaultInstance() {
    return defaultInstance;
  }

  public io.grpc.examples.pollservice.PollQuestion getDefaultInstanceForType() {
    return defaultInstance;
  }

}

