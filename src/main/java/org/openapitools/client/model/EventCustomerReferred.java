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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.CustomEvent;
import org.openapitools.client.model.RedemptionInternal;
import org.openapitools.client.model.SimpleCampaign;
import org.openapitools.client.model.SimpleCustomer;
import org.openapitools.client.model.SimpleVoucher;

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

import org.openapitools.client.JSON;

/**
 * Event data object schema for &#x60;customer.referred&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class EventCustomerReferred {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private SimpleCustomer referrer;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private SimpleCampaign campaign;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private SimpleVoucher voucher;

  public static final String SERIALIZED_NAME_CUSTOM_EVENT = "custom_event";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EVENT)
  private CustomEvent customEvent;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private RedemptionInternal redemption;

  public EventCustomerReferred() {
  }

  public EventCustomerReferred customer(SimpleCustomer customer) {
    
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


  public EventCustomerReferred referrer(SimpleCustomer referrer) {
    
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @javax.annotation.Nonnull
  public SimpleCustomer getReferrer() {
    return referrer;
  }


  public void setReferrer(SimpleCustomer referrer) {
    this.referrer = referrer;
  }


  public EventCustomerReferred campaign(SimpleCampaign campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nonnull
  public SimpleCampaign getCampaign() {
    return campaign;
  }


  public void setCampaign(SimpleCampaign campaign) {
    this.campaign = campaign;
  }


  public EventCustomerReferred voucher(SimpleVoucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nonnull
  public SimpleVoucher getVoucher() {
    return voucher;
  }


  public void setVoucher(SimpleVoucher voucher) {
    this.voucher = voucher;
  }


  public EventCustomerReferred customEvent(CustomEvent customEvent) {
    
    this.customEvent = customEvent;
    return this;
  }

   /**
   * Get customEvent
   * @return customEvent
  **/
  @javax.annotation.Nonnull
  public CustomEvent getCustomEvent() {
    return customEvent;
  }


  public void setCustomEvent(CustomEvent customEvent) {
    this.customEvent = customEvent;
  }


  public EventCustomerReferred redemption(RedemptionInternal redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public RedemptionInternal getRedemption() {
    return redemption;
  }


  public void setRedemption(RedemptionInternal redemption) {
    this.redemption = redemption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerReferred eventCustomerReferred = (EventCustomerReferred) o;
    return Objects.equals(this.customer, eventCustomerReferred.customer) &&
        Objects.equals(this.referrer, eventCustomerReferred.referrer) &&
        Objects.equals(this.campaign, eventCustomerReferred.campaign) &&
        Objects.equals(this.voucher, eventCustomerReferred.voucher) &&
        Objects.equals(this.customEvent, eventCustomerReferred.customEvent) &&
        Objects.equals(this.redemption, eventCustomerReferred.redemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, referrer, campaign, voucher, customEvent, redemption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerReferred {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    customEvent: ").append(toIndentedString(customEvent)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
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
    openapiFields.add("referrer");
    openapiFields.add("campaign");
    openapiFields.add("voucher");
    openapiFields.add("custom_event");
    openapiFields.add("redemption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("referrer");
    openapiRequiredFields.add("campaign");
    openapiRequiredFields.add("voucher");
    openapiRequiredFields.add("custom_event");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerReferred
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerReferred.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerReferred is not found in the empty JSON string", EventCustomerReferred.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerReferred.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerReferred` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventCustomerReferred.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        SimpleCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the required field `referrer`
      SimpleCustomer.validateJsonElement(jsonObj.get("referrer"));
      // validate the required field `campaign`
      SimpleCampaign.validateJsonElement(jsonObj.get("campaign"));
      // validate the required field `voucher`
      SimpleVoucher.validateJsonElement(jsonObj.get("voucher"));
      // validate the required field `custom_event`
      CustomEvent.validateJsonElement(jsonObj.get("custom_event"));
      // validate the optional field `redemption`
      if (jsonObj.get("redemption") != null && !jsonObj.get("redemption").isJsonNull()) {
        RedemptionInternal.validateJsonElement(jsonObj.get("redemption"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerReferred.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerReferred' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerReferred> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerReferred.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerReferred>() {
           @Override
           public void write(JsonWriter out, EventCustomerReferred value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerReferred read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerReferred given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerReferred
  * @throws IOException if the JSON string is invalid with respect to EventCustomerReferred
  */
  public static EventCustomerReferred fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerReferred.class);
  }

 /**
  * Convert an instance of EventCustomerReferred to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

