# SettingsIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ColorPaletteDark** | Pointer to [**CustomColorPalette**](CustomColorPalette.md) |  | [optional] 
**ColorPaletteLight** | Pointer to [**CustomColorPalette**](CustomColorPalette.md) |  | [optional] 
**CustomBaseFontSize** | Pointer to **NullableInt32** |  | [optional] 
**CustomColor** | Pointer to **NullableString** |  | [optional] 
**CustomFontFamily** | Pointer to **NullableString** |  | [optional] 
**CustomFontFamilyUrl** | Pointer to **NullableString** |  | [optional] 
**CustomLogoUrl** | Pointer to **NullableString** |  | [optional] 
**CustomThemeOverride** | Pointer to [**CustomThemeOverride**](CustomThemeOverride.md) |  | [optional] 
**DisableEndpointOnFailure** | Pointer to **bool** |  | [optional] [default to true]
**DisplayName** | Pointer to **NullableString** |  | [optional] 
**EnableChannels** | Pointer to **bool** |  | [optional] [default to false]
**EnableIntegrationManagement** | Pointer to **bool** |  | [optional] [default to false]
**EnableTransformations** | Pointer to **bool** |  | [optional] [default to false]
**EnforceHttps** | Pointer to **bool** |  | [optional] [default to true]
**EventCatalogPublished** | Pointer to **bool** |  | [optional] [default to false]
**ReadOnly** | Pointer to **bool** |  | [optional] [default to false]
**ShowUseXwebhookPlay** | Pointer to **bool** |  | [optional] [default to true]

## Methods

### NewSettingsIn

`func NewSettingsIn() *SettingsIn`

NewSettingsIn instantiates a new SettingsIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSettingsInWithDefaults

`func NewSettingsInWithDefaults() *SettingsIn`

NewSettingsInWithDefaults instantiates a new SettingsIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColorPaletteDark

`func (o *SettingsIn) GetColorPaletteDark() CustomColorPalette`

GetColorPaletteDark returns the ColorPaletteDark field if non-nil, zero value otherwise.

### GetColorPaletteDarkOk

`func (o *SettingsIn) GetColorPaletteDarkOk() (*CustomColorPalette, bool)`

GetColorPaletteDarkOk returns a tuple with the ColorPaletteDark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColorPaletteDark

`func (o *SettingsIn) SetColorPaletteDark(v CustomColorPalette)`

SetColorPaletteDark sets ColorPaletteDark field to given value.

### HasColorPaletteDark

`func (o *SettingsIn) HasColorPaletteDark() bool`

HasColorPaletteDark returns a boolean if a field has been set.

### GetColorPaletteLight

`func (o *SettingsIn) GetColorPaletteLight() CustomColorPalette`

GetColorPaletteLight returns the ColorPaletteLight field if non-nil, zero value otherwise.

### GetColorPaletteLightOk

`func (o *SettingsIn) GetColorPaletteLightOk() (*CustomColorPalette, bool)`

GetColorPaletteLightOk returns a tuple with the ColorPaletteLight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColorPaletteLight

`func (o *SettingsIn) SetColorPaletteLight(v CustomColorPalette)`

SetColorPaletteLight sets ColorPaletteLight field to given value.

### HasColorPaletteLight

`func (o *SettingsIn) HasColorPaletteLight() bool`

HasColorPaletteLight returns a boolean if a field has been set.

### GetCustomBaseFontSize

`func (o *SettingsIn) GetCustomBaseFontSize() int32`

GetCustomBaseFontSize returns the CustomBaseFontSize field if non-nil, zero value otherwise.

### GetCustomBaseFontSizeOk

`func (o *SettingsIn) GetCustomBaseFontSizeOk() (*int32, bool)`

GetCustomBaseFontSizeOk returns a tuple with the CustomBaseFontSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomBaseFontSize

`func (o *SettingsIn) SetCustomBaseFontSize(v int32)`

SetCustomBaseFontSize sets CustomBaseFontSize field to given value.

### HasCustomBaseFontSize

`func (o *SettingsIn) HasCustomBaseFontSize() bool`

HasCustomBaseFontSize returns a boolean if a field has been set.

### SetCustomBaseFontSizeNil

