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
 * ApplicationStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T18:09:09.017597+08:00[Asia/Shanghai]")
public class ApplicationStats {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APP_UID = "appUid";
  @SerializedName(SERIALIZED_NAME_APP_UID)
  private String appUid;

  public static final String SERIALIZED_NAME_MESSAGE_DESTINATIONS = "messageDestinations";
  @SerializedName(SERIALIZED_NAME_MESSAGE_DESTINATIONS)
  private Integer messageDestinations;


  public ApplicationStats appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * The app&#39;s ID
   * @return appId
  **/
  @ApiModelProperty(example = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The app's ID")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ApplicationStats appUid(String appUid) {
    
    this.appUid = appUid;
    return this;
  }

   /**
   * The app&#39;s UID
   * @return appUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-app-identifier", value = "The app's UID")

  public String getAppUid() {
    return appUid;
  }


  public void setAppUid(String appUid) {
    this.appUid = appUid;
  }


  public ApplicationStats messageDestinations(Integer messageDestinations) {
    
    this.messageDestinations = messageDestinations;
    return this;
  }

   /**
   * Get messageDestinations
   * @return messageDestinations
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getMessageDestinations() {
    return messageDestinations;
  }


  public void setMessageDestinations(Integer messageDestinations) {
    this.messageDestinations = messageDestinations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationStats applicationStats = (ApplicationStats) o;
    return Objects.equals(this.appId, applicationStats.appId) &&
        Objects.equals(this.appUid, applicationStats.appUid) &&
        Objects.equals(this.messageDestinations, applicationStats.messageDestinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appUid, messageDestinations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationStats {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appUid: ").append(toIndentedString(appUid)).append("\n");
    sb.append("    messageDestinations: ").append(toIndentedString(messageDestinations)).append("\n");
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
