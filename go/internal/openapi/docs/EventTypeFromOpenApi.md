# EventTypeFromOpenApi

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **string** |  | 
**Name** | **string** | The event type&#39;s name | 
**Schemas** | Pointer to **map[string]map[string]interface{}** |  | [optional] 

## Methods

### NewEventTypeFromOpenApi

`func NewEventTypeFromOpenApi(description string, name string, ) *EventTypeFromOpenApi`

NewEventTypeFromOpenApi instantiates a new EventTypeFromOpenApi object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEventTypeFromOpenApiWithDefaults

`func NewEventTypeFromOpenApiWithDefaults() *EventTypeFromOpenApi`

NewEventTypeFromOpenApiWithDefaults instantiates a new EventTypeFromOpenApi object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *EventTypeFromOpenApi) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *EventTypeFromOpenApi) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *EventTypeFromOpenApi) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetName

`func (o *EventTypeFromOpenApi) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EventTypeFromOpenApi) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EventTypeFromOpenApi) SetName(v string)`

SetName sets Name field to given value.


### GetSchemas

`func (o *EventTypeFromOpenApi) GetSchemas() map[string]map[string]interface{}`

GetSchemas returns the Schemas field if non-nil, zero value otherwise.

### GetSchemasOk

`func (o *EventTypeFromOpenApi) GetSchemasOk() (*map[string]map[string]interface{}, bool)`

GetSchemasOk returns a tuple with the Schemas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchemas

`func (o *EventTypeFromOpenApi) SetSchemas(v map[string]map[string]interface{})`

SetSchemas sets Schemas field to given value.

### HasSchemas

`func (o *EventTypeFromOpenApi) HasSchemas() bool`

HasSchemas returns a boolean if a field has been set.

### SetSchemasNil

`func (o *EventTypeFromOpenApi) SetSchemasNil(b bool)`

 SetSchemasNil sets the value for Schemas to be an explicit nil

### UnsetSchemas
`func (o *EventTypeFromOpenApi) UnsetSchemas()`

UnsetSchemas ensures that no value is present for Schemas, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


