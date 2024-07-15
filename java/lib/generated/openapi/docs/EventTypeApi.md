# EventTypeApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1EventTypeCreate**](EventTypeApi.md#v1EventTypeCreate) | **POST** /api/v1/event-type | Create Event Type
[**v1EventTypeDelete**](EventTypeApi.md#v1EventTypeDelete) | **DELETE** /api/v1/event-type/{event_type_name} | Delete Event Type
[**v1EventTypeExportOpenapi**](EventTypeApi.md#v1EventTypeExportOpenapi) | **POST** /api/v1/event-type/export/openapi | Event Type Export From Openapi
[**v1EventTypeGenerateExample**](EventTypeApi.md#v1EventTypeGenerateExample) | **POST** /api/v1/event-type/schema/generate-example | Generate Schema Example
[**v1EventTypeGet**](EventTypeApi.md#v1EventTypeGet) | **GET** /api/v1/event-type/{event_type_name} | Get Event Type
[**v1EventTypeGetRetrySchedule**](EventTypeApi.md#v1EventTypeGetRetrySchedule) | **GET** /api/v1/event-type/{event_type_name}/retry-schedule | Get Retry Schedule
[**v1EventTypeImportOpenapi**](EventTypeApi.md#v1EventTypeImportOpenapi) | **POST** /api/v1/event-type/import/openapi | Event Type Import From Openapi
[**v1EventTypeList**](EventTypeApi.md#v1EventTypeList) | **GET** /api/v1/event-type | List Event Types
[**v1EventTypePatch**](EventTypeApi.md#v1EventTypePatch) | **PATCH** /api/v1/event-type/{event_type_name} | Patch Event Type
[**v1EventTypeUpdate**](EventTypeApi.md#v1EventTypeUpdate) | **PUT** /api/v1/event-type/{event_type_name} | Update Event Type
[**v1EventTypeUpdateRetrySchedule**](EventTypeApi.md#v1EventTypeUpdateRetrySchedule) | **PUT** /api/v1/event-type/{event_type_name}/retry-schedule | Update Retry Schedule


<a name="v1EventTypeCreate"></a>
# **v1EventTypeCreate**
> EventTypeOut v1EventTypeCreate(eventTypeIn, idempotencyKey)

Create Event Type

Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    EventTypeIn eventTypeIn = new EventTypeIn(); // EventTypeIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EventTypeOut result = apiInstance.v1EventTypeCreate(eventTypeIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeCreate");
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
 **eventTypeIn** | [**EventTypeIn**](EventTypeIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EventTypeDelete"></a>
# **v1EventTypeDelete**
> v1EventTypeDelete(eventTypeName, expunge)

Delete Event Type

Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    String eventTypeName = "user.signup"; // String | The event type's name
    Boolean expunge = false; // Boolean | By default event types are archived when \"deleted\". Passing this to `true` deletes them entirely.
    try {
      apiInstance.v1EventTypeDelete(eventTypeName, expunge);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeDelete");
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
 **eventTypeName** | **String**| The event type&#39;s name |
 **expunge** | **Boolean**| By default event types are archived when \&quot;deleted\&quot;. Passing this to &#x60;true&#x60; deletes them entirely. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EventTypeExportOpenapi"></a>
# **v1EventTypeExportOpenapi**
> ExportEventTypeOut v1EventTypeExportOpenapi(idempotencyKey)

Event Type Export From Openapi

Exports event type definitions based on the OpenAPI schemas associated with each existing event type

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      ExportEventTypeOut result = apiInstance.v1EventTypeExportOpenapi(idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeExportOpenapi");
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
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**ExportEventTypeOut**](ExportEventTypeOut.md)

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

<a name="v1EventTypeGenerateExample"></a>
# **v1EventTypeGenerateExample**
> EventTypeExampleOut v1EventTypeGenerateExample(eventTypeSchemaIn, idempotencyKey)

Generate Schema Example

Generates a fake example from the given JSONSchema

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    EventTypeSchemaIn eventTypeSchemaIn = new EventTypeSchemaIn(); // EventTypeSchemaIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EventTypeExampleOut result = apiInstance.v1EventTypeGenerateExample(eventTypeSchemaIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeGenerateExample");
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
 **eventTypeSchemaIn** | [**EventTypeSchemaIn**](EventTypeSchemaIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**EventTypeExampleOut**](EventTypeExampleOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="v1EventTypeGet"></a>
# **v1EventTypeGet**
> EventTypeOut v1EventTypeGet(eventTypeName)

Get Event Type

Get an event type.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    String eventTypeName = "user.signup"; // String | The event type's name
    try {
      EventTypeOut result = apiInstance.v1EventTypeGet(eventTypeName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeGet");
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
 **eventTypeName** | **String**| The event type&#39;s name |

### Return type

[**EventTypeOut**](EventTypeOut.md)

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

<a name="v1EventTypeGetRetrySchedule"></a>
# **v1EventTypeGetRetrySchedule**
> RetryScheduleInOut v1EventTypeGetRetrySchedule(eventTypeName)

Get Retry Schedule

Gets the retry schedule for messages using the given event type

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    String eventTypeName = "user.signup"; // String | The event type's name
    try {
      RetryScheduleInOut result = apiInstance.v1EventTypeGetRetrySchedule(eventTypeName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeGetRetrySchedule");
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
 **eventTypeName** | **String**| The event type&#39;s name |

### Return type

[**RetryScheduleInOut**](RetryScheduleInOut.md)

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

<a name="v1EventTypeImportOpenapi"></a>
# **v1EventTypeImportOpenapi**
> EventTypeImportOpenApiOut v1EventTypeImportOpenapi(eventTypeImportOpenApiIn, idempotencyKey)

Event Type Import From Openapi

Given an OpenAPI spec, create new or update existing event types. If an existing &#x60;archived&#x60; event type is updated, it will be unarchived.  The importer will convert all webhooks found in the either the &#x60;webhooks&#x60; or &#x60;x-webhooks&#x60; top-level.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    EventTypeImportOpenApiIn eventTypeImportOpenApiIn = new EventTypeImportOpenApiIn(); // EventTypeImportOpenApiIn | Import a list of event types from webhooks defined in an OpenAPI spec.  The OpenAPI spec can be specified as either `spec` given the spec as a JSON object, or as `specRaw` (a `string`) which will be parsed as YAML or JSON by the server. Sending neither or both is invalid, resulting in a `400` **Bad Request**.
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EventTypeImportOpenApiOut result = apiInstance.v1EventTypeImportOpenapi(eventTypeImportOpenApiIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeImportOpenapi");
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
 **eventTypeImportOpenApiIn** | [**EventTypeImportOpenApiIn**](EventTypeImportOpenApiIn.md)| Import a list of event types from webhooks defined in an OpenAPI spec.  The OpenAPI spec can be specified as either &#x60;spec&#x60; given the spec as a JSON object, or as &#x60;specRaw&#x60; (a &#x60;string&#x60;) which will be parsed as YAML or JSON by the server. Sending neither or both is invalid, resulting in a &#x60;400&#x60; **Bad Request**. |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**EventTypeImportOpenApiOut**](EventTypeImportOpenApiOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="v1EventTypeList"></a>
# **v1EventTypeList**
> ListResponseEventTypeOut v1EventTypeList(limit, iterator, order, includeArchived, withContent)

List Event Types

Return the list of event types.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "user.signup"; // String | The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // Ordering | The sorting order of the returned items
    Boolean includeArchived = false; // Boolean | When `true` archived (deleted but not expunged) items are included in the response
    Boolean withContent = false; // Boolean | When `true` the full item (including the schema) is included in the response
    try {
      ListResponseEventTypeOut result = apiInstance.v1EventTypeList(limit, iterator, order, includeArchived, withContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeList");
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
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **order** | [**Ordering**](.md)| The sorting order of the returned items | [optional] [enum: ascending, descending]
 **includeArchived** | **Boolean**| When &#x60;true&#x60; archived (deleted but not expunged) items are included in the response | [optional] [default to false]
 **withContent** | **Boolean**| When &#x60;true&#x60; the full item (including the schema) is included in the response | [optional] [default to false]

### Return type

[**ListResponseEventTypeOut**](ListResponseEventTypeOut.md)

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

<a name="v1EventTypePatch"></a>
# **v1EventTypePatch**
> EventTypeOut v1EventTypePatch(eventTypeName, eventTypePatch)

Patch Event Type

Partially update an event type.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    String eventTypeName = "user.signup"; // String | The event type's name
    EventTypePatch eventTypePatch = new EventTypePatch(); // EventTypePatch | 
    try {
      EventTypeOut result = apiInstance.v1EventTypePatch(eventTypeName, eventTypePatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypePatch");
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
 **eventTypeName** | **String**| The event type&#39;s name |
 **eventTypePatch** | [**EventTypePatch**](EventTypePatch.md)|  |

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="v1EventTypeUpdate"></a>
# **v1EventTypeUpdate**
> EventTypeOut v1EventTypeUpdate(eventTypeName, eventTypeUpdate)

Update Event Type

Update an event type.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    String eventTypeName = "user.signup"; // String | The event type's name
    EventTypeUpdate eventTypeUpdate = new EventTypeUpdate(); // EventTypeUpdate | 
    try {
      EventTypeOut result = apiInstance.v1EventTypeUpdate(eventTypeName, eventTypeUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeUpdate");
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
 **eventTypeName** | **String**| The event type&#39;s name |
 **eventTypeUpdate** | [**EventTypeUpdate**](EventTypeUpdate.md)|  |

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**201** |  |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1EventTypeUpdateRetrySchedule"></a>
# **v1EventTypeUpdateRetrySchedule**
> RetryScheduleInOut v1EventTypeUpdateRetrySchedule(eventTypeName, retryScheduleInOut)

Update Retry Schedule

Sets a retry schedule for all messages using the given event type

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.EventTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EventTypeApi apiInstance = new EventTypeApi(defaultClient);
    String eventTypeName = "user.signup"; // String | The event type's name
    RetryScheduleInOut retryScheduleInOut = new RetryScheduleInOut(); // RetryScheduleInOut | 
    try {
      RetryScheduleInOut result = apiInstance.v1EventTypeUpdateRetrySchedule(eventTypeName, retryScheduleInOut);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#v1EventTypeUpdateRetrySchedule");
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
 **eventTypeName** | **String**| The event type&#39;s name |
 **retryScheduleInOut** | [**RetryScheduleInOut**](RetryScheduleInOut.md)|  |

### Return type

[**RetryScheduleInOut**](RetryScheduleInOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
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

