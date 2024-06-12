# CompletionChoice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FinishReason** | **string** |  | 
**Index** | **int64** |  | 
**Message** | [**CompletionMessage**](CompletionMessage.md) |  | 

## Methods

### NewCompletionChoice

`func NewCompletionChoice(finishReason string, index int64, message CompletionMessage, ) *CompletionChoice`

NewCompletionChoice instantiates a new CompletionChoice object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCompletionChoiceWithDefaults

`func NewCompletionChoiceWithDefaults() *CompletionChoice`

NewCompletionChoiceWithDefaults instantiates a new CompletionChoice object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFinishReason

`func (o *CompletionChoice) GetFinishReason() string`

GetFinishReason returns the FinishReason field if non-nil, zero value otherwise.

### GetFinishReasonOk

`func (o *CompletionChoice) GetFinishReasonOk() (*string, bool)`

GetFinishReasonOk returns a tuple with the FinishReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinishReason

`func (o *CompletionChoice) SetFinishReason(v string)`

SetFinishReason sets FinishReason field to given value.


### GetIndex

`func (o *CompletionChoice) GetIndex() int64`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *CompletionChoice) GetIndexOk() (*int64, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *CompletionChoice) SetIndex(v int64)`

SetIndex sets Index field to given value.


### GetMessage

`func (o *CompletionChoice) GetMessage() CompletionMessage`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CompletionChoice) GetMessageOk() (*CompletionMessage, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CompletionChoice) SetMessage(v CompletionMessage)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


