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
 * RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe {
  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe() {
  }

  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe interval(String interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Defines the intervening time between two time points in ISO 8601 format, expressed as a duration. For example, a campaign with an &#x60;interval&#x60; of &#x60;P2D&#x60; will be active every other day.
   * @return interval
  **/
  @javax.annotation.Nullable
  public String getInterval() {
    return interval;
  }


  public void setInterval(String interval) {
    this.interval = interval;
  }


  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Defines the amount of time the campaign will be active in ISO 8601 format. For example, a campaign with a &#x60;duration&#x60; of &#x60;P1D&#x60; will be valid for a duration of one day.
   * @return duration
  **/
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe redemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe = (RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe) o;
    return Objects.equals(this.interval, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.interval) &&
        Objects.equals(this.duration, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
    openapiFields.add("interval");
    openapiFields.add("duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe is not found in the empty JSON string", RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) && !jsonObj.get("interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interval").toString()));
      }
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe>() {
           @Override
           public void write(JsonWriter out, RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe
  * @throws IOException if the JSON string is invalid with respect to RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe
  */
  public static RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.class);
  }

 /**
  * Convert an instance of RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

