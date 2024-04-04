// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExternalMonitorConfig.proto

package generated.proto.common;

public final class ExternalMonitorConfigProto {
  private ExternalMonitorConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExternalMonitorConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExternalMonitorConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The configurations for the monitor. 
     * </pre>
     *
     * <code>map&lt;string, bool&gt; setting_map = 1;</code>
     */
    int getSettingMapCount();
    /**
     * <pre>
     * The configurations for the monitor. 
     * </pre>
     *
     * <code>map&lt;string, bool&gt; setting_map = 1;</code>
     */
    boolean containsSettingMap(
        java.lang.String key);
    /**
     * Use {@link #getSettingMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.Boolean>
    getSettingMap();
    /**
     * <pre>
     * The configurations for the monitor. 
     * </pre>
     *
     * <code>map&lt;string, bool&gt; setting_map = 1;</code>
     */
    java.util.Map<java.lang.String, java.lang.Boolean>
    getSettingMapMap();
    /**
     * <pre>
     * The configurations for the monitor. 
     * </pre>
     *
     * <code>map&lt;string, bool&gt; setting_map = 1;</code>
     */

    boolean getSettingMapOrDefault(
        java.lang.String key,
        boolean defaultValue);
    /**
     * <pre>
     * The configurations for the monitor. 
     * </pre>
     *
     * <code>map&lt;string, bool&gt; setting_map = 1;</code>
     */

