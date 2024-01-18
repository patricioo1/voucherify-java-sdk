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
import voucherify.client.model.CampaignLoyaltyCardExpirationRules;

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
 * Schema model for a campaign loyalty card.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignLoyaltyCard {
  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_EXPIRATION_RULES = "expiration_rules";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_RULES)
  private CampaignLoyaltyCardExpirationRules expirationRules;

  public CampaignLoyaltyCard() {
  }

  public CampaignLoyaltyCard points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * The initial number of points to assign to the loyalty card. This is the current loyalty card score i.e. the number of loyalty points on the card.
   * @return points
  **/
  @javax.annotation.Nonnull
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public CampaignLoyaltyCard expirationRules(CampaignLoyaltyCardExpirationRules expirationRules) {
    
    this.expirationRules = expirationRules;
    return this;
  }

   /**
   * Get expirationRules
   * @return expirationRules
  **/
  @javax.annotation.Nullable
  public CampaignLoyaltyCardExpirationRules getExpirationRules() {
    return expirationRules;
  }


  public void setExpirationRules(CampaignLoyaltyCardExpirationRules expirationRules) {
    this.expirationRules = expirationRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignLoyaltyCard campaignLoyaltyCard = (CampaignLoyaltyCard) o;
    return Objects.equals(this.points, campaignLoyaltyCard.points) &&
        Objects.equals(this.expirationRules, campaignLoyaltyCard.expirationRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, expirationRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignLoyaltyCard {\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    expirationRules: ").append(toIndentedString(expirationRules)).append("\n");
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
    openapiFields.add("points");
    openapiFields.add("expiration_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("points");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignLoyaltyCard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignLoyaltyCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignLoyaltyCard is not found in the empty JSON string", CampaignLoyaltyCard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CampaignLoyaltyCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CampaignLoyaltyCard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CampaignLoyaltyCard.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `expiration_rules`
      if (jsonObj.get("expiration_rules") != null && !jsonObj.get("expiration_rules").isJsonNull()) {
        CampaignLoyaltyCardExpirationRules.validateJsonElement(jsonObj.get("expiration_rules"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignLoyaltyCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignLoyaltyCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignLoyaltyCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignLoyaltyCard.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignLoyaltyCard>() {
           @Override
           public void write(JsonWriter out, CampaignLoyaltyCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignLoyaltyCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignLoyaltyCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignLoyaltyCard
  * @throws IOException if the JSON string is invalid with respect to CampaignLoyaltyCard
  */
  public static CampaignLoyaltyCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignLoyaltyCard.class);
  }

 /**
  * Convert an instance of CampaignLoyaltyCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

