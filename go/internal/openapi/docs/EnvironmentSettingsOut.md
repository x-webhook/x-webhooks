# EnvironmentSettingsOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ColorPaletteDark** | Pointer to [**CustomColorPalette**](CustomColorPalette.md) |  | [optional] 
**ColorPaletteLight** | Pointer to [**CustomColorPalette**](CustomColorPalette.md) |  | [optional] 
**CustomColor** | Pointer to **NullableString** |  | [optional] 
**CustomFontFamily** | Pointer to **NullableString** |  | [optional] 
**CustomFontFamilyUrl** | Pointer to **NullableString** |  | [optional] 
**CustomLogoUrl** | Pointer to **NullableString** |  | [optional] 
**CustomThemeOverride** | Pointer to [**CustomThemeOverride**](CustomThemeOverride.md) |  | [optional] 
**DisplayName** | Pointer to **NullableString** |  | [optional] 
**EnableChannels** | Pointer to **bool** |  | [optional] [default to false]
**EnableIntegrationManagement** | Pointer to **bool** |  | [optional] [default to false]
**EnableMessageTags** | Pointer to **bool** |  | [optional] [default to false]
**EnableTransformations** | Pointer to **bool** |  | [optional] [default to false]
**ShowUseXwebhookPlay** | Pointer to **bool** |  | [optional] [default to true]

## Methods

### NewEnvironmentSettingsOut

`func NewEnvironmentSettingsOut() *EnvironmentSettingsOut`

NewEnvironmentSettingsOut instantiates a new EnvironmentSettingsOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnvironmentSettingsOutWithDefaults

`func NewEnvironmentSettingsOutWithDefaults() *EnvironmentSettingsOut`

NewEnvironmentSettingsOutWithDefaults instantiates a new EnvironmentSettingsOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColorPaletteDark

`func (o *EnvironmentSettingsOut) GetColorPaletteDark() CustomColorPalette`

GetColorPaletteDark returns the ColorPaletteDark field if non-nil, zero value otherwise.

### GetColorPaletteDarkOk

`func (o *EnvironmentSettingsOut) GetColorPaletteDarkOk() (*CustomColorPalette, bool)`

GetColorPaletteDarkOk returns a tuple with the ColorPaletteDark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColorPaletteDark

`func (o *EnvironmentSettingsOut) SetColorPaletteDark(v CustomColorPalette)`

SetColorPaletteDark sets ColorPaletteDark field to given value.

### HasColorPaletteDark

`func (o *EnvironmentSettingsOut) HasColorPaletteDark() bool`

HasColorPaletteDark returns a boolean if a field has been set.

### GetColorPaletteLight

`func (o *EnvironmentSettingsOut) GetColorPaletteLight() CustomColorPalette`

GetColorPaletteLight returns the ColorPaletteLight field if non-nil, zero value otherwise.

### GetColorPaletteLightOk

`func (o *EnvironmentSettingsOut) GetColorPaletteLightOk() (*CustomColorPalette, bool)`

GetColorPaletteLightOk returns a tuple with the ColorPaletteLight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColorPaletteLight

`func (o *EnvironmentSettingsOut) SetColorPaletteLight(v CustomColorPalette)`

SetColorPaletteLight sets ColorPaletteLight field to given value.

### HasColorPaletteLight

`func (o *EnvironmentSettingsOut) HasColorPaletteLight() bool`

HasColorPaletteLight returns a boolean if a field has been set.

### GetCustomColor

`func (o *EnvironmentSettingsOut) GetCustomColor() string`

GetCustomColor returns the CustomColor field if non-nil, zero value otherwise.

### GetCustomColorOk

`func (o *EnvironmentSettingsOut) GetCustomColorOk() (*string, bool)`

GetCustomColorOk returns a tuple with the CustomColor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomColor

`func (o *EnvironmentSettingsOut) SetCustomColor(v string)`

SetCustomColor sets CustomColor field to given value.

### HasCustomColor

`func (o *EnvironmentSettingsOut) HasCustomColor() bool`

HasCustomColor returns a boolean if a field has been set.

### SetCustomColorNil

`func (o *EnvironmentSettingsOut) SetCustomColorNil(b bool)`

 SetCustomColorNil sets the value for CustomColor to be an explicit nil

### UnsetCustomColor
`func (o *EnvironmentSettingsOut) UnsetCustomColor()`

UnsetCustomColor ensures that no value is present for CustomColor, not even an explicit nil
### GetCustomFontFamily

`func (o *EnvironmentSettingsOut) GetCustomFontFamily() string`

GetCustomFontFamily returns the CustomFontFamily field if non-nil, zero value otherwise.

### GetCustomFontFamilyOk

