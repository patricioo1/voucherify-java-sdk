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
import voucherify.client.model.CustomerWithSummaryLoyaltyReferrals;
import voucherify.client.model.SimpleSegment;

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
 * Event data object schema for &#x60;customer.segment.left&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventCustomerSegmentLeft {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private CustomerWithSummaryLoyaltyReferrals customer;

  public static final String SERIALIZED_NAME_SEGMENT = "segment";
  @SerializedName(SERIALIZED_NAME_SEGMENT)
  private SimpleSegment segment;

  public EventCustomerSegmentLeft() {
  }

  public EventCustomerSegmentLeft customer(CustomerWithSummaryLoyaltyReferrals customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public CustomerWithSummaryLoyaltyReferrals getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerWithSummaryLoyaltyReferrals customer) {
    this.customer = customer;
  }


  public EventCustomerSegmentLeft segment(SimpleSegment segment) {
    
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @javax.annotation.Nonnull
  public SimpleSegment getSegment() {
    return segment;
  }


  public void setSegment(SimpleSegment segment) {
    this.segment = segment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerSegmentLeft eventCustomerSegmentLeft = (EventCustomerSegmentLeft) o;
    return Objects.equals(this.customer, eventCustomerSegmentLeft.customer) &&
        Objects.equals(this.segment, eventCustomerSegmentLeft.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, segment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerSegmentLeft {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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
    openapiFields.add("segment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customer");
    openapiRequiredFields.add("segment");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerSegmentLeft
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerSegmentLeft.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerSegmentLeft is not found in the empty JSON string", EventCustomerSegmentLeft.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerSegmentLeft.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerSegmentLeft` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventCustomerSegmentLeft.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `customer`
      CustomerWithSummaryLoyaltyReferrals.validateJsonElement(jsonObj.get("customer"));
      // validate the required field `segment`
      SimpleSegment.validateJsonElement(jsonObj.get("segment"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerSegmentLeft.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerSegmentLeft' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerSegmentLeft> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerSegmentLeft.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerSegmentLeft>() {
           @Override
           public void write(JsonWriter out, EventCustomerSegmentLeft value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerSegmentLeft read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerSegmentLeft given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerSegmentLeft
  * @throws IOException if the JSON string is invalid with respect to EventCustomerSegmentLeft
  */
  public static EventCustomerSegmentLeft fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerSegmentLeft.class);
  }

 /**
  * Convert an instance of EventCustomerSegmentLeft to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

