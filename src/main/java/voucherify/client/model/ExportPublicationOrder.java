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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ExportPublicationOrder
 */
@JsonAdapter(ExportPublicationOrder.Adapter.class)
public enum ExportPublicationOrder {
  
  _ID("-id"),
  
  ID("id"),
  
  _VOUCHER_CODE("-voucher_code"),
  
  VOUCHER_CODE("voucher_code"),
  
  _TRACKING_ID("-tracking_id"),
  
  TRACKING_ID("tracking_id"),
  
  _CUSTOMER_ID("-customer_id"),
  
  CUSTOMER_ID("customer_id"),
  
  _CREATED_AT("-created_at"),
  
  CREATED_AT("created_at"),
  
  _CHANNEL("-channel"),
  
  CHANNEL("channel");

  private String value;

  ExportPublicationOrder(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExportPublicationOrder fromValue(String value) {
    for (ExportPublicationOrder b : ExportPublicationOrder.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ExportPublicationOrder> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExportPublicationOrder enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExportPublicationOrder read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExportPublicationOrder.fromValue(value);
    }
  }
}

