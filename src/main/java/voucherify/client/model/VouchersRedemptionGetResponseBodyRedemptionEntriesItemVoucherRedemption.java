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
 * VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption {
  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_REDEEMED_QUANTITY = "redeemed_quantity";
  @SerializedName(SERIALIZED_NAME_REDEEMED_QUANTITY)
  private Integer redeemedQuantity;

  public static final String SERIALIZED_NAME_REDEEMED_POINTS = "redeemed_points";
  @SerializedName(SERIALIZED_NAME_REDEEMED_POINTS)
  private Integer redeemedPoints;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "list";

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption() {
  }

  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * How many times a voucher can be redeemed. A &#x60;null&#x60; value means unlimited.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption redeemedQuantity(Integer redeemedQuantity) {
    
    this.redeemedQuantity = redeemedQuantity;
    return this;
  }

   /**
   * How many times a voucher has already been redeemed.
   * @return redeemedQuantity
  **/
  @javax.annotation.Nullable
  public Integer getRedeemedQuantity() {
    return redeemedQuantity;
  }


  public void setRedeemedQuantity(Integer redeemedQuantity) {
    this.redeemedQuantity = redeemedQuantity;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption redeemedPoints(Integer redeemedPoints) {
    
    this.redeemedPoints = redeemedPoints;
    return this;
  }

   /**
   * Total loyalty points redeemed.
   * @return redeemedPoints
  **/
  @javax.annotation.Nullable
  public Integer getRedeemedPoints() {
    return redeemedPoints;
  }


  public void setRedeemedPoints(Integer redeemedPoints) {
    this.redeemedPoints = redeemedPoints;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented is by default &#x60;list&#x60;. To get this list, you need to make a call to the endpoint returned in the url attribute.
   * @return _object
  **/
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The endpoint where this list of redemptions can be accessed using a GET method. &#x60;/v1/vouchers/{voucher_code}/redemptions&#x60;
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption instance itself
   */
  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption = (VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption) o;
    return Objects.equals(this.quantity, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.quantity) &&
        Objects.equals(this.redeemedQuantity, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.redeemedQuantity) &&
        Objects.equals(this.redeemedPoints, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.redeemedPoints) &&
        Objects.equals(this._object, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption._object) &&
        Objects.equals(this.url, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.url)&&
        Objects.equals(this.additionalProperties, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, redeemedQuantity, redeemedPoints, _object, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    redeemedQuantity: ").append(toIndentedString(redeemedQuantity)).append("\n");
    sb.append("    redeemedPoints: ").append(toIndentedString(redeemedPoints)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("quantity");
    openapiFields.add("redeemed_quantity");
    openapiFields.add("redeemed_points");
    openapiFields.add("object");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption is not found in the empty JSON string", VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.class));

       return (TypeAdapter<T>) new TypeAdapter<VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption>() {
           @Override
           public void write(JsonWriter out, VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption
  * @throws IOException if the JSON string is invalid with respect to VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption
  */
  public static VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption.class);
  }

 /**
  * Convert an instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherRedemption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

