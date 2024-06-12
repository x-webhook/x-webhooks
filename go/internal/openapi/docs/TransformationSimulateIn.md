# TransformationSimulateIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channels** | Pointer to **[]string** |  | [optional] 
**Code** | **string** |  | 
**EventType** | **string** | The event type&#39;s name | 
**Payload** | **map[string]interface{}** |  | 

## Methods

### NewTransformationSimulateIn

`func NewTransformationSimulateIn(code string, eventType string, payload map[string]interface{}, ) *TransformationSimulateIn`

NewTransformationSimulateIn instantiates a new TransformationSimulateIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTransformationSimulateInWithDefaults

`func NewTransformationSimulateInWithDefaults() *TransformationSimulateIn`

NewTransformationSimulateInWithDefaults instantiates a new TransformationSimulateIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannels

`func (o *TransformationSimulateIn) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *TransformationSimulateIn) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *TransformationSimulateIn) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *TransformationSimulateIn) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *TransformationSimulateIn) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *TransformationSimulateIn) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetCode

`func (o *TransformationSimulateIn) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *TransformationSimulateIn) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *TransformationSimulateIn) SetCode(v string)`

SetCode sets Code field to given value.


### GetEventType

`func (o *TransformationSimulateIn) GetEventType() string`

GetEventType returns the EventType field if non-nil, zero value otherwise.

### GetEventTypeOk

`func (o *TransformationSimulateIn) GetEventTypeOk() (*string, bool)`

GetEventTypeOk returns a tuple with the EventType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventType

`func (o *TransformationSimulateIn) SetEventType(v string)`

SetEventType sets EventType field to given value.


### GetPayload

`func (o *TransformationSimulateIn) GetPayload() map[string]interface{}`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *TransformationSimulateIn) GetPayloadOk() (*map[string]interface{}, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *TransformationSimulateIn) SetPayload(v map[string]interface{})`

SetPayload sets Payload field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


