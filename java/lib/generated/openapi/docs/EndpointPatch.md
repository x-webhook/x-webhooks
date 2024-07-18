

# EndpointPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channels** | **Set&lt;String&gt;** |  |  [optional]
**description** | **String** |  |  [optional]
**disabled** | **Boolean** |  |  [optional]
**filterTypes** | **Set&lt;String&gt;** |  |  [optional]
**metadata** | **Map&lt;String, Object&gt;** |  |  [optional]
**headers** | **Map&lt;String, String&gt;** |  |  [optional]
**payloadRules** | **Map&lt;String, Object&gt;** | The filter rules for the message payload. |  [optional]
**rateLimit** | **Integer** |  |  [optional]
**secret** | **String** | The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24. |  [optional]
**uid** | **String** | The ep&#39;s UID |  [optional]
**url** | **URI** |  |  [optional]
**version** | **Integer** |  |  [optional]



