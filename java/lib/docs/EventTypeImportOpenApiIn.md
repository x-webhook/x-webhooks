

# EventTypeImportOpenApiIn

Import a list of event types from webhooks defined in an OpenAPI spec.  The OpenAPI spec can be specified as either `spec` given the spec as a JSON object, or as `specRaw` (a `string`) which will be parsed as YAML or JSON by the server. Sending neither or both is invalid, resulting in a `400` **Bad Request**.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dryRun** | **Boolean** | If &#x60;true&#x60;, return the event types that would be modified without actually modifying them. |  [optional]
**spec** | **Map&lt;String, Object&gt;** | A pre-parsed JSON spec. |  [optional]
**specRaw** | **String** | A string, parsed by the server as YAML or JSON. |  [optional]



