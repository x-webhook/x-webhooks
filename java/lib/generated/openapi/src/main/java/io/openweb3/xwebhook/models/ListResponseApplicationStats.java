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
import io.openweb3.xwebhook.models.ApplicationStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ListResponseApplicationStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T18:09:09.017597+08:00[Asia/Shanghai]")
public class ListResponseApplicationStats {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ApplicationStats> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_DONE = "done";
  @SerializedName(SERIALIZED_NAME_DONE)
  private Boolean done;

  public static final String SERIALIZED_NAME_ITERATOR = "iterator";
  @SerializedName(SERIALIZED_NAME_ITERATOR)
  private String iterator;

  public static final String SERIALIZED_NAME_PREV_ITERATOR = "prevIterator";
  @SerializedName(SERIALIZED_NAME_PREV_ITERATOR)
  private String prevIterator;


  public ListResponseApplicationStats data(List<ApplicationStats> data) {
    
    this.data = data;
    return this;
  }

  public ListResponseApplicationStats addDataItem(ApplicationStats dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ApplicationStats> getData() {
    return data;
  }


  public void setData(List<ApplicationStats> data) {
    this.data = data;
  }


  public ListResponseApplicationStats done(Boolean done) {
    
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


  public ListResponseApplicationStats iterator(String iterator) {
    
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


  public ListResponseApplicationStats prevIterator(String prevIterator) {
    
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
    ListResponseApplicationStats listResponseApplicationStats = (ListResponseApplicationStats) o;
    return Objects.equals(this.data, listResponseApplicationStats.data) &&
        Objects.equals(this.done, listResponseApplicationStats.done) &&
        Objects.equals(this.iterator, listResponseApplicationStats.iterator) &&
        Objects.equals(this.prevIterator, listResponseApplicationStats.prevIterator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, done, iterator, prevIterator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResponseApplicationStats {\n");
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

