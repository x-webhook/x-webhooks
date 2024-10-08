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
 * Duration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class Duration {
  public static final String SERIALIZED_NAME_NANOS = "nanos";
  @SerializedName(SERIALIZED_NAME_NANOS)
  private Integer nanos;

  public static final String SERIALIZED_NAME_SECS = "secs";
  @SerializedName(SERIALIZED_NAME_SECS)
  private Integer secs;


  public Duration nanos(Integer nanos) {
    
    this.nanos = nanos;
    return this;
  }

   /**
   * Get nanos
   * minimum: 0
   * @return nanos
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getNanos() {
    return nanos;
  }


  public void setNanos(Integer nanos) {
    this.nanos = nanos;
  }


  public Duration secs(Integer secs) {
    
    this.secs = secs;
    return this;
  }

   /**
   * Get secs
   * minimum: 0
   * @return secs
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getSecs() {
    return secs;
  }


  public void setSecs(Integer secs) {
    this.secs = secs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Duration duration = (Duration) o;
    return Objects.equals(this.nanos, duration.nanos) &&
        Objects.equals(this.secs, duration.secs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nanos, secs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duration {\n");
    sb.append("    nanos: ").append(toIndentedString(nanos)).append("\n");
    sb.append("    secs: ").append(toIndentedString(secs)).append("\n");
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

