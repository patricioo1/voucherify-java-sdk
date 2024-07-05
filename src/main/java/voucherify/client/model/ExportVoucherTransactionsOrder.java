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
 * Gets or Sets ExportVoucherTransactionsOrder
 */
@JsonAdapter(ExportVoucherTransactionsOrder.Adapter.class)
public enum ExportVoucherTransactionsOrder {
  
  _CREATED_AT("-created_at"),
  
  CREATED_AT("created_at"),
  
  UNKNOWN_ENUM("unknown_enum");

  private String value;

  ExportVoucherTransactionsOrder(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExportVoucherTransactionsOrder fromValue(String value) {
    for (ExportVoucherTransactionsOrder b : ExportVoucherTransactionsOrder.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN_ENUM;
  }

  public static class Adapter extends TypeAdapter<ExportVoucherTransactionsOrder> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExportVoucherTransactionsOrder enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExportVoucherTransactionsOrder read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExportVoucherTransactionsOrder.fromValue(value);
    }
  }
}

