# EndpointOauthConfigIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuthMethod** | [**Oauth2AuthMethodIn**](Oauth2AuthMethodIn.md) |  | 
**ClientId** | **string** | The client ID. Required for all authentication types. | 
**ClientSecret** | Pointer to **NullableString** | Optional client secret. This is only used for &#x60;clientSecretBasic&#x60; and &#x60;clientSecretPost&#x60;.  For &#x60;clientSecretBasic&#x60;, the secret will be appended to the &#x60;Authorization&#x60; header. For &#x60;clientSecretPost&#x60;, this will be added to the body in a &#x60;client_secret&#x60; parameter. | [optional] 
**ExtraParams** | Pointer to **map[string]string** | Extra parameters added to the request body as key-value pairs. | [optional] 
**GrantType** | [**Oauth2GrantTypeIn**](Oauth2GrantTypeIn.md) |  | 
**JwtParams** | Pointer to [**ClientSecretJwtParamsIn**](ClientSecretJwtParamsIn.md) |  | [optional] 
**RefreshToken** | Pointer to **NullableString** | For &#x60;refreshToken&#x60; grant type | [optional] 
**Scopes** | Pointer to **[]string** | Optional OAuth scopes added to the request body. | [optional] 
**TokenUrl** | **string** | The URL of the authorization server. | 

## Methods

### NewEndpointOauthConfigIn

`func NewEndpointOauthConfigIn(authMethod Oauth2AuthMethodIn, clientId string, grantType Oauth2GrantTypeIn, tokenUrl string, ) *EndpointOauthConfigIn`

NewEndpointOauthConfigIn instantiates a new EndpointOauthConfigIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointOauthConfigInWithDefaults

`func NewEndpointOauthConfigInWithDefaults() *EndpointOauthConfigIn`

NewEndpointOauthConfigInWithDefaults instantiates a new EndpointOauthConfigIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAuthMethod

`func (o *EndpointOauthConfigIn) GetAuthMethod() Oauth2AuthMethodIn`

GetAuthMethod returns the AuthMethod field if non-nil, zero value otherwise.

### GetAuthMethodOk

`func (o *EndpointOauthConfigIn) GetAuthMethodOk() (*Oauth2AuthMethodIn, bool)`

GetAuthMethodOk returns a tuple with the AuthMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthMethod

`func (o *EndpointOauthConfigIn) SetAuthMethod(v Oauth2AuthMethodIn)`

SetAuthMethod sets AuthMethod field to given value.


### GetClientId

`func (o *EndpointOauthConfigIn) GetClientId() string`

GetClientId returns the ClientId field if non-nil, zero value otherwise.

### GetClientIdOk

`func (o *EndpointOauthConfigIn) GetClientIdOk() (*string, bool)`

GetClientIdOk returns a tuple with the ClientId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientId

`func (o *EndpointOauthConfigIn) SetClientId(v string)`

SetClientId sets ClientId field to given value.


### GetClientSecret

`func (o *EndpointOauthConfigIn) GetClientSecret() string`

GetClientSecret returns the ClientSecret field if non-nil, zero value otherwise.

### GetClientSecretOk

`func (o *EndpointOauthConfigIn) GetClientSecretOk() (*string, bool)`

GetClientSecretOk returns a tuple with the ClientSecret field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientSecret

`func (o *EndpointOauthConfigIn) SetClientSecret(v string)`

SetClientSecret sets ClientSecret field to given value.

### HasClientSecret

`func (o *EndpointOauthConfigIn) HasClientSecret() bool`

HasClientSecret returns a boolean if a field has been set.

### SetClientSecretNil

`func (o *EndpointOauthConfigIn) SetClientSecretNil(b bool)`

 SetClientSecretNil sets the value for ClientSecret to be an explicit nil

### UnsetClientSecret
`func (o *EndpointOauthConfigIn) UnsetClientSecret()`

UnsetClientSecret ensures that no value is present for ClientSecret, not even an explicit nil
### GetExtraParams

`func (o *EndpointOauthConfigIn) GetExtraParams() map[string]string`

GetExtraParams returns the ExtraParams field if non-nil, zero value otherwise.

### GetExtraParamsOk

`func (o *EndpointOauthConfigIn) GetExtraParamsOk() (*map[string]string, bool)`

GetExtraParamsOk returns a tuple with the ExtraParams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtraParams

`func (o *EndpointOauthConfigIn) SetExtraParams(v map[string]string)`

