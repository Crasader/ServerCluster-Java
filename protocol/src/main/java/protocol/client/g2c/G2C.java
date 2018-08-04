// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: G2C.proto

package protocol.client.g2c;

public final class G2C {
  private G2C() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MSG_GC_USER_LOGINOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.client.g2c.MSG_GC_USER_LOGIN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 result = 1;</code>
     */
    boolean hasResult();
    /**
     * <code>required int32 result = 1;</code>
     */
    int getResult();

    /**
     * <code>required string accountName = 2;</code>
     */
    boolean hasAccountName();
    /**
     * <code>required string accountName = 2;</code>
     */
    String getAccountName();
    /**
     * <code>required string accountName = 2;</code>
     */
    com.google.protobuf.ByteString
        getAccountNameBytes();

    /**
     * <code>optional int32 token = 3;</code>
     */
    boolean hasToken();
    /**
     * <code>optional int32 token = 3;</code>
     */
    int getToken();
  }
  /**
   * Protobuf type {@code protocol.client.g2c.MSG_GC_USER_LOGIN}
   */
  public  static final class MSG_GC_USER_LOGIN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.client.g2c.MSG_GC_USER_LOGIN)
      MSG_GC_USER_LOGINOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MSG_GC_USER_LOGIN.newBuilder() to construct.
    private MSG_GC_USER_LOGIN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MSG_GC_USER_LOGIN() {
      result_ = 0;
      accountName_ = "";
      token_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MSG_GC_USER_LOGIN(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              result_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              accountName_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              token_ = input.readInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return G2C.internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return G2C.internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MSG_GC_USER_LOGIN.class, Builder.class);
    }

    private int bitField0_;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;
    /**
     * <code>required int32 result = 1;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 result = 1;</code>
     */
    public int getResult() {
      return result_;
    }

    public static final int ACCOUNTNAME_FIELD_NUMBER = 2;
    private volatile Object accountName_;
    /**
     * <code>required string accountName = 2;</code>
     */
    public boolean hasAccountName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string accountName = 2;</code>
     */
    public String getAccountName() {
      Object ref = accountName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          accountName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string accountName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAccountNameBytes() {
      Object ref = accountName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        accountName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOKEN_FIELD_NUMBER = 3;
    private int token_;
    /**
     * <code>optional int32 token = 3;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 token = 3;</code>
     */
    public int getToken() {
      return token_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasResult()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAccountName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, result_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accountName_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, token_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, result_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accountName_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, token_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof MSG_GC_USER_LOGIN)) {
        return super.equals(obj);
      }
      MSG_GC_USER_LOGIN other = (MSG_GC_USER_LOGIN) obj;

      boolean result = true;
      result = result && (hasResult() == other.hasResult());
      if (hasResult()) {
        result = result && (getResult()
            == other.getResult());
      }
      result = result && (hasAccountName() == other.hasAccountName());
      if (hasAccountName()) {
        result = result && getAccountName()
            .equals(other.getAccountName());
      }
      result = result && (hasToken() == other.hasToken());
      if (hasToken()) {
        result = result && (getToken()
            == other.getToken());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasResult()) {
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult();
      }
      if (hasAccountName()) {
        hash = (37 * hash) + ACCOUNTNAME_FIELD_NUMBER;
        hash = (53 * hash) + getAccountName().hashCode();
      }
      if (hasToken()) {
        hash = (37 * hash) + TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getToken();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MSG_GC_USER_LOGIN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MSG_GC_USER_LOGIN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MSG_GC_USER_LOGIN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MSG_GC_USER_LOGIN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MSG_GC_USER_LOGIN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MSG_GC_USER_LOGIN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MSG_GC_USER_LOGIN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MSG_GC_USER_LOGIN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MSG_GC_USER_LOGIN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MSG_GC_USER_LOGIN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MSG_GC_USER_LOGIN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MSG_GC_USER_LOGIN parseFrom(
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
    public static Builder newBuilder(MSG_GC_USER_LOGIN prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.client.g2c.MSG_GC_USER_LOGIN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.client.g2c.MSG_GC_USER_LOGIN)
        MSG_GC_USER_LOGINOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return G2C.internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return G2C.internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MSG_GC_USER_LOGIN.class, Builder.class);
      }

      // Construct using protocol.client.g2c.G2C.MSG_GC_USER_LOGIN.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        result_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        accountName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        token_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return G2C.internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_descriptor;
      }

      public MSG_GC_USER_LOGIN getDefaultInstanceForType() {
        return MSG_GC_USER_LOGIN.getDefaultInstance();
      }

      public MSG_GC_USER_LOGIN build() {
        MSG_GC_USER_LOGIN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MSG_GC_USER_LOGIN buildPartial() {
        MSG_GC_USER_LOGIN result = new MSG_GC_USER_LOGIN(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.result_ = result_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.accountName_ = accountName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.token_ = token_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof MSG_GC_USER_LOGIN) {
          return mergeFrom((MSG_GC_USER_LOGIN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MSG_GC_USER_LOGIN other) {
        if (other == MSG_GC_USER_LOGIN.getDefaultInstance()) return this;
        if (other.hasResult()) {
          setResult(other.getResult());
        }
        if (other.hasAccountName()) {
          bitField0_ |= 0x00000002;
          accountName_ = other.accountName_;
          onChanged();
        }
        if (other.hasToken()) {
          setToken(other.getToken());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasResult()) {
          return false;
        }
        if (!hasAccountName()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MSG_GC_USER_LOGIN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MSG_GC_USER_LOGIN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int result_ ;
      /**
       * <code>required int32 result = 1;</code>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 result = 1;</code>
       */
      public int getResult() {
        return result_;
      }
      /**
       * <code>required int32 result = 1;</code>
       */
      public Builder setResult(int value) {
        bitField0_ |= 0x00000001;
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 result = 1;</code>
       */
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = 0;
        onChanged();
        return this;
      }

      private Object accountName_ = "";
      /**
       * <code>required string accountName = 2;</code>
       */
      public boolean hasAccountName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string accountName = 2;</code>
       */
      public String getAccountName() {
        Object ref = accountName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            accountName_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string accountName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAccountNameBytes() {
        Object ref = accountName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          accountName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string accountName = 2;</code>
       */
      public Builder setAccountName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        accountName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string accountName = 2;</code>
       */
      public Builder clearAccountName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        accountName_ = getDefaultInstance().getAccountName();
        onChanged();
        return this;
      }
      /**
       * <code>required string accountName = 2;</code>
       */
      public Builder setAccountNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        accountName_ = value;
        onChanged();
        return this;
      }

      private int token_ ;
      /**
       * <code>optional int32 token = 3;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 token = 3;</code>
       */
      public int getToken() {
        return token_;
      }
      /**
       * <code>optional int32 token = 3;</code>
       */
      public Builder setToken(int value) {
        bitField0_ |= 0x00000004;
        token_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 token = 3;</code>
       */
      public Builder clearToken() {
        bitField0_ = (bitField0_ & ~0x00000004);
        token_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.client.g2c.MSG_GC_USER_LOGIN)
    }

    // @@protoc_insertion_point(class_scope:protocol.client.g2c.MSG_GC_USER_LOGIN)
    private static final MSG_GC_USER_LOGIN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MSG_GC_USER_LOGIN();
    }

    public static MSG_GC_USER_LOGIN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<MSG_GC_USER_LOGIN>
        PARSER = new com.google.protobuf.AbstractParser<MSG_GC_USER_LOGIN>() {
      public MSG_GC_USER_LOGIN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MSG_GC_USER_LOGIN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MSG_GC_USER_LOGIN> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<MSG_GC_USER_LOGIN> getParserForType() {
      return PARSER;
    }

    public MSG_GC_USER_LOGIN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\tG2C.proto\022\023protocol.client.g2c\"G\n\021MSG_" +
      "GC_USER_LOGIN\022\016\n\006result\030\001 \002(\005\022\023\n\013account" +
      "Name\030\002 \002(\t\022\r\n\005token\030\003 \001(\005"
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
        }, assigner);
    internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_client_g2c_MSG_GC_USER_LOGIN_descriptor,
        new String[] { "Result", "AccountName", "Token", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}