// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InitializeLessonRequest.proto

package generated.proto.common;

public final class InitializeLessonRequestProto {
  private InitializeLessonRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InitializeLessonRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InitializeLessonRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course.  
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 1;</code>
     */
    boolean hasContentRef();
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course.  
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 1;</code>
     */
    com.google.protobuf.StringValue getContentRef();
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course.  
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 1;</code>
     */
    com.google.protobuf.StringValueOrBuilder getContentRefOrBuilder();
  }
  /**
   * <pre>
   * This message is used to signify the lesson is beginning. 
   * </pre>
   *
   * Protobuf type {@code InitializeLessonRequest}
   */
  public  static final class InitializeLessonRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InitializeLessonRequest)
      InitializeLessonRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InitializeLessonRequest.newBuilder() to construct.
    private InitializeLessonRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InitializeLessonRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InitializeLessonRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 10: {
              com.google.protobuf.StringValue.Builder subBuilder = null;
              if (contentRef_ != null) {
                subBuilder = contentRef_.toBuilder();
              }
              contentRef_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(contentRef_);
                contentRef_ = subBuilder.buildPartial();
              }

              break;
            }
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
      return generated.proto.common.InitializeLessonRequestProto.internal_static_InitializeLessonRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.InitializeLessonRequestProto.internal_static_InitializeLessonRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest.class, generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest.Builder.class);
    }

    public static final int CONTENT_REF_FIELD_NUMBER = 1;
    private com.google.protobuf.StringValue contentRef_;
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course.  
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 1;</code>
     */
    public boolean hasContentRef() {
      return contentRef_ != null;
    }
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course.  
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 1;</code>
     */
    public com.google.protobuf.StringValue getContentRef() {
      return contentRef_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : contentRef_;
    }
    /**
     * <pre>
     * The reference to the content to be displayed that is unique to this course.  
     * </pre>
     *
     * <code>.google.protobuf.StringValue content_ref = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getContentRefOrBuilder() {
      return getContentRef();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (contentRef_ != null) {
        output.writeMessage(1, getContentRef());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (contentRef_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getContentRef());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest)) {
        return super.equals(obj);
      }
      generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest other = (generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest) obj;

      if (hasContentRef() != other.hasContentRef()) return false;
      if (hasContentRef()) {
        if (!getContentRef()
            .equals(other.getContentRef())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasContentRef()) {
        hash = (37 * hash) + CONTENT_REF_FIELD_NUMBER;
        hash = (53 * hash) + getContentRef().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * This message is used to signify the lesson is beginning. 
     * </pre>
     *
     * Protobuf type {@code InitializeLessonRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InitializeLessonRequest)
        generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.InitializeLessonRequestProto.internal_static_InitializeLessonRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.InitializeLessonRequestProto.internal_static_InitializeLessonRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest.class, generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest.Builder.class);
      }

      // Construct using generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (contentRefBuilder_ == null) {
          contentRef_ = null;
        } else {
          contentRef_ = null;
          contentRefBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.InitializeLessonRequestProto.internal_static_InitializeLessonRequest_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest getDefaultInstanceForType() {
        return generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest build() {
        generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest buildPartial() {
        generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest result = new generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest(this);
        if (contentRefBuilder_ == null) {
          result.contentRef_ = contentRef_;
        } else {
          result.contentRef_ = contentRefBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest) {
          return mergeFrom((generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest other) {
        if (other == generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest.getDefaultInstance()) return this;
        if (other.hasContentRef()) {
          mergeContentRef(other.getContentRef());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.StringValue contentRef_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> contentRefBuilder_;
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course.  
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 1;</code>
       */
      public boolean hasContentRef() {
        return contentRefBuilder_ != null || contentRef_ != null;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course.  
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 1;</code>
       */
      public com.google.protobuf.StringValue getContentRef() {
        if (contentRefBuilder_ == null) {
          return contentRef_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : contentRef_;
        } else {
          return contentRefBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course.  
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 1;</code>
       */
      public Builder setContentRef(com.google.protobuf.StringValue value) {
        if (contentRefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          contentRef_ = value;
          onChanged();
        } else {
          contentRefBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course.  
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 1;</code>
       */
      public Builder setContentRef(
          com.google.protobuf.StringValue.Builder builderForValue) {
        if (contentRefBuilder_ == null) {
          contentRef_ = builderForValue.build();
          onChanged();
        } else {
          contentRefBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course.  
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 1;</code>
       */
      public Builder mergeContentRef(com.google.protobuf.StringValue value) {
        if (contentRefBuilder_ == null) {
          if (contentRef_ != null) {
            contentRef_ =
              com.google.protobuf.StringValue.newBuilder(contentRef_).mergeFrom(value).buildPartial();
          } else {
            contentRef_ = value;
          }
          onChanged();
        } else {
          contentRefBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course.  
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 1;</code>
       */
      public Builder clearContentRef() {
        if (contentRefBuilder_ == null) {
          contentRef_ = null;
          onChanged();
        } else {
          contentRef_ = null;
          contentRefBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course.  
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 1;</code>
       */
      public com.google.protobuf.StringValue.Builder getContentRefBuilder() {
        
        onChanged();
        return getContentRefFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course.  
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 1;</code>
       */
      public com.google.protobuf.StringValueOrBuilder getContentRefOrBuilder() {
        if (contentRefBuilder_ != null) {
          return contentRefBuilder_.getMessageOrBuilder();
        } else {
          return contentRef_ == null ?
              com.google.protobuf.StringValue.getDefaultInstance() : contentRef_;
        }
      }
      /**
       * <pre>
       * The reference to the content to be displayed that is unique to this course.  
       * </pre>
       *
       * <code>.google.protobuf.StringValue content_ref = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
          getContentRefFieldBuilder() {
        if (contentRefBuilder_ == null) {
          contentRefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                  getContentRef(),
                  getParentForChildren(),
                  isClean());
          contentRef_ = null;
        }
        return contentRefBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:InitializeLessonRequest)
    }

    // @@protoc_insertion_point(class_scope:InitializeLessonRequest)
    private static final generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest();
    }

    public static generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InitializeLessonRequest>
        PARSER = new com.google.protobuf.AbstractParser<InitializeLessonRequest>() {
      @java.lang.Override
      public InitializeLessonRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InitializeLessonRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InitializeLessonRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InitializeLessonRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.InitializeLessonRequestProto.InitializeLessonRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InitializeLessonRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InitializeLessonRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035InitializeLessonRequest.proto\032\036google/" +
      "protobuf/wrappers.proto\"L\n\027InitializeLes" +
      "sonRequest\0221\n\013content_ref\030\001 \001(\0132\034.google" +
      ".protobuf.StringValueB6\n\026generated.proto" +
      ".commonB\034InitializeLessonRequestProtob\006p" +
      "roto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_InitializeLessonRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InitializeLessonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InitializeLessonRequest_descriptor,
        new java.lang.String[] { "ContentRef", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}