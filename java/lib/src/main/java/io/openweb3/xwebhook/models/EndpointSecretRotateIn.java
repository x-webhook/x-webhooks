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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EndpointSecretRotateIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class EndpointSecretRotateIn {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;


  public EndpointSecretRotateIn key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD", value = "The endpoint's verification secret. If `null` is passed, a secret is automatically generated. Format: `base64` encoded random bytes optionally prefixed with `whsec_`. Recommended size: 24.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointSecretRotateIn endpointSecretRotateIn = (EndpointSecretRotateIn) o;
    return Objects.equals(this.key, endpointSecretRotateIn.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointSecretRotateIn {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

}

