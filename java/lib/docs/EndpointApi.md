# EndpointApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1EndpointCreate**](EndpointApi.md#v1EndpointCreate) | **POST** /api/v1/app/{app_id}/endpoint | Create Endpoint
[**v1EndpointDelete**](EndpointApi.md#v1EndpointDelete) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Delete Endpoint
[**v1EndpointDeleteMtlsConfig**](EndpointApi.md#v1EndpointDeleteMtlsConfig) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/mtls | Delete Endpoint Mtls Config
[**v1EndpointDeleteOauthConfig**](EndpointApi.md#v1EndpointDeleteOauthConfig) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/oauth | Delete Endpoint Oauth Config
[**v1EndpointGet**](EndpointApi.md#v1EndpointGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Get Endpoint
[**v1EndpointGetHeaders**](EndpointApi.md#v1EndpointGetHeaders) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Get Endpoint Headers
[**v1EndpointGetSecret**](EndpointApi.md#v1EndpointGetSecret) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret | Get Endpoint Secret
[**v1EndpointGetStats**](EndpointApi.md#v1EndpointGetStats) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats | Endpoint Stats
[**v1EndpointList**](EndpointApi.md#v1EndpointList) | **GET** /api/v1/app/{app_id}/endpoint | List Endpoints
[**v1EndpointPatch**](EndpointApi.md#v1EndpointPatch) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Patch Endpoint
[**v1EndpointPatchHeaders**](EndpointApi.md#v1EndpointPatchHeaders) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Patch Endpoint Headers
[**v1EndpointRecover**](EndpointApi.md#v1EndpointRecover) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover | Recover Failed Webhooks
[**v1EndpointReplay**](EndpointApi.md#v1EndpointReplay) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing | Replay Missing Webhooks
[**v1EndpointRotateSecret**](EndpointApi.md#v1EndpointRotateSecret) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate | Rotate Endpoint Secret
[**v1EndpointSendExample**](EndpointApi.md#v1EndpointSendExample) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/send-example | Send Event Type Example Message
[**v1EndpointTransformationGet**](EndpointApi.md#v1EndpointTransformationGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Get Endpoint Transformation
[**v1EndpointTransformationPartialUpdate**](EndpointApi.md#v1EndpointTransformationPartialUpdate) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Set Endpoint Transformation
[**v1EndpointTransformationSimulate**](EndpointApi.md#v1EndpointTransformationSimulate) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation/simulate | Simulate
[**v1EndpointUpdate**](EndpointApi.md#v1EndpointUpdate) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Update Endpoint
[**v1EndpointUpdateHeaders**](EndpointApi.md#v1EndpointUpdateHeaders) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Update Endpoint Headers
[**v1EndpointUpdateMtlsConfig**](EndpointApi.md#v1EndpointUpdateMtlsConfig) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/mtls | Update Endpoint Mtls Config
[**v1EndpointUpdateOauthConfig**](EndpointApi.md#v1EndpointUpdateOauthConfig) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/oauth | Update Endpoint Oauth Config


<a name="v1EndpointCreate"></a>
# **v1EndpointCreate**
> EndpointOut v1EndpointCreate(appId, endpointIn, idempotencyKey)

Create Endpoint

Create a new endpoint for the application.  When &#x60;secret&#x60; is &#x60;null&#x60; the secret is automatically generated (recommended)

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    EndpointIn endpointIn = new EndpointIn(); // EndpointIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EndpointOut result = apiInstance.v1EndpointCreate(appId, endpointIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointIn** | [**EndpointIn**](EndpointIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointDelete"></a>
# **v1EndpointDelete**
> v1EndpointDelete(appId, endpointId)

Delete Endpoint

Delete an endpoint.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    try {
      apiInstance.v1EndpointDelete(appId, endpointId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointDeleteMtlsConfig"></a>
# **v1EndpointDeleteMtlsConfig**
> v1EndpointDeleteMtlsConfig(appId, endpointId)

Delete Endpoint Mtls Config

Delete endpoint mTLS configuration

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    try {
      apiInstance.v1EndpointDeleteMtlsConfig(appId, endpointId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointDeleteMtlsConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointDeleteOauthConfig"></a>
# **v1EndpointDeleteOauthConfig**
> v1EndpointDeleteOauthConfig(appId, endpointId)

Delete Endpoint Oauth Config

Delete endpoint OAuth configuration

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    try {
      apiInstance.v1EndpointDeleteOauthConfig(appId, endpointId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointDeleteOauthConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointGet"></a>
# **v1EndpointGet**
> EndpointOut v1EndpointGet(appId, endpointId)

Get Endpoint

Get an endpoint.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    try {
      EndpointOut result = apiInstance.v1EndpointGet(appId, endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointGetHeaders"></a>
# **v1EndpointGetHeaders**
> EndpointHeadersOut v1EndpointGetHeaders(appId, endpointId)

Get Endpoint Headers

Get the additional headers to be sent with the webhook

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    try {
      EndpointHeadersOut result = apiInstance.v1EndpointGetHeaders(appId, endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointGetHeaders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |

### Return type

[**EndpointHeadersOut**](EndpointHeadersOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointGetSecret"></a>
# **v1EndpointGetSecret**
> EndpointSecretOut v1EndpointGetSecret(appId, endpointId)

Get Endpoint Secret

Get the endpoint&#39;s signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.webhook.openweb3.io/consuming-webhooks/).

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    try {
      EndpointSecretOut result = apiInstance.v1EndpointGetSecret(appId, endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointGetSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |

### Return type

[**EndpointSecretOut**](EndpointSecretOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointGetStats"></a>
# **v1EndpointGetStats**
> EndpointStats v1EndpointGetStats(appId, endpointId, since, until)

Endpoint Stats

Get basic statistics for the endpoint.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data starting from this date
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data ending by this date
    try {
      EndpointStats result = apiInstance.v1EndpointGetStats(appId, endpointId, since, until);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointGetStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **since** | **OffsetDateTime**| Filter the range to data starting from this date | [optional]
 **until** | **OffsetDateTime**| Filter the range to data ending by this date | [optional]

### Return type

[**EndpointStats**](EndpointStats.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointList"></a>
# **v1EndpointList**
> ListResponseEndpointOut v1EndpointList(appId, limit, iterator, order)

List Endpoints

List the application&#39;s endpoints.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // Ordering | The sorting order of the returned items
    try {
      ListResponseEndpointOut result = apiInstance.v1EndpointList(appId, limit, iterator, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **order** | [**Ordering**](.md)| The sorting order of the returned items | [optional] [enum: ascending, descending]

### Return type

[**ListResponseEndpointOut**](ListResponseEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointPatch"></a>
# **v1EndpointPatch**
> EndpointOut v1EndpointPatch(appId, endpointId, endpointPatch)

Patch Endpoint

Partially update an endpoint.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EndpointPatch endpointPatch = new EndpointPatch(); // EndpointPatch | 
    try {
      EndpointOut result = apiInstance.v1EndpointPatch(appId, endpointId, endpointPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **endpointPatch** | [**EndpointPatch**](EndpointPatch.md)|  |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointPatchHeaders"></a>
# **v1EndpointPatchHeaders**
> v1EndpointPatchHeaders(appId, endpointId, endpointHeadersPatchIn)

Patch Endpoint Headers

Partially set the additional headers to be sent with the webhook

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EndpointHeadersPatchIn endpointHeadersPatchIn = new EndpointHeadersPatchIn(); // EndpointHeadersPatchIn | 
    try {
      apiInstance.v1EndpointPatchHeaders(appId, endpointId, endpointHeadersPatchIn);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointPatchHeaders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **endpointHeadersPatchIn** | [**EndpointHeadersPatchIn**](EndpointHeadersPatchIn.md)|  |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointRecover"></a>
# **v1EndpointRecover**
> RecoverOut v1EndpointRecover(appId, endpointId, recoverIn, idempotencyKey)

Recover Failed Webhooks

Resend all failed messages since a given time.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    RecoverIn recoverIn = new RecoverIn(); // RecoverIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      RecoverOut result = apiInstance.v1EndpointRecover(appId, endpointId, recoverIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointRecover");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **recoverIn** | [**RecoverIn**](RecoverIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**RecoverOut**](RecoverOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointReplay"></a>
# **v1EndpointReplay**
> ReplayOut v1EndpointReplay(appId, endpointId, replayIn, idempotencyKey)

Replay Missing Webhooks

Replays messages to the endpoint. Only messages that were created after &#x60;since&#x60; will be sent. Messages that were previously sent to the endpoint are not resent.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    ReplayIn replayIn = new ReplayIn(); // ReplayIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      ReplayOut result = apiInstance.v1EndpointReplay(appId, endpointId, replayIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointReplay");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **replayIn** | [**ReplayIn**](ReplayIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**ReplayOut**](ReplayOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointRotateSecret"></a>
# **v1EndpointRotateSecret**
> v1EndpointRotateSecret(appId, endpointId, endpointSecretRotateIn, idempotencyKey)

Rotate Endpoint Secret

Rotates the endpoint&#39;s signing secret.  The previous secret will be valid for the next 24 hours.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EndpointSecretRotateIn endpointSecretRotateIn = new EndpointSecretRotateIn(); // EndpointSecretRotateIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      apiInstance.v1EndpointRotateSecret(appId, endpointId, endpointSecretRotateIn, idempotencyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointRotateSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **endpointSecretRotateIn** | [**EndpointSecretRotateIn**](EndpointSecretRotateIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointSendExample"></a>
# **v1EndpointSendExample**
> MessageOut v1EndpointSendExample(appId, endpointId, eventExampleIn, idempotencyKey)

Send Event Type Example Message

Send an example message for event

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EventExampleIn eventExampleIn = new EventExampleIn(); // EventExampleIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      MessageOut result = apiInstance.v1EndpointSendExample(appId, endpointId, eventExampleIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointSendExample");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **eventExampleIn** | [**EventExampleIn**](EventExampleIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointTransformationGet"></a>
# **v1EndpointTransformationGet**
> EndpointTransformationOut v1EndpointTransformationGet(appId, endpointId)

Get Endpoint Transformation

Get the transformation code associated with this endpoint

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    try {
      EndpointTransformationOut result = apiInstance.v1EndpointTransformationGet(appId, endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointTransformationGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |

### Return type

[**EndpointTransformationOut**](EndpointTransformationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointTransformationPartialUpdate"></a>
# **v1EndpointTransformationPartialUpdate**
> v1EndpointTransformationPartialUpdate(appId, endpointId, endpointTransformationIn)

Set Endpoint Transformation

Set or unset the transformation code associated with this endpoint

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EndpointTransformationIn endpointTransformationIn = new EndpointTransformationIn(); // EndpointTransformationIn | 
    try {
      apiInstance.v1EndpointTransformationPartialUpdate(appId, endpointId, endpointTransformationIn);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointTransformationPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **endpointTransformationIn** | [**EndpointTransformationIn**](EndpointTransformationIn.md)|  |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointTransformationSimulate"></a>
# **v1EndpointTransformationSimulate**
> EndpointTransformationSimulateOut v1EndpointTransformationSimulate(appId, endpointId, endpointTransformationSimulateIn, idempotencyKey)

Simulate

Simulate running the transformation on the payload and code

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EndpointTransformationSimulateIn endpointTransformationSimulateIn = new EndpointTransformationSimulateIn(); // EndpointTransformationSimulateIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EndpointTransformationSimulateOut result = apiInstance.v1EndpointTransformationSimulate(appId, endpointId, endpointTransformationSimulateIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointTransformationSimulate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **endpointTransformationSimulateIn** | [**EndpointTransformationSimulateIn**](EndpointTransformationSimulateIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**EndpointTransformationSimulateOut**](EndpointTransformationSimulateOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointUpdate"></a>
# **v1EndpointUpdate**
> EndpointOut v1EndpointUpdate(appId, endpointId, endpointUpdate)

Update Endpoint

Update an endpoint.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EndpointUpdate endpointUpdate = new EndpointUpdate(); // EndpointUpdate | 
    try {
      EndpointOut result = apiInstance.v1EndpointUpdate(appId, endpointId, endpointUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **endpointUpdate** | [**EndpointUpdate**](EndpointUpdate.md)|  |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**201** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointUpdateHeaders"></a>
# **v1EndpointUpdateHeaders**
> v1EndpointUpdateHeaders(appId, endpointId, endpointHeadersIn)

Update Endpoint Headers

Set the additional headers to be sent with the webhook

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EndpointHeadersIn endpointHeadersIn = new EndpointHeadersIn(); // EndpointHeadersIn | 
    try {
      apiInstance.v1EndpointUpdateHeaders(appId, endpointId, endpointHeadersIn);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointUpdateHeaders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **endpointHeadersIn** | [**EndpointHeadersIn**](EndpointHeadersIn.md)|  |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointUpdateMtlsConfig"></a>
# **v1EndpointUpdateMtlsConfig**
> v1EndpointUpdateMtlsConfig(appId, endpointId, endpointMtlsConfigIn)

Update Endpoint Mtls Config

Create/update endpoint mTLS configuration

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EndpointMtlsConfigIn endpointMtlsConfigIn = new EndpointMtlsConfigIn(); // EndpointMtlsConfigIn | 
    try {
      apiInstance.v1EndpointUpdateMtlsConfig(appId, endpointId, endpointMtlsConfigIn);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointUpdateMtlsConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **endpointMtlsConfigIn** | [**EndpointMtlsConfigIn**](EndpointMtlsConfigIn.md)|  |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EndpointUpdateOauthConfig"></a>
# **v1EndpointUpdateOauthConfig**
> v1EndpointUpdateOauthConfig(appId, endpointId, endpointOauthConfigIn)

Update Endpoint Oauth Config

Create/update endpoint OAuth configuration

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    EndpointOauthConfigIn endpointOauthConfigIn = new EndpointOauthConfigIn(); // EndpointOauthConfigIn | 
    try {
      apiInstance.v1EndpointUpdateOauthConfig(appId, endpointId, endpointOauthConfigIn);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointUpdateOauthConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **endpointOauthConfigIn** | [**EndpointOauthConfigIn**](EndpointOauthConfigIn.md)|  |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

