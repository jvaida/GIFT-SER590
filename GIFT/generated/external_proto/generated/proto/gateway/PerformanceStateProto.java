// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PerformanceState.proto

package generated.proto.gateway;

public final class PerformanceStateProto {
  private PerformanceStateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PerformanceStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PerformanceState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
     */
    int getTasksCount();
    /**
     * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
     */
    boolean containsTasks(
        int key);
    /**
     * Use {@link #getTasksMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState>
    getTasks();
    /**
     * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
     */
    java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState>
    getTasksMap();
    /**
     * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
     */

    generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState getTasksOrDefault(
        int key,
        generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState defaultValue);
    /**
     * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
     */

    generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState getTasksOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code PerformanceState}
   */
  public  static final class PerformanceState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PerformanceState)
      PerformanceStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PerformanceState.newBuilder() to construct.
    private PerformanceState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PerformanceState() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PerformanceState(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                tasks_ = com.google.protobuf.MapField.newMapField(
                    TasksDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState>
              tasks__ = input.readMessage(
                  TasksDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              tasks_.getMutableMap().put(
                  tasks__.getKey(), tasks__.getValue());
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
      return generated.proto.gateway.PerformanceStateProto.internal_static_PerformanceState_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetTasks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.gateway.PerformanceStateProto.internal_static_PerformanceState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.gateway.PerformanceStateProto.PerformanceState.class, generated.proto.gateway.PerformanceStateProto.PerformanceState.Builder.class);
    }

    public static final int TASKS_FIELD_NUMBER = 1;
    private static final class TasksDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState>newDefaultInstance(
                  generated.proto.gateway.PerformanceStateProto.internal_static_PerformanceState_TasksEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.INT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> tasks_;
    private com.google.protobuf.MapField<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState>
    internalGetTasks() {
      if (tasks_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TasksDefaultEntryHolder.defaultEntry);
      }
      return tasks_;
    }

    public int getTasksCount() {
      return internalGetTasks().getMap().size();
    }
    /**
     * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
     */

    public boolean containsTasks(
        int key) {
      
      return internalGetTasks().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTasksMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> getTasks() {
      return getTasksMap();
    }
    /**
     * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
     */

    public java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> getTasksMap() {
      return internalGetTasks().getMap();
    }
    /**
     * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
     */

    public generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState getTasksOrDefault(
        int key,
        generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState defaultValue) {
      
      java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> map =
          internalGetTasks().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
     */

    public generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState getTasksOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> map =
          internalGetTasks().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetTasks(),
          TasksDefaultEntryHolder.defaultEntry,
          1);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> entry
           : internalGetTasks().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState>
        tasks__ = TasksDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, tasks__);
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
      if (!(obj instanceof generated.proto.gateway.PerformanceStateProto.PerformanceState)) {
        return super.equals(obj);
      }
      generated.proto.gateway.PerformanceStateProto.PerformanceState other = (generated.proto.gateway.PerformanceStateProto.PerformanceState) obj;

      if (!internalGetTasks().equals(
          other.internalGetTasks())) return false;
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
      if (!internalGetTasks().getMap().isEmpty()) {
        hash = (37 * hash) + TASKS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetTasks().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.gateway.PerformanceStateProto.PerformanceState parseFrom(
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
    public static Builder newBuilder(generated.proto.gateway.PerformanceStateProto.PerformanceState prototype) {
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
     * Protobuf type {@code PerformanceState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PerformanceState)
        generated.proto.gateway.PerformanceStateProto.PerformanceStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.gateway.PerformanceStateProto.internal_static_PerformanceState_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetTasks();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMutableTasks();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.gateway.PerformanceStateProto.internal_static_PerformanceState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.gateway.PerformanceStateProto.PerformanceState.class, generated.proto.gateway.PerformanceStateProto.PerformanceState.Builder.class);
      }

      // Construct using generated.proto.gateway.PerformanceStateProto.PerformanceState.newBuilder()
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
        internalGetMutableTasks().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.gateway.PerformanceStateProto.internal_static_PerformanceState_descriptor;
      }

      @java.lang.Override
      public generated.proto.gateway.PerformanceStateProto.PerformanceState getDefaultInstanceForType() {
        return generated.proto.gateway.PerformanceStateProto.PerformanceState.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.gateway.PerformanceStateProto.PerformanceState build() {
        generated.proto.gateway.PerformanceStateProto.PerformanceState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.gateway.PerformanceStateProto.PerformanceState buildPartial() {
        generated.proto.gateway.PerformanceStateProto.PerformanceState result = new generated.proto.gateway.PerformanceStateProto.PerformanceState(this);
        int from_bitField0_ = bitField0_;
        result.tasks_ = internalGetTasks();
        result.tasks_.makeImmutable();
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
        if (other instanceof generated.proto.gateway.PerformanceStateProto.PerformanceState) {
          return mergeFrom((generated.proto.gateway.PerformanceStateProto.PerformanceState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.gateway.PerformanceStateProto.PerformanceState other) {
        if (other == generated.proto.gateway.PerformanceStateProto.PerformanceState.getDefaultInstance()) return this;
        internalGetMutableTasks().mergeFrom(
            other.internalGetTasks());
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
        generated.proto.gateway.PerformanceStateProto.PerformanceState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.gateway.PerformanceStateProto.PerformanceState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> tasks_;
      private com.google.protobuf.MapField<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState>
      internalGetTasks() {
        if (tasks_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              TasksDefaultEntryHolder.defaultEntry);
        }
        return tasks_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState>
      internalGetMutableTasks() {
        onChanged();;
        if (tasks_ == null) {
          tasks_ = com.google.protobuf.MapField.newMapField(
              TasksDefaultEntryHolder.defaultEntry);
        }
        if (!tasks_.isMutable()) {
          tasks_ = tasks_.copy();
        }
        return tasks_;
      }

      public int getTasksCount() {
        return internalGetTasks().getMap().size();
      }
      /**
       * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
       */

      public boolean containsTasks(
          int key) {
        
        return internalGetTasks().getMap().containsKey(key);
      }
      /**
       * Use {@link #getTasksMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> getTasks() {
        return getTasksMap();
      }
      /**
       * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
       */

      public java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> getTasksMap() {
        return internalGetTasks().getMap();
      }
      /**
       * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
       */

      public generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState getTasksOrDefault(
          int key,
          generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState defaultValue) {
        
        java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> map =
            internalGetTasks().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
       */

      public generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState getTasksOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> map =
            internalGetTasks().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearTasks() {
        internalGetMutableTasks().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
       */

      public Builder removeTasks(
          int key) {
        
        internalGetMutableTasks().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState>
      getMutableTasks() {
        return internalGetMutableTasks().getMutableMap();
      }
      /**
       * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
       */
      public Builder putTasks(
          int key,
          generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableTasks().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;int32, .TaskPerformanceState&gt; tasks = 1;</code>
       */

      public Builder putAllTasks(
          java.util.Map<java.lang.Integer, generated.proto.gateway.TaskPerformanceStateProto.TaskPerformanceState> values) {
        internalGetMutableTasks().getMutableMap()
            .putAll(values);
        return this;
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


      // @@protoc_insertion_point(builder_scope:PerformanceState)
    }

    // @@protoc_insertion_point(class_scope:PerformanceState)
    private static final generated.proto.gateway.PerformanceStateProto.PerformanceState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.gateway.PerformanceStateProto.PerformanceState();
    }

    public static generated.proto.gateway.PerformanceStateProto.PerformanceState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PerformanceState>
        PARSER = new com.google.protobuf.AbstractParser<PerformanceState>() {
      @java.lang.Override
      public PerformanceState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PerformanceState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PerformanceState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PerformanceState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.gateway.PerformanceStateProto.PerformanceState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PerformanceState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PerformanceState_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PerformanceState_TasksEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PerformanceState_TasksEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PerformanceState.proto\032\032TaskPerformanc" +
      "eState.proto\"\204\001\n\020PerformanceState\022+\n\005tas" +
      "ks\030\001 \003(\0132\034.PerformanceState.TasksEntry\032C" +
      "\n\nTasksEntry\022\013\n\003key\030\001 \001(\005\022$\n\005value\030\002 \001(\013" +
      "2\025.TaskPerformanceState:\0028\001B0\n\027generated" +
      ".proto.gatewayB\025PerformanceStateProtob\006p" +
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
          generated.proto.gateway.TaskPerformanceStateProto.getDescriptor(),
        }, assigner);
    internal_static_PerformanceState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PerformanceState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PerformanceState_descriptor,
        new java.lang.String[] { "Tasks", });
    internal_static_PerformanceState_TasksEntry_descriptor =
      internal_static_PerformanceState_descriptor.getNestedTypes().get(0);
    internal_static_PerformanceState_TasksEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PerformanceState_TasksEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    generated.proto.gateway.TaskPerformanceStateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
