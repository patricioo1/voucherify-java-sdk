/*
 * Voucherify API
 * Voucherify promotion engine REST API. Please see https://docs.voucherify.io/docs for more details.
 *
 * The version of the OpenAPI document: v2018-08-01
 * Contact: support@voucherify.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package voucherify.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.SimpleCustomer;
import voucherify.client.model.SimpleProduct;
import voucherify.client.model.SimpleSku;
import voucherify.client.model.SimpleVoucher;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import voucherify.client.JSON;

/**
 * SimpleRedemptionRewardResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SimpleRedemptionRewardResult {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  public static final String SERIALIZED_NAME_ASSIGNMENT_ID = "assignment_id";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENT_ID)
  private String assignmentId;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private SimpleVoucher voucher;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private SimpleProduct product;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private SimpleSku sku;

  public static final String SERIALIZED_NAME_LOYALTY_TIER_ID = "loyalty_tier_id";
  @SerializedName(SERIALIZED_NAME_LOYALTY_TIER_ID)
  private String loyaltyTierId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of object represented by the JSON. This object stores information about the reward.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    REWARD("reward");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object = ObjectEnum.REWARD;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Object parameters;

  /**
   * Reward type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CAMPAIGN("CAMPAIGN"),
    
    COIN("COIN"),
    
    MATERIAL("MATERIAL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public SimpleRedemptionRewardResult() {
  }

  public SimpleRedemptionRewardResult customer(SimpleCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public SimpleCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(SimpleCustomer customer) {
    this.customer = customer;
  }


  public SimpleRedemptionRewardResult assignmentId(String assignmentId) {
    
    this.assignmentId = assignmentId;
    return this;
  }

   /**
   * Unique reward assignment ID assigned by Voucherify.
   * @return assignmentId
  **/
  @javax.annotation.Nullable
  public String getAssignmentId() {
    return assignmentId;
  }


  public void setAssignmentId(String assignmentId) {
    this.assignmentId = assignmentId;
  }


  public SimpleRedemptionRewardResult voucher(SimpleVoucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  public SimpleVoucher getVoucher() {
    return voucher;
  }


  public void setVoucher(SimpleVoucher voucher) {
    this.voucher = voucher;
  }


  public SimpleRedemptionRewardResult product(SimpleProduct product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  public SimpleProduct getProduct() {
    return product;
  }


  public void setProduct(SimpleProduct product) {
    this.product = product;
  }


  public SimpleRedemptionRewardResult sku(SimpleSku sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  public SimpleSku getSku() {
    return sku;
  }


  public void setSku(SimpleSku sku) {
    this.sku = sku;
  }


  public SimpleRedemptionRewardResult loyaltyTierId(String loyaltyTierId) {
    
    this.loyaltyTierId = loyaltyTierId;
    return this;
  }

   /**
   * Unique loyalty tier ID assigned by Voucherify.
   * @return loyaltyTierId
  **/
  @javax.annotation.Nullable
  public String getLoyaltyTierId() {
    return loyaltyTierId;
  }


  public void setLoyaltyTierId(String loyaltyTierId) {
    this.loyaltyTierId = loyaltyTierId;
  }


  public SimpleRedemptionRewardResult id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique reward ID, assigned by Voucherify.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SimpleRedemptionRewardResult _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by the JSON. This object stores information about the reward.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public SimpleRedemptionRewardResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Reward name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SimpleRedemptionRewardResult createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the reward was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SimpleRedemptionRewardResult updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the reward was updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SimpleRedemptionRewardResult parameters(Object parameters) {
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Defines how the reward is generated.
   * @return parameters
  **/
  @javax.annotation.Nullable
  public Object getParameters() {
    return parameters;
  }


  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }


  public SimpleRedemptionRewardResult type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Reward type.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleRedemptionRewardResult simpleRedemptionRewardResult = (SimpleRedemptionRewardResult) o;
    return Objects.equals(this.customer, simpleRedemptionRewardResult.customer) &&
        Objects.equals(this.assignmentId, simpleRedemptionRewardResult.assignmentId) &&
        Objects.equals(this.voucher, simpleRedemptionRewardResult.voucher) &&
        Objects.equals(this.product, simpleRedemptionRewardResult.product) &&
        Objects.equals(this.sku, simpleRedemptionRewardResult.sku) &&
        Objects.equals(this.loyaltyTierId, simpleRedemptionRewardResult.loyaltyTierId) &&
        Objects.equals(this.id, simpleRedemptionRewardResult.id) &&
        Objects.equals(this._object, simpleRedemptionRewardResult._object) &&
        Objects.equals(this.name, simpleRedemptionRewardResult.name) &&
        Objects.equals(this.createdAt, simpleRedemptionRewardResult.createdAt) &&
        Objects.equals(this.updatedAt, simpleRedemptionRewardResult.updatedAt) &&
        Objects.equals(this.parameters, simpleRedemptionRewardResult.parameters) &&
        Objects.equals(this.type, simpleRedemptionRewardResult.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, assignmentId, voucher, product, sku, loyaltyTierId, id, _object, name, createdAt, updatedAt, parameters, type);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleRedemptionRewardResult {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    loyaltyTierId: ").append(toIndentedString(loyaltyTierId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("customer");
    openapiFields.add("assignment_id");
    openapiFields.add("voucher");
    openapiFields.add("product");
    openapiFields.add("sku");
    openapiFields.add("loyalty_tier_id");
    openapiFields.add("id");
    openapiFields.add("object");
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("parameters");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SimpleRedemptionRewardResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimpleRedemptionRewardResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimpleRedemptionRewardResult is not found in the empty JSON string", SimpleRedemptionRewardResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimpleRedemptionRewardResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimpleRedemptionRewardResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        SimpleCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      if ((jsonObj.get("assignment_id") != null && !jsonObj.get("assignment_id").isJsonNull()) && !jsonObj.get("assignment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assignment_id").toString()));
      }
      // validate the optional field `voucher`
      if (jsonObj.get("voucher") != null && !jsonObj.get("voucher").isJsonNull()) {
        SimpleVoucher.validateJsonElement(jsonObj.get("voucher"));
      }
      // validate the optional field `product`
      if (jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) {
        SimpleProduct.validateJsonElement(jsonObj.get("product"));
      }
      // validate the optional field `sku`
      if (jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) {
        SimpleSku.validateJsonElement(jsonObj.get("sku"));
      }
      if ((jsonObj.get("loyalty_tier_id") != null && !jsonObj.get("loyalty_tier_id").isJsonNull()) && !jsonObj.get("loyalty_tier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loyalty_tier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loyalty_tier_id").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimpleRedemptionRewardResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimpleRedemptionRewardResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimpleRedemptionRewardResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimpleRedemptionRewardResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SimpleRedemptionRewardResult>() {
           @Override
           public void write(JsonWriter out, SimpleRedemptionRewardResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimpleRedemptionRewardResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimpleRedemptionRewardResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimpleRedemptionRewardResult
  * @throws IOException if the JSON string is invalid with respect to SimpleRedemptionRewardResult
  */
  public static SimpleRedemptionRewardResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimpleRedemptionRewardResult.class);
  }

 /**
  * Convert an instance of SimpleRedemptionRewardResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

