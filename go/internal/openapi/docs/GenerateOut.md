# GenerateOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Choices** | [**[]CompletionChoice**](CompletionChoice.md) |  | 
**Created** | **int64** |  | 
**Id** | **string** |  | 
**Model** | **string** |  | 
**Object** | **string** |  | 

## Methods

### NewGenerateOut

`func NewGenerateOut(choices []CompletionChoice, created int64, id string, model string, object string, ) *GenerateOut`

NewGenerateOut instantiates a new GenerateOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateOutWithDefaults

`func NewGenerateOutWithDefaults() *GenerateOut`

NewGenerateOutWithDefaults instantiates a new GenerateOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChoices

`func (o *GenerateOut) GetChoices() []CompletionChoice`

GetChoices returns the Choices field if non-nil, zero value otherwise.

### GetChoicesOk

`func (o *GenerateOut) GetChoicesOk() (*[]CompletionChoice, bool)`

GetChoicesOk returns a tuple with the Choices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChoices

`func (o *GenerateOut) SetChoices(v []CompletionChoice)`

SetChoices sets Choices field to given value.


### GetCreated

`func (o *GenerateOut) GetCreated() int64`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *GenerateOut) GetCreatedOk() (*int64, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *GenerateOut) SetCreated(v int64)`

SetCreated sets Created field to given value.


### GetId

`func (o *GenerateOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GenerateOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GenerateOut) SetId(v string)`

SetId sets Id field to given value.


### GetModel

`func (o *GenerateOut) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *GenerateOut) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *GenerateOut) SetModel(v string)`

SetModel sets Model field to given value.


### GetObject

`func (o *GenerateOut) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *GenerateOut) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *GenerateOut) SetObject(v string)`

SetObject sets Object field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


