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
 * Gets or Sets TransformationTemplateKind
 */
@JsonAdapter(TransformationTemplateKind.Adapter.class)
public enum TransformationTemplateKind {
  
  CUSTOM("Custom"),
  
  CUSTOMERIO("CustomerIO"),
  
  DISCORD("Discord"),
  
  HUBSPOT("Hubspot"),
  
  INNGEST("Inngest"),
  
  SALESFORCE("Salesforce"),
  
  SEGMENT("Segment"),
  
  SLACK("Slack"),
  
  TEAMS("Teams"),
  
  TRIGGERDEV("TriggerDev"),
  
  WINDMILL("Windmill"),
  
  ZAPIER("Zapier");

  private String value;

  TransformationTemplateKind(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransformationTemplateKind fromValue(String value) {
    for (TransformationTemplateKind b : TransformationTemplateKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TransformationTemplateKind> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransformationTemplateKind enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransformationTemplateKind read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransformationTemplateKind.fromValue(value);
    }
  }
}

