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
 * ParameterUpdatedBeforeAfter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class ParameterUpdatedBeforeAfter {
  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private OffsetDateTime before;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private OffsetDateTime after;

  public ParameterUpdatedBeforeAfter() {
  }

  public ParameterUpdatedBeforeAfter before(OffsetDateTime before) {
    
    this.before = before;
    return this;
  }

   /**
   * Timestamp representing the date and time before the voucher was updated in ISO 8601 format.
   * @return before
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getBefore() {
    return before;
  }


  public void setBefore(OffsetDateTime before) {
    this.before = before;
  }


  public ParameterUpdatedBeforeAfter after(OffsetDateTime after) {
    
    this.after = after;
    return this;
  }

   /**
   * Timestamp representing the date and time after the voucher was updated in ISO 8601 format.
   * @return after
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getAfter() {
    return after;
  }


  public void setAfter(OffsetDateTime after) {
    this.after = after;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterUpdatedBeforeAfter parameterUpdatedBeforeAfter = (ParameterUpdatedBeforeAfter) o;
    return Objects.equals(this.before, parameterUpdatedBeforeAfter.before) &&
        Objects.equals(this.after, parameterUpdatedBeforeAfter.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(before, after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterUpdatedBeforeAfter {\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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
    openapiFields.add("before");
    openapiFields.add("after");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ParameterUpdatedBeforeAfter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParameterUpdatedBeforeAfter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParameterUpdatedBeforeAfter is not found in the empty JSON string", ParameterUpdatedBeforeAfter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParameterUpdatedBeforeAfter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParameterUpdatedBeforeAfter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParameterUpdatedBeforeAfter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParameterUpdatedBeforeAfter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParameterUpdatedBeforeAfter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParameterUpdatedBeforeAfter.class));

       return (TypeAdapter<T>) new TypeAdapter<ParameterUpdatedBeforeAfter>() {
           @Override
           public void write(JsonWriter out, ParameterUpdatedBeforeAfter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParameterUpdatedBeforeAfter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParameterUpdatedBeforeAfter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParameterUpdatedBeforeAfter
  * @throws IOException if the JSON string is invalid with respect to ParameterUpdatedBeforeAfter
  */
  public static ParameterUpdatedBeforeAfter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParameterUpdatedBeforeAfter.class);
  }

 /**
  * Convert an instance of ParameterUpdatedBeforeAfter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

