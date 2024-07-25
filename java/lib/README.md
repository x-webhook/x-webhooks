# openapi-java-client

Xwebhook API
- API version: 1.1.1
  - Build date: 2024-07-25T20:33:19.360168+08:00[Asia/Shanghai]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.1.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.1.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.1.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.auth.*;
import io.openweb3.xwebhook.internal.models.*;
import io.openweb3.xwebhook.internal.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.webhook.openweb3.io");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data after this date
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Filter the range to data before this date
    Integer limit = 50; // Integer | Limit the number of returned items
    String iterator = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | The iterator to use (depends on the chosen ordering)
    try {
      ListResponseApplicationStats result = apiInstance.getAppUsageStatsApiV1AppStatsUsageGet(since, until, limit, iterator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getAppUsageStatsApiV1AppStatsUsageGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.webhook.openweb3.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationApi* | [**getAppUsageStatsApiV1AppStatsUsageGet**](docs/ApplicationApi.md#getAppUsageStatsApiV1AppStatsUsageGet) | **GET** /api/v1/app/stats/usage | Get App Usage Stats
*ApplicationApi* | [**v1ApplicationCreate**](docs/ApplicationApi.md#v1ApplicationCreate) | **POST** /api/v1/app | Create Application
*ApplicationApi* | [**v1ApplicationDelete**](docs/ApplicationApi.md#v1ApplicationDelete) | **DELETE** /api/v1/app/{app_id} | Delete Application
*ApplicationApi* | [**v1ApplicationGet**](docs/ApplicationApi.md#v1ApplicationGet) | **GET** /api/v1/app/{app_id} | Get Application
*ApplicationApi* | [**v1ApplicationGetStats**](docs/ApplicationApi.md#v1ApplicationGetStats) | **GET** /api/v1/app/{app_id}/stats | Get App Stats
*ApplicationApi* | [**v1ApplicationList**](docs/ApplicationApi.md#v1ApplicationList) | **GET** /api/v1/app | List Applications
*ApplicationApi* | [**v1ApplicationPatch**](docs/ApplicationApi.md#v1ApplicationPatch) | **PATCH** /api/v1/app/{app_id} | Patch Application
*ApplicationApi* | [**v1ApplicationUpdate**](docs/ApplicationApi.md#v1ApplicationUpdate) | **PUT** /api/v1/app/{app_id} | Update Application
*AuthenticationApi* | [**v1AuthenticationAppPortalAccess**](docs/AuthenticationApi.md#v1AuthenticationAppPortalAccess) | **POST** /api/v1/auth/app-portal-access/{app_id} | Get Consumer App Portal Access
*AuthenticationApi* | [**v1AuthenticationDashboardAccess**](docs/AuthenticationApi.md#v1AuthenticationDashboardAccess) | **POST** /api/v1/auth/dashboard-access/{app_id} | Dashboard Access
*AuthenticationApi* | [**v1AuthenticationExchangeOneTimeToken**](docs/AuthenticationApi.md#v1AuthenticationExchangeOneTimeToken) | **POST** /api/v1/auth/one-time-token | Exchange One Time Token
*AuthenticationApi* | [**v1AuthenticationExpireAll**](docs/AuthenticationApi.md#v1AuthenticationExpireAll) | **POST** /api/v1/auth/app/{app_id}/expire-all | Expire All
*AuthenticationApi* | [**v1AuthenticationLogout**](docs/AuthenticationApi.md#v1AuthenticationLogout) | **POST** /api/v1/auth/logout | Logout
*BackgroundTasksApi* | [**getBackgroundTask**](docs/BackgroundTasksApi.md#getBackgroundTask) | **GET** /api/v1/background-task/{task_id} | Get Background Task
*BackgroundTasksApi* | [**listBackgroundTasks**](docs/BackgroundTasksApi.md#listBackgroundTasks) | **GET** /api/v1/background-task | List Background Tasks
*BroadcastApi* | [**createBroadcastMessage**](docs/BroadcastApi.md#createBroadcastMessage) | **POST** /api/v1/msg/broadcast | Create Broadcast Message
*EndpointApi* | [**v1EndpointCreate**](docs/EndpointApi.md#v1EndpointCreate) | **POST** /api/v1/app/{app_id}/endpoint | Create Endpoint
*EndpointApi* | [**v1EndpointDelete**](docs/EndpointApi.md#v1EndpointDelete) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Delete Endpoint
*EndpointApi* | [**v1EndpointDeleteMtlsConfig**](docs/EndpointApi.md#v1EndpointDeleteMtlsConfig) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/mtls | Delete Endpoint Mtls Config
*EndpointApi* | [**v1EndpointDeleteOauthConfig**](docs/EndpointApi.md#v1EndpointDeleteOauthConfig) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/oauth | Delete Endpoint Oauth Config
*EndpointApi* | [**v1EndpointGet**](docs/EndpointApi.md#v1EndpointGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Get Endpoint
*EndpointApi* | [**v1EndpointGetHeaders**](docs/EndpointApi.md#v1EndpointGetHeaders) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Get Endpoint Headers
*EndpointApi* | [**v1EndpointGetSecret**](docs/EndpointApi.md#v1EndpointGetSecret) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret | Get Endpoint Secret
*EndpointApi* | [**v1EndpointGetStats**](docs/EndpointApi.md#v1EndpointGetStats) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats | Endpoint Stats
*EndpointApi* | [**v1EndpointList**](docs/EndpointApi.md#v1EndpointList) | **GET** /api/v1/app/{app_id}/endpoint | List Endpoints
*EndpointApi* | [**v1EndpointPatch**](docs/EndpointApi.md#v1EndpointPatch) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Patch Endpoint
*EndpointApi* | [**v1EndpointPatchHeaders**](docs/EndpointApi.md#v1EndpointPatchHeaders) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Patch Endpoint Headers
*EndpointApi* | [**v1EndpointRecover**](docs/EndpointApi.md#v1EndpointRecover) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover | Recover Failed Webhooks
*EndpointApi* | [**v1EndpointReplay**](docs/EndpointApi.md#v1EndpointReplay) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing | Replay Missing Webhooks
*EndpointApi* | [**v1EndpointRotateSecret**](docs/EndpointApi.md#v1EndpointRotateSecret) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate | Rotate Endpoint Secret
*EndpointApi* | [**v1EndpointSendExample**](docs/EndpointApi.md#v1EndpointSendExample) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/send-example | Send Event Type Example Message
*EndpointApi* | [**v1EndpointTransformationGet**](docs/EndpointApi.md#v1EndpointTransformationGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Get Endpoint Transformation
*EndpointApi* | [**v1EndpointTransformationPartialUpdate**](docs/EndpointApi.md#v1EndpointTransformationPartialUpdate) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Set Endpoint Transformation
*EndpointApi* | [**v1EndpointTransformationSimulate**](docs/EndpointApi.md#v1EndpointTransformationSimulate) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation/simulate | Simulate
*EndpointApi* | [**v1EndpointUpdate**](docs/EndpointApi.md#v1EndpointUpdate) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Update Endpoint
*EndpointApi* | [**v1EndpointUpdateHeaders**](docs/EndpointApi.md#v1EndpointUpdateHeaders) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Update Endpoint Headers
*EndpointApi* | [**v1EndpointUpdateMtlsConfig**](docs/EndpointApi.md#v1EndpointUpdateMtlsConfig) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/mtls | Update Endpoint Mtls Config
*EndpointApi* | [**v1EndpointUpdateOauthConfig**](docs/EndpointApi.md#v1EndpointUpdateOauthConfig) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/oauth | Update Endpoint Oauth Config
*EnvironmentApi* | [**v1EnvironmentExport**](docs/EnvironmentApi.md#v1EnvironmentExport) | **POST** /api/v1/environment/export | Export Environment Configuration
*EnvironmentApi* | [**v1EnvironmentExportGet**](docs/EnvironmentApi.md#v1EnvironmentExportGet) | **GET** /api/v1/environment/export | Export Environment Configuration
*EnvironmentApi* | [**v1EnvironmentImport**](docs/EnvironmentApi.md#v1EnvironmentImport) | **POST** /api/v1/environment/import | Import Environment Configuration
*EnvironmentSettingsApi* | [**v1EnvironmentGetSettings**](docs/EnvironmentSettingsApi.md#v1EnvironmentGetSettings) | **GET** /api/v1/environment/settings | Get Org Settings
*EventTypeApi* | [**v1EventTypeCreate**](docs/EventTypeApi.md#v1EventTypeCreate) | **POST** /api/v1/event-type | Create Event Type
*EventTypeApi* | [**v1EventTypeDelete**](docs/EventTypeApi.md#v1EventTypeDelete) | **DELETE** /api/v1/event-type/{event_type_name} | Delete Event Type
*EventTypeApi* | [**v1EventTypeExportOpenapi**](docs/EventTypeApi.md#v1EventTypeExportOpenapi) | **POST** /api/v1/event-type/export/openapi | Event Type Export From Openapi
*EventTypeApi* | [**v1EventTypeGenerateExample**](docs/EventTypeApi.md#v1EventTypeGenerateExample) | **POST** /api/v1/event-type/schema/generate-example | Generate Schema Example
*EventTypeApi* | [**v1EventTypeGet**](docs/EventTypeApi.md#v1EventTypeGet) | **GET** /api/v1/event-type/{event_type_name} | Get Event Type
*EventTypeApi* | [**v1EventTypeGetRetrySchedule**](docs/EventTypeApi.md#v1EventTypeGetRetrySchedule) | **GET** /api/v1/event-type/{event_type_name}/retry-schedule | Get Retry Schedule
*EventTypeApi* | [**v1EventTypeImportOpenapi**](docs/EventTypeApi.md#v1EventTypeImportOpenapi) | **POST** /api/v1/event-type/import/openapi | Event Type Import From Openapi
*EventTypeApi* | [**v1EventTypeList**](docs/EventTypeApi.md#v1EventTypeList) | **GET** /api/v1/event-type | List Event Types
*EventTypeApi* | [**v1EventTypePatch**](docs/EventTypeApi.md#v1EventTypePatch) | **PATCH** /api/v1/event-type/{event_type_name} | Patch Event Type
*EventTypeApi* | [**v1EventTypeUpdate**](docs/EventTypeApi.md#v1EventTypeUpdate) | **PUT** /api/v1/event-type/{event_type_name} | Update Event Type
*EventTypeApi* | [**v1EventTypeUpdateRetrySchedule**](docs/EventTypeApi.md#v1EventTypeUpdateRetrySchedule) | **PUT** /api/v1/event-type/{event_type_name}/retry-schedule | Update Retry Schedule
*EventsApi* | [**v1Events**](docs/EventsApi.md#v1Events) | **GET** /api/v1/events | Events
*HealthApi* | [**v1HealthGet**](docs/HealthApi.md#v1HealthGet) | **GET** /api/v1/health | Health
*InboundApi* | [**v1InboundMsg**](docs/InboundApi.md#v1InboundMsg) | **POST** /api/v1/app/{app_id}/inbound/msg/{inbound_token} | Handle Inbound
*InboundApi* | [**v1InboundRotateUrl**](docs/InboundApi.md#v1InboundRotateUrl) | **POST** /api/v1/app/{app_id}/inbound/rotate-url | Rotate Url
*IntegrationApi* | [**v1IntegrationCreate**](docs/IntegrationApi.md#v1IntegrationCreate) | **POST** /api/v1/app/{app_id}/integration | Create Integration
*IntegrationApi* | [**v1IntegrationDelete**](docs/IntegrationApi.md#v1IntegrationDelete) | **DELETE** /api/v1/app/{app_id}/integration/{integ_id} | Delete Integration
*IntegrationApi* | [**v1IntegrationGet**](docs/IntegrationApi.md#v1IntegrationGet) | **GET** /api/v1/app/{app_id}/integration/{integ_id} | Get Integration
*IntegrationApi* | [**v1IntegrationGetKey**](docs/IntegrationApi.md#v1IntegrationGetKey) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/key | Get Integration Key
*IntegrationApi* | [**v1IntegrationList**](docs/IntegrationApi.md#v1IntegrationList) | **GET** /api/v1/app/{app_id}/integration | List Integrations
*IntegrationApi* | [**v1IntegrationRotateKey**](docs/IntegrationApi.md#v1IntegrationRotateKey) | **POST** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate | Rotate Integration Key
*IntegrationApi* | [**v1IntegrationUpdate**](docs/IntegrationApi.md#v1IntegrationUpdate) | **PUT** /api/v1/app/{app_id}/integration/{integ_id} | Update Integration
*MessageApi* | [**createMessageAttemptForEndpoint**](docs/MessageApi.md#createMessageAttemptForEndpoint) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/test-attempt | Create Message Attempt For Endpoint
*MessageApi* | [**v1MessageCreate**](docs/MessageApi.md#v1MessageCreate) | **POST** /api/v1/app/{app_id}/msg | Create Message
*MessageApi* | [**v1MessageExpungeContent**](docs/MessageApi.md#v1MessageExpungeContent) | **DELETE** /api/v1/app/{app_id}/msg/{msg_id}/content | Delete message payload
*MessageApi* | [**v1MessageGet**](docs/MessageApi.md#v1MessageGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id} | Get Message
*MessageApi* | [**v1MessageGetRawPayload**](docs/MessageApi.md#v1MessageGetRawPayload) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/raw | Get Raw Message Payload
*MessageApi* | [**v1MessageList**](docs/MessageApi.md#v1MessageList) | **GET** /api/v1/app/{app_id}/msg | List Messages
*MessageApi* | [**v1MessageStream**](docs/MessageApi.md#v1MessageStream) | **GET** /api/v1/app/{app_id}/events | Stream Events
*MessageAttemptApi* | [**v1MessageAttemptExpungeContent**](docs/MessageAttemptApi.md#v1MessageAttemptExpungeContent) | **DELETE** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/content | Delete attempt response body
*MessageAttemptApi* | [**v1MessageAttemptGet**](docs/MessageAttemptApi.md#v1MessageAttemptGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id} | Get Attempt
*MessageAttemptApi* | [**v1MessageAttemptGetHeaders**](docs/MessageAttemptApi.md#v1MessageAttemptGetHeaders) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/headers | Get Attempt Headers
*MessageAttemptApi* | [**v1MessageAttemptListAttemptedDestinations**](docs/MessageAttemptApi.md#v1MessageAttemptListAttemptedDestinations) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint | List Attempted Destinations
*MessageAttemptApi* | [**v1MessageAttemptListAttemptedMessages**](docs/MessageAttemptApi.md#v1MessageAttemptListAttemptedMessages) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg | List Attempted Messages
*MessageAttemptApi* | [**v1MessageAttemptListByEndpoint**](docs/MessageAttemptApi.md#v1MessageAttemptListByEndpoint) | **GET** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id} | List Attempts By Endpoint
*MessageAttemptApi* | [**v1MessageAttemptListByEndpointDeprecated**](docs/MessageAttemptApi.md#v1MessageAttemptListByEndpointDeprecated) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt | List Attempts For Endpoint
*MessageAttemptApi* | [**v1MessageAttemptListByMsg**](docs/MessageAttemptApi.md#v1MessageAttemptListByMsg) | **GET** /api/v1/app/{app_id}/attempt/msg/{msg_id} | List Attempts By Msg
*MessageAttemptApi* | [**v1MessageAttemptListByMsgDeprecated**](docs/MessageAttemptApi.md#v1MessageAttemptListByMsgDeprecated) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt | List Attempts
*MessageAttemptApi* | [**v1MessageAttemptResend**](docs/MessageAttemptApi.md#v1MessageAttemptResend) | **POST** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend | Resend Webhook
*StatisticsApi* | [**v1StatisticsAggregateAppStats**](docs/StatisticsApi.md#v1StatisticsAggregateAppStats) | **POST** /api/v1/stats/usage/app | Aggregate App Stats
*StatisticsApi* | [**v1StatisticsAggregateEventTypes**](docs/StatisticsApi.md#v1StatisticsAggregateEventTypes) | **PUT** /api/v1/stats/usage/event-types | Aggregate Event Types
*StatisticsApi* | [**v1StatsAppAttempts**](docs/StatisticsApi.md#v1StatsAppAttempts) | **GET** /api/v1/stats/app/{app_id}/attempt | Get App Attempt Stats
*StatisticsApi* | [**v1StatsEndpointAttempts**](docs/StatisticsApi.md#v1StatsEndpointAttempts) | **GET** /api/v1/stats/app/{app_id}/ep/{endpoint_id}/attempt | Get Ep Stats
*TransformationTemplateApi* | [**v1EndpointUpdateHubspotOauthConfig**](docs/TransformationTemplateApi.md#v1EndpointUpdateHubspotOauthConfig) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation-template/oauth/hubspot | Update Hubspot Oauth Config
*TransformationTemplateApi* | [**v1TransformationTemplateCreate**](docs/TransformationTemplateApi.md#v1TransformationTemplateCreate) | **POST** /api/v1/transformation-template | Create Transformation Template
*TransformationTemplateApi* | [**v1TransformationTemplateDelete**](docs/TransformationTemplateApi.md#v1TransformationTemplateDelete) | **DELETE** /api/v1/transformation-template/{transformation_template_id} | Delete Transformation Template
*TransformationTemplateApi* | [**v1TransformationTemplateGenerate**](docs/TransformationTemplateApi.md#v1TransformationTemplateGenerate) | **POST** /api/v1/transformation-template/generate | Generate
*TransformationTemplateApi* | [**v1TransformationTemplateGet**](docs/TransformationTemplateApi.md#v1TransformationTemplateGet) | **GET** /api/v1/transformation-template/{transformation_template_id} | Get Transformation Template
*TransformationTemplateApi* | [**v1TransformationTemplateList**](docs/TransformationTemplateApi.md#v1TransformationTemplateList) | **GET** /api/v1/transformation-template | List Transformation Templates
*TransformationTemplateApi* | [**v1TransformationTemplateOauthDiscord**](docs/TransformationTemplateApi.md#v1TransformationTemplateOauthDiscord) | **POST** /api/v1/transformation-template/oauth/discord | Authorize Discord
*TransformationTemplateApi* | [**v1TransformationTemplateOauthHubspot**](docs/TransformationTemplateApi.md#v1TransformationTemplateOauthHubspot) | **POST** /api/v1/transformation-template/oauth/hubspot | Authorize Hubspot
*TransformationTemplateApi* | [**v1TransformationTemplateOauthSlack**](docs/TransformationTemplateApi.md#v1TransformationTemplateOauthSlack) | **POST** /api/v1/transformation-template/oauth/slack | Authorize Slack
*TransformationTemplateApi* | [**v1TransformationTemplatePatch**](docs/TransformationTemplateApi.md#v1TransformationTemplatePatch) | **PATCH** /api/v1/transformation-template/{transformation_template_id} | Patch Transformation Template
*TransformationTemplateApi* | [**v1TransformationTemplateSimulate**](docs/TransformationTemplateApi.md#v1TransformationTemplateSimulate) | **POST** /api/v1/transformation-template/simulate | Simulate
*TransformationTemplateApi* | [**v1TransformationTemplateUpdate**](docs/TransformationTemplateApi.md#v1TransformationTemplateUpdate) | **PUT** /api/v1/transformation-template/{transformation_template_id} | Update Transformation Template


## Documentation for Models

 - [AggregateEventTypesOut](docs/AggregateEventTypesOut.md)
 - [AppPortalAccessIn](docs/AppPortalAccessIn.md)
 - [AppPortalAccessOut](docs/AppPortalAccessOut.md)
 - [AppUsageStatsIn](docs/AppUsageStatsIn.md)
 - [AppUsageStatsOut](docs/AppUsageStatsOut.md)
 - [ApplicationIn](docs/ApplicationIn.md)
 - [ApplicationOut](docs/ApplicationOut.md)
 - [ApplicationPatch](docs/ApplicationPatch.md)
 - [ApplicationStats](docs/ApplicationStats.md)
 - [ApplicationTokenExpireIn](docs/ApplicationTokenExpireIn.md)
 - [AttemptStatisticsData](docs/AttemptStatisticsData.md)
 - [AttemptStatisticsResponse](docs/AttemptStatisticsResponse.md)
 - [BackgroundTaskOut](docs/BackgroundTaskOut.md)
 - [BackgroundTaskStatus](docs/BackgroundTaskStatus.md)
 - [BackgroundTaskType](docs/BackgroundTaskType.md)
 - [BorderRadiusConfig](docs/BorderRadiusConfig.md)
 - [BorderRadiusEnum](docs/BorderRadiusEnum.md)
 - [ClientSecretJwtParamsIn](docs/ClientSecretJwtParamsIn.md)
 - [CompletionChoice](docs/CompletionChoice.md)
 - [CompletionMessage](docs/CompletionMessage.md)
 - [CustomColorPalette](docs/CustomColorPalette.md)
 - [CustomThemeOverride](docs/CustomThemeOverride.md)
 - [DashboardAccessOut](docs/DashboardAccessOut.md)
 - [Duration](docs/Duration.md)
 - [EndpointCreatedEvent](docs/EndpointCreatedEvent.md)
 - [EndpointCreatedEventData](docs/EndpointCreatedEventData.md)
 - [EndpointDeletedEvent](docs/EndpointDeletedEvent.md)
 - [EndpointDeletedEventData](docs/EndpointDeletedEventData.md)
 - [EndpointDisabledEvent](docs/EndpointDisabledEvent.md)
 - [EndpointDisabledEventData](docs/EndpointDisabledEventData.md)
 - [EndpointHeadersIn](docs/EndpointHeadersIn.md)
 - [EndpointHeadersOut](docs/EndpointHeadersOut.md)
 - [EndpointHeadersPatchIn](docs/EndpointHeadersPatchIn.md)
 - [EndpointIn](docs/EndpointIn.md)
 - [EndpointMessageOut](docs/EndpointMessageOut.md)
 - [EndpointMtlsConfigIn](docs/EndpointMtlsConfigIn.md)
 - [EndpointOauthConfigIn](docs/EndpointOauthConfigIn.md)
 - [EndpointOut](docs/EndpointOut.md)
 - [EndpointPatch](docs/EndpointPatch.md)
 - [EndpointSecretOut](docs/EndpointSecretOut.md)
 - [EndpointSecretRotateIn](docs/EndpointSecretRotateIn.md)
 - [EndpointStats](docs/EndpointStats.md)
 - [EndpointTransformationIn](docs/EndpointTransformationIn.md)
 - [EndpointTransformationOut](docs/EndpointTransformationOut.md)
 - [EndpointTransformationSimulateIn](docs/EndpointTransformationSimulateIn.md)
 - [EndpointTransformationSimulateOut](docs/EndpointTransformationSimulateOut.md)
 - [EndpointUpdate](docs/EndpointUpdate.md)
 - [EndpointUpdatedEvent](docs/EndpointUpdatedEvent.md)
 - [EndpointUpdatedEventData](docs/EndpointUpdatedEventData.md)
 - [EnvironmentIn](docs/EnvironmentIn.md)
 - [EnvironmentOut](docs/EnvironmentOut.md)
 - [EnvironmentSettingsOut](docs/EnvironmentSettingsOut.md)
 - [EventExampleIn](docs/EventExampleIn.md)
 - [EventTypeExampleOut](docs/EventTypeExampleOut.md)
 - [EventTypeFromOpenApi](docs/EventTypeFromOpenApi.md)
 - [EventTypeImportOpenApiIn](docs/EventTypeImportOpenApiIn.md)
 - [EventTypeImportOpenApiOut](docs/EventTypeImportOpenApiOut.md)
 - [EventTypeImportOpenApiOutData](docs/EventTypeImportOpenApiOutData.md)
 - [EventTypeIn](docs/EventTypeIn.md)
 - [EventTypeOut](docs/EventTypeOut.md)
 - [EventTypePatch](docs/EventTypePatch.md)
 - [EventTypeSchemaIn](docs/EventTypeSchemaIn.md)
 - [EventTypeUpdate](docs/EventTypeUpdate.md)
 - [ExportEventTypeOut](docs/ExportEventTypeOut.md)
 - [FontSizeConfig](docs/FontSizeConfig.md)
 - [GenerateIn](docs/GenerateIn.md)
 - [GenerateOut](docs/GenerateOut.md)
 - [HTTPValidationError](docs/HTTPValidationError.md)
 - [HttpErrorOut](docs/HttpErrorOut.md)
 - [HubspotOauthConfigIn](docs/HubspotOauthConfigIn.md)
 - [InboundPathParams](docs/InboundPathParams.md)
 - [IncomingWebhookPayloadOut](docs/IncomingWebhookPayloadOut.md)
 - [IntegrationIn](docs/IntegrationIn.md)
 - [IntegrationKeyOut](docs/IntegrationKeyOut.md)
 - [IntegrationOut](docs/IntegrationOut.md)
 - [IntegrationUpdate](docs/IntegrationUpdate.md)
 - [ListResponseApplicationOut](docs/ListResponseApplicationOut.md)
 - [ListResponseApplicationStats](docs/ListResponseApplicationStats.md)
 - [ListResponseBackgroundTaskOut](docs/ListResponseBackgroundTaskOut.md)
 - [ListResponseEndpointMessageOut](docs/ListResponseEndpointMessageOut.md)
 - [ListResponseEndpointOut](docs/ListResponseEndpointOut.md)
 - [ListResponseEventTypeOut](docs/ListResponseEventTypeOut.md)
 - [ListResponseIntegrationOut](docs/ListResponseIntegrationOut.md)
 - [ListResponseMessageAttemptEndpointOut](docs/ListResponseMessageAttemptEndpointOut.md)
 - [ListResponseMessageAttemptOut](docs/ListResponseMessageAttemptOut.md)
 - [ListResponseMessageEndpointOut](docs/ListResponseMessageEndpointOut.md)
 - [ListResponseMessageOut](docs/ListResponseMessageOut.md)
 - [ListResponseTemplateOut](docs/ListResponseTemplateOut.md)
 - [MessageAttemptEndpointOut](docs/MessageAttemptEndpointOut.md)
 - [MessageAttemptExhaustedEvent](docs/MessageAttemptExhaustedEvent.md)
 - [MessageAttemptExhaustedEventData](docs/MessageAttemptExhaustedEventData.md)
 - [MessageAttemptFailedData](docs/MessageAttemptFailedData.md)
 - [MessageAttemptFailingEvent](docs/MessageAttemptFailingEvent.md)
 - [MessageAttemptFailingEventData](docs/MessageAttemptFailingEventData.md)
 - [MessageAttemptHeadersOut](docs/MessageAttemptHeadersOut.md)
 - [MessageAttemptOut](docs/MessageAttemptOut.md)
 - [MessageAttemptRecoveredEvent](docs/MessageAttemptRecoveredEvent.md)
 - [MessageAttemptRecoveredEventData](docs/MessageAttemptRecoveredEventData.md)
 - [MessageAttemptTriggerType](docs/MessageAttemptTriggerType.md)
 - [MessageBroadcastIn](docs/MessageBroadcastIn.md)
 - [MessageBroadcastOut](docs/MessageBroadcastOut.md)
 - [MessageEndpointOut](docs/MessageEndpointOut.md)
 - [MessageIn](docs/MessageIn.md)
 - [MessageOut](docs/MessageOut.md)
 - [MessageRawPayloadOut](docs/MessageRawPayloadOut.md)
 - [MessageStatus](docs/MessageStatus.md)
 - [MessageStreamOut](docs/MessageStreamOut.md)
 - [OAuthPayloadIn](docs/OAuthPayloadIn.md)
 - [OAuthPayloadOut](docs/OAuthPayloadOut.md)
 - [Oauth2AuthMethodIn](docs/Oauth2AuthMethodIn.md)
 - [Oauth2GrantTypeIn](docs/Oauth2GrantTypeIn.md)
 - [OauthJwsSigningAlgorithm](docs/OauthJwsSigningAlgorithm.md)
 - [OneTimeTokenIn](docs/OneTimeTokenIn.md)
 - [OneTimeTokenOut](docs/OneTimeTokenOut.md)
 - [Ordering](docs/Ordering.md)
 - [RecoverIn](docs/RecoverIn.md)
 - [RecoverOut](docs/RecoverOut.md)
 - [ReplayIn](docs/ReplayIn.md)
 - [ReplayOut](docs/ReplayOut.md)
 - [RetryScheduleInOut](docs/RetryScheduleInOut.md)
 - [RotatedUrlOut](docs/RotatedUrlOut.md)
 - [SettingsIn](docs/SettingsIn.md)
 - [SettingsOut](docs/SettingsOut.md)
 - [StatisticsPeriod](docs/StatisticsPeriod.md)
 - [StatusCodeClass](docs/StatusCodeClass.md)
 - [TemplateIn](docs/TemplateIn.md)
 - [TemplateOut](docs/TemplateOut.md)
 - [TemplatePatch](docs/TemplatePatch.md)
 - [TemplateUpdate](docs/TemplateUpdate.md)
 - [TransformationHttpMethod](docs/TransformationHttpMethod.md)
 - [TransformationSimulateIn](docs/TransformationSimulateIn.md)
 - [TransformationSimulateOut](docs/TransformationSimulateOut.md)
 - [TransformationTemplateKind](docs/TransformationTemplateKind.md)
 - [ValidationError](docs/ValidationError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### HTTPBearer

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


