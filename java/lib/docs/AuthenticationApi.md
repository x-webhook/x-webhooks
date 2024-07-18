# AuthenticationApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AuthenticationAppPortalAccess**](AuthenticationApi.md#v1AuthenticationAppPortalAccess) | **POST** /api/v1/auth/app-portal-access/{app_id} | Get Consumer App Portal Access
[**v1AuthenticationDashboardAccess**](AuthenticationApi.md#v1AuthenticationDashboardAccess) | **POST** /api/v1/auth/dashboard-access/{app_id} | Dashboard Access
[**v1AuthenticationExchangeOneTimeToken**](AuthenticationApi.md#v1AuthenticationExchangeOneTimeToken) | **POST** /api/v1/auth/one-time-token | Exchange One Time Token
[**v1AuthenticationExpireAll**](AuthenticationApi.md#v1AuthenticationExpireAll) | **POST** /api/v1/auth/app/{app_id}/expire-all | Expire All
[**v1AuthenticationLogout**](AuthenticationApi.md#v1AuthenticationLogout) | **POST** /api/v1/auth/logout | Logout


<a name="v1AuthenticationAppPortalAccess"></a>
# **v1AuthenticationAppPortalAccess**
> AppPortalAccessOut v1AuthenticationAppPortalAccess(appId, appPortalAccessIn, idempotencyKey)

Get Consumer App Portal Access

Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    AppPortalAccessIn appPortalAccessIn = new AppPortalAccessIn(); // AppPortalAccessIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      AppPortalAccessOut result = apiInstance.v1AuthenticationAppPortalAccess(appId, appPortalAccessIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#v1AuthenticationAppPortalAccess");
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
 **appPortalAccessIn** | [**AppPortalAccessIn**](AppPortalAccessIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**AppPortalAccessOut**](AppPortalAccessOut.md)

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

<a name="v1AuthenticationDashboardAccess"></a>
# **v1AuthenticationDashboardAccess**
> DashboardAccessOut v1AuthenticationDashboardAccess(appId, idempotencyKey)

Dashboard Access

DEPRECATED: Please use &#x60;app-portal-access&#x60; instead.  Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      DashboardAccessOut result = apiInstance.v1AuthenticationDashboardAccess(appId, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#v1AuthenticationDashboardAccess");
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
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**DashboardAccessOut**](DashboardAccessOut.md)

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

<a name="v1AuthenticationExchangeOneTimeToken"></a>
# **v1AuthenticationExchangeOneTimeToken**
> OneTimeTokenOut v1AuthenticationExchangeOneTimeToken(oneTimeTokenIn, idempotencyKey)

Exchange One Time Token

This is a one time token

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    OneTimeTokenIn oneTimeTokenIn = new OneTimeTokenIn(); // OneTimeTokenIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      OneTimeTokenOut result = apiInstance.v1AuthenticationExchangeOneTimeToken(oneTimeTokenIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#v1AuthenticationExchangeOneTimeToken");
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
 **oneTimeTokenIn** | [**OneTimeTokenIn**](OneTimeTokenIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**OneTimeTokenOut**](OneTimeTokenOut.md)

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

<a name="v1AuthenticationExpireAll"></a>
# **v1AuthenticationExpireAll**
> v1AuthenticationExpireAll(appId, applicationTokenExpireIn, idempotencyKey)

Expire All

Expire all of the tokens associated with a specific Application

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    ApplicationTokenExpireIn applicationTokenExpireIn = new ApplicationTokenExpireIn(); // ApplicationTokenExpireIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      apiInstance.v1AuthenticationExpireAll(appId, applicationTokenExpireIn, idempotencyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#v1AuthenticationExpireAll");
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
 **applicationTokenExpireIn** | [**ApplicationTokenExpireIn**](ApplicationTokenExpireIn.md)|  |
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

<a name="v1AuthenticationLogout"></a>
# **v1AuthenticationLogout**
> v1AuthenticationLogout(idempotencyKey)

Logout

Logout an app token.  Trying to log out other tokens will fail.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      apiInstance.v1AuthenticationLogout(idempotencyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#v1AuthenticationLogout");
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
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

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

