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
import voucherify.client.model.PublicationsListResponseBodyPublicationsItem;

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
 * Response body schema for listing publications using **GET** &#x60;/publications&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PublicationsListResponseBody {
  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "list";

  public static final String SERIALIZED_NAME_DATA_REF = "data_ref";
  @SerializedName(SERIALIZED_NAME_DATA_REF)
  private String dataRef = "publications";

  public static final String SERIALIZED_NAME_PUBLICATIONS = "publications";
  @SerializedName(SERIALIZED_NAME_PUBLICATIONS)
  private List<PublicationsListResponseBodyPublicationsItem> publications = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public PublicationsListResponseBody() {
  }

  public PublicationsListResponseBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by JSON. This object stores information about publications in a dictionary.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public PublicationsListResponseBody dataRef(String dataRef) {
    
    this.dataRef = dataRef;
    return this;
  }

   /**
   * Identifies the name of the attribute that contains the array of publications.
   * @return dataRef
  **/
  @javax.annotation.Nonnull
  public String getDataRef() {
    return dataRef;
  }


  public void setDataRef(String dataRef) {
    this.dataRef = dataRef;
  }


  public PublicationsListResponseBody publications(List<PublicationsListResponseBodyPublicationsItem> publications) {
    
    this.publications = publications;
    return this;
  }

  public PublicationsListResponseBody addPublicationsItem(PublicationsListResponseBodyPublicationsItem publicationsItem) {
    if (this.publications == null) {
      this.publications = new ArrayList<>();
    }
    this.publications.add(publicationsItem);
    return this;
  }

   /**
   * Contains array of publication objects, voucher object will be simplified.
   * @return publications
  **/
  @javax.annotation.Nonnull
  public List<PublicationsListResponseBodyPublicationsItem> getPublications() {
    return publications;
  }


  public void setPublications(List<PublicationsListResponseBodyPublicationsItem> publications) {
    this.publications = publications;
  }


  public PublicationsListResponseBody total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of publications.
   * @return total
  **/
  @javax.annotation.Nonnull
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationsListResponseBody publicationsListResponseBody = (PublicationsListResponseBody) o;
    return Objects.equals(this._object, publicationsListResponseBody._object) &&
        Objects.equals(this.dataRef, publicationsListResponseBody.dataRef) &&
        Objects.equals(this.publications, publicationsListResponseBody.publications) &&
        Objects.equals(this.total, publicationsListResponseBody.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, dataRef, publications, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationsListResponseBody {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    dataRef: ").append(toIndentedString(dataRef)).append("\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("publications");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("data_ref");
    openapiRequiredFields.add("publications");
    openapiRequiredFields.add("total");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PublicationsListResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PublicationsListResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicationsListResponseBody is not found in the empty JSON string", PublicationsListResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PublicationsListResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublicationsListResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PublicationsListResponseBody.openapiRequiredFields) {
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
      if (!jsonObj.get("publications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `publications` to be an array in the JSON string but got `%s`", jsonObj.get("publications").toString()));
      }

      JsonArray jsonArraypublications = jsonObj.getAsJsonArray("publications");
      // validate the required field `publications` (array)
      for (int i = 0; i < jsonArraypublications.size(); i++) {
        PublicationsListResponseBodyPublicationsItem.validateJsonElement(jsonArraypublications.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicationsListResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicationsListResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicationsListResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicationsListResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicationsListResponseBody>() {
           @Override
           public void write(JsonWriter out, PublicationsListResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublicationsListResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PublicationsListResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicationsListResponseBody
  * @throws IOException if the JSON string is invalid with respect to PublicationsListResponseBody
  */
  public static PublicationsListResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicationsListResponseBody.class);
  }

 /**
  * Convert an instance of PublicationsListResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

