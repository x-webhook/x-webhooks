# Go API client for openapi

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

- API version: 1.1.1
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.GoClientCodegen

## Installation

Install the following dependencies:

```shell
go get github.com/stretchr/testify/assert
go get golang.org/x/oauth2
go get golang.org/x/net/context
```

Put the package under your project folder and add the following in import:

```golang
import sw "./openapi"
```

To use a proxy, set the environment variable `HTTP_PROXY`:

```golang
os.Setenv("HTTP_PROXY", "http://proxy_name:proxy_port")
```

## Configuration of Server URL

Default configuration comes with `Servers` field that contains server objects as defined in the OpenAPI specification.

### Select Server Configuration

For using other server than the one defined on index 0 set context value `sw.ContextServerIndex` of type `int`.

```golang
ctx := context.WithValue(context.Background(), sw.ContextServerIndex, 1)
```

### Templated Server URL

Templated server URL is formatted using default variables from configuration or from context value `sw.ContextServerVariables` of type `map[string]string`.

```golang
ctx := context.WithValue(context.Background(), sw.ContextServerVariables, map[string]string{
	"basePath": "v2",
})
```

Note, enum values are always validated and all unused variables are silently ignored.

### URLs Configuration per Operation

Each operation can use different server URL defined using `OperationServers` map in the `Configuration`.
An operation is uniquely identifield by `"{classname}Service.{nickname}"` string.
Similar rules for overriding default operation server index and variables applies by using `sw.ContextOperationServerIndices` and `sw.ContextOperationServerVariables` context maps.

```
ctx := context.WithValue(context.Background(), sw.ContextOperationServerIndices, map[string]int{
	"{classname}Service.{nickname}": 2,
})
ctx = context.WithValue(context.Background(), sw.ContextOperationServerVariables, map[string]map[string]string{
	"{classname}Service.{nickname}": {
		"port": "8443",
	},
})
```

## Documentation for API Endpoints

