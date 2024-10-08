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
 * SettingsOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class SettingsOut {
  public static final String SERIALIZED_NAME_COLOR_PALETTE_DARK = "colorPaletteDark";
  @SerializedName(SERIALIZED_NAME_COLOR_PALETTE_DARK)
  private CustomColorPalette colorPaletteDark;

  public static final String SERIALIZED_NAME_COLOR_PALETTE_LIGHT = "colorPaletteLight";
  @SerializedName(SERIALIZED_NAME_COLOR_PALETTE_LIGHT)
  private CustomColorPalette colorPaletteLight;

  public static final String SERIALIZED_NAME_CUSTOM_BASE_FONT_SIZE = "customBaseFontSize";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BASE_FONT_SIZE)
  private Integer customBaseFontSize;

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

  public static final String SERIALIZED_NAME_DISABLE_ENDPOINT_ON_FAILURE = "disableEndpointOnFailure";
  @SerializedName(SERIALIZED_NAME_DISABLE_ENDPOINT_ON_FAILURE)
  private Boolean disableEndpointOnFailure = true;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ENABLE_CHANNELS = "enableChannels";
  @SerializedName(SERIALIZED_NAME_ENABLE_CHANNELS)
  private Boolean enableChannels = false;

  public static final String SERIALIZED_NAME_ENABLE_INTEGRATION_MANAGEMENT = "enableIntegrationManagement";
  @SerializedName(SERIALIZED_NAME_ENABLE_INTEGRATION_MANAGEMENT)
  private Boolean enableIntegrationManagement = false;

  public static final String SERIALIZED_NAME_ENABLE_TRANSFORMATIONS = "enableTransformations";
  @SerializedName(SERIALIZED_NAME_ENABLE_TRANSFORMATIONS)
  private Boolean enableTransformations = false;

  public static final String SERIALIZED_NAME_ENFORCE_HTTPS = "enforceHttps";
  @SerializedName(SERIALIZED_NAME_ENFORCE_HTTPS)
  private Boolean enforceHttps = true;

  public static final String SERIALIZED_NAME_EVENT_CATALOG_PUBLISHED = "eventCatalogPublished";
  @SerializedName(SERIALIZED_NAME_EVENT_CATALOG_PUBLISHED)
  private Boolean eventCatalogPublished = false;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly = false;

  public static final String SERIALIZED_NAME_SHOW_USE_XWEBHOOK_PLAY = "showUseXwebhookPlay";
  @SerializedName(SERIALIZED_NAME_SHOW_USE_XWEBHOOK_PLAY)
  private Boolean showUseXwebhookPlay = true;


  public SettingsOut colorPaletteDark(CustomColorPalette colorPaletteDark) {
    
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


  public SettingsOut colorPaletteLight(CustomColorPalette colorPaletteLight) {
    
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


  public SettingsOut customBaseFontSize(Integer customBaseFontSize) {
    
    this.customBaseFontSize = customBaseFontSize;
    return this;
  }

   /**
   * Get customBaseFontSize
   * @return customBaseFontSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCustomBaseFontSize() {
    return customBaseFontSize;
  }


  public void setCustomBaseFontSize(Integer customBaseFontSize) {
    this.customBaseFontSize = customBaseFontSize;
  }


  public SettingsOut customColor(String customColor) {
    
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


  public SettingsOut customFontFamily(String customFontFamily) {
    
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


  public SettingsOut customFontFamilyUrl(URI customFontFamilyUrl) {
    
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


  public SettingsOut customLogoUrl(URI customLogoUrl) {
    
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


  public SettingsOut customThemeOverride(CustomThemeOverride customThemeOverride) {
    
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


  public SettingsOut disableEndpointOnFailure(Boolean disableEndpointOnFailure) {
    
    this.disableEndpointOnFailure = disableEndpointOnFailure;
    return this;
  }

   /**
   * Get disableEndpointOnFailure
   * @return disableEndpointOnFailure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisableEndpointOnFailure() {
    return disableEndpointOnFailure;
  }


  public void setDisableEndpointOnFailure(Boolean disableEndpointOnFailure) {
    this.disableEndpointOnFailure = disableEndpointOnFailure;
  }


  public SettingsOut displayName(String displayName) {
    
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


  public SettingsOut enableChannels(Boolean enableChannels) {
    
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


  public SettingsOut enableIntegrationManagement(Boolean enableIntegrationManagement) {
    
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


  public SettingsOut enableTransformations(Boolean enableTransformations) {
    
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


  public SettingsOut enforceHttps(Boolean enforceHttps) {
    
    this.enforceHttps = enforceHttps;
    return this;
  }

   /**
   * Get enforceHttps
   * @return enforceHttps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnforceHttps() {
    return enforceHttps;
  }


  public void setEnforceHttps(Boolean enforceHttps) {
    this.enforceHttps = enforceHttps;
  }


  public SettingsOut eventCatalogPublished(Boolean eventCatalogPublished) {
    
    this.eventCatalogPublished = eventCatalogPublished;
    return this;
  }

   /**
   * Get eventCatalogPublished
   * @return eventCatalogPublished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEventCatalogPublished() {
    return eventCatalogPublished;
  }


  public void setEventCatalogPublished(Boolean eventCatalogPublished) {
    this.eventCatalogPublished = eventCatalogPublished;
  }


  public SettingsOut readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public SettingsOut showUseXwebhookPlay(Boolean showUseXwebhookPlay) {
    
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
    SettingsOut settingsOut = (SettingsOut) o;
    return Objects.equals(this.colorPaletteDark, settingsOut.colorPaletteDark) &&
        Objects.equals(this.colorPaletteLight, settingsOut.colorPaletteLight) &&
        Objects.equals(this.customBaseFontSize, settingsOut.customBaseFontSize) &&
        Objects.equals(this.customColor, settingsOut.customColor) &&
        Objects.equals(this.customFontFamily, settingsOut.customFontFamily) &&
        Objects.equals(this.customFontFamilyUrl, settingsOut.customFontFamilyUrl) &&
        Objects.equals(this.customLogoUrl, settingsOut.customLogoUrl) &&
        Objects.equals(this.customThemeOverride, settingsOut.customThemeOverride) &&
        Objects.equals(this.disableEndpointOnFailure, settingsOut.disableEndpointOnFailure) &&
        Objects.equals(this.displayName, settingsOut.displayName) &&
        Objects.equals(this.enableChannels, settingsOut.enableChannels) &&
        Objects.equals(this.enableIntegrationManagement, settingsOut.enableIntegrationManagement) &&
        Objects.equals(this.enableTransformations, settingsOut.enableTransformations) &&
        Objects.equals(this.enforceHttps, settingsOut.enforceHttps) &&
        Objects.equals(this.eventCatalogPublished, settingsOut.eventCatalogPublished) &&
        Objects.equals(this.readOnly, settingsOut.readOnly) &&
        Objects.equals(this.showUseXwebhookPlay, settingsOut.showUseXwebhookPlay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorPaletteDark, colorPaletteLight, customBaseFontSize, customColor, customFontFamily, customFontFamilyUrl, customLogoUrl, customThemeOverride, disableEndpointOnFailure, displayName, enableChannels, enableIntegrationManagement, enableTransformations, enforceHttps, eventCatalogPublished, readOnly, showUseXwebhookPlay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsOut {\n");
    sb.append("    colorPaletteDark: ").append(toIndentedString(colorPaletteDark)).append("\n");
    sb.append("    colorPaletteLight: ").append(toIndentedString(colorPaletteLight)).append("\n");
    sb.append("    customBaseFontSize: ").append(toIndentedString(customBaseFontSize)).append("\n");
    sb.append("    customColor: ").append(toIndentedString(customColor)).append("\n");
    sb.append("    customFontFamily: ").append(toIndentedString(customFontFamily)).append("\n");
    sb.append("    customFontFamilyUrl: ").append(toIndentedString(customFontFamilyUrl)).append("\n");
    sb.append("    customLogoUrl: ").append(toIndentedString(customLogoUrl)).append("\n");
    sb.append("    customThemeOverride: ").append(toIndentedString(customThemeOverride)).append("\n");
    sb.append("    disableEndpointOnFailure: ").append(toIndentedString(disableEndpointOnFailure)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enableChannels: ").append(toIndentedString(enableChannels)).append("\n");
    sb.append("    enableIntegrationManagement: ").append(toIndentedString(enableIntegrationManagement)).append("\n");
    sb.append("    enableTransformations: ").append(toIndentedString(enableTransformations)).append("\n");
    sb.append("    enforceHttps: ").append(toIndentedString(enforceHttps)).append("\n");
    sb.append("    eventCatalogPublished: ").append(toIndentedString(eventCatalogPublished)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

