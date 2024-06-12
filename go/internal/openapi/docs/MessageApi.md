# \MessageApi

All URIs are relative to *https://api.eu.xwebhook.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateMessageAttemptForEndpoint**](MessageApi.md#CreateMessageAttemptForEndpoint) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/test-attempt | Create Message Attempt For Endpoint
[**V1MessageCreate**](MessageApi.md#V1MessageCreate) | **Post** /api/v1/app/{app_id}/msg | Create Message
[**V1MessageExpungeContent**](MessageApi.md#V1MessageExpungeContent) | **Delete** /api/v1/app/{app_id}/msg/{msg_id}/content | Delete message payload
[**V1MessageGet**](MessageApi.md#V1MessageGet) | **Get** /api/v1/app/{app_id}/msg/{msg_id} | Get Message
[**V1MessageGetRawPayload**](MessageApi.md#V1MessageGetRawPayload) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/raw | Get Raw Message Payload
[**V1MessageList**](MessageApi.md#V1MessageList) | **Get** /api/v1/app/{app_id}/msg | List Messages
[**V1MessageStream**](MessageApi.md#V1MessageStream) | **Get** /api/v1/app/{app_id}/events | Stream Events



## CreateMessageAttemptForEndpoint

> MessageAttemptOut CreateMessageAttemptForEndpoint(ctx, appId, endpointId).MessageIn(messageIn).IdempotencyKey(idempotencyKey).Execute()

Create Message Attempt For Endpoint



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
    messageIn := *openapiclient.NewMessageIn("user.signup", map[string]interface{}({"email":"test@example.com","type":"user.created","username":"test_user"})) // MessageIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageApi.CreateMessageAttemptForEndpoint(context.Background(), appId, endpointId).MessageIn(messageIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.CreateMessageAttemptForEndpoint``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateMessageAttemptForEndpoint`: MessageAttemptOut
    fmt.Fprintf(os.Stdout, "Response from `MessageApi.CreateMessageAttemptForEndpoint`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateMessageAttemptForEndpointRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **messageIn** | [**MessageIn**](MessageIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**MessageAttemptOut**](MessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageCreate

> MessageOut V1MessageCreate(ctx, appId).MessageIn(messageIn).WithContent(withContent).IdempotencyKey(idempotencyKey).Execute()

Create Message



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
    messageIn := *openapiclient.NewMessageIn("user.signup", map[string]interface{}({"email":"test@example.com","type":"user.created","username":"test_user"})) // MessageIn | 
    withContent := true // bool | When `true` message payloads are included in the response (optional) (default to true)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageApi.V1MessageCreate(context.Background(), appId).MessageIn(messageIn).WithContent(withContent).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.V1MessageCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageCreate`: MessageOut
    fmt.Fprintf(os.Stdout, "Response from `MessageApi.V1MessageCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **messageIn** | [**MessageIn**](MessageIn.md) |  | 
 **withContent** | **bool** | When &#x60;true&#x60; message payloads are included in the response | [default to true]
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


## V1MessageExpungeContent

> V1MessageExpungeContent(ctx, appId, msgId).Execute()

Delete message payload



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
    msgId := "unique-msg-identifier" // string | The msg's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageApi.V1MessageExpungeContent(context.Background(), appId, msgId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.V1MessageExpungeContent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**msgId** | **string** | The msg&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageExpungeContentRequest struct via the builder pattern


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


## V1MessageGet

> MessageOut V1MessageGet(ctx, appId, msgId).WithContent(withContent).Execute()

Get Message



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
    msgId := "unique-msg-identifier" // string | The msg's ID or UID
    withContent := true // bool | When `true` message payloads are included in the response (optional) (default to true)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageApi.V1MessageGet(context.Background(), appId, msgId).WithContent(withContent).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.V1MessageGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageGet`: MessageOut
    fmt.Fprintf(os.Stdout, "Response from `MessageApi.V1MessageGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**msgId** | **string** | The msg&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **withContent** | **bool** | When &#x60;true&#x60; message payloads are included in the response | [default to true]

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageGetRawPayload

> MessageRawPayloadOut V1MessageGetRawPayload(ctx, appId, msgId).Execute()

Get Raw Message Payload



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
    msgId := "unique-msg-identifier" // string | The msg's ID or UID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageApi.V1MessageGetRawPayload(context.Background(), appId, msgId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.V1MessageGetRawPayload``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageGetRawPayload`: MessageRawPayloadOut
    fmt.Fprintf(os.Stdout, "Response from `MessageApi.V1MessageGetRawPayload`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**msgId** | **string** | The msg&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageGetRawPayloadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**MessageRawPayloadOut**](MessageRawPayloadOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageList

> ListResponseMessageOut V1MessageList(ctx, appId).Limit(limit).Iterator(iterator).Channel(channel).Before(before).After(after).WithContent(withContent).Tag(tag).EventTypes(eventTypes).Execute()

List Messages



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
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)
    channel := "project_1337" // string | Filter response based on the channel (optional)
    before := time.Now() // time.Time | Only include items created before a certain date (optional)
    after := time.Now() // time.Time | Only include items created after a certain date (optional)
    withContent := true // bool | When `true` message payloads are included in the response (optional) (default to true)
    tag := "project_1337" // string | Filter messages matching the provided tag (optional)
    eventTypes := []string{"user.signup"} // []string | Filter response based on the event type (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageApi.V1MessageList(context.Background(), appId).Limit(limit).Iterator(iterator).Channel(channel).Before(before).After(after).WithContent(withContent).Tag(tag).EventTypes(eventTypes).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.V1MessageList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageList`: ListResponseMessageOut
    fmt.Fprintf(os.Stdout, "Response from `MessageApi.V1MessageList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **channel** | **string** | Filter response based on the channel | 
 **before** | **time.Time** | Only include items created before a certain date | 
 **after** | **time.Time** | Only include items created after a certain date | 
 **withContent** | **bool** | When &#x60;true&#x60; message payloads are included in the response | [default to true]
 **tag** | **string** | Filter messages matching the provided tag | 
 **eventTypes** | **[]string** | Filter response based on the event type | 

### Return type

[**ListResponseMessageOut**](ListResponseMessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageStream

> MessageStreamOut V1MessageStream(ctx, appId).Limit(limit).Iterator(iterator).EventTypes(eventTypes).Channels(channels).After(after).Execute()

Stream Events



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
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "iterator_example" // string | The iterator returned from a prior invocation (optional)
    eventTypes := []string{"user.signup"} // []string | Filter response based on the event type (optional)
    channels := []string{"project_1337"} // []string | Filter response based on the event type (optional)
    after := time.Now() // time.Time |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageApi.V1MessageStream(context.Background(), appId).Limit(limit).Iterator(iterator).EventTypes(eventTypes).Channels(channels).After(after).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.V1MessageStream``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageStream`: MessageStreamOut
    fmt.Fprintf(os.Stdout, "Response from `MessageApi.V1MessageStream`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageStreamRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **eventTypes** | **[]string** | Filter response based on the event type | 
 **channels** | **[]string** | Filter response based on the event type | 
 **after** | **time.Time** |  | 

### Return type

[**MessageStreamOut**](MessageStreamOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

