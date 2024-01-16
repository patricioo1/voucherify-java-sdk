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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.SimpleCampaign;
import org.openapitools.client.model.SimpleCustomer;
import org.openapitools.client.model.SimpleVoucher;
import org.openapitools.client.model.VoucherTransaction;

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
 * Event data object schema for &#x60;customer.voucher.loyalty_card.points_expired&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class EventCustomerVouchersLoyaltyPointsExpired {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private SimpleCampaign campaign;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private SimpleVoucher voucher;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_BUCKETS = "buckets";
  @SerializedName(SERIALIZED_NAME_BUCKETS)
  private List<VoucherTransaction> buckets;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private VoucherTransaction transaction;

  public EventCustomerVouchersLoyaltyPointsExpired() {
  }

  public EventCustomerVouchersLoyaltyPointsExpired customer(SimpleCustomer customer) {
    
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


  public EventCustomerVouchersLoyaltyPointsExpired campaign(SimpleCampaign campaign) {
    
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


  public EventCustomerVouchersLoyaltyPointsExpired voucher(SimpleVoucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  public SimpleVoucher getVoucher() {
    return voucher;
  }


  public void setVoucher(SimpleVoucher voucher) {
    this.voucher = voucher;
  }


  public EventCustomerVouchersLoyaltyPointsExpired points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nullable
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public EventCustomerVouchersLoyaltyPointsExpired buckets(List<VoucherTransaction> buckets) {
    
    this.buckets = buckets;
    return this;
  }

  public EventCustomerVouchersLoyaltyPointsExpired addBucketsItem(VoucherTransaction bucketsItem) {
    if (this.buckets == null) {
      this.buckets = new ArrayList<>();
    }
    this.buckets.add(bucketsItem);
    return this;
  }

   /**
   * Get buckets
   * @return buckets
  **/
  @javax.annotation.Nullable
  public List<VoucherTransaction> getBuckets() {
    return buckets;
  }


  public void setBuckets(List<VoucherTransaction> buckets) {
    this.buckets = buckets;
  }


  public EventCustomerVouchersLoyaltyPointsExpired transaction(VoucherTransaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  public VoucherTransaction getTransaction() {
    return transaction;
  }


  public void setTransaction(VoucherTransaction transaction) {
    this.transaction = transaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerVouchersLoyaltyPointsExpired eventCustomerVouchersLoyaltyPointsExpired = (EventCustomerVouchersLoyaltyPointsExpired) o;
    return Objects.equals(this.customer, eventCustomerVouchersLoyaltyPointsExpired.customer) &&
        Objects.equals(this.campaign, eventCustomerVouchersLoyaltyPointsExpired.campaign) &&
        Objects.equals(this.voucher, eventCustomerVouchersLoyaltyPointsExpired.voucher) &&
        Objects.equals(this.points, eventCustomerVouchersLoyaltyPointsExpired.points) &&
        Objects.equals(this.buckets, eventCustomerVouchersLoyaltyPointsExpired.buckets) &&
        Objects.equals(this.transaction, eventCustomerVouchersLoyaltyPointsExpired.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, campaign, voucher, points, buckets, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerVouchersLoyaltyPointsExpired {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
    openapiFields.add("voucher");
    openapiFields.add("points");
    openapiFields.add("buckets");
    openapiFields.add("transaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerVouchersLoyaltyPointsExpired
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerVouchersLoyaltyPointsExpired.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerVouchersLoyaltyPointsExpired is not found in the empty JSON string", EventCustomerVouchersLoyaltyPointsExpired.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerVouchersLoyaltyPointsExpired.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerVouchersLoyaltyPointsExpired` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `voucher`
      if (jsonObj.get("voucher") != null && !jsonObj.get("voucher").isJsonNull()) {
        SimpleVoucher.validateJsonElement(jsonObj.get("voucher"));
      }
      if (jsonObj.get("buckets") != null && !jsonObj.get("buckets").isJsonNull()) {
        JsonArray jsonArraybuckets = jsonObj.getAsJsonArray("buckets");
        if (jsonArraybuckets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("buckets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `buckets` to be an array in the JSON string but got `%s`", jsonObj.get("buckets").toString()));
          }

          // validate the optional field `buckets` (array)
          for (int i = 0; i < jsonArraybuckets.size(); i++) {
            VoucherTransaction.validateJsonElement(jsonArraybuckets.get(i));
          };
        }
      }
      // validate the optional field `transaction`
      if (jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) {
        VoucherTransaction.validateJsonElement(jsonObj.get("transaction"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerVouchersLoyaltyPointsExpired.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerVouchersLoyaltyPointsExpired' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerVouchersLoyaltyPointsExpired> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerVouchersLoyaltyPointsExpired.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerVouchersLoyaltyPointsExpired>() {
           @Override
           public void write(JsonWriter out, EventCustomerVouchersLoyaltyPointsExpired value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerVouchersLoyaltyPointsExpired read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerVouchersLoyaltyPointsExpired given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerVouchersLoyaltyPointsExpired
  * @throws IOException if the JSON string is invalid with respect to EventCustomerVouchersLoyaltyPointsExpired
  */
  public static EventCustomerVouchersLoyaltyPointsExpired fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerVouchersLoyaltyPointsExpired.class);
  }

 /**
  * Convert an instance of EventCustomerVouchersLoyaltyPointsExpired to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

