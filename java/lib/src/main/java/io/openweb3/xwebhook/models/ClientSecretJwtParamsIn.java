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
import io.openweb3.xwebhook.models.OauthJwsSigningAlgorithm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ClientSecretJwtParamsIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-08T17:18:16.954530+08:00[Asia/Shanghai]")
public class ClientSecretJwtParamsIn {
  public static final String SERIALIZED_NAME_SECRET_BASE64 = "secretBase64";
  @SerializedName(SERIALIZED_NAME_SECRET_BASE64)
  private String secretBase64;

  public static final String SERIALIZED_NAME_SECRET_ID = "secretId";
  @SerializedName(SERIALIZED_NAME_SECRET_ID)
  private String secretId;

  public static final String SERIALIZED_NAME_SIGNING_ALGORITHM = "signingAlgorithm";
  @SerializedName(SERIALIZED_NAME_SIGNING_ALGORITHM)
  private OauthJwsSigningAlgorithm signingAlgorithm;

  public static final String SERIALIZED_NAME_TOKEN_EXPIRY_SECS = "tokenExpirySecs";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXPIRY_SECS)
  private Integer tokenExpirySecs;


  public ClientSecretJwtParamsIn secretBase64(String secretBase64) {
    
    this.secretBase64 = secretBase64;
    return this;
  }

   /**
   * The base64-encoded secret used for signing the JWT.
   * @return secretBase64
  **/
  @ApiModelProperty(required = true, value = "The base64-encoded secret used for signing the JWT.")

  public String getSecretBase64() {
    return secretBase64;
  }


  public void setSecretBase64(String secretBase64) {
    this.secretBase64 = secretBase64;
  }


  public ClientSecretJwtParamsIn secretId(String secretId) {
    
    this.secretId = secretId;
    return this;
  }

   /**
   * Optional secret identifier. If supplied, this will be populated in the JWT header in the &#x60;kid&#x60; field.
   * @return secretId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional secret identifier. If supplied, this will be populated in the JWT header in the `kid` field.")

  public String getSecretId() {
    return secretId;
  }


  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }


  public ClientSecretJwtParamsIn signingAlgorithm(OauthJwsSigningAlgorithm signingAlgorithm) {
    
    this.signingAlgorithm = signingAlgorithm;
    return this;
  }

   /**
   * Get signingAlgorithm
   * @return signingAlgorithm
  **/
  @ApiModelProperty(required = true, value = "")

  public OauthJwsSigningAlgorithm getSigningAlgorithm() {
    return signingAlgorithm;
  }


  public void setSigningAlgorithm(OauthJwsSigningAlgorithm signingAlgorithm) {
    this.signingAlgorithm = signingAlgorithm;
  }


  public ClientSecretJwtParamsIn tokenExpirySecs(Integer tokenExpirySecs) {
    
    this.tokenExpirySecs = tokenExpirySecs;
    return this;
  }

   /**
   * Optional number of seconds after which the JWT should expire. Defaults to 300 seconds.
   * minimum: 0
   * @return tokenExpirySecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional number of seconds after which the JWT should expire. Defaults to 300 seconds.")

  public Integer getTokenExpirySecs() {
    return tokenExpirySecs;
  }


  public void setTokenExpirySecs(Integer tokenExpirySecs) {
    this.tokenExpirySecs = tokenExpirySecs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSecretJwtParamsIn clientSecretJwtParamsIn = (ClientSecretJwtParamsIn) o;
    return Objects.equals(this.secretBase64, clientSecretJwtParamsIn.secretBase64) &&
        Objects.equals(this.secretId, clientSecretJwtParamsIn.secretId) &&
        Objects.equals(this.signingAlgorithm, clientSecretJwtParamsIn.signingAlgorithm) &&
        Objects.equals(this.tokenExpirySecs, clientSecretJwtParamsIn.tokenExpirySecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretBase64, secretId, signingAlgorithm, tokenExpirySecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientSecretJwtParamsIn {\n");
    sb.append("    secretBase64: ").append(toIndentedString(secretBase64)).append("\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    signingAlgorithm: ").append(toIndentedString(signingAlgorithm)).append("\n");
    sb.append("    tokenExpirySecs: ").append(toIndentedString(tokenExpirySecs)).append("\n");
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

