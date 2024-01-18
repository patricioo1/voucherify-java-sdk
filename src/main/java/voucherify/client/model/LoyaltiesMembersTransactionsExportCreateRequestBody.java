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
import voucherify.client.model.LoyaltiesMembersTransactionsExportCreateRequestBodyParameters;

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
 * Request body schema for **POST** &#x60;/loyalties/members/{memberId}/transactions/export&#x60; and for **POST** &#x60;/loyalties/{campaignId}/members/{memberId}/transactions/export&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesMembersTransactionsExportCreateRequestBody {
  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private LoyaltiesMembersTransactionsExportCreateRequestBodyParameters parameters;

  public LoyaltiesMembersTransactionsExportCreateRequestBody() {
  }

  public LoyaltiesMembersTransactionsExportCreateRequestBody parameters(LoyaltiesMembersTransactionsExportCreateRequestBodyParameters parameters) {
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public LoyaltiesMembersTransactionsExportCreateRequestBodyParameters getParameters() {
    return parameters;
  }


  public void setParameters(LoyaltiesMembersTransactionsExportCreateRequestBodyParameters parameters) {
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
    LoyaltiesMembersTransactionsExportCreateRequestBody loyaltiesMembersTransactionsExportCreateRequestBody = (LoyaltiesMembersTransactionsExportCreateRequestBody) o;
    return Objects.equals(this.parameters, loyaltiesMembersTransactionsExportCreateRequestBody.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltiesMembersTransactionsExportCreateRequestBody {\n");
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
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesMembersTransactionsExportCreateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltiesMembersTransactionsExportCreateRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltiesMembersTransactionsExportCreateRequestBody is not found in the empty JSON string", LoyaltiesMembersTransactionsExportCreateRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltiesMembersTransactionsExportCreateRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltiesMembersTransactionsExportCreateRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `parameters`
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        LoyaltiesMembersTransactionsExportCreateRequestBodyParameters.validateJsonElement(jsonObj.get("parameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesMembersTransactionsExportCreateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesMembersTransactionsExportCreateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesMembersTransactionsExportCreateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesMembersTransactionsExportCreateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesMembersTransactionsExportCreateRequestBody>() {
           @Override
           public void write(JsonWriter out, LoyaltiesMembersTransactionsExportCreateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesMembersTransactionsExportCreateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesMembersTransactionsExportCreateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesMembersTransactionsExportCreateRequestBody
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesMembersTransactionsExportCreateRequestBody
  */
  public static LoyaltiesMembersTransactionsExportCreateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesMembersTransactionsExportCreateRequestBody.class);
  }

 /**
  * Convert an instance of LoyaltiesMembersTransactionsExportCreateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

