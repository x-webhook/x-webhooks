# EndpointTransformationSimulateIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channels** | Pointer to **[]string** |  | [optional] 
**Code** | **string** |  | 
**EventType** | **string** | The event type&#39;s name | 
**Payload** | **map[string]interface{}** |  | 

## Methods

### NewEndpointTransformationSimulateIn

`func NewEndpointTransformationSimulateIn(code string, eventType string, payload map[string]interface{}, ) *EndpointTransformationSimulateIn`

NewEndpointTransformationSimulateIn instantiates a new EndpointTransformationSimulateIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointTransformationSimulateInWithDefaults

`func NewEndpointTransformationSimulateInWithDefaults() *EndpointTransformationSimulateIn`

NewEndpointTransformationSimulateInWithDefaults instantiates a new EndpointTransformationSimulateIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannels

`func (o *EndpointTransformationSimulateIn) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *EndpointTransformationSimulateIn) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *EndpointTransformationSimulateIn) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *EndpointTransformationSimulateIn) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *EndpointTransformationSimulateIn) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *EndpointTransformationSimulateIn) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetCode

`func (o *EndpointTransformationSimulateIn) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *EndpointTransformationSimulateIn) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *EndpointTransformationSimulateIn) SetCode(v string)`

SetCode sets Code field to given value.


### GetEventType

`func (o *EndpointTransformationSimulateIn) GetEventType() string`

GetEventType returns the EventType field if non-nil, zero value otherwise.

### GetEventTypeOk

`func (o *EndpointTransformationSimulateIn) GetEventTypeOk() (*string, bool)`

GetEventTypeOk returns a tuple with the EventType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventType

`func (o *EndpointTransformationSimulateIn) SetEventType(v string)`

SetEventType sets EventType field to given value.


### GetPayload

`func (o *EndpointTransformationSimulateIn) GetPayload() map[string]interface{}`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *EndpointTransformationSimulateIn) GetPayloadOk() (*map[string]interface{}, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *EndpointTransformationSimulateIn) SetPayload(v map[string]interface{})`

SetPayload sets Payload field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


