// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package proto;

public final class CarOuterClass {
  private CarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Car_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Car_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_CreateCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_CreateCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_CreateCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_CreateCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_DeleteCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_DeleteCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_DeleteCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_DeleteCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ListCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ListCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ListCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ListCarResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tcar.proto\022\005proto\"w\n\003Car\022\n\n\002id\030\001 \001(\005\022\022\n" +
      "\nmodel_name\030\002 \001(\t\022\024\n\014manufacturer\030\003 \001(\t\022" +
      "\027\n\017production_year\030\004 \001(\t\022\022\n\nmodel_year\030\005" +
      " \001(\t\022\r\n\005price\030\006 \001(\001\"+\n\020CreateCarRequest\022" +
      "\027\n\003car\030\001 \001(\0132\n.proto.Car\",\n\021CreateCarRes" +
      "ponse\022\027\n\003car\030\001 \001(\0132\n.proto.Car\"!\n\020Delete" +
      "CarRequest\022\r\n\005carId\030\001 \001(\005\"\"\n\021DeleteCarRe" +
      "sponse\022\r\n\005carId\030\001 \001(\005\"\036\n\rGetCarRequest\022\r" +
      "\n\005carId\030\001 \001(\005\")\n\016GetCarResponse\022\027\n\003car\030\001" +
      " \001(\0132\n.proto.Car\"\020\n\016ListCarRequest\"*\n\017Li" +
      "stCarResponse\022\027\n\003car\030\001 \003(\0132\n.proto.Car2\375" +
      "\001\n\nCarService\022>\n\tCreateCar\022\027.proto.Creat" +
      "eCarRequest\032\030.proto.CreateCarResponse\022>\n" +
      "\tDeleteCar\022\027.proto.DeleteCarRequest\032\030.pr" +
      "oto.DeleteCarResponse\0225\n\006GetCar\022\024.proto." +
      "GetCarRequest\032\025.proto.GetCarResponse\0228\n\007" +
      "ListCar\022\025.proto.ListCarRequest\032\026.proto.L" +
      "istCarResponseB\002P\001b\006proto3"
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
    internal_static_proto_Car_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_Car_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Car_descriptor,
        new java.lang.String[] { "Id", "ModelName", "Manufacturer", "ProductionYear", "ModelYear", "Price", });
    internal_static_proto_CreateCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_CreateCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_CreateCarRequest_descriptor,
        new java.lang.String[] { "Car", });
    internal_static_proto_CreateCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_CreateCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_CreateCarResponse_descriptor,
        new java.lang.String[] { "Car", });
    internal_static_proto_DeleteCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_DeleteCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_DeleteCarRequest_descriptor,
        new java.lang.String[] { "CarId", });
    internal_static_proto_DeleteCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_proto_DeleteCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_DeleteCarResponse_descriptor,
        new java.lang.String[] { "CarId", });
    internal_static_proto_GetCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_proto_GetCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetCarRequest_descriptor,
        new java.lang.String[] { "CarId", });
    internal_static_proto_GetCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_proto_GetCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetCarResponse_descriptor,
        new java.lang.String[] { "Car", });
    internal_static_proto_ListCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_proto_ListCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ListCarRequest_descriptor,
        new java.lang.String[] { });
    internal_static_proto_ListCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_proto_ListCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ListCarResponse_descriptor,
        new java.lang.String[] { "Car", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
