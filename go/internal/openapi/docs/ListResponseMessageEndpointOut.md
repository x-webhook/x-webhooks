# ListResponseMessageEndpointOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]MessageEndpointOut**](MessageEndpointOut.md) |  | 
**Done** | **bool** |  | 
**Iterator** | Pointer to **NullableString** |  | [optional] 
**PrevIterator** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewListResponseMessageEndpointOut

`func NewListResponseMessageEndpointOut(data []MessageEndpointOut, done bool, ) *ListResponseMessageEndpointOut`

NewListResponseMessageEndpointOut instantiates a new ListResponseMessageEndpointOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListResponseMessageEndpointOutWithDefaults

`func NewListResponseMessageEndpointOutWithDefaults() *ListResponseMessageEndpointOut`

NewListResponseMessageEndpointOutWithDefaults instantiates a new ListResponseMessageEndpointOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListResponseMessageEndpointOut) GetData() []MessageEndpointOut`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListResponseMessageEndpointOut) GetDataOk() (*[]MessageEndpointOut, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListResponseMessageEndpointOut) SetData(v []MessageEndpointOut)`

SetData sets Data field to given value.


### GetDone

`func (o *ListResponseMessageEndpointOut) GetDone() bool`

GetDone returns the Done field if non-nil, zero value otherwise.

### GetDoneOk

`func (o *ListResponseMessageEndpointOut) GetDoneOk() (*bool, bool)`

GetDoneOk returns a tuple with the Done field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDone

`func (o *ListResponseMessageEndpointOut) SetDone(v bool)`

SetDone sets Done field to given value.


### GetIterator

`func (o *ListResponseMessageEndpointOut) GetIterator() string`

GetIterator returns the Iterator field if non-nil, zero value otherwise.

### GetIteratorOk

`func (o *ListResponseMessageEndpointOut) GetIteratorOk() (*string, bool)`

GetIteratorOk returns a tuple with the Iterator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIterator

`func (o *ListResponseMessageEndpointOut) SetIterator(v string)`

SetIterator sets Iterator field to given value.

### HasIterator

`func (o *ListResponseMessageEndpointOut) HasIterator() bool`

HasIterator returns a boolean if a field has been set.

### SetIteratorNil

`func (o *ListResponseMessageEndpointOut) SetIteratorNil(b bool)`

 SetIteratorNil sets the value for Iterator to be an explicit nil

### UnsetIterator
`func (o *ListResponseMessageEndpointOut) UnsetIterator()`

UnsetIterator ensures that no value is present for Iterator, not even an explicit nil
### GetPrevIterator

`func (o *ListResponseMessageEndpointOut) GetPrevIterator() string`

GetPrevIterator returns the PrevIterator field if non-nil, zero value otherwise.

### GetPrevIteratorOk

`func (o *ListResponseMessageEndpointOut) GetPrevIteratorOk() (*string, bool)`

GetPrevIteratorOk returns a tuple with the PrevIterator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevIterator

`func (o *ListResponseMessageEndpointOut) SetPrevIterator(v string)`

SetPrevIterator sets PrevIterator field to given value.

### HasPrevIterator

`func (o *ListResponseMessageEndpointOut) HasPrevIterator() bool`

HasPrevIterator returns a boolean if a field has been set.

### SetPrevIteratorNil

`func (o *ListResponseMessageEndpointOut) SetPrevIteratorNil(b bool)`

 SetPrevIteratorNil sets the value for PrevIterator to be an explicit nil

### UnsetPrevIterator
`func (o *ListResponseMessageEndpointOut) UnsetPrevIterator()`

UnsetPrevIterator ensures that no value is present for PrevIterator, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


