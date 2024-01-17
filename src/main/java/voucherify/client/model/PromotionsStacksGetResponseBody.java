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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.Category;
import voucherify.client.model.PromotionStackBaseTiers;

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
 * Response body schema for **GET** &#x60;/promotions/{campaignId}/stacks/{stackId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PromotionsStacksGetResponseBody {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIERS = "tiers";
  @SerializedName(SERIALIZED_NAME_TIERS)
  private PromotionStackBaseTiers tiers;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  /**
   * The type of object represented by JSON. 
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    PROMOTION_STACK("promotion_stack");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
  private ObjectEnum _object = ObjectEnum.PROMOTION_STACK;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Category> categories = new ArrayList<>();

  public PromotionsStacksGetResponseBody() {
  }

  public PromotionsStacksGetResponseBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Promotion stack name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PromotionsStacksGetResponseBody tiers(PromotionStackBaseTiers tiers) {
    
    this.tiers = tiers;
    return this;
  }

   /**
   * Get tiers
   * @return tiers
  **/
  @javax.annotation.Nonnull
  public PromotionStackBaseTiers getTiers() {
    return tiers;
  }


  public void setTiers(PromotionStackBaseTiers tiers) {
    this.tiers = tiers;
  }


  public PromotionsStacksGetResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique promotion stack ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PromotionsStacksGetResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the promotion stack was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PromotionsStacksGetResponseBody updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the promotion stack was updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PromotionsStacksGetResponseBody campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Promotion stack&#39;s parent campaign&#39;s unique ID.
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public PromotionsStacksGetResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by JSON. 
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public PromotionsStacksGetResponseBody categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Promotion stack category ID.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public PromotionsStacksGetResponseBody categories(List<Category> categories) {
    
    this.categories = categories;
    return this;
  }

  public PromotionsStacksGetResponseBody addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Details about the category assigned to the promotion stack.
   * @return categories
  **/
  @javax.annotation.Nonnull
  public List<Category> getCategories() {
    return categories;
  }


  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionsStacksGetResponseBody promotionsStacksGetResponseBody = (PromotionsStacksGetResponseBody) o;
    return Objects.equals(this.name, promotionsStacksGetResponseBody.name) &&
        Objects.equals(this.tiers, promotionsStacksGetResponseBody.tiers) &&
        Objects.equals(this.id, promotionsStacksGetResponseBody.id) &&
        Objects.equals(this.createdAt, promotionsStacksGetResponseBody.createdAt) &&
        Objects.equals(this.updatedAt, promotionsStacksGetResponseBody.updatedAt) &&
        Objects.equals(this.campaignId, promotionsStacksGetResponseBody.campaignId) &&
        Objects.equals(this._object, promotionsStacksGetResponseBody._object) &&
        Objects.equals(this.categoryId, promotionsStacksGetResponseBody.categoryId) &&
        Objects.equals(this.categories, promotionsStacksGetResponseBody.categories);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tiers, id, createdAt, updatedAt, campaignId, _object, categoryId, categories);
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
    sb.append("class PromotionsStacksGetResponseBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    openapiFields.add("tiers");
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("campaign_id");
    openapiFields.add("object");
    openapiFields.add("category_id");
    openapiFields.add("categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("tiers");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("campaign_id");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("categories");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PromotionsStacksGetResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PromotionsStacksGetResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromotionsStacksGetResponseBody is not found in the empty JSON string", PromotionsStacksGetResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PromotionsStacksGetResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PromotionsStacksGetResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PromotionsStacksGetResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `tiers`
      PromotionStackBaseTiers.validateJsonElement(jsonObj.get("tiers"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
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
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }

      JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
      // validate the required field `categories` (array)
      for (int i = 0; i < jsonArraycategories.size(); i++) {
        Category.validateJsonElement(jsonArraycategories.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionsStacksGetResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionsStacksGetResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionsStacksGetResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionsStacksGetResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionsStacksGetResponseBody>() {
           @Override
           public void write(JsonWriter out, PromotionsStacksGetResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionsStacksGetResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionsStacksGetResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionsStacksGetResponseBody
  * @throws IOException if the JSON string is invalid with respect to PromotionsStacksGetResponseBody
  */
  public static PromotionsStacksGetResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionsStacksGetResponseBody.class);
  }

 /**
  * Convert an instance of PromotionsStacksGetResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

