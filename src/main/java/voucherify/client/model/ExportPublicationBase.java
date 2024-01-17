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
import voucherify.client.model.ExportPublicationBaseParameters;

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
 * ExportPublicationBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ExportPublicationBase {
  /**
   * The type of object to be exported.
   */
  @JsonAdapter(ExportedObjectEnum.Adapter.class)
  public enum ExportedObjectEnum {
    PUBLICATION("publication");

    private String value;

    ExportedObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExportedObjectEnum fromValue(String value) {
      for (ExportedObjectEnum b : ExportedObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExportedObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExportedObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExportedObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExportedObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXPORTED_OBJECT = "exported_object";
  @SerializedName(SERIALIZED_NAME_EXPORTED_OBJECT)
  private ExportedObjectEnum exportedObject = ExportedObjectEnum.PUBLICATION;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private ExportPublicationBaseParameters parameters;

  public ExportPublicationBase() {
  }

  public ExportPublicationBase exportedObject(ExportedObjectEnum exportedObject) {
    
    this.exportedObject = exportedObject;
    return this;
  }

   /**
   * The type of object to be exported.
   * @return exportedObject
  **/
  @javax.annotation.Nonnull
  public ExportedObjectEnum getExportedObject() {
    return exportedObject;
  }


  public void setExportedObject(ExportedObjectEnum exportedObject) {
    this.exportedObject = exportedObject;
  }


  public ExportPublicationBase parameters(ExportPublicationBaseParameters parameters) {
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public ExportPublicationBaseParameters getParameters() {
    return parameters;
  }


  public void setParameters(ExportPublicationBaseParameters parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportPublicationBase exportPublicationBase = (ExportPublicationBase) o;
    return Objects.equals(this.exportedObject, exportPublicationBase.exportedObject) &&
        Objects.equals(this.parameters, exportPublicationBase.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportedObject, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportPublicationBase {\n");
    sb.append("    exportedObject: ").append(toIndentedString(exportedObject)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("exported_object");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("exported_object");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportPublicationBase
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportPublicationBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportPublicationBase is not found in the empty JSON string", ExportPublicationBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportPublicationBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportPublicationBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExportPublicationBase.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("exported_object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exported_object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exported_object").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("exported_object");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ExportedObjectEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `exported_object` to be not null");
        }
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Expected the field `exported_object` to be a valid element of ExportedObjectEnum enum got `%s` instead", jsonObj.get("exported_object").toString()));
      }
      // validate the optional field `parameters`
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        ExportPublicationBaseParameters.validateJsonElement(jsonObj.get("parameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportPublicationBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportPublicationBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportPublicationBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportPublicationBase.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportPublicationBase>() {
           @Override
           public void write(JsonWriter out, ExportPublicationBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportPublicationBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportPublicationBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportPublicationBase
  * @throws IOException if the JSON string is invalid with respect to ExportPublicationBase
  */
  public static ExportPublicationBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportPublicationBase.class);
  }

 /**
  * Convert an instance of ExportPublicationBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

