# \BroadcastApi

All URIs are relative to *https://api.eu.xwebhook.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateBroadcastMessage**](BroadcastApi.md#CreateBroadcastMessage) | **Post** /api/v1/msg/broadcast | Create Broadcast Message



## CreateBroadcastMessage

> MessageBroadcastOut CreateBroadcastMessage(ctx).MessageBroadcastIn(messageBroadcastIn).IdempotencyKey(idempotencyKey).Execute()

Create Broadcast Message



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
    messageBroadcastIn := *openapiclient.NewMessageBroadcastIn("user.signup", map[string]interface{}({"email":"test@example.com","type":"user.created","username":"test_user"})) // MessageBroadcastIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.BroadcastApi.CreateBroadcastMessage(context.Background()).MessageBroadcastIn(messageBroadcastIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BroadcastApi.CreateBroadcastMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateBroadcastMessage`: MessageBroadcastOut
    fmt.Fprintf(os.Stdout, "Response from `BroadcastApi.CreateBroadcastMessage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateBroadcastMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageBroadcastIn** | [**MessageBroadcastIn**](MessageBroadcastIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**MessageBroadcastOut**](MessageBroadcastOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

