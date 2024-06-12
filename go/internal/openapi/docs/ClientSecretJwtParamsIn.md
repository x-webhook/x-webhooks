# ClientSecretJwtParamsIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SecretBase64** | **string** | The base64-encoded secret used for signing the JWT. | 
**SecretId** | Pointer to **NullableString** | Optional secret identifier. If supplied, this will be populated in the JWT header in the &#x60;kid&#x60; field. | [optional] 
**SigningAlgorithm** | [**OauthJwsSigningAlgorithm**](OauthJwsSigningAlgorithm.md) |  | 
**TokenExpirySecs** | Pointer to **NullableInt32** | Optional number of seconds after which the JWT should expire. Defaults to 300 seconds. | [optional] 

## Methods

### NewClientSecretJwtParamsIn

`func NewClientSecretJwtParamsIn(secretBase64 string, signingAlgorithm OauthJwsSigningAlgorithm, ) *ClientSecretJwtParamsIn`

NewClientSecretJwtParamsIn instantiates a new ClientSecretJwtParamsIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClientSecretJwtParamsInWithDefaults

`func NewClientSecretJwtParamsInWithDefaults() *ClientSecretJwtParamsIn`

NewClientSecretJwtParamsInWithDefaults instantiates a new ClientSecretJwtParamsIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSecretBase64

`func (o *ClientSecretJwtParamsIn) GetSecretBase64() string`

GetSecretBase64 returns the SecretBase64 field if non-nil, zero value otherwise.

### GetSecretBase64Ok

`func (o *ClientSecretJwtParamsIn) GetSecretBase64Ok() (*string, bool)`

GetSecretBase64Ok returns a tuple with the SecretBase64 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecretBase64

`func (o *ClientSecretJwtParamsIn) SetSecretBase64(v string)`

SetSecretBase64 sets SecretBase64 field to given value.


### GetSecretId

`func (o *ClientSecretJwtParamsIn) GetSecretId() string`

GetSecretId returns the SecretId field if non-nil, zero value otherwise.

### GetSecretIdOk

`func (o *ClientSecretJwtParamsIn) GetSecretIdOk() (*string, bool)`

GetSecretIdOk returns a tuple with the SecretId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecretId

`func (o *ClientSecretJwtParamsIn) SetSecretId(v string)`

SetSecretId sets SecretId field to given value.

### HasSecretId

`func (o *ClientSecretJwtParamsIn) HasSecretId() bool`

HasSecretId returns a boolean if a field has been set.

### SetSecretIdNil

`func (o *ClientSecretJwtParamsIn) SetSecretIdNil(b bool)`

 SetSecretIdNil sets the value for SecretId to be an explicit nil

### UnsetSecretId
`func (o *ClientSecretJwtParamsIn) UnsetSecretId()`

UnsetSecretId ensures that no value is present for SecretId, not even an explicit nil
### GetSigningAlgorithm

`func (o *ClientSecretJwtParamsIn) GetSigningAlgorithm() OauthJwsSigningAlgorithm`

GetSigningAlgorithm returns the SigningAlgorithm field if non-nil, zero value otherwise.

### GetSigningAlgorithmOk

`func (o *ClientSecretJwtParamsIn) GetSigningAlgorithmOk() (*OauthJwsSigningAlgorithm, bool)`

GetSigningAlgorithmOk returns a tuple with the SigningAlgorithm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSigningAlgorithm

`func (o *ClientSecretJwtParamsIn) SetSigningAlgorithm(v OauthJwsSigningAlgorithm)`

SetSigningAlgorithm sets SigningAlgorithm field to given value.


### GetTokenExpirySecs

`func (o *ClientSecretJwtParamsIn) GetTokenExpirySecs() int32`

GetTokenExpirySecs returns the TokenExpirySecs field if non-nil, zero value otherwise.

### GetTokenExpirySecsOk

`func (o *ClientSecretJwtParamsIn) GetTokenExpirySecsOk() (*int32, bool)`

GetTokenExpirySecsOk returns a tuple with the TokenExpirySecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenExpirySecs

`func (o *ClientSecretJwtParamsIn) SetTokenExpirySecs(v int32)`

SetTokenExpirySecs sets TokenExpirySecs field to given value.

### HasTokenExpirySecs

`func (o *ClientSecretJwtParamsIn) HasTokenExpirySecs() bool`

HasTokenExpirySecs returns a boolean if a field has been set.

### SetTokenExpirySecsNil

`func (o *ClientSecretJwtParamsIn) SetTokenExpirySecsNil(b bool)`

 SetTokenExpirySecsNil sets the value for TokenExpirySecs to be an explicit nil

### UnsetTokenExpirySecs
`func (o *ClientSecretJwtParamsIn) UnsetTokenExpirySecs()`

UnsetTokenExpirySecs ensures that no value is present for TokenExpirySecs, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


