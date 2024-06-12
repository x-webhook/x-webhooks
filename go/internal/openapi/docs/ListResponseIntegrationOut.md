# ListResponseIntegrationOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]IntegrationOut**](IntegrationOut.md) |  | 
**Done** | **bool** |  | 
**Iterator** | Pointer to **NullableString** |  | [optional] 
**PrevIterator** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewListResponseIntegrationOut

`func NewListResponseIntegrationOut(data []IntegrationOut, done bool, ) *ListResponseIntegrationOut`

NewListResponseIntegrationOut instantiates a new ListResponseIntegrationOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListResponseIntegrationOutWithDefaults

`func NewListResponseIntegrationOutWithDefaults() *ListResponseIntegrationOut`

NewListResponseIntegrationOutWithDefaults instantiates a new ListResponseIntegrationOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListResponseIntegrationOut) GetData() []IntegrationOut`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListResponseIntegrationOut) GetDataOk() (*[]IntegrationOut, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListResponseIntegrationOut) SetData(v []IntegrationOut)`

SetData sets Data field to given value.


### GetDone

`func (o *ListResponseIntegrationOut) GetDone() bool`

GetDone returns the Done field if non-nil, zero value otherwise.

### GetDoneOk

`func (o *ListResponseIntegrationOut) GetDoneOk() (*bool, bool)`

GetDoneOk returns a tuple with the Done field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDone

`func (o *ListResponseIntegrationOut) SetDone(v bool)`

SetDone sets Done field to given value.


### GetIterator

`func (o *ListResponseIntegrationOut) GetIterator() string`

GetIterator returns the Iterator field if non-nil, zero value otherwise.

### GetIteratorOk

`func (o *ListResponseIntegrationOut) GetIteratorOk() (*string, bool)`

GetIteratorOk returns a tuple with the Iterator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIterator

`func (o *ListResponseIntegrationOut) SetIterator(v string)`

SetIterator sets Iterator field to given value.

### HasIterator

`func (o *ListResponseIntegrationOut) HasIterator() bool`

HasIterator returns a boolean if a field has been set.

### SetIteratorNil

`func (o *ListResponseIntegrationOut) SetIteratorNil(b bool)`

 SetIteratorNil sets the value for Iterator to be an explicit nil

### UnsetIterator
`func (o *ListResponseIntegrationOut) UnsetIterator()`

UnsetIterator ensures that no value is present for Iterator, not even an explicit nil
### GetPrevIterator

`func (o *ListResponseIntegrationOut) GetPrevIterator() string`

GetPrevIterator returns the PrevIterator field if non-nil, zero value otherwise.

### GetPrevIteratorOk

`func (o *ListResponseIntegrationOut) GetPrevIteratorOk() (*string, bool)`

GetPrevIteratorOk returns a tuple with the PrevIterator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevIterator

`func (o *ListResponseIntegrationOut) SetPrevIterator(v string)`

SetPrevIterator sets PrevIterator field to given value.

### HasPrevIterator

`func (o *ListResponseIntegrationOut) HasPrevIterator() bool`

HasPrevIterator returns a boolean if a field has been set.

### SetPrevIteratorNil

`func (o *ListResponseIntegrationOut) SetPrevIteratorNil(b bool)`

 SetPrevIteratorNil sets the value for PrevIterator to be an explicit nil

### UnsetPrevIterator
`func (o *ListResponseIntegrationOut) UnsetPrevIterator()`

UnsetPrevIterator ensures that no value is present for PrevIterator, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


