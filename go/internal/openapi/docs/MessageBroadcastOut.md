# MessageBroadcastOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Status** | [**BackgroundTaskStatus**](BackgroundTaskStatus.md) |  | 
**Task** | [**BackgroundTaskType**](BackgroundTaskType.md) |  | 

## Methods

### NewMessageBroadcastOut

`func NewMessageBroadcastOut(id string, status BackgroundTaskStatus, task BackgroundTaskType, ) *MessageBroadcastOut`

NewMessageBroadcastOut instantiates a new MessageBroadcastOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageBroadcastOutWithDefaults

`func NewMessageBroadcastOutWithDefaults() *MessageBroadcastOut`

NewMessageBroadcastOutWithDefaults instantiates a new MessageBroadcastOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MessageBroadcastOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageBroadcastOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageBroadcastOut) SetId(v string)`

SetId sets Id field to given value.


### GetStatus

`func (o *MessageBroadcastOut) GetStatus() BackgroundTaskStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *MessageBroadcastOut) GetStatusOk() (*BackgroundTaskStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *MessageBroadcastOut) SetStatus(v BackgroundTaskStatus)`

SetStatus sets Status field to given value.


### GetTask

`func (o *MessageBroadcastOut) GetTask() BackgroundTaskType`

GetTask returns the Task field if non-nil, zero value otherwise.

### GetTaskOk

`func (o *MessageBroadcastOut) GetTaskOk() (*BackgroundTaskType, bool)`

GetTaskOk returns a tuple with the Task field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTask

`func (o *MessageBroadcastOut) SetTask(v BackgroundTaskType)`

SetTask sets Task field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


