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
import io.openweb3.xwebhook.models.MessageAttemptTriggerType;
import io.openweb3.xwebhook.models.MessageOut;
import io.openweb3.xwebhook.models.MessageStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;

/**
 * MessageAttemptEndpointOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T18:09:09.017597+08:00[Asia/Shanghai]")
public class MessageAttemptEndpointOut {
  public static final String SERIALIZED_NAME_ENDPOINT_ID = "endpointId";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ID)
  private String endpointId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private MessageOut msg;

  public static final String SERIALIZED_NAME_MSG_ID = "msgId";
  @SerializedName(SERIALIZED_NAME_MSG_ID)
  private String msgId;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "responseStatusCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
  private Integer responseStatusCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MessageStatus status;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TRIGGER_TYPE = "triggerType";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TYPE)
  private MessageAttemptTriggerType triggerType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;


  public MessageAttemptEndpointOut endpointId(String endpointId) {
    
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


  public MessageAttemptEndpointOut id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The attempt&#39;s ID
   * @return id
  **/
  @ApiModelProperty(example = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The attempt's ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MessageAttemptEndpointOut msg(MessageOut msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MessageOut getMsg() {
    return msg;
  }


  public void setMsg(MessageOut msg) {
    this.msg = msg;
  }


  public MessageAttemptEndpointOut msgId(String msgId) {
    
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


  public MessageAttemptEndpointOut response(String response) {
    
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(example = "{}", required = true, value = "")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    this.response = response;
  }


  public MessageAttemptEndpointOut responseStatusCode(Integer responseStatusCode) {
    
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * Get responseStatusCode
   * @return responseStatusCode
  **/
  @ApiModelProperty(example = "200", required = true, value = "")

  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }


  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  public MessageAttemptEndpointOut status(MessageStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public MessageStatus getStatus() {
    return status;
  }


  public void setStatus(MessageStatus status) {
    this.status = status;
  }


  public MessageAttemptEndpointOut timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public MessageAttemptEndpointOut triggerType(MessageAttemptTriggerType triggerType) {
    
    this.triggerType = triggerType;
    return this;
  }

   /**
   * Get triggerType
   * @return triggerType
  **/
  @ApiModelProperty(required = true, value = "")

  public MessageAttemptTriggerType getTriggerType() {
    return triggerType;
  }


  public void setTriggerType(MessageAttemptTriggerType triggerType) {
    this.triggerType = triggerType;
  }


  public MessageAttemptEndpointOut url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "https://example.com/webhook/", required = true, value = "")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageAttemptEndpointOut messageAttemptEndpointOut = (MessageAttemptEndpointOut) o;
    return Objects.equals(this.endpointId, messageAttemptEndpointOut.endpointId) &&
        Objects.equals(this.id, messageAttemptEndpointOut.id) &&
        Objects.equals(this.msg, messageAttemptEndpointOut.msg) &&
        Objects.equals(this.msgId, messageAttemptEndpointOut.msgId) &&
        Objects.equals(this.response, messageAttemptEndpointOut.response) &&
        Objects.equals(this.responseStatusCode, messageAttemptEndpointOut.responseStatusCode) &&
        Objects.equals(this.status, messageAttemptEndpointOut.status) &&
        Objects.equals(this.timestamp, messageAttemptEndpointOut.timestamp) &&
        Objects.equals(this.triggerType, messageAttemptEndpointOut.triggerType) &&
        Objects.equals(this.url, messageAttemptEndpointOut.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointId, id, msg, msgId, response, responseStatusCode, status, timestamp, triggerType, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageAttemptEndpointOut {\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
