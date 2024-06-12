# OAuthPayloadIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** |  | 
**RedirectUri** | **string** |  | 

## Methods

### NewOAuthPayloadIn

`func NewOAuthPayloadIn(code string, redirectUri string, ) *OAuthPayloadIn`

NewOAuthPayloadIn instantiates a new OAuthPayloadIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOAuthPayloadInWithDefaults

`func NewOAuthPayloadInWithDefaults() *OAuthPayloadIn`

NewOAuthPayloadInWithDefaults instantiates a new OAuthPayloadIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *OAuthPayloadIn) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *OAuthPayloadIn) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *OAuthPayloadIn) SetCode(v string)`

SetCode sets Code field to given value.


### GetRedirectUri

`func (o *OAuthPayloadIn) GetRedirectUri() string`

GetRedirectUri returns the RedirectUri field if non-nil, zero value otherwise.

### GetRedirectUriOk

`func (o *OAuthPayloadIn) GetRedirectUriOk() (*string, bool)`

GetRedirectUriOk returns a tuple with the RedirectUri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRedirectUri

`func (o *OAuthPayloadIn) SetRedirectUri(v string)`

SetRedirectUri sets RedirectUri field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


