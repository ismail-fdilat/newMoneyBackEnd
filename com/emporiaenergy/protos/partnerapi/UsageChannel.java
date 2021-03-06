// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api.proto

package com.emporiaenergy.protos.partnerapi;

/**
 * <pre>
 * Specifies which data channels to fetch, see the DeviceUsageResponse message for more details
 * </pre>
 *
 * Protobuf enum {@code protos.UsageChannel}
 */
public enum UsageChannel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * the Main channels, will be 1 channel for Plugs, Zigbees and EVSEs and up to 3 channels for Vue1s and Vue2s
   * </pre>
   *
   * <code>MAINS = 0;</code>
   */
  MAINS(0),
  /**
   * <pre>
   * requests usage data for all channels, could be up to 19 channels for a Vue2 (3 mains and 16 50A CTs)
   * </pre>
   *
   * <code>ALL = 1;</code>
   */
  ALL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * the Main channels, will be 1 channel for Plugs, Zigbees and EVSEs and up to 3 channels for Vue1s and Vue2s
   * </pre>
   *
   * <code>MAINS = 0;</code>
   */
  public static final int MAINS_VALUE = 0;
  /**
   * <pre>
   * requests usage data for all channels, could be up to 19 channels for a Vue2 (3 mains and 16 50A CTs)
   * </pre>
   *
   * <code>ALL = 1;</code>
   */
  public static final int ALL_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static UsageChannel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UsageChannel forNumber(int value) {
    switch (value) {
      case 0: return MAINS;
      case 1: return ALL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UsageChannel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UsageChannel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UsageChannel>() {
          public UsageChannel findValueByNumber(int number) {
            return UsageChannel.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.emporiaenergy.protos.partnerapi.PartnerApiProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final UsageChannel[] VALUES = values();

  public static UsageChannel valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UsageChannel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:protos.UsageChannel)
}

