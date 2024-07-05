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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.CustomerBaseAddress;
import voucherify.client.model.CustomerLoyalty;
import voucherify.client.model.CustomerReferrals;
import voucherify.client.model.CustomerResponseDataAssets;
import voucherify.client.model.CustomerSummary;

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
 * CustomerWithSummaryLoyaltyReferrals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomerWithSummaryLoyaltyReferrals {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private LocalDate birthday;

  public static final String SERIALIZED_NAME_BIRTHDATE = "birthdate";
  @SerializedName(SERIALIZED_NAME_BIRTHDATE)
  private LocalDate birthdate;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CustomerBaseAddress address;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private CustomerSummary summary;

  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private CustomerLoyalty loyalty;

  public static final String SERIALIZED_NAME_REFERRALS = "referrals";
  @SerializedName(SERIALIZED_NAME_REFERRALS)
  private CustomerReferrals referrals;

  public static final String SERIALIZED_NAME_SYSTEM_METADATA = "system_metadata";
  @SerializedName(SERIALIZED_NAME_SYSTEM_METADATA)
  private Object systemMetadata;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private CustomerResponseDataAssets assets;

  /**
   * The type of the object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    CUSTOMER("customer"),
    
    UNKNOWN_ENUM("unknown_enum");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_ENUM;
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object = ObjectEnum.CUSTOMER;

  public CustomerWithSummaryLoyaltyReferrals() {
  }

  public CustomerWithSummaryLoyaltyReferrals name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer&#39;s first and last name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomerWithSummaryLoyaltyReferrals description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An arbitrary string that you can attach to a customer object.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomerWithSummaryLoyaltyReferrals email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerWithSummaryLoyaltyReferrals phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Customer&#39;s phone number. This parameter is mandatory when you try to send out codes to customers via an SMS channel.
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public CustomerWithSummaryLoyaltyReferrals birthday(LocalDate birthday) {
    
    this.birthday = birthday;
    return this;
  }

   /**
   * &#x60;Deprecated&#x60;. ~~Customer&#39;s birthdate; format YYYY-MM-DD~~.
   * @return birthday
  **/
  @javax.annotation.Nullable
  public LocalDate getBirthday() {
    return birthday;
  }


  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }


  public CustomerWithSummaryLoyaltyReferrals birthdate(LocalDate birthdate) {
    
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Customer&#39;s birthdate; format YYYY-MM-DD.
   * @return birthdate
  **/
  @javax.annotation.Nullable
  public LocalDate getBirthdate() {
    return birthdate;
  }


  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }


  public CustomerWithSummaryLoyaltyReferrals address(CustomerBaseAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public CustomerBaseAddress getAddress() {
    return address;
  }


  public void setAddress(CustomerBaseAddress address) {
    this.address = address;
  }


  public CustomerWithSummaryLoyaltyReferrals metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of custom key/value pairs that you can attach to a customer. The metadata object stores all custom attributes assigned to the customer. It can be useful for storing additional information about the customer in a structured format. This metadata can be used for validating whether the customer qualifies for a discount or it can be used in building customer segments.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public CustomerWithSummaryLoyaltyReferrals id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of an existing customer that will be linked to redemption in this request.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CustomerWithSummaryLoyaltyReferrals sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * A unique identifier of the customer who validates a voucher. It can be a customer ID or email from a CRM system, database, or a third-party service. If you also pass a customer ID (unique ID assigned by Voucherify), the source ID will be ignored.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public CustomerWithSummaryLoyaltyReferrals summary(CustomerSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  public CustomerSummary getSummary() {
    return summary;
  }


  public void setSummary(CustomerSummary summary) {
    this.summary = summary;
  }


  public CustomerWithSummaryLoyaltyReferrals loyalty(CustomerLoyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nullable
  public CustomerLoyalty getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(CustomerLoyalty loyalty) {
    this.loyalty = loyalty;
  }


  public CustomerWithSummaryLoyaltyReferrals referrals(CustomerReferrals referrals) {
    
    this.referrals = referrals;
    return this;
  }

   /**
   * Get referrals
   * @return referrals
  **/
  @javax.annotation.Nullable
  public CustomerReferrals getReferrals() {
    return referrals;
  }


  public void setReferrals(CustomerReferrals referrals) {
    this.referrals = referrals;
  }


  public CustomerWithSummaryLoyaltyReferrals systemMetadata(Object systemMetadata) {
    
    this.systemMetadata = systemMetadata;
    return this;
  }

   /**
   * Object used to store system metadata information.
   * @return systemMetadata
  **/
  @javax.annotation.Nullable
  public Object getSystemMetadata() {
    return systemMetadata;
  }


  public void setSystemMetadata(Object systemMetadata) {
    this.systemMetadata = systemMetadata;
  }


  public CustomerWithSummaryLoyaltyReferrals createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the customer was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CustomerWithSummaryLoyaltyReferrals updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the customer was updated. The value is shown in the ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CustomerWithSummaryLoyaltyReferrals assets(CustomerResponseDataAssets assets) {
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  public CustomerResponseDataAssets getAssets() {
    return assets;
  }


  public void setAssets(CustomerResponseDataAssets assets) {
    this.assets = assets;
  }


  public CustomerWithSummaryLoyaltyReferrals _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
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
   * @return the CustomerWithSummaryLoyaltyReferrals instance itself
   */
  public CustomerWithSummaryLoyaltyReferrals putAdditionalProperty(String key, Object value) {
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
    CustomerWithSummaryLoyaltyReferrals customerWithSummaryLoyaltyReferrals = (CustomerWithSummaryLoyaltyReferrals) o;
    return Objects.equals(this.name, customerWithSummaryLoyaltyReferrals.name) &&
        Objects.equals(this.description, customerWithSummaryLoyaltyReferrals.description) &&
        Objects.equals(this.email, customerWithSummaryLoyaltyReferrals.email) &&
        Objects.equals(this.phone, customerWithSummaryLoyaltyReferrals.phone) &&
        Objects.equals(this.birthday, customerWithSummaryLoyaltyReferrals.birthday) &&
        Objects.equals(this.birthdate, customerWithSummaryLoyaltyReferrals.birthdate) &&
        Objects.equals(this.address, customerWithSummaryLoyaltyReferrals.address) &&
        Objects.equals(this.metadata, customerWithSummaryLoyaltyReferrals.metadata) &&
        Objects.equals(this.id, customerWithSummaryLoyaltyReferrals.id) &&
        Objects.equals(this.sourceId, customerWithSummaryLoyaltyReferrals.sourceId) &&
        Objects.equals(this.summary, customerWithSummaryLoyaltyReferrals.summary) &&
        Objects.equals(this.loyalty, customerWithSummaryLoyaltyReferrals.loyalty) &&
        Objects.equals(this.referrals, customerWithSummaryLoyaltyReferrals.referrals) &&
        Objects.equals(this.systemMetadata, customerWithSummaryLoyaltyReferrals.systemMetadata) &&
        Objects.equals(this.createdAt, customerWithSummaryLoyaltyReferrals.createdAt) &&
        Objects.equals(this.updatedAt, customerWithSummaryLoyaltyReferrals.updatedAt) &&
        Objects.equals(this.assets, customerWithSummaryLoyaltyReferrals.assets) &&
        Objects.equals(this._object, customerWithSummaryLoyaltyReferrals._object)&&
        Objects.equals(this.additionalProperties, customerWithSummaryLoyaltyReferrals.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, email, phone, birthday, birthdate, address, metadata, id, sourceId, summary, loyalty, referrals, systemMetadata, createdAt, updatedAt, assets, _object, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerWithSummaryLoyaltyReferrals {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
    sb.append("    referrals: ").append(toIndentedString(referrals)).append("\n");
    sb.append("    systemMetadata: ").append(toIndentedString(systemMetadata)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("birthday");
    openapiFields.add("birthdate");
    openapiFields.add("address");
    openapiFields.add("metadata");
    openapiFields.add("id");
    openapiFields.add("source_id");
    openapiFields.add("summary");
    openapiFields.add("loyalty");
    openapiFields.add("referrals");
    openapiFields.add("system_metadata");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("assets");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerWithSummaryLoyaltyReferrals
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerWithSummaryLoyaltyReferrals.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerWithSummaryLoyaltyReferrals is not found in the empty JSON string", CustomerWithSummaryLoyaltyReferrals.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerWithSummaryLoyaltyReferrals.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        CustomerBaseAddress.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        CustomerSummary.validateJsonElement(jsonObj.get("summary"));
      }
      // validate the optional field `loyalty`
      if (jsonObj.get("loyalty") != null && !jsonObj.get("loyalty").isJsonNull()) {
        CustomerLoyalty.validateJsonElement(jsonObj.get("loyalty"));
      }
      // validate the optional field `referrals`
      if (jsonObj.get("referrals") != null && !jsonObj.get("referrals").isJsonNull()) {
        CustomerReferrals.validateJsonElement(jsonObj.get("referrals"));
      }
      // validate the optional field `assets`
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
        CustomerResponseDataAssets.validateJsonElement(jsonObj.get("assets"));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("object");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ObjectEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `object` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("object") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `object` to be a valid element of ObjectEnum enum got `%s` instead", jsonObj.get("object").toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerWithSummaryLoyaltyReferrals.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerWithSummaryLoyaltyReferrals' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerWithSummaryLoyaltyReferrals> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerWithSummaryLoyaltyReferrals.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerWithSummaryLoyaltyReferrals>() {
           @Override
           public void write(JsonWriter out, CustomerWithSummaryLoyaltyReferrals value) throws IOException {
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
           public CustomerWithSummaryLoyaltyReferrals read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CustomerWithSummaryLoyaltyReferrals instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomerWithSummaryLoyaltyReferrals given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerWithSummaryLoyaltyReferrals
  * @throws IOException if the JSON string is invalid with respect to CustomerWithSummaryLoyaltyReferrals
  */
  public static CustomerWithSummaryLoyaltyReferrals fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerWithSummaryLoyaltyReferrals.class);
  }

 /**
  * Convert an instance of CustomerWithSummaryLoyaltyReferrals to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

