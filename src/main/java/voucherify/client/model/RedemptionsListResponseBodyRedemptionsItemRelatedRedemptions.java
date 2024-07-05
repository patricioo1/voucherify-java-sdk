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
import voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRedemptionsItem;
import voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRollbacksItem;

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
 * RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions {
  public static final String SERIALIZED_NAME_ROLLBACKS = "rollbacks";
  @SerializedName(SERIALIZED_NAME_ROLLBACKS)
  private List<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRollbacksItem> rollbacks;

  public static final String SERIALIZED_NAME_REDEMPTIONS = "redemptions";
  @SerializedName(SERIALIZED_NAME_REDEMPTIONS)
  private List<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRedemptionsItem> redemptions;

  public RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions() {
  }

  public RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions rollbacks(List<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRollbacksItem> rollbacks) {
    
    this.rollbacks = rollbacks;
    return this;
  }

  public RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions addRollbacksItem(RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRollbacksItem rollbacksItem) {
    if (this.rollbacks == null) {
      this.rollbacks = new ArrayList<>();
    }
    this.rollbacks.add(rollbacksItem);
    return this;
  }

   /**
   * Get rollbacks
   * @return rollbacks
  **/
  @javax.annotation.Nullable
  public List<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRollbacksItem> getRollbacks() {
    return rollbacks;
  }


  public void setRollbacks(List<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRollbacksItem> rollbacks) {
    this.rollbacks = rollbacks;
  }


  public RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions redemptions(List<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRedemptionsItem> redemptions) {
    
    this.redemptions = redemptions;
    return this;
  }

  public RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions addRedemptionsItem(RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRedemptionsItem redemptionsItem) {
    if (this.redemptions == null) {
      this.redemptions = new ArrayList<>();
    }
    this.redemptions.add(redemptionsItem);
    return this;
  }

   /**
   * Get redemptions
   * @return redemptions
  **/
  @javax.annotation.Nullable
  public List<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRedemptionsItem> getRedemptions() {
    return redemptions;
  }


  public void setRedemptions(List<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRedemptionsItem> redemptions) {
    this.redemptions = redemptions;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions instance itself
   */
  public RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions redemptionsListResponseBodyRedemptionsItemRelatedRedemptions = (RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions) o;
    return Objects.equals(this.rollbacks, redemptionsListResponseBodyRedemptionsItemRelatedRedemptions.rollbacks) &&
        Objects.equals(this.redemptions, redemptionsListResponseBodyRedemptionsItemRelatedRedemptions.redemptions)&&
        Objects.equals(this.additionalProperties, redemptionsListResponseBodyRedemptionsItemRelatedRedemptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollbacks, redemptions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions {\n");
    sb.append("    rollbacks: ").append(toIndentedString(rollbacks)).append("\n");
    sb.append("    redemptions: ").append(toIndentedString(redemptions)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("rollbacks");
    openapiFields.add("redemptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions is not found in the empty JSON string", RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("rollbacks") != null && !jsonObj.get("rollbacks").isJsonNull()) {
        JsonArray jsonArrayrollbacks = jsonObj.getAsJsonArray("rollbacks");
        if (jsonArrayrollbacks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rollbacks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rollbacks` to be an array in the JSON string but got `%s`", jsonObj.get("rollbacks").toString()));
          }

          // validate the optional field `rollbacks` (array)
          for (int i = 0; i < jsonArrayrollbacks.size(); i++) {
            RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRollbacksItem.validateJsonElement(jsonArrayrollbacks.get(i));
          };
        }
      }
      if (jsonObj.get("redemptions") != null && !jsonObj.get("redemptions").isJsonNull()) {
        JsonArray jsonArrayredemptions = jsonObj.getAsJsonArray("redemptions");
        if (jsonArrayredemptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("redemptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `redemptions` to be an array in the JSON string but got `%s`", jsonObj.get("redemptions").toString()));
          }

          // validate the optional field `redemptions` (array)
          for (int i = 0; i < jsonArrayredemptions.size(); i++) {
            RedemptionsListResponseBodyRedemptionsItemRelatedRedemptionsRedemptionsItem.validateJsonElement(jsonArrayredemptions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions>() {
           @Override
           public void write(JsonWriter out, RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions
  * @throws IOException if the JSON string is invalid with respect to RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions
  */
  public static RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions.class);
  }

 /**
  * Convert an instance of RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

