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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.VouchersRedemptionGetResponseBodyRedemptionEntriesItem;
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
 * Response body schema for **GET** &#x60;/vouchers/{code}/redemption&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class VouchersRedemptionGetResponseBody {
  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_REDEEMED_QUANTITY = "redeemed_quantity";
  @SerializedName(SERIALIZED_NAME_REDEEMED_QUANTITY)
  private Integer redeemedQuantity;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "list";

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DATA_REF = "data_ref";
  @SerializedName(SERIALIZED_NAME_DATA_REF)
  private String dataRef = "redemption_entries";

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_REDEMPTION_ENTRIES = "redemption_entries";
  @SerializedName(SERIALIZED_NAME_REDEMPTION_ENTRIES)
  private List<VouchersRedemptionGetResponseBodyRedemptionEntriesItem> redemptionEntries = new ArrayList<>();

  public VouchersRedemptionGetResponseBody() {
  }

  public VouchersRedemptionGetResponseBody quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The maximum number of times a voucher can be redeemed.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public VouchersRedemptionGetResponseBody redeemedQuantity(Integer redeemedQuantity) {
    
    this.redeemedQuantity = redeemedQuantity;
    return this;
  }

   /**
   * The number of times the voucher was redeemed successfully.
   * @return redeemedQuantity
  **/
  @javax.annotation.Nonnull
  public Integer getRedeemedQuantity() {
    return redeemedQuantity;
  }


  public void setRedeemedQuantity(Integer redeemedQuantity) {
    this.redeemedQuantity = redeemedQuantity;
  }


  public VouchersRedemptionGetResponseBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by JSON. This object stores information about redemptions in a dictionary.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public VouchersRedemptionGetResponseBody url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public VouchersRedemptionGetResponseBody dataRef(String dataRef) {
    
    this.dataRef = dataRef;
    return this;
  }

   /**
   * Identifies the name of the attribute that contains the array of &#x60;redemption_entries&#x60;.
   * @return dataRef
  **/
  @javax.annotation.Nonnull
  public String getDataRef() {
    return dataRef;
  }


  public void setDataRef(String dataRef) {
    this.dataRef = dataRef;
  }


  public VouchersRedemptionGetResponseBody total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of redemption objects.
   * @return total
  **/
  @javax.annotation.Nonnull
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public VouchersRedemptionGetResponseBody redemptionEntries(List<VouchersRedemptionGetResponseBodyRedemptionEntriesItem> redemptionEntries) {
    
    this.redemptionEntries = redemptionEntries;
    return this;
  }

  public VouchersRedemptionGetResponseBody addRedemptionEntriesItem(VouchersRedemptionGetResponseBodyRedemptionEntriesItem redemptionEntriesItem) {
    if (this.redemptionEntries == null) {
      this.redemptionEntries = new ArrayList<>();
    }
    this.redemptionEntries.add(redemptionEntriesItem);
    return this;
  }

   /**
   * Contains the array of successful and failed redemption objects.
   * @return redemptionEntries
  **/
  @javax.annotation.Nonnull
  public List<VouchersRedemptionGetResponseBodyRedemptionEntriesItem> getRedemptionEntries() {
    return redemptionEntries;
  }


  public void setRedemptionEntries(List<VouchersRedemptionGetResponseBodyRedemptionEntriesItem> redemptionEntries) {
    this.redemptionEntries = redemptionEntries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VouchersRedemptionGetResponseBody vouchersRedemptionGetResponseBody = (VouchersRedemptionGetResponseBody) o;
    return Objects.equals(this.quantity, vouchersRedemptionGetResponseBody.quantity) &&
        Objects.equals(this.redeemedQuantity, vouchersRedemptionGetResponseBody.redeemedQuantity) &&
        Objects.equals(this._object, vouchersRedemptionGetResponseBody._object) &&
        Objects.equals(this.url, vouchersRedemptionGetResponseBody.url) &&
        Objects.equals(this.dataRef, vouchersRedemptionGetResponseBody.dataRef) &&
        Objects.equals(this.total, vouchersRedemptionGetResponseBody.total) &&
        Objects.equals(this.redemptionEntries, vouchersRedemptionGetResponseBody.redemptionEntries);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, redeemedQuantity, _object, url, dataRef, total, redemptionEntries);
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
    sb.append("class VouchersRedemptionGetResponseBody {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    redeemedQuantity: ").append(toIndentedString(redeemedQuantity)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    dataRef: ").append(toIndentedString(dataRef)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    redemptionEntries: ").append(toIndentedString(redemptionEntries)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("url");
    openapiFields.add("data_ref");
    openapiFields.add("total");
    openapiFields.add("redemption_entries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("redeemed_quantity");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("data_ref");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("redemption_entries");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VouchersRedemptionGetResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VouchersRedemptionGetResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VouchersRedemptionGetResponseBody is not found in the empty JSON string", VouchersRedemptionGetResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VouchersRedemptionGetResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VouchersRedemptionGetResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VouchersRedemptionGetResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("data_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_ref").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("redemption_entries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redemption_entries` to be an array in the JSON string but got `%s`", jsonObj.get("redemption_entries").toString()));
      }

      JsonArray jsonArrayredemptionEntries = jsonObj.getAsJsonArray("redemption_entries");
      // validate the required field `redemption_entries` (array)
      for (int i = 0; i < jsonArrayredemptionEntries.size(); i++) {
        VouchersRedemptionGetResponseBodyRedemptionEntriesItem.validateJsonElement(jsonArrayredemptionEntries.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VouchersRedemptionGetResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VouchersRedemptionGetResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VouchersRedemptionGetResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VouchersRedemptionGetResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<VouchersRedemptionGetResponseBody>() {
           @Override
           public void write(JsonWriter out, VouchersRedemptionGetResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VouchersRedemptionGetResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VouchersRedemptionGetResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VouchersRedemptionGetResponseBody
  * @throws IOException if the JSON string is invalid with respect to VouchersRedemptionGetResponseBody
  */
  public static VouchersRedemptionGetResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VouchersRedemptionGetResponseBody.class);
  }

 /**
  * Convert an instance of VouchersRedemptionGetResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

