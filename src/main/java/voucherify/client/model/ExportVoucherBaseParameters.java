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
import voucherify.client.model.ExportVoucherFields;
import voucherify.client.model.ExportVoucherOrder;

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
 * ExportVoucherBaseParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ExportVoucherBaseParameters {
  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private ExportVoucherOrder order;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<ExportVoucherFields> fields;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Object filters;

  public ExportVoucherBaseParameters() {
  }

  public ExportVoucherBaseParameters order(ExportVoucherOrder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public ExportVoucherOrder getOrder() {
    return order;
  }


  public void setOrder(ExportVoucherOrder order) {
    this.order = order;
  }


  public ExportVoucherBaseParameters fields(List<ExportVoucherFields> fields) {
    
    this.fields = fields;
    return this;
  }

  public ExportVoucherBaseParameters addFieldsItem(ExportVoucherFields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Array of strings containing the data in the export. These fields define the headers in the CSV file.
   * @return fields
  **/
  @javax.annotation.Nullable
  public List<ExportVoucherFields> getFields() {
    return fields;
  }


  public void setFields(List<ExportVoucherFields> fields) {
    this.fields = fields;
  }


  public ExportVoucherBaseParameters filters(Object filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Allowed additional properties must start with \&quot;metadata.\&quot; or \&quot;redemption.\&quot;
   * @return filters
  **/
  @javax.annotation.Nullable
  public Object getFilters() {
    return filters;
  }


  public void setFilters(Object filters) {
    this.filters = filters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportVoucherBaseParameters exportVoucherBaseParameters = (ExportVoucherBaseParameters) o;
    return Objects.equals(this.order, exportVoucherBaseParameters.order) &&
        Objects.equals(this.fields, exportVoucherBaseParameters.fields) &&
        Objects.equals(this.filters, exportVoucherBaseParameters.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, fields, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportVoucherBaseParameters {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("fields");
    openapiFields.add("filters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportVoucherBaseParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportVoucherBaseParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportVoucherBaseParameters is not found in the empty JSON string", ExportVoucherBaseParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportVoucherBaseParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportVoucherBaseParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull() && !jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportVoucherBaseParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportVoucherBaseParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportVoucherBaseParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportVoucherBaseParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportVoucherBaseParameters>() {
           @Override
           public void write(JsonWriter out, ExportVoucherBaseParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportVoucherBaseParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportVoucherBaseParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportVoucherBaseParameters
  * @throws IOException if the JSON string is invalid with respect to ExportVoucherBaseParameters
  */
  public static ExportVoucherBaseParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportVoucherBaseParameters.class);
  }

 /**
  * Convert an instance of ExportVoucherBaseParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

