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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * MessageAttemptHeadersOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T20:33:19.360168+08:00[Asia/Shanghai]")
public class MessageAttemptHeadersOut {
  public static final String SERIALIZED_NAME_RESPONSE_HEADERS = "responseHeaders";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADERS)
  private List<List<String>> responseHeaders = null;

  public static final String SERIALIZED_NAME_SENSITIVE = "sensitive";
  @SerializedName(SERIALIZED_NAME_SENSITIVE)
  private Set<String> sensitive = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SENT_HEADERS = "sentHeaders";
  @SerializedName(SERIALIZED_NAME_SENT_HEADERS)
  private Map<String, String> sentHeaders = new HashMap<>();


  public MessageAttemptHeadersOut responseHeaders(List<List<String>> responseHeaders) {
    
    this.responseHeaders = responseHeaders;
    return this;
  }

  public MessageAttemptHeadersOut addResponseHeadersItem(List<String> responseHeadersItem) {
    if (this.responseHeaders == null) {
      this.responseHeaders = new ArrayList<>();
    }
    this.responseHeaders.add(responseHeadersItem);
    return this;
  }

   /**
   * Get responseHeaders
   * @return responseHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<String>> getResponseHeaders() {
    return responseHeaders;
  }


  public void setResponseHeaders(List<List<String>> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }


  public MessageAttemptHeadersOut sensitive(Set<String> sensitive) {
    
    this.sensitive = sensitive;
    return this;
  }

  public MessageAttemptHeadersOut addSensitiveItem(String sensitiveItem) {
    this.sensitive.add(sensitiveItem);
    return this;
  }

   /**
   * Get sensitive
   * @return sensitive
  **/
  @ApiModelProperty(required = true, value = "")

  public Set<String> getSensitive() {
    return sensitive;
  }


  public void setSensitive(Set<String> sensitive) {
    this.sensitive = sensitive;
  }


  public MessageAttemptHeadersOut sentHeaders(Map<String, String> sentHeaders) {
    
    this.sentHeaders = sentHeaders;
    return this;
  }

  public MessageAttemptHeadersOut putSentHeadersItem(String key, String sentHeadersItem) {
    this.sentHeaders.put(key, sentHeadersItem);
    return this;
  }

   /**
   * Get sentHeaders
   * @return sentHeaders
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getSentHeaders() {
    return sentHeaders;
  }


  public void setSentHeaders(Map<String, String> sentHeaders) {
    this.sentHeaders = sentHeaders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageAttemptHeadersOut messageAttemptHeadersOut = (MessageAttemptHeadersOut) o;
    return Objects.equals(this.responseHeaders, messageAttemptHeadersOut.responseHeaders) &&
        Objects.equals(this.sensitive, messageAttemptHeadersOut.sensitive) &&
        Objects.equals(this.sentHeaders, messageAttemptHeadersOut.sentHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeaders, sensitive, sentHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageAttemptHeadersOut {\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    sentHeaders: ").append(toIndentedString(sentHeaders)).append("\n");
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

