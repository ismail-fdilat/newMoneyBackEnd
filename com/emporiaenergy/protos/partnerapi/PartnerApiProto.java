// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api.proto

package com.emporiaenergy.protos.partnerapi;

public final class PartnerApiProto {
  private PartnerApiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_AuthenticationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_AuthenticationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_AuthenticationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_AuthenticationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_DeviceInventoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_DeviceInventoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_DeviceInventoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_DeviceInventoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_DeviceInventoryResponse_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_DeviceInventoryResponse_Device_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_DeviceInventoryResponse_Device_CustomerInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_DeviceInventoryResponse_Device_CustomerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_DeviceUsageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_DeviceUsageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_DeviceUsageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_DeviceUsageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_DeviceUsageResponse_DeviceUsage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_DeviceUsageResponse_DeviceUsage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_DeviceUsageResponse_DeviceUsage_ChannelUsageData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_DeviceUsageResponse_DeviceUsage_ChannelUsageData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_DeviceListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_DeviceListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_OutletStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_OutletStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_OutletStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_OutletStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_OutletStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_OutletStatusRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021partner_api.proto\022\006protos\"@\n\025Authentic" +
      "ationRequest\022\025\n\rpartner_email\030\001 \001(\t\022\020\n\010p" +
      "assword\030\002 \001(\t\"Y\n\026AuthenticationResponse\022" +
      "\022\n\nauth_token\030\001 \001(\t\022+\n\rresult_status\030d \001" +
      "(\0162\024.protos.ResultStatus\"E\n\026DeviceInvent" +
      "oryRequest\022\022\n\nauth_token\030\001 \001(\t\022\027\n\017custom" +
      "er_emails\030\002 \003(\t\"\212\004\n\027DeviceInventoryRespo" +
      "nse\0227\n\007devices\030\001 \003(\0132&.protos.DeviceInve" +
      "ntoryResponse.Device\022+\n\rresult_status\030d " +
      "\001(\0162\024.protos.ResultStatus\032\210\003\n\006Device\022\036\n\026" +
      "manufacturer_device_id\030\001 \001(\t\022\r\n\005model\030\002 " +
      "\001(\t\022\020\n\010firmware\030\003 \001(\t\022\035\n\025last_app_connec" +
      "t_time\030\004 \001(\t\022\r\n\005solar\030\005 \001(\010\022\020\n\010latitude\030" +
      "\006 \001(\001\022\021\n\tlongitude\030\007 \001(\001\022\023\n\013device_name\030" +
      "\010 \001(\t\022J\n\rcustomer_info\030\t \003(\01323.protos.De" +
      "viceInventoryResponse.Device.CustomerInf" +
      "o\022\025\n\rchannel_names\030\n \003(\t\022\030\n\020device_conne" +
      "cted\030\013 \001(\010\022\022\n\nzigbee_mac\030\014 \001(\t\032D\n\014Custom" +
      "erInfo\022\022\n\nfirst_name\030\001 \001(\t\022\021\n\tlast_name\030" +
      "\002 \001(\t\022\r\n\005email\030\003 \001(\t\"\267\001\n\022DeviceUsageRequ" +
      "est\022\022\n\nauth_token\030\001 \001(\t\022\033\n\023start_epoch_s" +
      "econds\030\002 \001(\004\022\031\n\021end_epoch_seconds\030\003 \001(\004\022" +
      "\r\n\005scale\030\004 \001(\t\022&\n\010channels\030\005 \001(\0162\024.proto" +
      "s.UsageChannel\022\036\n\026manufacturer_device_id" +
      "\030\006 \003(\t\"\343\002\n\023DeviceUsageResponse\022=\n\014device" +
      "_usage\030\001 \003(\0132\'.protos.DeviceUsageRespons" +
      "e.DeviceUsage\022+\n\rresult_status\030d \001(\0162\024.p" +
      "rotos.ResultStatus\032\337\001\n\013DeviceUsage\022\036\n\026ma" +
      "nufacturer_device_id\030\001 \001(\t\022\r\n\005scale\030\002 \001(" +
      "\t\022\034\n\024bucket_epoch_seconds\030\003 \003(\004\022O\n\rchann" +
      "el_usage\030\004 \003(\01328.protos.DeviceUsageRespo" +
      "nse.DeviceUsage.ChannelUsageData\0322\n\020Chan" +
      "nelUsageData\022\017\n\007channel\030\001 \001(\r\022\r\n\005usage\030\002" +
      " \003(\001\"G\n\021DeviceListRequest\022\022\n\nauth_token\030" +
      "\001 \001(\t\022\036\n\026manufacturer_device_id\030\002 \003(\t\"p\n" +
      "\024OutletStatusResponse\022+\n\routlet_status\030\001" +
      " \003(\0132\024.protos.OutletStatus\022+\n\rresult_sta" +
      "tus\030d \001(\0162\024.protos.ResultStatus\":\n\014Outle" +
      "tStatus\022\036\n\026manufacturer_device_id\030\001 \001(\t\022" +
      "\n\n\002on\030\002 \001(\010\"V\n\023OutletStatusRequest\022\022\n\nau" +
      "th_token\030\001 \001(\t\022+\n\routlet_status\030\002 \003(\0132\024." +
      "protos.OutletStatus*\236\001\n\014ResultStatus\022\t\n\005" +
      "VALID\020\000\022\020\n\014AUTH_EXPIRED\020\003\022 \n\030AUTH_INVALI" +
      "D_CREDENTIALS\020\001\032\002\010\001\022\032\n\022AUTH_INVALID_TOKE" +
      "N\020\002\032\002\010\001\022\033\n\023INVALID_USAGE_SCALE\020\004\032\002\010\001\022\026\n\016" +
      "INTERNAL_ERROR\020d\032\002\010\001*\"\n\014UsageChannel\022\t\n\005" +
      "MAINS\020\000\022\007\n\003ALL\020\0012\215\003\n\nPartnerApi\022M\n\014Authe" +
      "nticate\022\035.protos.AuthenticationRequest\032\036" +
      ".protos.AuthenticationResponse\022M\n\nGetDev" +
      "ices\022\036.protos.DeviceInventoryRequest\032\037.p" +
      "rotos.DeviceInventoryResponse\022G\n\014GetUsag" +
      "eData\022\032.protos.DeviceUsageRequest\032\033.prot" +
      "os.DeviceUsageResponse\022J\n\017GetOutletStatu" +
      "s\022\031.protos.DeviceListRequest\032\034.protos.Ou" +
      "tletStatusResponse\022L\n\017SetOutletStatus\022\033." +
      "protos.OutletStatusRequest\032\034.protos.Outl" +
      "etStatusResponseB8\n#com.emporiaenergy.pr" +
      "otos.partnerapiB\017PartnerApiProtoP\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protos_AuthenticationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_AuthenticationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_AuthenticationRequest_descriptor,
        new java.lang.String[] { "PartnerEmail", "Password", });
    internal_static_protos_AuthenticationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protos_AuthenticationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_AuthenticationResponse_descriptor,
        new java.lang.String[] { "AuthToken", "ResultStatus", });
    internal_static_protos_DeviceInventoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_protos_DeviceInventoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_DeviceInventoryRequest_descriptor,
        new java.lang.String[] { "AuthToken", "CustomerEmails", });
    internal_static_protos_DeviceInventoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_protos_DeviceInventoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_DeviceInventoryResponse_descriptor,
        new java.lang.String[] { "Devices", "ResultStatus", });
    internal_static_protos_DeviceInventoryResponse_Device_descriptor =
      internal_static_protos_DeviceInventoryResponse_descriptor.getNestedTypes().get(0);
    internal_static_protos_DeviceInventoryResponse_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_DeviceInventoryResponse_Device_descriptor,
        new java.lang.String[] { "ManufacturerDeviceId", "Model", "Firmware", "LastAppConnectTime", "Solar", "Latitude", "Longitude", "DeviceName", "CustomerInfo", "ChannelNames", "DeviceConnected", "ZigbeeMac", });
    internal_static_protos_DeviceInventoryResponse_Device_CustomerInfo_descriptor =
      internal_static_protos_DeviceInventoryResponse_Device_descriptor.getNestedTypes().get(0);
    internal_static_protos_DeviceInventoryResponse_Device_CustomerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_DeviceInventoryResponse_Device_CustomerInfo_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "Email", });
    internal_static_protos_DeviceUsageRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_protos_DeviceUsageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_DeviceUsageRequest_descriptor,
        new java.lang.String[] { "AuthToken", "StartEpochSeconds", "EndEpochSeconds", "Scale", "Channels", "ManufacturerDeviceId", });
    internal_static_protos_DeviceUsageResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_protos_DeviceUsageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_DeviceUsageResponse_descriptor,
        new java.lang.String[] { "DeviceUsage", "ResultStatus", });
    internal_static_protos_DeviceUsageResponse_DeviceUsage_descriptor =
      internal_static_protos_DeviceUsageResponse_descriptor.getNestedTypes().get(0);
    internal_static_protos_DeviceUsageResponse_DeviceUsage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_DeviceUsageResponse_DeviceUsage_descriptor,
        new java.lang.String[] { "ManufacturerDeviceId", "Scale", "BucketEpochSeconds", "ChannelUsage", });
    internal_static_protos_DeviceUsageResponse_DeviceUsage_ChannelUsageData_descriptor =
      internal_static_protos_DeviceUsageResponse_DeviceUsage_descriptor.getNestedTypes().get(0);
    internal_static_protos_DeviceUsageResponse_DeviceUsage_ChannelUsageData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_DeviceUsageResponse_DeviceUsage_ChannelUsageData_descriptor,
        new java.lang.String[] { "Channel", "Usage", });
    internal_static_protos_DeviceListRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_protos_DeviceListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_DeviceListRequest_descriptor,
        new java.lang.String[] { "AuthToken", "ManufacturerDeviceId", });
    internal_static_protos_OutletStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_protos_OutletStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_OutletStatusResponse_descriptor,
        new java.lang.String[] { "OutletStatus", "ResultStatus", });
    internal_static_protos_OutletStatus_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_protos_OutletStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_OutletStatus_descriptor,
        new java.lang.String[] { "ManufacturerDeviceId", "On", });
    internal_static_protos_OutletStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_protos_OutletStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_OutletStatusRequest_descriptor,
        new java.lang.String[] { "AuthToken", "OutletStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
