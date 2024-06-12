# MessageBroadcastIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channels** | Pointer to **[]string** | List of free-form identifiers that endpoints can filter by | [optional] 
**EventId** | Pointer to **NullableString** | Optional unique identifier for the message | [optional] 
**EventType** | **string** | The event type&#39;s name | 
**Payload** | **map[string]interface{}** |  | 
**PayloadRetentionPeriod** | Pointer to **int64** |  | [optional] [default to 90]

## Methods

### NewMessageBroadcastIn

`func NewMessageBroadcastIn(eventType string, payload map[string]interface{}, ) *MessageBroadcastIn`

NewMessageBroadcastIn instantiates a new MessageBroadcastIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageBroadcastInWithDefaults

`func NewMessageBroadcastInWithDefaults() *MessageBroadcastIn`

NewMessageBroadcastInWithDefaults instantiates a new MessageBroadcastIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannels

`func (o *MessageBroadcastIn) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *MessageBroadcastIn) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *MessageBroadcastIn) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *MessageBroadcastIn) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *MessageBroadcastIn) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *MessageBroadcastIn) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetEventId

`func (o *MessageBroadcastIn) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *MessageBroadcastIn) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *MessageBroadcastIn) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *MessageBroadcastIn) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### SetEventIdNil

`func (o *MessageBroadcastIn) SetEventIdNil(b bool)`

 SetEventIdNil sets the value for EventId to be an explicit nil

### UnsetEventId
`func (o *MessageBroadcastIn) UnsetEventId()`

UnsetEventId ensures that no value is present for EventId, not even an explicit nil
### GetEventType

`func (o *MessageBroadcastIn) GetEventType() string`

GetEventType returns the EventType field if non-nil, zero value otherwise.

### GetEventTypeOk

`func (o *MessageBroadcastIn) GetEventTypeOk() (*string, bool)`

GetEventTypeOk returns a tuple with the EventType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventType

`func (o *MessageBroadcastIn) SetEventType(v string)`

SetEventType sets EventType field to given value.


### GetPayload

`func (o *MessageBroadcastIn) GetPayload() map[string]interface{}`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *MessageBroadcastIn) GetPayloadOk() (*map[string]interface{}, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *MessageBroadcastIn) SetPayload(v map[string]interface{})`

SetPayload sets Payload field to given value.


### GetPayloadRetentionPeriod

`func (o *MessageBroadcastIn) GetPayloadRetentionPeriod() int64`

GetPayloadRetentionPeriod returns the PayloadRetentionPeriod field if non-nil, zero value otherwise.

### GetPayloadRetentionPeriodOk

`func (o *MessageBroadcastIn) GetPayloadRetentionPeriodOk() (*int64, bool)`

GetPayloadRetentionPeriodOk returns a tuple with the PayloadRetentionPeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayloadRetentionPeriod

`func (o *MessageBroadcastIn) SetPayloadRetentionPeriod(v int64)`

SetPayloadRetentionPeriod sets PayloadRetentionPeriod field to given value.

### HasPayloadRetentionPeriod

`func (o *MessageBroadcastIn) HasPayloadRetentionPeriod() bool`

HasPayloadRetentionPeriod returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


