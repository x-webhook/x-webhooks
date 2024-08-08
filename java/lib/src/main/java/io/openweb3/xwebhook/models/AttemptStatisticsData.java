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
import java.util.List;

/**
 * AttemptStatisticsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-08T17:18:16.954530+08:00[Asia/Shanghai]")
public class AttemptStatisticsData {
  public static final String SERIALIZED_NAME_FAILURE_COUNT = "failureCount";
  @SerializedName(SERIALIZED_NAME_FAILURE_COUNT)
  private List<Integer> failureCount = null;

  public static final String SERIALIZED_NAME_SUCCESS_COUNT = "successCount";
  @SerializedName(SERIALIZED_NAME_SUCCESS_COUNT)
  private List<Integer> successCount = null;


  public AttemptStatisticsData failureCount(List<Integer> failureCount) {
    
    this.failureCount = failureCount;
    return this;
  }

  public AttemptStatisticsData addFailureCountItem(Integer failureCountItem) {
    if (this.failureCount == null) {
      this.failureCount = new ArrayList<>();
    }
    this.failureCount.add(failureCountItem);
    return this;
  }

   /**
   * Get failureCount
   * @return failureCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getFailureCount() {
    return failureCount;
  }


  public void setFailureCount(List<Integer> failureCount) {
    this.failureCount = failureCount;
  }


  public AttemptStatisticsData successCount(List<Integer> successCount) {
    
    this.successCount = successCount;
    return this;
  }

  public AttemptStatisticsData addSuccessCountItem(Integer successCountItem) {
    if (this.successCount == null) {
      this.successCount = new ArrayList<>();
    }
    this.successCount.add(successCountItem);
    return this;
  }

   /**
   * Get successCount
   * @return successCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSuccessCount() {
    return successCount;
  }


  public void setSuccessCount(List<Integer> successCount) {
    this.successCount = successCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttemptStatisticsData attemptStatisticsData = (AttemptStatisticsData) o;
    return Objects.equals(this.failureCount, attemptStatisticsData.failureCount) &&
        Objects.equals(this.successCount, attemptStatisticsData.successCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureCount, successCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttemptStatisticsData {\n");
    sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
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

