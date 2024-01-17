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
import voucherify.client.model.ReferralProgramCustomEvent;
import voucherify.client.model.ReferralProgramRefereeReward;

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
 * Defines the referee reward and the way a referral is triggered. Context: &#x60;REFERRAL_PROGRAM&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReferralProgram {
  /**
   * Define how a referral is triggered.
   */
  @JsonAdapter(ConversionEventTypeEnum.Adapter.class)
  public enum ConversionEventTypeEnum {
    REDEMPTION("redemption"),
    
    CUSTOM_EVENT("custom_event");

    private String value;

    ConversionEventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConversionEventTypeEnum fromValue(String value) {
      for (ConversionEventTypeEnum b : ConversionEventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConversionEventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConversionEventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConversionEventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConversionEventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONVERSION_EVENT_TYPE = "conversion_event_type";
  @SerializedName(SERIALIZED_NAME_CONVERSION_EVENT_TYPE)
  private ConversionEventTypeEnum conversionEventType;

  public static final String SERIALIZED_NAME_CUSTOM_EVENT = "custom_event";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EVENT)
  private ReferralProgramCustomEvent customEvent;

  public static final String SERIALIZED_NAME_REFEREE_REWARD = "referee_reward";
  @SerializedName(SERIALIZED_NAME_REFEREE_REWARD)
  private ReferralProgramRefereeReward refereeReward;

  public ReferralProgram() {
  }

  public ReferralProgram conversionEventType(ConversionEventTypeEnum conversionEventType) {
    
    this.conversionEventType = conversionEventType;
    return this;
  }

   /**
   * Define how a referral is triggered.
   * @return conversionEventType
  **/
  @javax.annotation.Nullable
  public ConversionEventTypeEnum getConversionEventType() {
    return conversionEventType;
  }


  public void setConversionEventType(ConversionEventTypeEnum conversionEventType) {
    this.conversionEventType = conversionEventType;
  }


  public ReferralProgram customEvent(ReferralProgramCustomEvent customEvent) {
    
    this.customEvent = customEvent;
    return this;
  }

   /**
   * Get customEvent
   * @return customEvent
  **/
  @javax.annotation.Nullable
  public ReferralProgramCustomEvent getCustomEvent() {
    return customEvent;
  }


  public void setCustomEvent(ReferralProgramCustomEvent customEvent) {
    this.customEvent = customEvent;
  }


  public ReferralProgram refereeReward(ReferralProgramRefereeReward refereeReward) {
    
    this.refereeReward = refereeReward;
    return this;
  }

   /**
   * Get refereeReward
   * @return refereeReward
  **/
  @javax.annotation.Nullable
  public ReferralProgramRefereeReward getRefereeReward() {
    return refereeReward;
  }


  public void setRefereeReward(ReferralProgramRefereeReward refereeReward) {
    this.refereeReward = refereeReward;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferralProgram referralProgram = (ReferralProgram) o;
    return Objects.equals(this.conversionEventType, referralProgram.conversionEventType) &&
        Objects.equals(this.customEvent, referralProgram.customEvent) &&
        Objects.equals(this.refereeReward, referralProgram.refereeReward);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionEventType, customEvent, refereeReward);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferralProgram {\n");
    sb.append("    conversionEventType: ").append(toIndentedString(conversionEventType)).append("\n");
    sb.append("    customEvent: ").append(toIndentedString(customEvent)).append("\n");
    sb.append("    refereeReward: ").append(toIndentedString(refereeReward)).append("\n");
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
    openapiFields.add("conversion_event_type");
    openapiFields.add("custom_event");
    openapiFields.add("referee_reward");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReferralProgram
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReferralProgram.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReferralProgram is not found in the empty JSON string", ReferralProgram.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReferralProgram.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReferralProgram` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("conversion_event_type") != null && !jsonObj.get("conversion_event_type").isJsonNull()) && !jsonObj.get("conversion_event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversion_event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversion_event_type").toString()));
      }
      // validate the optional field `custom_event`
      if (jsonObj.get("custom_event") != null && !jsonObj.get("custom_event").isJsonNull()) {
        ReferralProgramCustomEvent.validateJsonElement(jsonObj.get("custom_event"));
      }
      // validate the optional field `referee_reward`
      if (jsonObj.get("referee_reward") != null && !jsonObj.get("referee_reward").isJsonNull()) {
        ReferralProgramRefereeReward.validateJsonElement(jsonObj.get("referee_reward"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReferralProgram.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReferralProgram' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReferralProgram> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReferralProgram.class));

       return (TypeAdapter<T>) new TypeAdapter<ReferralProgram>() {
           @Override
           public void write(JsonWriter out, ReferralProgram value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReferralProgram read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReferralProgram given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReferralProgram
  * @throws IOException if the JSON string is invalid with respect to ReferralProgram
  */
  public static ReferralProgram fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReferralProgram.class);
  }

 /**
  * Convert an instance of ReferralProgram to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

