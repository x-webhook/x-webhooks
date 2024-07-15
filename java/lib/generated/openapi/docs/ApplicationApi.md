# ApplicationApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppUsageStatsApiV1AppStatsUsageGet**](ApplicationApi.md#getAppUsageStatsApiV1AppStatsUsageGet) | **GET** /api/v1/app/stats/usage | Get App Usage Stats
[**v1ApplicationCreate**](ApplicationApi.md#v1ApplicationCreate) | **POST** /api/v1/app | Create Application
[**v1ApplicationDelete**](ApplicationApi.md#v1ApplicationDelete) | **DELETE** /api/v1/app/{app_id} | Delete Application
[**v1ApplicationGet**](ApplicationApi.md#v1ApplicationGet) | **GET** /api/v1/app/{app_id} | Get Application
[**v1ApplicationGetStats**](ApplicationApi.md#v1ApplicationGetStats) | **GET** /api/v1/app/{app_id}/stats | Get App Stats
[**v1ApplicationList**](ApplicationApi.md#v1ApplicationList) | **GET** /api/v1/app | List Applications
[**v1ApplicationPatch**](ApplicationApi.md#v1ApplicationPatch) | **PATCH** /api/v1/app/{app_id} | Patch Application
[**v1ApplicationUpdate**](ApplicationApi.md#v1ApplicationUpdate) | **PUT** /api/v1/app/{app_id} | Update Application


<a name="getAppUsageStatsApiV1AppStatsUsageGet"></a>
# **getAppUsageStatsApiV1AppStatsUsageGet**
> ListResponseApplicationStats getAppUsageStatsApiV1AppStatsUsageGet(since, until, limit, iterator)

Get App Usage Stats

Get basic statistics for all applications.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data after this date
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data before this date
    Integer limit = 50; // Integer | Limit the number of returned items
    String iterator = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator to use (depends on the chosen ordering)
    try {
      ListResponseApplicationStats result = apiInstance.getAppUsageStatsApiV1AppStatsUsageGet(since, until, limit, iterator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getAppUsageStatsApiV1AppStatsUsageGet");
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
 **since** | **OffsetDateTime**| Filter the range to data after this date |
 **until** | **OffsetDateTime**| Filter the range to data before this date |
 **limit** | **Integer**| Limit the number of returned items | [optional] [default to 50]
 **iterator** | **String**| The iterator to use (depends on the chosen ordering) | [optional]

### Return type

[**ListResponseApplicationStats**](ListResponseApplicationStats.md)

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

<a name="v1ApplicationCreate"></a>
# **v1ApplicationCreate**
> ApplicationOut v1ApplicationCreate(applicationIn, getIfExists, idempotencyKey)

Create Application

Create a new application.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    ApplicationIn applicationIn = new ApplicationIn(); // ApplicationIn | 
    Boolean getIfExists = false; // Boolean | Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs.
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      ApplicationOut result = apiInstance.v1ApplicationCreate(applicationIn, getIfExists, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#v1ApplicationCreate");
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
 **applicationIn** | [**ApplicationIn**](ApplicationIn.md)|  |
 **getIfExists** | **Boolean**| Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. | [optional] [default to false]
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**ApplicationOut**](ApplicationOut.md)

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

<a name="v1ApplicationDelete"></a>
# **v1ApplicationDelete**
> v1ApplicationDelete(appId)

Delete Application

Delete an application.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    try {
      apiInstance.v1ApplicationDelete(appId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#v1ApplicationDelete");
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

<a name="v1ApplicationGet"></a>
# **v1ApplicationGet**
> ApplicationOut v1ApplicationGet(appId)

Get Application

Get an application.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    try {
      ApplicationOut result = apiInstance.v1ApplicationGet(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#v1ApplicationGet");
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

### Return type

[**ApplicationOut**](ApplicationOut.md)

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

<a name="v1ApplicationGetStats"></a>
# **v1ApplicationGetStats**
> ApplicationStats v1ApplicationGetStats(since, until, appId)

Get App Stats

Get basic statistics for the application

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data starting from this date
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data ending by this date
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    try {
      ApplicationStats result = apiInstance.v1ApplicationGetStats(since, until, appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#v1ApplicationGetStats");
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
 **since** | **OffsetDateTime**| Filter the range to data starting from this date |
 **until** | **OffsetDateTime**| Filter the range to data ending by this date |
 **appId** | **String**| The app&#39;s ID or UID |

### Return type

[**ApplicationStats**](ApplicationStats.md)

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

<a name="v1ApplicationList"></a>
# **v1ApplicationList**
> ListResponseApplicationOut v1ApplicationList(limit, iterator, order)

List Applications

List of all the organization&#39;s applications.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // Ordering | The sorting order of the returned items
    try {
      ListResponseApplicationOut result = apiInstance.v1ApplicationList(limit, iterator, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#v1ApplicationList");
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

[**ListResponseApplicationOut**](ListResponseApplicationOut.md)

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

<a name="v1ApplicationPatch"></a>
# **v1ApplicationPatch**
> ApplicationOut v1ApplicationPatch(appId, applicationPatch)

Patch Application

Partially update an application.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    ApplicationPatch applicationPatch = new ApplicationPatch(); // ApplicationPatch | 
    try {
      ApplicationOut result = apiInstance.v1ApplicationPatch(appId, applicationPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#v1ApplicationPatch");
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
 **applicationPatch** | [**ApplicationPatch**](ApplicationPatch.md)|  |

### Return type

[**ApplicationOut**](ApplicationOut.md)

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

<a name="v1ApplicationUpdate"></a>
# **v1ApplicationUpdate**
> ApplicationOut v1ApplicationUpdate(appId, applicationIn)

Update Application

Update an application.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    ApplicationIn applicationIn = new ApplicationIn(); // ApplicationIn | 
    try {
      ApplicationOut result = apiInstance.v1ApplicationUpdate(appId, applicationIn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#v1ApplicationUpdate");
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
 **applicationIn** | [**ApplicationIn**](ApplicationIn.md)|  |

### Return type

[**ApplicationOut**](ApplicationOut.md)

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

