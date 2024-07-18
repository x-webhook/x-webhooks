# StatisticsApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1StatisticsAggregateAppStats**](StatisticsApi.md#v1StatisticsAggregateAppStats) | **POST** /api/v1/stats/usage/app | Aggregate App Stats
[**v1StatisticsAggregateEventTypes**](StatisticsApi.md#v1StatisticsAggregateEventTypes) | **PUT** /api/v1/stats/usage/event-types | Aggregate Event Types
[**v1StatsAppAttempts**](StatisticsApi.md#v1StatsAppAttempts) | **GET** /api/v1/stats/app/{app_id}/attempt | Get App Attempt Stats
[**v1StatsEndpointAttempts**](StatisticsApi.md#v1StatsEndpointAttempts) | **GET** /api/v1/stats/app/{app_id}/ep/{endpoint_id}/attempt | Get Ep Stats


<a name="v1StatisticsAggregateAppStats"></a>
# **v1StatisticsAggregateAppStats**
> AppUsageStatsOut v1StatisticsAggregateAppStats(appUsageStatsIn, idempotencyKey)

Aggregate App Stats

Creates a background task to calculate the message destinations for all applications in the environment.  Note that this endpoint is asynchronous. You will need to poll the &#x60;Get Background Task&#x60; endpoint to retrieve the results of the operation.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    AppUsageStatsIn appUsageStatsIn = new AppUsageStatsIn(); // AppUsageStatsIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      AppUsageStatsOut result = apiInstance.v1StatisticsAggregateAppStats(appUsageStatsIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#v1StatisticsAggregateAppStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appUsageStatsIn** | [**AppUsageStatsIn**](AppUsageStatsIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**AppUsageStatsOut**](AppUsageStatsOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1StatisticsAggregateEventTypes"></a>
# **v1StatisticsAggregateEventTypes**
> AggregateEventTypesOut v1StatisticsAggregateEventTypes()

Aggregate Event Types

Creates a background task to calculate the listed event types for all apps in the organization.  Note that this endpoint is asynchronous. You will need to poll the &#x60;Get Background Task&#x60; endpoint to retrieve the results of the operation.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    try {
      AggregateEventTypesOut result = apiInstance.v1StatisticsAggregateEventTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#v1StatisticsAggregateEventTypes");
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

[**AggregateEventTypesOut**](AggregateEventTypesOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1StatsAppAttempts"></a>
# **v1StatsAppAttempts**
> AttemptStatisticsResponse v1StatsAppAttempts(appId, startDate, endDate)

Get App Attempt Stats

Returns application-level statistics on message attempts

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data starting from this date
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data ending by this date
    try {
      AttemptStatisticsResponse result = apiInstance.v1StatsAppAttempts(appId, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#v1StatsAppAttempts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **startDate** | **OffsetDateTime**| Filter the range to data starting from this date | [optional]
 **endDate** | **OffsetDateTime**| Filter the range to data ending by this date | [optional]

### Return type

[**AttemptStatisticsResponse**](AttemptStatisticsResponse.md)

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

<a name="v1StatsEndpointAttempts"></a>
# **v1StatsEndpointAttempts**
> AttemptStatisticsResponse v1StatsEndpointAttempts(appId, endpointId, startDate, endDate)

Get Ep Stats

Returns endpoint-level statistics on message attempts

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data starting from this date
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data ending by this date
    try {
      AttemptStatisticsResponse result = apiInstance.v1StatsEndpointAttempts(appId, endpointId, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#v1StatsEndpointAttempts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **startDate** | **OffsetDateTime**| Filter the range to data starting from this date | [optional]
 **endDate** | **OffsetDateTime**| Filter the range to data ending by this date | [optional]

### Return type

[**AttemptStatisticsResponse**](AttemptStatisticsResponse.md)

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

