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
import io.openweb3.xwebhook.models.BackgroundTaskStatus;
import io.openweb3.xwebhook.models.BackgroundTaskType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MessageBroadcastOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T20:33:19.360168+08:00[Asia/Shanghai]")
public class MessageBroadcastOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BackgroundTaskStatus status;

  public static final String SERIALIZED_NAME_TASK = "task";
  @SerializedName(SERIALIZED_NAME_TASK)
  private BackgroundTaskType task;


  public MessageBroadcastOut id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MessageBroadcastOut status(BackgroundTaskStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public BackgroundTaskStatus getStatus() {
    return status;
  }


  public void setStatus(BackgroundTaskStatus status) {
    this.status = status;
  }


  public MessageBroadcastOut task(BackgroundTaskType task) {
    
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @ApiModelProperty(required = true, value = "")

  public BackgroundTaskType getTask() {
    return task;
  }


  public void setTask(BackgroundTaskType task) {
    this.task = task;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageBroadcastOut messageBroadcastOut = (MessageBroadcastOut) o;
    return Objects.equals(this.id, messageBroadcastOut.id) &&
        Objects.equals(this.status, messageBroadcastOut.status) &&
        Objects.equals(this.task, messageBroadcastOut.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, task);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageBroadcastOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
