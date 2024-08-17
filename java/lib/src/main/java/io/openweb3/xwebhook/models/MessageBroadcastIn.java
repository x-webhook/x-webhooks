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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * MessageBroadcastIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class MessageBroadcastIn {
  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private Set<String> channels = null;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private Object payload;

  public static final String SERIALIZED_NAME_PAYLOAD_RETENTION_PERIOD = "payloadRetentionPeriod";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_RETENTION_PERIOD)
  private Long payloadRetentionPeriod = 90l;


  public MessageBroadcastIn channels(Set<String> channels) {
    
    this.channels = channels;
    return this;
  }

  public MessageBroadcastIn addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new LinkedHashSet<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * List of free-form identifiers that endpoints can filter by
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"project_123\",\"group_2\"]", value = "List of free-form identifiers that endpoints can filter by")

  public Set<String> getChannels() {
    return channels;
  }


  public void setChannels(Set<String> channels) {
    this.channels = channels;
  }


  public MessageBroadcastIn eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * Optional unique identifier for the message
   * @return eventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-msg-identifier", value = "Optional unique identifier for the message")

  public String getEventId() {
    return eventId;
  }


  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public MessageBroadcastIn eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The event type&#39;s name
   * @return eventType
  **/
  @ApiModelProperty(example = "user.signup", required = true, value = "The event type's name")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public MessageBroadcastIn payload(Object payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(example = "{\"email\":\"test@example.com\",\"type\":\"user.created\",\"username\":\"test_user\"}", required = true, value = "")

  public Object getPayload() {
    return payload;
  }


  public void setPayload(Object payload) {
    this.payload = payload;
  }


  public MessageBroadcastIn payloadRetentionPeriod(Long payloadRetentionPeriod) {
    
    this.payloadRetentionPeriod = payloadRetentionPeriod;
    return this;
  }

   /**
   * Get payloadRetentionPeriod
   * minimum: 5
   * maximum: 90
   * @return payloadRetentionPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "90", value = "")

  public Long getPayloadRetentionPeriod() {
    return payloadRetentionPeriod;
  }


  public void setPayloadRetentionPeriod(Long payloadRetentionPeriod) {
    this.payloadRetentionPeriod = payloadRetentionPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageBroadcastIn messageBroadcastIn = (MessageBroadcastIn) o;
    return Objects.equals(this.channels, messageBroadcastIn.channels) &&
        Objects.equals(this.eventId, messageBroadcastIn.eventId) &&
        Objects.equals(this.eventType, messageBroadcastIn.eventType) &&
        Objects.equals(this.payload, messageBroadcastIn.payload) &&
        Objects.equals(this.payloadRetentionPeriod, messageBroadcastIn.payloadRetentionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, eventId, eventType, payload, payloadRetentionPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageBroadcastIn {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    payloadRetentionPeriod: ").append(toIndentedString(payloadRetentionPeriod)).append("\n");
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

