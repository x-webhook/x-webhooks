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
import java.util.ArrayList;
import java.util.List;

/**
 * Validation errors have their own schema to provide context for invalid requests eg. mismatched types and out of bounds values. There may be any number of these per 422 UNPROCESSABLE ENTITY error.
 */
@ApiModel(description = "Validation errors have their own schema to provide context for invalid requests eg. mismatched types and out of bounds values. There may be any number of these per 422 UNPROCESSABLE ENTITY error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T21:50:31.553143+08:00[Asia/Shanghai]")
public class ValidationError {
  public static final String SERIALIZED_NAME_LOC = "loc";
  @SerializedName(SERIALIZED_NAME_LOC)
  private List<String> loc = new ArrayList<>();

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ValidationError loc(List<String> loc) {
    
    this.loc = loc;
    return this;
  }

  public ValidationError addLocItem(String locItem) {
    this.loc.add(locItem);
    return this;
  }

   /**
   * The location as a [&#x60;Vec&#x60;] of [&#x60;String&#x60;]s -- often in the form &#x60;[\&quot;body\&quot;, \&quot;field_name\&quot;]&#x60;, &#x60;[\&quot;query\&quot;, \&quot;field_name\&quot;]&#x60;, etc. They may, however, be arbitrarily deep.
   * @return loc
  **/
  @ApiModelProperty(required = true, value = "The location as a [`Vec`] of [`String`]s -- often in the form `[\"body\", \"field_name\"]`, `[\"query\", \"field_name\"]`, etc. They may, however, be arbitrarily deep.")

  public List<String> getLoc() {
    return loc;
  }


  public void setLoc(List<String> loc) {
    this.loc = loc;
  }


  public ValidationError msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * The message accompanying the validation error item.
   * @return msg
  **/
  @ApiModelProperty(required = true, value = "The message accompanying the validation error item.")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public ValidationError type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of error, often \&quot;type_error\&quot; or \&quot;value_error\&quot;, but sometimes with more context like as \&quot;value_error.number.not_ge\&quot;
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of error, often \"type_error\" or \"value_error\", but sometimes with more context like as \"value_error.number.not_ge\"")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.loc, validationError.loc) &&
        Objects.equals(this.msg, validationError.msg) &&
        Objects.equals(this.type, validationError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loc, msg, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    sb.append("    loc: ").append(toIndentedString(loc)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

