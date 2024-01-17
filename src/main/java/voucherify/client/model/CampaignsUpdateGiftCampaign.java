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
import voucherify.client.model.Gift;

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
 * CampaignsUpdateGiftCampaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignsUpdateGiftCampaign {
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

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private Gift gift;

  public CampaignsUpdateGiftCampaign() {
  }

  public CampaignsUpdateGiftCampaign startDate(OffsetDateTime startDate) {
    
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


  public CampaignsUpdateGiftCampaign expirationDate(OffsetDateTime expirationDate) {
    
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


  public CampaignsUpdateGiftCampaign validityTimeframe(CampaignBaseValidityTimeframe validityTimeframe) {
    
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


  public CampaignsUpdateGiftCampaign validityDayOfWeek(List<Integer> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public CampaignsUpdateGiftCampaign addValidityDayOfWeekItem(Integer validityDayOfWeekItem) {
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


  public CampaignsUpdateGiftCampaign description(String description) {
    
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


  public CampaignsUpdateGiftCampaign category(String category) {
    
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


  public CampaignsUpdateGiftCampaign metadata(Object metadata) {
    
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


  public CampaignsUpdateGiftCampaign unsetMetadataFields(List<String> unsetMetadataFields) {
    
    this.unsetMetadataFields = unsetMetadataFields;
    return this;
  }

  public CampaignsUpdateGiftCampaign addUnsetMetadataFieldsItem(String unsetMetadataFieldsItem) {
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


  public CampaignsUpdateGiftCampaign categoryId(String categoryId) {
    
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


  public CampaignsUpdateGiftCampaign activityDurationAfterPublishing(String activityDurationAfterPublishing) {
    
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


  public CampaignsUpdateGiftCampaign joinOnce(Boolean joinOnce) {
    
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


  public CampaignsUpdateGiftCampaign autoJoin(Boolean autoJoin) {
    
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


  public CampaignsUpdateGiftCampaign type(TypeEnum type) {
    
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


  public CampaignsUpdateGiftCampaign gift(Gift gift) {
    
    this.gift = gift;
    return this;
  }

   /**
   * Get gift
   * @return gift
  **/
  @javax.annotation.Nullable
  public Gift getGift() {
    return gift;
  }


  public void setGift(Gift gift) {
    this.gift = gift;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsUpdateGiftCampaign campaignsUpdateGiftCampaign = (CampaignsUpdateGiftCampaign) o;
    return Objects.equals(this.startDate, campaignsUpdateGiftCampaign.startDate) &&
        Objects.equals(this.expirationDate, campaignsUpdateGiftCampaign.expirationDate) &&
        Objects.equals(this.validityTimeframe, campaignsUpdateGiftCampaign.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, campaignsUpdateGiftCampaign.validityDayOfWeek) &&
        Objects.equals(this.description, campaignsUpdateGiftCampaign.description) &&
        Objects.equals(this.category, campaignsUpdateGiftCampaign.category) &&
        Objects.equals(this.metadata, campaignsUpdateGiftCampaign.metadata) &&
        Objects.equals(this.unsetMetadataFields, campaignsUpdateGiftCampaign.unsetMetadataFields) &&
        Objects.equals(this.categoryId, campaignsUpdateGiftCampaign.categoryId) &&
        Objects.equals(this.activityDurationAfterPublishing, campaignsUpdateGiftCampaign.activityDurationAfterPublishing) &&
        Objects.equals(this.joinOnce, campaignsUpdateGiftCampaign.joinOnce) &&
        Objects.equals(this.autoJoin, campaignsUpdateGiftCampaign.autoJoin) &&
        Objects.equals(this.type, campaignsUpdateGiftCampaign.type) &&
        Objects.equals(this.gift, campaignsUpdateGiftCampaign.gift);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, expirationDate, validityTimeframe, validityDayOfWeek, description, category, metadata, unsetMetadataFields, categoryId, activityDurationAfterPublishing, joinOnce, autoJoin, type, gift);
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
    sb.append("class CampaignsUpdateGiftCampaign {\n");
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
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
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
    openapiFields.add("gift");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignsUpdateGiftCampaign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignsUpdateGiftCampaign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignsUpdateGiftCampaign is not found in the empty JSON string", CampaignsUpdateGiftCampaign.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CampaignsUpdateGiftCampaign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CampaignsUpdateGiftCampaign` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      try {
        JsonElement objectElement = jsonObj.get("type");

        if (objectElement != null && !objectElement.isJsonNull()) {
          TypeEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `type` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("type") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a valid element of TypeEnum enum got `%s` instead", jsonObj.get("type").toString()));
        }
      }
      // validate the optional field `gift`
      if (jsonObj.get("gift") != null && !jsonObj.get("gift").isJsonNull()) {
        Gift.validateJsonElement(jsonObj.get("gift"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignsUpdateGiftCampaign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignsUpdateGiftCampaign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignsUpdateGiftCampaign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignsUpdateGiftCampaign.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignsUpdateGiftCampaign>() {
           @Override
           public void write(JsonWriter out, CampaignsUpdateGiftCampaign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignsUpdateGiftCampaign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignsUpdateGiftCampaign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsUpdateGiftCampaign
  * @throws IOException if the JSON string is invalid with respect to CampaignsUpdateGiftCampaign
  */
  public static CampaignsUpdateGiftCampaign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsUpdateGiftCampaign.class);
  }

 /**
  * Convert an instance of CampaignsUpdateGiftCampaign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

