# TransformationTemplateApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1EndpointUpdateHubspotOauthConfig**](TransformationTemplateApi.md#v1EndpointUpdateHubspotOauthConfig) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation-template/oauth/hubspot | Update Hubspot Oauth Config
[**v1TransformationTemplateCreate**](TransformationTemplateApi.md#v1TransformationTemplateCreate) | **POST** /api/v1/transformation-template | Create Transformation Template
[**v1TransformationTemplateDelete**](TransformationTemplateApi.md#v1TransformationTemplateDelete) | **DELETE** /api/v1/transformation-template/{transformation_template_id} | Delete Transformation Template
[**v1TransformationTemplateGenerate**](TransformationTemplateApi.md#v1TransformationTemplateGenerate) | **POST** /api/v1/transformation-template/generate | Generate
[**v1TransformationTemplateGet**](TransformationTemplateApi.md#v1TransformationTemplateGet) | **GET** /api/v1/transformation-template/{transformation_template_id} | Get Transformation Template
[**v1TransformationTemplateList**](TransformationTemplateApi.md#v1TransformationTemplateList) | **GET** /api/v1/transformation-template | List Transformation Templates
[**v1TransformationTemplateOauthDiscord**](TransformationTemplateApi.md#v1TransformationTemplateOauthDiscord) | **POST** /api/v1/transformation-template/oauth/discord | Authorize Discord
[**v1TransformationTemplateOauthHubspot**](TransformationTemplateApi.md#v1TransformationTemplateOauthHubspot) | **POST** /api/v1/transformation-template/oauth/hubspot | Authorize Hubspot
[**v1TransformationTemplateOauthSlack**](TransformationTemplateApi.md#v1TransformationTemplateOauthSlack) | **POST** /api/v1/transformation-template/oauth/slack | Authorize Slack
[**v1TransformationTemplatePatch**](TransformationTemplateApi.md#v1TransformationTemplatePatch) | **PATCH** /api/v1/transformation-template/{transformation_template_id} | Patch Transformation Template
[**v1TransformationTemplateSimulate**](TransformationTemplateApi.md#v1TransformationTemplateSimulate) | **POST** /api/v1/transformation-template/simulate | Simulate
[**v1TransformationTemplateUpdate**](TransformationTemplateApi.md#v1TransformationTemplateUpdate) | **PUT** /api/v1/transformation-template/{transformation_template_id} | Update Transformation Template


<a name="v1EndpointUpdateHubspotOauthConfig"></a>
# **v1EndpointUpdateHubspotOauthConfig**
> v1EndpointUpdateHubspotOauthConfig(appId, endpointId, hubspotOauthConfigIn)

Update Hubspot Oauth Config

Create/update endpoint Hubsport OAuth configuration Specific private endpoint just for us, to avoid exposing the Hubspot secret to the client.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    HubspotOauthConfigIn hubspotOauthConfigIn = new HubspotOauthConfigIn(); // HubspotOauthConfigIn | 
    try {
      apiInstance.v1EndpointUpdateHubspotOauthConfig(appId, endpointId, hubspotOauthConfigIn);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1EndpointUpdateHubspotOauthConfig");
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
 **hubspotOauthConfigIn** | [**HubspotOauthConfigIn**](HubspotOauthConfigIn.md)|  |

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

<a name="v1TransformationTemplateCreate"></a>
# **v1TransformationTemplateCreate**
> TemplateOut v1TransformationTemplateCreate(templateIn, idempotencyKey)

Create Transformation Template

Create a new transformation template

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    TemplateIn templateIn = new TemplateIn(); // TemplateIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      TemplateOut result = apiInstance.v1TransformationTemplateCreate(templateIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateCreate");
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
 **templateIn** | [**TemplateIn**](TemplateIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**TemplateOut**](TemplateOut.md)

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

<a name="v1TransformationTemplateDelete"></a>
# **v1TransformationTemplateDelete**
> v1TransformationTemplateDelete(transformationTemplateId)

Delete Transformation Template

Delete a transformation template

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    String transformationTemplateId = "transformationTemplateId_example"; // String | 
    try {
      apiInstance.v1TransformationTemplateDelete(transformationTemplateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateDelete");
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
 **transformationTemplateId** | **String**|  |

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

<a name="v1TransformationTemplateGenerate"></a>
# **v1TransformationTemplateGenerate**
> GenerateOut v1TransformationTemplateGenerate(generateIn, idempotencyKey)

Generate

Use OpenAI&#39;s Completion API to generate code for a transformation template

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    GenerateIn generateIn = new GenerateIn(); // GenerateIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      GenerateOut result = apiInstance.v1TransformationTemplateGenerate(generateIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateGenerate");
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
 **generateIn** | [**GenerateIn**](GenerateIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**GenerateOut**](GenerateOut.md)

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

<a name="v1TransformationTemplateGet"></a>
# **v1TransformationTemplateGet**
> TemplateOut v1TransformationTemplateGet(transformationTemplateId)

Get Transformation Template

Get a transformation template

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    String transformationTemplateId = "transformationTemplateId_example"; // String | 
    try {
      TemplateOut result = apiInstance.v1TransformationTemplateGet(transformationTemplateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateGet");
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
 **transformationTemplateId** | **String**|  |

### Return type

[**TemplateOut**](TemplateOut.md)

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

<a name="v1TransformationTemplateList"></a>
# **v1TransformationTemplateList**
> ListResponseTemplateOut v1TransformationTemplateList(limit, iterator, order)

List Transformation Templates

List all transformation templates for an application

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "iterator_example"; // String | The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // Ordering | The sorting order of the returned items
    try {
      ListResponseTemplateOut result = apiInstance.v1TransformationTemplateList(limit, iterator, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateList");
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
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **order** | [**Ordering**](.md)| The sorting order of the returned items | [optional] [enum: ascending, descending]

### Return type

[**ListResponseTemplateOut**](ListResponseTemplateOut.md)

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

<a name="v1TransformationTemplateOauthDiscord"></a>
# **v1TransformationTemplateOauthDiscord**
> IncomingWebhookPayloadOut v1TransformationTemplateOauthDiscord(oauthPayloadIn, idempotencyKey)

Authorize Discord

Get Discord Incoming webhook URL

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    OAuthPayloadIn oauthPayloadIn = new OAuthPayloadIn(); // OAuthPayloadIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      IncomingWebhookPayloadOut result = apiInstance.v1TransformationTemplateOauthDiscord(oauthPayloadIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateOauthDiscord");
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
 **oauthPayloadIn** | [**OAuthPayloadIn**](OAuthPayloadIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**IncomingWebhookPayloadOut**](IncomingWebhookPayloadOut.md)

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

<a name="v1TransformationTemplateOauthHubspot"></a>
# **v1TransformationTemplateOauthHubspot**
> OAuthPayloadOut v1TransformationTemplateOauthHubspot(oauthPayloadIn, idempotencyKey)

Authorize Hubspot

Get Hubspot access token using authorization code

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    OAuthPayloadIn oauthPayloadIn = new OAuthPayloadIn(); // OAuthPayloadIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      OAuthPayloadOut result = apiInstance.v1TransformationTemplateOauthHubspot(oauthPayloadIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateOauthHubspot");
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
 **oauthPayloadIn** | [**OAuthPayloadIn**](OAuthPayloadIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**OAuthPayloadOut**](OAuthPayloadOut.md)

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

<a name="v1TransformationTemplateOauthSlack"></a>
# **v1TransformationTemplateOauthSlack**
> IncomingWebhookPayloadOut v1TransformationTemplateOauthSlack(oauthPayloadIn, idempotencyKey)

Authorize Slack

Get Slack Incoming webhook URL

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    OAuthPayloadIn oauthPayloadIn = new OAuthPayloadIn(); // OAuthPayloadIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      IncomingWebhookPayloadOut result = apiInstance.v1TransformationTemplateOauthSlack(oauthPayloadIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateOauthSlack");
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
 **oauthPayloadIn** | [**OAuthPayloadIn**](OAuthPayloadIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**IncomingWebhookPayloadOut**](IncomingWebhookPayloadOut.md)

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

<a name="v1TransformationTemplatePatch"></a>
# **v1TransformationTemplatePatch**
> TemplateOut v1TransformationTemplatePatch(transformationTemplateId, templatePatch)

Patch Transformation Template

Partially update a transformation template

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    String transformationTemplateId = "transformationTemplateId_example"; // String | 
    TemplatePatch templatePatch = new TemplatePatch(); // TemplatePatch | 
    try {
      TemplateOut result = apiInstance.v1TransformationTemplatePatch(transformationTemplateId, templatePatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplatePatch");
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
 **transformationTemplateId** | **String**|  |
 **templatePatch** | [**TemplatePatch**](TemplatePatch.md)|  |

### Return type

[**TemplateOut**](TemplateOut.md)

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

<a name="v1TransformationTemplateSimulate"></a>
# **v1TransformationTemplateSimulate**
> TransformationSimulateOut v1TransformationTemplateSimulate(transformationSimulateIn, idempotencyKey)

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
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    TransformationSimulateIn transformationSimulateIn = new TransformationSimulateIn(); // TransformationSimulateIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      TransformationSimulateOut result = apiInstance.v1TransformationTemplateSimulate(transformationSimulateIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateSimulate");
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
 **transformationSimulateIn** | [**TransformationSimulateIn**](TransformationSimulateIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**TransformationSimulateOut**](TransformationSimulateOut.md)

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

<a name="v1TransformationTemplateUpdate"></a>
# **v1TransformationTemplateUpdate**
> TemplateOut v1TransformationTemplateUpdate(transformationTemplateId, templateUpdate)

Update Transformation Template

Update a transformation template

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.TransformationTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransformationTemplateApi apiInstance = new TransformationTemplateApi(defaultClient);
    String transformationTemplateId = "transformationTemplateId_example"; // String | 
    TemplateUpdate templateUpdate = new TemplateUpdate(); // TemplateUpdate | 
    try {
      TemplateOut result = apiInstance.v1TransformationTemplateUpdate(transformationTemplateId, templateUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformationTemplateApi#v1TransformationTemplateUpdate");
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
 **transformationTemplateId** | **String**|  |
 **templateUpdate** | [**TemplateUpdate**](TemplateUpdate.md)|  |

### Return type

[**TemplateOut**](TemplateOut.md)

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

