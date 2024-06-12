# \StatisticsApi

All URIs are relative to *https://api.eu.xwebhook.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1StatisticsAggregateAppStats**](StatisticsApi.md#V1StatisticsAggregateAppStats) | **Post** /api/v1/stats/usage/app | Aggregate App Stats
[**V1StatisticsAggregateEventTypes**](StatisticsApi.md#V1StatisticsAggregateEventTypes) | **Put** /api/v1/stats/usage/event-types | Aggregate Event Types
[**V1StatsAppAttempts**](StatisticsApi.md#V1StatsAppAttempts) | **Get** /api/v1/stats/app/{app_id}/attempt | Get App Attempt Stats
[**V1StatsEndpointAttempts**](StatisticsApi.md#V1StatsEndpointAttempts) | **Get** /api/v1/stats/app/{app_id}/ep/{endpoint_id}/attempt | Get Ep Stats



## V1StatisticsAggregateAppStats

> AppUsageStatsOut V1StatisticsAggregateAppStats(ctx).AppUsageStatsIn(appUsageStatsIn).IdempotencyKey(idempotencyKey).Execute()

Aggregate App Stats



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
    appUsageStatsIn := *openapiclient.NewAppUsageStatsIn(time.Now(), time.Now()) // AppUsageStatsIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StatisticsApi.V1StatisticsAggregateAppStats(context.Background()).AppUsageStatsIn(appUsageStatsIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StatisticsApi.V1StatisticsAggregateAppStats``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1StatisticsAggregateAppStats`: AppUsageStatsOut
    fmt.Fprintf(os.Stdout, "Response from `StatisticsApi.V1StatisticsAggregateAppStats`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1StatisticsAggregateAppStatsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appUsageStatsIn** | [**AppUsageStatsIn**](AppUsageStatsIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**AppUsageStatsOut**](AppUsageStatsOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1StatisticsAggregateEventTypes

> AggregateEventTypesOut V1StatisticsAggregateEventTypes(ctx).Execute()

Aggregate Event Types



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

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StatisticsApi.V1StatisticsAggregateEventTypes(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StatisticsApi.V1StatisticsAggregateEventTypes``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1StatisticsAggregateEventTypes`: AggregateEventTypesOut
    fmt.Fprintf(os.Stdout, "Response from `StatisticsApi.V1StatisticsAggregateEventTypes`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiV1StatisticsAggregateEventTypesRequest struct via the builder pattern


### Return type

[**AggregateEventTypesOut**](AggregateEventTypesOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1StatsAppAttempts

> AttemptStatisticsResponse V1StatsAppAttempts(ctx, appId).StartDate(startDate).EndDate(endDate).Execute()

Get App Attempt Stats



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
    appId := "unique-app-identifier" // string | The app's ID or UID
    startDate := time.Now() // time.Time | Filter the range to data starting from this date (optional)
    endDate := time.Now() // time.Time | Filter the range to data ending by this date (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StatisticsApi.V1StatsAppAttempts(context.Background(), appId).StartDate(startDate).EndDate(endDate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StatisticsApi.V1StatsAppAttempts``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1StatsAppAttempts`: AttemptStatisticsResponse
    fmt.Fprintf(os.Stdout, "Response from `StatisticsApi.V1StatsAppAttempts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1StatsAppAttemptsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startDate** | **time.Time** | Filter the range to data starting from this date | 
 **endDate** | **time.Time** | Filter the range to data ending by this date | 

### Return type

[**AttemptStatisticsResponse**](AttemptStatisticsResponse.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1StatsEndpointAttempts

> AttemptStatisticsResponse V1StatsEndpointAttempts(ctx, appId, endpointId).StartDate(startDate).EndDate(endDate).Execute()

Get Ep Stats



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
    appId := "unique-app-identifier" // string | The app's ID or UID
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    startDate := time.Now() // time.Time | Filter the range to data starting from this date (optional)
    endDate := time.Now() // time.Time | Filter the range to data ending by this date (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StatisticsApi.V1StatsEndpointAttempts(context.Background(), appId, endpointId).StartDate(startDate).EndDate(endDate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StatisticsApi.V1StatsEndpointAttempts``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1StatsEndpointAttempts`: AttemptStatisticsResponse
    fmt.Fprintf(os.Stdout, "Response from `StatisticsApi.V1StatsEndpointAttempts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1StatsEndpointAttemptsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **startDate** | **time.Time** | Filter the range to data starting from this date | 
 **endDate** | **time.Time** | Filter the range to data ending by this date | 

### Return type

[**AttemptStatisticsResponse**](AttemptStatisticsResponse.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

