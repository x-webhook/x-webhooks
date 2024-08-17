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
import io.openweb3.xwebhook.models.EventTypeFromOpenApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EventTypeImportOpenApiOutData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class EventTypeImportOpenApiOutData {
  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private List<String> modified = new ArrayList<>();

  public static final String SERIALIZED_NAME_TO_MODIFY = "to_modify";
  @SerializedName(SERIALIZED_NAME_TO_MODIFY)
  private List<EventTypeFromOpenApi> toModify = null;


  public EventTypeImportOpenApiOutData modified(List<String> modified) {
    
    this.modified = modified;
    return this;
  }

  public EventTypeImportOpenApiOutData addModifiedItem(String modifiedItem) {
    this.modified.add(modifiedItem);
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getModified() {
    return modified;
  }


  public void setModified(List<String> modified) {
    this.modified = modified;
  }


  public EventTypeImportOpenApiOutData toModify(List<EventTypeFromOpenApi> toModify) {
    
    this.toModify = toModify;
    return this;
  }

  public EventTypeImportOpenApiOutData addToModifyItem(EventTypeFromOpenApi toModifyItem) {
    if (this.toModify == null) {
      this.toModify = new ArrayList<>();
    }
    this.toModify.add(toModifyItem);
    return this;
  }

   /**
   * Get toModify
   * @return toModify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EventTypeFromOpenApi> getToModify() {
    return toModify;
  }


  public void setToModify(List<EventTypeFromOpenApi> toModify) {
    this.toModify = toModify;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTypeImportOpenApiOutData eventTypeImportOpenApiOutData = (EventTypeImportOpenApiOutData) o;
    return Objects.equals(this.modified, eventTypeImportOpenApiOutData.modified) &&
        Objects.equals(this.toModify, eventTypeImportOpenApiOutData.toModify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modified, toModify);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTypeImportOpenApiOutData {\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    toModify: ").append(toIndentedString(toModify)).append("\n");
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

