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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The value of the headers is returned in the &#x60;headers&#x60; field.  Sensitive headers that have been redacted are returned in the sensitive field.
 */
@ApiModel(description = "The value of the headers is returned in the `headers` field.  Sensitive headers that have been redacted are returned in the sensitive field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T20:33:19.360168+08:00[Asia/Shanghai]")
public class EndpointHeadersOut {
  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = new HashMap<>();

  public static final String SERIALIZED_NAME_SENSITIVE = "sensitive";
  @SerializedName(SERIALIZED_NAME_SENSITIVE)
  private Set<String> sensitive = new LinkedHashSet<>();


  public EndpointHeadersOut headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public EndpointHeadersOut putHeadersItem(String key, String headersItem) {
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(example = "{\"X-Example\":\"123\",\"X-Foobar\":\"Bar\"}", required = true, value = "")

  public Map<String, String> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public EndpointHeadersOut sensitive(Set<String> sensitive) {
    
    this.sensitive = sensitive;
    return this;
  }

  public EndpointHeadersOut addSensitiveItem(String sensitiveItem) {
    this.sensitive.add(sensitiveItem);
    return this;
  }

   /**
   * Get sensitive
   * @return sensitive
  **/
  @ApiModelProperty(example = "[\"Authorization\"]", required = true, value = "")

  public Set<String> getSensitive() {
    return sensitive;
  }


  public void setSensitive(Set<String> sensitive) {
    this.sensitive = sensitive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointHeadersOut endpointHeadersOut = (EndpointHeadersOut) o;
    return Objects.equals(this.headers, endpointHeadersOut.headers) &&
        Objects.equals(this.sensitive, endpointHeadersOut.sensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, sensitive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointHeadersOut {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
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

