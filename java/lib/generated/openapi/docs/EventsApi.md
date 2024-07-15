# EventsApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1Events**](EventsApi.md#v1Events) | **GET** /api/v1/events | Events


<a name="v1Events"></a>
# **v1Events**
> MessageStreamOut v1Events(limit, iterator, eventTypes, channels, after)

Events

Reads the stream of operational webhook events for this environment

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "iterator_example"; // String | The iterator returned from a prior invocation
    Set<String> eventTypes = Arrays.asList(); // Set<String> | Filter response based on the event type
    Set<String> channels = Arrays.asList(); // Set<String> | Filter response based on the event type
    OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      MessageStreamOut result = apiInstance.v1Events(limit, iterator, eventTypes, channels, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#v1Events");
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
 **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]
 **channels** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]
 **after** | **OffsetDateTime**|  | [optional]

### Return type

[**MessageStreamOut**](MessageStreamOut.md)

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

