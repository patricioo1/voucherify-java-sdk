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
import java.util.Arrays;
import voucherify.client.model.VoucherTransactionDetailsBalanceRelatedObject;

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
 * Contains information on how the balance was affected by the transaction.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VoucherTransactionDetailsBalance {
  /**
   * The type of voucher whose balance is being adjusted due to the transaction.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LOYALTY_CARD("loyalty_card");

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
  private TypeEnum type = TypeEnum.LOYALTY_CARD;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  /**
   * The type of object represented by the JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    BALANCE("balance");

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
  private ObjectEnum _object = ObjectEnum.BALANCE;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_RELATED_OBJECT = "related_object";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT)
  private VoucherTransactionDetailsBalanceRelatedObject relatedObject;

  public VoucherTransactionDetailsBalance() {
  }

  public VoucherTransactionDetailsBalance type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of voucher whose balance is being adjusted due to the transaction.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public VoucherTransactionDetailsBalance total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * The available points prior to the transaction.
   * @return total
  **/
  @javax.annotation.Nonnull
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public VoucherTransactionDetailsBalance _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by the JSON.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public VoucherTransactionDetailsBalance points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * The amount of points being used up in the transaction.
   * @return points
  **/
  @javax.annotation.Nonnull
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public VoucherTransactionDetailsBalance balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The points balance on the loyalty card after the points in the transaction are subtracted from the loyalty card.
   * @return balance
  **/
  @javax.annotation.Nonnull
  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public VoucherTransactionDetailsBalance relatedObject(VoucherTransactionDetailsBalanceRelatedObject relatedObject) {
    
    this.relatedObject = relatedObject;
    return this;
  }

   /**
   * Get relatedObject
   * @return relatedObject
  **/
  @javax.annotation.Nonnull
  public VoucherTransactionDetailsBalanceRelatedObject getRelatedObject() {
    return relatedObject;
  }


  public void setRelatedObject(VoucherTransactionDetailsBalanceRelatedObject relatedObject) {
    this.relatedObject = relatedObject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherTransactionDetailsBalance voucherTransactionDetailsBalance = (VoucherTransactionDetailsBalance) o;
    return Objects.equals(this.type, voucherTransactionDetailsBalance.type) &&
        Objects.equals(this.total, voucherTransactionDetailsBalance.total) &&
        Objects.equals(this._object, voucherTransactionDetailsBalance._object) &&
        Objects.equals(this.points, voucherTransactionDetailsBalance.points) &&
        Objects.equals(this.balance, voucherTransactionDetailsBalance.balance) &&
        Objects.equals(this.relatedObject, voucherTransactionDetailsBalance.relatedObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, total, _object, points, balance, relatedObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherTransactionDetailsBalance {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("total");
    openapiFields.add("object");
    openapiFields.add("points");
    openapiFields.add("balance");
    openapiFields.add("related_object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("points");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("related_object");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VoucherTransactionDetailsBalance
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VoucherTransactionDetailsBalance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherTransactionDetailsBalance is not found in the empty JSON string", VoucherTransactionDetailsBalance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VoucherTransactionDetailsBalance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherTransactionDetailsBalance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VoucherTransactionDetailsBalance.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      // validate the required field `related_object`
      VoucherTransactionDetailsBalanceRelatedObject.validateJsonElement(jsonObj.get("related_object"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherTransactionDetailsBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherTransactionDetailsBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherTransactionDetailsBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherTransactionDetailsBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherTransactionDetailsBalance>() {
           @Override
           public void write(JsonWriter out, VoucherTransactionDetailsBalance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherTransactionDetailsBalance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherTransactionDetailsBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherTransactionDetailsBalance
  * @throws IOException if the JSON string is invalid with respect to VoucherTransactionDetailsBalance
  */
  public static VoucherTransactionDetailsBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherTransactionDetailsBalance.class);
  }

 /**
  * Convert an instance of VoucherTransactionDetailsBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

