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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ApplicationPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T18:09:09.017597+08:00[Asia/Shanghai]")
public class ApplicationPatch {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RATE_LIMIT = "rateLimit";
  @SerializedName(SERIALIZED_NAME_RATE_LIMIT)
  private Integer rateLimit;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;


  public ApplicationPatch metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public ApplicationPatch putMetadataItem(String key, String metadataItem) {
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
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public ApplicationPatch name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApplicationPatch rateLimit(Integer rateLimit) {
    
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


  public ApplicationPatch uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * The app&#39;s UID
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-app-identifier", value = "The app's UID")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationPatch applicationPatch = (ApplicationPatch) o;
    return Objects.equals(this.metadata, applicationPatch.metadata) &&
        Objects.equals(this.name, applicationPatch.name) &&
        Objects.equals(this.rateLimit, applicationPatch.rateLimit) &&
        Objects.equals(this.uid, applicationPatch.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, name, rateLimit, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationPatch {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
