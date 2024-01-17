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
import java.math.BigDecimal;
import java.util.Arrays;
import voucherify.client.model.DiscountAmountVouchersEffectTypes;

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
 * DiscountAmount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DiscountAmount {
  /**
   * Defines the type of the voucher.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AMOUNT("AMOUNT"),
    
    UNIT("UNIT"),
    
    PERCENT("PERCENT"),
    
    FIXED("FIXED");

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
  private TypeEnum type = TypeEnum.AMOUNT;

  public static final String SERIALIZED_NAME_AMOUNT_OFF = "amount_off";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OFF)
  private BigDecimal amountOff;

  public static final String SERIALIZED_NAME_AMOUNT_OFF_FORMULA = "amount_off_formula";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OFF_FORMULA)
  private String amountOffFormula;

  public static final String SERIALIZED_NAME_AGGREGATED_AMOUNT_LIMIT = "aggregated_amount_limit";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_AMOUNT_LIMIT)
  private Integer aggregatedAmountLimit;

  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private DiscountAmountVouchersEffectTypes effect;

  public static final String SERIALIZED_NAME_IS_DYNAMIC = "is_dynamic";
  @SerializedName(SERIALIZED_NAME_IS_DYNAMIC)
  private Boolean isDynamic;

  public DiscountAmount() {
  }

  public DiscountAmount type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the type of the voucher.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public DiscountAmount amountOff(BigDecimal amountOff) {
    
    this.amountOff = amountOff;
    return this;
  }

   /**
   * Amount taken off the subtotal of a price. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 discount is written as 1000.
   * @return amountOff
  **/
  @javax.annotation.Nonnull
  public BigDecimal getAmountOff() {
    return amountOff;
  }


  public void setAmountOff(BigDecimal amountOff) {
    this.amountOff = amountOff;
  }


  public DiscountAmount amountOffFormula(String amountOffFormula) {
    
    this.amountOffFormula = amountOffFormula;
    return this;
  }

   /**
   * Get amountOffFormula
   * @return amountOffFormula
  **/
  @javax.annotation.Nullable
  public String getAmountOffFormula() {
    return amountOffFormula;
  }


  public void setAmountOffFormula(String amountOffFormula) {
    this.amountOffFormula = amountOffFormula;
  }


  public DiscountAmount aggregatedAmountLimit(Integer aggregatedAmountLimit) {
    
    this.aggregatedAmountLimit = aggregatedAmountLimit;
    return this;
  }

   /**
   * Maximum discount amount per order.
   * @return aggregatedAmountLimit
  **/
  @javax.annotation.Nullable
  public Integer getAggregatedAmountLimit() {
    return aggregatedAmountLimit;
  }


  public void setAggregatedAmountLimit(Integer aggregatedAmountLimit) {
    this.aggregatedAmountLimit = aggregatedAmountLimit;
  }


  public DiscountAmount effect(DiscountAmountVouchersEffectTypes effect) {
    
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @javax.annotation.Nullable
  public DiscountAmountVouchersEffectTypes getEffect() {
    return effect;
  }


  public void setEffect(DiscountAmountVouchersEffectTypes effect) {
    this.effect = effect;
  }


  public DiscountAmount isDynamic(Boolean isDynamic) {
    
    this.isDynamic = isDynamic;
    return this;
  }

   /**
   * Flag indicating whether the discount was calculated using a formula.
   * @return isDynamic
  **/
  @javax.annotation.Nullable
  public Boolean getIsDynamic() {
    return isDynamic;
  }


  public void setIsDynamic(Boolean isDynamic) {
    this.isDynamic = isDynamic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountAmount discountAmount = (DiscountAmount) o;
    return Objects.equals(this.type, discountAmount.type) &&
        Objects.equals(this.amountOff, discountAmount.amountOff) &&
        Objects.equals(this.amountOffFormula, discountAmount.amountOffFormula) &&
        Objects.equals(this.aggregatedAmountLimit, discountAmount.aggregatedAmountLimit) &&
        Objects.equals(this.effect, discountAmount.effect) &&
        Objects.equals(this.isDynamic, discountAmount.isDynamic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amountOff, amountOffFormula, aggregatedAmountLimit, effect, isDynamic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountAmount {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amountOff: ").append(toIndentedString(amountOff)).append("\n");
    sb.append("    amountOffFormula: ").append(toIndentedString(amountOffFormula)).append("\n");
    sb.append("    aggregatedAmountLimit: ").append(toIndentedString(aggregatedAmountLimit)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    isDynamic: ").append(toIndentedString(isDynamic)).append("\n");
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
    openapiFields.add("amount_off");
    openapiFields.add("amount_off_formula");
    openapiFields.add("aggregated_amount_limit");
    openapiFields.add("effect");
    openapiFields.add("is_dynamic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("amount_off");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DiscountAmount
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DiscountAmount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscountAmount is not found in the empty JSON string", DiscountAmount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DiscountAmount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscountAmount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DiscountAmount.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
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
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a valid element of TypeEnum enum got `%s` instead", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("amount_off_formula") != null && !jsonObj.get("amount_off_formula").isJsonNull()) && !jsonObj.get("amount_off_formula").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_off_formula` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_off_formula").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscountAmount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscountAmount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscountAmount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscountAmount.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscountAmount>() {
           @Override
           public void write(JsonWriter out, DiscountAmount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscountAmount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiscountAmount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscountAmount
  * @throws IOException if the JSON string is invalid with respect to DiscountAmount
  */
  public static DiscountAmount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscountAmount.class);
  }

 /**
  * Convert an instance of DiscountAmount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

