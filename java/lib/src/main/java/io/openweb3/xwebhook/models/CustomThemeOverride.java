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
import io.openweb3.xwebhook.models.BorderRadiusConfig;
import io.openweb3.xwebhook.models.FontSizeConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomThemeOverride
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class CustomThemeOverride {
  public static final String SERIALIZED_NAME_BORDER_RADIUS = "borderRadius";
  @SerializedName(SERIALIZED_NAME_BORDER_RADIUS)
  private BorderRadiusConfig borderRadius;

  public static final String SERIALIZED_NAME_FONT_SIZE = "fontSize";
  @SerializedName(SERIALIZED_NAME_FONT_SIZE)
  private FontSizeConfig fontSize;


  public CustomThemeOverride borderRadius(BorderRadiusConfig borderRadius) {
    
    this.borderRadius = borderRadius;
    return this;
  }

   /**
   * Get borderRadius
   * @return borderRadius
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BorderRadiusConfig getBorderRadius() {
    return borderRadius;
  }


  public void setBorderRadius(BorderRadiusConfig borderRadius) {
    this.borderRadius = borderRadius;
  }


  public CustomThemeOverride fontSize(FontSizeConfig fontSize) {
    
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Get fontSize
   * @return fontSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FontSizeConfig getFontSize() {
    return fontSize;
  }


  public void setFontSize(FontSizeConfig fontSize) {
    this.fontSize = fontSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomThemeOverride customThemeOverride = (CustomThemeOverride) o;
    return Objects.equals(this.borderRadius, customThemeOverride.borderRadius) &&
        Objects.equals(this.fontSize, customThemeOverride.fontSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderRadius, fontSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomThemeOverride {\n");
    sb.append("    borderRadius: ").append(toIndentedString(borderRadius)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
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

