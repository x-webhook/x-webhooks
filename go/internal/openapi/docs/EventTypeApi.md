# \EventTypeApi

All URIs are relative to *https://api.eu.xwebhook.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1EventTypeCreate**](EventTypeApi.md#V1EventTypeCreate) | **Post** /api/v1/event-type | Create Event Type
[**V1EventTypeDelete**](EventTypeApi.md#V1EventTypeDelete) | **Delete** /api/v1/event-type/{event_type_name} | Delete Event Type
[**V1EventTypeExportOpenapi**](EventTypeApi.md#V1EventTypeExportOpenapi) | **Post** /api/v1/event-type/export/openapi | Event Type Export From Openapi
[**V1EventTypeGenerateExample**](EventTypeApi.md#V1EventTypeGenerateExample) | **Post** /api/v1/event-type/schema/generate-example | Generate Schema Example
[**V1EventTypeGet**](EventTypeApi.md#V1EventTypeGet) | **Get** /api/v1/event-type/{event_type_name} | Get Event Type
[**V1EventTypeGetRetrySchedule**](EventTypeApi.md#V1EventTypeGetRetrySchedule) | **Get** /api/v1/event-type/{event_type_name}/retry-schedule | Get Retry Schedule
[**V1EventTypeImportOpenapi**](EventTypeApi.md#V1EventTypeImportOpenapi) | **Post** /api/v1/event-type/import/openapi | Event Type Import From Openapi
[**V1EventTypeList**](EventTypeApi.md#V1EventTypeList) | **Get** /api/v1/event-type | List Event Types
[**V1EventTypePatch**](EventTypeApi.md#V1EventTypePatch) | **Patch** /api/v1/event-type/{event_type_name} | Patch Event Type
[**V1EventTypeUpdate**](EventTypeApi.md#V1EventTypeUpdate) | **Put** /api/v1/event-type/{event_type_name} | Update Event Type
[**V1EventTypeUpdateRetrySchedule**](EventTypeApi.md#V1EventTypeUpdateRetrySchedule) | **Put** /api/v1/event-type/{event_type_name}/retry-schedule | Update Retry Schedule



## V1EventTypeCreate

> EventTypeOut V1EventTypeCreate(ctx).EventTypeIn(eventTypeIn).IdempotencyKey(idempotencyKey).Execute()

Create Event Type



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
    eventTypeIn := *openapiclient.NewEventTypeIn("A user has signed up", "user.signup") // EventTypeIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypeCreate(context.Background()).EventTypeIn(eventTypeIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypeCreate`: EventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypeCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeIn** | [**EventTypeIn**](EventTypeIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EventTypeDelete

> V1EventTypeDelete(ctx, eventTypeName).Expunge(expunge).Execute()

Delete Event Type



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
    eventTypeName := "user.signup" // string | The event type's name
    expunge := true // bool | By default event types are archived when \"deleted\". Passing this to `true` deletes them entirely. (optional) (default to false)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypeDelete(context.Background(), eventTypeName).Expunge(expunge).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**eventTypeName** | **string** | The event type&#39;s name | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **expunge** | **bool** | By default event types are archived when \&quot;deleted\&quot;. Passing this to &#x60;true&#x60; deletes them entirely. | [default to false]

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


## V1EventTypeExportOpenapi

> ExportEventTypeOut V1EventTypeExportOpenapi(ctx).IdempotencyKey(idempotencyKey).Execute()

Event Type Export From Openapi



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
    resp, r, err := api_client.EventTypeApi.V1EventTypeExportOpenapi(context.Background()).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeExportOpenapi``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypeExportOpenapi`: ExportEventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypeExportOpenapi`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeExportOpenapiRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ExportEventTypeOut**](ExportEventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EventTypeGenerateExample

> EventTypeExampleOut V1EventTypeGenerateExample(ctx).EventTypeSchemaIn(eventTypeSchemaIn).IdempotencyKey(idempotencyKey).Execute()

Generate Schema Example



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
    eventTypeSchemaIn := *openapiclient.NewEventTypeSchemaIn(map[string]interface{}({"description":"An invoice was paid by a user","properties":{"invoiceId":{"description":"The invoice id","type":"string"},"userId":{"description":"The user id","type":"string"}},"required":["invoiceId","userId"],"title":"Invoice Paid Event","type":"object"})) // EventTypeSchemaIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypeGenerateExample(context.Background()).EventTypeSchemaIn(eventTypeSchemaIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeGenerateExample``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypeGenerateExample`: EventTypeExampleOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypeGenerateExample`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeGenerateExampleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeSchemaIn** | [**EventTypeSchemaIn**](EventTypeSchemaIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EventTypeExampleOut**](EventTypeExampleOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EventTypeGet

> EventTypeOut V1EventTypeGet(ctx, eventTypeName).Execute()

Get Event Type



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
    eventTypeName := "user.signup" // string | The event type's name

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypeGet(context.Background(), eventTypeName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypeGet`: EventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypeGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**eventTypeName** | **string** | The event type&#39;s name | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EventTypeGetRetrySchedule

> RetryScheduleInOut V1EventTypeGetRetrySchedule(ctx, eventTypeName).Execute()

Get Retry Schedule



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
    eventTypeName := "user.signup" // string | The event type's name

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypeGetRetrySchedule(context.Background(), eventTypeName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeGetRetrySchedule``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypeGetRetrySchedule`: RetryScheduleInOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypeGetRetrySchedule`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**eventTypeName** | **string** | The event type&#39;s name | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeGetRetryScheduleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**RetryScheduleInOut**](RetryScheduleInOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EventTypeImportOpenapi

> EventTypeImportOpenApiOut V1EventTypeImportOpenapi(ctx).EventTypeImportOpenApiIn(eventTypeImportOpenApiIn).IdempotencyKey(idempotencyKey).Execute()

Event Type Import From Openapi



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
    eventTypeImportOpenApiIn := *openapiclient.NewEventTypeImportOpenApiIn() // EventTypeImportOpenApiIn | Import a list of event types from webhooks defined in an OpenAPI spec.  The OpenAPI spec can be specified as either `spec` given the spec as a JSON object, or as `specRaw` (a `string`) which will be parsed as YAML or JSON by the server. Sending neither or both is invalid, resulting in a `400` **Bad Request**.
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypeImportOpenapi(context.Background()).EventTypeImportOpenApiIn(eventTypeImportOpenApiIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeImportOpenapi``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypeImportOpenapi`: EventTypeImportOpenApiOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypeImportOpenapi`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeImportOpenapiRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeImportOpenApiIn** | [**EventTypeImportOpenApiIn**](EventTypeImportOpenApiIn.md) | Import a list of event types from webhooks defined in an OpenAPI spec.  The OpenAPI spec can be specified as either &#x60;spec&#x60; given the spec as a JSON object, or as &#x60;specRaw&#x60; (a &#x60;string&#x60;) which will be parsed as YAML or JSON by the server. Sending neither or both is invalid, resulting in a &#x60;400&#x60; **Bad Request**. | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EventTypeImportOpenApiOut**](EventTypeImportOpenApiOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EventTypeList

> ListResponseEventTypeOut V1EventTypeList(ctx).Limit(limit).Iterator(iterator).Order(order).IncludeArchived(includeArchived).WithContent(withContent).Execute()

List Event Types



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
    limit := int32(56) // int32 | Limit the number of returned items (optional)
    iterator := "user.signup" // string | The iterator returned from a prior invocation (optional)
    order := openapiclient.Ordering("ascending") // Ordering | The sorting order of the returned items (optional)
    includeArchived := true // bool | When `true` archived (deleted but not expunged) items are included in the response (optional) (default to false)
    withContent := true // bool | When `true` the full item (including the schema) is included in the response (optional) (default to false)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypeList(context.Background()).Limit(limit).Iterator(iterator).Order(order).IncludeArchived(includeArchived).WithContent(withContent).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypeList`: ListResponseEventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypeList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **order** | [**Ordering**](Ordering.md) | The sorting order of the returned items | 
 **includeArchived** | **bool** | When &#x60;true&#x60; archived (deleted but not expunged) items are included in the response | [default to false]
 **withContent** | **bool** | When &#x60;true&#x60; the full item (including the schema) is included in the response | [default to false]

### Return type

[**ListResponseEventTypeOut**](ListResponseEventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EventTypePatch

> EventTypeOut V1EventTypePatch(ctx, eventTypeName).EventTypePatch(eventTypePatch).Execute()

Patch Event Type



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
    eventTypeName := "user.signup" // string | The event type's name
    eventTypePatch := *openapiclient.NewEventTypePatch() // EventTypePatch | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypePatch(context.Background(), eventTypeName).EventTypePatch(eventTypePatch).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypePatch``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypePatch`: EventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypePatch`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**eventTypeName** | **string** | The event type&#39;s name | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypePatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **eventTypePatch** | [**EventTypePatch**](EventTypePatch.md) |  | 

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EventTypeUpdate

> EventTypeOut V1EventTypeUpdate(ctx, eventTypeName).EventTypeUpdate(eventTypeUpdate).Execute()

Update Event Type



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
    eventTypeName := "user.signup" // string | The event type's name
    eventTypeUpdate := *openapiclient.NewEventTypeUpdate("A user has signed up") // EventTypeUpdate | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypeUpdate(context.Background(), eventTypeName).EventTypeUpdate(eventTypeUpdate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypeUpdate`: EventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypeUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**eventTypeName** | **string** | The event type&#39;s name | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **eventTypeUpdate** | [**EventTypeUpdate**](EventTypeUpdate.md) |  | 

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1EventTypeUpdateRetrySchedule

> RetryScheduleInOut V1EventTypeUpdateRetrySchedule(ctx, eventTypeName).RetryScheduleInOut(retryScheduleInOut).Execute()

Update Retry Schedule



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
    eventTypeName := "user.signup" // string | The event type's name
    retryScheduleInOut := *openapiclient.NewRetryScheduleInOut() // RetryScheduleInOut | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.EventTypeApi.V1EventTypeUpdateRetrySchedule(context.Background(), eventTypeName).RetryScheduleInOut(retryScheduleInOut).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.V1EventTypeUpdateRetrySchedule``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EventTypeUpdateRetrySchedule`: RetryScheduleInOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.V1EventTypeUpdateRetrySchedule`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**eventTypeName** | **string** | The event type&#39;s name | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1EventTypeUpdateRetryScheduleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **retryScheduleInOut** | [**RetryScheduleInOut**](RetryScheduleInOut.md) |  | 

### Return type

[**RetryScheduleInOut**](RetryScheduleInOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

