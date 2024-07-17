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
import io.openweb3.xwebhook.models.MessageAttemptOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ListResponseMessageAttemptOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T18:09:09.017597+08:00[Asia/Shanghai]")
public class ListResponseMessageAttemptOut {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<MessageAttemptOut> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_DONE = "done";
  @SerializedName(SERIALIZED_NAME_DONE)
  private Boolean done;

  public static final String SERIALIZED_NAME_ITERATOR = "iterator";
  @SerializedName(SERIALIZED_NAME_ITERATOR)
  private String iterator;

  public static final String SERIALIZED_NAME_PREV_ITERATOR = "prevIterator";
  @SerializedName(SERIALIZED_NAME_PREV_ITERATOR)
  private String prevIterator;


  public ListResponseMessageAttemptOut data(List<MessageAttemptOut> data) {
    
    this.data = data;
    return this;
  }

  public ListResponseMessageAttemptOut addDataItem(MessageAttemptOut dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")

  public List<MessageAttemptOut> getData() {
    return data;
  }


  public void setData(List<MessageAttemptOut> data) {
    this.data = data;
  }


  public ListResponseMessageAttemptOut done(Boolean done) {
    
    this.done = done;
    return this;
  }

   /**
   * Get done
   * @return done
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getDone() {
    return done;
  }


  public void setDone(Boolean done) {
    this.done = done;
  }


  public ListResponseMessageAttemptOut iterator(String iterator) {
    
    this.iterator = iterator;
    return this;
  }

   /**
   * Get iterator
   * @return iterator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "iterator", value = "")

  public String getIterator() {
    return iterator;
  }


  public void setIterator(String iterator) {
    this.iterator = iterator;
  }


  public ListResponseMessageAttemptOut prevIterator(String prevIterator) {
    
    this.prevIterator = prevIterator;
    return this;
  }

   /**
   * Get prevIterator
   * @return prevIterator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-iterator", value = "")

  public String getPrevIterator() {
    return prevIterator;
  }


  public void setPrevIterator(String prevIterator) {
    this.prevIterator = prevIterator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResponseMessageAttemptOut listResponseMessageAttemptOut = (ListResponseMessageAttemptOut) o;
    return Objects.equals(this.data, listResponseMessageAttemptOut.data) &&
        Objects.equals(this.done, listResponseMessageAttemptOut.done) &&
        Objects.equals(this.iterator, listResponseMessageAttemptOut.iterator) &&
        Objects.equals(this.prevIterator, listResponseMessageAttemptOut.prevIterator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, done, iterator, prevIterator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResponseMessageAttemptOut {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    iterator: ").append(toIndentedString(iterator)).append("\n");
    sb.append("    prevIterator: ").append(toIndentedString(prevIterator)).append("\n");
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

