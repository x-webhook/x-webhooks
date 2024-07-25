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
 * Gets or Sets OauthJwsSigningAlgorithm
 */
@JsonAdapter(OauthJwsSigningAlgorithm.Adapter.class)
public enum OauthJwsSigningAlgorithm {
  
  RS256("RS256");

  private String value;

  OauthJwsSigningAlgorithm(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OauthJwsSigningAlgorithm fromValue(String value) {
    for (OauthJwsSigningAlgorithm b : OauthJwsSigningAlgorithm.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OauthJwsSigningAlgorithm> {
    @Override
    public void write(final JsonWriter jsonWriter, final OauthJwsSigningAlgorithm enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OauthJwsSigningAlgorithm read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OauthJwsSigningAlgorithm.fromValue(value);
    }
  }
}
