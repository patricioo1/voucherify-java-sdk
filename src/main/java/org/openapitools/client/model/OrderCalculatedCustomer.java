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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.CustomerBaseAddress;
import org.openapitools.client.model.CustomerId;
import org.openapitools.client.model.CustomerLoyalty;
import org.openapitools.client.model.CustomerReferrals;
import org.openapitools.client.model.CustomerResponseDataAssets;
import org.openapitools.client.model.CustomerSummary;
import org.openapitools.client.model.CustomerWithSummaryLoyaltyReferrals;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class OrderCalculatedCustomer extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(OrderCalculatedCustomer.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OrderCalculatedCustomer.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OrderCalculatedCustomer' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CustomerWithSummaryLoyaltyReferrals> adapterCustomerWithSummaryLoyaltyReferrals = gson.getDelegateAdapter(this, TypeToken.get(CustomerWithSummaryLoyaltyReferrals.class));
            final TypeAdapter<CustomerId> adapterCustomerId = gson.getDelegateAdapter(this, TypeToken.get(CustomerId.class));

            return (TypeAdapter<T>) new TypeAdapter<OrderCalculatedCustomer>() {
                @Override
                public void write(JsonWriter out, OrderCalculatedCustomer value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CustomerWithSummaryLoyaltyReferrals`
                    if (value.getActualInstance() instanceof CustomerWithSummaryLoyaltyReferrals) {
                      JsonElement element = adapterCustomerWithSummaryLoyaltyReferrals.toJsonTree((CustomerWithSummaryLoyaltyReferrals)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CustomerId`
                    if (value.getActualInstance() instanceof CustomerId) {
                      JsonElement element = adapterCustomerId.toJsonTree((CustomerId)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CustomerId, CustomerWithSummaryLoyaltyReferrals");
                }

                @Override
                public OrderCalculatedCustomer read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CustomerWithSummaryLoyaltyReferrals
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CustomerWithSummaryLoyaltyReferrals.validateJsonElement(jsonElement);
                      actualAdapter = adapterCustomerWithSummaryLoyaltyReferrals;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CustomerWithSummaryLoyaltyReferrals'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CustomerWithSummaryLoyaltyReferrals failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CustomerWithSummaryLoyaltyReferrals'", e);
                    }
                    // deserialize CustomerId
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CustomerId.validateJsonElement(jsonElement);
                      actualAdapter = adapterCustomerId;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CustomerId'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CustomerId failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CustomerId'", e);
                    }

                    if (match == 1) {
                        OrderCalculatedCustomer ret = new OrderCalculatedCustomer();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for OrderCalculatedCustomer: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public OrderCalculatedCustomer() {
        super("oneOf", Boolean.FALSE);
    }

    public OrderCalculatedCustomer(CustomerId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OrderCalculatedCustomer(CustomerWithSummaryLoyaltyReferrals o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CustomerWithSummaryLoyaltyReferrals", CustomerWithSummaryLoyaltyReferrals.class);
        schemas.put("CustomerId", CustomerId.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return OrderCalculatedCustomer.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CustomerId, CustomerWithSummaryLoyaltyReferrals
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CustomerWithSummaryLoyaltyReferrals) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CustomerId) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CustomerId, CustomerWithSummaryLoyaltyReferrals");
    }

    /**
     * Get the actual instance, which can be the following:
     * CustomerId, CustomerWithSummaryLoyaltyReferrals
     *
     * @return The actual instance (CustomerId, CustomerWithSummaryLoyaltyReferrals)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomerWithSummaryLoyaltyReferrals`. If the actual instance is not `CustomerWithSummaryLoyaltyReferrals`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomerWithSummaryLoyaltyReferrals`
     * @throws ClassCastException if the instance is not `CustomerWithSummaryLoyaltyReferrals`
     */
    public CustomerWithSummaryLoyaltyReferrals getCustomerWithSummaryLoyaltyReferrals() throws ClassCastException {
        return (CustomerWithSummaryLoyaltyReferrals)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CustomerId`. If the actual instance is not `CustomerId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomerId`
     * @throws ClassCastException if the instance is not `CustomerId`
     */
    public CustomerId getCustomerId() throws ClassCastException {
        return (CustomerId)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCalculatedCustomer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CustomerWithSummaryLoyaltyReferrals
    try {
      CustomerWithSummaryLoyaltyReferrals.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CustomerWithSummaryLoyaltyReferrals failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CustomerId
    try {
      CustomerId.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CustomerId failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for OrderCalculatedCustomer with oneOf schemas: CustomerId, CustomerWithSummaryLoyaltyReferrals. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of OrderCalculatedCustomer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCalculatedCustomer
  * @throws IOException if the JSON string is invalid with respect to OrderCalculatedCustomer
  */
  public static OrderCalculatedCustomer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCalculatedCustomer.class);
  }

 /**
  * Convert an instance of OrderCalculatedCustomer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

