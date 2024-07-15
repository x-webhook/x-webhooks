# BroadcastApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBroadcastMessage**](BroadcastApi.md#createBroadcastMessage) | **POST** /api/v1/msg/broadcast | Create Broadcast Message


<a name="createBroadcastMessage"></a>
# **createBroadcastMessage**
> MessageBroadcastOut createBroadcastMessage(messageBroadcastIn, idempotencyKey)

Create Broadcast Message

Creates a background task to send the same message to each application in your organization

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    MessageBroadcastIn messageBroadcastIn = new MessageBroadcastIn(); // MessageBroadcastIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      MessageBroadcastOut result = apiInstance.createBroadcastMessage(messageBroadcastIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#createBroadcastMessage");
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
 **messageBroadcastIn** | [**MessageBroadcastIn**](MessageBroadcastIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**MessageBroadcastOut**](MessageBroadcastOut.md)

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

