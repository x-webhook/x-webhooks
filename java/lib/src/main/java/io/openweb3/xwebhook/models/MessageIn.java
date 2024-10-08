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
import io.openweb3.xwebhook.models.ApplicationIn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * MessageIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class MessageIn {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private ApplicationIn application;

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

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Set<String> tags = null;

  public static final String SERIALIZED_NAME_TRANSFORMATIONS_PARAMS = "transformationsParams";
  @SerializedName(SERIALIZED_NAME_TRANSFORMATIONS_PARAMS)
  private Object transformationsParams;


  public MessageIn application(ApplicationIn application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationIn getApplication() {
    return application;
  }


  public void setApplication(ApplicationIn application) {
    this.application = application;
  }


  public MessageIn channels(Set<String> channels) {
    
    this.channels = channels;
    return this;
  }

  public MessageIn addChannelsItem(String channelsItem) {
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


  public MessageIn eventId(String eventId) {
    
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


  public MessageIn eventType(String eventType) {
    
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


  public MessageIn payload(Object payload) {
    
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


  public MessageIn payloadRetentionPeriod(Long payloadRetentionPeriod) {
    
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


  public MessageIn headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public MessageIn putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"X-Example\":\"123\",\"X-Foobar\":\"Bar\"}", value = "")

  public Map<String, String> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public MessageIn tags(Set<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public MessageIn addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of free-form tags that can be filtered by when listing messages
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"my_tag\",\"other\"]", value = "List of free-form tags that can be filtered by when listing messages")

  public Set<String> getTags() {
    return tags;
  }


  public void setTags(Set<String> tags) {
    this.tags = tags;
  }


  public MessageIn transformationsParams(Object transformationsParams) {
    
    this.transformationsParams = transformationsParams;
    return this;
  }

   /**
   * Extra parameters to pass to Transformations (for future use)
   * @return transformationsParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra parameters to pass to Transformations (for future use)")

  public Object getTransformationsParams() {
    return transformationsParams;
  }


  public void setTransformationsParams(Object transformationsParams) {
    this.transformationsParams = transformationsParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageIn messageIn = (MessageIn) o;
    return Objects.equals(this.application, messageIn.application) &&
        Objects.equals(this.channels, messageIn.channels) &&
        Objects.equals(this.eventId, messageIn.eventId) &&
        Objects.equals(this.eventType, messageIn.eventType) &&
        Objects.equals(this.payload, messageIn.payload) &&
        Objects.equals(this.payloadRetentionPeriod, messageIn.payloadRetentionPeriod) &&
        Objects.equals(this.headers, messageIn.headers) &&
        Objects.equals(this.tags, messageIn.tags) &&
        Objects.equals(this.transformationsParams, messageIn.transformationsParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, channels, eventId, eventType, payload, payloadRetentionPeriod, headers, tags, transformationsParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageIn {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    payloadRetentionPeriod: ").append(toIndentedString(payloadRetentionPeriod)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transformationsParams: ").append(toIndentedString(transformationsParams)).append("\n");
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