`func (o *SettingsIn) SetCustomBaseFontSizeNil(b bool)`

 SetCustomBaseFontSizeNil sets the value for CustomBaseFontSize to be an explicit nil

### UnsetCustomBaseFontSize
`func (o *SettingsIn) UnsetCustomBaseFontSize()`

UnsetCustomBaseFontSize ensures that no value is present for CustomBaseFontSize, not even an explicit nil
### GetCustomColor

`func (o *SettingsIn) GetCustomColor() string`

GetCustomColor returns the CustomColor field if non-nil, zero value otherwise.

### GetCustomColorOk

`func (o *SettingsIn) GetCustomColorOk() (*string, bool)`

GetCustomColorOk returns a tuple with the CustomColor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomColor

`func (o *SettingsIn) SetCustomColor(v string)`

SetCustomColor sets CustomColor field to given value.

### HasCustomColor

`func (o *SettingsIn) HasCustomColor() bool`

HasCustomColor returns a boolean if a field has been set.

### SetCustomColorNil

`func (o *SettingsIn) SetCustomColorNil(b bool)`

 SetCustomColorNil sets the value for CustomColor to be an explicit nil

### UnsetCustomColor
`func (o *SettingsIn) UnsetCustomColor()`

UnsetCustomColor ensures that no value is present for CustomColor, not even an explicit nil
### GetCustomFontFamily

`func (o *SettingsIn) GetCustomFontFamily() string`

GetCustomFontFamily returns the CustomFontFamily field if non-nil, zero value otherwise.

### GetCustomFontFamilyOk

`func (o *SettingsIn) GetCustomFontFamilyOk() (*string, bool)`

GetCustomFontFamilyOk returns a tuple with the CustomFontFamily field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomFontFamily

`func (o *SettingsIn) SetCustomFontFamily(v string)`

SetCustomFontFamily sets CustomFontFamily field to given value.

### HasCustomFontFamily

`func (o *SettingsIn) HasCustomFontFamily() bool`

HasCustomFontFamily returns a boolean if a field has been set.

### SetCustomFontFamilyNil

`func (o *SettingsIn) SetCustomFontFamilyNil(b bool)`

 SetCustomFontFamilyNil sets the value for CustomFontFamily to be an explicit nil

### UnsetCustomFontFamily
`func (o *SettingsIn) UnsetCustomFontFamily()`

UnsetCustomFontFamily ensures that no value is present for CustomFontFamily, not even an explicit nil
### GetCustomFontFamilyUrl

`func (o *SettingsIn) GetCustomFontFamilyUrl() string`

GetCustomFontFamilyUrl returns the CustomFontFamilyUrl field if non-nil, zero value otherwise.

### GetCustomFontFamilyUrlOk

`func (o *SettingsIn) GetCustomFontFamilyUrlOk() (*string, bool)`

GetCustomFontFamilyUrlOk returns a tuple with the CustomFontFamilyUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomFontFamilyUrl

`func (o *SettingsIn) SetCustomFontFamilyUrl(v string)`

SetCustomFontFamilyUrl sets CustomFontFamilyUrl field to given value.

### HasCustomFontFamilyUrl

`func (o *SettingsIn) HasCustomFontFamilyUrl() bool`

HasCustomFontFamilyUrl returns a boolean if a field has been set.

### SetCustomFontFamilyUrlNil

`func (o *SettingsIn) SetCustomFontFamilyUrlNil(b bool)`

 SetCustomFontFamilyUrlNil sets the value for CustomFontFamilyUrl to be an explicit nil

### UnsetCustomFontFamilyUrl
`func (o *SettingsIn) UnsetCustomFontFamilyUrl()`

UnsetCustomFontFamilyUrl ensures that no value is present for CustomFontFamilyUrl, not even an explicit nil
### GetCustomLogoUrl

`func (o *SettingsIn) GetCustomLogoUrl() string`

GetCustomLogoUrl returns the CustomLogoUrl field if non-nil, zero value otherwise.

### GetCustomLogoUrlOk

`func (o *SettingsIn) GetCustomLogoUrlOk() (*string, bool)`

GetCustomLogoUrlOk returns a tuple with the CustomLogoUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLogoUrl

