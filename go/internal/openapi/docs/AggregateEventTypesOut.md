# AggregateEventTypesOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Status** | [**BackgroundTaskStatus**](BackgroundTaskStatus.md) |  | 
**Task** | [**BackgroundTaskType**](BackgroundTaskType.md) |  | 

## Methods

### NewAggregateEventTypesOut

`func NewAggregateEventTypesOut(id string, status BackgroundTaskStatus, task BackgroundTaskType, ) *AggregateEventTypesOut`

NewAggregateEventTypesOut instantiates a new AggregateEventTypesOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAggregateEventTypesOutWithDefaults

`func NewAggregateEventTypesOutWithDefaults() *AggregateEventTypesOut`

NewAggregateEventTypesOutWithDefaults instantiates a new AggregateEventTypesOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AggregateEventTypesOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AggregateEventTypesOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AggregateEventTypesOut) SetId(v string)`

SetId sets Id field to given value.


### GetStatus

`func (o *AggregateEventTypesOut) GetStatus() BackgroundTaskStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AggregateEventTypesOut) GetStatusOk() (*BackgroundTaskStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AggregateEventTypesOut) SetStatus(v BackgroundTaskStatus)`

SetStatus sets Status field to given value.


### GetTask

`func (o *AggregateEventTypesOut) GetTask() BackgroundTaskType`

GetTask returns the Task field if non-nil, zero value otherwise.

### GetTaskOk

`func (o *AggregateEventTypesOut) GetTaskOk() (*BackgroundTaskType, bool)`

GetTaskOk returns a tuple with the Task field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTask

`func (o *AggregateEventTypesOut) SetTask(v BackgroundTaskType)`

SetTask sets Task field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


