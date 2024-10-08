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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * EndpointOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class EndpointOut {
  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private Set<String> channels = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = false;

  public static final String SERIALIZED_NAME_FILTER_TYPES = "filterTypes";
  @SerializedName(SERIALIZED_NAME_FILTER_TYPES)
  private Set<String> filterTypes = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = null;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private Map<String, Object> rules = null;

  public static final String SERIALIZED_NAME_RATE_LIMIT = "rateLimit";
  @SerializedName(SERIALIZED_NAME_RATE_LIMIT)
  private Integer rateLimit;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public EndpointOut channels(Set<String> channels) {
    
    this.channels = channels;
    return this;
  }

  public EndpointOut addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new LinkedHashSet<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * List of message channels this endpoint listens to (omit for all)
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"project_123\",\"group_2\"]", value = "List of message channels this endpoint listens to (omit for all)")

  public Set<String> getChannels() {
    return channels;
  }


  public void setChannels(Set<String> channels) {
    this.channels = channels;
  }


  public EndpointOut createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EndpointOut description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An example endpoint name
   * @return description
  **/
  @ApiModelProperty(required = true, value = "An example endpoint name")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EndpointOut disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public EndpointOut filterTypes(Set<String> filterTypes) {
    
    this.filterTypes = filterTypes;
    return this;
  }

  public EndpointOut addFilterTypesItem(String filterTypesItem) {
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
  @ApiModelProperty(example = "[\"user.signup\",\"user.deleted\"]", value = "")

  public Set<String> getFilterTypes() {
    return filterTypes;
  }


  public void setFilterTypes(Set<String> filterTypes) {
    this.filterTypes = filterTypes;
  }


  public EndpointOut id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ep&#39;s ID
   * @return id
  **/
  @ApiModelProperty(example = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The ep's ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EndpointOut metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public EndpointOut putMetadataItem(String key, Object metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{\"X-Example\":\"123\",\"X-Foobar\":\"Bar\"}", required = true, value = "")

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public EndpointOut headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public EndpointOut putHeadersItem(String key, String headersItem) {
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


  public EndpointOut rules(Map<String, Object> rules) {
    
    this.rules = rules;
    return this;
  }

  public EndpointOut putRulesItem(String key, Object rulesItem) {
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


  public EndpointOut rateLimit(Integer rateLimit) {
    
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


  public EndpointOut uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Optional unique identifier for the endpoint
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-ep-identifier", value = "Optional unique identifier for the endpoint")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public EndpointOut updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public EndpointOut url(URI url) {
    
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


  public EndpointOut version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * minimum: 1
   * @return version
  **/
  @ApiModelProperty(example = "1", required = true, value = "")

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
    EndpointOut endpointOut = (EndpointOut) o;
    return Objects.equals(this.channels, endpointOut.channels) &&
        Objects.equals(this.createdAt, endpointOut.createdAt) &&
        Objects.equals(this.description, endpointOut.description) &&
        Objects.equals(this.disabled, endpointOut.disabled) &&
        Objects.equals(this.filterTypes, endpointOut.filterTypes) &&
        Objects.equals(this.id, endpointOut.id) &&
        Objects.equals(this.metadata, endpointOut.metadata) &&
        Objects.equals(this.headers, endpointOut.headers) &&
        Objects.equals(this.rules, endpointOut.rules) &&
        Objects.equals(this.rateLimit, endpointOut.rateLimit) &&
        Objects.equals(this.uid, endpointOut.uid) &&
        Objects.equals(this.updatedAt, endpointOut.updatedAt) &&
        Objects.equals(this.url, endpointOut.url) &&
        Objects.equals(this.version, endpointOut.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, createdAt, description, disabled, filterTypes, id, metadata, headers, rules, rateLimit, uid, updatedAt, url, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointOut {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    filterTypes: ").append(toIndentedString(filterTypes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

