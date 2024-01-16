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
import org.openapitools.client.model.EarningRuleProportionalCustomerMetadataCustomer;

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
 * EarningRuleProportionalCustomerMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class EarningRuleProportionalCustomerMetadata {
  /**
   * Defines how the points will be added to the loyalty card.PROPORTIONAL adds points based on a pre-defined ratio.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PROPORTIONAL("PROPORTIONAL");

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
  private TypeEnum type = TypeEnum.PROPORTIONAL;

  /**
   * CUSTOMER_METADATA: Customer Metadata (X points for every Y in metadata attribute, defined in the property key under the customer.metadata object)
   */
  @JsonAdapter(CalculationTypeEnum.Adapter.class)
  public enum CalculationTypeEnum {
    CUSTOMER_METADATA("CUSTOMER_METADATA");

    private String value;

    CalculationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CalculationTypeEnum fromValue(String value) {
      for (CalculationTypeEnum b : CalculationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CalculationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CalculationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CalculationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CalculationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CALCULATION_TYPE = "calculation_type";
  @SerializedName(SERIALIZED_NAME_CALCULATION_TYPE)
  private CalculationTypeEnum calculationType = CalculationTypeEnum.CUSTOMER_METADATA;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private EarningRuleProportionalCustomerMetadataCustomer customer;

  public EarningRuleProportionalCustomerMetadata() {
  }

  public EarningRuleProportionalCustomerMetadata type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines how the points will be added to the loyalty card.PROPORTIONAL adds points based on a pre-defined ratio.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public EarningRuleProportionalCustomerMetadata calculationType(CalculationTypeEnum calculationType) {
    
    this.calculationType = calculationType;
    return this;
  }

   /**
   * CUSTOMER_METADATA: Customer Metadata (X points for every Y in metadata attribute, defined in the property key under the customer.metadata object)
   * @return calculationType
  **/
  @javax.annotation.Nonnull
  public CalculationTypeEnum getCalculationType() {
    return calculationType;
  }


  public void setCalculationType(CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
  }


  public EarningRuleProportionalCustomerMetadata customer(EarningRuleProportionalCustomerMetadataCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public EarningRuleProportionalCustomerMetadataCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(EarningRuleProportionalCustomerMetadataCustomer customer) {
    this.customer = customer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningRuleProportionalCustomerMetadata earningRuleProportionalCustomerMetadata = (EarningRuleProportionalCustomerMetadata) o;
    return Objects.equals(this.type, earningRuleProportionalCustomerMetadata.type) &&
        Objects.equals(this.calculationType, earningRuleProportionalCustomerMetadata.calculationType) &&
        Objects.equals(this.customer, earningRuleProportionalCustomerMetadata.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, calculationType, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningRuleProportionalCustomerMetadata {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
    openapiFields.add("calculation_type");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("calculation_type");
    openapiRequiredFields.add("customer");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EarningRuleProportionalCustomerMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EarningRuleProportionalCustomerMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EarningRuleProportionalCustomerMetadata is not found in the empty JSON string", EarningRuleProportionalCustomerMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EarningRuleProportionalCustomerMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EarningRuleProportionalCustomerMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EarningRuleProportionalCustomerMetadata.openapiRequiredFields) {
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
      if (!jsonObj.get("calculation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calculation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calculation_type").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("calculation_type");

        if (objectElement != null && !objectElement.isJsonNull()) {
          CalculationTypeEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `calculation_type` to be not null");
        }
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Expected the field `calculation_type` to be a valid element of CalculationTypeEnum enum got `%s` instead", jsonObj.get("calculation_type").toString()));
      }
      // validate the required field `customer`
      EarningRuleProportionalCustomerMetadataCustomer.validateJsonElement(jsonObj.get("customer"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EarningRuleProportionalCustomerMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EarningRuleProportionalCustomerMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EarningRuleProportionalCustomerMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleProportionalCustomerMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<EarningRuleProportionalCustomerMetadata>() {
           @Override
           public void write(JsonWriter out, EarningRuleProportionalCustomerMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EarningRuleProportionalCustomerMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EarningRuleProportionalCustomerMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EarningRuleProportionalCustomerMetadata
  * @throws IOException if the JSON string is invalid with respect to EarningRuleProportionalCustomerMetadata
  */
  public static EarningRuleProportionalCustomerMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EarningRuleProportionalCustomerMetadata.class);
  }

 /**
  * Convert an instance of EarningRuleProportionalCustomerMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