All URIs are relative to *https://api.webhook.openweb3.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationApi* | [**GetAppUsageStatsApiV1AppStatsUsageGet**](docs/ApplicationApi.md#getappusagestatsapiv1appstatsusageget) | **Get** /api/v1/app/stats/usage | Get App Usage Stats
*ApplicationApi* | [**V1ApplicationCreate**](docs/ApplicationApi.md#v1applicationcreate) | **Post** /api/v1/app | Create Application
*ApplicationApi* | [**V1ApplicationDelete**](docs/ApplicationApi.md#v1applicationdelete) | **Delete** /api/v1/app/{app_id} | Delete Application
*ApplicationApi* | [**V1ApplicationGet**](docs/ApplicationApi.md#v1applicationget) | **Get** /api/v1/app/{app_id} | Get Application
*ApplicationApi* | [**V1ApplicationGetStats**](docs/ApplicationApi.md#v1applicationgetstats) | **Get** /api/v1/app/{app_id}/stats | Get App Stats
*ApplicationApi* | [**V1ApplicationList**](docs/ApplicationApi.md#v1applicationlist) | **Get** /api/v1/app | List Applications
*ApplicationApi* | [**V1ApplicationPatch**](docs/ApplicationApi.md#v1applicationpatch) | **Patch** /api/v1/app/{app_id} | Patch Application
*ApplicationApi* | [**V1ApplicationUpdate**](docs/ApplicationApi.md#v1applicationupdate) | **Put** /api/v1/app/{app_id} | Update Application
*AuthenticationApi* | [**V1AuthenticationAppPortalAccess**](docs/AuthenticationApi.md#v1authenticationappportalaccess) | **Post** /api/v1/auth/app-portal-access/{app_id} | Get Consumer App Portal Access
*AuthenticationApi* | [**V1AuthenticationDashboardAccess**](docs/AuthenticationApi.md#v1authenticationdashboardaccess) | **Post** /api/v1/auth/dashboard-access/{app_id} | Dashboard Access
*AuthenticationApi* | [**V1AuthenticationExchangeOneTimeToken**](docs/AuthenticationApi.md#v1authenticationexchangeonetimetoken) | **Post** /api/v1/auth/one-time-token | Exchange One Time Token
*AuthenticationApi* | [**V1AuthenticationExpireAll**](docs/AuthenticationApi.md#v1authenticationexpireall) | **Post** /api/v1/auth/app/{app_id}/expire-all | Expire All
*AuthenticationApi* | [**V1AuthenticationLogout**](docs/AuthenticationApi.md#v1authenticationlogout) | **Post** /api/v1/auth/logout | Logout
*BackgroundTasksApi* | [**GetBackgroundTask**](docs/BackgroundTasksApi.md#getbackgroundtask) | **Get** /api/v1/background-task/{task_id} | Get Background Task
*BackgroundTasksApi* | [**ListBackgroundTasks**](docs/BackgroundTasksApi.md#listbackgroundtasks) | **Get** /api/v1/background-task | List Background Tasks
*BroadcastApi* | [**CreateBroadcastMessage**](docs/BroadcastApi.md#createbroadcastmessage) | **Post** /api/v1/msg/broadcast | Create Broadcast Message
*EndpointApi* | [**V1EndpointCreate**](docs/EndpointApi.md#v1endpointcreate) | **Post** /api/v1/app/{app_id}/endpoint | Create Endpoint
*EndpointApi* | [**V1EndpointDelete**](docs/EndpointApi.md#v1endpointdelete) | **Delete** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Delete Endpoint
*EndpointApi* | [**V1EndpointDeleteMtlsConfig**](docs/EndpointApi.md#v1endpointdeletemtlsconfig) | **Delete** /api/v1/app/{app_id}/endpoint/{endpoint_id}/mtls | Delete Endpoint Mtls Config
*EndpointApi* | [**V1EndpointDeleteOauthConfig**](docs/EndpointApi.md#v1endpointdeleteoauthconfig) | **Delete** /api/v1/app/{app_id}/endpoint/{endpoint_id}/oauth | Delete Endpoint Oauth Config
*EndpointApi* | [**V1EndpointGet**](docs/EndpointApi.md#v1endpointget) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Get Endpoint
*EndpointApi* | [**V1EndpointGetHeaders**](docs/EndpointApi.md#v1endpointgetheaders) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Get Endpoint Headers
*EndpointApi* | [**V1EndpointGetSecret**](docs/EndpointApi.md#v1endpointgetsecret) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret | Get Endpoint Secret
*EndpointApi* | [**V1EndpointGetStats**](docs/EndpointApi.md#v1endpointgetstats) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats | Endpoint Stats
*EndpointApi* | [**V1EndpointList**](docs/EndpointApi.md#v1endpointlist) | **Get** /api/v1/app/{app_id}/endpoint | List Endpoints
*EndpointApi* | [**V1EndpointPatch**](docs/EndpointApi.md#v1endpointpatch) | **Patch** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Patch Endpoint
*EndpointApi* | [**V1EndpointPatchHeaders**](docs/EndpointApi.md#v1endpointpatchheaders) | **Patch** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Patch Endpoint Headers
*EndpointApi* | [**V1EndpointRecover**](docs/EndpointApi.md#v1endpointrecover) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover | Recover Failed Webhooks
*EndpointApi* | [**V1EndpointReplay**](docs/EndpointApi.md#v1endpointreplay) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing | Replay Missing Webhooks
*EndpointApi* | [**V1EndpointRotateSecret**](docs/EndpointApi.md#v1endpointrotatesecret) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate | Rotate Endpoint Secret
*EndpointApi* | [**V1EndpointSendExample**](docs/EndpointApi.md#v1endpointsendexample) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/send-example | Send Event Type Example Message
*EndpointApi* | [**V1EndpointTransformationGet**](docs/EndpointApi.md#v1endpointtransformationget) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Get Endpoint Transformation
*EndpointApi* | [**V1EndpointTransformationPartialUpdate**](docs/EndpointApi.md#v1endpointtransformationpartialupdate) | **Patch** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Set Endpoint Transformation
*EndpointApi* | [**V1EndpointTransformationSimulate**](docs/EndpointApi.md#v1endpointtransformationsimulate) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation/simulate | Simulate
*EndpointApi* | [**V1EndpointUpdate**](docs/EndpointApi.md#v1endpointupdate) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Update Endpoint
*EndpointApi* | [**V1EndpointUpdateHeaders**](docs/EndpointApi.md#v1endpointupdateheaders) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Update Endpoint Headers
*EndpointApi* | [**V1EndpointUpdateMtlsConfig**](docs/EndpointApi.md#v1endpointupdatemtlsconfig) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/mtls | Update Endpoint Mtls Config
*EndpointApi* | [**V1EndpointUpdateOauthConfig**](docs/EndpointApi.md#v1endpointupdateoauthconfig) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/oauth | Update Endpoint Oauth Config
*EnvironmentApi* | [**V1EnvironmentExport**](docs/EnvironmentApi.md#v1environmentexport) | **Post** /api/v1/environment/export | Export Environment Configuration
*EnvironmentApi* | [**V1EnvironmentExportGet**](docs/EnvironmentApi.md#v1environmentexportget) | **Get** /api/v1/environment/export | Export Environment Configuration
*EnvironmentApi* | [**V1EnvironmentImport**](docs/EnvironmentApi.md#v1environmentimport) | **Post** /api/v1/environment/import | Import Environment Configuration
*EnvironmentSettingsApi* | [**V1EnvironmentGetSettings**](docs/EnvironmentSettingsApi.md#v1environmentgetsettings) | **Get** /api/v1/environment/settings | Get Org Settings
*EventTypeApi* | [**V1EventTypeCreate**](docs/EventTypeApi.md#v1eventtypecreate) | **Post** /api/v1/event-type | Create Event Type
*EventTypeApi* | [**V1EventTypeDelete**](docs/EventTypeApi.md#v1eventtypedelete) | **Delete** /api/v1/event-type/{event_type_name} | Delete Event Type
*EventTypeApi* | [**V1EventTypeExportOpenapi**](docs/EventTypeApi.md#v1eventtypeexportopenapi) | **Post** /api/v1/event-type/export/openapi | Event Type Export From Openapi
*EventTypeApi* | [**V1EventTypeGenerateExample**](docs/EventTypeApi.md#v1eventtypegenerateexample) | **Post** /api/v1/event-type/schema/generate-example | Generate Schema Example
*EventTypeApi* | [**V1EventTypeGet**](docs/EventTypeApi.md#v1eventtypeget) | **Get** /api/v1/event-type/{event_type_name} | Get Event Type
*EventTypeApi* | [**V1EventTypeGetRetrySchedule**](docs/EventTypeApi.md#v1eventtypegetretryschedule) | **Get** /api/v1/event-type/{event_type_name}/retry-schedule | Get Retry Schedule
*EventTypeApi* | [**V1EventTypeImportOpenapi**](docs/EventTypeApi.md#v1eventtypeimportopenapi) | **Post** /api/v1/event-type/import/openapi | Event Type Import From Openapi
*EventTypeApi* | [**V1EventTypeList**](docs/EventTypeApi.md#v1eventtypelist) | **Get** /api/v1/event-type | List Event Types
*EventTypeApi* | [**V1EventTypePatch**](docs/EventTypeApi.md#v1eventtypepatch) | **Patch** /api/v1/event-type/{event_type_name} | Patch Event Type
*EventTypeApi* | [**V1EventTypeUpdate**](docs/EventTypeApi.md#v1eventtypeupdate) | **Put** /api/v1/event-type/{event_type_name} | Update Event Type
*EventTypeApi* | [**V1EventTypeUpdateRetrySchedule**](docs/EventTypeApi.md#v1eventtypeupdateretryschedule) | **Put** /api/v1/event-type/{event_type_name}/retry-schedule | Update Retry Schedule
*EventsApi* | [**V1Events**](docs/EventsApi.md#v1events) | **Get** /api/v1/events | Events
*HealthApi* | [**V1HealthGet**](docs/HealthApi.md#v1healthget) | **Get** /api/v1/health | Health
*InboundApi* | [**V1InboundMsg**](docs/InboundApi.md#v1inboundmsg) | **Post** /api/v1/app/{app_id}/inbound/msg/{inbound_token} | Handle Inbound
*InboundApi* | [**V1InboundRotateUrl**](docs/InboundApi.md#v1inboundrotateurl) | **Post** /api/v1/app/{app_id}/inbound/rotate-url | Rotate Url
*IntegrationApi* | [**V1IntegrationCreate**](docs/IntegrationApi.md#v1integrationcreate) | **Post** /api/v1/app/{app_id}/integration | Create Integration
*IntegrationApi* | [**V1IntegrationDelete**](docs/IntegrationApi.md#v1integrationdelete) | **Delete** /api/v1/app/{app_id}/integration/{integ_id} | Delete Integration
*IntegrationApi* | [**V1IntegrationGet**](docs/IntegrationApi.md#v1integrationget) | **Get** /api/v1/app/{app_id}/integration/{integ_id} | Get Integration
*IntegrationApi* | [**V1IntegrationGetKey**](docs/IntegrationApi.md#v1integrationgetkey) | **Get** /api/v1/app/{app_id}/integration/{integ_id}/key | Get Integration Key
*IntegrationApi* | [**V1IntegrationList**](docs/IntegrationApi.md#v1integrationlist) | **Get** /api/v1/app/{app_id}/integration | List Integrations
*IntegrationApi* | [**V1IntegrationRotateKey**](docs/IntegrationApi.md#v1integrationrotatekey) | **Post** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate | Rotate Integration Key
*IntegrationApi* | [**V1IntegrationUpdate**](docs/IntegrationApi.md#v1integrationupdate) | **Put** /api/v1/app/{app_id}/integration/{integ_id} | Update Integration
*MessageApi* | [**CreateMessageAttemptForEndpoint**](docs/MessageApi.md#createmessageattemptforendpoint) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/test-attempt | Create Message Attempt For Endpoint
*MessageApi* | [**V1MessageCreate**](docs/MessageApi.md#v1messagecreate) | **Post** /api/v1/app/{app_id}/msg | Create Message
*MessageApi* | [**V1MessageExpungeContent**](docs/MessageApi.md#v1messageexpungecontent) | **Delete** /api/v1/app/{app_id}/msg/{msg_id}/content | Delete message payload
*MessageApi* | [**V1MessageGet**](docs/MessageApi.md#v1messageget) | **Get** /api/v1/app/{app_id}/msg/{msg_id} | Get Message
*MessageApi* | [**V1MessageGetRawPayload**](docs/MessageApi.md#v1messagegetrawpayload) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/raw | Get Raw Message Payload
*MessageApi* | [**V1MessageList**](docs/MessageApi.md#v1messagelist) | **Get** /api/v1/app/{app_id}/msg | List Messages
*MessageApi* | [**V1MessageStream**](docs/MessageApi.md#v1messagestream) | **Get** /api/v1/app/{app_id}/events | Stream Events
*MessageAttemptApi* | [**V1MessageAttemptExpungeContent**](docs/MessageAttemptApi.md#v1messageattemptexpungecontent) | **Delete** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/content | Delete attempt response body
*MessageAttemptApi* | [**V1MessageAttemptGet**](docs/MessageAttemptApi.md#v1messageattemptget) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id} | Get Attempt
*MessageAttemptApi* | [**V1MessageAttemptGetHeaders**](docs/MessageAttemptApi.md#v1messageattemptgetheaders) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/headers | Get Attempt Headers
*MessageAttemptApi* | [**V1MessageAttemptListAttemptedDestinations**](docs/MessageAttemptApi.md#v1messageattemptlistattempteddestinations) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/endpoint | List Attempted Destinations
*MessageAttemptApi* | [**V1MessageAttemptListAttemptedMessages**](docs/MessageAttemptApi.md#v1messageattemptlistattemptedmessages) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg | List Attempted Messages
*MessageAttemptApi* | [**V1MessageAttemptListByEndpoint**](docs/MessageAttemptApi.md#v1messageattemptlistbyendpoint) | **Get** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id} | List Attempts By Endpoint
*MessageAttemptApi* | [**V1MessageAttemptListByEndpointDeprecated**](docs/MessageAttemptApi.md#v1messageattemptlistbyendpointdeprecated) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt | List Attempts For Endpoint
*MessageAttemptApi* | [**V1MessageAttemptListByMsg**](docs/MessageAttemptApi.md#v1messageattemptlistbymsg) | **Get** /api/v1/app/{app_id}/attempt/msg/{msg_id} | List Attempts By Msg
*MessageAttemptApi* | [**V1MessageAttemptListByMsgDeprecated**](docs/MessageAttemptApi.md#v1messageattemptlistbymsgdeprecated) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/attempt | List Attempts
*MessageAttemptApi* | [**V1MessageAttemptResend**](docs/MessageAttemptApi.md#v1messageattemptresend) | **Post** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend | Resend Webhook
*StatisticsApi* | [**V1StatisticsAggregateAppStats**](docs/StatisticsApi.md#v1statisticsaggregateappstats) | **Post** /api/v1/stats/usage/app | Aggregate App Stats
*StatisticsApi* | [**V1StatisticsAggregateEventTypes**](docs/StatisticsApi.md#v1statisticsaggregateeventtypes) | **Put** /api/v1/stats/usage/event-types | Aggregate Event Types
*StatisticsApi* | [**V1StatsAppAttempts**](docs/StatisticsApi.md#v1statsappattempts) | **Get** /api/v1/stats/app/{app_id}/attempt | Get App Attempt Stats
*StatisticsApi* | [**V1StatsEndpointAttempts**](docs/StatisticsApi.md#v1statsendpointattempts) | **Get** /api/v1/stats/app/{app_id}/ep/{endpoint_id}/attempt | Get Ep Stats
*TransformationTemplateApi* | [**V1EndpointUpdateHubspotOauthConfig**](docs/TransformationTemplateApi.md#v1endpointupdatehubspotoauthconfig) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation-template/oauth/hubspot | Update Hubspot Oauth Config
*TransformationTemplateApi* | [**V1TransformationTemplateCreate**](docs/TransformationTemplateApi.md#v1transformationtemplatecreate) | **Post** /api/v1/transformation-template | Create Transformation Template
*TransformationTemplateApi* | [**V1TransformationTemplateDelete**](docs/TransformationTemplateApi.md#v1transformationtemplatedelete) | **Delete** /api/v1/transformation-template/{transformation_template_id} | Delete Transformation Template
*TransformationTemplateApi* | [**V1TransformationTemplateGenerate**](docs/TransformationTemplateApi.md#v1transformationtemplategenerate) | **Post** /api/v1/transformation-template/generate | Generate
*TransformationTemplateApi* | [**V1TransformationTemplateGet**](docs/TransformationTemplateApi.md#v1transformationtemplateget) | **Get** /api/v1/transformation-template/{transformation_template_id} | Get Transformation Template
*TransformationTemplateApi* | [**V1TransformationTemplateList**](docs/TransformationTemplateApi.md#v1transformationtemplatelist) | **Get** /api/v1/transformation-template | List Transformation Templates
*TransformationTemplateApi* | [**V1TransformationTemplateOauthDiscord**](docs/TransformationTemplateApi.md#v1transformationtemplateoauthdiscord) | **Post** /api/v1/transformation-template/oauth/discord | Authorize Discord
*TransformationTemplateApi* | [**V1TransformationTemplateOauthHubspot**](docs/TransformationTemplateApi.md#v1transformationtemplateoauthhubspot) | **Post** /api/v1/transformation-template/oauth/hubspot | Authorize Hubspot
*TransformationTemplateApi* | [**V1TransformationTemplateOauthSlack**](docs/TransformationTemplateApi.md#v1transformationtemplateoauthslack) | **Post** /api/v1/transformation-template/oauth/slack | Authorize Slack
*TransformationTemplateApi* | [**V1TransformationTemplatePatch**](docs/TransformationTemplateApi.md#v1transformationtemplatepatch) | **Patch** /api/v1/transformation-template/{transformation_template_id} | Patch Transformation Template
*TransformationTemplateApi* | [**V1TransformationTemplateSimulate**](docs/TransformationTemplateApi.md#v1transformationtemplatesimulate) | **Post** /api/v1/transformation-template/simulate | Simulate
*TransformationTemplateApi* | [**V1TransformationTemplateUpdate**](docs/TransformationTemplateApi.md#v1transformationtemplateupdate) | **Put** /api/v1/transformation-template/{transformation_template_id} | Update Transformation Template


## Documentation For Models

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


## Documentation For Authorization



### HTTPBearer

- **Type**: HTTP Bearer token authentication

Example

```golang
auth := context.WithValue(context.Background(), sw.ContextAccessToken, "BEARERTOKENSTRING")
r, err := client.Service.Operation(auth, args)
```


## Documentation for Utility Methods

Due to the fact that model structure members are all pointers, this package contains
a number of utility functions to easily obtain pointers to values of basic types.
Each of these functions takes a value of the given basic type and returns a pointer to it:

* `PtrBool`
* `PtrInt`
* `PtrInt32`
* `PtrInt64`
* `PtrFloat`
* `PtrFloat32`
* `PtrFloat64`
* `PtrString`
* `PtrTime`

## Author



