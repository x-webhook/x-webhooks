

# ClientSecretJwtParamsIn


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secretBase64** | **String** | The base64-encoded secret used for signing the JWT. | 
**secretId** | **String** | Optional secret identifier. If supplied, this will be populated in the JWT header in the &#x60;kid&#x60; field. |  [optional]
**signingAlgorithm** | **OauthJwsSigningAlgorithm** |  | 
**tokenExpirySecs** | **Integer** | Optional number of seconds after which the JWT should expire. Defaults to 300 seconds. |  [optional]



