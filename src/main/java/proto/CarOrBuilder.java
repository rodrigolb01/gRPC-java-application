// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package proto;

public interface CarOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Car)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string model_name = 2;</code>
   */
  java.lang.String getModelName();
  /**
   * <code>string model_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <code>string manufacturer = 3;</code>
   */
  java.lang.String getManufacturer();
  /**
   * <code>string manufacturer = 3;</code>
   */
  com.google.protobuf.ByteString
      getManufacturerBytes();

  /**
   * <code>string production_year = 4;</code>
   */
  java.lang.String getProductionYear();
  /**
   * <code>string production_year = 4;</code>
   */
  com.google.protobuf.ByteString
      getProductionYearBytes();

  /**
   * <code>string model_year = 5;</code>
   */
  java.lang.String getModelYear();
  /**
   * <code>string model_year = 5;</code>
   */
  com.google.protobuf.ByteString
      getModelYearBytes();

  /**
   * <code>double price = 6;</code>
   */
  double getPrice();
}