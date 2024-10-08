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
 * AppPortalAccessIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class AppPortalAccessIn {
  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private Integer expiry = 604800;

  public static final String SERIALIZED_NAME_FEATURE_FLAGS = "featureFlags";
  @SerializedName(SERIALIZED_NAME_FEATURE_FLAGS)
  private Set<String> featureFlags = null;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;


  public AppPortalAccessIn expiry(Integer expiry) {
    
    this.expiry = expiry;
    return this;
  }

   /**
   * How long the token will be valid for, in seconds.  Valid values are between 1 hour and 7 days. The default is 7 days.
   * minimum: 3600
   * maximum: 604800
   * @return expiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How long the token will be valid for, in seconds.  Valid values are between 1 hour and 7 days. The default is 7 days.")

  public Integer getExpiry() {
    return expiry;
  }


  public void setExpiry(Integer expiry) {
    this.expiry = expiry;
  }


  public AppPortalAccessIn featureFlags(Set<String> featureFlags) {
    
    this.featureFlags = featureFlags;
    return this;
  }

  public AppPortalAccessIn addFeatureFlagsItem(String featureFlagsItem) {
    if (this.featureFlags == null) {
      this.featureFlags = new LinkedHashSet<>();
    }
    this.featureFlags.add(featureFlagsItem);
    return this;
  }

   /**
   * The set of feature flags the created token will have access to.
   * @return featureFlags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "The set of feature flags the created token will have access to.")

  public Set<String> getFeatureFlags() {
    return featureFlags;
  }


  public void setFeatureFlags(Set<String> featureFlags) {
    this.featureFlags = featureFlags;
  }


  public AppPortalAccessIn readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Whether the app portal should be in read-only mode.
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the app portal should be in read-only mode.")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPortalAccessIn appPortalAccessIn = (AppPortalAccessIn) o;
    return Objects.equals(this.expiry, appPortalAccessIn.expiry) &&
        Objects.equals(this.featureFlags, appPortalAccessIn.featureFlags) &&
        Objects.equals(this.readOnly, appPortalAccessIn.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, featureFlags, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPortalAccessIn {\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    featureFlags: ").append(toIndentedString(featureFlags)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

