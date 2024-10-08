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
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * EndpointPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class EndpointPatch {
  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private Set<String> channels = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_FILTER_TYPES = "filterTypes";
  @SerializedName(SERIALIZED_NAME_FILTER_TYPES)
  private Set<String> filterTypes = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = null;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private Map<String, Object> rules = null;

  public static final String SERIALIZED_NAME_RATE_LIMIT = "rateLimit";
  @SerializedName(SERIALIZED_NAME_RATE_LIMIT)
  private Integer rateLimit;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public EndpointPatch channels(Set<String> channels) {
    
    this.channels = channels;
    return this;
  }

  public EndpointPatch addChannelsItem(String channelsItem) {
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


  public EndpointPatch description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EndpointPatch disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public EndpointPatch filterTypes(Set<String> filterTypes) {
    
    this.filterTypes = filterTypes;
    return this;
  }

  public EndpointPatch addFilterTypesItem(String filterTypesItem) {
    if (this.filterTypes == null) {
      this.filterTypes = new LinkedHashSet<>();
    }
    this.filterTypes.add(filterTypesItem);
    return this;
  }

   /**
   * Get filterTypes
   * @return filterTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getFilterTypes() {
    return filterTypes;
  }


  public void setFilterTypes(Set<String> filterTypes) {
    this.filterTypes = filterTypes;
  }


  public EndpointPatch metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public EndpointPatch putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"X-Example\":\"123\",\"X-Foobar\":\"Bar\"}", value = "")

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public EndpointPatch headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public EndpointPatch putHeadersItem(String key, String headersItem) {
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


  public EndpointPatch rules(Map<String, Object> rules) {
    
    this.rules = rules;
    return this;
  }

  public EndpointPatch putRulesItem(String key, Object rulesItem) {
    if (this.rules == null) {
      this.rules = new HashMap<>();
    }
    this.rules.put(key, rulesItem);
    return this;
  }

   /**
   * The filter rules for the message payload.
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"type\":\"tx.created\",\"chain\":\"ton\",\"amount\":{\"$gt\":\"400\"}}", value = "The filter rules for the message payload.")

  public Map<String, Object> getRules() {
    return rules;
  }


  public void setRules(Map<String, Object> rules) {
    this.rules = rules;
  }


  public EndpointPatch rateLimit(Integer rateLimit) {
    
    this.rateLimit = rateLimit;
    return this;
  }

   /**
   * Get rateLimit
   * minimum: 0
   * @return rateLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRateLimit() {
    return rateLimit;
  }


  public void setRateLimit(Integer rateLimit) {
    this.rateLimit = rateLimit;
  }


  public EndpointPatch secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD", value = "The endpoint's verification secret. If `null` is passed, a secret is automatically generated. Format: `base64` encoded random bytes optionally prefixed with `whsec_`. Recommended size: 24.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public EndpointPatch uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * The ep&#39;s UID
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-ep-identifier", value = "The ep's UID")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public EndpointPatch url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public EndpointPatch version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * minimum: 1
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointPatch endpointPatch = (EndpointPatch) o;
    return Objects.equals(this.channels, endpointPatch.channels) &&
        Objects.equals(this.description, endpointPatch.description) &&
        Objects.equals(this.disabled, endpointPatch.disabled) &&
        Objects.equals(this.filterTypes, endpointPatch.filterTypes) &&
        Objects.equals(this.metadata, endpointPatch.metadata) &&
        Objects.equals(this.headers, endpointPatch.headers) &&
        Objects.equals(this.rules, endpointPatch.rules) &&
        Objects.equals(this.rateLimit, endpointPatch.rateLimit) &&
        Objects.equals(this.secret, endpointPatch.secret) &&
        Objects.equals(this.uid, endpointPatch.uid) &&
        Objects.equals(this.url, endpointPatch.url) &&
        Objects.equals(this.version, endpointPatch.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, description, disabled, filterTypes, metadata, headers, rules, rateLimit, secret, uid, url, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointPatch {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    filterTypes: ").append(toIndentedString(filterTypes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

