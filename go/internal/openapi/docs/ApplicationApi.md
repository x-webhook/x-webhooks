# \ApplicationApi

All URIs are relative to *https://api.eu.xwebhook.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAppUsageStatsApiV1AppStatsUsageGet**](ApplicationApi.md#GetAppUsageStatsApiV1AppStatsUsageGet) | **Get** /api/v1/app/stats/usage | Get App Usage Stats
[**V1ApplicationCreate**](ApplicationApi.md#V1ApplicationCreate) | **Post** /api/v1/app | Create Application
[**V1ApplicationDelete**](ApplicationApi.md#V1ApplicationDelete) | **Delete** /api/v1/app/{app_id} | Delete Application
[**V1ApplicationGet**](ApplicationApi.md#V1ApplicationGet) | **Get** /api/v1/app/{app_id} | Get Application
[**V1ApplicationGetStats**](ApplicationApi.md#V1ApplicationGetStats) | **Get** /api/v1/app/{app_id}/stats | Get App Stats
[**V1ApplicationList**](ApplicationApi.md#V1ApplicationList) | **Get** /api/v1/app | List Applications
[**V1ApplicationPatch**](ApplicationApi.md#V1ApplicationPatch) | **Patch** /api/v1/app/{app_id} | Patch Application
[**V1ApplicationUpdate**](ApplicationApi.md#V1ApplicationUpdate) | **Put** /api/v1/app/{app_id} | Update Application



## GetAppUsageStatsApiV1AppStatsUsageGet

> ListResponseApplicationStats GetAppUsageStatsApiV1AppStatsUsageGet(ctx).Since(since).Until(until).Limit(limit).Iterator(iterator).Execute()

Get App Usage Stats



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    since := time.Now() // time.Time | Filter the range to data after this date
    until := time.Now() // time.Time | Filter the range to data before this date
    limit := int32(56) // int32 | Limit the number of returned items (optional) (default to 50)
    iterator := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator to use (depends on the chosen ordering) (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ApplicationApi.GetAppUsageStatsApiV1AppStatsUsageGet(context.Background()).Since(since).Until(until).Limit(limit).Iterator(iterator).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.GetAppUsageStatsApiV1AppStatsUsageGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAppUsageStatsApiV1AppStatsUsageGet`: ListResponseApplicationStats
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.GetAppUsageStatsApiV1AppStatsUsageGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetAppUsageStatsApiV1AppStatsUsageGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **time.Time** | Filter the range to data after this date | 
 **until** | **time.Time** | Filter the range to data before this date | 
 **limit** | **int32** | Limit the number of returned items | [default to 50]
 **iterator** | **string** | The iterator to use (depends on the chosen ordering) | 

### Return type

[**ListResponseApplicationStats**](ListResponseApplicationStats.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ApplicationCreate

> ApplicationOut V1ApplicationCreate(ctx).ApplicationIn(applicationIn).GetIfExists(getIfExists).IdempotencyKey(idempotencyKey).Execute()

Create Application



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
    applicationIn := *openapiclient.NewApplicationIn("My first application") // ApplicationIn | 
    getIfExists := true // bool | Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs. (optional) (default to false)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ApplicationApi.V1ApplicationCreate(context.Background()).ApplicationIn(applicationIn).GetIfExists(getIfExists).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.V1ApplicationCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ApplicationCreate`: ApplicationOut
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.V1ApplicationCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1ApplicationCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationIn** | [**ApplicationIn**](ApplicationIn.md) |  | 
 **getIfExists** | **bool** | Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. | [default to false]
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ApplicationDelete

> V1ApplicationDelete(ctx, appId).Execute()

Delete Application



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
    appId := "unique-app-identifier" // string | The app's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ApplicationApi.V1ApplicationDelete(context.Background(), appId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.V1ApplicationDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1ApplicationDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ApplicationGet

> ApplicationOut V1ApplicationGet(ctx, appId).Execute()

Get Application



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
    appId := "unique-app-identifier" // string | The app's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ApplicationApi.V1ApplicationGet(context.Background(), appId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.V1ApplicationGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ApplicationGet`: ApplicationOut
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.V1ApplicationGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1ApplicationGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ApplicationGetStats

> ApplicationStats V1ApplicationGetStats(ctx, appId).Since(since).Until(until).Execute()

Get App Stats



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    since := time.Now() // time.Time | Filter the range to data starting from this date
    until := time.Now() // time.Time | Filter the range to data ending by this date
    appId := "unique-app-identifier" // string | The app's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ApplicationApi.V1ApplicationGetStats(context.Background(), appId).Since(since).Until(until).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.V1ApplicationGetStats``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ApplicationGetStats`: ApplicationStats
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.V1ApplicationGetStats`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1ApplicationGetStatsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **time.Time** | Filter the range to data starting from this date | 
 **until** | **time.Time** | Filter the range to data ending by this date | 


### Return type

[**ApplicationStats**](ApplicationStats.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ApplicationList

> ListResponseApplicationOut V1ApplicationList(ctx).Limit(limit).Iterator(iterator).Order(order).Execute()

List Applications



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
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)
    order := openapiclient.Ordering("ascending") // Ordering | The sorting order of the returned items (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ApplicationApi.V1ApplicationList(context.Background()).Limit(limit).Iterator(iterator).Order(order).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.V1ApplicationList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ApplicationList`: ListResponseApplicationOut
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.V1ApplicationList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1ApplicationListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **order** | [**Ordering**](Ordering.md) | The sorting order of the returned items | 

### Return type

[**ListResponseApplicationOut**](ListResponseApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ApplicationPatch

> ApplicationOut V1ApplicationPatch(ctx, appId).ApplicationPatch(applicationPatch).Execute()

Patch Application



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
    appId := "unique-app-identifier" // string | The app's ID or UID
    applicationPatch := *openapiclient.NewApplicationPatch() // ApplicationPatch | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ApplicationApi.V1ApplicationPatch(context.Background(), appId).ApplicationPatch(applicationPatch).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.V1ApplicationPatch``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ApplicationPatch`: ApplicationOut
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.V1ApplicationPatch`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1ApplicationPatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **applicationPatch** | [**ApplicationPatch**](ApplicationPatch.md) |  | 

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ApplicationUpdate

> ApplicationOut V1ApplicationUpdate(ctx, appId).ApplicationIn(applicationIn).Execute()

Update Application



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
    appId := "unique-app-identifier" // string | The app's ID or UID
    applicationIn := *openapiclient.NewApplicationIn("My first application") // ApplicationIn | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ApplicationApi.V1ApplicationUpdate(context.Background(), appId).ApplicationIn(applicationIn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.V1ApplicationUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ApplicationUpdate`: ApplicationOut
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.V1ApplicationUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1ApplicationUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **applicationIn** | [**ApplicationIn**](ApplicationIn.md) |  | 

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

