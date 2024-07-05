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
import voucherify.client.model.Category;
import voucherify.client.model.PromotionTierAction;
import voucherify.client.model.PromotionTierCampaign;
import voucherify.client.model.PromotionTierSummary;
import voucherify.client.model.PromotionTierValidityTimeframe;
import voucherify.client.model.ValidationRuleAssignmentsList;
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
 * Response body schema for **POST** &#x60;/promotions/tiers/{promotionTierId}/disable&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PromotionsTiersDisableResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BANNER = "banner";
  @SerializedName(SERIALIZED_NAME_BANNER)
  private String banner;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private PromotionTierAction action;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_HIERARCHY = "hierarchy";
  @SerializedName(SERIALIZED_NAME_HIERARCHY)
  private Integer hierarchy;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private String promotionId;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private PromotionTierCampaign campaign;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private PromotionTierValidityTimeframe validityTimeframe;

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<Integer> validityDayOfWeek;

  public static final String SERIALIZED_NAME_VALIDITY_HOURS = "validity_hours";
  @SerializedName(SERIALIZED_NAME_VALIDITY_HOURS)
  private ValidityHours validityHours;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private PromotionTierSummary summary;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "promotion_tier";

  public static final String SERIALIZED_NAME_VALIDATION_RULE_ASSIGNMENTS = "validation_rule_assignments";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULE_ASSIGNMENTS)
  private ValidationRuleAssignmentsList validationRuleAssignments;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Category> categories;

  public PromotionsTiersDisableResponseBody() {
  }

  public PromotionsTiersDisableResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique promotion tier ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PromotionsTiersDisableResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the promotion tier was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PromotionsTiersDisableResponseBody updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the promotion tier was updated. The value is shown in the ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PromotionsTiersDisableResponseBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the promotion tier.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PromotionsTiersDisableResponseBody banner(String banner) {
    
    this.banner = banner;
    return this;
  }

   /**
   * Text to be displayed to your customers on your website.
   * @return banner
  **/
  @javax.annotation.Nullable
  public String getBanner() {
    return banner;
  }


  public void setBanner(String banner) {
    this.banner = banner;
  }


  public PromotionsTiersDisableResponseBody action(PromotionTierAction action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  public PromotionTierAction getAction() {
    return action;
  }


  public void setAction(PromotionTierAction action) {
    this.action = action;
  }


  public PromotionsTiersDisableResponseBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the promotion tier. A set of key/value pairs that you can attach to a promotion tier object. It can be useful for storing additional information about the promotion tier in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public PromotionsTiersDisableResponseBody hierarchy(Integer hierarchy) {
    
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * The promotions hierarchy defines the order in which the discounts from different tiers will be applied to a customer&#39;s order. If a customer qualifies for discounts from more than one tier, discounts will be applied in the order defined in the hierarchy.
   * @return hierarchy
  **/
  @javax.annotation.Nullable
  public Integer getHierarchy() {
    return hierarchy;
  }


  public void setHierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
  }


  public PromotionsTiersDisableResponseBody promotionId(String promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * Promotion unique ID.
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public String getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }


  public PromotionsTiersDisableResponseBody campaign(PromotionTierCampaign campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nullable
  public PromotionTierCampaign getCampaign() {
    return campaign;
  }


  public void setCampaign(PromotionTierCampaign campaign) {
    this.campaign = campaign;
  }


  public PromotionsTiersDisableResponseBody campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Promotion tier&#39;s parent campaign&#39;s unique ID.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public PromotionsTiersDisableResponseBody active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A flag to toggle the promotion tier on or off. You can disable a promotion tier even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* promotion tier - &#x60;false&#x60; indicates an *inactive* promotion tier
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public PromotionsTiersDisableResponseBody startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Activation timestamp defines when the promotion tier starts to be active in ISO 8601 format. Promotion tier is *inactive before* this date. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public PromotionsTiersDisableResponseBody expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Activation timestamp defines when the promotion tier expires in ISO 8601 format. Promotion tier is *inactive after* this date. 
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PromotionsTiersDisableResponseBody validityTimeframe(PromotionTierValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public PromotionTierValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(PromotionTierValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public PromotionsTiersDisableResponseBody validityDayOfWeek(List<Integer> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public PromotionsTiersDisableResponseBody addValidityDayOfWeekItem(Integer validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the promotion tier is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<Integer> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<Integer> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public PromotionsTiersDisableResponseBody validityHours(ValidityHours validityHours) {
    
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


  public PromotionsTiersDisableResponseBody summary(PromotionTierSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  public PromotionTierSummary getSummary() {
    return summary;
  }


  public void setSummary(PromotionTierSummary summary) {
    this.summary = summary;
  }


  public PromotionsTiersDisableResponseBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. This object stores information about the promotion tier.
   * @return _object
  **/
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public PromotionsTiersDisableResponseBody validationRuleAssignments(ValidationRuleAssignmentsList validationRuleAssignments) {
    
    this.validationRuleAssignments = validationRuleAssignments;
    return this;
  }

   /**
   * Get validationRuleAssignments
   * @return validationRuleAssignments
  **/
  @javax.annotation.Nullable
  public ValidationRuleAssignmentsList getValidationRuleAssignments() {
    return validationRuleAssignments;
  }


  public void setValidationRuleAssignments(ValidationRuleAssignmentsList validationRuleAssignments) {
    this.validationRuleAssignments = validationRuleAssignments;
  }


  public PromotionsTiersDisableResponseBody categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Promotion tier category ID.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public PromotionsTiersDisableResponseBody categories(List<Category> categories) {
    
    this.categories = categories;
    return this;
  }

  public PromotionsTiersDisableResponseBody addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<Category> getCategories() {
    return categories;
  }


  public void setCategories(List<Category> categories) {
    this.categories = categories;
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
   * @return the PromotionsTiersDisableResponseBody instance itself
   */
  public PromotionsTiersDisableResponseBody putAdditionalProperty(String key, Object value) {
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
    PromotionsTiersDisableResponseBody promotionsTiersDisableResponseBody = (PromotionsTiersDisableResponseBody) o;
    return Objects.equals(this.id, promotionsTiersDisableResponseBody.id) &&
        Objects.equals(this.createdAt, promotionsTiersDisableResponseBody.createdAt) &&
        Objects.equals(this.updatedAt, promotionsTiersDisableResponseBody.updatedAt) &&
        Objects.equals(this.name, promotionsTiersDisableResponseBody.name) &&
        Objects.equals(this.banner, promotionsTiersDisableResponseBody.banner) &&
        Objects.equals(this.action, promotionsTiersDisableResponseBody.action) &&
        Objects.equals(this.metadata, promotionsTiersDisableResponseBody.metadata) &&
        Objects.equals(this.hierarchy, promotionsTiersDisableResponseBody.hierarchy) &&
        Objects.equals(this.promotionId, promotionsTiersDisableResponseBody.promotionId) &&
        Objects.equals(this.campaign, promotionsTiersDisableResponseBody.campaign) &&
        Objects.equals(this.campaignId, promotionsTiersDisableResponseBody.campaignId) &&
        Objects.equals(this.active, promotionsTiersDisableResponseBody.active) &&
        Objects.equals(this.startDate, promotionsTiersDisableResponseBody.startDate) &&
        Objects.equals(this.expirationDate, promotionsTiersDisableResponseBody.expirationDate) &&
        Objects.equals(this.validityTimeframe, promotionsTiersDisableResponseBody.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, promotionsTiersDisableResponseBody.validityDayOfWeek) &&
        Objects.equals(this.validityHours, promotionsTiersDisableResponseBody.validityHours) &&
        Objects.equals(this.summary, promotionsTiersDisableResponseBody.summary) &&
        Objects.equals(this._object, promotionsTiersDisableResponseBody._object) &&
        Objects.equals(this.validationRuleAssignments, promotionsTiersDisableResponseBody.validationRuleAssignments) &&
        Objects.equals(this.categoryId, promotionsTiersDisableResponseBody.categoryId) &&
        Objects.equals(this.categories, promotionsTiersDisableResponseBody.categories)&&
        Objects.equals(this.additionalProperties, promotionsTiersDisableResponseBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, name, banner, action, metadata, hierarchy, promotionId, campaign, campaignId, active, startDate, expirationDate, validityTimeframe, validityDayOfWeek, validityHours, summary, _object, validationRuleAssignments, categoryId, categories, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionsTiersDisableResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    validityHours: ").append(toIndentedString(validityHours)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    validationRuleAssignments: ").append(toIndentedString(validationRuleAssignments)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("name");
    openapiFields.add("banner");
    openapiFields.add("action");
    openapiFields.add("metadata");
    openapiFields.add("hierarchy");
    openapiFields.add("promotion_id");
    openapiFields.add("campaign");
    openapiFields.add("campaign_id");
    openapiFields.add("active");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("validity_hours");
    openapiFields.add("summary");
    openapiFields.add("object");
    openapiFields.add("validation_rule_assignments");
    openapiFields.add("category_id");
    openapiFields.add("categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PromotionsTiersDisableResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PromotionsTiersDisableResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromotionsTiersDisableResponseBody is not found in the empty JSON string", PromotionsTiersDisableResponseBody.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("banner") != null && !jsonObj.get("banner").isJsonNull()) && !jsonObj.get("banner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banner").toString()));
      }
      // validate the optional field `action`
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) {
        PromotionTierAction.validateJsonElement(jsonObj.get("action"));
      }
      if ((jsonObj.get("promotion_id") != null && !jsonObj.get("promotion_id").isJsonNull()) && !jsonObj.get("promotion_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotion_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotion_id").toString()));
      }
      // validate the optional field `campaign`
      if (jsonObj.get("campaign") != null && !jsonObj.get("campaign").isJsonNull()) {
        PromotionTierCampaign.validateJsonElement(jsonObj.get("campaign"));
      }
      if ((jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) && !jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      // validate the optional field `validity_timeframe`
      if (jsonObj.get("validity_timeframe") != null && !jsonObj.get("validity_timeframe").isJsonNull()) {
        PromotionTierValidityTimeframe.validateJsonElement(jsonObj.get("validity_timeframe"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validity_day_of_week") != null && !jsonObj.get("validity_day_of_week").isJsonNull() && !jsonObj.get("validity_day_of_week").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validity_day_of_week` to be an array in the JSON string but got `%s`", jsonObj.get("validity_day_of_week").toString()));
      }
      // validate the optional field `validity_hours`
      if (jsonObj.get("validity_hours") != null && !jsonObj.get("validity_hours").isJsonNull()) {
        ValidityHours.validateJsonElement(jsonObj.get("validity_hours"));
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        PromotionTierSummary.validateJsonElement(jsonObj.get("summary"));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the optional field `validation_rule_assignments`
      if (jsonObj.get("validation_rule_assignments") != null && !jsonObj.get("validation_rule_assignments").isJsonNull()) {
        ValidationRuleAssignmentsList.validateJsonElement(jsonObj.get("validation_rule_assignments"));
      }
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull()) {
        JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
        if (jsonArraycategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("categories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
          }

          // validate the optional field `categories` (array)
          for (int i = 0; i < jsonArraycategories.size(); i++) {
            Category.validateJsonElement(jsonArraycategories.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionsTiersDisableResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionsTiersDisableResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionsTiersDisableResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionsTiersDisableResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionsTiersDisableResponseBody>() {
           @Override
           public void write(JsonWriter out, PromotionsTiersDisableResponseBody value) throws IOException {
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
           public PromotionsTiersDisableResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PromotionsTiersDisableResponseBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PromotionsTiersDisableResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionsTiersDisableResponseBody
  * @throws IOException if the JSON string is invalid with respect to PromotionsTiersDisableResponseBody
  */
  public static PromotionsTiersDisableResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionsTiersDisableResponseBody.class);
  }

 /**
  * Convert an instance of PromotionsTiersDisableResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