`func (o *SettingsIn) SetCustomLogoUrl(v string)`

SetCustomLogoUrl sets CustomLogoUrl field to given value.

### HasCustomLogoUrl

`func (o *SettingsIn) HasCustomLogoUrl() bool`

HasCustomLogoUrl returns a boolean if a field has been set.

### SetCustomLogoUrlNil

`func (o *SettingsIn) SetCustomLogoUrlNil(b bool)`

 SetCustomLogoUrlNil sets the value for CustomLogoUrl to be an explicit nil

### UnsetCustomLogoUrl
`func (o *SettingsIn) UnsetCustomLogoUrl()`

UnsetCustomLogoUrl ensures that no value is present for CustomLogoUrl, not even an explicit nil
### GetCustomThemeOverride

`func (o *SettingsIn) GetCustomThemeOverride() CustomThemeOverride`

GetCustomThemeOverride returns the CustomThemeOverride field if non-nil, zero value otherwise.

### GetCustomThemeOverrideOk

`func (o *SettingsIn) GetCustomThemeOverrideOk() (*CustomThemeOverride, bool)`

GetCustomThemeOverrideOk returns a tuple with the CustomThemeOverride field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomThemeOverride

`func (o *SettingsIn) SetCustomThemeOverride(v CustomThemeOverride)`

SetCustomThemeOverride sets CustomThemeOverride field to given value.

### HasCustomThemeOverride

`func (o *SettingsIn) HasCustomThemeOverride() bool`

HasCustomThemeOverride returns a boolean if a field has been set.

### GetDisableEndpointOnFailure

`func (o *SettingsIn) GetDisableEndpointOnFailure() bool`

GetDisableEndpointOnFailure returns the DisableEndpointOnFailure field if non-nil, zero value otherwise.

### GetDisableEndpointOnFailureOk

`func (o *SettingsIn) GetDisableEndpointOnFailureOk() (*bool, bool)`

GetDisableEndpointOnFailureOk returns a tuple with the DisableEndpointOnFailure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisableEndpointOnFailure

`func (o *SettingsIn) SetDisableEndpointOnFailure(v bool)`

SetDisableEndpointOnFailure sets DisableEndpointOnFailure field to given value.

### HasDisableEndpointOnFailure

`func (o *SettingsIn) HasDisableEndpointOnFailure() bool`

HasDisableEndpointOnFailure returns a boolean if a field has been set.

### GetDisplayName

`func (o *SettingsIn) GetDisplayName() string`

GetDisplayName returns the DisplayName field if non-nil, zero value otherwise.

### GetDisplayNameOk

`func (o *SettingsIn) GetDisplayNameOk() (*string, bool)`

GetDisplayNameOk returns a tuple with the DisplayName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayName

`func (o *SettingsIn) SetDisplayName(v string)`

SetDisplayName sets DisplayName field to given value.

### HasDisplayName

`func (o *SettingsIn) HasDisplayName() bool`

HasDisplayName returns a boolean if a field has been set.

### SetDisplayNameNil

`func (o *SettingsIn) SetDisplayNameNil(b bool)`

 SetDisplayNameNil sets the value for DisplayName to be an explicit nil

### UnsetDisplayName
`func (o *SettingsIn) UnsetDisplayName()`

UnsetDisplayName ensures that no value is present for DisplayName, not even an explicit nil
### GetEnableChannels

`func (o *SettingsIn) GetEnableChannels() bool`

GetEnableChannels returns the EnableChannels field if non-nil, zero value otherwise.

### GetEnableChannelsOk

`func (o *SettingsIn) GetEnableChannelsOk() (*bool, bool)`

GetEnableChannelsOk returns a tuple with the EnableChannels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnableChannels

`func (o *SettingsIn) SetEnableChannels(v bool)`

SetEnableChannels sets EnableChannels field to given value.

### HasEnableChannels

`func (o *SettingsIn) HasEnableChannels() bool`

HasEnableChannels returns a boolean if a field has been set.

### GetEnableIntegrationManagement

`func (o *SettingsIn) GetEnableIntegrationManagement() bool`

GetEnableIntegrationManagement returns the EnableIntegrationManagement field if non-nil, zero value otherwise.

