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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe;
import voucherify.client.model.ValidityHours;

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
 * RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe validityTimeframe;

  /**
   * Gets or Sets validityDayOfWeek
   */
  @JsonAdapter(ValidityDayOfWeekEnum.Adapter.class)
  public enum ValidityDayOfWeekEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    ValidityDayOfWeekEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidityDayOfWeekEnum fromValue(Integer value) {
      for (ValidityDayOfWeekEnum b : ValidityDayOfWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValidityDayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidityDayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidityDayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ValidityDayOfWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<ValidityDayOfWeekEnum> validityDayOfWeek;

  public static final String SERIALIZED_NAME_VALIDITY_HOURS = "validity_hours";
  @SerializedName(SERIALIZED_NAME_VALIDITY_HOURS)
  private ValidityHours validityHours;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "campaign";

  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign() {
  }

  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique campaign ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is *inactive before* this date. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is *inactive after* this date.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign validityTimeframe(RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign validityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign addValidityDayOfWeekItem(ValidityDayOfWeekEnum validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the campaign is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<ValidityDayOfWeekEnum> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign validityHours(ValidityHours validityHours) {
    
    this.validityHours = validityHours;
    return this;
  }

   /**
   * Get validityHours
   * @return validityHours
  **/
  @javax.annotation.Nullable
  public ValidityHours getValidityHours() {
    return validityHours;
  }


  public void setValidityHours(ValidityHours validityHours) {
    this.validityHours = validityHours;
  }


  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A flag indicating whether the campaign is active or not active. A campaign can be disabled even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60; using the &lt;!-- [Disable Campaign](OpenAPI.json/paths/~1campaigns~1{campaignId}~1disable) --&gt;[Disable Campaign](ref:disable-campaign) endpoint.    - &#x60;true&#x60; indicates an *active* campaign - &#x60;false&#x60; indicates an *inactive* campaign
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Unique category ID that this campaign belongs to.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by the campaign object. This object stores information about the campaign.
   * @return _object
  **/
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign = (RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign) o;
    return Objects.equals(this.id, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.id) &&
        Objects.equals(this.startDate, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.startDate) &&
        Objects.equals(this.expirationDate, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.expirationDate) &&
        Objects.equals(this.validityTimeframe, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.validityDayOfWeek) &&
        Objects.equals(this.validityHours, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.validityHours) &&
        Objects.equals(this.active, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.active) &&
        Objects.equals(this.categoryId, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.categoryId) &&
        Objects.equals(this._object, redemptionsListResponseBodyRedemptionsItemPromotionTierCampaign._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, expirationDate, validityTimeframe, validityDayOfWeek, validityHours, active, categoryId, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    validityHours: ").append(toIndentedString(validityHours)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("validity_hours");
    openapiFields.add("active");
    openapiFields.add("category_id");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign is not found in the empty JSON string", RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `validity_timeframe`
      if (jsonObj.get("validity_timeframe") != null && !jsonObj.get("validity_timeframe").isJsonNull()) {
        RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.validateJsonElement(jsonObj.get("validity_timeframe"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validity_day_of_week") != null && !jsonObj.get("validity_day_of_week").isJsonNull() && !jsonObj.get("validity_day_of_week").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validity_day_of_week` to be an array in the JSON string but got `%s`", jsonObj.get("validity_day_of_week").toString()));
      }
      // validate the optional field `validity_hours`
      if (jsonObj.get("validity_hours") != null && !jsonObj.get("validity_hours").isJsonNull()) {
        ValidityHours.validateJsonElement(jsonObj.get("validity_hours"));
      }
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign>() {
           @Override
           public void write(JsonWriter out, RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign
  * @throws IOException if the JSON string is invalid with respect to RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign
  */
  public static RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign.class);
  }

 /**
  * Convert an instance of RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

