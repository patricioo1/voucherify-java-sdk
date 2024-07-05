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
 * Object representing gift parameters. Child attributes are present only if &#x60;type&#x60; is &#x60;GIFT_VOUCHER&#x60;. Defaults to &#x60;null&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignsVouchersCreateCombinedResponseBodyGift {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  /**
   * Defines how the credits are applied to the customer&#39;s order.
   */
  @JsonAdapter(EffectEnum.Adapter.class)
  public enum EffectEnum {
    ORDER("APPLY_TO_ORDER"),
    
    ITEMS("APPLY_TO_ITEMS"),
    
    UNKNOWN_ENUM("unknown_enum");

    private String value;

    EffectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EffectEnum fromValue(String value) {
      for (EffectEnum b : EffectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_ENUM;
    }

    public static class Adapter extends TypeAdapter<EffectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EffectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EffectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private EffectEnum effect;

  public CampaignsVouchersCreateCombinedResponseBodyGift() {
  }

  public CampaignsVouchersCreateCombinedResponseBodyGift amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Total gift card income over the lifetime of the card. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000.
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public CampaignsVouchersCreateCombinedResponseBodyGift balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Available funds. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000.
   * @return balance
  **/
  @javax.annotation.Nullable
  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public CampaignsVouchersCreateCombinedResponseBodyGift effect(EffectEnum effect) {
    
    this.effect = effect;
    return this;
  }

   /**
   * Defines how the credits are applied to the customer&#39;s order.
   * @return effect
  **/
  @javax.annotation.Nullable
  public EffectEnum getEffect() {
    return effect;
  }


  public void setEffect(EffectEnum effect) {
    this.effect = effect;
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
   * @return the CampaignsVouchersCreateCombinedResponseBodyGift instance itself
   */
  public CampaignsVouchersCreateCombinedResponseBodyGift putAdditionalProperty(String key, Object value) {
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
    CampaignsVouchersCreateCombinedResponseBodyGift campaignsVouchersCreateCombinedResponseBodyGift = (CampaignsVouchersCreateCombinedResponseBodyGift) o;
    return Objects.equals(this.amount, campaignsVouchersCreateCombinedResponseBodyGift.amount) &&
        Objects.equals(this.balance, campaignsVouchersCreateCombinedResponseBodyGift.balance) &&
        Objects.equals(this.effect, campaignsVouchersCreateCombinedResponseBodyGift.effect)&&
        Objects.equals(this.additionalProperties, campaignsVouchersCreateCombinedResponseBodyGift.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, balance, effect, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsVouchersCreateCombinedResponseBodyGift {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("balance");
    openapiFields.add("effect");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignsVouchersCreateCombinedResponseBodyGift
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignsVouchersCreateCombinedResponseBodyGift.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignsVouchersCreateCombinedResponseBodyGift is not found in the empty JSON string", CampaignsVouchersCreateCombinedResponseBodyGift.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("effect") != null && !jsonObj.get("effect").isJsonNull()) && !jsonObj.get("effect").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effect` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effect").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("effect");

        if (objectElement != null && !objectElement.isJsonNull()) {
          EffectEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `effect` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("effect") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `effect` to be a valid element of EffectEnum enum got `%s` instead", jsonObj.get("effect").toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignsVouchersCreateCombinedResponseBodyGift.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignsVouchersCreateCombinedResponseBodyGift' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignsVouchersCreateCombinedResponseBodyGift> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignsVouchersCreateCombinedResponseBodyGift.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignsVouchersCreateCombinedResponseBodyGift>() {
           @Override
           public void write(JsonWriter out, CampaignsVouchersCreateCombinedResponseBodyGift value) throws IOException {
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
           public CampaignsVouchersCreateCombinedResponseBodyGift read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CampaignsVouchersCreateCombinedResponseBodyGift instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignsVouchersCreateCombinedResponseBodyGift given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsVouchersCreateCombinedResponseBodyGift
  * @throws IOException if the JSON string is invalid with respect to CampaignsVouchersCreateCombinedResponseBodyGift
  */
  public static CampaignsVouchersCreateCombinedResponseBodyGift fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsVouchersCreateCombinedResponseBodyGift.class);
  }

 /**
  * Convert an instance of CampaignsVouchersCreateCombinedResponseBodyGift to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

