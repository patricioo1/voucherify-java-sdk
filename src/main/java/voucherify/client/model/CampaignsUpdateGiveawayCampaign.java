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
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.CampaignBaseValidityTimeframe;

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
 * CampaignsUpdateGiveawayCampaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignsUpdateGiveawayCampaign {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private CampaignBaseValidityTimeframe validityTimeframe;

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<Integer> validityDayOfWeek;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_UNSET_METADATA_FIELDS = "unset_metadata_fields";
  @SerializedName(SERIALIZED_NAME_UNSET_METADATA_FIELDS)
  private List<String> unsetMetadataFields;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_ACTIVITY_DURATION_AFTER_PUBLISHING = "activity_duration_after_publishing";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_DURATION_AFTER_PUBLISHING)
  private String activityDurationAfterPublishing;

  public static final String SERIALIZED_NAME_JOIN_ONCE = "join_once";
  @SerializedName(SERIALIZED_NAME_JOIN_ONCE)
  private Boolean joinOnce;

  public static final String SERIALIZED_NAME_AUTO_JOIN = "auto_join";
  @SerializedName(SERIALIZED_NAME_AUTO_JOIN)
  private Boolean autoJoin;

  /**
   * Defines whether the campaign can be updated with new vouchers after campaign creation.      - &#x60;AUTO_UPDATE&#x60;: By choosing the auto update option you will create a campaign that can be enhanced by new vouchers after the time of creation (e.g. by publish vouchers method).     -  &#x60;STATIC&#x60;: vouchers need to be manually published.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AUTO_UPDATE("AUTO_UPDATE"),
    
    STATIC("STATIC");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_WINNERS_COUNT = "winners_count";
  @SerializedName(SERIALIZED_NAME_WINNERS_COUNT)
  private String winnersCount;

  public static final String SERIALIZED_NAME_UNIQUE_WINNERS_PER_DRAW = "unique_winners_per_draw";
  @SerializedName(SERIALIZED_NAME_UNIQUE_WINNERS_PER_DRAW)
  private String uniqueWinnersPerDraw;

  public static final String SERIALIZED_NAME_UNIQUE_WINNERS = "unique_winners";
  @SerializedName(SERIALIZED_NAME_UNIQUE_WINNERS)
  private String uniqueWinners;

  public CampaignsUpdateGiveawayCampaign() {
  }

  public CampaignsUpdateGiveawayCampaign startDate(OffsetDateTime startDate) {
    
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


  public CampaignsUpdateGiveawayCampaign expirationDate(OffsetDateTime expirationDate) {
    
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


  public CampaignsUpdateGiveawayCampaign validityTimeframe(CampaignBaseValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public CampaignBaseValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(CampaignBaseValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public CampaignsUpdateGiveawayCampaign validityDayOfWeek(List<Integer> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public CampaignsUpdateGiveawayCampaign addValidityDayOfWeekItem(Integer validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the campaign is valid.  - &#x60;0&#x60;  Sunday   - &#x60;1&#x60;  Monday   - &#x60;2&#x60;  Tuesday   - &#x60;3&#x60;  Wednesday   - &#x60;4&#x60;  Thursday   - &#x60;5&#x60;  Friday   - &#x60;6&#x60;  Saturday  
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<Integer> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<Integer> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public CampaignsUpdateGiveawayCampaign description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An optional field to keep any extra textual information about the campaign such as a campaign description and details.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CampaignsUpdateGiveawayCampaign category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CampaignsUpdateGiveawayCampaign metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the campaign. A set of key/value pairs that you can attach to a campaign object. It can be useful for storing additional information about the campaign in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public CampaignsUpdateGiveawayCampaign unsetMetadataFields(List<String> unsetMetadataFields) {
    
    this.unsetMetadataFields = unsetMetadataFields;
    return this;
  }

  public CampaignsUpdateGiveawayCampaign addUnsetMetadataFieldsItem(String unsetMetadataFieldsItem) {
    if (this.unsetMetadataFields == null) {
      this.unsetMetadataFields = new ArrayList<>();
    }
    this.unsetMetadataFields.add(unsetMetadataFieldsItem);
    return this;
  }

   /**
   * Determine which metadata should be removed from campaign.
   * @return unsetMetadataFields
  **/
  @javax.annotation.Nullable
  public List<String> getUnsetMetadataFields() {
    return unsetMetadataFields;
  }


  public void setUnsetMetadataFields(List<String> unsetMetadataFields) {
    this.unsetMetadataFields = unsetMetadataFields;
  }


  public CampaignsUpdateGiveawayCampaign categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Unique category ID that this campaign belongs to. Either pass this parameter OR the &#x60;category&#x60;.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public CampaignsUpdateGiveawayCampaign activityDurationAfterPublishing(String activityDurationAfterPublishing) {
    
    this.activityDurationAfterPublishing = activityDurationAfterPublishing;
    return this;
  }

   /**
   * Defines the amount of time the campaign will be active in ISO 8601 format after publishing. For example, a campaign with a &#x60;duration&#x60; of &#x60;P24D&#x60; will be valid for a duration of 24 days.
   * @return activityDurationAfterPublishing
  **/
  @javax.annotation.Nullable
  public String getActivityDurationAfterPublishing() {
    return activityDurationAfterPublishing;
  }


  public void setActivityDurationAfterPublishing(String activityDurationAfterPublishing) {
    this.activityDurationAfterPublishing = activityDurationAfterPublishing;
  }


  public CampaignsUpdateGiveawayCampaign joinOnce(Boolean joinOnce) {
    
    this.joinOnce = joinOnce;
    return this;
  }

   /**
   * If this value is set to &#x60;true&#x60;, customers will be able to join the campaign only once.
   * @return joinOnce
  **/
  @javax.annotation.Nullable
  public Boolean getJoinOnce() {
    return joinOnce;
  }


  public void setJoinOnce(Boolean joinOnce) {
    this.joinOnce = joinOnce;
  }


  public CampaignsUpdateGiveawayCampaign autoJoin(Boolean autoJoin) {
    
    this.autoJoin = autoJoin;
    return this;
  }

   /**
   * Indicates whether customers will be able to auto-join a loyalty campaign if any earning rule is fulfilled.
   * @return autoJoin
  **/
  @javax.annotation.Nullable
  public Boolean getAutoJoin() {
    return autoJoin;
  }


  public void setAutoJoin(Boolean autoJoin) {
    this.autoJoin = autoJoin;
  }


  public CampaignsUpdateGiveawayCampaign type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines whether the campaign can be updated with new vouchers after campaign creation.      - &#x60;AUTO_UPDATE&#x60;: By choosing the auto update option you will create a campaign that can be enhanced by new vouchers after the time of creation (e.g. by publish vouchers method).     -  &#x60;STATIC&#x60;: vouchers need to be manually published.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CampaignsUpdateGiveawayCampaign winnersCount(String winnersCount) {
    
    this.winnersCount = winnersCount;
    return this;
  }

   /**
   * It represents the total number of winners in a lucky draw.
   * @return winnersCount
  **/
  @javax.annotation.Nullable
  public String getWinnersCount() {
    return winnersCount;
  }


  public void setWinnersCount(String winnersCount) {
    this.winnersCount = winnersCount;
  }


  public CampaignsUpdateGiveawayCampaign uniqueWinnersPerDraw(String uniqueWinnersPerDraw) {
    
    this.uniqueWinnersPerDraw = uniqueWinnersPerDraw;
    return this;
  }

   /**
   * It indicates whether each winner in a draw is unique or not.
   * @return uniqueWinnersPerDraw
  **/
  @javax.annotation.Nullable
  public String getUniqueWinnersPerDraw() {
    return uniqueWinnersPerDraw;
  }


  public void setUniqueWinnersPerDraw(String uniqueWinnersPerDraw) {
    this.uniqueWinnersPerDraw = uniqueWinnersPerDraw;
  }


  public CampaignsUpdateGiveawayCampaign uniqueWinners(String uniqueWinners) {
    
    this.uniqueWinners = uniqueWinners;
    return this;
  }

   /**
   * Specifies whether each participant can win only once across multiple draws.
   * @return uniqueWinners
  **/
  @javax.annotation.Nullable
  public String getUniqueWinners() {
    return uniqueWinners;
  }


  public void setUniqueWinners(String uniqueWinners) {
    this.uniqueWinners = uniqueWinners;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsUpdateGiveawayCampaign campaignsUpdateGiveawayCampaign = (CampaignsUpdateGiveawayCampaign) o;
    return Objects.equals(this.startDate, campaignsUpdateGiveawayCampaign.startDate) &&
        Objects.equals(this.expirationDate, campaignsUpdateGiveawayCampaign.expirationDate) &&
        Objects.equals(this.validityTimeframe, campaignsUpdateGiveawayCampaign.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, campaignsUpdateGiveawayCampaign.validityDayOfWeek) &&
        Objects.equals(this.description, campaignsUpdateGiveawayCampaign.description) &&
        Objects.equals(this.category, campaignsUpdateGiveawayCampaign.category) &&
        Objects.equals(this.metadata, campaignsUpdateGiveawayCampaign.metadata) &&
        Objects.equals(this.unsetMetadataFields, campaignsUpdateGiveawayCampaign.unsetMetadataFields) &&
        Objects.equals(this.categoryId, campaignsUpdateGiveawayCampaign.categoryId) &&
        Objects.equals(this.activityDurationAfterPublishing, campaignsUpdateGiveawayCampaign.activityDurationAfterPublishing) &&
        Objects.equals(this.joinOnce, campaignsUpdateGiveawayCampaign.joinOnce) &&
        Objects.equals(this.autoJoin, campaignsUpdateGiveawayCampaign.autoJoin) &&
        Objects.equals(this.type, campaignsUpdateGiveawayCampaign.type) &&
        Objects.equals(this.winnersCount, campaignsUpdateGiveawayCampaign.winnersCount) &&
        Objects.equals(this.uniqueWinnersPerDraw, campaignsUpdateGiveawayCampaign.uniqueWinnersPerDraw) &&
        Objects.equals(this.uniqueWinners, campaignsUpdateGiveawayCampaign.uniqueWinners);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, expirationDate, validityTimeframe, validityDayOfWeek, description, category, metadata, unsetMetadataFields, categoryId, activityDurationAfterPublishing, joinOnce, autoJoin, type, winnersCount, uniqueWinnersPerDraw, uniqueWinners);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsUpdateGiveawayCampaign {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    unsetMetadataFields: ").append(toIndentedString(unsetMetadataFields)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    activityDurationAfterPublishing: ").append(toIndentedString(activityDurationAfterPublishing)).append("\n");
    sb.append("    joinOnce: ").append(toIndentedString(joinOnce)).append("\n");
    sb.append("    autoJoin: ").append(toIndentedString(autoJoin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    winnersCount: ").append(toIndentedString(winnersCount)).append("\n");
    sb.append("    uniqueWinnersPerDraw: ").append(toIndentedString(uniqueWinnersPerDraw)).append("\n");
    sb.append("    uniqueWinners: ").append(toIndentedString(uniqueWinners)).append("\n");
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
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("description");
    openapiFields.add("category");
    openapiFields.add("metadata");
    openapiFields.add("unset_metadata_fields");
    openapiFields.add("category_id");
    openapiFields.add("activity_duration_after_publishing");
    openapiFields.add("join_once");
    openapiFields.add("auto_join");
    openapiFields.add("type");
    openapiFields.add("winners_count");
    openapiFields.add("unique_winners_per_draw");
    openapiFields.add("unique_winners");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignsUpdateGiveawayCampaign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignsUpdateGiveawayCampaign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignsUpdateGiveawayCampaign is not found in the empty JSON string", CampaignsUpdateGiveawayCampaign.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CampaignsUpdateGiveawayCampaign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CampaignsUpdateGiveawayCampaign` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `validity_timeframe`
      if (jsonObj.get("validity_timeframe") != null && !jsonObj.get("validity_timeframe").isJsonNull()) {
        CampaignBaseValidityTimeframe.validateJsonElement(jsonObj.get("validity_timeframe"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validity_day_of_week") != null && !jsonObj.get("validity_day_of_week").isJsonNull() && !jsonObj.get("validity_day_of_week").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validity_day_of_week` to be an array in the JSON string but got `%s`", jsonObj.get("validity_day_of_week").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("unset_metadata_fields") != null && !jsonObj.get("unset_metadata_fields").isJsonNull() && !jsonObj.get("unset_metadata_fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unset_metadata_fields` to be an array in the JSON string but got `%s`", jsonObj.get("unset_metadata_fields").toString()));
      }
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if ((jsonObj.get("activity_duration_after_publishing") != null && !jsonObj.get("activity_duration_after_publishing").isJsonNull()) && !jsonObj.get("activity_duration_after_publishing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_duration_after_publishing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_duration_after_publishing").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("winners_count") != null && !jsonObj.get("winners_count").isJsonNull()) && !jsonObj.get("winners_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `winners_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("winners_count").toString()));
      }
      if ((jsonObj.get("unique_winners_per_draw") != null && !jsonObj.get("unique_winners_per_draw").isJsonNull()) && !jsonObj.get("unique_winners_per_draw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_winners_per_draw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_winners_per_draw").toString()));
      }
      if ((jsonObj.get("unique_winners") != null && !jsonObj.get("unique_winners").isJsonNull()) && !jsonObj.get("unique_winners").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_winners` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_winners").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignsUpdateGiveawayCampaign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignsUpdateGiveawayCampaign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignsUpdateGiveawayCampaign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignsUpdateGiveawayCampaign.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignsUpdateGiveawayCampaign>() {
           @Override
           public void write(JsonWriter out, CampaignsUpdateGiveawayCampaign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignsUpdateGiveawayCampaign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignsUpdateGiveawayCampaign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsUpdateGiveawayCampaign
  * @throws IOException if the JSON string is invalid with respect to CampaignsUpdateGiveawayCampaign
  */
  public static CampaignsUpdateGiveawayCampaign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsUpdateGiveawayCampaign.class);
  }

 /**
  * Convert an instance of CampaignsUpdateGiveawayCampaign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

