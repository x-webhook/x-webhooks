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
 * EndpointMtlsConfigIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-08T17:18:16.954530+08:00[Asia/Shanghai]")
public class EndpointMtlsConfigIn {
  public static final String SERIALIZED_NAME_CA_CERT = "caCert";
  @SerializedName(SERIALIZED_NAME_CA_CERT)
  private String caCert;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;


  public EndpointMtlsConfigIn caCert(String caCert) {
    
    this.caCert = caCert;
    return this;
  }

   /**
   * A PEM encoded X509 certificate used to verify the webhook receiver&#39;s certificate.
   * @return caCert
  **/
  @ApiModelProperty(required = true, value = "A PEM encoded X509 certificate used to verify the webhook receiver's certificate.")

  public String getCaCert() {
    return caCert;
  }


  public void setCaCert(String caCert) {
    this.caCert = caCert;
  }


  public EndpointMtlsConfigIn identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * A PEM encoded private key and X509 certificate to identify the webhook sender.
   * @return identity
  **/
  @ApiModelProperty(required = true, value = "A PEM encoded private key and X509 certificate to identify the webhook sender.")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointMtlsConfigIn endpointMtlsConfigIn = (EndpointMtlsConfigIn) o;
    return Objects.equals(this.caCert, endpointMtlsConfigIn.caCert) &&
        Objects.equals(this.identity, endpointMtlsConfigIn.identity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCert, identity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointMtlsConfigIn {\n");
    sb.append("    caCert: ").append(toIndentedString(caCert)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
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

