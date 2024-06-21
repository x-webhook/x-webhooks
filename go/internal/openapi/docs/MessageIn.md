# MessageIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Application** | Pointer to [**ApplicationIn**](ApplicationIn.md) |  | [optional] 
**Channels** | Pointer to **[]string** | List of free-form identifiers that endpoints can filter by | [optional] 
**EventId** | Pointer to **NullableString** | Optional unique identifier for the message | [optional] 
**EventType** | **string** | The event type&#39;s name | 
**Payload** | **map[string]interface{}** |  | 
**PayloadRetentionPeriod** | Pointer to **int64** |  | [optional] [default to 90]
**Headers** | Pointer to **map[string]string** |  | [optional] 
**Tags** | Pointer to **[]string** | List of free-form tags that can be filtered by when listing messages | [optional] 
**TransformationsParams** | Pointer to **map[string]interface{}** | Extra parameters to pass to Transformations (for future use) | [optional] 

## Methods

### NewMessageIn

`func NewMessageIn(eventType string, payload map[string]interface{}, ) *MessageIn`

NewMessageIn instantiates a new MessageIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageInWithDefaults

`func NewMessageInWithDefaults() *MessageIn`

NewMessageInWithDefaults instantiates a new MessageIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApplication

`func (o *MessageIn) GetApplication() ApplicationIn`

GetApplication returns the Application field if non-nil, zero value otherwise.

### GetApplicationOk

`func (o *MessageIn) GetApplicationOk() (*ApplicationIn, bool)`

GetApplicationOk returns a tuple with the Application field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApplication

`func (o *MessageIn) SetApplication(v ApplicationIn)`

SetApplication sets Application field to given value.

### HasApplication

`func (o *MessageIn) HasApplication() bool`

HasApplication returns a boolean if a field has been set.

### GetChannels

`func (o *MessageIn) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *MessageIn) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *MessageIn) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *MessageIn) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *MessageIn) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *MessageIn) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetEventId

`func (o *MessageIn) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *MessageIn) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *MessageIn) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *MessageIn) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### SetEventIdNil

`func (o *MessageIn) SetEventIdNil(b bool)`

 SetEventIdNil sets the value for EventId to be an explicit nil

### UnsetEventId
`func (o *MessageIn) UnsetEventId()`

UnsetEventId ensures that no value is present for EventId, not even an explicit nil
### GetEventType

`func (o *MessageIn) GetEventType() string`

GetEventType returns the EventType field if non-nil, zero value otherwise.

### GetEventTypeOk

`func (o *MessageIn) GetEventTypeOk() (*string, bool)`

GetEventTypeOk returns a tuple with the EventType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventType

`func (o *MessageIn) SetEventType(v string)`

SetEventType sets EventType field to given value.


### GetPayload

`func (o *MessageIn) GetPayload() map[string]interface{}`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *MessageIn) GetPayloadOk() (*map[string]interface{}, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *MessageIn) SetPayload(v map[string]interface{})`

SetPayload sets Payload field to given value.


### GetPayloadRetentionPeriod

`func (o *MessageIn) GetPayloadRetentionPeriod() int64`

GetPayloadRetentionPeriod returns the PayloadRetentionPeriod field if non-nil, zero value otherwise.

### GetPayloadRetentionPeriodOk

`func (o *MessageIn) GetPayloadRetentionPeriodOk() (*int64, bool)`

GetPayloadRetentionPeriodOk returns a tuple with the PayloadRetentionPeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayloadRetentionPeriod

`func (o *MessageIn) SetPayloadRetentionPeriod(v int64)`

SetPayloadRetentionPeriod sets PayloadRetentionPeriod field to given value.

### HasPayloadRetentionPeriod

`func (o *MessageIn) HasPayloadRetentionPeriod() bool`

HasPayloadRetentionPeriod returns a boolean if a field has been set.

### GetHeaders

`func (o *MessageIn) GetHeaders() map[string]string`

GetHeaders returns the Headers field if non-nil, zero value otherwise.

### GetHeadersOk

`func (o *MessageIn) GetHeadersOk() (*map[string]string, bool)`

GetHeadersOk returns a tuple with the Headers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeaders

`func (o *MessageIn) SetHeaders(v map[string]string)`

SetHeaders sets Headers field to given value.

### HasHeaders

`func (o *MessageIn) HasHeaders() bool`

HasHeaders returns a boolean if a field has been set.

### GetTags

`func (o *MessageIn) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *MessageIn) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *MessageIn) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *MessageIn) HasTags() bool`

HasTags returns a boolean if a field has been set.

### SetTagsNil

`func (o *MessageIn) SetTagsNil(b bool)`

 SetTagsNil sets the value for Tags to be an explicit nil

### UnsetTags
`func (o *MessageIn) UnsetTags()`

UnsetTags ensures that no value is present for Tags, not even an explicit nil
### GetTransformationsParams

`func (o *MessageIn) GetTransformationsParams() map[string]interface{}`

GetTransformationsParams returns the TransformationsParams field if non-nil, zero value otherwise.

### GetTransformationsParamsOk

`func (o *MessageIn) GetTransformationsParamsOk() (*map[string]interface{}, bool)`

GetTransformationsParamsOk returns a tuple with the TransformationsParams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransformationsParams

`func (o *MessageIn) SetTransformationsParams(v map[string]interface{})`

SetTransformationsParams sets TransformationsParams field to given value.

### HasTransformationsParams

`func (o *MessageIn) HasTransformationsParams() bool`

HasTransformationsParams returns a boolean if a field has been set.

### SetTransformationsParamsNil

`func (o *MessageIn) SetTransformationsParamsNil(b bool)`

 SetTransformationsParamsNil sets the value for TransformationsParams to be an explicit nil

### UnsetTransformationsParams
`func (o *MessageIn) UnsetTransformationsParams()`

UnsetTransformationsParams ensures that no value is present for TransformationsParams, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


