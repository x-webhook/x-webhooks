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
import io.openweb3.xwebhook.models.MessageAttemptFailedData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Sent when a message delivery has failed (all of the retry attempts have been exhausted) as a \&quot;message.attempt.exhausted\&quot; type or after it&#39;s failed four times as a \&quot;message.attempt.failing\&quot; event.
 */
@ApiModel(description = "Sent when a message delivery has failed (all of the retry attempts have been exhausted) as a \"message.attempt.exhausted\" type or after it's failed four times as a \"message.attempt.failing\" event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-26T22:26:32.587823+08:00[Asia/Shanghai]")
public class MessageAttemptRecoveredEventData {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APP_UID = "appUid";
  @SerializedName(SERIALIZED_NAME_APP_UID)
  private String appUid;

  public static final String SERIALIZED_NAME_ENDPOINT_ID = "endpointId";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ID)
  private String endpointId;

  public static final String SERIALIZED_NAME_LAST_ATTEMPT = "lastAttempt";
  @SerializedName(SERIALIZED_NAME_LAST_ATTEMPT)
  private MessageAttemptFailedData lastAttempt;

  public static final String SERIALIZED_NAME_MSG_EVENT_ID = "msgEventId";
  @SerializedName(SERIALIZED_NAME_MSG_EVENT_ID)
  private String msgEventId;

  public static final String SERIALIZED_NAME_MSG_ID = "msgId";
  @SerializedName(SERIALIZED_NAME_MSG_ID)
  private String msgId;


  public MessageAttemptRecoveredEventData appId(String appId) {
    
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


  public MessageAttemptRecoveredEventData appUid(String appUid) {
    
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


  public MessageAttemptRecoveredEventData endpointId(String endpointId) {
    
    this.endpointId = endpointId;
    return this;
  }

   /**
   * The ep&#39;s ID
   * @return endpointId
  **/
  @ApiModelProperty(example = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The ep's ID")

  public String getEndpointId() {
    return endpointId;
  }


  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }


  public MessageAttemptRecoveredEventData lastAttempt(MessageAttemptFailedData lastAttempt) {
    
    this.lastAttempt = lastAttempt;
    return this;
  }

   /**
   * Get lastAttempt
   * @return lastAttempt
  **/
  @ApiModelProperty(required = true, value = "")

  public MessageAttemptFailedData getLastAttempt() {
    return lastAttempt;
  }


  public void setLastAttempt(MessageAttemptFailedData lastAttempt) {
    this.lastAttempt = lastAttempt;
  }


  public MessageAttemptRecoveredEventData msgEventId(String msgEventId) {
    
    this.msgEventId = msgEventId;
    return this;
  }

   /**
   * The msg&#39;s UID
   * @return msgEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-msg-identifier", value = "The msg's UID")

  public String getMsgEventId() {
    return msgEventId;
  }


  public void setMsgEventId(String msgEventId) {
    this.msgEventId = msgEventId;
  }


  public MessageAttemptRecoveredEventData msgId(String msgId) {
    
    this.msgId = msgId;
    return this;
  }

   /**
   * The msg&#39;s ID
   * @return msgId
  **/
  @ApiModelProperty(example = "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The msg's ID")

  public String getMsgId() {
    return msgId;
  }


  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageAttemptRecoveredEventData messageAttemptRecoveredEventData = (MessageAttemptRecoveredEventData) o;
    return Objects.equals(this.appId, messageAttemptRecoveredEventData.appId) &&
        Objects.equals(this.appUid, messageAttemptRecoveredEventData.appUid) &&
        Objects.equals(this.endpointId, messageAttemptRecoveredEventData.endpointId) &&
        Objects.equals(this.lastAttempt, messageAttemptRecoveredEventData.lastAttempt) &&
        Objects.equals(this.msgEventId, messageAttemptRecoveredEventData.msgEventId) &&
        Objects.equals(this.msgId, messageAttemptRecoveredEventData.msgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appUid, endpointId, lastAttempt, msgEventId, msgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageAttemptRecoveredEventData {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appUid: ").append(toIndentedString(appUid)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    lastAttempt: ").append(toIndentedString(lastAttempt)).append("\n");
    sb.append("    msgEventId: ").append(toIndentedString(msgEventId)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
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

