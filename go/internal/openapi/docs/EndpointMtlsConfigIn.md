# EndpointMtlsConfigIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CaCert** | **string** | A PEM encoded X509 certificate used to verify the webhook receiver&#39;s certificate. | 
**Identity** | **string** | A PEM encoded private key and X509 certificate to identify the webhook sender. | 

## Methods

### NewEndpointMtlsConfigIn

`func NewEndpointMtlsConfigIn(caCert string, identity string, ) *EndpointMtlsConfigIn`

NewEndpointMtlsConfigIn instantiates a new EndpointMtlsConfigIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointMtlsConfigInWithDefaults

`func NewEndpointMtlsConfigInWithDefaults() *EndpointMtlsConfigIn`

NewEndpointMtlsConfigInWithDefaults instantiates a new EndpointMtlsConfigIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCaCert

`func (o *EndpointMtlsConfigIn) GetCaCert() string`

GetCaCert returns the CaCert field if non-nil, zero value otherwise.

### GetCaCertOk

`func (o *EndpointMtlsConfigIn) GetCaCertOk() (*string, bool)`

GetCaCertOk returns a tuple with the CaCert field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaCert

`func (o *EndpointMtlsConfigIn) SetCaCert(v string)`

SetCaCert sets CaCert field to given value.


### GetIdentity

`func (o *EndpointMtlsConfigIn) GetIdentity() string`

GetIdentity returns the Identity field if non-nil, zero value otherwise.

### GetIdentityOk

`func (o *EndpointMtlsConfigIn) GetIdentityOk() (*string, bool)`

GetIdentityOk returns a tuple with the Identity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentity

`func (o *EndpointMtlsConfigIn) SetIdentity(v string)`

SetIdentity sets Identity field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


