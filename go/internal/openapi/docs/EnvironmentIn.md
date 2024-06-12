# EnvironmentIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **time.Time** |  | 
**EventTypes** | Pointer to [**[]EventTypeIn**](EventTypeIn.md) |  | [optional] 
**Settings** | Pointer to [**SettingsIn**](SettingsIn.md) |  | [optional] 
**Version** | **int32** |  | 

## Methods

### NewEnvironmentIn

`func NewEnvironmentIn(createdAt time.Time, version int32, ) *EnvironmentIn`

NewEnvironmentIn instantiates a new EnvironmentIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnvironmentInWithDefaults

`func NewEnvironmentInWithDefaults() *EnvironmentIn`

NewEnvironmentInWithDefaults instantiates a new EnvironmentIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedAt

`func (o *EnvironmentIn) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *EnvironmentIn) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *EnvironmentIn) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetEventTypes

`func (o *EnvironmentIn) GetEventTypes() []EventTypeIn`

GetEventTypes returns the EventTypes field if non-nil, zero value otherwise.

### GetEventTypesOk

`func (o *EnvironmentIn) GetEventTypesOk() (*[]EventTypeIn, bool)`

GetEventTypesOk returns a tuple with the EventTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventTypes

`func (o *EnvironmentIn) SetEventTypes(v []EventTypeIn)`

SetEventTypes sets EventTypes field to given value.

### HasEventTypes

`func (o *EnvironmentIn) HasEventTypes() bool`

HasEventTypes returns a boolean if a field has been set.

### SetEventTypesNil

`func (o *EnvironmentIn) SetEventTypesNil(b bool)`

 SetEventTypesNil sets the value for EventTypes to be an explicit nil

### UnsetEventTypes
`func (o *EnvironmentIn) UnsetEventTypes()`

UnsetEventTypes ensures that no value is present for EventTypes, not even an explicit nil
### GetSettings

`func (o *EnvironmentIn) GetSettings() SettingsIn`

GetSettings returns the Settings field if non-nil, zero value otherwise.

### GetSettingsOk

`func (o *EnvironmentIn) GetSettingsOk() (*SettingsIn, bool)`

GetSettingsOk returns a tuple with the Settings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettings

`func (o *EnvironmentIn) SetSettings(v SettingsIn)`

SetSettings sets Settings field to given value.

### HasSettings

`func (o *EnvironmentIn) HasSettings() bool`

HasSettings returns a boolean if a field has been set.

### GetVersion

`func (o *EnvironmentIn) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *EnvironmentIn) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *EnvironmentIn) SetVersion(v int32)`

SetVersion sets Version field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


