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
import voucherify.client.model.ClientValidationsValidateRequestBodyAllOfOptions;
import voucherify.client.model.Customer;
import voucherify.client.model.Order;
import voucherify.client.model.Session;
import voucherify.client.model.StackableValidateRedeemBaseRedeemablesItem;

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
 * Response body schema for **POST** &#x60;/validations&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ClientValidationsValidateRequestBody {
  public static final String SERIALIZED_NAME_REDEEMABLES = "redeemables";
  @SerializedName(SERIALIZED_NAME_REDEEMABLES)
  private List<StackableValidateRedeemBaseRedeemablesItem> redeemables = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private ClientValidationsValidateRequestBodyAllOfOptions options;

  public ClientValidationsValidateRequestBody() {
  }

  public ClientValidationsValidateRequestBody redeemables(List<StackableValidateRedeemBaseRedeemablesItem> redeemables) {
    
    this.redeemables = redeemables;
    return this;
  }

  public ClientValidationsValidateRequestBody addRedeemablesItem(StackableValidateRedeemBaseRedeemablesItem redeemablesItem) {
    if (this.redeemables == null) {
      this.redeemables = new ArrayList<>();
    }
    this.redeemables.add(redeemablesItem);
    return this;
  }

   /**
   * Get redeemables
   * @return redeemables
  **/
  @javax.annotation.Nonnull
  public List<StackableValidateRedeemBaseRedeemablesItem> getRedeemables() {
    return redeemables;
  }


  public void setRedeemables(List<StackableValidateRedeemBaseRedeemablesItem> redeemables) {
    this.redeemables = redeemables;
  }


  public ClientValidationsValidateRequestBody order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public ClientValidationsValidateRequestBody customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public ClientValidationsValidateRequestBody session(Session session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  public Session getSession() {
    return session;
  }


  public void setSession(Session session) {
    this.session = session;
  }


  public ClientValidationsValidateRequestBody trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Is correspondent to Customer&#39;s source_id
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public ClientValidationsValidateRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of key/value pairs that you can attach to a redemption object. It can be useful for storing additional information about the redemption in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public ClientValidationsValidateRequestBody options(ClientValidationsValidateRequestBodyAllOfOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public ClientValidationsValidateRequestBodyAllOfOptions getOptions() {
    return options;
  }


  public void setOptions(ClientValidationsValidateRequestBodyAllOfOptions options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientValidationsValidateRequestBody clientValidationsValidateRequestBody = (ClientValidationsValidateRequestBody) o;
    return Objects.equals(this.redeemables, clientValidationsValidateRequestBody.redeemables) &&
        Objects.equals(this.order, clientValidationsValidateRequestBody.order) &&
        Objects.equals(this.customer, clientValidationsValidateRequestBody.customer) &&
        Objects.equals(this.session, clientValidationsValidateRequestBody.session) &&
        Objects.equals(this.trackingId, clientValidationsValidateRequestBody.trackingId) &&
        Objects.equals(this.metadata, clientValidationsValidateRequestBody.metadata) &&
        Objects.equals(this.options, clientValidationsValidateRequestBody.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redeemables, order, customer, session, trackingId, metadata, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientValidationsValidateRequestBody {\n");
    sb.append("    redeemables: ").append(toIndentedString(redeemables)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("redeemables");
    openapiFields.add("order");
    openapiFields.add("customer");
    openapiFields.add("session");
    openapiFields.add("tracking_id");
    openapiFields.add("metadata");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("redeemables");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClientValidationsValidateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClientValidationsValidateRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientValidationsValidateRequestBody is not found in the empty JSON string", ClientValidationsValidateRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClientValidationsValidateRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientValidationsValidateRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClientValidationsValidateRequestBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("redeemables").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redeemables` to be an array in the JSON string but got `%s`", jsonObj.get("redeemables").toString()));
      }

      JsonArray jsonArrayredeemables = jsonObj.getAsJsonArray("redeemables");
      // validate the required field `redeemables` (array)
      for (int i = 0; i < jsonArrayredeemables.size(); i++) {
        StackableValidateRedeemBaseRedeemablesItem.validateJsonElement(jsonArrayredeemables.get(i));
      };
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        Order.validateJsonElement(jsonObj.get("order"));
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        Customer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `session`
      if (jsonObj.get("session") != null && !jsonObj.get("session").isJsonNull()) {
        Session.validateJsonElement(jsonObj.get("session"));
      }
      if ((jsonObj.get("tracking_id") != null && !jsonObj.get("tracking_id").isJsonNull()) && !jsonObj.get("tracking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_id").toString()));
      }
      // validate the optional field `options`
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        ClientValidationsValidateRequestBodyAllOfOptions.validateJsonElement(jsonObj.get("options"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientValidationsValidateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientValidationsValidateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientValidationsValidateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientValidationsValidateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientValidationsValidateRequestBody>() {
           @Override
           public void write(JsonWriter out, ClientValidationsValidateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientValidationsValidateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientValidationsValidateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientValidationsValidateRequestBody
  * @throws IOException if the JSON string is invalid with respect to ClientValidationsValidateRequestBody
  */
  public static ClientValidationsValidateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientValidationsValidateRequestBody.class);
  }

 /**
  * Convert an instance of ClientValidationsValidateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

