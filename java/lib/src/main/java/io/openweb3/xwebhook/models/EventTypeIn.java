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
 * EventTypeIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-08T17:18:16.954530+08:00[Asia/Shanghai]")
public class EventTypeIn {
  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived = false;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FEATURE_FLAG = "featureFlag";
  @SerializedName(SERIALIZED_NAME_FEATURE_FLAG)
  private String featureFlag;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private Map<String, Object> schemas = null;


  public EventTypeIn archived(Boolean archived) {
    
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  public EventTypeIn description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "A user has signed up", required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EventTypeIn featureFlag(String featureFlag) {
    
    this.featureFlag = featureFlag;
    return this;
  }

   /**
   * Get featureFlag
   * @return featureFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cool-new-feature", value = "")

  public String getFeatureFlag() {
    return featureFlag;
  }


  public void setFeatureFlag(String featureFlag) {
    this.featureFlag = featureFlag;
  }


  public EventTypeIn name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The event type&#39;s name
   * @return name
  **/
  @ApiModelProperty(example = "user.signup", required = true, value = "The event type's name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EventTypeIn schemas(Map<String, Object> schemas) {
    
    this.schemas = schemas;
    return this;
  }

  public EventTypeIn putSchemasItem(String key, Object schemasItem) {
    if (this.schemas == null) {
      this.schemas = new HashMap<>();
    }
    this.schemas.put(key, schemasItem);
    return this;
  }

   /**
   * The schema for the event type for a specific version as a JSON schema.
   * @return schemas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"1\":{\"description\":\"An invoice was paid by a user\",\"properties\":{\"invoiceId\":{\"description\":\"The invoice id\",\"type\":\"string\"},\"userId\":{\"description\":\"The user id\",\"type\":\"string\"}},\"required\":[\"invoiceId\",\"userId\"],\"title\":\"Invoice Paid Event\",\"type\":\"object\"}}", value = "The schema for the event type for a specific version as a JSON schema.")

  public Map<String, Object> getSchemas() {
    return schemas;
  }


  public void setSchemas(Map<String, Object> schemas) {
    this.schemas = schemas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTypeIn eventTypeIn = (EventTypeIn) o;
    return Objects.equals(this.archived, eventTypeIn.archived) &&
        Objects.equals(this.description, eventTypeIn.description) &&
        Objects.equals(this.featureFlag, eventTypeIn.featureFlag) &&
        Objects.equals(this.name, eventTypeIn.name) &&
        Objects.equals(this.schemas, eventTypeIn.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, description, featureFlag, name, schemas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTypeIn {\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    featureFlag: ").append(toIndentedString(featureFlag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

