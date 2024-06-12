# MessageAttemptRecoveredEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**MessageAttemptRecoveredEventData**](MessageAttemptRecoveredEventData.md) |  | 
**Type** | **string** |  | [default to "message.attempt.recovered"]

## Methods

### NewMessageAttemptRecoveredEvent

`func NewMessageAttemptRecoveredEvent(data MessageAttemptRecoveredEventData, type_ string, ) *MessageAttemptRecoveredEvent`

NewMessageAttemptRecoveredEvent instantiates a new MessageAttemptRecoveredEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptRecoveredEventWithDefaults

`func NewMessageAttemptRecoveredEventWithDefaults() *MessageAttemptRecoveredEvent`

NewMessageAttemptRecoveredEventWithDefaults instantiates a new MessageAttemptRecoveredEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *MessageAttemptRecoveredEvent) GetData() MessageAttemptRecoveredEventData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *MessageAttemptRecoveredEvent) GetDataOk() (*MessageAttemptRecoveredEventData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *MessageAttemptRecoveredEvent) SetData(v MessageAttemptRecoveredEventData)`

SetData sets Data field to given value.


### GetType

`func (o *MessageAttemptRecoveredEvent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageAttemptRecoveredEvent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageAttemptRecoveredEvent) SetType(v string)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


