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
 * OAuthPayloadIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-03T02:14:02.049300+08:00[Asia/Shanghai]")
public class OAuthPayloadIn {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirectUri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;


  public OAuthPayloadIn code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public OAuthPayloadIn redirectUri(String redirectUri) {
    
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * Get redirectUri
   * @return redirectUri
  **/
  @ApiModelProperty(required = true, value = "")

  public String getRedirectUri() {
    return redirectUri;
  }


  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthPayloadIn oauthPayloadIn = (OAuthPayloadIn) o;
    return Objects.equals(this.code, oauthPayloadIn.code) &&
        Objects.equals(this.redirectUri, oauthPayloadIn.redirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, redirectUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthPayloadIn {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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

