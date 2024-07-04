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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import voucherify.client.model.ExportsCreateResponseBodyParametersFilters;

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
 * ExportsCreateResponseBodyParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ExportsCreateResponseBodyParameters {
  /**
   * Gets or Sets order
   */
  @JsonAdapter(OrderEnum.Adapter.class)
  public enum OrderEnum {
    _CREATED_AT("-created_at"),
    
    CREATED_AT("created_at"),
    
    _UPDATED_AT("-updated_at"),
    
    UPDATED_AT("updated_at"),
    
    _CODE("-code"),
    
    CODE("code"),
    
    _ID("-id"),
    
    ID("id"),
    
    _VOUCHER_CODE("-voucher_code"),
    
    VOUCHER_CODE("voucher_code"),
    
    _TRACKING_ID("-tracking_id"),
    
    TRACKING_ID("tracking_id"),
    
    _CUSTOMER_ID("-customer_id"),
    
    CUSTOMER_ID("customer_id");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderEnum fromValue(String value) {
      for (OrderEnum b : OrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderEnum order;

  /**
   * Gets or Sets fields
   */
  @JsonAdapter(FieldsEnum.Adapter.class)
  public enum FieldsEnum {
    CODE("code"),
    
    VOUCHER_TYPE("voucher_type"),
    
    VALUE("value"),
    
    FORMULA("formula"),
    
    DISCOUNT_TYPE("discount_type"),
    
    CAMPAIGN("campaign"),
    
    CATEGORY("category"),
    
    START_DATE("start_date"),
    
    EXPIRATION_DATE("expiration_date"),
    
    GIFT_BALANCE("gift_balance"),
    
    LOYALTY_BALANCE("loyalty_balance"),
    
    REDEMPTION_QUANTITY("redemption_quantity"),
    
    REDEMPTION_COUNT("redemption_count"),
    
    ACTIVE("active"),
    
    QR_CODE("qr_code"),
    
    BAR_CODE("bar_code"),
    
    METADATA("metadata"),
    
    ID("id"),
    
    IS_REFERRAL_CODE("is_referral_code"),
    
    CREATED_AT("created_at"),
    
    UPDATED_AT("updated_at"),
    
    VALIDITY_TIMEFRAME_INTERVAL("validity_timeframe_interval"),
    
    VALIDITY_TIMEFRAME_DURATION("validity_timeframe_duration"),
    
    VALIDITY_DAY_OF_WEEK("validity_day_of_week"),
    
    DISCOUNT_AMOUNT_LIMIT("discount_amount_limit"),
    
    CAMPAIGN_ID("campaign_id"),
    
    ADDITIONAL_INFO("additional_info"),
    
    CUSTOMER_ID("customer_id"),
    
    DISCOUNT_EFFECT("discount_effect"),
    
    DISCOUNT_UNIT_TYPE("discount_unit_type"),
    
    DISCOUNT_UNIT_EFFECT("discount_unit_effect"),
    
    VALIDATION_RULES_ID("validation_rules_id"),
    
    CUSTOMER_SOURCE_ID("customer_source_id"),
    
    OBJECT("object"),
    
    DATE("date"),
    
    VOUCHER_CODE("voucher_code"),
    
    PROMOTION_TIER_ID("promotion_tier_id"),
    
    CUSTOMER_NAME("customer_name"),
    
    TRACKING_ID("tracking_id"),
    
    ORDER_ID("order_id"),
    
    ORDER_AMOUNT("order_amount"),
    
    GIFT_AMOUNT("gift_amount"),
    
    LOYALTY_POINTS("loyalty_points"),
    
    RESULT("result"),
    
    FAILURE_CODE("failure_code"),
    
    FAILURE_MESSAGE("failure_message"),
    
    NAME("name"),
    
    DESCRIPTION("description"),
    
    EMAIL("email"),
    
    SOURCE_ID("source_id"),
    
    ADDRESS_CITY("address_city"),
    
    ADDRESS_STATE("address_state"),
    
    ADDRESS_LINE_1("address_line_1"),
    
    ADDRESS_LINE_2("address_line_2"),
    
    ADDRESS_COUNTRY("address_country"),
    
    ADDRESS_POSTAL_CODE("address_postal_code"),
    
    REDEMPTIONS_TOTAL_REDEEMED("redemptions_total_redeemed"),
    
    REDEMPTIONS_TOTAL_FAILED("redemptions_total_failed"),
    
    REDEMPTIONS_TOTAL_SUCCEEDED("redemptions_total_succeeded"),
    
    REDEMPTIONS_TOTAL_ROLLED_BACK("redemptions_total_rolled_back"),
    
    REDEMPTIONS_TOTAL_ROLLBACK_FAILED("redemptions_total_rollback_failed"),
    
    REDEMPTIONS_TOTAL_ROLLBACK_SUCCEEDED("redemptions_total_rollback_succeeded"),
    
    ORDERS_TOTAL_AMOUNT("orders_total_amount"),
    
    ORDERS_TOTAL_COUNT("orders_total_count"),
    
    ORDERS_AVERAGE_AMOUNT("orders_average_amount"),
    
    ORDERS_LAST_ORDER_AMOUNT("orders_last_order_amount"),
    
    ORDERS_LAST_ORDER_DATE("orders_last_order_date"),
    
    LOYALTY_REFERRED_CUSTOMERS("loyalty_referred_customers"),
    
    PHONE("phone"),
    
    BIRTHDAY("birthday"),
    
    BIRTHDATE("birthdate"),
    
    CHANNEL("channel"),
    
    IS_WINNER("is_winner"),
    
    STATUS("status"),
    
    AMOUNT("amount"),
    
    DISCOUNT_AMOUNT("discount_amount"),
    
    ITEMS_DISCOUNT_AMOUNT("items_discount_amount"),
    
    TOTAL_DISCOUNT_AMOUNT("total_discount_amount"),
    
    TOTAL_AMOUNT("total_amount"),
    
    REFERRER_ID("referrer_id"),
    
    VOUCHER_ID("voucher_id"),
    
    POINTS("points"),
    
    EXPIRES_AT("expires_at"),
    
    TYPE("type"),
    
    REASON("reason"),
    
    SOURCE("source"),
    
    BALANCE("balance"),
    
    RELATED_TRANSACTION_ID("related_transaction_id"),
    
    DETAILS("details");

    private String value;

    FieldsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldsEnum fromValue(String value) {
      for (FieldsEnum b : FieldsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FieldsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FieldsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FieldsEnum> fields;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private ExportsCreateResponseBodyParametersFilters filters;

  public ExportsCreateResponseBodyParameters() {
  }

  public ExportsCreateResponseBodyParameters order(OrderEnum order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public OrderEnum getOrder() {
    return order;
  }


  public void setOrder(OrderEnum order) {
    this.order = order;
  }


  public ExportsCreateResponseBodyParameters fields(List<FieldsEnum> fields) {
    
    this.fields = fields;
    return this;
  }

  public ExportsCreateResponseBodyParameters addFieldsItem(FieldsEnum fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Array of strings containing the data in the export. These fields define the headers in the CSV file.
   * @return fields
  **/
  @javax.annotation.Nullable
  public List<FieldsEnum> getFields() {
    return fields;
  }


  public void setFields(List<FieldsEnum> fields) {
    this.fields = fields;
  }


  public ExportsCreateResponseBodyParameters filters(ExportsCreateResponseBodyParametersFilters filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public ExportsCreateResponseBodyParametersFilters getFilters() {
    return filters;
  }


  public void setFilters(ExportsCreateResponseBodyParametersFilters filters) {
    this.filters = filters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportsCreateResponseBodyParameters exportsCreateResponseBodyParameters = (ExportsCreateResponseBodyParameters) o;
    return Objects.equals(this.order, exportsCreateResponseBodyParameters.order) &&
        Objects.equals(this.fields, exportsCreateResponseBodyParameters.fields) &&
        Objects.equals(this.filters, exportsCreateResponseBodyParameters.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, fields, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportsCreateResponseBodyParameters {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("fields");
    openapiFields.add("filters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportsCreateResponseBodyParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportsCreateResponseBodyParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportsCreateResponseBodyParameters is not found in the empty JSON string", ExportsCreateResponseBodyParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportsCreateResponseBodyParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportsCreateResponseBodyParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("order");

        if (objectElement != null && !objectElement.isJsonNull()) {
          OrderEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `order` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("order") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `order` to be a valid element of OrderEnum enum got `%s` instead", jsonObj.get("order").toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull() && !jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        ExportsCreateResponseBodyParametersFilters.validateJsonElement(jsonObj.get("filters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportsCreateResponseBodyParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportsCreateResponseBodyParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportsCreateResponseBodyParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportsCreateResponseBodyParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportsCreateResponseBodyParameters>() {
           @Override
           public void write(JsonWriter out, ExportsCreateResponseBodyParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportsCreateResponseBodyParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportsCreateResponseBodyParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportsCreateResponseBodyParameters
  * @throws IOException if the JSON string is invalid with respect to ExportsCreateResponseBodyParameters
  */
  public static ExportsCreateResponseBodyParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportsCreateResponseBodyParameters.class);
  }

 /**
  * Convert an instance of ExportsCreateResponseBodyParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

