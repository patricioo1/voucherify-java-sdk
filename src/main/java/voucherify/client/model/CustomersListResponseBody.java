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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import voucherify.client.model.CustomerWithSummaryLoyaltyReferrals;

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
 * Response body schema for **GET** &#x60;/customers&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomersListResponseBody {
  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "list";

  public static final String SERIALIZED_NAME_DATA_REF = "data_ref";
  @SerializedName(SERIALIZED_NAME_DATA_REF)
  private String dataRef = "customers";

  public static final String SERIALIZED_NAME_CUSTOMERS = "customers";
  @SerializedName(SERIALIZED_NAME_CUSTOMERS)
  private List<CustomerWithSummaryLoyaltyReferrals> customers = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore;

  public CustomersListResponseBody() {
  }

  public CustomersListResponseBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by JSON. This object stores information about customers in a dictionary.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public CustomersListResponseBody dataRef(String dataRef) {
    
    this.dataRef = dataRef;
    return this;
  }

   /**
   * Identifies the name of the attribute that contains the array of customer objects.
   * @return dataRef
  **/
  @javax.annotation.Nonnull
  public String getDataRef() {
    return dataRef;
  }


  public void setDataRef(String dataRef) {
    this.dataRef = dataRef;
  }


  public CustomersListResponseBody customers(List<CustomerWithSummaryLoyaltyReferrals> customers) {
    
    this.customers = customers;
    return this;
  }

  public CustomersListResponseBody addCustomersItem(CustomerWithSummaryLoyaltyReferrals customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<>();
    }
    this.customers.add(customersItem);
    return this;
  }

   /**
   * Contains array of customer objects.
   * @return customers
  **/
  @javax.annotation.Nonnull
  public List<CustomerWithSummaryLoyaltyReferrals> getCustomers() {
    return customers;
  }


  public void setCustomers(List<CustomerWithSummaryLoyaltyReferrals> customers) {
    this.customers = customers;
  }


  public CustomersListResponseBody total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of customers.
   * @return total
  **/
  @javax.annotation.Nonnull
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public CustomersListResponseBody hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates whether there are more records for given filter parameters. This let&#39;s you know if you are able to run another request (with a different end date filter) to get more records returned in the results.
   * @return hasMore
  **/
  @javax.annotation.Nullable
  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomersListResponseBody customersListResponseBody = (CustomersListResponseBody) o;
    return Objects.equals(this._object, customersListResponseBody._object) &&
        Objects.equals(this.dataRef, customersListResponseBody.dataRef) &&
        Objects.equals(this.customers, customersListResponseBody.customers) &&
        Objects.equals(this.total, customersListResponseBody.total) &&
        Objects.equals(this.hasMore, customersListResponseBody.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, dataRef, customers, total, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersListResponseBody {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    dataRef: ").append(toIndentedString(dataRef)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("data_ref");
    openapiFields.add("customers");
    openapiFields.add("total");
    openapiFields.add("has_more");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("data_ref");
    openapiRequiredFields.add("customers");
    openapiRequiredFields.add("total");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomersListResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomersListResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomersListResponseBody is not found in the empty JSON string", CustomersListResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomersListResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomersListResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomersListResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("data_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_ref").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("customers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customers` to be an array in the JSON string but got `%s`", jsonObj.get("customers").toString()));
      }

      JsonArray jsonArraycustomers = jsonObj.getAsJsonArray("customers");
      // validate the required field `customers` (array)
      for (int i = 0; i < jsonArraycustomers.size(); i++) {
        CustomerWithSummaryLoyaltyReferrals.validateJsonElement(jsonArraycustomers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomersListResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomersListResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomersListResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomersListResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomersListResponseBody>() {
           @Override
           public void write(JsonWriter out, CustomersListResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomersListResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomersListResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomersListResponseBody
  * @throws IOException if the JSON string is invalid with respect to CustomersListResponseBody
  */
  public static CustomersListResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomersListResponseBody.class);
  }

 /**
  * Convert an instance of CustomersListResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

