# \EnvironmentApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1EnvironmentExport**](EnvironmentApi.md#V1EnvironmentExport) | **Post** /api/v1/environment/export | Export Environment Configuration
[**V1EnvironmentExportGet**](EnvironmentApi.md#V1EnvironmentExportGet) | **Get** /api/v1/environment/export | Export Environment Configuration
[**V1EnvironmentImport**](EnvironmentApi.md#V1EnvironmentImport) | **Post** /api/v1/environment/import | Import Environment Configuration



## V1EnvironmentExport

> EnvironmentOut V1EnvironmentExport(ctx).IdempotencyKey(idempotencyKey).Execute()

Export Environment Configuration



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
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EnvironmentApi.V1EnvironmentExport(context.Background()).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EnvironmentApi.V1EnvironmentExport``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EnvironmentExport`: EnvironmentOut
    fmt.Fprintf(os.Stdout, "Response from `EnvironmentApi.V1EnvironmentExport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1EnvironmentExportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EnvironmentOut**](EnvironmentOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EnvironmentExportGet

> EnvironmentOut V1EnvironmentExportGet(ctx).Execute()

Export Environment Configuration



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
    resp, r, err := api_client.EnvironmentApi.V1EnvironmentExportGet(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EnvironmentApi.V1EnvironmentExportGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EnvironmentExportGet`: EnvironmentOut
    fmt.Fprintf(os.Stdout, "Response from `EnvironmentApi.V1EnvironmentExportGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiV1EnvironmentExportGetRequest struct via the builder pattern


### Return type

[**EnvironmentOut**](EnvironmentOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EnvironmentImport

> V1EnvironmentImport(ctx).EnvironmentIn(environmentIn).IdempotencyKey(idempotencyKey).Execute()

Import Environment Configuration



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
    environmentIn := *openapiclient.NewEnvironmentIn(time.Now(), int32(123)) // EnvironmentIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EnvironmentApi.V1EnvironmentImport(context.Background()).EnvironmentIn(environmentIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EnvironmentApi.V1EnvironmentImport``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1EnvironmentImportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentIn** | [**EnvironmentIn**](EnvironmentIn.md) |  | 
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

