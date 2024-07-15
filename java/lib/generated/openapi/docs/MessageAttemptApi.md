# MessageAttemptApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1MessageAttemptExpungeContent**](MessageAttemptApi.md#v1MessageAttemptExpungeContent) | **DELETE** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/content | Delete attempt response body
[**v1MessageAttemptGet**](MessageAttemptApi.md#v1MessageAttemptGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id} | Get Attempt
[**v1MessageAttemptGetHeaders**](MessageAttemptApi.md#v1MessageAttemptGetHeaders) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/headers | Get Attempt Headers
[**v1MessageAttemptListAttemptedDestinations**](MessageAttemptApi.md#v1MessageAttemptListAttemptedDestinations) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint | List Attempted Destinations
[**v1MessageAttemptListAttemptedMessages**](MessageAttemptApi.md#v1MessageAttemptListAttemptedMessages) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg | List Attempted Messages
[**v1MessageAttemptListByEndpoint**](MessageAttemptApi.md#v1MessageAttemptListByEndpoint) | **GET** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id} | List Attempts By Endpoint
[**v1MessageAttemptListByEndpointDeprecated**](MessageAttemptApi.md#v1MessageAttemptListByEndpointDeprecated) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt | List Attempts For Endpoint
[**v1MessageAttemptListByMsg**](MessageAttemptApi.md#v1MessageAttemptListByMsg) | **GET** /api/v1/app/{app_id}/attempt/msg/{msg_id} | List Attempts By Msg
[**v1MessageAttemptListByMsgDeprecated**](MessageAttemptApi.md#v1MessageAttemptListByMsgDeprecated) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt | List Attempts
[**v1MessageAttemptResend**](MessageAttemptApi.md#v1MessageAttemptResend) | **POST** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend | Resend Webhook


<a name="v1MessageAttemptExpungeContent"></a>
# **v1MessageAttemptExpungeContent**
> v1MessageAttemptExpungeContent(appId, msgId, attemptId)

Delete attempt response body

Deletes the given attempt&#39;s response body. Useful when an endpoint accidentally returned sensitive content.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    String attemptId = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The attempt's ID
    try {
      apiInstance.v1MessageAttemptExpungeContent(appId, msgId, attemptId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptExpungeContent");
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
 **msgId** | **String**| The msg&#39;s ID or UID |
 **attemptId** | **String**| The attempt&#39;s ID |

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

<a name="v1MessageAttemptGet"></a>
# **v1MessageAttemptGet**
> MessageAttemptOut v1MessageAttemptGet(appId, msgId, attemptId)

Get Attempt

&#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    String attemptId = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The attempt's ID
    try {
      MessageAttemptOut result = apiInstance.v1MessageAttemptGet(appId, msgId, attemptId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptGet");
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
 **msgId** | **String**| The msg&#39;s ID or UID |
 **attemptId** | **String**| The attempt&#39;s ID |

### Return type

[**MessageAttemptOut**](MessageAttemptOut.md)

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

<a name="v1MessageAttemptGetHeaders"></a>
# **v1MessageAttemptGetHeaders**
> MessageAttemptHeadersOut v1MessageAttemptGetHeaders(appId, msgId, attemptId)

Get Attempt Headers

Calculate and return headers used on a given message attempt

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    String attemptId = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The attempt's ID
    try {
      MessageAttemptHeadersOut result = apiInstance.v1MessageAttemptGetHeaders(appId, msgId, attemptId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptGetHeaders");
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
 **msgId** | **String**| The msg&#39;s ID or UID |
 **attemptId** | **String**| The attempt&#39;s ID |

### Return type

[**MessageAttemptHeadersOut**](MessageAttemptHeadersOut.md)

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

<a name="v1MessageAttemptListAttemptedDestinations"></a>
# **v1MessageAttemptListAttemptedDestinations**
> ListResponseMessageEndpointOut v1MessageAttemptListAttemptedDestinations(appId, msgId, limit, iterator)

List Attempted Destinations

List endpoints attempted by a given message. Additionally includes metadata about the latest message attempt. By default, endpoints are listed in ascending order by ID.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    try {
      ListResponseMessageEndpointOut result = apiInstance.v1MessageAttemptListAttemptedDestinations(appId, msgId, limit, iterator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptListAttemptedDestinations");
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
 **msgId** | **String**| The msg&#39;s ID or UID |
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]

### Return type

[**ListResponseMessageEndpointOut**](ListResponseMessageEndpointOut.md)

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

<a name="v1MessageAttemptListAttemptedMessages"></a>
# **v1MessageAttemptListAttemptedMessages**
> ListResponseEndpointMessageOut v1MessageAttemptListAttemptedMessages(appId, endpointId, limit, iterator, channel, tag, status, before, after, withContent, eventTypes)

List Attempted Messages

List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    String channel = "project_1337"; // String | Filter response based on the channel
    String tag = "project_1337"; // String | Filter response based on the message tags
    MessageStatus status = MessageStatus.fromValue("0"); // MessageStatus | Filter response based on the delivery status
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | Only include items created after a certain date
    Boolean withContent = true; // Boolean | When `true` message payloads are included in the response
    Set<String> eventTypes = Arrays.asList(); // Set<String> | Filter response based on the event type
    try {
      ListResponseEndpointMessageOut result = apiInstance.v1MessageAttemptListAttemptedMessages(appId, endpointId, limit, iterator, channel, tag, status, before, after, withContent, eventTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptListAttemptedMessages");
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
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **channel** | **String**| Filter response based on the channel | [optional]
 **tag** | **String**| Filter response based on the message tags | [optional]
 **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3]
 **before** | **OffsetDateTime**| Only include items created before a certain date | [optional]
 **after** | **OffsetDateTime**| Only include items created after a certain date | [optional]
 **withContent** | **Boolean**| When &#x60;true&#x60; message payloads are included in the response | [optional] [default to true]
 **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]

### Return type

[**ListResponseEndpointMessageOut**](ListResponseEndpointMessageOut.md)

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

<a name="v1MessageAttemptListByEndpoint"></a>
# **v1MessageAttemptListByEndpoint**
> ListResponseMessageAttemptOut v1MessageAttemptListByEndpoint(appId, endpointId, limit, iterator, status, statusCodeClass, channel, tag, before, after, withContent, withMsg, eventTypes)

List Attempts By Endpoint

List attempts by endpoint id  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    MessageStatus status = MessageStatus.fromValue("0"); // MessageStatus | Filter response based on the delivery status
    StatusCodeClass statusCodeClass = StatusCodeClass.fromValue("0"); // StatusCodeClass | Filter response based on the HTTP status code
    String channel = "project_1337"; // String | Filter response based on the channel
    String tag = "project_1337"; // String | Filter response based on the tag
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | Only include items created after a certain date
    Boolean withContent = true; // Boolean | When `true` attempt content is included in the response
    Boolean withMsg = false; // Boolean | When `true`, the message information is included in the response
    Set<String> eventTypes = Arrays.asList(); // Set<String> | Filter response based on the event type
    try {
      ListResponseMessageAttemptOut result = apiInstance.v1MessageAttemptListByEndpoint(appId, endpointId, limit, iterator, status, statusCodeClass, channel, tag, before, after, withContent, withMsg, eventTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptListByEndpoint");
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
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3]
 **statusCodeClass** | [**StatusCodeClass**](.md)| Filter response based on the HTTP status code | [optional] [enum: 0, 100, 200, 300, 400, 500]
 **channel** | **String**| Filter response based on the channel | [optional]
 **tag** | **String**| Filter response based on the tag | [optional]
 **before** | **OffsetDateTime**| Only include items created before a certain date | [optional]
 **after** | **OffsetDateTime**| Only include items created after a certain date | [optional]
 **withContent** | **Boolean**| When &#x60;true&#x60; attempt content is included in the response | [optional] [default to true]
 **withMsg** | **Boolean**| When &#x60;true&#x60;, the message information is included in the response | [optional] [default to false]
 **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

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

<a name="v1MessageAttemptListByEndpointDeprecated"></a>
# **v1MessageAttemptListByEndpointDeprecated**
> ListResponseMessageAttemptEndpointOut v1MessageAttemptListByEndpointDeprecated(appId, msgId, endpointId, limit, iterator, channel, tag, status, before, after, eventTypes)

List Attempts For Endpoint

DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    String channel = "project_1337"; // String | Filter response based on the channel
    String tag = "project_1337"; // String | Filter response based on the tag
    MessageStatus status = MessageStatus.fromValue("0"); // MessageStatus | Filter response based on the delivery status
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | Only include items created after a certain date
    Set<String> eventTypes = Arrays.asList(); // Set<String> | Filter response based on the event type
    try {
      ListResponseMessageAttemptEndpointOut result = apiInstance.v1MessageAttemptListByEndpointDeprecated(appId, msgId, endpointId, limit, iterator, channel, tag, status, before, after, eventTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptListByEndpointDeprecated");
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
 **msgId** | **String**| The msg&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **channel** | **String**| Filter response based on the channel | [optional]
 **tag** | **String**| Filter response based on the tag | [optional]
 **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3]
 **before** | **OffsetDateTime**| Only include items created before a certain date | [optional]
 **after** | **OffsetDateTime**| Only include items created after a certain date | [optional]
 **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]

### Return type

[**ListResponseMessageAttemptEndpointOut**](ListResponseMessageAttemptEndpointOut.md)

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

<a name="v1MessageAttemptListByMsg"></a>
# **v1MessageAttemptListByMsg**
> ListResponseMessageAttemptOut v1MessageAttemptListByMsg(appId, msgId, limit, iterator, status, statusCodeClass, channel, tag, endpointId, before, after, withContent, eventTypes)

List Attempts By Msg

List attempts by message id  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    MessageStatus status = MessageStatus.fromValue("0"); // MessageStatus | Filter response based on the delivery status
    StatusCodeClass statusCodeClass = StatusCodeClass.fromValue("0"); // StatusCodeClass | Filter response based on the HTTP status code
    String channel = "project_1337"; // String | Filter response based on the channel
    String tag = "project_1337"; // String | Filter response based on the tag
    String endpointId = "unique-ep-identifier"; // String | Filter the attempts based on the attempted endpoint
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | Only include items created after a certain date
    Boolean withContent = true; // Boolean | When `true` attempt content is included in the response
    Set<String> eventTypes = Arrays.asList(); // Set<String> | Filter response based on the event type
    try {
      ListResponseMessageAttemptOut result = apiInstance.v1MessageAttemptListByMsg(appId, msgId, limit, iterator, status, statusCodeClass, channel, tag, endpointId, before, after, withContent, eventTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptListByMsg");
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
 **msgId** | **String**| The msg&#39;s ID or UID |
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3]
 **statusCodeClass** | [**StatusCodeClass**](.md)| Filter response based on the HTTP status code | [optional] [enum: 0, 100, 200, 300, 400, 500]
 **channel** | **String**| Filter response based on the channel | [optional]
 **tag** | **String**| Filter response based on the tag | [optional]
 **endpointId** | **String**| Filter the attempts based on the attempted endpoint | [optional]
 **before** | **OffsetDateTime**| Only include items created before a certain date | [optional]
 **after** | **OffsetDateTime**| Only include items created after a certain date | [optional]
 **withContent** | **Boolean**| When &#x60;true&#x60; attempt content is included in the response | [optional] [default to true]
 **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

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

<a name="v1MessageAttemptListByMsgDeprecated"></a>
# **v1MessageAttemptListByMsgDeprecated**
> ListResponseMessageAttemptOut v1MessageAttemptListByMsgDeprecated(appId, msgId, limit, iterator, endpointId, channel, tag, status, before, after, statusCodeClass, eventTypes)

List Attempts

Deprecated: Please use \&quot;List Attempts by Endpoint\&quot; and \&quot;List Attempts by Msg\&quot; instead.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate.  &#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    String endpointId = "unique-ep-identifier"; // String | Filter the attempts based on the attempted endpoint
    String channel = "project_1337"; // String | Filter response based on the channel
    String tag = "project_1337"; // String | Filter response based on the tag
    MessageStatus status = MessageStatus.fromValue("0"); // MessageStatus | Filter response based on the delivery status
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | Only include items created after a certain date
    StatusCodeClass statusCodeClass = StatusCodeClass.fromValue("0"); // StatusCodeClass | Filter response based on the HTTP status code
    Set<String> eventTypes = Arrays.asList(); // Set<String> | Filter response based on the event type
    try {
      ListResponseMessageAttemptOut result = apiInstance.v1MessageAttemptListByMsgDeprecated(appId, msgId, limit, iterator, endpointId, channel, tag, status, before, after, statusCodeClass, eventTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptListByMsgDeprecated");
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
 **msgId** | **String**| The msg&#39;s ID or UID |
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **endpointId** | **String**| Filter the attempts based on the attempted endpoint | [optional]
 **channel** | **String**| Filter response based on the channel | [optional]
 **tag** | **String**| Filter response based on the tag | [optional]
 **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3]
 **before** | **OffsetDateTime**| Only include items created before a certain date | [optional]
 **after** | **OffsetDateTime**| Only include items created after a certain date | [optional]
 **statusCodeClass** | [**StatusCodeClass**](.md)| Filter response based on the HTTP status code | [optional] [enum: 0, 100, 200, 300, 400, 500]
 **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

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

<a name="v1MessageAttemptResend"></a>
# **v1MessageAttemptResend**
> v1MessageAttemptResend(appId, msgId, endpointId, idempotencyKey)

Resend Webhook

Resend a message to the specified endpoint.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageAttemptApi apiInstance = new MessageAttemptApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      apiInstance.v1MessageAttemptResend(appId, msgId, endpointId, idempotencyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#v1MessageAttemptResend");
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
 **msgId** | **String**| The msg&#39;s ID or UID |
 **endpointId** | **String**| The ep&#39;s ID or UID |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

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
**202** | no content |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

