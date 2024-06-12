# EndpointStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fail** | **int64** |  | 
**Pending** | **int64** |  | 
**Sending** | **int64** |  | 
**Success** | **int64** |  | 

## Methods

### NewEndpointStats

`func NewEndpointStats(fail int64, pending int64, sending int64, success int64, ) *EndpointStats`

NewEndpointStats instantiates a new EndpointStats object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointStatsWithDefaults

`func NewEndpointStatsWithDefaults() *EndpointStats`

NewEndpointStatsWithDefaults instantiates a new EndpointStats object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFail

`func (o *EndpointStats) GetFail() int64`

GetFail returns the Fail field if non-nil, zero value otherwise.

### GetFailOk

`func (o *EndpointStats) GetFailOk() (*int64, bool)`

GetFailOk returns a tuple with the Fail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFail

`func (o *EndpointStats) SetFail(v int64)`

SetFail sets Fail field to given value.


### GetPending

`func (o *EndpointStats) GetPending() int64`

GetPending returns the Pending field if non-nil, zero value otherwise.

### GetPendingOk

`func (o *EndpointStats) GetPendingOk() (*int64, bool)`

GetPendingOk returns a tuple with the Pending field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPending

`func (o *EndpointStats) SetPending(v int64)`

SetPending sets Pending field to given value.


### GetSending

`func (o *EndpointStats) GetSending() int64`

GetSending returns the Sending field if non-nil, zero value otherwise.

### GetSendingOk

`func (o *EndpointStats) GetSendingOk() (*int64, bool)`

GetSendingOk returns a tuple with the Sending field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSending

`func (o *EndpointStats) SetSending(v int64)`

SetSending sets Sending field to given value.


### GetSuccess

`func (o *EndpointStats) GetSuccess() int64`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *EndpointStats) GetSuccessOk() (*int64, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *EndpointStats) SetSuccess(v int64)`

SetSuccess sets Success field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


