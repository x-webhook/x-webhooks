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
import io.openweb3.xwebhook.models.CustomColorPalette;
import io.openweb3.xwebhook.models.CustomThemeOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * EnvironmentSettingsOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-18T22:55:50.941287+08:00[Asia/Shanghai]")
public class EnvironmentSettingsOut {
  public static final String SERIALIZED_NAME_COLOR_PALETTE_DARK = "colorPaletteDark";
  @SerializedName(SERIALIZED_NAME_COLOR_PALETTE_DARK)
  private CustomColorPalette colorPaletteDark;

  public static final String SERIALIZED_NAME_COLOR_PALETTE_LIGHT = "colorPaletteLight";
  @SerializedName(SERIALIZED_NAME_COLOR_PALETTE_LIGHT)
  private CustomColorPalette colorPaletteLight;

  public static final String SERIALIZED_NAME_CUSTOM_COLOR = "customColor";
  @SerializedName(SERIALIZED_NAME_CUSTOM_COLOR)
  private String customColor;

  public static final String SERIALIZED_NAME_CUSTOM_FONT_FAMILY = "customFontFamily";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FONT_FAMILY)
  private String customFontFamily;

  public static final String SERIALIZED_NAME_CUSTOM_FONT_FAMILY_URL = "customFontFamilyUrl";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FONT_FAMILY_URL)
  private URI customFontFamilyUrl;

  public static final String SERIALIZED_NAME_CUSTOM_LOGO_URL = "customLogoUrl";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LOGO_URL)
  private URI customLogoUrl;

  public static final String SERIALIZED_NAME_CUSTOM_THEME_OVERRIDE = "customThemeOverride";
  @SerializedName(SERIALIZED_NAME_CUSTOM_THEME_OVERRIDE)
  private CustomThemeOverride customThemeOverride;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ENABLE_CHANNELS = "enableChannels";
  @SerializedName(SERIALIZED_NAME_ENABLE_CHANNELS)
  private Boolean enableChannels = false;

  public static final String SERIALIZED_NAME_ENABLE_INTEGRATION_MANAGEMENT = "enableIntegrationManagement";
  @SerializedName(SERIALIZED_NAME_ENABLE_INTEGRATION_MANAGEMENT)
  private Boolean enableIntegrationManagement = false;

  public static final String SERIALIZED_NAME_ENABLE_MESSAGE_TAGS = "enableMessageTags";
  @SerializedName(SERIALIZED_NAME_ENABLE_MESSAGE_TAGS)
  private Boolean enableMessageTags = false;

  public static final String SERIALIZED_NAME_ENABLE_TRANSFORMATIONS = "enableTransformations";
  @SerializedName(SERIALIZED_NAME_ENABLE_TRANSFORMATIONS)
  private Boolean enableTransformations = false;

  public static final String SERIALIZED_NAME_SHOW_USE_XWEBHOOK_PLAY = "showUseXwebhookPlay";
  @SerializedName(SERIALIZED_NAME_SHOW_USE_XWEBHOOK_PLAY)
  private Boolean showUseXwebhookPlay = true;


  public EnvironmentSettingsOut colorPaletteDark(CustomColorPalette colorPaletteDark) {
    
    this.colorPaletteDark = colorPaletteDark;
    return this;
  }

   /**
   * Get colorPaletteDark
   * @return colorPaletteDark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomColorPalette getColorPaletteDark() {
    return colorPaletteDark;
  }


  public void setColorPaletteDark(CustomColorPalette colorPaletteDark) {
    this.colorPaletteDark = colorPaletteDark;
  }


  public EnvironmentSettingsOut colorPaletteLight(CustomColorPalette colorPaletteLight) {
    
    this.colorPaletteLight = colorPaletteLight;
    return this;
  }

   /**
   * Get colorPaletteLight
   * @return colorPaletteLight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomColorPalette getColorPaletteLight() {
    return colorPaletteLight;
  }


  public void setColorPaletteLight(CustomColorPalette colorPaletteLight) {
    this.colorPaletteLight = colorPaletteLight;
  }


  public EnvironmentSettingsOut customColor(String customColor) {
    
    this.customColor = customColor;
    return this;
  }

   /**
   * Get customColor
   * @return customColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomColor() {
    return customColor;
  }


  public void setCustomColor(String customColor) {
    this.customColor = customColor;
  }


  public EnvironmentSettingsOut customFontFamily(String customFontFamily) {
    
    this.customFontFamily = customFontFamily;
    return this;
  }

   /**
   * Get customFontFamily
   * @return customFontFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Open Sans", value = "")

  public String getCustomFontFamily() {
    return customFontFamily;
  }


  public void setCustomFontFamily(String customFontFamily) {
    this.customFontFamily = customFontFamily;
  }


  public EnvironmentSettingsOut customFontFamilyUrl(URI customFontFamilyUrl) {
    
    this.customFontFamilyUrl = customFontFamilyUrl;
    return this;
  }

   /**
   * Get customFontFamilyUrl
   * @return customFontFamilyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getCustomFontFamilyUrl() {
    return customFontFamilyUrl;
  }


  public void setCustomFontFamilyUrl(URI customFontFamilyUrl) {
    this.customFontFamilyUrl = customFontFamilyUrl;
  }


  public EnvironmentSettingsOut customLogoUrl(URI customLogoUrl) {
    
    this.customLogoUrl = customLogoUrl;
    return this;
  }

   /**
   * Get customLogoUrl
   * @return customLogoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getCustomLogoUrl() {
    return customLogoUrl;
  }


  public void setCustomLogoUrl(URI customLogoUrl) {
    this.customLogoUrl = customLogoUrl;
  }


  public EnvironmentSettingsOut customThemeOverride(CustomThemeOverride customThemeOverride) {
    
    this.customThemeOverride = customThemeOverride;
    return this;
  }

   /**
   * Get customThemeOverride
   * @return customThemeOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomThemeOverride getCustomThemeOverride() {
    return customThemeOverride;
  }


  public void setCustomThemeOverride(CustomThemeOverride customThemeOverride) {
    this.customThemeOverride = customThemeOverride;
  }


  public EnvironmentSettingsOut displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public EnvironmentSettingsOut enableChannels(Boolean enableChannels) {
    
    this.enableChannels = enableChannels;
    return this;
  }

   /**
   * Get enableChannels
   * @return enableChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableChannels() {
    return enableChannels;
  }


  public void setEnableChannels(Boolean enableChannels) {
    this.enableChannels = enableChannels;
  }


  public EnvironmentSettingsOut enableIntegrationManagement(Boolean enableIntegrationManagement) {
    
    this.enableIntegrationManagement = enableIntegrationManagement;
    return this;
  }

   /**
   * Get enableIntegrationManagement
   * @return enableIntegrationManagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableIntegrationManagement() {
    return enableIntegrationManagement;
  }


  public void setEnableIntegrationManagement(Boolean enableIntegrationManagement) {
    this.enableIntegrationManagement = enableIntegrationManagement;
  }


  public EnvironmentSettingsOut enableMessageTags(Boolean enableMessageTags) {
    
    this.enableMessageTags = enableMessageTags;
    return this;
  }

   /**
   * Get enableMessageTags
   * @return enableMessageTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableMessageTags() {
    return enableMessageTags;
  }


  public void setEnableMessageTags(Boolean enableMessageTags) {
    this.enableMessageTags = enableMessageTags;
  }


  public EnvironmentSettingsOut enableTransformations(Boolean enableTransformations) {
    
    this.enableTransformations = enableTransformations;
    return this;
  }

   /**
   * Get enableTransformations
   * @return enableTransformations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableTransformations() {
    return enableTransformations;
  }


  public void setEnableTransformations(Boolean enableTransformations) {
    this.enableTransformations = enableTransformations;
  }


  public EnvironmentSettingsOut showUseXwebhookPlay(Boolean showUseXwebhookPlay) {
    
    this.showUseXwebhookPlay = showUseXwebhookPlay;
    return this;
  }

   /**
   * Get showUseXwebhookPlay
   * @return showUseXwebhookPlay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShowUseXwebhookPlay() {
    return showUseXwebhookPlay;
  }


  public void setShowUseXwebhookPlay(Boolean showUseXwebhookPlay) {
    this.showUseXwebhookPlay = showUseXwebhookPlay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentSettingsOut environmentSettingsOut = (EnvironmentSettingsOut) o;
    return Objects.equals(this.colorPaletteDark, environmentSettingsOut.colorPaletteDark) &&
        Objects.equals(this.colorPaletteLight, environmentSettingsOut.colorPaletteLight) &&
        Objects.equals(this.customColor, environmentSettingsOut.customColor) &&
        Objects.equals(this.customFontFamily, environmentSettingsOut.customFontFamily) &&
        Objects.equals(this.customFontFamilyUrl, environmentSettingsOut.customFontFamilyUrl) &&
        Objects.equals(this.customLogoUrl, environmentSettingsOut.customLogoUrl) &&
        Objects.equals(this.customThemeOverride, environmentSettingsOut.customThemeOverride) &&
        Objects.equals(this.displayName, environmentSettingsOut.displayName) &&
        Objects.equals(this.enableChannels, environmentSettingsOut.enableChannels) &&
        Objects.equals(this.enableIntegrationManagement, environmentSettingsOut.enableIntegrationManagement) &&
        Objects.equals(this.enableMessageTags, environmentSettingsOut.enableMessageTags) &&
        Objects.equals(this.enableTransformations, environmentSettingsOut.enableTransformations) &&
        Objects.equals(this.showUseXwebhookPlay, environmentSettingsOut.showUseXwebhookPlay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorPaletteDark, colorPaletteLight, customColor, customFontFamily, customFontFamilyUrl, customLogoUrl, customThemeOverride, displayName, enableChannels, enableIntegrationManagement, enableMessageTags, enableTransformations, showUseXwebhookPlay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentSettingsOut {\n");
    sb.append("    colorPaletteDark: ").append(toIndentedString(colorPaletteDark)).append("\n");
    sb.append("    colorPaletteLight: ").append(toIndentedString(colorPaletteLight)).append("\n");
    sb.append("    customColor: ").append(toIndentedString(customColor)).append("\n");
    sb.append("    customFontFamily: ").append(toIndentedString(customFontFamily)).append("\n");
    sb.append("    customFontFamilyUrl: ").append(toIndentedString(customFontFamilyUrl)).append("\n");
    sb.append("    customLogoUrl: ").append(toIndentedString(customLogoUrl)).append("\n");
    sb.append("    customThemeOverride: ").append(toIndentedString(customThemeOverride)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enableChannels: ").append(toIndentedString(enableChannels)).append("\n");
    sb.append("    enableIntegrationManagement: ").append(toIndentedString(enableIntegrationManagement)).append("\n");
    sb.append("    enableMessageTags: ").append(toIndentedString(enableMessageTags)).append("\n");
    sb.append("    enableTransformations: ").append(toIndentedString(enableTransformations)).append("\n");
    sb.append("    showUseXwebhookPlay: ").append(toIndentedString(showUseXwebhookPlay)).append("\n");
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