`func (o *EnvironmentSettingsOut) GetCustomFontFamilyOk() (*string, bool)`

GetCustomFontFamilyOk returns a tuple with the CustomFontFamily field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomFontFamily

`func (o *EnvironmentSettingsOut) SetCustomFontFamily(v string)`

SetCustomFontFamily sets CustomFontFamily field to given value.

### HasCustomFontFamily

`func (o *EnvironmentSettingsOut) HasCustomFontFamily() bool`

HasCustomFontFamily returns a boolean if a field has been set.

### SetCustomFontFamilyNil

`func (o *EnvironmentSettingsOut) SetCustomFontFamilyNil(b bool)`

 SetCustomFontFamilyNil sets the value for CustomFontFamily to be an explicit nil

### UnsetCustomFontFamily
`func (o *EnvironmentSettingsOut) UnsetCustomFontFamily()`

UnsetCustomFontFamily ensures that no value is present for CustomFontFamily, not even an explicit nil
### GetCustomFontFamilyUrl

`func (o *EnvironmentSettingsOut) GetCustomFontFamilyUrl() string`

GetCustomFontFamilyUrl returns the CustomFontFamilyUrl field if non-nil, zero value otherwise.

### GetCustomFontFamilyUrlOk

`func (o *EnvironmentSettingsOut) GetCustomFontFamilyUrlOk() (*string, bool)`

GetCustomFontFamilyUrlOk returns a tuple with the CustomFontFamilyUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomFontFamilyUrl

`func (o *EnvironmentSettingsOut) SetCustomFontFamilyUrl(v string)`

SetCustomFontFamilyUrl sets CustomFontFamilyUrl field to given value.

### HasCustomFontFamilyUrl

`func (o *EnvironmentSettingsOut) HasCustomFontFamilyUrl() bool`

HasCustomFontFamilyUrl returns a boolean if a field has been set.

### SetCustomFontFamilyUrlNil

`func (o *EnvironmentSettingsOut) SetCustomFontFamilyUrlNil(b bool)`

 SetCustomFontFamilyUrlNil sets the value for CustomFontFamilyUrl to be an explicit nil

### UnsetCustomFontFamilyUrl
`func (o *EnvironmentSettingsOut) UnsetCustomFontFamilyUrl()`

UnsetCustomFontFamilyUrl ensures that no value is present for CustomFontFamilyUrl, not even an explicit nil
### GetCustomLogoUrl

`func (o *EnvironmentSettingsOut) GetCustomLogoUrl() string`

GetCustomLogoUrl returns the CustomLogoUrl field if non-nil, zero value otherwise.

### GetCustomLogoUrlOk

`func (o *EnvironmentSettingsOut) GetCustomLogoUrlOk() (*string, bool)`

GetCustomLogoUrlOk returns a tuple with the CustomLogoUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLogoUrl

`func (o *EnvironmentSettingsOut) SetCustomLogoUrl(v string)`

SetCustomLogoUrl sets CustomLogoUrl field to given value.

### HasCustomLogoUrl

`func (o *EnvironmentSettingsOut) HasCustomLogoUrl() bool`

HasCustomLogoUrl returns a boolean if a field has been set.

### SetCustomLogoUrlNil

`func (o *EnvironmentSettingsOut) SetCustomLogoUrlNil(b bool)`

 SetCustomLogoUrlNil sets the value for CustomLogoUrl to be an explicit nil

### UnsetCustomLogoUrl
`func (o *EnvironmentSettingsOut) UnsetCustomLogoUrl()`

UnsetCustomLogoUrl ensures that no value is present for CustomLogoUrl, not even an explicit nil
### GetCustomThemeOverride

`func (o *EnvironmentSettingsOut) GetCustomThemeOverride() CustomThemeOverride`

GetCustomThemeOverride returns the CustomThemeOverride field if non-nil, zero value otherwise.

### GetCustomThemeOverrideOk

`func (o *EnvironmentSettingsOut) GetCustomThemeOverrideOk() (*CustomThemeOverride, bool)`

GetCustomThemeOverrideOk returns a tuple with the CustomThemeOverride field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomThemeOverride

`func (o *EnvironmentSettingsOut) SetCustomThemeOverride(v CustomThemeOverride)`

SetCustomThemeOverride sets CustomThemeOverride field to given value.

### HasCustomThemeOverride

`func (o *EnvironmentSettingsOut) HasCustomThemeOverride() bool`

HasCustomThemeOverride returns a boolean if a field has been set.

### GetDisplayName

`func (o *EnvironmentSettingsOut) GetDisplayName() string`

GetDisplayName returns the DisplayName field if non-nil, zero value otherwise.

### GetDisplayNameOk

`func (o *EnvironmentSettingsOut) GetDisplayNameOk() (*string, bool)`

