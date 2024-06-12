# \BackgroundTasksApi

All URIs are relative to *https://api.eu.xwebhook.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBackgroundTask**](BackgroundTasksApi.md#GetBackgroundTask) | **Get** /api/v1/background-task/{task_id} | Get Background Task
[**ListBackgroundTasks**](BackgroundTasksApi.md#ListBackgroundTasks) | **Get** /api/v1/background-task | List Background Tasks



## GetBackgroundTask

> BackgroundTaskOut GetBackgroundTask(ctx, taskId).Execute()

Get Background Task



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    taskId := "taskId_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.BackgroundTasksApi.GetBackgroundTask(context.Background(), taskId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BackgroundTasksApi.GetBackgroundTask``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBackgroundTask`: BackgroundTaskOut
    fmt.Fprintf(os.Stdout, "Response from `BackgroundTasksApi.GetBackgroundTask`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**taskId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetBackgroundTaskRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**BackgroundTaskOut**](BackgroundTaskOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListBackgroundTasks

> ListResponseBackgroundTaskOut ListBackgroundTasks(ctx).Status(status).Task(task).Limit(limit).Iterator(iterator).Order(order).Execute()

List Background Tasks



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    status := openapiclient.BackgroundTaskStatus("running") // BackgroundTaskStatus | Filter the response based on the status (optional)
    task := openapiclient.BackgroundTaskType("endpoint.replay") // BackgroundTaskType | Filter the response based on the type (optional)
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "iterator_example" // string | The iterator returned from a prior invocation (optional)
    order := openapiclient.Ordering("ascending") // Ordering | The sorting order of the returned items (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.BackgroundTasksApi.ListBackgroundTasks(context.Background()).Status(status).Task(task).Limit(limit).Iterator(iterator).Order(order).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BackgroundTasksApi.ListBackgroundTasks``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListBackgroundTasks`: ListResponseBackgroundTaskOut
    fmt.Fprintf(os.Stdout, "Response from `BackgroundTasksApi.ListBackgroundTasks`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListBackgroundTasksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**BackgroundTaskStatus**](BackgroundTaskStatus.md) | Filter the response based on the status | 
 **task** | [**BackgroundTaskType**](BackgroundTaskType.md) | Filter the response based on the type | 
 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **order** | [**Ordering**](Ordering.md) | The sorting order of the returned items | 

### Return type

[**ListResponseBackgroundTaskOut**](ListResponseBackgroundTaskOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

