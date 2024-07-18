# EndpointPatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channels** | Pointer to **[]string** |  | [optional] 
**Description** | Pointer to **string** |  | [optional] 
**Disabled** | Pointer to **bool** |  | [optional] 
**FilterTypes** | Pointer to **[]string** |  | [optional] 
**Metadata** | Pointer to **map[string]interface{}** |  | [optional] 
**Headers** | Pointer to **map[string]string** |  | [optional] 
**PayloadRules** | Pointer to **map[string]interface{}** | The filter rules for the message payload. | [optional] 
**RateLimit** | Pointer to **NullableInt32** |  | [optional] 
**Secret** | Pointer to **NullableString** | The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24. | [optional] 
**Uid** | Pointer to **NullableString** | The ep&#39;s UID | [optional] 
**Url** | Pointer to **string** |  | [optional] 
**Version** | Pointer to **int32** |  | [optional] 

## Methods

### NewEndpointPatch

`func NewEndpointPatch() *EndpointPatch`

NewEndpointPatch instantiates a new EndpointPatch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointPatchWithDefaults

`func NewEndpointPatchWithDefaults() *EndpointPatch`

NewEndpointPatchWithDefaults instantiates a new EndpointPatch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannels

`func (o *EndpointPatch) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *EndpointPatch) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *EndpointPatch) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *EndpointPatch) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *EndpointPatch) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *EndpointPatch) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetDescription

`func (o *EndpointPatch) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *EndpointPatch) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *EndpointPatch) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *EndpointPatch) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDisabled

`func (o *EndpointPatch) GetDisabled() bool`

GetDisabled returns the Disabled field if non-nil, zero value otherwise.

### GetDisabledOk

`func (o *EndpointPatch) GetDisabledOk() (*bool, bool)`

GetDisabledOk returns a tuple with the Disabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisabled

`func (o *EndpointPatch) SetDisabled(v bool)`

SetDisabled sets Disabled field to given value.

### HasDisabled

`func (o *EndpointPatch) HasDisabled() bool`

HasDisabled returns a boolean if a field has been set.

### GetFilterTypes

`func (o *EndpointPatch) GetFilterTypes() []string`

GetFilterTypes returns the FilterTypes field if non-nil, zero value otherwise.

### GetFilterTypesOk

`func (o *EndpointPatch) GetFilterTypesOk() (*[]string, bool)`

GetFilterTypesOk returns a tuple with the FilterTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterTypes

`func (o *EndpointPatch) SetFilterTypes(v []string)`

SetFilterTypes sets FilterTypes field to given value.

### HasFilterTypes

`func (o *EndpointPatch) HasFilterTypes() bool`

HasFilterTypes returns a boolean if a field has been set.

### SetFilterTypesNil

`func (o *EndpointPatch) SetFilterTypesNil(b bool)`

 SetFilterTypesNil sets the value for FilterTypes to be an explicit nil

### UnsetFilterTypes
`func (o *EndpointPatch) UnsetFilterTypes()`

UnsetFilterTypes ensures that no value is present for FilterTypes, not even an explicit nil
### GetMetadata

