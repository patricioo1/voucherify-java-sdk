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
import java.util.Arrays;
import voucherify.client.model.LoyaltyTier;
import voucherify.client.model.SimpleCampaign;
import voucherify.client.model.SimpleCustomer;

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
 * Event data object schema for &#x60;customer.loyalty.tier.expiration.changed&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventCustomerLoyaltyTierExpirationChanged {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private SimpleCampaign campaign;

  public static final String SERIALIZED_NAME_LOYALTY_TIER = "loyalty_tier";
  @SerializedName(SERIALIZED_NAME_LOYALTY_TIER)
  private LoyaltyTier loyaltyTier;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public EventCustomerLoyaltyTierExpirationChanged() {
  }

  public EventCustomerLoyaltyTierExpirationChanged customer(SimpleCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public SimpleCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(SimpleCustomer customer) {
    this.customer = customer;
  }


  public EventCustomerLoyaltyTierExpirationChanged campaign(SimpleCampaign campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nullable
  public SimpleCampaign getCampaign() {
    return campaign;
  }


  public void setCampaign(SimpleCampaign campaign) {
    this.campaign = campaign;
  }


  public EventCustomerLoyaltyTierExpirationChanged loyaltyTier(LoyaltyTier loyaltyTier) {
    
    this.loyaltyTier = loyaltyTier;
    return this;
  }

   /**
   * Get loyaltyTier
   * @return loyaltyTier
  **/
  @javax.annotation.Nonnull
  public LoyaltyTier getLoyaltyTier() {
    return loyaltyTier;
  }


  public void setLoyaltyTier(LoyaltyTier loyaltyTier) {
    this.loyaltyTier = loyaltyTier;
  }


  public EventCustomerLoyaltyTierExpirationChanged createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EventCustomerLoyaltyTierExpirationChanged expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerLoyaltyTierExpirationChanged eventCustomerLoyaltyTierExpirationChanged = (EventCustomerLoyaltyTierExpirationChanged) o;
    return Objects.equals(this.customer, eventCustomerLoyaltyTierExpirationChanged.customer) &&
        Objects.equals(this.campaign, eventCustomerLoyaltyTierExpirationChanged.campaign) &&
        Objects.equals(this.loyaltyTier, eventCustomerLoyaltyTierExpirationChanged.loyaltyTier) &&
        Objects.equals(this.createdAt, eventCustomerLoyaltyTierExpirationChanged.createdAt) &&
        Objects.equals(this.expirationDate, eventCustomerLoyaltyTierExpirationChanged.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, campaign, loyaltyTier, createdAt, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerLoyaltyTierExpirationChanged {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    loyaltyTier: ").append(toIndentedString(loyaltyTier)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("campaign");
    openapiFields.add("loyalty_tier");
    openapiFields.add("created_at");
    openapiFields.add("expiration_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("loyalty_tier");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("expiration_date");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerLoyaltyTierExpirationChanged
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerLoyaltyTierExpirationChanged.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerLoyaltyTierExpirationChanged is not found in the empty JSON string", EventCustomerLoyaltyTierExpirationChanged.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerLoyaltyTierExpirationChanged.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerLoyaltyTierExpirationChanged` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventCustomerLoyaltyTierExpirationChanged.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        SimpleCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `campaign`
      if (jsonObj.get("campaign") != null && !jsonObj.get("campaign").isJsonNull()) {
        SimpleCampaign.validateJsonElement(jsonObj.get("campaign"));
      }
      // validate the required field `loyalty_tier`
      LoyaltyTier.validateJsonElement(jsonObj.get("loyalty_tier"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerLoyaltyTierExpirationChanged.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerLoyaltyTierExpirationChanged' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerLoyaltyTierExpirationChanged> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerLoyaltyTierExpirationChanged.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerLoyaltyTierExpirationChanged>() {
           @Override
           public void write(JsonWriter out, EventCustomerLoyaltyTierExpirationChanged value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerLoyaltyTierExpirationChanged read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerLoyaltyTierExpirationChanged given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerLoyaltyTierExpirationChanged
  * @throws IOException if the JSON string is invalid with respect to EventCustomerLoyaltyTierExpirationChanged
  */
  public static EventCustomerLoyaltyTierExpirationChanged fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerLoyaltyTierExpirationChanged.class);
  }

 /**
  * Convert an instance of EventCustomerLoyaltyTierExpirationChanged to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