    boolean getSettingMapOrThrow(
        java.lang.String key);
  }
  /**
   * <pre>
   * This message represents a message to configure how applications used as external monitors should handle 
   *incoming data that is shared with them by GIFT. 
   * </pre>
   *
   * Protobuf type {@code ExternalMonitorConfig}
   */
  public  static final class ExternalMonitorConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExternalMonitorConfig)
      ExternalMonitorConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExternalMonitorConfig.newBuilder() to construct.
    private ExternalMonitorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExternalMonitorConfig() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExternalMonitorConfig(
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
                settingMap_ = com.google.protobuf.MapField.newMapField(
                    SettingMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Boolean>
              settingMap__ = input.readMessage(
                  SettingMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              settingMap_.getMutableMap().put(
                  settingMap__.getKey(), settingMap__.getValue());
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
      return generated.proto.common.ExternalMonitorConfigProto.internal_static_ExternalMonitorConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetSettingMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.proto.common.ExternalMonitorConfigProto.internal_static_ExternalMonitorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig.class, generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig.Builder.class);
    }

    public static final int SETTING_MAP_FIELD_NUMBER = 1;
    private static final class SettingMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, java.lang.Boolean> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, java.lang.Boolean>newDefaultInstance(
                  generated.proto.common.ExternalMonitorConfigProto.internal_static_ExternalMonitorConfig_SettingMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.BOOL,
                  false);
    }
    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Boolean> settingMap_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
    internalGetSettingMap() {
      if (settingMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SettingMapDefaultEntryHolder.defaultEntry);
      }
      return settingMap_;
    }

    public int getSettingMapCount() {
      return internalGetSettingMap().getMap().size();
    }
    /**
     * <pre>
     * The configurations for the monitor. 
     * </pre>
     *
     * <code>map&lt;string, bool&gt; setting_map = 1;</code>
     */

    public boolean containsSettingMap(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetSettingMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSettingMapMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Boolean> getSettingMap() {
      return getSettingMapMap();
    }
    /**
     * <pre>
     * The configurations for the monitor. 
     * </pre>
     *
     * <code>map&lt;string, bool&gt; setting_map = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Boolean> getSettingMapMap() {
      return internalGetSettingMap().getMap();
    }
    /**
     * <pre>
     * The configurations for the monitor. 
     * </pre>
     *
     * <code>map&lt;string, bool&gt; setting_map = 1;</code>
     */

    public boolean getSettingMapOrDefault(
        java.lang.String key,
        boolean defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Boolean> map =
          internalGetSettingMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * The configurations for the monitor. 
     * </pre>
     *
     * <code>map&lt;string, bool&gt; setting_map = 1;</code>
     */

    public boolean getSettingMapOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Boolean> map =
          internalGetSettingMap().getMap();
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
        .serializeStringMapTo(
          output,
          internalGetSettingMap(),
          SettingMapDefaultEntryHolder.defaultEntry,
          1);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry
           : internalGetSettingMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.Boolean>
        settingMap__ = SettingMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, settingMap__);
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
      if (!(obj instanceof generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig)) {
        return super.equals(obj);
      }
      generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig other = (generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig) obj;

      if (!internalGetSettingMap().equals(
          other.internalGetSettingMap())) return false;
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
      if (!internalGetSettingMap().getMap().isEmpty()) {
        hash = (37 * hash) + SETTING_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSettingMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parseFrom(
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
    public static Builder newBuilder(generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig prototype) {
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
     * This message represents a message to configure how applications used as external monitors should handle 
     *incoming data that is shared with them by GIFT. 
     * </pre>
     *
     * Protobuf type {@code ExternalMonitorConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExternalMonitorConfig)
        generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return generated.proto.common.ExternalMonitorConfigProto.internal_static_ExternalMonitorConfig_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetSettingMap();
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
            return internalGetMutableSettingMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return generated.proto.common.ExternalMonitorConfigProto.internal_static_ExternalMonitorConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig.class, generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig.Builder.class);
      }

      // Construct using generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig.newBuilder()
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
        internalGetMutableSettingMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return generated.proto.common.ExternalMonitorConfigProto.internal_static_ExternalMonitorConfig_descriptor;
      }

      @java.lang.Override
      public generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig getDefaultInstanceForType() {
        return generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig.getDefaultInstance();
      }

      @java.lang.Override
      public generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig build() {
        generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig buildPartial() {
        generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig result = new generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig(this);
        int from_bitField0_ = bitField0_;
        result.settingMap_ = internalGetSettingMap();
        result.settingMap_.makeImmutable();
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
        if (other instanceof generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig) {
          return mergeFrom((generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig other) {
        if (other == generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig.getDefaultInstance()) return this;
        internalGetMutableSettingMap().mergeFrom(
            other.internalGetSettingMap());
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
        generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig) e.getUnfinishedMessage();
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
          java.lang.String, java.lang.Boolean> settingMap_;
      private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
      internalGetSettingMap() {
        if (settingMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SettingMapDefaultEntryHolder.defaultEntry);
        }
        return settingMap_;
      }
      private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
      internalGetMutableSettingMap() {
        onChanged();;
        if (settingMap_ == null) {
          settingMap_ = com.google.protobuf.MapField.newMapField(
              SettingMapDefaultEntryHolder.defaultEntry);
        }
        if (!settingMap_.isMutable()) {
          settingMap_ = settingMap_.copy();
        }
        return settingMap_;
      }

      public int getSettingMapCount() {
        return internalGetSettingMap().getMap().size();
      }
      /**
       * <pre>
       * The configurations for the monitor. 
       * </pre>
       *
       * <code>map&lt;string, bool&gt; setting_map = 1;</code>
       */

      public boolean containsSettingMap(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetSettingMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSettingMapMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Boolean> getSettingMap() {
        return getSettingMapMap();
      }
      /**
       * <pre>
       * The configurations for the monitor. 
       * </pre>
       *
       * <code>map&lt;string, bool&gt; setting_map = 1;</code>
       */

      public java.util.Map<java.lang.String, java.lang.Boolean> getSettingMapMap() {
        return internalGetSettingMap().getMap();
      }
      /**
       * <pre>
       * The configurations for the monitor. 
       * </pre>
       *
       * <code>map&lt;string, bool&gt; setting_map = 1;</code>
       */

      public boolean getSettingMapOrDefault(
          java.lang.String key,
          boolean defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.Boolean> map =
            internalGetSettingMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <pre>
       * The configurations for the monitor. 
       * </pre>
       *
       * <code>map&lt;string, bool&gt; setting_map = 1;</code>
       */

      public boolean getSettingMapOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.Boolean> map =
            internalGetSettingMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearSettingMap() {
        internalGetMutableSettingMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <pre>
       * The configurations for the monitor. 
       * </pre>
       *
       * <code>map&lt;string, bool&gt; setting_map = 1;</code>
       */

      public Builder removeSettingMap(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableSettingMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Boolean>
      getMutableSettingMap() {
        return internalGetMutableSettingMap().getMutableMap();
      }
      /**
       * <pre>
       * The configurations for the monitor. 
       * </pre>
       *
       * <code>map&lt;string, bool&gt; setting_map = 1;</code>
       */
      public Builder putSettingMap(
          java.lang.String key,
          boolean value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        
        internalGetMutableSettingMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <pre>
       * The configurations for the monitor. 
       * </pre>
       *
       * <code>map&lt;string, bool&gt; setting_map = 1;</code>
       */

      public Builder putAllSettingMap(
          java.util.Map<java.lang.String, java.lang.Boolean> values) {
        internalGetMutableSettingMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:ExternalMonitorConfig)
    }

    // @@protoc_insertion_point(class_scope:ExternalMonitorConfig)
    private static final generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig();
    }

    public static generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExternalMonitorConfig>
        PARSER = new com.google.protobuf.AbstractParser<ExternalMonitorConfig>() {
      @java.lang.Override
      public ExternalMonitorConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExternalMonitorConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExternalMonitorConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalMonitorConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public generated.proto.common.ExternalMonitorConfigProto.ExternalMonitorConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExternalMonitorConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExternalMonitorConfig_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExternalMonitorConfig_SettingMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExternalMonitorConfig_SettingMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ExternalMonitorConfig.proto\"\207\001\n\025Extern" +
      "alMonitorConfig\022;\n\013setting_map\030\001 \003(\0132&.E" +
      "xternalMonitorConfig.SettingMapEntry\0321\n\017" +
      "SettingMapEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 " +
      "\001(\010:\0028\001B4\n\026generated.proto.commonB\032Exter" +
      "nalMonitorConfigProtob\006proto3"
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
    internal_static_ExternalMonitorConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExternalMonitorConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExternalMonitorConfig_descriptor,
        new java.lang.String[] { "SettingMap", });
    internal_static_ExternalMonitorConfig_SettingMapEntry_descriptor =
      internal_static_ExternalMonitorConfig_descriptor.getNestedTypes().get(0);
    internal_static_ExternalMonitorConfig_SettingMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExternalMonitorConfig_SettingMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}