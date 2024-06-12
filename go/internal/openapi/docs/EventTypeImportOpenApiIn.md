# EventTypeImportOpenApiIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DryRun** | Pointer to **bool** | If &#x60;true&#x60;, return the event types that would be modified without actually modifying them. | [optional] [default to false]
**Spec** | Pointer to **map[string]map[string]interface{}** | A pre-parsed JSON spec. | [optional] 
**SpecRaw** | Pointer to **NullableString** | A string, parsed by the server as YAML or JSON. | [optional] 

## Methods

### NewEventTypeImportOpenApiIn

`func NewEventTypeImportOpenApiIn() *EventTypeImportOpenApiIn`

NewEventTypeImportOpenApiIn instantiates a new EventTypeImportOpenApiIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEventTypeImportOpenApiInWithDefaults

`func NewEventTypeImportOpenApiInWithDefaults() *EventTypeImportOpenApiIn`

NewEventTypeImportOpenApiInWithDefaults instantiates a new EventTypeImportOpenApiIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDryRun

`func (o *EventTypeImportOpenApiIn) GetDryRun() bool`

GetDryRun returns the DryRun field if non-nil, zero value otherwise.

### GetDryRunOk

`func (o *EventTypeImportOpenApiIn) GetDryRunOk() (*bool, bool)`

GetDryRunOk returns a tuple with the DryRun field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDryRun

`func (o *EventTypeImportOpenApiIn) SetDryRun(v bool)`

SetDryRun sets DryRun field to given value.

### HasDryRun

`func (o *EventTypeImportOpenApiIn) HasDryRun() bool`

HasDryRun returns a boolean if a field has been set.

### GetSpec

`func (o *EventTypeImportOpenApiIn) GetSpec() map[string]map[string]interface{}`

GetSpec returns the Spec field if non-nil, zero value otherwise.

### GetSpecOk

`func (o *EventTypeImportOpenApiIn) GetSpecOk() (*map[string]map[string]interface{}, bool)`

GetSpecOk returns a tuple with the Spec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpec

`func (o *EventTypeImportOpenApiIn) SetSpec(v map[string]map[string]interface{})`

SetSpec sets Spec field to given value.

### HasSpec

`func (o *EventTypeImportOpenApiIn) HasSpec() bool`

HasSpec returns a boolean if a field has been set.

### SetSpecNil

`func (o *EventTypeImportOpenApiIn) SetSpecNil(b bool)`

 SetSpecNil sets the value for Spec to be an explicit nil

### UnsetSpec
`func (o *EventTypeImportOpenApiIn) UnsetSpec()`

UnsetSpec ensures that no value is present for Spec, not even an explicit nil
### GetSpecRaw

`func (o *EventTypeImportOpenApiIn) GetSpecRaw() string`

GetSpecRaw returns the SpecRaw field if non-nil, zero value otherwise.

### GetSpecRawOk

`func (o *EventTypeImportOpenApiIn) GetSpecRawOk() (*string, bool)`

GetSpecRawOk returns a tuple with the SpecRaw field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecRaw

`func (o *EventTypeImportOpenApiIn) SetSpecRaw(v string)`

SetSpecRaw sets SpecRaw field to given value.

### HasSpecRaw

`func (o *EventTypeImportOpenApiIn) HasSpecRaw() bool`

HasSpecRaw returns a boolean if a field has been set.

### SetSpecRawNil

`func (o *EventTypeImportOpenApiIn) SetSpecRawNil(b bool)`

 SetSpecRawNil sets the value for SpecRaw to be an explicit nil

### UnsetSpecRaw
`func (o *EventTypeImportOpenApiIn) UnsetSpecRaw()`

UnsetSpecRaw ensures that no value is present for SpecRaw, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


