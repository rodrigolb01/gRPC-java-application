// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package proto;

/**
 * Protobuf type {@code proto.Car}
 */
public  final class Car extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Car)
    CarOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Car.newBuilder() to construct.
  private Car(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Car() {
    id_ = 0;
    modelName_ = "";
    manufacturer_ = "";
    productionYear_ = "";
    modelYear_ = "";
    price_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Car(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            modelName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            manufacturer_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            productionYear_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            modelYear_ = s;
            break;
          }
          case 49: {

            price_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return proto.CarOuterClass.internal_static_proto_Car_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.CarOuterClass.internal_static_proto_Car_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.Car.class, proto.Car.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int MODEL_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object modelName_;
  /**
   * <code>string model_name = 2;</code>
   */
  public java.lang.String getModelName() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelName_ = s;
      return s;
    }
  }
  /**
   * <code>string model_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MANUFACTURER_FIELD_NUMBER = 3;
  private volatile java.lang.Object manufacturer_;
  /**
   * <code>string manufacturer = 3;</code>
   */
  public java.lang.String getManufacturer() {
    java.lang.Object ref = manufacturer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      manufacturer_ = s;
      return s;
    }
  }
  /**
   * <code>string manufacturer = 3;</code>
   */
  public com.google.protobuf.ByteString
      getManufacturerBytes() {
    java.lang.Object ref = manufacturer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      manufacturer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCTION_YEAR_FIELD_NUMBER = 4;
  private volatile java.lang.Object productionYear_;
  /**
   * <code>string production_year = 4;</code>
   */
  public java.lang.String getProductionYear() {
    java.lang.Object ref = productionYear_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productionYear_ = s;
      return s;
    }
  }
  /**
   * <code>string production_year = 4;</code>
   */
  public com.google.protobuf.ByteString
      getProductionYearBytes() {
    java.lang.Object ref = productionYear_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productionYear_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_YEAR_FIELD_NUMBER = 5;
  private volatile java.lang.Object modelYear_;
  /**
   * <code>string model_year = 5;</code>
   */
  public java.lang.String getModelYear() {
    java.lang.Object ref = modelYear_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelYear_ = s;
      return s;
    }
  }
  /**
   * <code>string model_year = 5;</code>
   */
  public com.google.protobuf.ByteString
      getModelYearBytes() {
    java.lang.Object ref = modelYear_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelYear_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 6;
  private double price_;
  /**
   * <code>double price = 6;</code>
   */
  public double getPrice() {
    return price_;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getModelNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, modelName_);
    }
    if (!getManufacturerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, manufacturer_);
    }
    if (!getProductionYearBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, productionYear_);
    }
    if (!getModelYearBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, modelYear_);
    }
    if (price_ != 0D) {
      output.writeDouble(6, price_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getModelNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, modelName_);
    }
    if (!getManufacturerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, manufacturer_);
    }
    if (!getProductionYearBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, productionYear_);
    }
    if (!getModelYearBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, modelYear_);
    }
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, price_);
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
    if (!(obj instanceof proto.Car)) {
      return super.equals(obj);
    }
    proto.Car other = (proto.Car) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getModelName()
        .equals(other.getModelName());
    result = result && getManufacturer()
        .equals(other.getManufacturer());
    result = result && getProductionYear()
        .equals(other.getProductionYear());
    result = result && getModelYear()
        .equals(other.getModelYear());
    result = result && (
        java.lang.Double.doubleToLongBits(getPrice())
        == java.lang.Double.doubleToLongBits(
            other.getPrice()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + MODEL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getModelName().hashCode();
    hash = (37 * hash) + MANUFACTURER_FIELD_NUMBER;
    hash = (53 * hash) + getManufacturer().hashCode();
    hash = (37 * hash) + PRODUCTION_YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getProductionYear().hashCode();
    hash = (37 * hash) + MODEL_YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getModelYear().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.Car parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Car parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Car parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Car parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Car parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Car parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Car parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Car parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Car parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.Car parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Car parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Car parseFrom(
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
  public static Builder newBuilder(proto.Car prototype) {
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
   * Protobuf type {@code proto.Car}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Car)
      proto.CarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.CarOuterClass.internal_static_proto_Car_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.CarOuterClass.internal_static_proto_Car_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.Car.class, proto.Car.Builder.class);
    }

    // Construct using proto.Car.newBuilder()
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
      id_ = 0;

      modelName_ = "";

      manufacturer_ = "";

      productionYear_ = "";

      modelYear_ = "";

      price_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.CarOuterClass.internal_static_proto_Car_descriptor;
    }

    @java.lang.Override
    public proto.Car getDefaultInstanceForType() {
      return proto.Car.getDefaultInstance();
    }

    @java.lang.Override
    public proto.Car build() {
      proto.Car result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.Car buildPartial() {
      proto.Car result = new proto.Car(this);
      result.id_ = id_;
      result.modelName_ = modelName_;
      result.manufacturer_ = manufacturer_;
      result.productionYear_ = productionYear_;
      result.modelYear_ = modelYear_;
      result.price_ = price_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.Car) {
        return mergeFrom((proto.Car)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.Car other) {
      if (other == proto.Car.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getModelName().isEmpty()) {
        modelName_ = other.modelName_;
        onChanged();
      }
      if (!other.getManufacturer().isEmpty()) {
        manufacturer_ = other.manufacturer_;
        onChanged();
      }
      if (!other.getProductionYear().isEmpty()) {
        productionYear_ = other.productionYear_;
        onChanged();
      }
      if (!other.getModelYear().isEmpty()) {
        modelYear_ = other.modelYear_;
        onChanged();
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
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
      proto.Car parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.Car) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object modelName_ = "";
    /**
     * <code>string model_name = 2;</code>
     */
    public java.lang.String getModelName() {
      java.lang.Object ref = modelName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string model_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      java.lang.Object ref = modelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model_name = 2;</code>
     */
    public Builder setModelName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string model_name = 2;</code>
     */
    public Builder clearModelName() {
      
      modelName_ = getDefaultInstance().getModelName();
      onChanged();
      return this;
    }
    /**
     * <code>string model_name = 2;</code>
     */
    public Builder setModelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object manufacturer_ = "";
    /**
     * <code>string manufacturer = 3;</code>
     */
    public java.lang.String getManufacturer() {
      java.lang.Object ref = manufacturer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        manufacturer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string manufacturer = 3;</code>
     */
    public com.google.protobuf.ByteString
        getManufacturerBytes() {
      java.lang.Object ref = manufacturer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        manufacturer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string manufacturer = 3;</code>
     */
    public Builder setManufacturer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      manufacturer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string manufacturer = 3;</code>
     */
    public Builder clearManufacturer() {
      
      manufacturer_ = getDefaultInstance().getManufacturer();
      onChanged();
      return this;
    }
    /**
     * <code>string manufacturer = 3;</code>
     */
    public Builder setManufacturerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      manufacturer_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object productionYear_ = "";
    /**
     * <code>string production_year = 4;</code>
     */
    public java.lang.String getProductionYear() {
      java.lang.Object ref = productionYear_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productionYear_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string production_year = 4;</code>
     */
    public com.google.protobuf.ByteString
        getProductionYearBytes() {
      java.lang.Object ref = productionYear_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productionYear_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string production_year = 4;</code>
     */
    public Builder setProductionYear(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productionYear_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string production_year = 4;</code>
     */
    public Builder clearProductionYear() {
      
      productionYear_ = getDefaultInstance().getProductionYear();
      onChanged();
      return this;
    }
    /**
     * <code>string production_year = 4;</code>
     */
    public Builder setProductionYearBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productionYear_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object modelYear_ = "";
    /**
     * <code>string model_year = 5;</code>
     */
    public java.lang.String getModelYear() {
      java.lang.Object ref = modelYear_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelYear_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string model_year = 5;</code>
     */
    public com.google.protobuf.ByteString
        getModelYearBytes() {
      java.lang.Object ref = modelYear_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelYear_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model_year = 5;</code>
     */
    public Builder setModelYear(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelYear_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string model_year = 5;</code>
     */
    public Builder clearModelYear() {
      
      modelYear_ = getDefaultInstance().getModelYear();
      onChanged();
      return this;
    }
    /**
     * <code>string model_year = 5;</code>
     */
    public Builder setModelYearBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelYear_ = value;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>double price = 6;</code>
     */
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 6;</code>
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 6;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.Car)
  }

  // @@protoc_insertion_point(class_scope:proto.Car)
  private static final proto.Car DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.Car();
  }

  public static proto.Car getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Car>
      PARSER = new com.google.protobuf.AbstractParser<Car>() {
    @java.lang.Override
    public Car parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Car(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Car> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Car> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.Car getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
