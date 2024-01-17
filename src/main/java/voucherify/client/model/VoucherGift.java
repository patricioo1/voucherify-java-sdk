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

public class VoucherGift {
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
    
    ITEMS("APPLY_TO_ITEMS");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public VoucherGift() {
  }

  public VoucherGift amount(Integer amount) {
    
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


  public VoucherGift balance(Integer balance) {
    
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


  public VoucherGift effect(EffectEnum effect) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherGift voucherGift = (VoucherGift) o;
    return Objects.equals(this.amount, voucherGift.amount) &&
        Objects.equals(this.balance, voucherGift.balance) &&
        Objects.equals(this.effect, voucherGift.effect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, balance, effect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherGift {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to VoucherGift
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VoucherGift.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherGift is not found in the empty JSON string", VoucherGift.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VoucherGift.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherGift` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("effect") != null && !jsonObj.get("effect").isJsonNull()) && !jsonObj.get("effect").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effect` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effect").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherGift.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherGift' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherGift> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherGift.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherGift>() {
           @Override
           public void write(JsonWriter out, VoucherGift value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherGift read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherGift given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherGift
  * @throws IOException if the JSON string is invalid with respect to VoucherGift
  */
  public static VoucherGift fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherGift.class);
  }

 /**
  * Convert an instance of VoucherGift to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

