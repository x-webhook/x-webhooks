# ApplicationOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **time.Time** |  | 
**Id** | **string** | The app&#39;s ID | 
**Metadata** | **map[string]interface{}** |  | 
**Name** | **string** |  | 
**RateLimit** | Pointer to **NullableInt32** |  | [optional] 
**Uid** | Pointer to **NullableString** | The app&#39;s UID | [optional] 
**UpdatedAt** | **time.Time** |  | 
**DisableDefaultSignature** | Pointer to **NullableBool** | Disable the webhook server auto generate signature for the request send to this application&#39;s endpoint. | [optional] 

## Methods

### NewApplicationOut

`func NewApplicationOut(createdAt time.Time, id string, metadata map[string]interface{}, name string, updatedAt time.Time, ) *ApplicationOut`

NewApplicationOut instantiates a new ApplicationOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApplicationOutWithDefaults

`func NewApplicationOutWithDefaults() *ApplicationOut`

NewApplicationOutWithDefaults instantiates a new ApplicationOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedAt

`func (o *ApplicationOut) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *ApplicationOut) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *ApplicationOut) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetId

`func (o *ApplicationOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ApplicationOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ApplicationOut) SetId(v string)`

SetId sets Id field to given value.


### GetMetadata

`func (o *ApplicationOut) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *ApplicationOut) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *ApplicationOut) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.


### GetName

`func (o *ApplicationOut) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ApplicationOut) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ApplicationOut) SetName(v string)`

SetName sets Name field to given value.


### GetRateLimit

`func (o *ApplicationOut) GetRateLimit() int32`

GetRateLimit returns the RateLimit field if non-nil, zero value otherwise.

### GetRateLimitOk

`func (o *ApplicationOut) GetRateLimitOk() (*int32, bool)`

GetRateLimitOk returns a tuple with the RateLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateLimit

`func (o *ApplicationOut) SetRateLimit(v int32)`

SetRateLimit sets RateLimit field to given value.

### HasRateLimit

`func (o *ApplicationOut) HasRateLimit() bool`

HasRateLimit returns a boolean if a field has been set.

### SetRateLimitNil

`func (o *ApplicationOut) SetRateLimitNil(b bool)`

 SetRateLimitNil sets the value for RateLimit to be an explicit nil

### UnsetRateLimit
`func (o *ApplicationOut) UnsetRateLimit()`

UnsetRateLimit ensures that no value is present for RateLimit, not even an explicit nil
### GetUid

`func (o *ApplicationOut) GetUid() string`

GetUid returns the Uid field if non-nil, zero value otherwise.

### GetUidOk

`func (o *ApplicationOut) GetUidOk() (*string, bool)`

GetUidOk returns a tuple with the Uid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUid

`func (o *ApplicationOut) SetUid(v string)`

SetUid sets Uid field to given value.

### HasUid

`func (o *ApplicationOut) HasUid() bool`

HasUid returns a boolean if a field has been set.

### SetUidNil

`func (o *ApplicationOut) SetUidNil(b bool)`

 SetUidNil sets the value for Uid to be an explicit nil

### UnsetUid
`func (o *ApplicationOut) UnsetUid()`

UnsetUid ensures that no value is present for Uid, not even an explicit nil
### GetUpdatedAt

`func (o *ApplicationOut) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *ApplicationOut) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *ApplicationOut) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.


### GetDisableDefaultSignature

`func (o *ApplicationOut) GetDisableDefaultSignature() bool`

GetDisableDefaultSignature returns the DisableDefaultSignature field if non-nil, zero value otherwise.

### GetDisableDefaultSignatureOk

`func (o *ApplicationOut) GetDisableDefaultSignatureOk() (*bool, bool)`

GetDisableDefaultSignatureOk returns a tuple with the DisableDefaultSignature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisableDefaultSignature

`func (o *ApplicationOut) SetDisableDefaultSignature(v bool)`

SetDisableDefaultSignature sets DisableDefaultSignature field to given value.

### HasDisableDefaultSignature

`func (o *ApplicationOut) HasDisableDefaultSignature() bool`

HasDisableDefaultSignature returns a boolean if a field has been set.

### SetDisableDefaultSignatureNil

`func (o *ApplicationOut) SetDisableDefaultSignatureNil(b bool)`

 SetDisableDefaultSignatureNil sets the value for DisableDefaultSignature to be an explicit nil

### UnsetDisableDefaultSignature
`func (o *ApplicationOut) UnsetDisableDefaultSignature()`

UnsetDisableDefaultSignature ensures that no value is present for DisableDefaultSignature, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


