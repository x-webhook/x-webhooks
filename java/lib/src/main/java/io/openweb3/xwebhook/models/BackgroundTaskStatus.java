/*
 * Xwebhook API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openweb3.xwebhook.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets BackgroundTaskStatus
 */
@JsonAdapter(BackgroundTaskStatus.Adapter.class)
public enum BackgroundTaskStatus {
  
  RUNNING("running"),
  
  FINISHED("finished"),
  
  FAILED("failed");

  private String value;

  BackgroundTaskStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BackgroundTaskStatus fromValue(String value) {
    for (BackgroundTaskStatus b : BackgroundTaskStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BackgroundTaskStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BackgroundTaskStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BackgroundTaskStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BackgroundTaskStatus.fromValue(value);
    }
  }
}
