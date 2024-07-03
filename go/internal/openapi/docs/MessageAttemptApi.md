# \MessageAttemptApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1MessageAttemptExpungeContent**](MessageAttemptApi.md#V1MessageAttemptExpungeContent) | **Delete** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/content | Delete attempt response body
[**V1MessageAttemptGet**](MessageAttemptApi.md#V1MessageAttemptGet) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id} | Get Attempt
[**V1MessageAttemptGetHeaders**](MessageAttemptApi.md#V1MessageAttemptGetHeaders) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/headers | Get Attempt Headers
[**V1MessageAttemptListAttemptedDestinations**](MessageAttemptApi.md#V1MessageAttemptListAttemptedDestinations) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/endpoint | List Attempted Destinations
[**V1MessageAttemptListAttemptedMessages**](MessageAttemptApi.md#V1MessageAttemptListAttemptedMessages) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg | List Attempted Messages
[**V1MessageAttemptListByEndpoint**](MessageAttemptApi.md#V1MessageAttemptListByEndpoint) | **Get** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id} | List Attempts By Endpoint
[**V1MessageAttemptListByEndpointDeprecated**](MessageAttemptApi.md#V1MessageAttemptListByEndpointDeprecated) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt | List Attempts For Endpoint
[**V1MessageAttemptListByMsg**](MessageAttemptApi.md#V1MessageAttemptListByMsg) | **Get** /api/v1/app/{app_id}/attempt/msg/{msg_id} | List Attempts By Msg
[**V1MessageAttemptListByMsgDeprecated**](MessageAttemptApi.md#V1MessageAttemptListByMsgDeprecated) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/attempt | List Attempts
[**V1MessageAttemptResend**](MessageAttemptApi.md#V1MessageAttemptResend) | **Post** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend | Resend Webhook



## V1MessageAttemptExpungeContent

> V1MessageAttemptExpungeContent(ctx, appId, msgId, attemptId).Execute()

Delete attempt response body



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
    attemptId := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The attempt's ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptExpungeContent(context.Background(), appId, msgId, attemptId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptExpungeContent``: %v\n", err)
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
**attemptId** | **string** | The attempt&#39;s ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptExpungeContentRequest struct via the builder pattern


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


## V1MessageAttemptGet

> MessageAttemptOut V1MessageAttemptGet(ctx, appId, msgId, attemptId).Execute()

Get Attempt



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
    attemptId := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The attempt's ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptGet(context.Background(), appId, msgId, attemptId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageAttemptGet`: MessageAttemptOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.V1MessageAttemptGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**msgId** | **string** | The msg&#39;s ID or UID | 
**attemptId** | **string** | The attempt&#39;s ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

[**MessageAttemptOut**](MessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageAttemptGetHeaders

> MessageAttemptHeadersOut V1MessageAttemptGetHeaders(ctx, appId, msgId, attemptId).Execute()

Get Attempt Headers



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
    attemptId := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The attempt's ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptGetHeaders(context.Background(), appId, msgId, attemptId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptGetHeaders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageAttemptGetHeaders`: MessageAttemptHeadersOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.V1MessageAttemptGetHeaders`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**msgId** | **string** | The msg&#39;s ID or UID | 
**attemptId** | **string** | The attempt&#39;s ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptGetHeadersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

[**MessageAttemptHeadersOut**](MessageAttemptHeadersOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageAttemptListAttemptedDestinations

> ListResponseMessageEndpointOut V1MessageAttemptListAttemptedDestinations(ctx, appId, msgId).Limit(limit).Iterator(iterator).Execute()

List Attempted Destinations



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
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptListAttemptedDestinations(context.Background(), appId, msgId).Limit(limit).Iterator(iterator).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptListAttemptedDestinations``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageAttemptListAttemptedDestinations`: ListResponseMessageEndpointOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.V1MessageAttemptListAttemptedDestinations`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**msgId** | **string** | The msg&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptListAttemptedDestinationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 

### Return type

[**ListResponseMessageEndpointOut**](ListResponseMessageEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageAttemptListAttemptedMessages

> ListResponseEndpointMessageOut V1MessageAttemptListAttemptedMessages(ctx, appId, endpointId).Limit(limit).Iterator(iterator).Channel(channel).Tag(tag).Status(status).Before(before).After(after).WithContent(withContent).EventTypes(eventTypes).Execute()

List Attempted Messages



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
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)
    channel := "project_1337" // string | Filter response based on the channel (optional)
    tag := "project_1337" // string | Filter response based on the message tags (optional)
    status := openapiclient.MessageStatus(0) // MessageStatus | Filter response based on the delivery status (optional)
    before := time.Now() // time.Time | Only include items created before a certain date (optional)
    after := time.Now() // time.Time | Only include items created after a certain date (optional)
    withContent := true // bool | When `true` message payloads are included in the response (optional) (default to true)
    eventTypes := []string{"user.signup"} // []string | Filter response based on the event type (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptListAttemptedMessages(context.Background(), appId, endpointId).Limit(limit).Iterator(iterator).Channel(channel).Tag(tag).Status(status).Before(before).After(after).WithContent(withContent).EventTypes(eventTypes).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptListAttemptedMessages``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageAttemptListAttemptedMessages`: ListResponseEndpointMessageOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.V1MessageAttemptListAttemptedMessages`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptListAttemptedMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **channel** | **string** | Filter response based on the channel | 
 **tag** | **string** | Filter response based on the message tags | 
 **status** | [**MessageStatus**](MessageStatus.md) | Filter response based on the delivery status | 
 **before** | **time.Time** | Only include items created before a certain date | 
 **after** | **time.Time** | Only include items created after a certain date | 
 **withContent** | **bool** | When &#x60;true&#x60; message payloads are included in the response | [default to true]
 **eventTypes** | **[]string** | Filter response based on the event type | 

### Return type

[**ListResponseEndpointMessageOut**](ListResponseEndpointMessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageAttemptListByEndpoint

> ListResponseMessageAttemptOut V1MessageAttemptListByEndpoint(ctx, appId, endpointId).Limit(limit).Iterator(iterator).Status(status).StatusCodeClass(statusCodeClass).Channel(channel).Tag(tag).Before(before).After(after).WithContent(withContent).WithMsg(withMsg).EventTypes(eventTypes).Execute()

List Attempts By Endpoint



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
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)
    status := openapiclient.MessageStatus(0) // MessageStatus | Filter response based on the delivery status (optional)
    statusCodeClass := openapiclient.StatusCodeClass(0) // StatusCodeClass | Filter response based on the HTTP status code (optional)
    channel := "project_1337" // string | Filter response based on the channel (optional)
    tag := "project_1337" // string | Filter response based on the tag (optional)
    before := time.Now() // time.Time | Only include items created before a certain date (optional)
    after := time.Now() // time.Time | Only include items created after a certain date (optional)
    withContent := true // bool | When `true` attempt content is included in the response (optional) (default to true)
    withMsg := true // bool | When `true`, the message information is included in the response (optional) (default to false)
    eventTypes := []string{"user.signup"} // []string | Filter response based on the event type (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptListByEndpoint(context.Background(), appId, endpointId).Limit(limit).Iterator(iterator).Status(status).StatusCodeClass(statusCodeClass).Channel(channel).Tag(tag).Before(before).After(after).WithContent(withContent).WithMsg(withMsg).EventTypes(eventTypes).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptListByEndpoint``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageAttemptListByEndpoint`: ListResponseMessageAttemptOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.V1MessageAttemptListByEndpoint`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptListByEndpointRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **status** | [**MessageStatus**](MessageStatus.md) | Filter response based on the delivery status | 
 **statusCodeClass** | [**StatusCodeClass**](StatusCodeClass.md) | Filter response based on the HTTP status code | 
 **channel** | **string** | Filter response based on the channel | 
 **tag** | **string** | Filter response based on the tag | 
 **before** | **time.Time** | Only include items created before a certain date | 
 **after** | **time.Time** | Only include items created after a certain date | 
 **withContent** | **bool** | When &#x60;true&#x60; attempt content is included in the response | [default to true]
 **withMsg** | **bool** | When &#x60;true&#x60;, the message information is included in the response | [default to false]
 **eventTypes** | **[]string** | Filter response based on the event type | 

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageAttemptListByEndpointDeprecated

> ListResponseMessageAttemptEndpointOut V1MessageAttemptListByEndpointDeprecated(ctx, appId, msgId, endpointId).Limit(limit).Iterator(iterator).Channel(channel).Tag(tag).Status(status).Before(before).After(after).EventTypes(eventTypes).Execute()

List Attempts For Endpoint



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
    msgId := "unique-msg-identifier" // string | The msg's ID or UID
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)
    channel := "project_1337" // string | Filter response based on the channel (optional)
    tag := "project_1337" // string | Filter response based on the tag (optional)
    status := openapiclient.MessageStatus(0) // MessageStatus | Filter response based on the delivery status (optional)
    before := time.Now() // time.Time | Only include items created before a certain date (optional)
    after := time.Now() // time.Time | Only include items created after a certain date (optional)
    eventTypes := []string{"user.signup"} // []string | Filter response based on the event type (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptListByEndpointDeprecated(context.Background(), appId, msgId, endpointId).Limit(limit).Iterator(iterator).Channel(channel).Tag(tag).Status(status).Before(before).After(after).EventTypes(eventTypes).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptListByEndpointDeprecated``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageAttemptListByEndpointDeprecated`: ListResponseMessageAttemptEndpointOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.V1MessageAttemptListByEndpointDeprecated`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**msgId** | **string** | The msg&#39;s ID or UID | 
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptListByEndpointDeprecatedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **channel** | **string** | Filter response based on the channel | 
 **tag** | **string** | Filter response based on the tag | 
 **status** | [**MessageStatus**](MessageStatus.md) | Filter response based on the delivery status | 
 **before** | **time.Time** | Only include items created before a certain date | 
 **after** | **time.Time** | Only include items created after a certain date | 
 **eventTypes** | **[]string** | Filter response based on the event type | 

### Return type

[**ListResponseMessageAttemptEndpointOut**](ListResponseMessageAttemptEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageAttemptListByMsg

> ListResponseMessageAttemptOut V1MessageAttemptListByMsg(ctx, appId, msgId).Limit(limit).Iterator(iterator).Status(status).StatusCodeClass(statusCodeClass).Channel(channel).Tag(tag).EndpointId(endpointId).Before(before).After(after).WithContent(withContent).EventTypes(eventTypes).Execute()

List Attempts By Msg



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
    msgId := "unique-msg-identifier" // string | The msg's ID or UID
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)
    status := openapiclient.MessageStatus(0) // MessageStatus | Filter response based on the delivery status (optional)
    statusCodeClass := openapiclient.StatusCodeClass(0) // StatusCodeClass | Filter response based on the HTTP status code (optional)
    channel := "project_1337" // string | Filter response based on the channel (optional)
    tag := "project_1337" // string | Filter response based on the tag (optional)
    endpointId := "unique-ep-identifier" // string | Filter the attempts based on the attempted endpoint (optional)
    before := time.Now() // time.Time | Only include items created before a certain date (optional)
    after := time.Now() // time.Time | Only include items created after a certain date (optional)
    withContent := true // bool | When `true` attempt content is included in the response (optional) (default to true)
    eventTypes := []string{"user.signup"} // []string | Filter response based on the event type (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptListByMsg(context.Background(), appId, msgId).Limit(limit).Iterator(iterator).Status(status).StatusCodeClass(statusCodeClass).Channel(channel).Tag(tag).EndpointId(endpointId).Before(before).After(after).WithContent(withContent).EventTypes(eventTypes).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptListByMsg``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageAttemptListByMsg`: ListResponseMessageAttemptOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.V1MessageAttemptListByMsg`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**msgId** | **string** | The msg&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptListByMsgRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **status** | [**MessageStatus**](MessageStatus.md) | Filter response based on the delivery status | 
 **statusCodeClass** | [**StatusCodeClass**](StatusCodeClass.md) | Filter response based on the HTTP status code | 
 **channel** | **string** | Filter response based on the channel | 
 **tag** | **string** | Filter response based on the tag | 
 **endpointId** | **string** | Filter the attempts based on the attempted endpoint | 
 **before** | **time.Time** | Only include items created before a certain date | 
 **after** | **time.Time** | Only include items created after a certain date | 
 **withContent** | **bool** | When &#x60;true&#x60; attempt content is included in the response | [default to true]
 **eventTypes** | **[]string** | Filter response based on the event type | 

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageAttemptListByMsgDeprecated

> ListResponseMessageAttemptOut V1MessageAttemptListByMsgDeprecated(ctx, appId, msgId).Limit(limit).Iterator(iterator).EndpointId(endpointId).Channel(channel).Tag(tag).Status(status).Before(before).After(after).StatusCodeClass(statusCodeClass).EventTypes(eventTypes).Execute()

List Attempts



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
    msgId := "unique-msg-identifier" // string | The msg's ID or UID
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | The iterator returned from a prior invocation (optional)
    endpointId := "unique-ep-identifier" // string | Filter the attempts based on the attempted endpoint (optional)
    channel := "project_1337" // string | Filter response based on the channel (optional)
    tag := "project_1337" // string | Filter response based on the tag (optional)
    status := openapiclient.MessageStatus(0) // MessageStatus | Filter response based on the delivery status (optional)
    before := time.Now() // time.Time | Only include items created before a certain date (optional)
    after := time.Now() // time.Time | Only include items created after a certain date (optional)
    statusCodeClass := openapiclient.StatusCodeClass(0) // StatusCodeClass | Filter response based on the HTTP status code (optional)
    eventTypes := []string{"user.signup"} // []string | Filter response based on the event type (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptListByMsgDeprecated(context.Background(), appId, msgId).Limit(limit).Iterator(iterator).EndpointId(endpointId).Channel(channel).Tag(tag).Status(status).Before(before).After(after).StatusCodeClass(statusCodeClass).EventTypes(eventTypes).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptListByMsgDeprecated``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1MessageAttemptListByMsgDeprecated`: ListResponseMessageAttemptOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.V1MessageAttemptListByMsgDeprecated`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | The app&#39;s ID or UID | 
**msgId** | **string** | The msg&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptListByMsgDeprecatedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **endpointId** | **string** | Filter the attempts based on the attempted endpoint | 
 **channel** | **string** | Filter response based on the channel | 
 **tag** | **string** | Filter response based on the tag | 
 **status** | [**MessageStatus**](MessageStatus.md) | Filter response based on the delivery status | 
 **before** | **time.Time** | Only include items created before a certain date | 
 **after** | **time.Time** | Only include items created after a certain date | 
 **statusCodeClass** | [**StatusCodeClass**](StatusCodeClass.md) | Filter response based on the HTTP status code | 
 **eventTypes** | **[]string** | Filter response based on the event type | 

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1MessageAttemptResend

> V1MessageAttemptResend(ctx, appId, msgId, endpointId).IdempotencyKey(idempotencyKey).Execute()

Resend Webhook



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
    endpointId := "unique-ep-identifier" // string | The ep's ID or UID
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessageAttemptApi.V1MessageAttemptResend(context.Background(), appId, msgId, endpointId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.V1MessageAttemptResend``: %v\n", err)
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
**endpointId** | **string** | The ep&#39;s ID or UID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1MessageAttemptResendRequest struct via the builder pattern


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

