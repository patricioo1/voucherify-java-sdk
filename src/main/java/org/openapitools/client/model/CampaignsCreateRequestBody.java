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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CampaignBaseValidityTimeframe;
import org.openapitools.client.model.CampaignsCreateDiscountCouponsCampaign;
import org.openapitools.client.model.CampaignsCreateGiftCampaign;
import org.openapitools.client.model.CampaignsCreateGiveawayCampaign;
import org.openapitools.client.model.CampaignsCreateLoyaltyCampaign;
import org.openapitools.client.model.CampaignsCreatePromotionCampaign;
import org.openapitools.client.model.CampaignsCreateReferralCampaign;
import org.openapitools.client.model.GiveawayCampaignVoucher;
import org.openapitools.client.model.LuckyDraw;
import org.openapitools.client.model.ReferralProgram;
import org.openapitools.client.model.SchemaThatContainsUniquePropertiesForPromotionCampaignPromotion;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class CampaignsCreateRequestBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CampaignsCreateRequestBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CampaignsCreateRequestBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CampaignsCreateRequestBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CampaignsCreateDiscountCouponsCampaign> adapterCampaignsCreateDiscountCouponsCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsCreateDiscountCouponsCampaign.class));
            final TypeAdapter<CampaignsCreateReferralCampaign> adapterCampaignsCreateReferralCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsCreateReferralCampaign.class));
            final TypeAdapter<CampaignsCreateGiftCampaign> adapterCampaignsCreateGiftCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsCreateGiftCampaign.class));
            final TypeAdapter<CampaignsCreateLoyaltyCampaign> adapterCampaignsCreateLoyaltyCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsCreateLoyaltyCampaign.class));
            final TypeAdapter<CampaignsCreatePromotionCampaign> adapterCampaignsCreatePromotionCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsCreatePromotionCampaign.class));
            final TypeAdapter<CampaignsCreateGiveawayCampaign> adapterCampaignsCreateGiveawayCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsCreateGiveawayCampaign.class));

            return (TypeAdapter<T>) new TypeAdapter<CampaignsCreateRequestBody>() {
                @Override
                public void write(JsonWriter out, CampaignsCreateRequestBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CampaignsCreateDiscountCouponsCampaign`
                    if (value.getActualInstance() instanceof CampaignsCreateDiscountCouponsCampaign) {
                      JsonElement element = adapterCampaignsCreateDiscountCouponsCampaign.toJsonTree((CampaignsCreateDiscountCouponsCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsCreateReferralCampaign`
                    if (value.getActualInstance() instanceof CampaignsCreateReferralCampaign) {
                      JsonElement element = adapterCampaignsCreateReferralCampaign.toJsonTree((CampaignsCreateReferralCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsCreateGiftCampaign`
                    if (value.getActualInstance() instanceof CampaignsCreateGiftCampaign) {
                      JsonElement element = adapterCampaignsCreateGiftCampaign.toJsonTree((CampaignsCreateGiftCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsCreateLoyaltyCampaign`
                    if (value.getActualInstance() instanceof CampaignsCreateLoyaltyCampaign) {
                      JsonElement element = adapterCampaignsCreateLoyaltyCampaign.toJsonTree((CampaignsCreateLoyaltyCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsCreatePromotionCampaign`
                    if (value.getActualInstance() instanceof CampaignsCreatePromotionCampaign) {
                      JsonElement element = adapterCampaignsCreatePromotionCampaign.toJsonTree((CampaignsCreatePromotionCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsCreateGiveawayCampaign`
                    if (value.getActualInstance() instanceof CampaignsCreateGiveawayCampaign) {
                      JsonElement element = adapterCampaignsCreateGiveawayCampaign.toJsonTree((CampaignsCreateGiveawayCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CampaignsCreateDiscountCouponsCampaign, CampaignsCreateGiftCampaign, CampaignsCreateGiveawayCampaign, CampaignsCreateLoyaltyCampaign, CampaignsCreatePromotionCampaign, CampaignsCreateReferralCampaign");
                }

                @Override
                public CampaignsCreateRequestBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CampaignsCreateDiscountCouponsCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsCreateDiscountCouponsCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsCreateDiscountCouponsCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsCreateDiscountCouponsCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsCreateDiscountCouponsCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsCreateDiscountCouponsCampaign'", e);
                    }
                    // deserialize CampaignsCreateReferralCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsCreateReferralCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsCreateReferralCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsCreateReferralCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsCreateReferralCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsCreateReferralCampaign'", e);
                    }
                    // deserialize CampaignsCreateGiftCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsCreateGiftCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsCreateGiftCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsCreateGiftCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsCreateGiftCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsCreateGiftCampaign'", e);
                    }
                    // deserialize CampaignsCreateLoyaltyCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsCreateLoyaltyCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsCreateLoyaltyCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsCreateLoyaltyCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsCreateLoyaltyCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsCreateLoyaltyCampaign'", e);
                    }
                    // deserialize CampaignsCreatePromotionCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsCreatePromotionCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsCreatePromotionCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsCreatePromotionCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsCreatePromotionCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsCreatePromotionCampaign'", e);
                    }
                    // deserialize CampaignsCreateGiveawayCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsCreateGiveawayCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsCreateGiveawayCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsCreateGiveawayCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsCreateGiveawayCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsCreateGiveawayCampaign'", e);
                    }

                    if (match == 1) {
                        CampaignsCreateRequestBody ret = new CampaignsCreateRequestBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CampaignsCreateRequestBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CampaignsCreateRequestBody() {
        super("oneOf", Boolean.FALSE);
    }

    public CampaignsCreateRequestBody(CampaignsCreateDiscountCouponsCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsCreateRequestBody(CampaignsCreateGiftCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsCreateRequestBody(CampaignsCreateGiveawayCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsCreateRequestBody(CampaignsCreateLoyaltyCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsCreateRequestBody(CampaignsCreatePromotionCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsCreateRequestBody(CampaignsCreateReferralCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CampaignsCreateDiscountCouponsCampaign", CampaignsCreateDiscountCouponsCampaign.class);
        schemas.put("CampaignsCreateReferralCampaign", CampaignsCreateReferralCampaign.class);
        schemas.put("CampaignsCreateGiftCampaign", CampaignsCreateGiftCampaign.class);
        schemas.put("CampaignsCreateLoyaltyCampaign", CampaignsCreateLoyaltyCampaign.class);
        schemas.put("CampaignsCreatePromotionCampaign", CampaignsCreatePromotionCampaign.class);
        schemas.put("CampaignsCreateGiveawayCampaign", CampaignsCreateGiveawayCampaign.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CampaignsCreateRequestBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CampaignsCreateDiscountCouponsCampaign, CampaignsCreateGiftCampaign, CampaignsCreateGiveawayCampaign, CampaignsCreateLoyaltyCampaign, CampaignsCreatePromotionCampaign, CampaignsCreateReferralCampaign
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CampaignsCreateDiscountCouponsCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsCreateReferralCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsCreateGiftCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsCreateLoyaltyCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsCreatePromotionCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsCreateGiveawayCampaign) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CampaignsCreateDiscountCouponsCampaign, CampaignsCreateGiftCampaign, CampaignsCreateGiveawayCampaign, CampaignsCreateLoyaltyCampaign, CampaignsCreatePromotionCampaign, CampaignsCreateReferralCampaign");
    }

    /**
     * Get the actual instance, which can be the following:
     * CampaignsCreateDiscountCouponsCampaign, CampaignsCreateGiftCampaign, CampaignsCreateGiveawayCampaign, CampaignsCreateLoyaltyCampaign, CampaignsCreatePromotionCampaign, CampaignsCreateReferralCampaign
     *
     * @return The actual instance (CampaignsCreateDiscountCouponsCampaign, CampaignsCreateGiftCampaign, CampaignsCreateGiveawayCampaign, CampaignsCreateLoyaltyCampaign, CampaignsCreatePromotionCampaign, CampaignsCreateReferralCampaign)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CampaignsCreateDiscountCouponsCampaign`. If the actual instance is not `CampaignsCreateDiscountCouponsCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsCreateDiscountCouponsCampaign`
     * @throws ClassCastException if the instance is not `CampaignsCreateDiscountCouponsCampaign`
     */
    public CampaignsCreateDiscountCouponsCampaign getCampaignsCreateDiscountCouponsCampaign() throws ClassCastException {
        return (CampaignsCreateDiscountCouponsCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsCreateReferralCampaign`. If the actual instance is not `CampaignsCreateReferralCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsCreateReferralCampaign`
     * @throws ClassCastException if the instance is not `CampaignsCreateReferralCampaign`
     */
    public CampaignsCreateReferralCampaign getCampaignsCreateReferralCampaign() throws ClassCastException {
        return (CampaignsCreateReferralCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsCreateGiftCampaign`. If the actual instance is not `CampaignsCreateGiftCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsCreateGiftCampaign`
     * @throws ClassCastException if the instance is not `CampaignsCreateGiftCampaign`
     */
    public CampaignsCreateGiftCampaign getCampaignsCreateGiftCampaign() throws ClassCastException {
        return (CampaignsCreateGiftCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsCreateLoyaltyCampaign`. If the actual instance is not `CampaignsCreateLoyaltyCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsCreateLoyaltyCampaign`
     * @throws ClassCastException if the instance is not `CampaignsCreateLoyaltyCampaign`
     */
    public CampaignsCreateLoyaltyCampaign getCampaignsCreateLoyaltyCampaign() throws ClassCastException {
        return (CampaignsCreateLoyaltyCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsCreatePromotionCampaign`. If the actual instance is not `CampaignsCreatePromotionCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsCreatePromotionCampaign`
     * @throws ClassCastException if the instance is not `CampaignsCreatePromotionCampaign`
     */
    public CampaignsCreatePromotionCampaign getCampaignsCreatePromotionCampaign() throws ClassCastException {
        return (CampaignsCreatePromotionCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsCreateGiveawayCampaign`. If the actual instance is not `CampaignsCreateGiveawayCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsCreateGiveawayCampaign`
     * @throws ClassCastException if the instance is not `CampaignsCreateGiveawayCampaign`
     */
    public CampaignsCreateGiveawayCampaign getCampaignsCreateGiveawayCampaign() throws ClassCastException {
        return (CampaignsCreateGiveawayCampaign)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignsCreateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CampaignsCreateDiscountCouponsCampaign
    try {
      CampaignsCreateDiscountCouponsCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsCreateDiscountCouponsCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsCreateReferralCampaign
    try {
      CampaignsCreateReferralCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsCreateReferralCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsCreateGiftCampaign
    try {
      CampaignsCreateGiftCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsCreateGiftCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsCreateLoyaltyCampaign
    try {
      CampaignsCreateLoyaltyCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsCreateLoyaltyCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsCreatePromotionCampaign
    try {
      CampaignsCreatePromotionCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsCreatePromotionCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsCreateGiveawayCampaign
    try {
      CampaignsCreateGiveawayCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsCreateGiveawayCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CampaignsCreateRequestBody with oneOf schemas: CampaignsCreateDiscountCouponsCampaign, CampaignsCreateGiftCampaign, CampaignsCreateGiveawayCampaign, CampaignsCreateLoyaltyCampaign, CampaignsCreatePromotionCampaign, CampaignsCreateReferralCampaign. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of CampaignsCreateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsCreateRequestBody
  * @throws IOException if the JSON string is invalid with respect to CampaignsCreateRequestBody
  */
  public static CampaignsCreateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsCreateRequestBody.class);
  }

 /**
  * Convert an instance of CampaignsCreateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

