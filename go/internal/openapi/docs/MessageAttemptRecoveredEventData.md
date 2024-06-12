# MessageAttemptRecoveredEventData

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

### NewMessageAttemptRecoveredEventData

`func NewMessageAttemptRecoveredEventData(appId string, endpointId string, lastAttempt MessageAttemptFailedData, msgId string, ) *MessageAttemptRecoveredEventData`

NewMessageAttemptRecoveredEventData instantiates a new MessageAttemptRecoveredEventData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptRecoveredEventDataWithDefaults

`func NewMessageAttemptRecoveredEventDataWithDefaults() *MessageAttemptRecoveredEventData`

NewMessageAttemptRecoveredEventDataWithDefaults instantiates a new MessageAttemptRecoveredEventData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppId

`func (o *MessageAttemptRecoveredEventData) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *MessageAttemptRecoveredEventData) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *MessageAttemptRecoveredEventData) SetAppId(v string)`

SetAppId sets AppId field to given value.


### GetAppUid

`func (o *MessageAttemptRecoveredEventData) GetAppUid() string`

GetAppUid returns the AppUid field if non-nil, zero value otherwise.

### GetAppUidOk

`func (o *MessageAttemptRecoveredEventData) GetAppUidOk() (*string, bool)`

GetAppUidOk returns a tuple with the AppUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppUid

`func (o *MessageAttemptRecoveredEventData) SetAppUid(v string)`

SetAppUid sets AppUid field to given value.

### HasAppUid

`func (o *MessageAttemptRecoveredEventData) HasAppUid() bool`

HasAppUid returns a boolean if a field has been set.

### SetAppUidNil

`func (o *MessageAttemptRecoveredEventData) SetAppUidNil(b bool)`

 SetAppUidNil sets the value for AppUid to be an explicit nil

### UnsetAppUid
`func (o *MessageAttemptRecoveredEventData) UnsetAppUid()`

UnsetAppUid ensures that no value is present for AppUid, not even an explicit nil
### GetEndpointId

`func (o *MessageAttemptRecoveredEventData) GetEndpointId() string`

GetEndpointId returns the EndpointId field if non-nil, zero value otherwise.

### GetEndpointIdOk

`func (o *MessageAttemptRecoveredEventData) GetEndpointIdOk() (*string, bool)`

GetEndpointIdOk returns a tuple with the EndpointId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointId

`func (o *MessageAttemptRecoveredEventData) SetEndpointId(v string)`

SetEndpointId sets EndpointId field to given value.


### GetLastAttempt

`func (o *MessageAttemptRecoveredEventData) GetLastAttempt() MessageAttemptFailedData`

GetLastAttempt returns the LastAttempt field if non-nil, zero value otherwise.

### GetLastAttemptOk

`func (o *MessageAttemptRecoveredEventData) GetLastAttemptOk() (*MessageAttemptFailedData, bool)`

GetLastAttemptOk returns a tuple with the LastAttempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastAttempt

`func (o *MessageAttemptRecoveredEventData) SetLastAttempt(v MessageAttemptFailedData)`

SetLastAttempt sets LastAttempt field to given value.


### GetMsgEventId

`func (o *MessageAttemptRecoveredEventData) GetMsgEventId() string`

GetMsgEventId returns the MsgEventId field if non-nil, zero value otherwise.

### GetMsgEventIdOk

`func (o *MessageAttemptRecoveredEventData) GetMsgEventIdOk() (*string, bool)`

GetMsgEventIdOk returns a tuple with the MsgEventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsgEventId

`func (o *MessageAttemptRecoveredEventData) SetMsgEventId(v string)`

SetMsgEventId sets MsgEventId field to given value.

### HasMsgEventId

`func (o *MessageAttemptRecoveredEventData) HasMsgEventId() bool`

HasMsgEventId returns a boolean if a field has been set.

### SetMsgEventIdNil

`func (o *MessageAttemptRecoveredEventData) SetMsgEventIdNil(b bool)`

 SetMsgEventIdNil sets the value for MsgEventId to be an explicit nil

### UnsetMsgEventId
`func (o *MessageAttemptRecoveredEventData) UnsetMsgEventId()`

UnsetMsgEventId ensures that no value is present for MsgEventId, not even an explicit nil
### GetMsgId

`func (o *MessageAttemptRecoveredEventData) GetMsgId() string`

GetMsgId returns the MsgId field if non-nil, zero value otherwise.

### GetMsgIdOk

`func (o *MessageAttemptRecoveredEventData) GetMsgIdOk() (*string, bool)`

GetMsgIdOk returns a tuple with the MsgId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsgId

`func (o *MessageAttemptRecoveredEventData) SetMsgId(v string)`

SetMsgId sets MsgId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


