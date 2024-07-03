# \EndpointApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1EndpointCreate**](EndpointApi.md#V1EndpointCreate) | **Post** /api/v1/app/{app_id}/endpoint | Create Endpoint
[**V1EndpointDelete**](EndpointApi.md#V1EndpointDelete) | **Delete** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Delete Endpoint
[**V1EndpointDeleteMtlsConfig**](EndpointApi.md#V1EndpointDeleteMtlsConfig) | **Delete** /api/v1/app/{app_id}/endpoint/{endpoint_id}/mtls | Delete Endpoint Mtls Config
[**V1EndpointDeleteOauthConfig**](EndpointApi.md#V1EndpointDeleteOauthConfig) | **Delete** /api/v1/app/{app_id}/endpoint/{endpoint_id}/oauth | Delete Endpoint Oauth Config
[**V1EndpointGet**](EndpointApi.md#V1EndpointGet) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Get Endpoint
[**V1EndpointGetHeaders**](EndpointApi.md#V1EndpointGetHeaders) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Get Endpoint Headers
[**V1EndpointGetSecret**](EndpointApi.md#V1EndpointGetSecret) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret | Get Endpoint Secret
[**V1EndpointGetStats**](EndpointApi.md#V1EndpointGetStats) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats | Endpoint Stats
[**V1EndpointList**](EndpointApi.md#V1EndpointList) | **Get** /api/v1/app/{app_id}/endpoint | List Endpoints
[**V1EndpointPatch**](EndpointApi.md#V1EndpointPatch) | **Patch** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Patch Endpoint
[**V1EndpointPatchHeaders**](EndpointApi.md#V1EndpointPatchHeaders) | **Patch** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Patch Endpoint Headers
[**V1EndpointRecover**](EndpointApi.md#V1EndpointRecover) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover | Recover Failed Webhooks
[**V1EndpointReplay**](EndpointApi.md#V1EndpointReplay) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing | Replay Missing Webhooks
[**V1EndpointRotateSecret**](EndpointApi.md#V1EndpointRotateSecret) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate | Rotate Endpoint Secret
[**V1EndpointSendExample**](EndpointApi.md#V1EndpointSendExample) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/send-example | Send Event Type Example Message
[**V1EndpointTransformationGet**](EndpointApi.md#V1EndpointTransformationGet) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Get Endpoint Transformation
[**V1EndpointTransformationPartialUpdate**](EndpointApi.md#V1EndpointTransformationPartialUpdate) | **Patch** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Set Endpoint Transformation
[**V1EndpointTransformationSimulate**](EndpointApi.md#V1EndpointTransformationSimulate) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation/simulate | Simulate
[**V1EndpointUpdate**](EndpointApi.md#V1EndpointUpdate) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Update Endpoint
[**V1EndpointUpdateHeaders**](EndpointApi.md#V1EndpointUpdateHeaders) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Update Endpoint Headers
[**V1EndpointUpdateMtlsConfig**](EndpointApi.md#V1EndpointUpdateMtlsConfig) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/mtls | Update Endpoint Mtls Config
[**V1EndpointUpdateOauthConfig**](EndpointApi.md#V1EndpointUpdateOauthConfig) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/oauth | Update Endpoint Oauth Config



## V1EndpointCreate

> EndpointOut V1EndpointCreate(ctx, appId).EndpointIn(endpointIn).IdempotencyKey(idempotencyKey).Execute()

Create Endpoint



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
    endpointIn := *openapiclient.NewEndpointIn("https://example.com/webhook/") // EndpointIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointCreate(context.Background(), appId).EndpointIn(endpointIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointCreate`: EndpointOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **endpointIn** | [**EndpointIn**](EndpointIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointDelete

> V1EndpointDelete(ctx, appId, endpointId).Execute()

Delete Endpoint



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointDelete(context.Background(), appId, endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointDeleteRequest struct via the builder pattern


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


## V1EndpointDeleteMtlsConfig

> V1EndpointDeleteMtlsConfig(ctx, appId, endpointId).Execute()

Delete Endpoint Mtls Config



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointDeleteMtlsConfig(context.Background(), appId, endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointDeleteMtlsConfig``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointDeleteMtlsConfigRequest struct via the builder pattern


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


## V1EndpointDeleteOauthConfig

> V1EndpointDeleteOauthConfig(ctx, appId, endpointId).Execute()

Delete Endpoint Oauth Config



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointDeleteOauthConfig(context.Background(), appId, endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointDeleteOauthConfig``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointDeleteOauthConfigRequest struct via the builder pattern


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


## V1EndpointGet

> EndpointOut V1EndpointGet(ctx, appId, endpointId).Execute()

Get Endpoint



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointGet(context.Background(), appId, endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointGet`: EndpointOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointGetHeaders

> EndpointHeadersOut V1EndpointGetHeaders(ctx, appId, endpointId).Execute()

Get Endpoint Headers



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointGetHeaders(context.Background(), appId, endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointGetHeaders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointGetHeaders`: EndpointHeadersOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointGetHeaders`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointGetHeadersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**EndpointHeadersOut**](EndpointHeadersOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointGetSecret

> EndpointSecretOut V1EndpointGetSecret(ctx, appId, endpointId).Execute()

Get Endpoint Secret



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointGetSecret(context.Background(), appId, endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointGetSecret``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointGetSecret`: EndpointSecretOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointGetSecret`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointGetSecretRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**EndpointSecretOut**](EndpointSecretOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointGetStats

> EndpointStats V1EndpointGetStats(ctx, appId, endpointId).Since(since).Until(until).Execute()

Endpoint Stats



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
    since := time.Now() // time.Time | Filter the range to data starting from this date (optional)
    until := time.Now() // time.Time | Filter the range to data ending by this date (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointGetStats(context.Background(), appId, endpointId).Since(since).Until(until).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointGetStats``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointGetStats`: EndpointStats
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointGetStats`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointGetStatsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **since** | **time.Time** | Filter the range to data starting from this date | 
 **until** | **time.Time** | Filter the range to data ending by this date | 

### Return type

[**EndpointStats**](EndpointStats.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointList

> ListResponseEndpointOut V1EndpointList(ctx, appId).Limit(limit).Iterator(iterator).Order(order).Execute()

List Endpoints



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
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)
    order := openapiclient.Ordering("ascending") // Ordering | The sorting order of the returned items (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointList(context.Background(), appId).Limit(limit).Iterator(iterator).Order(order).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointList`: ListResponseEndpointOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **order** | [**Ordering**](Ordering.md) | The sorting order of the returned items | 

### Return type

[**ListResponseEndpointOut**](ListResponseEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointPatch

> EndpointOut V1EndpointPatch(ctx, appId, endpointId).EndpointPatch(endpointPatch).Execute()

Patch Endpoint



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    endpointPatch := *openapiclient.NewEndpointPatch() // EndpointPatch | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointPatch(context.Background(), appId, endpointId).EndpointPatch(endpointPatch).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointPatch``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointPatch`: EndpointOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointPatch`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointPatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointPatch** | [**EndpointPatch**](EndpointPatch.md) |  | 

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointPatchHeaders

> V1EndpointPatchHeaders(ctx, appId, endpointId).EndpointHeadersPatchIn(endpointHeadersPatchIn).Execute()

Patch Endpoint Headers



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    endpointHeadersPatchIn := *openapiclient.NewEndpointHeadersPatchIn(map[string]string{"key": "Inner_example"}) // EndpointHeadersPatchIn | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointPatchHeaders(context.Background(), appId, endpointId).EndpointHeadersPatchIn(endpointHeadersPatchIn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointPatchHeaders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointPatchHeadersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointHeadersPatchIn** | [**EndpointHeadersPatchIn**](EndpointHeadersPatchIn.md) |  | 

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointRecover

> RecoverOut V1EndpointRecover(ctx, appId, endpointId).RecoverIn(recoverIn).IdempotencyKey(idempotencyKey).Execute()

Recover Failed Webhooks



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
    recoverIn := *openapiclient.NewRecoverIn(time.Now()) // RecoverIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointRecover(context.Background(), appId, endpointId).RecoverIn(recoverIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointRecover``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointRecover`: RecoverOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointRecover`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointRecoverRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **recoverIn** | [**RecoverIn**](RecoverIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**RecoverOut**](RecoverOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointReplay

> ReplayOut V1EndpointReplay(ctx, appId, endpointId).ReplayIn(replayIn).IdempotencyKey(idempotencyKey).Execute()

Replay Missing Webhooks



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
    replayIn := *openapiclient.NewReplayIn(time.Now()) // ReplayIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointReplay(context.Background(), appId, endpointId).ReplayIn(replayIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointReplay``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointReplay`: ReplayOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointReplay`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointReplayRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **replayIn** | [**ReplayIn**](ReplayIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ReplayOut**](ReplayOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointRotateSecret

> V1EndpointRotateSecret(ctx, appId, endpointId).EndpointSecretRotateIn(endpointSecretRotateIn).IdempotencyKey(idempotencyKey).Execute()

Rotate Endpoint Secret



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    endpointSecretRotateIn := *openapiclient.NewEndpointSecretRotateIn() // EndpointSecretRotateIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointRotateSecret(context.Background(), appId, endpointId).EndpointSecretRotateIn(endpointSecretRotateIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointRotateSecret``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointRotateSecretRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointSecretRotateIn** | [**EndpointSecretRotateIn**](EndpointSecretRotateIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointSendExample

> MessageOut V1EndpointSendExample(ctx, appId, endpointId).EventExampleIn(eventExampleIn).IdempotencyKey(idempotencyKey).Execute()

Send Event Type Example Message



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    eventExampleIn := *openapiclient.NewEventExampleIn("user.signup") // EventExampleIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointSendExample(context.Background(), appId, endpointId).EventExampleIn(eventExampleIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointSendExample``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointSendExample`: MessageOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointSendExample`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointSendExampleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **eventExampleIn** | [**EventExampleIn**](EventExampleIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointTransformationGet

> EndpointTransformationOut V1EndpointTransformationGet(ctx, appId, endpointId).Execute()

Get Endpoint Transformation



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointTransformationGet(context.Background(), appId, endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointTransformationGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointTransformationGet`: EndpointTransformationOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointTransformationGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointTransformationGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**EndpointTransformationOut**](EndpointTransformationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointTransformationPartialUpdate

> V1EndpointTransformationPartialUpdate(ctx, appId, endpointId).EndpointTransformationIn(endpointTransformationIn).Execute()

Set Endpoint Transformation



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    endpointTransformationIn := *openapiclient.NewEndpointTransformationIn() // EndpointTransformationIn | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointTransformationPartialUpdate(context.Background(), appId, endpointId).EndpointTransformationIn(endpointTransformationIn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointTransformationPartialUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointTransformationPartialUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointTransformationIn** | [**EndpointTransformationIn**](EndpointTransformationIn.md) |  | 

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointTransformationSimulate

> EndpointTransformationSimulateOut V1EndpointTransformationSimulate(ctx, appId, endpointId).EndpointTransformationSimulateIn(endpointTransformationSimulateIn).IdempotencyKey(idempotencyKey).Execute()

Simulate



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    endpointTransformationSimulateIn := *openapiclient.NewEndpointTransformationSimulateIn("Code_example", "user.signup", map[string]interface{}(123)) // EndpointTransformationSimulateIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointTransformationSimulate(context.Background(), appId, endpointId).EndpointTransformationSimulateIn(endpointTransformationSimulateIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointTransformationSimulate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointTransformationSimulate`: EndpointTransformationSimulateOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointTransformationSimulate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointTransformationSimulateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointTransformationSimulateIn** | [**EndpointTransformationSimulateIn**](EndpointTransformationSimulateIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EndpointTransformationSimulateOut**](EndpointTransformationSimulateOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointUpdate

> EndpointOut V1EndpointUpdate(ctx, appId, endpointId).EndpointUpdate(endpointUpdate).Execute()

Update Endpoint



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    endpointUpdate := *openapiclient.NewEndpointUpdate("https://example.com/webhook/") // EndpointUpdate | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointUpdate(context.Background(), appId, endpointId).EndpointUpdate(endpointUpdate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EndpointUpdate`: EndpointOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.V1EndpointUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointUpdate** | [**EndpointUpdate**](EndpointUpdate.md) |  | 

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointUpdateHeaders

> V1EndpointUpdateHeaders(ctx, appId, endpointId).EndpointHeadersIn(endpointHeadersIn).Execute()

Update Endpoint Headers



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    endpointHeadersIn := *openapiclient.NewEndpointHeadersIn(map[string]string{"key": "Inner_example"}) // EndpointHeadersIn | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointUpdateHeaders(context.Background(), appId, endpointId).EndpointHeadersIn(endpointHeadersIn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointUpdateHeaders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointUpdateHeadersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointHeadersIn** | [**EndpointHeadersIn**](EndpointHeadersIn.md) |  | 

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointUpdateMtlsConfig

> V1EndpointUpdateMtlsConfig(ctx, appId, endpointId).EndpointMtlsConfigIn(endpointMtlsConfigIn).Execute()

Update Endpoint Mtls Config



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    endpointMtlsConfigIn := *openapiclient.NewEndpointMtlsConfigIn("CaCert_example", "Identity_example") // EndpointMtlsConfigIn | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointUpdateMtlsConfig(context.Background(), appId, endpointId).EndpointMtlsConfigIn(endpointMtlsConfigIn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointUpdateMtlsConfig``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointUpdateMtlsConfigRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointMtlsConfigIn** | [**EndpointMtlsConfigIn**](EndpointMtlsConfigIn.md) |  | 

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EndpointUpdateOauthConfig

> V1EndpointUpdateOauthConfig(ctx, appId, endpointId).EndpointOauthConfigIn(endpointOauthConfigIn).Execute()

Update Endpoint Oauth Config



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    endpointOauthConfigIn := *openapiclient.NewEndpointOauthConfigIn(openapiclient.Oauth2AuthMethodIn("clientSecretJwt"), "ClientId_example", openapiclient.Oauth2GrantTypeIn("clientCredentials"), "TokenUrl_example") // EndpointOauthConfigIn | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EndpointApi.V1EndpointUpdateOauthConfig(context.Background(), appId, endpointId).EndpointOauthConfigIn(endpointOauthConfigIn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.V1EndpointUpdateOauthConfig``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EndpointUpdateOauthConfigRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointOauthConfigIn** | [**EndpointOauthConfigIn**](EndpointOauthConfigIn.md) |  | 

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