GetDisplayNameOk returns a tuple with the DisplayName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayName

`func (o *EnvironmentSettingsOut) SetDisplayName(v string)`

SetDisplayName sets DisplayName field to given value.

### HasDisplayName

`func (o *EnvironmentSettingsOut) HasDisplayName() bool`

HasDisplayName returns a boolean if a field has been set.

### SetDisplayNameNil

`func (o *EnvironmentSettingsOut) SetDisplayNameNil(b bool)`

 SetDisplayNameNil sets the value for DisplayName to be an explicit nil

### UnsetDisplayName
`func (o *EnvironmentSettingsOut) UnsetDisplayName()`

UnsetDisplayName ensures that no value is present for DisplayName, not even an explicit nil
### GetEnableChannels

`func (o *EnvironmentSettingsOut) GetEnableChannels() bool`

GetEnableChannels returns the EnableChannels field if non-nil, zero value otherwise.

### GetEnableChannelsOk

`func (o *EnvironmentSettingsOut) GetEnableChannelsOk() (*bool, bool)`

GetEnableChannelsOk returns a tuple with the EnableChannels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnableChannels

`func (o *EnvironmentSettingsOut) SetEnableChannels(v bool)`

SetEnableChannels sets EnableChannels field to given value.

### HasEnableChannels

`func (o *EnvironmentSettingsOut) HasEnableChannels() bool`

HasEnableChannels returns a boolean if a field has been set.

### GetEnableIntegrationManagement

`func (o *EnvironmentSettingsOut) GetEnableIntegrationManagement() bool`

GetEnableIntegrationManagement returns the EnableIntegrationManagement field if non-nil, zero value otherwise.

### GetEnableIntegrationManagementOk

`func (o *EnvironmentSettingsOut) GetEnableIntegrationManagementOk() (*bool, bool)`

GetEnableIntegrationManagementOk returns a tuple with the EnableIntegrationManagement field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnableIntegrationManagement

`func (o *EnvironmentSettingsOut) SetEnableIntegrationManagement(v bool)`

SetEnableIntegrationManagement sets EnableIntegrationManagement field to given value.

### HasEnableIntegrationManagement

`func (o *EnvironmentSettingsOut) HasEnableIntegrationManagement() bool`

HasEnableIntegrationManagement returns a boolean if a field has been set.

### GetEnableMessageTags

`func (o *EnvironmentSettingsOut) GetEnableMessageTags() bool`

GetEnableMessageTags returns the EnableMessageTags field if non-nil, zero value otherwise.

### GetEnableMessageTagsOk

`func (o *EnvironmentSettingsOut) GetEnableMessageTagsOk() (*bool, bool)`

GetEnableMessageTagsOk returns a tuple with the EnableMessageTags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnableMessageTags

`func (o *EnvironmentSettingsOut) SetEnableMessageTags(v bool)`

SetEnableMessageTags sets EnableMessageTags field to given value.

### HasEnableMessageTags

`func (o *EnvironmentSettingsOut) HasEnableMessageTags() bool`

HasEnableMessageTags returns a boolean if a field has been set.

### GetEnableTransformations

`func (o *EnvironmentSettingsOut) GetEnableTransformations() bool`

GetEnableTransformations returns the EnableTransformations field if non-nil, zero value otherwise.

### GetEnableTransformationsOk

`func (o *EnvironmentSettingsOut) GetEnableTransformationsOk() (*bool, bool)`

GetEnableTransformationsOk returns a tuple with the EnableTransformations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnableTransformations

`func (o *EnvironmentSettingsOut) SetEnableTransformations(v bool)`

SetEnableTransformations sets EnableTransformations field to given value.

### HasEnableTransformations

`func (o *EnvironmentSettingsOut) HasEnableTransformations() bool`

HasEnableTransformations returns a boolean if a field has been set.

### GetShowUseXwebhookPlay

`func (o *EnvironmentSettingsOut) GetShowUseXwebhookPlay() bool`

GetShowUseXwebhookPlay returns the ShowUseXwebhookPlay field if non-nil, zero value otherwise.

### GetShowUseXwebhookPlayOk

`func (o *EnvironmentSettingsOut) GetShowUseXwebhookPlayOk() (*bool, bool)`

GetShowUseXwebhookPlayOk returns a tuple with the ShowUseXwebhookPlay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowUseXwebhookPlay

`func (o *EnvironmentSettingsOut) SetShowUseXwebhookPlay(v bool)`

SetShowUseXwebhookPlay sets ShowUseXwebhookPlay field to given value.

### HasShowUseXwebhookPlay

`func (o *EnvironmentSettingsOut) HasShowUseXwebhookPlay() bool`

HasShowUseXwebhookPlay returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


