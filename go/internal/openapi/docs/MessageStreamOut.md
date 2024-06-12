# MessageStreamOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]MessageOut**](MessageOut.md) |  | 
**Done** | **bool** |  | 
**Iterator** | **string** |  | 

## Methods

### NewMessageStreamOut

`func NewMessageStreamOut(data []MessageOut, done bool, iterator string, ) *MessageStreamOut`

NewMessageStreamOut instantiates a new MessageStreamOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageStreamOutWithDefaults

`func NewMessageStreamOutWithDefaults() *MessageStreamOut`

NewMessageStreamOutWithDefaults instantiates a new MessageStreamOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *MessageStreamOut) GetData() []MessageOut`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *MessageStreamOut) GetDataOk() (*[]MessageOut, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *MessageStreamOut) SetData(v []MessageOut)`

SetData sets Data field to given value.


### GetDone

`func (o *MessageStreamOut) GetDone() bool`

GetDone returns the Done field if non-nil, zero value otherwise.

### GetDoneOk

`func (o *MessageStreamOut) GetDoneOk() (*bool, bool)`

GetDoneOk returns a tuple with the Done field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDone

`func (o *MessageStreamOut) SetDone(v bool)`

SetDone sets Done field to given value.


### GetIterator

`func (o *MessageStreamOut) GetIterator() string`

GetIterator returns the Iterator field if non-nil, zero value otherwise.

### GetIteratorOk

`func (o *MessageStreamOut) GetIteratorOk() (*string, bool)`

GetIteratorOk returns a tuple with the Iterator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIterator

`func (o *MessageStreamOut) SetIterator(v string)`

SetIterator sets Iterator field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


