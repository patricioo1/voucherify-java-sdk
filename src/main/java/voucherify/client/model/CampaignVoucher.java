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
import voucherify.client.model.CampaignBaseValidityTimeframe;
import voucherify.client.model.CampaignLoyaltyCard;
import voucherify.client.model.CampaignVoucherRedemption;
import voucherify.client.model.CodeConfigRequiredLengthCharsetPattern;
import voucherify.client.model.Discount;
import voucherify.client.model.Gift;
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
 * Schema model for a campaign voucher.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignVoucher {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "DISCOUNT_VOUCHER";

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Discount discount;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private Gift gift;

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private CampaignLoyaltyCard loyaltyCard;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private CampaignVoucherRedemption redemption;

  public static final String SERIALIZED_NAME_CODE_CONFIG = "code_config";
  @SerializedName(SERIALIZED_NAME_CODE_CONFIG)
  private CodeConfigRequiredLengthCharsetPattern codeConfig;

  public static final String SERIALIZED_NAME_IS_REFERRAL_CODE = "is_referral_code";
  @SerializedName(SERIALIZED_NAME_IS_REFERRAL_CODE)
  private Boolean isReferralCode;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private CampaignBaseValidityTimeframe validityTimeframe;

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

  public CampaignVoucher() {
  }

  public CampaignVoucher type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of voucher.
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CampaignVoucher discount(Discount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  public Discount getDiscount() {
    return discount;
  }


  public void setDiscount(Discount discount) {
    this.discount = discount;
  }


  public CampaignVoucher gift(Gift gift) {
    
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


  public CampaignVoucher loyaltyCard(CampaignLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nullable
  public CampaignLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(CampaignLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }


  public CampaignVoucher redemption(CampaignVoucherRedemption redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nonnull
  public CampaignVoucherRedemption getRedemption() {
    return redemption;
  }


  public void setRedemption(CampaignVoucherRedemption redemption) {
    this.redemption = redemption;
  }


  public CampaignVoucher codeConfig(CodeConfigRequiredLengthCharsetPattern codeConfig) {
    
    this.codeConfig = codeConfig;
    return this;
  }

   /**
   * Get codeConfig
   * @return codeConfig
  **/
  @javax.annotation.Nonnull
  public CodeConfigRequiredLengthCharsetPattern getCodeConfig() {
    return codeConfig;
  }


  public void setCodeConfig(CodeConfigRequiredLengthCharsetPattern codeConfig) {
    this.codeConfig = codeConfig;
  }


  public CampaignVoucher isReferralCode(Boolean isReferralCode) {
    
    this.isReferralCode = isReferralCode;
    return this;
  }

   /**
   * Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;.
   * @return isReferralCode
  **/
  @javax.annotation.Nonnull
  public Boolean getIsReferralCode() {
    return isReferralCode;
  }


  public void setIsReferralCode(Boolean isReferralCode) {
    this.isReferralCode = isReferralCode;
  }


  public CampaignVoucher startDate(OffsetDateTime startDate) {
    
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


  public CampaignVoucher expirationDate(OffsetDateTime expirationDate) {
    
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


  public CampaignVoucher validityTimeframe(CampaignBaseValidityTimeframe validityTimeframe) {
    
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


  public CampaignVoucher validityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public CampaignVoucher addValidityDayOfWeekItem(ValidityDayOfWeekEnum validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<ValidityDayOfWeekEnum> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public CampaignVoucher validityHours(ValidityHours validityHours) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignVoucher campaignVoucher = (CampaignVoucher) o;
    return Objects.equals(this.type, campaignVoucher.type) &&
        Objects.equals(this.discount, campaignVoucher.discount) &&
        Objects.equals(this.gift, campaignVoucher.gift) &&
        Objects.equals(this.loyaltyCard, campaignVoucher.loyaltyCard) &&
        Objects.equals(this.redemption, campaignVoucher.redemption) &&
        Objects.equals(this.codeConfig, campaignVoucher.codeConfig) &&
        Objects.equals(this.isReferralCode, campaignVoucher.isReferralCode) &&
        Objects.equals(this.startDate, campaignVoucher.startDate) &&
        Objects.equals(this.expirationDate, campaignVoucher.expirationDate) &&
        Objects.equals(this.validityTimeframe, campaignVoucher.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, campaignVoucher.validityDayOfWeek) &&
        Objects.equals(this.validityHours, campaignVoucher.validityHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, discount, gift, loyaltyCard, redemption, codeConfig, isReferralCode, startDate, expirationDate, validityTimeframe, validityDayOfWeek, validityHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignVoucher {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    codeConfig: ").append(toIndentedString(codeConfig)).append("\n");
    sb.append("    isReferralCode: ").append(toIndentedString(isReferralCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    validityHours: ").append(toIndentedString(validityHours)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("discount");
    openapiFields.add("gift");
    openapiFields.add("loyalty_card");
    openapiFields.add("redemption");
    openapiFields.add("code_config");
    openapiFields.add("is_referral_code");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("validity_hours");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("redemption");
    openapiRequiredFields.add("code_config");
    openapiRequiredFields.add("is_referral_code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignVoucher
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignVoucher.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignVoucher is not found in the empty JSON string", CampaignVoucher.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CampaignVoucher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CampaignVoucher` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CampaignVoucher.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        Discount.validateJsonElement(jsonObj.get("discount"));
      }
      // validate the optional field `gift`
      if (jsonObj.get("gift") != null && !jsonObj.get("gift").isJsonNull()) {
        Gift.validateJsonElement(jsonObj.get("gift"));
      }
      // validate the optional field `loyalty_card`
      if (jsonObj.get("loyalty_card") != null && !jsonObj.get("loyalty_card").isJsonNull()) {
        CampaignLoyaltyCard.validateJsonElement(jsonObj.get("loyalty_card"));
      }
      // validate the required field `redemption`
      CampaignVoucherRedemption.validateJsonElement(jsonObj.get("redemption"));
      // validate the required field `code_config`
      CodeConfigRequiredLengthCharsetPattern.validateJsonElement(jsonObj.get("code_config"));
      // validate the optional field `validity_timeframe`
      if (jsonObj.get("validity_timeframe") != null && !jsonObj.get("validity_timeframe").isJsonNull()) {
        CampaignBaseValidityTimeframe.validateJsonElement(jsonObj.get("validity_timeframe"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validity_day_of_week") != null && !jsonObj.get("validity_day_of_week").isJsonNull() && !jsonObj.get("validity_day_of_week").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validity_day_of_week` to be an array in the JSON string but got `%s`", jsonObj.get("validity_day_of_week").toString()));
      }
      // validate the optional field `validity_hours`
      if (jsonObj.get("validity_hours") != null && !jsonObj.get("validity_hours").isJsonNull()) {
        ValidityHours.validateJsonElement(jsonObj.get("validity_hours"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignVoucher>() {
           @Override
           public void write(JsonWriter out, CampaignVoucher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignVoucher read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignVoucher
  * @throws IOException if the JSON string is invalid with respect to CampaignVoucher
  */
  public static CampaignVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignVoucher.class);
  }

 /**
  * Convert an instance of CampaignVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

