// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api.proto

package com.emporiaenergy.protos.partnerapi;

/**
 * <pre>
 * Response describing the On/Off status of an Emporia Outlet.  
 * If device_connected for an Outlet is false, the On/Off status may be out of date
 * </pre>
 *
 * Protobuf type {@code protos.OutletStatusResponse}
 */
public final class OutletStatusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.OutletStatusResponse)
    OutletStatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OutletStatusResponse.newBuilder() to construct.
  private OutletStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OutletStatusResponse() {
    outletStatus_ = java.util.Collections.emptyList();
    resultStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OutletStatusResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OutletStatusResponse(
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
              outletStatus_ = new java.util.ArrayList<com.emporiaenergy.protos.partnerapi.OutletStatus>();
              mutable_bitField0_ |= 0x00000001;
            }
            outletStatus_.add(
                input.readMessage(com.emporiaenergy.protos.partnerapi.OutletStatus.parser(), extensionRegistry));
            break;
          }
          case 800: {
            int rawValue = input.readEnum();

            resultStatus_ = rawValue;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        outletStatus_ = java.util.Collections.unmodifiableList(outletStatus_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.emporiaenergy.protos.partnerapi.PartnerApiProto.internal_static_protos_OutletStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.emporiaenergy.protos.partnerapi.PartnerApiProto.internal_static_protos_OutletStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.emporiaenergy.protos.partnerapi.OutletStatusResponse.class, com.emporiaenergy.protos.partnerapi.OutletStatusResponse.Builder.class);
  }

  public static final int OUTLET_STATUS_FIELD_NUMBER = 1;
  private java.util.List<com.emporiaenergy.protos.partnerapi.OutletStatus> outletStatus_;
  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.emporiaenergy.protos.partnerapi.OutletStatus> getOutletStatusList() {
    return outletStatus_;
  }
  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.emporiaenergy.protos.partnerapi.OutletStatusOrBuilder> 
      getOutletStatusOrBuilderList() {
    return outletStatus_;
  }
  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  @java.lang.Override
  public int getOutletStatusCount() {
    return outletStatus_.size();
  }
  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  @java.lang.Override
  public com.emporiaenergy.protos.partnerapi.OutletStatus getOutletStatus(int index) {
    return outletStatus_.get(index);
  }
  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  @java.lang.Override
  public com.emporiaenergy.protos.partnerapi.OutletStatusOrBuilder getOutletStatusOrBuilder(
      int index) {
    return outletStatus_.get(index);
  }

  public static final int RESULT_STATUS_FIELD_NUMBER = 100;
  private int resultStatus_;
  /**
   * <code>.protos.ResultStatus result_status = 100;</code>
   * @return The enum numeric value on the wire for resultStatus.
   */
  @java.lang.Override public int getResultStatusValue() {
    return resultStatus_;
  }
  /**
   * <code>.protos.ResultStatus result_status = 100;</code>
   * @return The resultStatus.
   */
  @java.lang.Override public com.emporiaenergy.protos.partnerapi.ResultStatus getResultStatus() {
    @SuppressWarnings("deprecation")
    com.emporiaenergy.protos.partnerapi.ResultStatus result = com.emporiaenergy.protos.partnerapi.ResultStatus.valueOf(resultStatus_);
    return result == null ? com.emporiaenergy.protos.partnerapi.ResultStatus.UNRECOGNIZED : result;
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
    for (int i = 0; i < outletStatus_.size(); i++) {
      output.writeMessage(1, outletStatus_.get(i));
    }
    if (resultStatus_ != com.emporiaenergy.protos.partnerapi.ResultStatus.VALID.getNumber()) {
      output.writeEnum(100, resultStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < outletStatus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, outletStatus_.get(i));
    }
    if (resultStatus_ != com.emporiaenergy.protos.partnerapi.ResultStatus.VALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(100, resultStatus_);
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
    if (!(obj instanceof com.emporiaenergy.protos.partnerapi.OutletStatusResponse)) {
      return super.equals(obj);
    }
    com.emporiaenergy.protos.partnerapi.OutletStatusResponse other = (com.emporiaenergy.protos.partnerapi.OutletStatusResponse) obj;

    if (!getOutletStatusList()
        .equals(other.getOutletStatusList())) return false;
    if (resultStatus_ != other.resultStatus_) return false;
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
    if (getOutletStatusCount() > 0) {
      hash = (37 * hash) + OUTLET_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getOutletStatusList().hashCode();
    }
    hash = (37 * hash) + RESULT_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + resultStatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse parseFrom(
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
  public static Builder newBuilder(com.emporiaenergy.protos.partnerapi.OutletStatusResponse prototype) {
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
   * Response describing the On/Off status of an Emporia Outlet.  
   * If device_connected for an Outlet is false, the On/Off status may be out of date
   * </pre>
   *
   * Protobuf type {@code protos.OutletStatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.OutletStatusResponse)
      com.emporiaenergy.protos.partnerapi.OutletStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.emporiaenergy.protos.partnerapi.PartnerApiProto.internal_static_protos_OutletStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.emporiaenergy.protos.partnerapi.PartnerApiProto.internal_static_protos_OutletStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.emporiaenergy.protos.partnerapi.OutletStatusResponse.class, com.emporiaenergy.protos.partnerapi.OutletStatusResponse.Builder.class);
    }

    // Construct using com.emporiaenergy.protos.partnerapi.OutletStatusResponse.newBuilder()
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
        getOutletStatusFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (outletStatusBuilder_ == null) {
        outletStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        outletStatusBuilder_.clear();
      }
      resultStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.emporiaenergy.protos.partnerapi.PartnerApiProto.internal_static_protos_OutletStatusResponse_descriptor;
    }

    @java.lang.Override
    public com.emporiaenergy.protos.partnerapi.OutletStatusResponse getDefaultInstanceForType() {
      return com.emporiaenergy.protos.partnerapi.OutletStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.emporiaenergy.protos.partnerapi.OutletStatusResponse build() {
      com.emporiaenergy.protos.partnerapi.OutletStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.emporiaenergy.protos.partnerapi.OutletStatusResponse buildPartial() {
      com.emporiaenergy.protos.partnerapi.OutletStatusResponse result = new com.emporiaenergy.protos.partnerapi.OutletStatusResponse(this);
      int from_bitField0_ = bitField0_;
      if (outletStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          outletStatus_ = java.util.Collections.unmodifiableList(outletStatus_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.outletStatus_ = outletStatus_;
      } else {
        result.outletStatus_ = outletStatusBuilder_.build();
      }
      result.resultStatus_ = resultStatus_;
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
      if (other instanceof com.emporiaenergy.protos.partnerapi.OutletStatusResponse) {
        return mergeFrom((com.emporiaenergy.protos.partnerapi.OutletStatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.emporiaenergy.protos.partnerapi.OutletStatusResponse other) {
      if (other == com.emporiaenergy.protos.partnerapi.OutletStatusResponse.getDefaultInstance()) return this;
      if (outletStatusBuilder_ == null) {
        if (!other.outletStatus_.isEmpty()) {
          if (outletStatus_.isEmpty()) {
            outletStatus_ = other.outletStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOutletStatusIsMutable();
            outletStatus_.addAll(other.outletStatus_);
          }
          onChanged();
        }
      } else {
        if (!other.outletStatus_.isEmpty()) {
          if (outletStatusBuilder_.isEmpty()) {
            outletStatusBuilder_.dispose();
            outletStatusBuilder_ = null;
            outletStatus_ = other.outletStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
            outletStatusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOutletStatusFieldBuilder() : null;
          } else {
            outletStatusBuilder_.addAllMessages(other.outletStatus_);
          }
        }
      }
      if (other.resultStatus_ != 0) {
        setResultStatusValue(other.getResultStatusValue());
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
      com.emporiaenergy.protos.partnerapi.OutletStatusResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.emporiaenergy.protos.partnerapi.OutletStatusResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.emporiaenergy.protos.partnerapi.OutletStatus> outletStatus_ =
      java.util.Collections.emptyList();
    private void ensureOutletStatusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        outletStatus_ = new java.util.ArrayList<com.emporiaenergy.protos.partnerapi.OutletStatus>(outletStatus_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.emporiaenergy.protos.partnerapi.OutletStatus, com.emporiaenergy.protos.partnerapi.OutletStatus.Builder, com.emporiaenergy.protos.partnerapi.OutletStatusOrBuilder> outletStatusBuilder_;

    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public java.util.List<com.emporiaenergy.protos.partnerapi.OutletStatus> getOutletStatusList() {
      if (outletStatusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(outletStatus_);
      } else {
        return outletStatusBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public int getOutletStatusCount() {
      if (outletStatusBuilder_ == null) {
        return outletStatus_.size();
      } else {
        return outletStatusBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public com.emporiaenergy.protos.partnerapi.OutletStatus getOutletStatus(int index) {
      if (outletStatusBuilder_ == null) {
        return outletStatus_.get(index);
      } else {
        return outletStatusBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public Builder setOutletStatus(
        int index, com.emporiaenergy.protos.partnerapi.OutletStatus value) {
      if (outletStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutletStatusIsMutable();
        outletStatus_.set(index, value);
        onChanged();
      } else {
        outletStatusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public Builder setOutletStatus(
        int index, com.emporiaenergy.protos.partnerapi.OutletStatus.Builder builderForValue) {
      if (outletStatusBuilder_ == null) {
        ensureOutletStatusIsMutable();
        outletStatus_.set(index, builderForValue.build());
        onChanged();
      } else {
        outletStatusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public Builder addOutletStatus(com.emporiaenergy.protos.partnerapi.OutletStatus value) {
      if (outletStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutletStatusIsMutable();
        outletStatus_.add(value);
        onChanged();
      } else {
        outletStatusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public Builder addOutletStatus(
        int index, com.emporiaenergy.protos.partnerapi.OutletStatus value) {
      if (outletStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutletStatusIsMutable();
        outletStatus_.add(index, value);
        onChanged();
      } else {
        outletStatusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public Builder addOutletStatus(
        com.emporiaenergy.protos.partnerapi.OutletStatus.Builder builderForValue) {
      if (outletStatusBuilder_ == null) {
        ensureOutletStatusIsMutable();
        outletStatus_.add(builderForValue.build());
        onChanged();
      } else {
        outletStatusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public Builder addOutletStatus(
        int index, com.emporiaenergy.protos.partnerapi.OutletStatus.Builder builderForValue) {
      if (outletStatusBuilder_ == null) {
        ensureOutletStatusIsMutable();
        outletStatus_.add(index, builderForValue.build());
        onChanged();
      } else {
        outletStatusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public Builder addAllOutletStatus(
        java.lang.Iterable<? extends com.emporiaenergy.protos.partnerapi.OutletStatus> values) {
      if (outletStatusBuilder_ == null) {
        ensureOutletStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, outletStatus_);
        onChanged();
      } else {
        outletStatusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public Builder clearOutletStatus() {
      if (outletStatusBuilder_ == null) {
        outletStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        outletStatusBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public Builder removeOutletStatus(int index) {
      if (outletStatusBuilder_ == null) {
        ensureOutletStatusIsMutable();
        outletStatus_.remove(index);
        onChanged();
      } else {
        outletStatusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public com.emporiaenergy.protos.partnerapi.OutletStatus.Builder getOutletStatusBuilder(
        int index) {
      return getOutletStatusFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public com.emporiaenergy.protos.partnerapi.OutletStatusOrBuilder getOutletStatusOrBuilder(
        int index) {
      if (outletStatusBuilder_ == null) {
        return outletStatus_.get(index);  } else {
        return outletStatusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public java.util.List<? extends com.emporiaenergy.protos.partnerapi.OutletStatusOrBuilder> 
         getOutletStatusOrBuilderList() {
      if (outletStatusBuilder_ != null) {
        return outletStatusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(outletStatus_);
      }
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public com.emporiaenergy.protos.partnerapi.OutletStatus.Builder addOutletStatusBuilder() {
      return getOutletStatusFieldBuilder().addBuilder(
          com.emporiaenergy.protos.partnerapi.OutletStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public com.emporiaenergy.protos.partnerapi.OutletStatus.Builder addOutletStatusBuilder(
        int index) {
      return getOutletStatusFieldBuilder().addBuilder(
          index, com.emporiaenergy.protos.partnerapi.OutletStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
     */
    public java.util.List<com.emporiaenergy.protos.partnerapi.OutletStatus.Builder> 
         getOutletStatusBuilderList() {
      return getOutletStatusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.emporiaenergy.protos.partnerapi.OutletStatus, com.emporiaenergy.protos.partnerapi.OutletStatus.Builder, com.emporiaenergy.protos.partnerapi.OutletStatusOrBuilder> 
        getOutletStatusFieldBuilder() {
      if (outletStatusBuilder_ == null) {
        outletStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.emporiaenergy.protos.partnerapi.OutletStatus, com.emporiaenergy.protos.partnerapi.OutletStatus.Builder, com.emporiaenergy.protos.partnerapi.OutletStatusOrBuilder>(
                outletStatus_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        outletStatus_ = null;
      }
      return outletStatusBuilder_;
    }

    private int resultStatus_ = 0;
    /**
     * <code>.protos.ResultStatus result_status = 100;</code>
     * @return The enum numeric value on the wire for resultStatus.
     */
    @java.lang.Override public int getResultStatusValue() {
      return resultStatus_;
    }
    /**
     * <code>.protos.ResultStatus result_status = 100;</code>
     * @param value The enum numeric value on the wire for resultStatus to set.
     * @return This builder for chaining.
     */
    public Builder setResultStatusValue(int value) {
      
      resultStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.protos.ResultStatus result_status = 100;</code>
     * @return The resultStatus.
     */
    @java.lang.Override
    public com.emporiaenergy.protos.partnerapi.ResultStatus getResultStatus() {
      @SuppressWarnings("deprecation")
      com.emporiaenergy.protos.partnerapi.ResultStatus result = com.emporiaenergy.protos.partnerapi.ResultStatus.valueOf(resultStatus_);
      return result == null ? com.emporiaenergy.protos.partnerapi.ResultStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.protos.ResultStatus result_status = 100;</code>
     * @param value The resultStatus to set.
     * @return This builder for chaining.
     */
    public Builder setResultStatus(com.emporiaenergy.protos.partnerapi.ResultStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      resultStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.protos.ResultStatus result_status = 100;</code>
     * @return This builder for chaining.
     */
    public Builder clearResultStatus() {
      
      resultStatus_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:protos.OutletStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:protos.OutletStatusResponse)
  private static final com.emporiaenergy.protos.partnerapi.OutletStatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.emporiaenergy.protos.partnerapi.OutletStatusResponse();
  }

  public static com.emporiaenergy.protos.partnerapi.OutletStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutletStatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<OutletStatusResponse>() {
    @java.lang.Override
    public OutletStatusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OutletStatusResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OutletStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutletStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.emporiaenergy.protos.partnerapi.OutletStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

