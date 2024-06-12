# MessageAttemptEndpointOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndpointId** | **string** | The ep&#39;s ID | 
**Id** | **string** | The attempt&#39;s ID | 
**Msg** | Pointer to [**MessageOut**](MessageOut.md) |  | [optional] 
**MsgId** | **string** | The msg&#39;s ID | 
**Response** | **string** |  | 
**ResponseStatusCode** | **int32** |  | 
**Status** | [**MessageStatus**](MessageStatus.md) |  | 
**Timestamp** | **time.Time** |  | 
**TriggerType** | [**MessageAttemptTriggerType**](MessageAttemptTriggerType.md) |  | 
**Url** | **string** |  | 

## Methods

### NewMessageAttemptEndpointOut

`func NewMessageAttemptEndpointOut(endpointId string, id string, msgId string, response string, responseStatusCode int32, status MessageStatus, timestamp time.Time, triggerType MessageAttemptTriggerType, url string, ) *MessageAttemptEndpointOut`

NewMessageAttemptEndpointOut instantiates a new MessageAttemptEndpointOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptEndpointOutWithDefaults

`func NewMessageAttemptEndpointOutWithDefaults() *MessageAttemptEndpointOut`

NewMessageAttemptEndpointOutWithDefaults instantiates a new MessageAttemptEndpointOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEndpointId

`func (o *MessageAttemptEndpointOut) GetEndpointId() string`

GetEndpointId returns the EndpointId field if non-nil, zero value otherwise.

### GetEndpointIdOk

`func (o *MessageAttemptEndpointOut) GetEndpointIdOk() (*string, bool)`

GetEndpointIdOk returns a tuple with the EndpointId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointId

`func (o *MessageAttemptEndpointOut) SetEndpointId(v string)`

SetEndpointId sets EndpointId field to given value.


### GetId

`func (o *MessageAttemptEndpointOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageAttemptEndpointOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageAttemptEndpointOut) SetId(v string)`

SetId sets Id field to given value.


### GetMsg

`func (o *MessageAttemptEndpointOut) GetMsg() MessageOut`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *MessageAttemptEndpointOut) GetMsgOk() (*MessageOut, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *MessageAttemptEndpointOut) SetMsg(v MessageOut)`

SetMsg sets Msg field to given value.

### HasMsg

`func (o *MessageAttemptEndpointOut) HasMsg() bool`

HasMsg returns a boolean if a field has been set.

### GetMsgId

`func (o *MessageAttemptEndpointOut) GetMsgId() string`

GetMsgId returns the MsgId field if non-nil, zero value otherwise.

### GetMsgIdOk

`func (o *MessageAttemptEndpointOut) GetMsgIdOk() (*string, bool)`

GetMsgIdOk returns a tuple with the MsgId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsgId

`func (o *MessageAttemptEndpointOut) SetMsgId(v string)`

SetMsgId sets MsgId field to given value.


### GetResponse

`func (o *MessageAttemptEndpointOut) GetResponse() string`

GetResponse returns the Response field if non-nil, zero value otherwise.

### GetResponseOk

`func (o *MessageAttemptEndpointOut) GetResponseOk() (*string, bool)`

GetResponseOk returns a tuple with the Response field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponse

`func (o *MessageAttemptEndpointOut) SetResponse(v string)`

SetResponse sets Response field to given value.


### GetResponseStatusCode

`func (o *MessageAttemptEndpointOut) GetResponseStatusCode() int32`

GetResponseStatusCode returns the ResponseStatusCode field if non-nil, zero value otherwise.

### GetResponseStatusCodeOk

`func (o *MessageAttemptEndpointOut) GetResponseStatusCodeOk() (*int32, bool)`

GetResponseStatusCodeOk returns a tuple with the ResponseStatusCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseStatusCode

`func (o *MessageAttemptEndpointOut) SetResponseStatusCode(v int32)`

SetResponseStatusCode sets ResponseStatusCode field to given value.


### GetStatus

`func (o *MessageAttemptEndpointOut) GetStatus() MessageStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *MessageAttemptEndpointOut) GetStatusOk() (*MessageStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *MessageAttemptEndpointOut) SetStatus(v MessageStatus)`

SetStatus sets Status field to given value.


### GetTimestamp

`func (o *MessageAttemptEndpointOut) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *MessageAttemptEndpointOut) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *MessageAttemptEndpointOut) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.


### GetTriggerType

`func (o *MessageAttemptEndpointOut) GetTriggerType() MessageAttemptTriggerType`

GetTriggerType returns the TriggerType field if non-nil, zero value otherwise.

### GetTriggerTypeOk

`func (o *MessageAttemptEndpointOut) GetTriggerTypeOk() (*MessageAttemptTriggerType, bool)`

GetTriggerTypeOk returns a tuple with the TriggerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTriggerType

`func (o *MessageAttemptEndpointOut) SetTriggerType(v MessageAttemptTriggerType)`

SetTriggerType sets TriggerType field to given value.


### GetUrl

`func (o *MessageAttemptEndpointOut) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *MessageAttemptEndpointOut) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *MessageAttemptEndpointOut) SetUrl(v string)`

SetUrl sets Url field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


