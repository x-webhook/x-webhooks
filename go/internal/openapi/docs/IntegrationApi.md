# \IntegrationApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1IntegrationCreate**](IntegrationApi.md#V1IntegrationCreate) | **Post** /api/v1/app/{app_id}/integration | Create Integration
[**V1IntegrationDelete**](IntegrationApi.md#V1IntegrationDelete) | **Delete** /api/v1/app/{app_id}/integration/{integ_id} | Delete Integration
[**V1IntegrationGet**](IntegrationApi.md#V1IntegrationGet) | **Get** /api/v1/app/{app_id}/integration/{integ_id} | Get Integration
[**V1IntegrationGetKey**](IntegrationApi.md#V1IntegrationGetKey) | **Get** /api/v1/app/{app_id}/integration/{integ_id}/key | Get Integration Key
[**V1IntegrationList**](IntegrationApi.md#V1IntegrationList) | **Get** /api/v1/app/{app_id}/integration | List Integrations
[**V1IntegrationRotateKey**](IntegrationApi.md#V1IntegrationRotateKey) | **Post** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate | Rotate Integration Key
[**V1IntegrationUpdate**](IntegrationApi.md#V1IntegrationUpdate) | **Put** /api/v1/app/{app_id}/integration/{integ_id} | Update Integration



## V1IntegrationCreate

> IntegrationOut V1IntegrationCreate(ctx, appId).IntegrationIn(integrationIn).IdempotencyKey(idempotencyKey).Execute()

Create Integration



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
    integrationIn := *openapiclient.NewIntegrationIn("Example Integration") // IntegrationIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.IntegrationApi.V1IntegrationCreate(context.Background(), appId).IntegrationIn(integrationIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.V1IntegrationCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1IntegrationCreate`: IntegrationOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.V1IntegrationCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1IntegrationCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **integrationIn** | [**IntegrationIn**](IntegrationIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1IntegrationDelete

> V1IntegrationDelete(ctx, appId, integId).Execute()

Delete Integration



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The integ's ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.IntegrationApi.V1IntegrationDelete(context.Background(), appId, integId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.V1IntegrationDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**integId** | **string** | The integ&#39;s ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1IntegrationDeleteRequest struct via the builder pattern


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


## V1IntegrationGet

> IntegrationOut V1IntegrationGet(ctx, appId, integId).Execute()

Get Integration



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The integ's ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.IntegrationApi.V1IntegrationGet(context.Background(), appId, integId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.V1IntegrationGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1IntegrationGet`: IntegrationOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.V1IntegrationGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**integId** | **string** | The integ&#39;s ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1IntegrationGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1IntegrationGetKey

> IntegrationKeyOut V1IntegrationGetKey(ctx, appId, integId).Execute()

Get Integration Key



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The integ's ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.IntegrationApi.V1IntegrationGetKey(context.Background(), appId, integId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.V1IntegrationGetKey``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1IntegrationGetKey`: IntegrationKeyOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.V1IntegrationGetKey`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**integId** | **string** | The integ&#39;s ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1IntegrationGetKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1IntegrationList

> ListResponseIntegrationOut V1IntegrationList(ctx, appId).Limit(limit).Iterator(iterator).Order(order).Execute()

List Integrations



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
    iterator := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)
    order := openapiclient.Ordering("ascending") // Ordering | The sorting order of the returned items (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.IntegrationApi.V1IntegrationList(context.Background(), appId).Limit(limit).Iterator(iterator).Order(order).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.V1IntegrationList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1IntegrationList`: ListResponseIntegrationOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.V1IntegrationList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1IntegrationListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **order** | [**Ordering**](Ordering.md) | The sorting order of the returned items | 

### Return type

[**ListResponseIntegrationOut**](ListResponseIntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1IntegrationRotateKey

> IntegrationKeyOut V1IntegrationRotateKey(ctx, appId, integId).IdempotencyKey(idempotencyKey).Execute()

Rotate Integration Key



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The integ's ID
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.IntegrationApi.V1IntegrationRotateKey(context.Background(), appId, integId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.V1IntegrationRotateKey``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1IntegrationRotateKey`: IntegrationKeyOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.V1IntegrationRotateKey`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**integId** | **string** | The integ&#39;s ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1IntegrationRotateKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1IntegrationUpdate

> IntegrationOut V1IntegrationUpdate(ctx, appId, integId).IntegrationUpdate(integrationUpdate).Execute()

Update Integration



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The integ's ID
    integrationUpdate := *openapiclient.NewIntegrationUpdate("Example Integration") // IntegrationUpdate | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.IntegrationApi.V1IntegrationUpdate(context.Background(), appId, integId).IntegrationUpdate(integrationUpdate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.V1IntegrationUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1IntegrationUpdate`: IntegrationOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.V1IntegrationUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**integId** | **string** | The integ&#39;s ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1IntegrationUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **integrationUpdate** | [**IntegrationUpdate**](IntegrationUpdate.md) |  | 

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

