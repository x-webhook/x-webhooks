

# EndpointOauthConfigIn


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authMethod** | **Oauth2AuthMethodIn** |  | 
**clientId** | **String** | The client ID. Required for all authentication types. | 
**clientSecret** | **String** | Optional client secret. This is only used for &#x60;clientSecretBasic&#x60; and &#x60;clientSecretPost&#x60;.  For &#x60;clientSecretBasic&#x60;, the secret will be appended to the &#x60;Authorization&#x60; header. For &#x60;clientSecretPost&#x60;, this will be added to the body in a &#x60;client_secret&#x60; parameter. |  [optional]
**extraParams** | **Map&lt;String, String&gt;** | Extra parameters added to the request body as key-value pairs. |  [optional]
**grantType** | **Oauth2GrantTypeIn** |  | 
**jwtParams** | [**ClientSecretJwtParamsIn**](ClientSecretJwtParamsIn.md) |  |  [optional]
**refreshToken** | **String** | For &#x60;refreshToken&#x60; grant type |  [optional]
**scopes** | **List&lt;String&gt;** | Optional OAuth scopes added to the request body. |  [optional]
**tokenUrl** | **URI** | The URL of the authorization server. | 



