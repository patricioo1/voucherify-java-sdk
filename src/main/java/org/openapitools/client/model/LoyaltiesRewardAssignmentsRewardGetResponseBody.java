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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.RewardAttributes;
import org.openapitools.client.model.RewardType;
import org.openapitools.jackson.nullable.JsonNullable;

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

import org.openapitools.client.JSON;

/**
 * Response body schema for **GET** &#x60;/loyalties/{campaignId}/reward-assignments/{assignmentId}/reward&#x60;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class LoyaltiesRewardAssignmentsRewardGetResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STOCK = "stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private Integer stock;

  public static final String SERIALIZED_NAME_REDEEMED = "redeemed";
  @SerializedName(SERIALIZED_NAME_REDEEMED)
  private Integer redeemed;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private RewardAttributes attributes;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

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

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private RewardType parameters;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

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

  public LoyaltiesRewardAssignmentsRewardGetResponseBody() {
  }

  public LoyaltiesRewardAssignmentsRewardGetResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique reward ID, assigned by Voucherify.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LoyaltiesRewardAssignmentsRewardGetResponseBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Reward name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LoyaltiesRewardAssignmentsRewardGetResponseBody stock(Integer stock) {
    
    this.stock = stock;
    return this;
  }

   /**
   * Configurable for **material rewards**. The number of units of the product that you want to share as reward.
   * @return stock
  **/
  @javax.annotation.Nullable
  public Integer getStock() {
    return stock;
  }


  public void setStock(Integer stock) {
    this.stock = stock;
  }


  public LoyaltiesRewardAssignmentsRewardGetResponseBody redeemed(Integer redeemed) {
    
    this.redeemed = redeemed;
    return this;
  }

   /**
   * Defines the number of already invoked (successful) reward redemptions. 
   * @return redeemed
  **/
  @javax.annotation.Nullable
  public Integer getRedeemed() {
    return redeemed;
  }


  public void setRedeemed(Integer redeemed) {
    this.redeemed = redeemed;
  }


  public LoyaltiesRewardAssignmentsRewardGetResponseBody attributes(RewardAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  public RewardAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(RewardAttributes attributes) {
    this.attributes = attributes;
  }


  public LoyaltiesRewardAssignmentsRewardGetResponseBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the reward. A set of key/value pairs that you can attach to a reward object. It can be useful for storing additional information about the reward in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public LoyaltiesRewardAssignmentsRewardGetResponseBody type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Reward type.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public LoyaltiesRewardAssignmentsRewardGetResponseBody parameters(RewardType parameters) {
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public RewardType getParameters() {
    return parameters;
  }


  public void setParameters(RewardType parameters) {
    this.parameters = parameters;
  }


  public LoyaltiesRewardAssignmentsRewardGetResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the reward was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LoyaltiesRewardAssignmentsRewardGetResponseBody updatedAt(OffsetDateTime updatedAt) {
    
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


  public LoyaltiesRewardAssignmentsRewardGetResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by the JSON. This object stores information about the reward.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesRewardAssignmentsRewardGetResponseBody loyaltiesRewardAssignmentsRewardGetResponseBody = (LoyaltiesRewardAssignmentsRewardGetResponseBody) o;
    return Objects.equals(this.id, loyaltiesRewardAssignmentsRewardGetResponseBody.id) &&
        Objects.equals(this.name, loyaltiesRewardAssignmentsRewardGetResponseBody.name) &&
        Objects.equals(this.stock, loyaltiesRewardAssignmentsRewardGetResponseBody.stock) &&
        Objects.equals(this.redeemed, loyaltiesRewardAssignmentsRewardGetResponseBody.redeemed) &&
        Objects.equals(this.attributes, loyaltiesRewardAssignmentsRewardGetResponseBody.attributes) &&
        Objects.equals(this.metadata, loyaltiesRewardAssignmentsRewardGetResponseBody.metadata) &&
        Objects.equals(this.type, loyaltiesRewardAssignmentsRewardGetResponseBody.type) &&
        Objects.equals(this.parameters, loyaltiesRewardAssignmentsRewardGetResponseBody.parameters) &&
        Objects.equals(this.createdAt, loyaltiesRewardAssignmentsRewardGetResponseBody.createdAt) &&
        Objects.equals(this.updatedAt, loyaltiesRewardAssignmentsRewardGetResponseBody.updatedAt) &&
        Objects.equals(this._object, loyaltiesRewardAssignmentsRewardGetResponseBody._object);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, stock, redeemed, attributes, metadata, type, parameters, createdAt, updatedAt, _object);
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
    sb.append("class LoyaltiesRewardAssignmentsRewardGetResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    redeemed: ").append(toIndentedString(redeemed)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("stock");
    openapiFields.add("redeemed");
    openapiFields.add("attributes");
    openapiFields.add("metadata");
    openapiFields.add("type");
    openapiFields.add("parameters");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesRewardAssignmentsRewardGetResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltiesRewardAssignmentsRewardGetResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltiesRewardAssignmentsRewardGetResponseBody is not found in the empty JSON string", LoyaltiesRewardAssignmentsRewardGetResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltiesRewardAssignmentsRewardGetResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltiesRewardAssignmentsRewardGetResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoyaltiesRewardAssignmentsRewardGetResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `attributes`
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        RewardAttributes.validateJsonElement(jsonObj.get("attributes"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("type");

        if (objectElement != null && !objectElement.isJsonNull()) {
          TypeEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `type` to be not null");
        }
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a valid element of TypeEnum enum got `%s` instead", jsonObj.get("type").toString()));
      }
      // validate the optional field `parameters`
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        RewardType.validateJsonElement(jsonObj.get("parameters"));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("object");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ObjectEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `object` to be not null");
        }
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a valid element of ObjectEnum enum got `%s` instead", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesRewardAssignmentsRewardGetResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesRewardAssignmentsRewardGetResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesRewardAssignmentsRewardGetResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesRewardAssignmentsRewardGetResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesRewardAssignmentsRewardGetResponseBody>() {
           @Override
           public void write(JsonWriter out, LoyaltiesRewardAssignmentsRewardGetResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesRewardAssignmentsRewardGetResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesRewardAssignmentsRewardGetResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesRewardAssignmentsRewardGetResponseBody
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesRewardAssignmentsRewardGetResponseBody
  */
  public static LoyaltiesRewardAssignmentsRewardGetResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesRewardAssignmentsRewardGetResponseBody.class);
  }

 /**
  * Convert an instance of LoyaltiesRewardAssignmentsRewardGetResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

