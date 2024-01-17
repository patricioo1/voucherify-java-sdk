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
 * Statistics summarizing the number of related information that was deleted.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomersPermanentDeletionCreateResponseBodyDataJson {
  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private Integer events;

  public static final String SERIALIZED_NAME_CUSTOMER_EVENTS = "customer_events";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_EVENTS)
  private Integer customerEvents;

  public static final String SERIALIZED_NAME_DAILY_EVENTS = "daily_events";
  @SerializedName(SERIALIZED_NAME_DAILY_EVENTS)
  private Integer dailyEvents;

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private Integer segments;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private Integer orders;

  public static final String SERIALIZED_NAME_ORDER_EVENTS = "order_events";
  @SerializedName(SERIALIZED_NAME_ORDER_EVENTS)
  private Integer orderEvents;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Integer customer = 1;

  public CustomersPermanentDeletionCreateResponseBodyDataJson() {
  }

  public CustomersPermanentDeletionCreateResponseBodyDataJson events(Integer events) {
    
    this.events = events;
    return this;
  }

   /**
   * Number of events deleted.
   * @return events
  **/
  @javax.annotation.Nonnull
  public Integer getEvents() {
    return events;
  }


  public void setEvents(Integer events) {
    this.events = events;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson customerEvents(Integer customerEvents) {
    
    this.customerEvents = customerEvents;
    return this;
  }

   /**
   * Number of customer events deleted.
   * @return customerEvents
  **/
  @javax.annotation.Nonnull
  public Integer getCustomerEvents() {
    return customerEvents;
  }


  public void setCustomerEvents(Integer customerEvents) {
    this.customerEvents = customerEvents;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson dailyEvents(Integer dailyEvents) {
    
    this.dailyEvents = dailyEvents;
    return this;
  }

   /**
   * Number of daily events deleted.
   * @return dailyEvents
  **/
  @javax.annotation.Nonnull
  public Integer getDailyEvents() {
    return dailyEvents;
  }


  public void setDailyEvents(Integer dailyEvents) {
    this.dailyEvents = dailyEvents;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson segments(Integer segments) {
    
    this.segments = segments;
    return this;
  }

   /**
   * Number of segments deleted.
   * @return segments
  **/
  @javax.annotation.Nonnull
  public Integer getSegments() {
    return segments;
  }


  public void setSegments(Integer segments) {
    this.segments = segments;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson orders(Integer orders) {
    
    this.orders = orders;
    return this;
  }

   /**
   * Number of orders deleted.
   * @return orders
  **/
  @javax.annotation.Nonnull
  public Integer getOrders() {
    return orders;
  }


  public void setOrders(Integer orders) {
    this.orders = orders;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson orderEvents(Integer orderEvents) {
    
    this.orderEvents = orderEvents;
    return this;
  }

   /**
   * Number of order events deleted.
   * @return orderEvents
  **/
  @javax.annotation.Nonnull
  public Integer getOrderEvents() {
    return orderEvents;
  }


  public void setOrderEvents(Integer orderEvents) {
    this.orderEvents = orderEvents;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson customer(Integer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Number of customers deleted.
   * @return customer
  **/
  @javax.annotation.Nonnull
  public Integer getCustomer() {
    return customer;
  }


  public void setCustomer(Integer customer) {
    this.customer = customer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomersPermanentDeletionCreateResponseBodyDataJson customersPermanentDeletionCreateResponseBodyDataJson = (CustomersPermanentDeletionCreateResponseBodyDataJson) o;
    return Objects.equals(this.events, customersPermanentDeletionCreateResponseBodyDataJson.events) &&
        Objects.equals(this.customerEvents, customersPermanentDeletionCreateResponseBodyDataJson.customerEvents) &&
        Objects.equals(this.dailyEvents, customersPermanentDeletionCreateResponseBodyDataJson.dailyEvents) &&
        Objects.equals(this.segments, customersPermanentDeletionCreateResponseBodyDataJson.segments) &&
        Objects.equals(this.orders, customersPermanentDeletionCreateResponseBodyDataJson.orders) &&
        Objects.equals(this.orderEvents, customersPermanentDeletionCreateResponseBodyDataJson.orderEvents) &&
        Objects.equals(this.customer, customersPermanentDeletionCreateResponseBodyDataJson.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, customerEvents, dailyEvents, segments, orders, orderEvents, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersPermanentDeletionCreateResponseBodyDataJson {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    customerEvents: ").append(toIndentedString(customerEvents)).append("\n");
    sb.append("    dailyEvents: ").append(toIndentedString(dailyEvents)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    orderEvents: ").append(toIndentedString(orderEvents)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
    openapiFields.add("events");
    openapiFields.add("customer_events");
    openapiFields.add("daily_events");
    openapiFields.add("segments");
    openapiFields.add("orders");
    openapiFields.add("order_events");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("events");
    openapiRequiredFields.add("customer_events");
    openapiRequiredFields.add("daily_events");
    openapiRequiredFields.add("segments");
    openapiRequiredFields.add("orders");
    openapiRequiredFields.add("order_events");
    openapiRequiredFields.add("customer");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomersPermanentDeletionCreateResponseBodyDataJson
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomersPermanentDeletionCreateResponseBodyDataJson.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomersPermanentDeletionCreateResponseBodyDataJson is not found in the empty JSON string", CustomersPermanentDeletionCreateResponseBodyDataJson.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomersPermanentDeletionCreateResponseBodyDataJson.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomersPermanentDeletionCreateResponseBodyDataJson` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomersPermanentDeletionCreateResponseBodyDataJson.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomersPermanentDeletionCreateResponseBodyDataJson.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomersPermanentDeletionCreateResponseBodyDataJson' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomersPermanentDeletionCreateResponseBodyDataJson> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomersPermanentDeletionCreateResponseBodyDataJson.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomersPermanentDeletionCreateResponseBodyDataJson>() {
           @Override
           public void write(JsonWriter out, CustomersPermanentDeletionCreateResponseBodyDataJson value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomersPermanentDeletionCreateResponseBodyDataJson read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomersPermanentDeletionCreateResponseBodyDataJson given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomersPermanentDeletionCreateResponseBodyDataJson
  * @throws IOException if the JSON string is invalid with respect to CustomersPermanentDeletionCreateResponseBodyDataJson
  */
  public static CustomersPermanentDeletionCreateResponseBodyDataJson fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomersPermanentDeletionCreateResponseBodyDataJson.class);
  }

 /**
  * Convert an instance of CustomersPermanentDeletionCreateResponseBodyDataJson to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

