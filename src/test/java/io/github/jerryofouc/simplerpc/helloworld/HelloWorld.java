// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.github.jerryofouc.simplerpc.helloworld;

public final class HelloWorld {
  private HelloWorld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface HelloWorldRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string ping = 2;
    /**
     * <code>required string ping = 2;</code>
     */
    boolean hasPing();
    /**
     * <code>required string ping = 2;</code>
     */
    java.lang.String getPing();
    /**
     * <code>required string ping = 2;</code>
     */
    com.google.protobuf.ByteString
        getPingBytes();
  }
  /**
   * Protobuf type {@code helloworld.HelloWorldRequest}
   */
  public static final class HelloWorldRequest extends
      com.google.protobuf.GeneratedMessage
      implements HelloWorldRequestOrBuilder {
    // Use HelloWorldRequest.newBuilder() to construct.
    private HelloWorldRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private HelloWorldRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final HelloWorldRequest defaultInstance;
    public static HelloWorldRequest getDefaultInstance() {
      return defaultInstance;
    }

    public HelloWorldRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private HelloWorldRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000001;
              ping_ = input.readBytes();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_HelloWorldRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_HelloWorldRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest.class, io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<HelloWorldRequest> PARSER =
        new com.google.protobuf.AbstractParser<HelloWorldRequest>() {
      public HelloWorldRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloWorldRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<HelloWorldRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string ping = 2;
    public static final int PING_FIELD_NUMBER = 2;
    private java.lang.Object ping_;
    /**
     * <code>required string ping = 2;</code>
     */
    public boolean hasPing() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string ping = 2;</code>
     */
    public java.lang.String getPing() {
      java.lang.Object ref = ping_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ping_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string ping = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPingBytes() {
      java.lang.Object ref = ping_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ping_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      ping_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasPing()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(2, getPingBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPingBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest prototype) {
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
     * Protobuf type {@code helloworld.HelloWorldRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_HelloWorldRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_HelloWorldRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest.class, io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest.Builder.class);
      }

      // Construct using io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest.newBuilder()
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
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        ping_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_HelloWorldRequest_descriptor;
      }

      public io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest getDefaultInstanceForType() {
        return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest.getDefaultInstance();
      }

      public io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest build() {
        io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest buildPartial() {
        io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest result = new io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ping_ = ping_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest) {
          return mergeFrom((io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest other) {
        if (other == io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest.getDefaultInstance()) return this;
        if (other.hasPing()) {
          bitField0_ |= 0x00000001;
          ping_ = other.ping_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasPing()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.github.jerryofouc.simplerpc.helloworld.HelloWorld.HelloWorldRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string ping = 2;
      private java.lang.Object ping_ = "";
      /**
       * <code>required string ping = 2;</code>
       */
      public boolean hasPing() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string ping = 2;</code>
       */
      public java.lang.String getPing() {
        java.lang.Object ref = ping_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          ping_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string ping = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPingBytes() {
        java.lang.Object ref = ping_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ping_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string ping = 2;</code>
       */
      public Builder setPing(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ping_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string ping = 2;</code>
       */
      public Builder clearPing() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ping_ = getDefaultInstance().getPing();
        onChanged();
        return this;
      }
      /**
       * <code>required string ping = 2;</code>
       */
      public Builder setPingBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ping_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:helloworld.HelloWorldRequest)
    }

    static {
      defaultInstance = new HelloWorldRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:helloworld.HelloWorldRequest)
  }

  public interface RPCResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 responseCode = 1;
    /**
     * <code>required int32 responseCode = 1;</code>
     */
    boolean hasResponseCode();
    /**
     * <code>required int32 responseCode = 1;</code>
     */
    int getResponseCode();

    // required string pong = 2;
    /**
     * <code>required string pong = 2;</code>
     */
    boolean hasPong();
    /**
     * <code>required string pong = 2;</code>
     */
    java.lang.String getPong();
    /**
     * <code>required string pong = 2;</code>
     */
    com.google.protobuf.ByteString
        getPongBytes();
  }
  /**
   * Protobuf type {@code helloworld.RPCResponse}
   */
  public static final class RPCResponse extends
      com.google.protobuf.GeneratedMessage
      implements RPCResponseOrBuilder {
    // Use RPCResponse.newBuilder() to construct.
    private RPCResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RPCResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RPCResponse defaultInstance;
    public static RPCResponse getDefaultInstance() {
      return defaultInstance;
    }

    public RPCResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RPCResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              responseCode_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              pong_ = input.readBytes();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_RPCResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_RPCResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse.class, io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<RPCResponse> PARSER =
        new com.google.protobuf.AbstractParser<RPCResponse>() {
      public RPCResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RPCResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RPCResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 responseCode = 1;
    public static final int RESPONSECODE_FIELD_NUMBER = 1;
    private int responseCode_;
    /**
     * <code>required int32 responseCode = 1;</code>
     */
    public boolean hasResponseCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 responseCode = 1;</code>
     */
    public int getResponseCode() {
      return responseCode_;
    }

    // required string pong = 2;
    public static final int PONG_FIELD_NUMBER = 2;
    private java.lang.Object pong_;
    /**
     * <code>required string pong = 2;</code>
     */
    public boolean hasPong() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string pong = 2;</code>
     */
    public java.lang.String getPong() {
      java.lang.Object ref = pong_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          pong_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string pong = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPongBytes() {
      java.lang.Object ref = pong_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pong_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      responseCode_ = 0;
      pong_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasResponseCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPong()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, responseCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPongBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, responseCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPongBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse prototype) {
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
     * Protobuf type {@code helloworld.RPCResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_RPCResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_RPCResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse.class, io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse.Builder.class);
      }

      // Construct using io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse.newBuilder()
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
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        responseCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        pong_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.internal_static_helloworld_RPCResponse_descriptor;
      }

      public io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse getDefaultInstanceForType() {
        return io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse.getDefaultInstance();
      }

      public io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse build() {
        io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse buildPartial() {
        io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse result = new io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.responseCode_ = responseCode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.pong_ = pong_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse) {
          return mergeFrom((io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse other) {
        if (other == io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse.getDefaultInstance()) return this;
        if (other.hasResponseCode()) {
          setResponseCode(other.getResponseCode());
        }
        if (other.hasPong()) {
          bitField0_ |= 0x00000002;
          pong_ = other.pong_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasResponseCode()) {
          
          return false;
        }
        if (!hasPong()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.github.jerryofouc.simplerpc.helloworld.HelloWorld.RPCResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 responseCode = 1;
      private int responseCode_ ;
      /**
       * <code>required int32 responseCode = 1;</code>
       */
      public boolean hasResponseCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 responseCode = 1;</code>
       */
      public int getResponseCode() {
        return responseCode_;
      }
      /**
       * <code>required int32 responseCode = 1;</code>
       */
      public Builder setResponseCode(int value) {
        bitField0_ |= 0x00000001;
        responseCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 responseCode = 1;</code>
       */
      public Builder clearResponseCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        responseCode_ = 0;
        onChanged();
        return this;
      }

      // required string pong = 2;
      private java.lang.Object pong_ = "";
      /**
       * <code>required string pong = 2;</code>
       */
      public boolean hasPong() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string pong = 2;</code>
       */
      public java.lang.String getPong() {
        java.lang.Object ref = pong_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          pong_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string pong = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPongBytes() {
        java.lang.Object ref = pong_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          pong_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string pong = 2;</code>
       */
      public Builder setPong(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        pong_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string pong = 2;</code>
       */
      public Builder clearPong() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pong_ = getDefaultInstance().getPong();
        onChanged();
        return this;
      }
      /**
       * <code>required string pong = 2;</code>
       */
      public Builder setPongBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        pong_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:helloworld.RPCResponse)
    }

    static {
      defaultInstance = new RPCResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:helloworld.RPCResponse)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloWorldRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_helloworld_HelloWorldRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_RPCResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_helloworld_RPCResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020helloworld.proto\022\nhelloworld\"!\n\021HelloW" +
      "orldRequest\022\014\n\004ping\030\002 \002(\t\"1\n\013RPCResponse" +
      "\022\024\n\014responseCode\030\001 \002(\005\022\014\n\004pong\030\002 \002(\t2Y\n\021" +
      "HellowroldService\022D\n\nhelloworld\022\035.hellow" +
      "orld.HelloWorldRequest\032\027.helloworld.RPCR" +
      "esponseB7\n)io.github.jerryofouc.simplerp" +
      "c.helloworldB\nHelloWorld"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_helloworld_HelloWorldRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_helloworld_HelloWorldRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_helloworld_HelloWorldRequest_descriptor,
              new java.lang.String[] { "Ping", });
          internal_static_helloworld_RPCResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_helloworld_RPCResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_helloworld_RPCResponse_descriptor,
              new java.lang.String[] { "ResponseCode", "Pong", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
