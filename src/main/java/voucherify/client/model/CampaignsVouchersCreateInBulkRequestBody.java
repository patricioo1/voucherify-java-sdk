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
import voucherify.client.model.CampaignsImportVoucherItemRedemption;
import voucherify.client.model.CodeConfig;

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
 * Request body schema for **POST** &#x60;/campaigns/{campaignId}/vouchers&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignsVouchersCreateInBulkRequestBody {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private CampaignsImportVoucherItemRedemption redemption;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CODE_CONFIG = "code_config";
  @SerializedName(SERIALIZED_NAME_CODE_CONFIG)
  private CodeConfig codeConfig;

  public CampaignsVouchersCreateInBulkRequestBody() {
  }

  public CampaignsVouchersCreateInBulkRequestBody category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CampaignsVouchersCreateInBulkRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the voucher. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public CampaignsVouchersCreateInBulkRequestBody redemption(CampaignsImportVoucherItemRedemption redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public CampaignsImportVoucherItemRedemption getRedemption() {
    return redemption;
  }


  public void setRedemption(CampaignsImportVoucherItemRedemption redemption) {
    this.redemption = redemption;
  }


  public CampaignsVouchersCreateInBulkRequestBody additionalInfo(String additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * An optional field to keep any extra textual information about the code such as a code description and details.
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public CampaignsVouchersCreateInBulkRequestBody startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Activation timestamp defines when the voucher starts to be active in ISO 8601 format. Voucher is *inactive before* this date. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public CampaignsVouchersCreateInBulkRequestBody expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration timestamp defines when the voucher expires in ISO 8601 format.  Voucher is *inactive after* this date.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public CampaignsVouchersCreateInBulkRequestBody code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Unique voucher code.
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CampaignsVouchersCreateInBulkRequestBody codeConfig(CodeConfig codeConfig) {
    
    this.codeConfig = codeConfig;
    return this;
  }

   /**
   * Get codeConfig
   * @return codeConfig
  **/
  @javax.annotation.Nullable
  public CodeConfig getCodeConfig() {
    return codeConfig;
  }


  public void setCodeConfig(CodeConfig codeConfig) {
    this.codeConfig = codeConfig;
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
   * @return the CampaignsVouchersCreateInBulkRequestBody instance itself
   */
  public CampaignsVouchersCreateInBulkRequestBody putAdditionalProperty(String key, Object value) {
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
    CampaignsVouchersCreateInBulkRequestBody campaignsVouchersCreateInBulkRequestBody = (CampaignsVouchersCreateInBulkRequestBody) o;
    return Objects.equals(this.category, campaignsVouchersCreateInBulkRequestBody.category) &&
        Objects.equals(this.metadata, campaignsVouchersCreateInBulkRequestBody.metadata) &&
        Objects.equals(this.redemption, campaignsVouchersCreateInBulkRequestBody.redemption) &&
        Objects.equals(this.additionalInfo, campaignsVouchersCreateInBulkRequestBody.additionalInfo) &&
        Objects.equals(this.startDate, campaignsVouchersCreateInBulkRequestBody.startDate) &&
        Objects.equals(this.expirationDate, campaignsVouchersCreateInBulkRequestBody.expirationDate) &&
        Objects.equals(this.code, campaignsVouchersCreateInBulkRequestBody.code) &&
        Objects.equals(this.codeConfig, campaignsVouchersCreateInBulkRequestBody.codeConfig)&&
        Objects.equals(this.additionalProperties, campaignsVouchersCreateInBulkRequestBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, metadata, redemption, additionalInfo, startDate, expirationDate, code, codeConfig, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsVouchersCreateInBulkRequestBody {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeConfig: ").append(toIndentedString(codeConfig)).append("\n");
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
    openapiFields.add("category");
    openapiFields.add("metadata");
    openapiFields.add("redemption");
    openapiFields.add("additional_info");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("code");
    openapiFields.add("code_config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignsVouchersCreateInBulkRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignsVouchersCreateInBulkRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignsVouchersCreateInBulkRequestBody is not found in the empty JSON string", CampaignsVouchersCreateInBulkRequestBody.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      // validate the optional field `redemption`
      if (jsonObj.get("redemption") != null && !jsonObj.get("redemption").isJsonNull()) {
        CampaignsImportVoucherItemRedemption.validateJsonElement(jsonObj.get("redemption"));
      }
      if ((jsonObj.get("additional_info") != null && !jsonObj.get("additional_info").isJsonNull()) && !jsonObj.get("additional_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_info").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the optional field `code_config`
      if (jsonObj.get("code_config") != null && !jsonObj.get("code_config").isJsonNull()) {
        CodeConfig.validateJsonElement(jsonObj.get("code_config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignsVouchersCreateInBulkRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignsVouchersCreateInBulkRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignsVouchersCreateInBulkRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignsVouchersCreateInBulkRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignsVouchersCreateInBulkRequestBody>() {
           @Override
           public void write(JsonWriter out, CampaignsVouchersCreateInBulkRequestBody value) throws IOException {
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
           public CampaignsVouchersCreateInBulkRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CampaignsVouchersCreateInBulkRequestBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignsVouchersCreateInBulkRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsVouchersCreateInBulkRequestBody
  * @throws IOException if the JSON string is invalid with respect to CampaignsVouchersCreateInBulkRequestBody
  */
  public static CampaignsVouchersCreateInBulkRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsVouchersCreateInBulkRequestBody.class);
  }

 /**
  * Convert an instance of CampaignsVouchersCreateInBulkRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