SetExtraParams sets ExtraParams field to given value.

### HasExtraParams

`func (o *EndpointOauthConfigIn) HasExtraParams() bool`

HasExtraParams returns a boolean if a field has been set.

### SetExtraParamsNil

`func (o *EndpointOauthConfigIn) SetExtraParamsNil(b bool)`

 SetExtraParamsNil sets the value for ExtraParams to be an explicit nil

### UnsetExtraParams
`func (o *EndpointOauthConfigIn) UnsetExtraParams()`

UnsetExtraParams ensures that no value is present for ExtraParams, not even an explicit nil
### GetGrantType

`func (o *EndpointOauthConfigIn) GetGrantType() Oauth2GrantTypeIn`

GetGrantType returns the GrantType field if non-nil, zero value otherwise.

### GetGrantTypeOk

`func (o *EndpointOauthConfigIn) GetGrantTypeOk() (*Oauth2GrantTypeIn, bool)`

GetGrantTypeOk returns a tuple with the GrantType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrantType

`func (o *EndpointOauthConfigIn) SetGrantType(v Oauth2GrantTypeIn)`

SetGrantType sets GrantType field to given value.


### GetJwtParams

`func (o *EndpointOauthConfigIn) GetJwtParams() ClientSecretJwtParamsIn`

GetJwtParams returns the JwtParams field if non-nil, zero value otherwise.

### GetJwtParamsOk

`func (o *EndpointOauthConfigIn) GetJwtParamsOk() (*ClientSecretJwtParamsIn, bool)`

GetJwtParamsOk returns a tuple with the JwtParams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJwtParams

`func (o *EndpointOauthConfigIn) SetJwtParams(v ClientSecretJwtParamsIn)`

SetJwtParams sets JwtParams field to given value.

### HasJwtParams

`func (o *EndpointOauthConfigIn) HasJwtParams() bool`

HasJwtParams returns a boolean if a field has been set.

### GetRefreshToken

`func (o *EndpointOauthConfigIn) GetRefreshToken() string`

GetRefreshToken returns the RefreshToken field if non-nil, zero value otherwise.

### GetRefreshTokenOk

`func (o *EndpointOauthConfigIn) GetRefreshTokenOk() (*string, bool)`

GetRefreshTokenOk returns a tuple with the RefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshToken

`func (o *EndpointOauthConfigIn) SetRefreshToken(v string)`

SetRefreshToken sets RefreshToken field to given value.

### HasRefreshToken

`func (o *EndpointOauthConfigIn) HasRefreshToken() bool`

HasRefreshToken returns a boolean if a field has been set.

### SetRefreshTokenNil

`func (o *EndpointOauthConfigIn) SetRefreshTokenNil(b bool)`

 SetRefreshTokenNil sets the value for RefreshToken to be an explicit nil

### UnsetRefreshToken
`func (o *EndpointOauthConfigIn) UnsetRefreshToken()`

UnsetRefreshToken ensures that no value is present for RefreshToken, not even an explicit nil
### GetScopes

`func (o *EndpointOauthConfigIn) GetScopes() []string`

GetScopes returns the Scopes field if non-nil, zero value otherwise.

### GetScopesOk

`func (o *EndpointOauthConfigIn) GetScopesOk() (*[]string, bool)`

GetScopesOk returns a tuple with the Scopes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScopes

`func (o *EndpointOauthConfigIn) SetScopes(v []string)`

SetScopes sets Scopes field to given value.

### HasScopes

`func (o *EndpointOauthConfigIn) HasScopes() bool`

HasScopes returns a boolean if a field has been set.

### SetScopesNil

`func (o *EndpointOauthConfigIn) SetScopesNil(b bool)`

 SetScopesNil sets the value for Scopes to be an explicit nil

### UnsetScopes
`func (o *EndpointOauthConfigIn) UnsetScopes()`

UnsetScopes ensures that no value is present for Scopes, not even an explicit nil
### GetTokenUrl

`func (o *EndpointOauthConfigIn) GetTokenUrl() string`

GetTokenUrl returns the TokenUrl field if non-nil, zero value otherwise.

### GetTokenUrlOk

`func (o *EndpointOauthConfigIn) GetTokenUrlOk() (*string, bool)`

GetTokenUrlOk returns a tuple with the TokenUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenUrl

`func (o *EndpointOauthConfigIn) SetTokenUrl(v string)`

SetTokenUrl sets TokenUrl field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


