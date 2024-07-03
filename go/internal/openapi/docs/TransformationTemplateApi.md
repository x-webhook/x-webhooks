# \TransformationTemplateApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1EndpointUpdateHubspotOauthConfig**](TransformationTemplateApi.md#V1EndpointUpdateHubspotOauthConfig) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation-template/oauth/hubspot | Update Hubspot Oauth Config
[**V1TransformationTemplateCreate**](TransformationTemplateApi.md#V1TransformationTemplateCreate) | **Post** /api/v1/transformation-template | Create Transformation Template
[**V1TransformationTemplateDelete**](TransformationTemplateApi.md#V1TransformationTemplateDelete) | **Delete** /api/v1/transformation-template/{transformation_template_id} | Delete Transformation Template
[**V1TransformationTemplateGenerate**](TransformationTemplateApi.md#V1TransformationTemplateGenerate) | **Post** /api/v1/transformation-template/generate | Generate
[**V1TransformationTemplateGet**](TransformationTemplateApi.md#V1TransformationTemplateGet) | **Get** /api/v1/transformation-template/{transformation_template_id} | Get Transformation Template
[**V1TransformationTemplateList**](TransformationTemplateApi.md#V1TransformationTemplateList) | **Get** /api/v1/transformation-template | List Transformation Templates
[**V1TransformationTemplateOauthDiscord**](TransformationTemplateApi.md#V1TransformationTemplateOauthDiscord) | **Post** /api/v1/transformation-template/oauth/discord | Authorize Discord
[**V1TransformationTemplateOauthHubspot**](TransformationTemplateApi.md#V1TransformationTemplateOauthHubspot) | **Post** /api/v1/transformation-template/oauth/hubspot | Authorize Hubspot
[**V1TransformationTemplateOauthSlack**](TransformationTemplateApi.md#V1TransformationTemplateOauthSlack) | **Post** /api/v1/transformation-template/oauth/slack | Authorize Slack
[**V1TransformationTemplatePatch**](TransformationTemplateApi.md#V1TransformationTemplatePatch) | **Patch** /api/v1/transformation-template/{transformation_template_id} | Patch Transformation Template
[**V1TransformationTemplateSimulate**](TransformationTemplateApi.md#V1TransformationTemplateSimulate) | **Post** /api/v1/transformation-template/simulate | Simulate
[**V1TransformationTemplateUpdate**](TransformationTemplateApi.md#V1TransformationTemplateUpdate) | **Put** /api/v1/transformation-template/{transformation_template_id} | Update Transformation Template



## V1EndpointUpdateHubspotOauthConfig

> V1EndpointUpdateHubspotOauthConfig(ctx, appId, endpointId).HubspotOauthConfigIn(hubspotOauthConfigIn).Execute()

Update Hubspot Oauth Config



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
    hubspotOauthConfigIn := *openapiclient.NewHubspotOauthConfigIn("RefreshToken_example") // HubspotOauthConfigIn | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1EndpointUpdateHubspotOauthConfig(context.Background(), appId, endpointId).HubspotOauthConfigIn(hubspotOauthConfigIn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1EndpointUpdateHubspotOauthConfig``: %v\n", err)
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

Other parameters are passed through a pointer to a apiV1EndpointUpdateHubspotOauthConfigRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **hubspotOauthConfigIn** | [**HubspotOauthConfigIn**](HubspotOauthConfigIn.md) |  | 

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


## V1TransformationTemplateCreate

> TemplateOut V1TransformationTemplateCreate(ctx).TemplateIn(templateIn).IdempotencyKey(idempotencyKey).Execute()

Create Transformation Template



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
    templateIn := *openapiclient.NewTemplateIn("Logo_example", "Name_example", "Transformation_example") // TemplateIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateCreate(context.Background()).TemplateIn(templateIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplateCreate`: TemplateOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplateCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateIn** | [**TemplateIn**](TemplateIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**TemplateOut**](TemplateOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransformationTemplateDelete

> V1TransformationTemplateDelete(ctx, transformationTemplateId).Execute()

Delete Transformation Template



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
    transformationTemplateId := "transformationTemplateId_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateDelete(context.Background(), transformationTemplateId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**transformationTemplateId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateDeleteRequest struct via the builder pattern


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


## V1TransformationTemplateGenerate

> GenerateOut V1TransformationTemplateGenerate(ctx).GenerateIn(generateIn).IdempotencyKey(idempotencyKey).Execute()

Generate



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
    generateIn := *openapiclient.NewGenerateIn("Prompt_example") // GenerateIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateGenerate(context.Background()).GenerateIn(generateIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateGenerate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplateGenerate`: GenerateOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplateGenerate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateGenerateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateIn** | [**GenerateIn**](GenerateIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**GenerateOut**](GenerateOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransformationTemplateGet

> TemplateOut V1TransformationTemplateGet(ctx, transformationTemplateId).Execute()

Get Transformation Template



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
    transformationTemplateId := "transformationTemplateId_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateGet(context.Background(), transformationTemplateId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplateGet`: TemplateOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplateGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**transformationTemplateId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**TemplateOut**](TemplateOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransformationTemplateList

> ListResponseTemplateOut V1TransformationTemplateList(ctx).Limit(limit).Iterator(iterator).Order(order).Execute()

List Transformation Templates



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
    iterator := "iterator_example" // string | The iterator returned from a prior invocation (optional)
    order := openapiclient.Ordering("ascending") // Ordering | The sorting order of the returned items (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateList(context.Background()).Limit(limit).Iterator(iterator).Order(order).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplateList`: ListResponseTemplateOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplateList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | Limit the number of returned items | 
 **iterator** | **string** | The iterator returned from a prior invocation | 
 **order** | [**Ordering**](Ordering.md) | The sorting order of the returned items | 

### Return type

[**ListResponseTemplateOut**](ListResponseTemplateOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransformationTemplateOauthDiscord

> IncomingWebhookPayloadOut V1TransformationTemplateOauthDiscord(ctx).OAuthPayloadIn(oAuthPayloadIn).IdempotencyKey(idempotencyKey).Execute()

Authorize Discord



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
    oAuthPayloadIn := *openapiclient.NewOAuthPayloadIn("Code_example", "RedirectUri_example") // OAuthPayloadIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateOauthDiscord(context.Background()).OAuthPayloadIn(oAuthPayloadIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateOauthDiscord``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplateOauthDiscord`: IncomingWebhookPayloadOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplateOauthDiscord`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateOauthDiscordRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthPayloadIn** | [**OAuthPayloadIn**](OAuthPayloadIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**IncomingWebhookPayloadOut**](IncomingWebhookPayloadOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransformationTemplateOauthHubspot

> OAuthPayloadOut V1TransformationTemplateOauthHubspot(ctx).OAuthPayloadIn(oAuthPayloadIn).IdempotencyKey(idempotencyKey).Execute()

Authorize Hubspot



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
    oAuthPayloadIn := *openapiclient.NewOAuthPayloadIn("Code_example", "RedirectUri_example") // OAuthPayloadIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateOauthHubspot(context.Background()).OAuthPayloadIn(oAuthPayloadIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateOauthHubspot``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplateOauthHubspot`: OAuthPayloadOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplateOauthHubspot`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateOauthHubspotRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthPayloadIn** | [**OAuthPayloadIn**](OAuthPayloadIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**OAuthPayloadOut**](OAuthPayloadOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransformationTemplateOauthSlack

> IncomingWebhookPayloadOut V1TransformationTemplateOauthSlack(ctx).OAuthPayloadIn(oAuthPayloadIn).IdempotencyKey(idempotencyKey).Execute()

Authorize Slack



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
    oAuthPayloadIn := *openapiclient.NewOAuthPayloadIn("Code_example", "RedirectUri_example") // OAuthPayloadIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateOauthSlack(context.Background()).OAuthPayloadIn(oAuthPayloadIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateOauthSlack``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplateOauthSlack`: IncomingWebhookPayloadOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplateOauthSlack`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateOauthSlackRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthPayloadIn** | [**OAuthPayloadIn**](OAuthPayloadIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**IncomingWebhookPayloadOut**](IncomingWebhookPayloadOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransformationTemplatePatch

> TemplateOut V1TransformationTemplatePatch(ctx, transformationTemplateId).TemplatePatch(templatePatch).Execute()

Patch Transformation Template



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
    transformationTemplateId := "transformationTemplateId_example" // string | 
    templatePatch := *openapiclient.NewTemplatePatch() // TemplatePatch | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplatePatch(context.Background(), transformationTemplateId).TemplatePatch(templatePatch).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplatePatch``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplatePatch`: TemplateOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplatePatch`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**transformationTemplateId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplatePatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **templatePatch** | [**TemplatePatch**](TemplatePatch.md) |  | 

### Return type

[**TemplateOut**](TemplateOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransformationTemplateSimulate

> TransformationSimulateOut V1TransformationTemplateSimulate(ctx).TransformationSimulateIn(transformationSimulateIn).IdempotencyKey(idempotencyKey).Execute()

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
    transformationSimulateIn := *openapiclient.NewTransformationSimulateIn("Code_example", "user.signup", map[string]interface{}(123)) // TransformationSimulateIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateSimulate(context.Background()).TransformationSimulateIn(transformationSimulateIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateSimulate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplateSimulate`: TransformationSimulateOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplateSimulate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateSimulateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transformationSimulateIn** | [**TransformationSimulateIn**](TransformationSimulateIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**TransformationSimulateOut**](TransformationSimulateOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransformationTemplateUpdate

> TemplateOut V1TransformationTemplateUpdate(ctx, transformationTemplateId).TemplateUpdate(templateUpdate).Execute()

Update Transformation Template



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
    transformationTemplateId := "transformationTemplateId_example" // string | 
    templateUpdate := *openapiclient.NewTemplateUpdate("Logo_example", "Transformation_example") // TemplateUpdate | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransformationTemplateApi.V1TransformationTemplateUpdate(context.Background(), transformationTemplateId).TemplateUpdate(templateUpdate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransformationTemplateApi.V1TransformationTemplateUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransformationTemplateUpdate`: TemplateOut
    fmt.Fprintf(os.Stdout, "Response from `TransformationTemplateApi.V1TransformationTemplateUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**transformationTemplateId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1TransformationTemplateUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **templateUpdate** | [**TemplateUpdate**](TemplateUpdate.md) |  | 

### Return type

[**TemplateOut**](TemplateOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

