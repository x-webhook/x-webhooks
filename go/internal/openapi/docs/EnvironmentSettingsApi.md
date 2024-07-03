# \EnvironmentSettingsApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1EnvironmentGetSettings**](EnvironmentSettingsApi.md#V1EnvironmentGetSettings) | **Get** /api/v1/environment/settings | Get Org Settings



## V1EnvironmentGetSettings

> EnvironmentSettingsOut V1EnvironmentGetSettings(ctx).Execute()

Get Org Settings



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
    resp, r, err := api_client.EnvironmentSettingsApi.V1EnvironmentGetSettings(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EnvironmentSettingsApi.V1EnvironmentGetSettings``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1EnvironmentGetSettings`: EnvironmentSettingsOut
    fmt.Fprintf(os.Stdout, "Response from `EnvironmentSettingsApi.V1EnvironmentGetSettings`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiV1EnvironmentGetSettingsRequest struct via the builder pattern


### Return type

[**EnvironmentSettingsOut**](EnvironmentSettingsOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

