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
 * CustomColorPalette
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T18:09:09.017597+08:00[Asia/Shanghai]")
public class CustomColorPalette {
  public static final String SERIALIZED_NAME_BACKGROUND_HOVER = "backgroundHover";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_HOVER)
  private String backgroundHover;

  public static final String SERIALIZED_NAME_BACKGROUND_PRIMARY = "backgroundPrimary";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_PRIMARY)
  private String backgroundPrimary;

  public static final String SERIALIZED_NAME_BACKGROUND_SECONDARY = "backgroundSecondary";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_SECONDARY)
  private String backgroundSecondary;

  public static final String SERIALIZED_NAME_BUTTON_PRIMARY = "buttonPrimary";
  @SerializedName(SERIALIZED_NAME_BUTTON_PRIMARY)
  private String buttonPrimary;

  public static final String SERIALIZED_NAME_INTERACTIVE_ACCENT = "interactiveAccent";
  @SerializedName(SERIALIZED_NAME_INTERACTIVE_ACCENT)
  private String interactiveAccent;

  public static final String SERIALIZED_NAME_NAVIGATION_ACCENT = "navigationAccent";
  @SerializedName(SERIALIZED_NAME_NAVIGATION_ACCENT)
  private String navigationAccent;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private String primary;

  public static final String SERIALIZED_NAME_TEXT_DANGER = "textDanger";
  @SerializedName(SERIALIZED_NAME_TEXT_DANGER)
  private String textDanger;

  public static final String SERIALIZED_NAME_TEXT_PRIMARY = "textPrimary";
  @SerializedName(SERIALIZED_NAME_TEXT_PRIMARY)
  private String textPrimary;


  public CustomColorPalette backgroundHover(String backgroundHover) {
    
    this.backgroundHover = backgroundHover;
    return this;
  }

   /**
   * Get backgroundHover
   * @return backgroundHover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackgroundHover() {
    return backgroundHover;
  }


  public void setBackgroundHover(String backgroundHover) {
    this.backgroundHover = backgroundHover;
  }


  public CustomColorPalette backgroundPrimary(String backgroundPrimary) {
    
    this.backgroundPrimary = backgroundPrimary;
    return this;
  }

   /**
   * Get backgroundPrimary
   * @return backgroundPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackgroundPrimary() {
    return backgroundPrimary;
  }


  public void setBackgroundPrimary(String backgroundPrimary) {
    this.backgroundPrimary = backgroundPrimary;
  }


  public CustomColorPalette backgroundSecondary(String backgroundSecondary) {
    
    this.backgroundSecondary = backgroundSecondary;
    return this;
  }

   /**
   * Get backgroundSecondary
   * @return backgroundSecondary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackgroundSecondary() {
    return backgroundSecondary;
  }


  public void setBackgroundSecondary(String backgroundSecondary) {
    this.backgroundSecondary = backgroundSecondary;
  }


  public CustomColorPalette buttonPrimary(String buttonPrimary) {
    
    this.buttonPrimary = buttonPrimary;
    return this;
  }

   /**
   * Get buttonPrimary
   * @return buttonPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getButtonPrimary() {
    return buttonPrimary;
  }


  public void setButtonPrimary(String buttonPrimary) {
    this.buttonPrimary = buttonPrimary;
  }


  public CustomColorPalette interactiveAccent(String interactiveAccent) {
    
    this.interactiveAccent = interactiveAccent;
    return this;
  }

   /**
   * Get interactiveAccent
   * @return interactiveAccent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInteractiveAccent() {
    return interactiveAccent;
  }


  public void setInteractiveAccent(String interactiveAccent) {
    this.interactiveAccent = interactiveAccent;
  }


  public CustomColorPalette navigationAccent(String navigationAccent) {
    
    this.navigationAccent = navigationAccent;
    return this;
  }

   /**
   * Get navigationAccent
   * @return navigationAccent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNavigationAccent() {
    return navigationAccent;
  }


  public void setNavigationAccent(String navigationAccent) {
    this.navigationAccent = navigationAccent;
  }


  public CustomColorPalette primary(String primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimary() {
    return primary;
  }


  public void setPrimary(String primary) {
    this.primary = primary;
  }


  public CustomColorPalette textDanger(String textDanger) {
    
    this.textDanger = textDanger;
    return this;
  }

   /**
   * Get textDanger
   * @return textDanger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTextDanger() {
    return textDanger;
  }


  public void setTextDanger(String textDanger) {
    this.textDanger = textDanger;
  }


  public CustomColorPalette textPrimary(String textPrimary) {
    
    this.textPrimary = textPrimary;
    return this;
  }

   /**
   * Get textPrimary
   * @return textPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTextPrimary() {
    return textPrimary;
  }


  public void setTextPrimary(String textPrimary) {
    this.textPrimary = textPrimary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomColorPalette customColorPalette = (CustomColorPalette) o;
    return Objects.equals(this.backgroundHover, customColorPalette.backgroundHover) &&
        Objects.equals(this.backgroundPrimary, customColorPalette.backgroundPrimary) &&
        Objects.equals(this.backgroundSecondary, customColorPalette.backgroundSecondary) &&
        Objects.equals(this.buttonPrimary, customColorPalette.buttonPrimary) &&
        Objects.equals(this.interactiveAccent, customColorPalette.interactiveAccent) &&
        Objects.equals(this.navigationAccent, customColorPalette.navigationAccent) &&
        Objects.equals(this.primary, customColorPalette.primary) &&
        Objects.equals(this.textDanger, customColorPalette.textDanger) &&
        Objects.equals(this.textPrimary, customColorPalette.textPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundHover, backgroundPrimary, backgroundSecondary, buttonPrimary, interactiveAccent, navigationAccent, primary, textDanger, textPrimary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomColorPalette {\n");
    sb.append("    backgroundHover: ").append(toIndentedString(backgroundHover)).append("\n");
    sb.append("    backgroundPrimary: ").append(toIndentedString(backgroundPrimary)).append("\n");
    sb.append("    backgroundSecondary: ").append(toIndentedString(backgroundSecondary)).append("\n");
    sb.append("    buttonPrimary: ").append(toIndentedString(buttonPrimary)).append("\n");
    sb.append("    interactiveAccent: ").append(toIndentedString(interactiveAccent)).append("\n");
    sb.append("    navigationAccent: ").append(toIndentedString(navigationAccent)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    textDanger: ").append(toIndentedString(textDanger)).append("\n");
    sb.append("    textPrimary: ").append(toIndentedString(textPrimary)).append("\n");
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

