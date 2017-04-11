// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderProtos.proto

package com.jzs.order.dto;

public final class OrderProtos {
  private OrderProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OrderDTOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:user.OrderDTO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>optional int32 uid = 2;</code>
     */
    int getUid();

    /**
     * <code>optional string username = 3;</code>
     */
    java.lang.String getUsername();
    /**
     * <code>optional string username = 3;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>optional int32 supplierid = 4;</code>
     */
    int getSupplierid();

    /**
     * <code>optional string suppliername = 5;</code>
     */
    java.lang.String getSuppliername();
    /**
     * <code>optional string suppliername = 5;</code>
     */
    com.google.protobuf.ByteString
        getSuppliernameBytes();

    /**
     * <code>optional int32 price = 6;</code>
     */
    int getPrice();

    /**
     * <code>optional string desc = 7;</code>
     */
    java.lang.String getDesc();
    /**
     * <code>optional string desc = 7;</code>
     */
    com.google.protobuf.ByteString
        getDescBytes();
  }
  /**
   * Protobuf type {@code user.OrderDTO}
   */
  public  static final class OrderDTO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:user.OrderDTO)
      OrderDTOOrBuilder {
    // Use OrderDTO.newBuilder() to construct.
    private OrderDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OrderDTO() {
      id_ = 0;
      uid_ = 0;
      username_ = "";
      supplierid_ = 0;
      suppliername_ = "";
      price_ = 0;
      desc_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private OrderDTO(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              id_ = input.readInt32();
              break;
            }
            case 16: {

              uid_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 32: {

              supplierid_ = input.readInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              suppliername_ = s;
              break;
            }
            case 48: {

              price_ = input.readInt32();
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              desc_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return OrderProtos.internal_static_user_OrderDTO_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return OrderProtos.internal_static_user_OrderDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              OrderProtos.OrderDTO.class, OrderProtos.OrderDTO.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int UID_FIELD_NUMBER = 2;
    private int uid_;
    /**
     * <code>optional int32 uid = 2;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int USERNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object username_;
    /**
     * <code>optional string username = 3;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>optional string username = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUPPLIERID_FIELD_NUMBER = 4;
    private int supplierid_;
    /**
     * <code>optional int32 supplierid = 4;</code>
     */
    public int getSupplierid() {
      return supplierid_;
    }

    public static final int SUPPLIERNAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object suppliername_;
    /**
     * <code>optional string suppliername = 5;</code>
     */
    public java.lang.String getSuppliername() {
      java.lang.Object ref = suppliername_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        suppliername_ = s;
        return s;
      }
    }
    /**
     * <code>optional string suppliername = 5;</code>
     */
    public com.google.protobuf.ByteString
        getSuppliernameBytes() {
      java.lang.Object ref = suppliername_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        suppliername_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRICE_FIELD_NUMBER = 6;
    private int price_;
    /**
     * <code>optional int32 price = 6;</code>
     */
    public int getPrice() {
      return price_;
    }

    public static final int DESC_FIELD_NUMBER = 7;
    private volatile java.lang.Object desc_;
    /**
     * <code>optional string desc = 7;</code>
     */
    public java.lang.String getDesc() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc_ = s;
        return s;
      }
    }
    /**
     * <code>optional string desc = 7;</code>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (uid_ != 0) {
        output.writeInt32(2, uid_);
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, username_);
      }
      if (supplierid_ != 0) {
        output.writeInt32(4, supplierid_);
      }
      if (!getSuppliernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, suppliername_);
      }
      if (price_ != 0) {
        output.writeInt32(6, price_);
      }
      if (!getDescBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, desc_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, uid_);
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, username_);
      }
      if (supplierid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, supplierid_);
      }
      if (!getSuppliernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, suppliername_);
      }
      if (price_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, price_);
      }
      if (!getDescBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, desc_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof OrderProtos.OrderDTO)) {
        return super.equals(obj);
      }
      OrderProtos.OrderDTO other = (OrderProtos.OrderDTO) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && (getUid()
          == other.getUid());
      result = result && getUsername()
          .equals(other.getUsername());
      result = result && (getSupplierid()
          == other.getSupplierid());
      result = result && getSuppliername()
          .equals(other.getSuppliername());
      result = result && (getPrice()
          == other.getPrice());
      result = result && getDesc()
          .equals(other.getDesc());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + SUPPLIERID_FIELD_NUMBER;
      hash = (53 * hash) + getSupplierid();
      hash = (37 * hash) + SUPPLIERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getSuppliername().hashCode();
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getPrice();
      hash = (37 * hash) + DESC_FIELD_NUMBER;
      hash = (53 * hash) + getDesc().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static OrderProtos.OrderDTO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OrderProtos.OrderDTO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OrderProtos.OrderDTO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OrderProtos.OrderDTO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OrderProtos.OrderDTO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static OrderProtos.OrderDTO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static OrderProtos.OrderDTO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static OrderProtos.OrderDTO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static OrderProtos.OrderDTO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static OrderProtos.OrderDTO parseFrom(
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
    public static Builder newBuilder(OrderProtos.OrderDTO prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code user.OrderDTO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:user.OrderDTO)
        OrderProtos.OrderDTOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return OrderProtos.internal_static_user_OrderDTO_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return OrderProtos.internal_static_user_OrderDTO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                OrderProtos.OrderDTO.class, OrderProtos.OrderDTO.Builder.class);
      }

      // Construct using OrderProtos.OrderDTO.newBuilder()
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
      public Builder clear() {
        super.clear();
        id_ = 0;

        uid_ = 0;

        username_ = "";

        supplierid_ = 0;

        suppliername_ = "";

        price_ = 0;

        desc_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return OrderProtos.internal_static_user_OrderDTO_descriptor;
      }

      public OrderProtos.OrderDTO getDefaultInstanceForType() {
        return OrderProtos.OrderDTO.getDefaultInstance();
      }

      public OrderProtos.OrderDTO build() {
        OrderProtos.OrderDTO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public OrderProtos.OrderDTO buildPartial() {
        OrderProtos.OrderDTO result = new OrderProtos.OrderDTO(this);
        result.id_ = id_;
        result.uid_ = uid_;
        result.username_ = username_;
        result.supplierid_ = supplierid_;
        result.suppliername_ = suppliername_;
        result.price_ = price_;
        result.desc_ = desc_;
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
        if (other instanceof OrderProtos.OrderDTO) {
          return mergeFrom((OrderProtos.OrderDTO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(OrderProtos.OrderDTO other) {
        if (other == OrderProtos.OrderDTO.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (other.getSupplierid() != 0) {
          setSupplierid(other.getSupplierid());
        }
        if (!other.getSuppliername().isEmpty()) {
          suppliername_ = other.suppliername_;
          onChanged();
        }
        if (other.getPrice() != 0) {
          setPrice(other.getPrice());
        }
        if (!other.getDesc().isEmpty()) {
          desc_ = other.desc_;
          onChanged();
        }
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
        OrderProtos.OrderDTO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (OrderProtos.OrderDTO) e.getUnfinishedMessage();
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
       * <code>optional int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>optional int32 uid = 2;</code>
       */
      public int getUid() {
        return uid_;
      }
      /**
       * <code>optional int32 uid = 2;</code>
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 uid = 2;</code>
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object username_ = "";
      /**
       * <code>optional string username = 3;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string username = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string username = 3;</code>
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string username = 3;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>optional string username = 3;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private int supplierid_ ;
      /**
       * <code>optional int32 supplierid = 4;</code>
       */
      public int getSupplierid() {
        return supplierid_;
      }
      /**
       * <code>optional int32 supplierid = 4;</code>
       */
      public Builder setSupplierid(int value) {
        
        supplierid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 supplierid = 4;</code>
       */
      public Builder clearSupplierid() {
        
        supplierid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object suppliername_ = "";
      /**
       * <code>optional string suppliername = 5;</code>
       */
      public java.lang.String getSuppliername() {
        java.lang.Object ref = suppliername_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          suppliername_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string suppliername = 5;</code>
       */
      public com.google.protobuf.ByteString
          getSuppliernameBytes() {
        java.lang.Object ref = suppliername_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          suppliername_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string suppliername = 5;</code>
       */
      public Builder setSuppliername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        suppliername_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string suppliername = 5;</code>
       */
      public Builder clearSuppliername() {
        
        suppliername_ = getDefaultInstance().getSuppliername();
        onChanged();
        return this;
      }
      /**
       * <code>optional string suppliername = 5;</code>
       */
      public Builder setSuppliernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        suppliername_ = value;
        onChanged();
        return this;
      }

      private int price_ ;
      /**
       * <code>optional int32 price = 6;</code>
       */
      public int getPrice() {
        return price_;
      }
      /**
       * <code>optional int32 price = 6;</code>
       */
      public Builder setPrice(int value) {
        
        price_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 price = 6;</code>
       */
      public Builder clearPrice() {
        
        price_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object desc_ = "";
      /**
       * <code>optional string desc = 7;</code>
       */
      public java.lang.String getDesc() {
        java.lang.Object ref = desc_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          desc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string desc = 7;</code>
       */
      public com.google.protobuf.ByteString
          getDescBytes() {
        java.lang.Object ref = desc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          desc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string desc = 7;</code>
       */
      public Builder setDesc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        desc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string desc = 7;</code>
       */
      public Builder clearDesc() {
        
        desc_ = getDefaultInstance().getDesc();
        onChanged();
        return this;
      }
      /**
       * <code>optional string desc = 7;</code>
       */
      public Builder setDescBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        desc_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:user.OrderDTO)
    }

    // @@protoc_insertion_point(class_scope:user.OrderDTO)
    private static final OrderProtos.OrderDTO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new OrderProtos.OrderDTO();
    }

    public static OrderProtos.OrderDTO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OrderDTO>
        PARSER = new com.google.protobuf.AbstractParser<OrderDTO>() {
      public OrderDTO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new OrderDTO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OrderDTO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OrderDTO> getParserForType() {
      return PARSER;
    }

    public OrderProtos.OrderDTO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_OrderDTO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_OrderDTO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OrderProtos.proto\022\004user\"|\n\010OrderDTO\022\n\n" +
      "\002id\030\001 \001(\005\022\013\n\003uid\030\002 \001(\005\022\020\n\010username\030\003 \001(\t" +
      "\022\022\n\nsupplierid\030\004 \001(\005\022\024\n\014suppliername\030\005 \001" +
      "(\t\022\r\n\005price\030\006 \001(\005\022\014\n\004desc\030\007 \001(\tB \n\021com.j" +
      "zs.order.dtoB\013OrderProtosb\006proto3"
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
    internal_static_user_OrderDTO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_OrderDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_OrderDTO_descriptor,
        new java.lang.String[] { "Id", "Uid", "Username", "Supplierid", "Suppliername", "Price", "Desc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}