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
import voucherify.client.model.Redemption;
import voucherify.client.model.ValidationsRedeemableInapplicable;
import voucherify.client.model.ValidationsRedeemableSkipped;

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
 * Response body schema for **POST** &#x60;/redemptions&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionsRedeemResponseBody {
  public static final String SERIALIZED_NAME_REDEMPTIONS = "redemptions";
  @SerializedName(SERIALIZED_NAME_REDEMPTIONS)
  private List<Redemption> redemptions;

  public static final String SERIALIZED_NAME_PARENT_REDEMPTION = "parent_redemption";
  @SerializedName(SERIALIZED_NAME_PARENT_REDEMPTION)
  private Redemption parentRedemption;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculated order;

  public static final String SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES = "inapplicable_redeemables";
  @SerializedName(SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES)
  private List<ValidationsRedeemableInapplicable> inapplicableRedeemables;

  public static final String SERIALIZED_NAME_SKIPPED_REDEEMABLES = "skipped_redeemables";
  @SerializedName(SERIALIZED_NAME_SKIPPED_REDEEMABLES)
  private List<ValidationsRedeemableSkipped> skippedRedeemables;

  public RedemptionsRedeemResponseBody() {
  }

  public RedemptionsRedeemResponseBody redemptions(List<Redemption> redemptions) {
    
    this.redemptions = redemptions;
    return this;
  }

  public RedemptionsRedeemResponseBody addRedemptionsItem(Redemption redemptionsItem) {
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
  public List<Redemption> getRedemptions() {
    return redemptions;
  }


  public void setRedemptions(List<Redemption> redemptions) {
    this.redemptions = redemptions;
  }


  public RedemptionsRedeemResponseBody parentRedemption(Redemption parentRedemption) {
    
    this.parentRedemption = parentRedemption;
    return this;
  }

   /**
   * Get parentRedemption
   * @return parentRedemption
  **/
  @javax.annotation.Nullable
  public Redemption getParentRedemption() {
    return parentRedemption;
  }


  public void setParentRedemption(Redemption parentRedemption) {
    this.parentRedemption = parentRedemption;
  }


  public RedemptionsRedeemResponseBody order(OrderCalculated order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public OrderCalculated getOrder() {
    return order;
  }


  public void setOrder(OrderCalculated order) {
    this.order = order;
  }


  public RedemptionsRedeemResponseBody inapplicableRedeemables(List<ValidationsRedeemableInapplicable> inapplicableRedeemables) {
    
    this.inapplicableRedeemables = inapplicableRedeemables;
    return this;
  }

  public RedemptionsRedeemResponseBody addInapplicableRedeemablesItem(ValidationsRedeemableInapplicable inapplicableRedeemablesItem) {
    if (this.inapplicableRedeemables == null) {
      this.inapplicableRedeemables = new ArrayList<>();
    }
    this.inapplicableRedeemables.add(inapplicableRedeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each inapplicable redeemable.
   * @return inapplicableRedeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableInapplicable> getInapplicableRedeemables() {
    return inapplicableRedeemables;
  }


  public void setInapplicableRedeemables(List<ValidationsRedeemableInapplicable> inapplicableRedeemables) {
    this.inapplicableRedeemables = inapplicableRedeemables;
  }


  public RedemptionsRedeemResponseBody skippedRedeemables(List<ValidationsRedeemableSkipped> skippedRedeemables) {
    
    this.skippedRedeemables = skippedRedeemables;
    return this;
  }

  public RedemptionsRedeemResponseBody addSkippedRedeemablesItem(ValidationsRedeemableSkipped skippedRedeemablesItem) {
    if (this.skippedRedeemables == null) {
      this.skippedRedeemables = new ArrayList<>();
    }
    this.skippedRedeemables.add(skippedRedeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each redeemable. If a redeemable can be applied, the API returns &#x60;\&quot;status\&quot;: \&quot;APPLICABLE\&quot;&#x60;.
   * @return skippedRedeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableSkipped> getSkippedRedeemables() {
    return skippedRedeemables;
  }


  public void setSkippedRedeemables(List<ValidationsRedeemableSkipped> skippedRedeemables) {
    this.skippedRedeemables = skippedRedeemables;
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
   * @return the RedemptionsRedeemResponseBody instance itself
   */
  public RedemptionsRedeemResponseBody putAdditionalProperty(String key, Object value) {
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
    RedemptionsRedeemResponseBody redemptionsRedeemResponseBody = (RedemptionsRedeemResponseBody) o;
    return Objects.equals(this.redemptions, redemptionsRedeemResponseBody.redemptions) &&
        Objects.equals(this.parentRedemption, redemptionsRedeemResponseBody.parentRedemption) &&
        Objects.equals(this.order, redemptionsRedeemResponseBody.order) &&
        Objects.equals(this.inapplicableRedeemables, redemptionsRedeemResponseBody.inapplicableRedeemables) &&
        Objects.equals(this.skippedRedeemables, redemptionsRedeemResponseBody.skippedRedeemables)&&
        Objects.equals(this.additionalProperties, redemptionsRedeemResponseBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redemptions, parentRedemption, order, inapplicableRedeemables, skippedRedeemables, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionsRedeemResponseBody {\n");
    sb.append("    redemptions: ").append(toIndentedString(redemptions)).append("\n");
    sb.append("    parentRedemption: ").append(toIndentedString(parentRedemption)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    inapplicableRedeemables: ").append(toIndentedString(inapplicableRedeemables)).append("\n");
    sb.append("    skippedRedeemables: ").append(toIndentedString(skippedRedeemables)).append("\n");
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
    openapiFields.add("redemptions");
    openapiFields.add("parent_redemption");
    openapiFields.add("order");
    openapiFields.add("inapplicable_redeemables");
    openapiFields.add("skipped_redeemables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RedemptionsRedeemResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedemptionsRedeemResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedemptionsRedeemResponseBody is not found in the empty JSON string", RedemptionsRedeemResponseBody.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("redemptions") != null && !jsonObj.get("redemptions").isJsonNull()) {
        JsonArray jsonArrayredemptions = jsonObj.getAsJsonArray("redemptions");
        if (jsonArrayredemptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("redemptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `redemptions` to be an array in the JSON string but got `%s`", jsonObj.get("redemptions").toString()));
          }

          // validate the optional field `redemptions` (array)
          for (int i = 0; i < jsonArrayredemptions.size(); i++) {
            Redemption.validateJsonElement(jsonArrayredemptions.get(i));
          };
        }
      }
      // validate the optional field `parent_redemption`
      if (jsonObj.get("parent_redemption") != null && !jsonObj.get("parent_redemption").isJsonNull()) {
        Redemption.validateJsonElement(jsonObj.get("parent_redemption"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        OrderCalculated.validateJsonElement(jsonObj.get("order"));
      }
      if (jsonObj.get("inapplicable_redeemables") != null && !jsonObj.get("inapplicable_redeemables").isJsonNull()) {
        JsonArray jsonArrayinapplicableRedeemables = jsonObj.getAsJsonArray("inapplicable_redeemables");
        if (jsonArrayinapplicableRedeemables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inapplicable_redeemables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inapplicable_redeemables` to be an array in the JSON string but got `%s`", jsonObj.get("inapplicable_redeemables").toString()));
          }

          // validate the optional field `inapplicable_redeemables` (array)
          for (int i = 0; i < jsonArrayinapplicableRedeemables.size(); i++) {
            ValidationsRedeemableInapplicable.validateJsonElement(jsonArrayinapplicableRedeemables.get(i));
          };
        }
      }
      if (jsonObj.get("skipped_redeemables") != null && !jsonObj.get("skipped_redeemables").isJsonNull()) {
        JsonArray jsonArrayskippedRedeemables = jsonObj.getAsJsonArray("skipped_redeemables");
        if (jsonArrayskippedRedeemables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skipped_redeemables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skipped_redeemables` to be an array in the JSON string but got `%s`", jsonObj.get("skipped_redeemables").toString()));
          }

          // validate the optional field `skipped_redeemables` (array)
          for (int i = 0; i < jsonArrayskippedRedeemables.size(); i++) {
            ValidationsRedeemableSkipped.validateJsonElement(jsonArrayskippedRedeemables.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionsRedeemResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionsRedeemResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionsRedeemResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionsRedeemResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionsRedeemResponseBody>() {
           @Override
           public void write(JsonWriter out, RedemptionsRedeemResponseBody value) throws IOException {
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
           public RedemptionsRedeemResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RedemptionsRedeemResponseBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RedemptionsRedeemResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsRedeemResponseBody
  * @throws IOException if the JSON string is invalid with respect to RedemptionsRedeemResponseBody
  */
  public static RedemptionsRedeemResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsRedeemResponseBody.class);
  }

 /**
  * Convert an instance of RedemptionsRedeemResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

