# MessageAttemptHeadersOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResponseHeaders** | Pointer to **[][]string** |  | [optional] 
**Sensitive** | **[]string** |  | 
**SentHeaders** | **map[string]string** |  | 

## Methods

### NewMessageAttemptHeadersOut

`func NewMessageAttemptHeadersOut(sensitive []string, sentHeaders map[string]string, ) *MessageAttemptHeadersOut`

NewMessageAttemptHeadersOut instantiates a new MessageAttemptHeadersOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptHeadersOutWithDefaults

`func NewMessageAttemptHeadersOutWithDefaults() *MessageAttemptHeadersOut`

NewMessageAttemptHeadersOutWithDefaults instantiates a new MessageAttemptHeadersOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResponseHeaders

`func (o *MessageAttemptHeadersOut) GetResponseHeaders() [][]string`

GetResponseHeaders returns the ResponseHeaders field if non-nil, zero value otherwise.

### GetResponseHeadersOk

`func (o *MessageAttemptHeadersOut) GetResponseHeadersOk() (*[][]string, bool)`

GetResponseHeadersOk returns a tuple with the ResponseHeaders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseHeaders

`func (o *MessageAttemptHeadersOut) SetResponseHeaders(v [][]string)`

SetResponseHeaders sets ResponseHeaders field to given value.

### HasResponseHeaders

`func (o *MessageAttemptHeadersOut) HasResponseHeaders() bool`

HasResponseHeaders returns a boolean if a field has been set.

### SetResponseHeadersNil

`func (o *MessageAttemptHeadersOut) SetResponseHeadersNil(b bool)`

 SetResponseHeadersNil sets the value for ResponseHeaders to be an explicit nil

### UnsetResponseHeaders
`func (o *MessageAttemptHeadersOut) UnsetResponseHeaders()`

UnsetResponseHeaders ensures that no value is present for ResponseHeaders, not even an explicit nil
### GetSensitive

`func (o *MessageAttemptHeadersOut) GetSensitive() []string`

GetSensitive returns the Sensitive field if non-nil, zero value otherwise.

### GetSensitiveOk

`func (o *MessageAttemptHeadersOut) GetSensitiveOk() (*[]string, bool)`

GetSensitiveOk returns a tuple with the Sensitive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSensitive

`func (o *MessageAttemptHeadersOut) SetSensitive(v []string)`

SetSensitive sets Sensitive field to given value.


### GetSentHeaders

`func (o *MessageAttemptHeadersOut) GetSentHeaders() map[string]string`

GetSentHeaders returns the SentHeaders field if non-nil, zero value otherwise.

### GetSentHeadersOk

`func (o *MessageAttemptHeadersOut) GetSentHeadersOk() (*map[string]string, bool)`

GetSentHeadersOk returns a tuple with the SentHeaders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSentHeaders

`func (o *MessageAttemptHeadersOut) SetSentHeaders(v map[string]string)`

SetSentHeaders sets SentHeaders field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


