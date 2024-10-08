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
 * EndpointTransformationSimulateIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class EndpointTransformationSimulateIn {
  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private Set<String> channels = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private Object payload;


  public EndpointTransformationSimulateIn channels(Set<String> channels) {
    
    this.channels = channels;
    return this;
  }

  public EndpointTransformationSimulateIn addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new LinkedHashSet<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getChannels() {
    return channels;
  }


  public void setChannels(Set<String> channels) {
    this.channels = channels;
  }


  public EndpointTransformationSimulateIn code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public EndpointTransformationSimulateIn eventType(String eventType) {
    
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


  public EndpointTransformationSimulateIn payload(Object payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getPayload() {
    return payload;
  }


  public void setPayload(Object payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointTransformationSimulateIn endpointTransformationSimulateIn = (EndpointTransformationSimulateIn) o;
    return Objects.equals(this.channels, endpointTransformationSimulateIn.channels) &&
        Objects.equals(this.code, endpointTransformationSimulateIn.code) &&
        Objects.equals(this.eventType, endpointTransformationSimulateIn.eventType) &&
        Objects.equals(this.payload, endpointTransformationSimulateIn.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, code, eventType, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointTransformationSimulateIn {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

