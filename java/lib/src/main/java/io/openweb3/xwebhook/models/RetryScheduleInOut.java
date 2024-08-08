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
import io.openweb3.xwebhook.models.Duration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RetryScheduleInOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-08T17:18:16.954530+08:00[Asia/Shanghai]")
public class RetryScheduleInOut {
  public static final String SERIALIZED_NAME_RETRY_SCHEDULE = "retrySchedule";
  @SerializedName(SERIALIZED_NAME_RETRY_SCHEDULE)
  private List<Duration> retrySchedule = null;


  public RetryScheduleInOut retrySchedule(List<Duration> retrySchedule) {
    
    this.retrySchedule = retrySchedule;
    return this;
  }

  public RetryScheduleInOut addRetryScheduleItem(Duration retryScheduleItem) {
    if (this.retrySchedule == null) {
      this.retrySchedule = new ArrayList<>();
    }
    this.retrySchedule.add(retryScheduleItem);
    return this;
  }

   /**
   * Get retrySchedule
   * @return retrySchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Duration> getRetrySchedule() {
    return retrySchedule;
  }


  public void setRetrySchedule(List<Duration> retrySchedule) {
    this.retrySchedule = retrySchedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryScheduleInOut retryScheduleInOut = (RetryScheduleInOut) o;
    return Objects.equals(this.retrySchedule, retryScheduleInOut.retrySchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retrySchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryScheduleInOut {\n");
    sb.append("    retrySchedule: ").append(toIndentedString(retrySchedule)).append("\n");
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

