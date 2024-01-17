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
import voucherify.client.model.OrderCalculated;
import voucherify.client.model.Session;
import voucherify.client.model.ValidationsRedeemableApplicable;
import voucherify.client.model.ValidationsRedeemableInapplicable;
import voucherify.client.model.ValidationsValidateAllResponseBody;
import voucherify.client.model.ValidationsValidatePartialResponseBody;



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

import voucherify.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValidationsValidateResponseBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ValidationsValidateResponseBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ValidationsValidateResponseBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ValidationsValidateResponseBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ValidationsValidateAllResponseBody> adapterValidationsValidateAllResponseBody = gson.getDelegateAdapter(this, TypeToken.get(ValidationsValidateAllResponseBody.class));
            final TypeAdapter<ValidationsValidatePartialResponseBody> adapterValidationsValidatePartialResponseBody = gson.getDelegateAdapter(this, TypeToken.get(ValidationsValidatePartialResponseBody.class));

            return (TypeAdapter<T>) new TypeAdapter<ValidationsValidateResponseBody>() {
                @Override
                public void write(JsonWriter out, ValidationsValidateResponseBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ValidationsValidateAllResponseBody`
                    if (value.getActualInstance() instanceof ValidationsValidateAllResponseBody) {
                      JsonElement element = adapterValidationsValidateAllResponseBody.toJsonTree((ValidationsValidateAllResponseBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ValidationsValidatePartialResponseBody`
                    if (value.getActualInstance() instanceof ValidationsValidatePartialResponseBody) {
                      JsonElement element = adapterValidationsValidatePartialResponseBody.toJsonTree((ValidationsValidatePartialResponseBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ValidationsValidateAllResponseBody, ValidationsValidatePartialResponseBody");
                }

                @Override
                public ValidationsValidateResponseBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ValidationsValidateAllResponseBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ValidationsValidateAllResponseBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterValidationsValidateAllResponseBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ValidationsValidateAllResponseBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ValidationsValidateAllResponseBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ValidationsValidateAllResponseBody'", e);
                    }
                    // deserialize ValidationsValidatePartialResponseBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ValidationsValidatePartialResponseBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterValidationsValidatePartialResponseBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ValidationsValidatePartialResponseBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ValidationsValidatePartialResponseBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ValidationsValidatePartialResponseBody'", e);
                    }

                    if (match == 1) {
                        ValidationsValidateResponseBody ret = new ValidationsValidateResponseBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ValidationsValidateResponseBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ValidationsValidateResponseBody() {
        super("oneOf", Boolean.FALSE);
    }

    public ValidationsValidateResponseBody(ValidationsValidateAllResponseBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ValidationsValidateResponseBody(ValidationsValidatePartialResponseBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ValidationsValidateAllResponseBody", ValidationsValidateAllResponseBody.class);
        schemas.put("ValidationsValidatePartialResponseBody", ValidationsValidatePartialResponseBody.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ValidationsValidateResponseBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ValidationsValidateAllResponseBody, ValidationsValidatePartialResponseBody
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ValidationsValidateAllResponseBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ValidationsValidatePartialResponseBody) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ValidationsValidateAllResponseBody, ValidationsValidatePartialResponseBody");
    }

    /**
     * Get the actual instance, which can be the following:
     * ValidationsValidateAllResponseBody, ValidationsValidatePartialResponseBody
     *
     * @return The actual instance (ValidationsValidateAllResponseBody, ValidationsValidatePartialResponseBody)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ValidationsValidateAllResponseBody`. If the actual instance is not `ValidationsValidateAllResponseBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValidationsValidateAllResponseBody`
     * @throws ClassCastException if the instance is not `ValidationsValidateAllResponseBody`
     */
    public ValidationsValidateAllResponseBody getValidationsValidateAllResponseBody() throws ClassCastException {
        return (ValidationsValidateAllResponseBody)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ValidationsValidatePartialResponseBody`. If the actual instance is not `ValidationsValidatePartialResponseBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValidationsValidatePartialResponseBody`
     * @throws ClassCastException if the instance is not `ValidationsValidatePartialResponseBody`
     */
    public ValidationsValidatePartialResponseBody getValidationsValidatePartialResponseBody() throws ClassCastException {
        return (ValidationsValidatePartialResponseBody)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValidationsValidateResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ValidationsValidateAllResponseBody
    try {
      ValidationsValidateAllResponseBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ValidationsValidateAllResponseBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ValidationsValidatePartialResponseBody
    try {
      ValidationsValidatePartialResponseBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ValidationsValidatePartialResponseBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ValidationsValidateResponseBody with oneOf schemas: ValidationsValidateAllResponseBody, ValidationsValidatePartialResponseBody. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ValidationsValidateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationsValidateResponseBody
  * @throws IOException if the JSON string is invalid with respect to ValidationsValidateResponseBody
  */
  public static ValidationsValidateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationsValidateResponseBody.class);
  }

 /**
  * Convert an instance of ValidationsValidateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

