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
import org.openapitools.client.model.CustomerSummaryRedemptionsGift;
import org.openapitools.client.model.CustomerSummaryRedemptionsLoyaltyCard;

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
 * CustomerSummaryRedemptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class CustomerSummaryRedemptions {
  public static final String SERIALIZED_NAME_TOTAL_REDEEMED = "total_redeemed";
  @SerializedName(SERIALIZED_NAME_TOTAL_REDEEMED)
  private Integer totalRedeemed;

  public static final String SERIALIZED_NAME_TOTAL_FAILED = "total_failed";
  @SerializedName(SERIALIZED_NAME_TOTAL_FAILED)
  private Integer totalFailed;

  public static final String SERIALIZED_NAME_TOTAL_SUCCEEDED = "total_succeeded";
  @SerializedName(SERIALIZED_NAME_TOTAL_SUCCEEDED)
  private Integer totalSucceeded;

  public static final String SERIALIZED_NAME_TOTAL_ROLLED_BACK = "total_rolled_back";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROLLED_BACK)
  private Integer totalRolledBack;

  public static final String SERIALIZED_NAME_TOTAL_ROLLBACK_FAILED = "total_rollback_failed";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROLLBACK_FAILED)
  private Integer totalRollbackFailed;

  public static final String SERIALIZED_NAME_TOTAL_ROLLBACK_SUCCEEDED = "total_rollback_succeeded";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROLLBACK_SUCCEEDED)
  private Integer totalRollbackSucceeded;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private CustomerSummaryRedemptionsGift gift;

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private CustomerSummaryRedemptionsLoyaltyCard loyaltyCard;

  public CustomerSummaryRedemptions() {
  }

  public CustomerSummaryRedemptions totalRedeemed(Integer totalRedeemed) {
    
    this.totalRedeemed = totalRedeemed;
    return this;
  }

   /**
   * Total number of redemptions made by the customer.
   * @return totalRedeemed
  **/
  @javax.annotation.Nonnull
  public Integer getTotalRedeemed() {
    return totalRedeemed;
  }


  public void setTotalRedeemed(Integer totalRedeemed) {
    this.totalRedeemed = totalRedeemed;
  }


  public CustomerSummaryRedemptions totalFailed(Integer totalFailed) {
    
    this.totalFailed = totalFailed;
    return this;
  }

   /**
   * Total number of redemptions that failed.
   * @return totalFailed
  **/
  @javax.annotation.Nonnull
  public Integer getTotalFailed() {
    return totalFailed;
  }


  public void setTotalFailed(Integer totalFailed) {
    this.totalFailed = totalFailed;
  }


  public CustomerSummaryRedemptions totalSucceeded(Integer totalSucceeded) {
    
    this.totalSucceeded = totalSucceeded;
    return this;
  }

   /**
   * Total number of redemptions that succeeded.
   * @return totalSucceeded
  **/
  @javax.annotation.Nonnull
  public Integer getTotalSucceeded() {
    return totalSucceeded;
  }


  public void setTotalSucceeded(Integer totalSucceeded) {
    this.totalSucceeded = totalSucceeded;
  }


  public CustomerSummaryRedemptions totalRolledBack(Integer totalRolledBack) {
    
    this.totalRolledBack = totalRolledBack;
    return this;
  }

   /**
   * Total number of redemptions that were rolled back for the customer.
   * @return totalRolledBack
  **/
  @javax.annotation.Nonnull
  public Integer getTotalRolledBack() {
    return totalRolledBack;
  }


  public void setTotalRolledBack(Integer totalRolledBack) {
    this.totalRolledBack = totalRolledBack;
  }


  public CustomerSummaryRedemptions totalRollbackFailed(Integer totalRollbackFailed) {
    
    this.totalRollbackFailed = totalRollbackFailed;
    return this;
  }

   /**
   * Total number of redemption rollbacks that failed.
   * @return totalRollbackFailed
  **/
  @javax.annotation.Nonnull
  public Integer getTotalRollbackFailed() {
    return totalRollbackFailed;
  }


  public void setTotalRollbackFailed(Integer totalRollbackFailed) {
    this.totalRollbackFailed = totalRollbackFailed;
  }


  public CustomerSummaryRedemptions totalRollbackSucceeded(Integer totalRollbackSucceeded) {
    
    this.totalRollbackSucceeded = totalRollbackSucceeded;
    return this;
  }

   /**
   * Total number of redemption rollbacks that succeeded.
   * @return totalRollbackSucceeded
  **/
  @javax.annotation.Nonnull
  public Integer getTotalRollbackSucceeded() {
    return totalRollbackSucceeded;
  }


  public void setTotalRollbackSucceeded(Integer totalRollbackSucceeded) {
    this.totalRollbackSucceeded = totalRollbackSucceeded;
  }


  public CustomerSummaryRedemptions gift(CustomerSummaryRedemptionsGift gift) {
    
    this.gift = gift;
    return this;
  }

   /**
   * Get gift
   * @return gift
  **/
  @javax.annotation.Nonnull
  public CustomerSummaryRedemptionsGift getGift() {
    return gift;
  }


  public void setGift(CustomerSummaryRedemptionsGift gift) {
    this.gift = gift;
  }


  public CustomerSummaryRedemptions loyaltyCard(CustomerSummaryRedemptionsLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nonnull
  public CustomerSummaryRedemptionsLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(CustomerSummaryRedemptionsLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSummaryRedemptions customerSummaryRedemptions = (CustomerSummaryRedemptions) o;
    return Objects.equals(this.totalRedeemed, customerSummaryRedemptions.totalRedeemed) &&
        Objects.equals(this.totalFailed, customerSummaryRedemptions.totalFailed) &&
        Objects.equals(this.totalSucceeded, customerSummaryRedemptions.totalSucceeded) &&
        Objects.equals(this.totalRolledBack, customerSummaryRedemptions.totalRolledBack) &&
        Objects.equals(this.totalRollbackFailed, customerSummaryRedemptions.totalRollbackFailed) &&
        Objects.equals(this.totalRollbackSucceeded, customerSummaryRedemptions.totalRollbackSucceeded) &&
        Objects.equals(this.gift, customerSummaryRedemptions.gift) &&
        Objects.equals(this.loyaltyCard, customerSummaryRedemptions.loyaltyCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRedeemed, totalFailed, totalSucceeded, totalRolledBack, totalRollbackFailed, totalRollbackSucceeded, gift, loyaltyCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSummaryRedemptions {\n");
    sb.append("    totalRedeemed: ").append(toIndentedString(totalRedeemed)).append("\n");
    sb.append("    totalFailed: ").append(toIndentedString(totalFailed)).append("\n");
    sb.append("    totalSucceeded: ").append(toIndentedString(totalSucceeded)).append("\n");
    sb.append("    totalRolledBack: ").append(toIndentedString(totalRolledBack)).append("\n");
    sb.append("    totalRollbackFailed: ").append(toIndentedString(totalRollbackFailed)).append("\n");
    sb.append("    totalRollbackSucceeded: ").append(toIndentedString(totalRollbackSucceeded)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
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
    openapiFields.add("total_redeemed");
    openapiFields.add("total_failed");
    openapiFields.add("total_succeeded");
    openapiFields.add("total_rolled_back");
    openapiFields.add("total_rollback_failed");
    openapiFields.add("total_rollback_succeeded");
    openapiFields.add("gift");
    openapiFields.add("loyalty_card");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_redeemed");
    openapiRequiredFields.add("total_failed");
    openapiRequiredFields.add("total_succeeded");
    openapiRequiredFields.add("total_rolled_back");
    openapiRequiredFields.add("total_rollback_failed");
    openapiRequiredFields.add("total_rollback_succeeded");
    openapiRequiredFields.add("gift");
    openapiRequiredFields.add("loyalty_card");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerSummaryRedemptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerSummaryRedemptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerSummaryRedemptions is not found in the empty JSON string", CustomerSummaryRedemptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerSummaryRedemptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerSummaryRedemptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerSummaryRedemptions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `gift`
      CustomerSummaryRedemptionsGift.validateJsonElement(jsonObj.get("gift"));
      // validate the required field `loyalty_card`
      CustomerSummaryRedemptionsLoyaltyCard.validateJsonElement(jsonObj.get("loyalty_card"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerSummaryRedemptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerSummaryRedemptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerSummaryRedemptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerSummaryRedemptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerSummaryRedemptions>() {
           @Override
           public void write(JsonWriter out, CustomerSummaryRedemptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerSummaryRedemptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerSummaryRedemptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerSummaryRedemptions
  * @throws IOException if the JSON string is invalid with respect to CustomerSummaryRedemptions
  */
  public static CustomerSummaryRedemptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerSummaryRedemptions.class);
  }

 /**
  * Convert an instance of CustomerSummaryRedemptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

