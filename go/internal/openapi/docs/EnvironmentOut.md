# EnvironmentOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **time.Time** |  | 
**EventTypes** | [**[]EventTypeOut**](EventTypeOut.md) |  | 
**Settings** | Pointer to [**SettingsOut**](SettingsOut.md) |  | [optional] 
**Version** | Pointer to **int32** |  | [optional] [default to 1]

## Methods

### NewEnvironmentOut

`func NewEnvironmentOut(createdAt time.Time, eventTypes []EventTypeOut, ) *EnvironmentOut`

NewEnvironmentOut instantiates a new EnvironmentOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnvironmentOutWithDefaults

`func NewEnvironmentOutWithDefaults() *EnvironmentOut`

NewEnvironmentOutWithDefaults instantiates a new EnvironmentOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedAt

`func (o *EnvironmentOut) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *EnvironmentOut) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *EnvironmentOut) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetEventTypes

`func (o *EnvironmentOut) GetEventTypes() []EventTypeOut`

GetEventTypes returns the EventTypes field if non-nil, zero value otherwise.

### GetEventTypesOk

`func (o *EnvironmentOut) GetEventTypesOk() (*[]EventTypeOut, bool)`

GetEventTypesOk returns a tuple with the EventTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventTypes

`func (o *EnvironmentOut) SetEventTypes(v []EventTypeOut)`

SetEventTypes sets EventTypes field to given value.


### GetSettings

`func (o *EnvironmentOut) GetSettings() SettingsOut`

GetSettings returns the Settings field if non-nil, zero value otherwise.

### GetSettingsOk

`func (o *EnvironmentOut) GetSettingsOk() (*SettingsOut, bool)`

GetSettingsOk returns a tuple with the Settings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettings

`func (o *EnvironmentOut) SetSettings(v SettingsOut)`

SetSettings sets Settings field to given value.

### HasSettings

`func (o *EnvironmentOut) HasSettings() bool`

HasSettings returns a boolean if a field has been set.

### GetVersion

`func (o *EnvironmentOut) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *EnvironmentOut) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *EnvironmentOut) SetVersion(v int32)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *EnvironmentOut) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


