# EndpointDeletedEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**EndpointDeletedEventData**](EndpointDeletedEventData.md) |  | 
**Type** | **string** |  | [default to "endpoint.deleted"]

## Methods

### NewEndpointDeletedEvent

`func NewEndpointDeletedEvent(data EndpointDeletedEventData, type_ string, ) *EndpointDeletedEvent`

NewEndpointDeletedEvent instantiates a new EndpointDeletedEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointDeletedEventWithDefaults

`func NewEndpointDeletedEventWithDefaults() *EndpointDeletedEvent`

NewEndpointDeletedEventWithDefaults instantiates a new EndpointDeletedEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *EndpointDeletedEvent) GetData() EndpointDeletedEventData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *EndpointDeletedEvent) GetDataOk() (*EndpointDeletedEventData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *EndpointDeletedEvent) SetData(v EndpointDeletedEventData)`

SetData sets Data field to given value.


### GetType

`func (o *EndpointDeletedEvent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *EndpointDeletedEvent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *EndpointDeletedEvent) SetType(v string)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


