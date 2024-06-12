# AppPortalAccessIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Expiry** | Pointer to **NullableInt32** | How long the token will be valid for, in seconds.  Valid values are between 1 hour and 7 days. The default is 7 days. | [optional] [default to 604800]
**FeatureFlags** | Pointer to **[]string** | The set of feature flags the created token will have access to. | [optional] 
**ReadOnly** | Pointer to **NullableBool** | Whether the app portal should be in read-only mode. | [optional] 

## Methods

### NewAppPortalAccessIn

`func NewAppPortalAccessIn() *AppPortalAccessIn`

NewAppPortalAccessIn instantiates a new AppPortalAccessIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAppPortalAccessInWithDefaults

`func NewAppPortalAccessInWithDefaults() *AppPortalAccessIn`

NewAppPortalAccessInWithDefaults instantiates a new AppPortalAccessIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExpiry

`func (o *AppPortalAccessIn) GetExpiry() int32`

GetExpiry returns the Expiry field if non-nil, zero value otherwise.

### GetExpiryOk

`func (o *AppPortalAccessIn) GetExpiryOk() (*int32, bool)`

GetExpiryOk returns a tuple with the Expiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiry

`func (o *AppPortalAccessIn) SetExpiry(v int32)`

SetExpiry sets Expiry field to given value.

### HasExpiry

`func (o *AppPortalAccessIn) HasExpiry() bool`

HasExpiry returns a boolean if a field has been set.

### SetExpiryNil

`func (o *AppPortalAccessIn) SetExpiryNil(b bool)`

 SetExpiryNil sets the value for Expiry to be an explicit nil

### UnsetExpiry
`func (o *AppPortalAccessIn) UnsetExpiry()`

UnsetExpiry ensures that no value is present for Expiry, not even an explicit nil
### GetFeatureFlags

`func (o *AppPortalAccessIn) GetFeatureFlags() []string`

GetFeatureFlags returns the FeatureFlags field if non-nil, zero value otherwise.

### GetFeatureFlagsOk

`func (o *AppPortalAccessIn) GetFeatureFlagsOk() (*[]string, bool)`

GetFeatureFlagsOk returns a tuple with the FeatureFlags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeatureFlags

`func (o *AppPortalAccessIn) SetFeatureFlags(v []string)`

SetFeatureFlags sets FeatureFlags field to given value.

### HasFeatureFlags

`func (o *AppPortalAccessIn) HasFeatureFlags() bool`

HasFeatureFlags returns a boolean if a field has been set.

### GetReadOnly

`func (o *AppPortalAccessIn) GetReadOnly() bool`

GetReadOnly returns the ReadOnly field if non-nil, zero value otherwise.

### GetReadOnlyOk

`func (o *AppPortalAccessIn) GetReadOnlyOk() (*bool, bool)`

GetReadOnlyOk returns a tuple with the ReadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReadOnly

`func (o *AppPortalAccessIn) SetReadOnly(v bool)`

SetReadOnly sets ReadOnly field to given value.

### HasReadOnly

`func (o *AppPortalAccessIn) HasReadOnly() bool`

HasReadOnly returns a boolean if a field has been set.

### SetReadOnlyNil

`func (o *AppPortalAccessIn) SetReadOnlyNil(b bool)`

 SetReadOnlyNil sets the value for ReadOnly to be an explicit nil

### UnsetReadOnly
`func (o *AppPortalAccessIn) UnsetReadOnly()`

UnsetReadOnly ensures that no value is present for ReadOnly, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


