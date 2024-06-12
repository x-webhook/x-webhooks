# EventTypeIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Archived** | Pointer to **bool** |  | [optional] [default to false]
**Description** | **string** |  | 
**FeatureFlag** | Pointer to **NullableString** |  | [optional] 
**Name** | **string** | The event type&#39;s name | 
**Schemas** | Pointer to **map[string]map[string]interface{}** | The schema for the event type for a specific version as a JSON schema. | [optional] 

## Methods

### NewEventTypeIn

`func NewEventTypeIn(description string, name string, ) *EventTypeIn`

NewEventTypeIn instantiates a new EventTypeIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEventTypeInWithDefaults

`func NewEventTypeInWithDefaults() *EventTypeIn`

NewEventTypeInWithDefaults instantiates a new EventTypeIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArchived

`func (o *EventTypeIn) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *EventTypeIn) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *EventTypeIn) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *EventTypeIn) HasArchived() bool`

HasArchived returns a boolean if a field has been set.

### GetDescription

`func (o *EventTypeIn) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *EventTypeIn) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *EventTypeIn) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetFeatureFlag

`func (o *EventTypeIn) GetFeatureFlag() string`

GetFeatureFlag returns the FeatureFlag field if non-nil, zero value otherwise.

### GetFeatureFlagOk

`func (o *EventTypeIn) GetFeatureFlagOk() (*string, bool)`

GetFeatureFlagOk returns a tuple with the FeatureFlag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeatureFlag

`func (o *EventTypeIn) SetFeatureFlag(v string)`

SetFeatureFlag sets FeatureFlag field to given value.

### HasFeatureFlag

`func (o *EventTypeIn) HasFeatureFlag() bool`

HasFeatureFlag returns a boolean if a field has been set.

### SetFeatureFlagNil

`func (o *EventTypeIn) SetFeatureFlagNil(b bool)`

 SetFeatureFlagNil sets the value for FeatureFlag to be an explicit nil

### UnsetFeatureFlag
`func (o *EventTypeIn) UnsetFeatureFlag()`

UnsetFeatureFlag ensures that no value is present for FeatureFlag, not even an explicit nil
### GetName

`func (o *EventTypeIn) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EventTypeIn) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EventTypeIn) SetName(v string)`

SetName sets Name field to given value.


### GetSchemas

`func (o *EventTypeIn) GetSchemas() map[string]map[string]interface{}`

GetSchemas returns the Schemas field if non-nil, zero value otherwise.

### GetSchemasOk

`func (o *EventTypeIn) GetSchemasOk() (*map[string]map[string]interface{}, bool)`

GetSchemasOk returns a tuple with the Schemas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchemas

`func (o *EventTypeIn) SetSchemas(v map[string]map[string]interface{})`

SetSchemas sets Schemas field to given value.

### HasSchemas

`func (o *EventTypeIn) HasSchemas() bool`

HasSchemas returns a boolean if a field has been set.

### SetSchemasNil

`func (o *EventTypeIn) SetSchemasNil(b bool)`

 SetSchemasNil sets the value for Schemas to be an explicit nil

### UnsetSchemas
`func (o *EventTypeIn) UnsetSchemas()`

UnsetSchemas ensures that no value is present for Schemas, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


