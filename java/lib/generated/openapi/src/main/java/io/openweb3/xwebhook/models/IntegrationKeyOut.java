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

/**
 * IntegrationKeyOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-18T22:55:50.941287+08:00[Asia/Shanghai]")
public class IntegrationKeyOut {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;


  public IntegrationKeyOut key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(example = "integsk_kV3ts5tKPNJN4Dl25cMTfUNdmabxbX0O", required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationKeyOut integrationKeyOut = (IntegrationKeyOut) o;
    return Objects.equals(this.key, integrationKeyOut.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationKeyOut {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

