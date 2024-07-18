# InboundApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1InboundMsg**](InboundApi.md#v1InboundMsg) | **POST** /api/v1/app/{app_id}/inbound/msg/{inbound_token} | Handle Inbound
[**v1InboundRotateUrl**](InboundApi.md#v1InboundRotateUrl) | **POST** /api/v1/app/{app_id}/inbound/rotate-url | Rotate Url


<a name="v1InboundMsg"></a>
# **v1InboundMsg**
> MessageOut v1InboundMsg(appId, inboundToken, body, eventType, idempotencyKey)

Handle Inbound

Handles a raw inbound webhook for the application.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.InboundApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    InboundApi apiInstance = new InboundApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String inboundToken = "inboundToken_example"; // String | 
    String body = "body_example"; // String | 
    String eventType = "user.signup"; // String | The event type's name
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      MessageOut result = apiInstance.v1InboundMsg(appId, inboundToken, body, eventType, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundApi#v1InboundMsg");
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
 **inboundToken** | **String**|  |
 **body** | **String**|  |
 **eventType** | **String**| The event type&#39;s name | [optional]
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

<a name="v1InboundRotateUrl"></a>
# **v1InboundRotateUrl**
> RotatedUrlOut v1InboundRotateUrl(appId, idempotencyKey)

Rotate Url

Invalidates the previous inbound url (if one exists), producing a new inbound URL for this app

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.InboundApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    InboundApi apiInstance = new InboundApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      RotatedUrlOut result = apiInstance.v1InboundRotateUrl(appId, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundApi#v1InboundRotateUrl");
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

[**RotatedUrlOut**](RotatedUrlOut.md)

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

