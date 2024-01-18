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
import voucherify.client.model.FieldConditions;
import voucherify.client.model.Junction;

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
 * ExportPublicationFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ExportPublicationFilters {
  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public static final String SERIALIZED_NAME_VOUCHER_CODE = "voucher_code";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CODE)
  private FieldConditions voucherCode;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private FieldConditions customerId;

  public static final String SERIALIZED_NAME_CUSTOMER_SOURCE_ID = "customer_source_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SOURCE_ID)
  private FieldConditions customerSourceId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private FieldConditions date;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private FieldConditions channel;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private FieldConditions campaign;

  public static final String SERIALIZED_NAME_IS_WINNER = "is_winner";
  @SerializedName(SERIALIZED_NAME_IS_WINNER)
  private FieldConditions isWinner;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private FieldConditions metadata;

  public ExportPublicationFilters() {
  }

  public ExportPublicationFilters junction(Junction junction) {
    
    this.junction = junction;
    return this;
  }

   /**
   * Get junction
   * @return junction
  **/
  @javax.annotation.Nullable
  public Junction getJunction() {
    return junction;
  }


  public void setJunction(Junction junction) {
    this.junction = junction;
  }


  public ExportPublicationFilters voucherCode(FieldConditions voucherCode) {
    
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * Get voucherCode
   * @return voucherCode
  **/
  @javax.annotation.Nullable
  public FieldConditions getVoucherCode() {
    return voucherCode;
  }


  public void setVoucherCode(FieldConditions voucherCode) {
    this.voucherCode = voucherCode;
  }


  public ExportPublicationFilters customerId(FieldConditions customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  public FieldConditions getCustomerId() {
    return customerId;
  }


  public void setCustomerId(FieldConditions customerId) {
    this.customerId = customerId;
  }


  public ExportPublicationFilters customerSourceId(FieldConditions customerSourceId) {
    
    this.customerSourceId = customerSourceId;
    return this;
  }

   /**
   * Get customerSourceId
   * @return customerSourceId
  **/
  @javax.annotation.Nullable
  public FieldConditions getCustomerSourceId() {
    return customerSourceId;
  }


  public void setCustomerSourceId(FieldConditions customerSourceId) {
    this.customerSourceId = customerSourceId;
  }


  public ExportPublicationFilters date(FieldConditions date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  public FieldConditions getDate() {
    return date;
  }


  public void setDate(FieldConditions date) {
    this.date = date;
  }


  public ExportPublicationFilters channel(FieldConditions channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  public FieldConditions getChannel() {
    return channel;
  }


  public void setChannel(FieldConditions channel) {
    this.channel = channel;
  }


  public ExportPublicationFilters campaign(FieldConditions campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nullable
  public FieldConditions getCampaign() {
    return campaign;
  }


  public void setCampaign(FieldConditions campaign) {
    this.campaign = campaign;
  }


  public ExportPublicationFilters isWinner(FieldConditions isWinner) {
    
    this.isWinner = isWinner;
    return this;
  }

   /**
   * Get isWinner
   * @return isWinner
  **/
  @javax.annotation.Nullable
  public FieldConditions getIsWinner() {
    return isWinner;
  }


  public void setIsWinner(FieldConditions isWinner) {
    this.isWinner = isWinner;
  }


  public ExportPublicationFilters metadata(FieldConditions metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public FieldConditions getMetadata() {
    return metadata;
  }


  public void setMetadata(FieldConditions metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportPublicationFilters exportPublicationFilters = (ExportPublicationFilters) o;
    return Objects.equals(this.junction, exportPublicationFilters.junction) &&
        Objects.equals(this.voucherCode, exportPublicationFilters.voucherCode) &&
        Objects.equals(this.customerId, exportPublicationFilters.customerId) &&
        Objects.equals(this.customerSourceId, exportPublicationFilters.customerSourceId) &&
        Objects.equals(this.date, exportPublicationFilters.date) &&
        Objects.equals(this.channel, exportPublicationFilters.channel) &&
        Objects.equals(this.campaign, exportPublicationFilters.campaign) &&
        Objects.equals(this.isWinner, exportPublicationFilters.isWinner) &&
        Objects.equals(this.metadata, exportPublicationFilters.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junction, voucherCode, customerId, customerSourceId, date, channel, campaign, isWinner, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportPublicationFilters {\n");
    sb.append("    junction: ").append(toIndentedString(junction)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerSourceId: ").append(toIndentedString(customerSourceId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    isWinner: ").append(toIndentedString(isWinner)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("junction");
    openapiFields.add("voucher_code");
    openapiFields.add("customer_id");
    openapiFields.add("customer_source_id");
    openapiFields.add("date");
    openapiFields.add("channel");
    openapiFields.add("campaign");
    openapiFields.add("is_winner");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportPublicationFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportPublicationFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportPublicationFilters is not found in the empty JSON string", ExportPublicationFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportPublicationFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportPublicationFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `voucher_code`
      if (jsonObj.get("voucher_code") != null && !jsonObj.get("voucher_code").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("voucher_code"));
      }
      // validate the optional field `customer_id`
      if (jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("customer_id"));
      }
      // validate the optional field `customer_source_id`
      if (jsonObj.get("customer_source_id") != null && !jsonObj.get("customer_source_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("customer_source_id"));
      }
      // validate the optional field `date`
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("date"));
      }
      // validate the optional field `channel`
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("channel"));
      }
      // validate the optional field `campaign`
      if (jsonObj.get("campaign") != null && !jsonObj.get("campaign").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("campaign"));
      }
      // validate the optional field `is_winner`
      if (jsonObj.get("is_winner") != null && !jsonObj.get("is_winner").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("is_winner"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportPublicationFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportPublicationFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportPublicationFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportPublicationFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportPublicationFilters>() {
           @Override
           public void write(JsonWriter out, ExportPublicationFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportPublicationFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportPublicationFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportPublicationFilters
  * @throws IOException if the JSON string is invalid with respect to ExportPublicationFilters
  */
  public static ExportPublicationFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportPublicationFilters.class);
  }

 /**
  * Convert an instance of ExportPublicationFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

