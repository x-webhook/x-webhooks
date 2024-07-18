# BackgroundTasksApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBackgroundTask**](BackgroundTasksApi.md#getBackgroundTask) | **GET** /api/v1/background-task/{task_id} | Get Background Task
[**listBackgroundTasks**](BackgroundTasksApi.md#listBackgroundTasks) | **GET** /api/v1/background-task | List Background Tasks


<a name="getBackgroundTask"></a>
# **getBackgroundTask**
> BackgroundTaskOut getBackgroundTask(taskId)

Get Background Task

Get a background task by ID.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.BackgroundTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    BackgroundTasksApi apiInstance = new BackgroundTasksApi(defaultClient);
    String taskId = "taskId_example"; // String | 
    try {
      BackgroundTaskOut result = apiInstance.getBackgroundTask(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundTasksApi#getBackgroundTask");
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
 **taskId** | **String**|  |

### Return type

[**BackgroundTaskOut**](BackgroundTaskOut.md)

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

<a name="listBackgroundTasks"></a>
# **listBackgroundTasks**
> ListResponseBackgroundTaskOut listBackgroundTasks(status, task, limit, iterator, order)

List Background Tasks

List background tasks executed in the past 90 days.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.BackgroundTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    BackgroundTasksApi apiInstance = new BackgroundTasksApi(defaultClient);
    BackgroundTaskStatus status = BackgroundTaskStatus.fromValue("running"); // BackgroundTaskStatus | Filter the response based on the status
    BackgroundTaskType task = BackgroundTaskType.fromValue("endpoint.replay"); // BackgroundTaskType | Filter the response based on the type
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "iterator_example"; // String | The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // Ordering | The sorting order of the returned items
    try {
      ListResponseBackgroundTaskOut result = apiInstance.listBackgroundTasks(status, task, limit, iterator, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundTasksApi#listBackgroundTasks");
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
 **status** | [**BackgroundTaskStatus**](.md)| Filter the response based on the status | [optional] [enum: running, finished, failed]
 **task** | [**BackgroundTaskType**](.md)| Filter the response based on the type | [optional] [enum: endpoint.replay, endpoint.recover, application.stats, message.broadcast, sdk.generate, event-type.aggregate]
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **order** | [**Ordering**](.md)| The sorting order of the returned items | [optional] [enum: ascending, descending]

### Return type

[**ListResponseBackgroundTaskOut**](ListResponseBackgroundTaskOut.md)

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

