# IntegrationApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1IntegrationCreate**](IntegrationApi.md#v1IntegrationCreate) | **POST** /api/v1/app/{app_id}/integration | Create Integration
[**v1IntegrationDelete**](IntegrationApi.md#v1IntegrationDelete) | **DELETE** /api/v1/app/{app_id}/integration/{integ_id} | Delete Integration
[**v1IntegrationGet**](IntegrationApi.md#v1IntegrationGet) | **GET** /api/v1/app/{app_id}/integration/{integ_id} | Get Integration
[**v1IntegrationGetKey**](IntegrationApi.md#v1IntegrationGetKey) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/key | Get Integration Key
[**v1IntegrationList**](IntegrationApi.md#v1IntegrationList) | **GET** /api/v1/app/{app_id}/integration | List Integrations
[**v1IntegrationRotateKey**](IntegrationApi.md#v1IntegrationRotateKey) | **POST** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate | Rotate Integration Key
[**v1IntegrationUpdate**](IntegrationApi.md#v1IntegrationUpdate) | **PUT** /api/v1/app/{app_id}/integration/{integ_id} | Update Integration


<a name="v1IntegrationCreate"></a>
# **v1IntegrationCreate**
> IntegrationOut v1IntegrationCreate(appId, integrationIn, idempotencyKey)

Create Integration

Create an integration.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    IntegrationIn integrationIn = new IntegrationIn(); // IntegrationIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      IntegrationOut result = apiInstance.v1IntegrationCreate(appId, integrationIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#v1IntegrationCreate");
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
 **integrationIn** | [**IntegrationIn**](IntegrationIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**IntegrationOut**](IntegrationOut.md)

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

<a name="v1IntegrationDelete"></a>
# **v1IntegrationDelete**
> v1IntegrationDelete(appId, integId)

Delete Integration

Delete an integration.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The integ's ID
    try {
      apiInstance.v1IntegrationDelete(appId, integId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#v1IntegrationDelete");
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
 **integId** | **String**| The integ&#39;s ID |

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

<a name="v1IntegrationGet"></a>
# **v1IntegrationGet**
> IntegrationOut v1IntegrationGet(appId, integId)

Get Integration

Get an integration.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The integ's ID
    try {
      IntegrationOut result = apiInstance.v1IntegrationGet(appId, integId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#v1IntegrationGet");
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
 **integId** | **String**| The integ&#39;s ID |

### Return type

[**IntegrationOut**](IntegrationOut.md)

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

<a name="v1IntegrationGetKey"></a>
# **v1IntegrationGetKey**
> IntegrationKeyOut v1IntegrationGetKey(appId, integId)

Get Integration Key

Get an integration&#39;s key.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The integ's ID
    try {
      IntegrationKeyOut result = apiInstance.v1IntegrationGetKey(appId, integId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#v1IntegrationGetKey");
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
 **integId** | **String**| The integ&#39;s ID |

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

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

<a name="v1IntegrationList"></a>
# **v1IntegrationList**
> ListResponseIntegrationOut v1IntegrationList(appId, limit, iterator, order)

List Integrations

List the application&#39;s integrations.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // Ordering | The sorting order of the returned items
    try {
      ListResponseIntegrationOut result = apiInstance.v1IntegrationList(appId, limit, iterator, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#v1IntegrationList");
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

[**ListResponseIntegrationOut**](ListResponseIntegrationOut.md)

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

<a name="v1IntegrationRotateKey"></a>
# **v1IntegrationRotateKey**
> IntegrationKeyOut v1IntegrationRotateKey(appId, integId, idempotencyKey)

Rotate Integration Key

Rotate the integration&#39;s key. The previous key will be immediately revoked.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The integ's ID
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      IntegrationKeyOut result = apiInstance.v1IntegrationRotateKey(appId, integId, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#v1IntegrationRotateKey");
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
 **integId** | **String**| The integ&#39;s ID |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

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

<a name="v1IntegrationUpdate"></a>
# **v1IntegrationUpdate**
> IntegrationOut v1IntegrationUpdate(appId, integId, integrationUpdate)

Update Integration

Update an integration.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The integ's ID
    IntegrationUpdate integrationUpdate = new IntegrationUpdate(); // IntegrationUpdate | 
    try {
      IntegrationOut result = apiInstance.v1IntegrationUpdate(appId, integId, integrationUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#v1IntegrationUpdate");
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
 **integId** | **String**| The integ&#39;s ID |
 **integrationUpdate** | [**IntegrationUpdate**](IntegrationUpdate.md)|  |

### Return type

[**IntegrationOut**](IntegrationOut.md)

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

