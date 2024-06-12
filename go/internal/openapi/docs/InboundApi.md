# \InboundApi

All URIs are relative to *https://api.eu.xwebhook.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1InboundMsg**](InboundApi.md#V1InboundMsg) | **Post** /api/v1/app/{app_id}/inbound/msg/{inbound_token} | Handle Inbound
[**V1InboundRotateUrl**](InboundApi.md#V1InboundRotateUrl) | **Post** /api/v1/app/{app_id}/inbound/rotate-url | Rotate Url



## V1InboundMsg

> MessageOut V1InboundMsg(ctx, appId, inboundToken).Body(body).EventType(eventType).IdempotencyKey(idempotencyKey).Execute()

Handle Inbound



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
    inboundToken := "inboundToken_example" // string | 
    body := "body_example" // string | 
    eventType := "user.signup" // string | The event type's name (optional)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.InboundApi.V1InboundMsg(context.Background(), appId, inboundToken).Body(body).EventType(eventType).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InboundApi.V1InboundMsg``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1InboundMsg`: MessageOut
    fmt.Fprintf(os.Stdout, "Response from `InboundApi.V1InboundMsg`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**inboundToken** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1InboundMsgRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **body** | **string** |  | 
 **eventType** | **string** | The event type&#39;s name | 
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


## V1InboundRotateUrl

> RotatedUrlOut V1InboundRotateUrl(ctx, appId).IdempotencyKey(idempotencyKey).Execute()

Rotate Url



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
    resp, r, err := api_client.InboundApi.V1InboundRotateUrl(context.Background(), appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InboundApi.V1InboundRotateUrl``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1InboundRotateUrl`: RotatedUrlOut
    fmt.Fprintf(os.Stdout, "Response from `InboundApi.V1InboundRotateUrl`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1InboundRotateUrlRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**RotatedUrlOut**](RotatedUrlOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

