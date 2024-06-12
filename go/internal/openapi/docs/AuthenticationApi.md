# \AuthenticationApi

All URIs are relative to *https://api.eu.xwebhook.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1AuthenticationAppPortalAccess**](AuthenticationApi.md#V1AuthenticationAppPortalAccess) | **Post** /api/v1/auth/app-portal-access/{app_id} | Get Consumer App Portal Access
[**V1AuthenticationDashboardAccess**](AuthenticationApi.md#V1AuthenticationDashboardAccess) | **Post** /api/v1/auth/dashboard-access/{app_id} | Dashboard Access
[**V1AuthenticationExchangeOneTimeToken**](AuthenticationApi.md#V1AuthenticationExchangeOneTimeToken) | **Post** /api/v1/auth/one-time-token | Exchange One Time Token
[**V1AuthenticationExpireAll**](AuthenticationApi.md#V1AuthenticationExpireAll) | **Post** /api/v1/auth/app/{app_id}/expire-all | Expire All
[**V1AuthenticationLogout**](AuthenticationApi.md#V1AuthenticationLogout) | **Post** /api/v1/auth/logout | Logout



## V1AuthenticationAppPortalAccess

> AppPortalAccessOut V1AuthenticationAppPortalAccess(ctx, appId).AppPortalAccessIn(appPortalAccessIn).IdempotencyKey(idempotencyKey).Execute()

Get Consumer App Portal Access



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
    appPortalAccessIn := *openapiclient.NewAppPortalAccessIn() // AppPortalAccessIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.AuthenticationApi.V1AuthenticationAppPortalAccess(context.Background(), appId).AppPortalAccessIn(appPortalAccessIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.V1AuthenticationAppPortalAccess``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1AuthenticationAppPortalAccess`: AppPortalAccessOut
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.V1AuthenticationAppPortalAccess`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1AuthenticationAppPortalAccessRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **appPortalAccessIn** | [**AppPortalAccessIn**](AppPortalAccessIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**AppPortalAccessOut**](AppPortalAccessOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1AuthenticationDashboardAccess

> DashboardAccessOut V1AuthenticationDashboardAccess(ctx, appId).IdempotencyKey(idempotencyKey).Execute()

Dashboard Access



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
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.AuthenticationApi.V1AuthenticationDashboardAccess(context.Background(), appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.V1AuthenticationDashboardAccess``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1AuthenticationDashboardAccess`: DashboardAccessOut
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.V1AuthenticationDashboardAccess`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1AuthenticationDashboardAccessRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**DashboardAccessOut**](DashboardAccessOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1AuthenticationExchangeOneTimeToken

> OneTimeTokenOut V1AuthenticationExchangeOneTimeToken(ctx).OneTimeTokenIn(oneTimeTokenIn).IdempotencyKey(idempotencyKey).Execute()

Exchange One Time Token



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
    oneTimeTokenIn := *openapiclient.NewOneTimeTokenIn("OneTimeToken_example") // OneTimeTokenIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.AuthenticationApi.V1AuthenticationExchangeOneTimeToken(context.Background()).OneTimeTokenIn(oneTimeTokenIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.V1AuthenticationExchangeOneTimeToken``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1AuthenticationExchangeOneTimeToken`: OneTimeTokenOut
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.V1AuthenticationExchangeOneTimeToken`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1AuthenticationExchangeOneTimeTokenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oneTimeTokenIn** | [**OneTimeTokenIn**](OneTimeTokenIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**OneTimeTokenOut**](OneTimeTokenOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1AuthenticationExpireAll

> V1AuthenticationExpireAll(ctx, appId).ApplicationTokenExpireIn(applicationTokenExpireIn).IdempotencyKey(idempotencyKey).Execute()

Expire All



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
    applicationTokenExpireIn := *openapiclient.NewApplicationTokenExpireIn() // ApplicationTokenExpireIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.AuthenticationApi.V1AuthenticationExpireAll(context.Background(), appId).ApplicationTokenExpireIn(applicationTokenExpireIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.V1AuthenticationExpireAll``: %v\n", err)
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

Other parameters are passed through a pointer to a apiV1AuthenticationExpireAllRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **applicationTokenExpireIn** | [**ApplicationTokenExpireIn**](ApplicationTokenExpireIn.md) |  | 
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


## V1AuthenticationLogout

> V1AuthenticationLogout(ctx).IdempotencyKey(idempotencyKey).Execute()

Logout



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
    resp, r, err := api_client.AuthenticationApi.V1AuthenticationLogout(context.Background()).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.V1AuthenticationLogout``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1AuthenticationLogoutRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

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

