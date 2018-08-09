// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: R2Z.proto

package protocol.relation.zone;

public final class R2Z {
  private R2Z() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MSG_R2R_HEARTBEATOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.relation.zone.MSG_R2R_HEARTBEAT)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code protocol.relation.zone.MSG_R2R_HEARTBEAT}
   */
  public  static final class MSG_R2R_HEARTBEAT extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.relation.zone.MSG_R2R_HEARTBEAT)
      MSG_R2R_HEARTBEATOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MSG_R2R_HEARTBEAT.newBuilder() to construct.
    private MSG_R2R_HEARTBEAT(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MSG_R2R_HEARTBEAT() {
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MSG_R2R_HEARTBEAT(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
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
      return R2Z.internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return R2Z.internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MSG_R2R_HEARTBEAT.class, Builder.class);
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
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof MSG_R2R_HEARTBEAT)) {
        return super.equals(obj);
      }
      MSG_R2R_HEARTBEAT other = (MSG_R2R_HEARTBEAT) obj;

      boolean result = true;
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MSG_R2R_HEARTBEAT parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MSG_R2R_HEARTBEAT parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MSG_R2R_HEARTBEAT parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MSG_R2R_HEARTBEAT parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MSG_R2R_HEARTBEAT parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MSG_R2R_HEARTBEAT parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MSG_R2R_HEARTBEAT parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MSG_R2R_HEARTBEAT parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MSG_R2R_HEARTBEAT parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MSG_R2R_HEARTBEAT parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MSG_R2R_HEARTBEAT parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MSG_R2R_HEARTBEAT parseFrom(
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
    public static Builder newBuilder(MSG_R2R_HEARTBEAT prototype) {
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
     * Protobuf type {@code protocol.relation.zone.MSG_R2R_HEARTBEAT}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.relation.zone.MSG_R2R_HEARTBEAT)
        MSG_R2R_HEARTBEATOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return R2Z.internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return R2Z.internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MSG_R2R_HEARTBEAT.class, Builder.class);
      }

      // Construct using protocol.relation.zone.R2Z.MSG_R2R_HEARTBEAT.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return R2Z.internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_descriptor;
      }

      public MSG_R2R_HEARTBEAT getDefaultInstanceForType() {
        return MSG_R2R_HEARTBEAT.getDefaultInstance();
      }

      public MSG_R2R_HEARTBEAT build() {
        MSG_R2R_HEARTBEAT result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MSG_R2R_HEARTBEAT buildPartial() {
        MSG_R2R_HEARTBEAT result = new MSG_R2R_HEARTBEAT(this);
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
        if (other instanceof MSG_R2R_HEARTBEAT) {
          return mergeFrom((MSG_R2R_HEARTBEAT)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MSG_R2R_HEARTBEAT other) {
        if (other == MSG_R2R_HEARTBEAT.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
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
        MSG_R2R_HEARTBEAT parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MSG_R2R_HEARTBEAT) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:protocol.relation.zone.MSG_R2R_HEARTBEAT)
    }

    // @@protoc_insertion_point(class_scope:protocol.relation.zone.MSG_R2R_HEARTBEAT)
    private static final MSG_R2R_HEARTBEAT DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MSG_R2R_HEARTBEAT();
    }

    public static MSG_R2R_HEARTBEAT getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<MSG_R2R_HEARTBEAT>
        PARSER = new com.google.protobuf.AbstractParser<MSG_R2R_HEARTBEAT>() {
      public MSG_R2R_HEARTBEAT parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MSG_R2R_HEARTBEAT(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MSG_R2R_HEARTBEAT> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<MSG_R2R_HEARTBEAT> getParserForType() {
      return PARSER;
    }

    public MSG_R2R_HEARTBEAT getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\tR2Z.proto\022\026protocol.relation.zone\"\023\n\021M" +
      "SG_R2R_HEARTBEAT"
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
    internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_relation_zone_MSG_R2R_HEARTBEAT_descriptor,
        new String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