### GetEnableIntegrationManagementOk

`func (o *SettingsIn) GetEnableIntegrationManagementOk() (*bool, bool)`

GetEnableIntegrationManagementOk returns a tuple with the EnableIntegrationManagement field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnableIntegrationManagement

`func (o *SettingsIn) SetEnableIntegrationManagement(v bool)`

SetEnableIntegrationManagement sets EnableIntegrationManagement field to given value.

### HasEnableIntegrationManagement

`func (o *SettingsIn) HasEnableIntegrationManagement() bool`

HasEnableIntegrationManagement returns a boolean if a field has been set.

### GetEnableTransformations

`func (o *SettingsIn) GetEnableTransformations() bool`

GetEnableTransformations returns the EnableTransformations field if non-nil, zero value otherwise.

### GetEnableTransformationsOk

`func (o *SettingsIn) GetEnableTransformationsOk() (*bool, bool)`

GetEnableTransformationsOk returns a tuple with the EnableTransformations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnableTransformations

`func (o *SettingsIn) SetEnableTransformations(v bool)`

SetEnableTransformations sets EnableTransformations field to given value.

### HasEnableTransformations

`func (o *SettingsIn) HasEnableTransformations() bool`

HasEnableTransformations returns a boolean if a field has been set.

### GetEnforceHttps

`func (o *SettingsIn) GetEnforceHttps() bool`

GetEnforceHttps returns the EnforceHttps field if non-nil, zero value otherwise.

### GetEnforceHttpsOk

`func (o *SettingsIn) GetEnforceHttpsOk() (*bool, bool)`

GetEnforceHttpsOk returns a tuple with the EnforceHttps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnforceHttps

`func (o *SettingsIn) SetEnforceHttps(v bool)`

SetEnforceHttps sets EnforceHttps field to given value.

### HasEnforceHttps

`func (o *SettingsIn) HasEnforceHttps() bool`

HasEnforceHttps returns a boolean if a field has been set.

### GetEventCatalogPublished

`func (o *SettingsIn) GetEventCatalogPublished() bool`

GetEventCatalogPublished returns the EventCatalogPublished field if non-nil, zero value otherwise.

### GetEventCatalogPublishedOk

`func (o *SettingsIn) GetEventCatalogPublishedOk() (*bool, bool)`

GetEventCatalogPublishedOk returns a tuple with the EventCatalogPublished field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventCatalogPublished

`func (o *SettingsIn) SetEventCatalogPublished(v bool)`

SetEventCatalogPublished sets EventCatalogPublished field to given value.

### HasEventCatalogPublished

`func (o *SettingsIn) HasEventCatalogPublished() bool`

HasEventCatalogPublished returns a boolean if a field has been set.

### GetReadOnly

`func (o *SettingsIn) GetReadOnly() bool`

GetReadOnly returns the ReadOnly field if non-nil, zero value otherwise.

### GetReadOnlyOk

`func (o *SettingsIn) GetReadOnlyOk() (*bool, bool)`

GetReadOnlyOk returns a tuple with the ReadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReadOnly

`func (o *SettingsIn) SetReadOnly(v bool)`

SetReadOnly sets ReadOnly field to given value.

### HasReadOnly

`func (o *SettingsIn) HasReadOnly() bool`

HasReadOnly returns a boolean if a field has been set.

### GetShowUseXwebhookPlay

`func (o *SettingsIn) GetShowUseXwebhookPlay() bool`

GetShowUseXwebhookPlay returns the ShowUseXwebhookPlay field if non-nil, zero value otherwise.

### GetShowUseXwebhookPlayOk

`func (o *SettingsIn) GetShowUseXwebhookPlayOk() (*bool, bool)`

GetShowUseXwebhookPlayOk returns a tuple with the ShowUseXwebhookPlay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowUseXwebhookPlay

`func (o *SettingsIn) SetShowUseXwebhookPlay(v bool)`

SetShowUseXwebhookPlay sets ShowUseXwebhookPlay field to given value.

### HasShowUseXwebhookPlay

`func (o *SettingsIn) HasShowUseXwebhookPlay() bool`

HasShowUseXwebhookPlay returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


