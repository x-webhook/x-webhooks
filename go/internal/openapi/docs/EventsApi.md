# \EventsApi

All URIs are relative to *https://api.eu.xwebhook.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1Events**](EventsApi.md#V1Events) | **Get** /api/v1/events | Events



## V1Events

> MessageStreamOut V1Events(ctx).Limit(limit).Iterator(iterator).EventTypes(eventTypes).Channels(channels).After(after).Execute()

Events



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
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "iterator_example" // string | The iterator returned from a prior invocation (optional)
    eventTypes := []string{"user.signup"} // []string | Filter response based on the event type (optional)
    channels := []string{"project_1337"} // []string | Filter response based on the event type (optional)
    after := time.Now() // time.Time |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventsApi.V1Events(context.Background()).Limit(limit).Iterator(iterator).EventTypes(eventTypes).Channels(channels).After(after).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventsApi.V1Events``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1Events`: MessageStreamOut
    fmt.Fprintf(os.Stdout, "Response from `EventsApi.V1Events`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1EventsRequest struct via the builder pattern


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