`func (o *EndpointPatch) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *EndpointPatch) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *EndpointPatch) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *EndpointPatch) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *EndpointPatch) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *EndpointPatch) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetHeaders

`func (o *EndpointPatch) GetHeaders() map[string]string`

GetHeaders returns the Headers field if non-nil, zero value otherwise.

### GetHeadersOk

`func (o *EndpointPatch) GetHeadersOk() (*map[string]string, bool)`

GetHeadersOk returns a tuple with the Headers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeaders

`func (o *EndpointPatch) SetHeaders(v map[string]string)`

SetHeaders sets Headers field to given value.

### HasHeaders

`func (o *EndpointPatch) HasHeaders() bool`

HasHeaders returns a boolean if a field has been set.

### SetHeadersNil

`func (o *EndpointPatch) SetHeadersNil(b bool)`

 SetHeadersNil sets the value for Headers to be an explicit nil

### UnsetHeaders
`func (o *EndpointPatch) UnsetHeaders()`

UnsetHeaders ensures that no value is present for Headers, not even an explicit nil
### GetPayloadRules

`func (o *EndpointPatch) GetPayloadRules() map[string]interface{}`

GetPayloadRules returns the PayloadRules field if non-nil, zero value otherwise.

### GetPayloadRulesOk

`func (o *EndpointPatch) GetPayloadRulesOk() (*map[string]interface{}, bool)`

GetPayloadRulesOk returns a tuple with the PayloadRules field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayloadRules

`func (o *EndpointPatch) SetPayloadRules(v map[string]interface{})`

SetPayloadRules sets PayloadRules field to given value.

### HasPayloadRules

`func (o *EndpointPatch) HasPayloadRules() bool`

HasPayloadRules returns a boolean if a field has been set.

### SetPayloadRulesNil

`func (o *EndpointPatch) SetPayloadRulesNil(b bool)`

 SetPayloadRulesNil sets the value for PayloadRules to be an explicit nil

### UnsetPayloadRules
`func (o *EndpointPatch) UnsetPayloadRules()`

UnsetPayloadRules ensures that no value is present for PayloadRules, not even an explicit nil
### GetRateLimit

`func (o *EndpointPatch) GetRateLimit() int32`

GetRateLimit returns the RateLimit field if non-nil, zero value otherwise.

### GetRateLimitOk

`func (o *EndpointPatch) GetRateLimitOk() (*int32, bool)`

GetRateLimitOk returns a tuple with the RateLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateLimit

`func (o *EndpointPatch) SetRateLimit(v int32)`

SetRateLimit sets RateLimit field to given value.

### HasRateLimit

`func (o *EndpointPatch) HasRateLimit() bool`

HasRateLimit returns a boolean if a field has been set.

### SetRateLimitNil

`func (o *EndpointPatch) SetRateLimitNil(b bool)`

 SetRateLimitNil sets the value for RateLimit to be an explicit nil

### UnsetRateLimit
`func (o *EndpointPatch) UnsetRateLimit()`

UnsetRateLimit ensures that no value is present for RateLimit, not even an explicit nil
### GetSecret

`func (o *EndpointPatch) GetSecret() string`

GetSecret returns the Secret field if non-nil, zero value otherwise.

### GetSecretOk

`func (o *EndpointPatch) GetSecretOk() (*string, bool)`

GetSecretOk returns a tuple with the Secret field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecret

`func (o *EndpointPatch) SetSecret(v string)`

SetSecret sets Secret field to given value.

### HasSecret

`func (o *EndpointPatch) HasSecret() bool`

HasSecret returns a boolean if a field has been set.

### SetSecretNil

`func (o *EndpointPatch) SetSecretNil(b bool)`

 SetSecretNil sets the value for Secret to be an explicit nil

### UnsetSecret
`func (o *EndpointPatch) UnsetSecret()`

UnsetSecret ensures that no value is present for Secret, not even an explicit nil
### GetUid

`func (o *EndpointPatch) GetUid() string`

GetUid returns the Uid field if non-nil, zero value otherwise.

### GetUidOk

`func (o *EndpointPatch) GetUidOk() (*string, bool)`

GetUidOk returns a tuple with the Uid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUid

`func (o *EndpointPatch) SetUid(v string)`

SetUid sets Uid field to given value.

### HasUid

`func (o *EndpointPatch) HasUid() bool`

HasUid returns a boolean if a field has been set.

### SetUidNil

`func (o *EndpointPatch) SetUidNil(b bool)`

 SetUidNil sets the value for Uid to be an explicit nil

### UnsetUid
`func (o *EndpointPatch) UnsetUid()`

UnsetUid ensures that no value is present for Uid, not even an explicit nil
### GetUrl

`func (o *EndpointPatch) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *EndpointPatch) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *EndpointPatch) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *EndpointPatch) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetVersion

`func (o *EndpointPatch) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *EndpointPatch) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *EndpointPatch) SetVersion(v int32)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *EndpointPatch) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


