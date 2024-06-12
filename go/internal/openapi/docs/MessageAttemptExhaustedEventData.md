# MessageAttemptExhaustedEventData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | **string** | The app&#39;s ID | 
**AppUid** | Pointer to **NullableString** | The app&#39;s UID | [optional] 
**EndpointId** | **string** | The ep&#39;s ID | 
**LastAttempt** | [**MessageAttemptFailedData**](MessageAttemptFailedData.md) |  | 
**MsgEventId** | Pointer to **NullableString** | The msg&#39;s UID | [optional] 
**MsgId** | **string** | The msg&#39;s ID | 

## Methods

### NewMessageAttemptExhaustedEventData

`func NewMessageAttemptExhaustedEventData(appId string, endpointId string, lastAttempt MessageAttemptFailedData, msgId string, ) *MessageAttemptExhaustedEventData`

NewMessageAttemptExhaustedEventData instantiates a new MessageAttemptExhaustedEventData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptExhaustedEventDataWithDefaults

`func NewMessageAttemptExhaustedEventDataWithDefaults() *MessageAttemptExhaustedEventData`

NewMessageAttemptExhaustedEventDataWithDefaults instantiates a new MessageAttemptExhaustedEventData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppId

`func (o *MessageAttemptExhaustedEventData) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *MessageAttemptExhaustedEventData) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *MessageAttemptExhaustedEventData) SetAppId(v string)`

SetAppId sets AppId field to given value.


### GetAppUid

`func (o *MessageAttemptExhaustedEventData) GetAppUid() string`

GetAppUid returns the AppUid field if non-nil, zero value otherwise.

### GetAppUidOk

`func (o *MessageAttemptExhaustedEventData) GetAppUidOk() (*string, bool)`

GetAppUidOk returns a tuple with the AppUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppUid

`func (o *MessageAttemptExhaustedEventData) SetAppUid(v string)`

SetAppUid sets AppUid field to given value.

### HasAppUid

`func (o *MessageAttemptExhaustedEventData) HasAppUid() bool`

HasAppUid returns a boolean if a field has been set.

### SetAppUidNil

`func (o *MessageAttemptExhaustedEventData) SetAppUidNil(b bool)`

 SetAppUidNil sets the value for AppUid to be an explicit nil

### UnsetAppUid
`func (o *MessageAttemptExhaustedEventData) UnsetAppUid()`

UnsetAppUid ensures that no value is present for AppUid, not even an explicit nil
### GetEndpointId

`func (o *MessageAttemptExhaustedEventData) GetEndpointId() string`

GetEndpointId returns the EndpointId field if non-nil, zero value otherwise.

### GetEndpointIdOk

`func (o *MessageAttemptExhaustedEventData) GetEndpointIdOk() (*string, bool)`

GetEndpointIdOk returns a tuple with the EndpointId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointId

`func (o *MessageAttemptExhaustedEventData) SetEndpointId(v string)`

SetEndpointId sets EndpointId field to given value.


### GetLastAttempt

`func (o *MessageAttemptExhaustedEventData) GetLastAttempt() MessageAttemptFailedData`

GetLastAttempt returns the LastAttempt field if non-nil, zero value otherwise.

### GetLastAttemptOk

`func (o *MessageAttemptExhaustedEventData) GetLastAttemptOk() (*MessageAttemptFailedData, bool)`

GetLastAttemptOk returns a tuple with the LastAttempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastAttempt

`func (o *MessageAttemptExhaustedEventData) SetLastAttempt(v MessageAttemptFailedData)`

SetLastAttempt sets LastAttempt field to given value.


### GetMsgEventId

`func (o *MessageAttemptExhaustedEventData) GetMsgEventId() string`

GetMsgEventId returns the MsgEventId field if non-nil, zero value otherwise.

### GetMsgEventIdOk

`func (o *MessageAttemptExhaustedEventData) GetMsgEventIdOk() (*string, bool)`

GetMsgEventIdOk returns a tuple with the MsgEventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsgEventId

`func (o *MessageAttemptExhaustedEventData) SetMsgEventId(v string)`

SetMsgEventId sets MsgEventId field to given value.

### HasMsgEventId

`func (o *MessageAttemptExhaustedEventData) HasMsgEventId() bool`

HasMsgEventId returns a boolean if a field has been set.

### SetMsgEventIdNil

`func (o *MessageAttemptExhaustedEventData) SetMsgEventIdNil(b bool)`

 SetMsgEventIdNil sets the value for MsgEventId to be an explicit nil

### UnsetMsgEventId
`func (o *MessageAttemptExhaustedEventData) UnsetMsgEventId()`

UnsetMsgEventId ensures that no value is present for MsgEventId, not even an explicit nil
### GetMsgId

`func (o *MessageAttemptExhaustedEventData) GetMsgId() string`

GetMsgId returns the MsgId field if non-nil, zero value otherwise.

### GetMsgIdOk

`func (o *MessageAttemptExhaustedEventData) GetMsgIdOk() (*string, bool)`

GetMsgIdOk returns a tuple with the MsgId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsgId

`func (o *MessageAttemptExhaustedEventData) SetMsgId(v string)`

SetMsgId sets MsgId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


