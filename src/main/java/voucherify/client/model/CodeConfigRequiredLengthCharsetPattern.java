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
 * CodeConfigRequiredLengthCharsetPattern
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CodeConfigRequiredLengthCharsetPattern {
  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private BigDecimal length;

  public static final String SERIALIZED_NAME_CHARSET = "charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private String charset;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_POSTFIX = "postfix";
  @SerializedName(SERIALIZED_NAME_POSTFIX)
  private String postfix;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_INITIAL_COUNT = "initial_count";
  @SerializedName(SERIALIZED_NAME_INITIAL_COUNT)
  private Integer initialCount;

  public CodeConfigRequiredLengthCharsetPattern() {
  }

  public CodeConfigRequiredLengthCharsetPattern length(BigDecimal length) {
    
    this.length = length;
    return this;
  }

   /**
   * Number of characters in a generated code (excluding prefix and postfix).
   * @return length
  **/
  @javax.annotation.Nonnull
  public BigDecimal getLength() {
    return length;
  }


  public void setLength(BigDecimal length) {
    this.length = length;
  }


  public CodeConfigRequiredLengthCharsetPattern charset(String charset) {
    
    this.charset = charset;
    return this;
  }

   /**
   * Characters that can appear in the code.    Examples:  - Alphanumeric: &#x60;0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&#x60;  - Alphabetic: &#x60;abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&#x60;  - Alphabetic Lowercase: &#x60;abcdefghijklmnopqrstuvwxyz&#x60;  - Alphabetic Uppercase: &#x60;ABCDEFGHIJKLMNOPQRSTUVWXYZ&#x60;  - Numbers: &#x60;0123456789&#x60;   - Custom: a custom character set
   * @return charset
  **/
  @javax.annotation.Nonnull
  public String getCharset() {
    return charset;
  }


  public void setCharset(String charset) {
    this.charset = charset;
  }


  public CodeConfigRequiredLengthCharsetPattern prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * A text appended before the code.
   * @return prefix
  **/
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public CodeConfigRequiredLengthCharsetPattern postfix(String postfix) {
    
    this.postfix = postfix;
    return this;
  }

   /**
   * A text appended after the code.
   * @return postfix
  **/
  @javax.annotation.Nullable
  public String getPostfix() {
    return postfix;
  }


  public void setPostfix(String postfix) {
    this.postfix = postfix;
  }


  public CodeConfigRequiredLengthCharsetPattern pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * A pattern for codes where hashes (#) will be replaced with random characters. Overrides &#x60;length&#x60;.
   * @return pattern
  **/
  @javax.annotation.Nonnull
  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public CodeConfigRequiredLengthCharsetPattern initialCount(Integer initialCount) {
    
    this.initialCount = initialCount;
    return this;
  }

   /**
   * The initial count
   * @return initialCount
  **/
  @javax.annotation.Nullable
  public Integer getInitialCount() {
    return initialCount;
  }


  public void setInitialCount(Integer initialCount) {
    this.initialCount = initialCount;
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
   * @return the CodeConfigRequiredLengthCharsetPattern instance itself
   */
  public CodeConfigRequiredLengthCharsetPattern putAdditionalProperty(String key, Object value) {
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
    CodeConfigRequiredLengthCharsetPattern codeConfigRequiredLengthCharsetPattern = (CodeConfigRequiredLengthCharsetPattern) o;
    return Objects.equals(this.length, codeConfigRequiredLengthCharsetPattern.length) &&
        Objects.equals(this.charset, codeConfigRequiredLengthCharsetPattern.charset) &&
        Objects.equals(this.prefix, codeConfigRequiredLengthCharsetPattern.prefix) &&
        Objects.equals(this.postfix, codeConfigRequiredLengthCharsetPattern.postfix) &&
        Objects.equals(this.pattern, codeConfigRequiredLengthCharsetPattern.pattern) &&
        Objects.equals(this.initialCount, codeConfigRequiredLengthCharsetPattern.initialCount)&&
        Objects.equals(this.additionalProperties, codeConfigRequiredLengthCharsetPattern.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, charset, prefix, postfix, pattern, initialCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeConfigRequiredLengthCharsetPattern {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    postfix: ").append(toIndentedString(postfix)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    initialCount: ").append(toIndentedString(initialCount)).append("\n");
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
    openapiFields.add("length");
    openapiFields.add("charset");
    openapiFields.add("prefix");
    openapiFields.add("postfix");
    openapiFields.add("pattern");
    openapiFields.add("initial_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("length");
    openapiRequiredFields.add("charset");
    openapiRequiredFields.add("pattern");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CodeConfigRequiredLengthCharsetPattern
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CodeConfigRequiredLengthCharsetPattern.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodeConfigRequiredLengthCharsetPattern is not found in the empty JSON string", CodeConfigRequiredLengthCharsetPattern.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CodeConfigRequiredLengthCharsetPattern.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("charset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charset").toString()));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      if ((jsonObj.get("postfix") != null && !jsonObj.get("postfix").isJsonNull()) && !jsonObj.get("postfix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postfix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postfix").toString()));
      }
      if (!jsonObj.get("pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pattern").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodeConfigRequiredLengthCharsetPattern.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodeConfigRequiredLengthCharsetPattern' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodeConfigRequiredLengthCharsetPattern> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodeConfigRequiredLengthCharsetPattern.class));

       return (TypeAdapter<T>) new TypeAdapter<CodeConfigRequiredLengthCharsetPattern>() {
           @Override
           public void write(JsonWriter out, CodeConfigRequiredLengthCharsetPattern value) throws IOException {
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
           public CodeConfigRequiredLengthCharsetPattern read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CodeConfigRequiredLengthCharsetPattern instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CodeConfigRequiredLengthCharsetPattern given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodeConfigRequiredLengthCharsetPattern
  * @throws IOException if the JSON string is invalid with respect to CodeConfigRequiredLengthCharsetPattern
  */
  public static CodeConfigRequiredLengthCharsetPattern fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodeConfigRequiredLengthCharsetPattern.class);
  }

 /**
  * Convert an instance of CodeConfigRequiredLengthCharsetPattern to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

