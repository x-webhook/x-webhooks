# ApplicationIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | Pointer to **map[string]interface{}** |  | [optional] [default to {}]
**Name** | **string** |  | 
**RateLimit** | Pointer to **NullableInt32** |  | [optional] 
**Uid** | Pointer to **NullableString** | Optional unique identifier for the application | [optional] 
**Description** | Pointer to **NullableString** | The application description | [optional] 
**DisableDefaultSignature** | Pointer to **NullableBool** | Disable the webhook server auto generate signature for the request send to this application&#39;s endpoint. | [optional] 

## Methods

### NewApplicationIn

`func NewApplicationIn(name string, ) *ApplicationIn`

NewApplicationIn instantiates a new ApplicationIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApplicationInWithDefaults

`func NewApplicationInWithDefaults() *ApplicationIn`

NewApplicationInWithDefaults instantiates a new ApplicationIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMetadata

`func (o *ApplicationIn) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *ApplicationIn) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *ApplicationIn) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *ApplicationIn) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *ApplicationIn) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *ApplicationIn) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetName

`func (o *ApplicationIn) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ApplicationIn) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ApplicationIn) SetName(v string)`

SetName sets Name field to given value.


### GetRateLimit

`func (o *ApplicationIn) GetRateLimit() int32`

GetRateLimit returns the RateLimit field if non-nil, zero value otherwise.

### GetRateLimitOk

`func (o *ApplicationIn) GetRateLimitOk() (*int32, bool)`

GetRateLimitOk returns a tuple with the RateLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateLimit

`func (o *ApplicationIn) SetRateLimit(v int32)`

SetRateLimit sets RateLimit field to given value.

### HasRateLimit

`func (o *ApplicationIn) HasRateLimit() bool`

HasRateLimit returns a boolean if a field has been set.

### SetRateLimitNil

`func (o *ApplicationIn) SetRateLimitNil(b bool)`

 SetRateLimitNil sets the value for RateLimit to be an explicit nil

### UnsetRateLimit
`func (o *ApplicationIn) UnsetRateLimit()`

UnsetRateLimit ensures that no value is present for RateLimit, not even an explicit nil
### GetUid

`func (o *ApplicationIn) GetUid() string`

GetUid returns the Uid field if non-nil, zero value otherwise.

### GetUidOk

`func (o *ApplicationIn) GetUidOk() (*string, bool)`

GetUidOk returns a tuple with the Uid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUid

`func (o *ApplicationIn) SetUid(v string)`

SetUid sets Uid field to given value.

### HasUid

`func (o *ApplicationIn) HasUid() bool`

HasUid returns a boolean if a field has been set.

### SetUidNil

`func (o *ApplicationIn) SetUidNil(b bool)`

 SetUidNil sets the value for Uid to be an explicit nil

### UnsetUid
`func (o *ApplicationIn) UnsetUid()`

UnsetUid ensures that no value is present for Uid, not even an explicit nil
### GetDescription

`func (o *ApplicationIn) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ApplicationIn) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ApplicationIn) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ApplicationIn) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *ApplicationIn) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *ApplicationIn) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetDisableDefaultSignature

`func (o *ApplicationIn) GetDisableDefaultSignature() bool`

GetDisableDefaultSignature returns the DisableDefaultSignature field if non-nil, zero value otherwise.

### GetDisableDefaultSignatureOk

`func (o *ApplicationIn) GetDisableDefaultSignatureOk() (*bool, bool)`

GetDisableDefaultSignatureOk returns a tuple with the DisableDefaultSignature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisableDefaultSignature

`func (o *ApplicationIn) SetDisableDefaultSignature(v bool)`

SetDisableDefaultSignature sets DisableDefaultSignature field to given value.

### HasDisableDefaultSignature

`func (o *ApplicationIn) HasDisableDefaultSignature() bool`

HasDisableDefaultSignature returns a boolean if a field has been set.

### SetDisableDefaultSignatureNil

`func (o *ApplicationIn) SetDisableDefaultSignatureNil(b bool)`

 SetDisableDefaultSignatureNil sets the value for DisableDefaultSignature to be an explicit nil

### UnsetDisableDefaultSignature
`func (o *ApplicationIn) UnsetDisableDefaultSignature()`

UnsetDisableDefaultSignature ensures that no value is present for DisableDefaultSignature, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


