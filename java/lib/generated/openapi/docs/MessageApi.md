# MessageApi

All URIs are relative to *https://api.webhook.openweb3.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessageAttemptForEndpoint**](MessageApi.md#createMessageAttemptForEndpoint) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/test-attempt | Create Message Attempt For Endpoint
[**v1MessageCreate**](MessageApi.md#v1MessageCreate) | **POST** /api/v1/app/{app_id}/msg | Create Message
[**v1MessageExpungeContent**](MessageApi.md#v1MessageExpungeContent) | **DELETE** /api/v1/app/{app_id}/msg/{msg_id}/content | Delete message payload
[**v1MessageGet**](MessageApi.md#v1MessageGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id} | Get Message
[**v1MessageGetRawPayload**](MessageApi.md#v1MessageGetRawPayload) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/raw | Get Raw Message Payload
[**v1MessageList**](MessageApi.md#v1MessageList) | **GET** /api/v1/app/{app_id}/msg | List Messages
[**v1MessageStream**](MessageApi.md#v1MessageStream) | **GET** /api/v1/app/{app_id}/events | Stream Events


<a name="createMessageAttemptForEndpoint"></a>
# **createMessageAttemptForEndpoint**
> MessageAttemptOut createMessageAttemptForEndpoint(appId, endpointId, messageIn, idempotencyKey)

Create Message Attempt For Endpoint

Creates and sends a message to the specified endpoint. The message attempt and response from the endpoint is returned. FIXME: use MessageIn for expediency, even though the &#x60;application&#x60; parameter is unused. Since this endpoint isn&#39;t publicly documented anyway, it should be fine

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageApi apiInstance = new MessageApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String endpointId = "unique-ep-identifier"; // String | The ep's ID or UID
    MessageIn messageIn = new MessageIn(); // MessageIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      MessageAttemptOut result = apiInstance.createMessageAttemptForEndpoint(appId, endpointId, messageIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#createMessageAttemptForEndpoint");
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
 **messageIn** | [**MessageIn**](MessageIn.md)|  |
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**MessageAttemptOut**](MessageAttemptOut.md)

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

<a name="v1MessageCreate"></a>
# **v1MessageCreate**
> MessageOut v1MessageCreate(appId, messageIn, withContent, idempotencyKey)

Create Message

Creates a new message and dispatches it to all of the application&#39;s endpoints.  The &#x60;eventId&#x60; is an optional custom unique ID. It&#39;s verified to be unique only up to a day, after that no verification will be made. If a message with the same &#x60;eventId&#x60; already exists for any application in your environment, a 409 conflict error will be returned.  The &#x60;eventType&#x60; indicates the type and schema of the event. All messages of a certain &#x60;eventType&#x60; are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have &#x60;channels&#x60;, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don&#39;t imply a specific message content or schema.  The &#x60;payload&#x60; property is the webhook&#39;s body (the actual webhook message). Xwebhook supports payload sizes of up to ~350kb, though it&#39;s generally a good idea to keep webhook payloads small, probably no larger than 40kb.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageApi apiInstance = new MessageApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    MessageIn messageIn = new MessageIn(); // MessageIn | 
    Boolean withContent = true; // Boolean | When `true` message payloads are included in the response
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      MessageOut result = apiInstance.v1MessageCreate(appId, messageIn, withContent, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#v1MessageCreate");
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
 **messageIn** | [**MessageIn**](MessageIn.md)|  |
 **withContent** | **Boolean**| When &#x60;true&#x60; message payloads are included in the response | [optional] [default to true]
 **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional]

### Return type

[**MessageOut**](MessageOut.md)

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
**413** | Payload too large |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

<a name="v1MessageExpungeContent"></a>
# **v1MessageExpungeContent**
> v1MessageExpungeContent(appId, msgId)

Delete message payload

Delete the given message&#39;s payload. Useful in cases when a message was accidentally sent with sensitive content.  The message can&#39;t be replayed or resent once its payload has been deleted or expired.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageApi apiInstance = new MessageApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    try {
      apiInstance.v1MessageExpungeContent(appId, msgId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#v1MessageExpungeContent");
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

<a name="v1MessageGet"></a>
# **v1MessageGet**
> MessageOut v1MessageGet(appId, msgId, withContent)

Get Message

Get a message by its ID or eventID.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageApi apiInstance = new MessageApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    Boolean withContent = true; // Boolean | When `true` message payloads are included in the response
    try {
      MessageOut result = apiInstance.v1MessageGet(appId, msgId, withContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#v1MessageGet");
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
 **withContent** | **Boolean**| When &#x60;true&#x60; message payloads are included in the response | [optional] [default to true]

### Return type

[**MessageOut**](MessageOut.md)

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

<a name="v1MessageGetRawPayload"></a>
# **v1MessageGetRawPayload**
> MessageRawPayloadOut v1MessageGetRawPayload(appId, msgId)

Get Raw Message Payload

Get a message raw payload by its ID or eventID.

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageApi apiInstance = new MessageApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    String msgId = "unique-msg-identifier"; // String | The msg's ID or UID
    try {
      MessageRawPayloadOut result = apiInstance.v1MessageGetRawPayload(appId, msgId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#v1MessageGetRawPayload");
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

### Return type

[**MessageRawPayloadOut**](MessageRawPayloadOut.md)

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

<a name="v1MessageList"></a>
# **v1MessageList**
> ListResponseMessageOut v1MessageList(appId, limit, iterator, channel, before, after, withContent, tag, eventTypes)

List Messages

List all of the application&#39;s messages.  The &#x60;before&#x60; and &#x60;after&#x60; parameters let you filter all items created before or after a certain date. These can be used alongside an iterator to paginate over results within a certain window.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageApi apiInstance = new MessageApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator returned from a prior invocation
    String channel = "project_1337"; // String | Filter response based on the channel
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | Only include items created after a certain date
    Boolean withContent = true; // Boolean | When `true` message payloads are included in the response
    String tag = "project_1337"; // String | Filter messages matching the provided tag
    Set<String> eventTypes = Arrays.asList(); // Set<String> | Filter response based on the event type
    try {
      ListResponseMessageOut result = apiInstance.v1MessageList(appId, limit, iterator, channel, before, after, withContent, tag, eventTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#v1MessageList");
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
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **channel** | **String**| Filter response based on the channel | [optional]
 **before** | **OffsetDateTime**| Only include items created before a certain date | [optional]
 **after** | **OffsetDateTime**| Only include items created after a certain date | [optional]
 **withContent** | **Boolean**| When &#x60;true&#x60; message payloads are included in the response | [optional] [default to true]
 **tag** | **String**| Filter messages matching the provided tag | [optional]
 **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]

### Return type

[**ListResponseMessageOut**](ListResponseMessageOut.md)

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

<a name="v1MessageStream"></a>
# **v1MessageStream**
> MessageStreamOut v1MessageStream(appId, limit, iterator, eventTypes, channels, after)

Stream Events

Reads the stream of created messages for an application

### Example
```java
// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.MessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    MessageApi apiInstance = new MessageApi(defaultClient);
    String appId = "unique-app-identifier"; // String | The app's ID or UID
    Integer limit = 56; // Integer | Limit the number of returned items
    String iterator = "iterator_example"; // String | The iterator returned from a prior invocation
    Set<String> eventTypes = Arrays.asList(); // Set<String> | Filter response based on the event type
    Set<String> channels = Arrays.asList(); // Set<String> | Filter response based on the event type
    OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      MessageStreamOut result = apiInstance.v1MessageStream(appId, limit, iterator, eventTypes, channels, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#v1MessageStream");
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
 **limit** | **Integer**| Limit the number of returned items | [optional]
 **iterator** | **String**| The iterator returned from a prior invocation | [optional]
 **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]
 **channels** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional]
 **after** | **OffsetDateTime**|  | [optional]

### Return type

[**MessageStreamOut**](MessageStreamOut.md)

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

