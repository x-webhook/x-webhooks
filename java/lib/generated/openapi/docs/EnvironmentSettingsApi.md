# EnvironmentSettingsApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1EnvironmentGetSettings**](EnvironmentSettingsApi.md#v1EnvironmentGetSettings) | **GET** /api/v1/environment/settings | Get Org Settings


<a name="v1EnvironmentGetSettings"></a>
# **v1EnvironmentGetSettings**
> EnvironmentSettingsOut v1EnvironmentGetSettings()

Get Org Settings

Get the environment&#39;s settings

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EnvironmentSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EnvironmentSettingsApi apiInstance = new EnvironmentSettingsApi(defaultClient);
    try {
      EnvironmentSettingsOut result = apiInstance.v1EnvironmentGetSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentSettingsApi#v1EnvironmentGetSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EnvironmentSettingsOut**](EnvironmentSettingsOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

