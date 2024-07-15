

# MessageIn


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | [**ApplicationIn**](ApplicationIn.md) |  |  [optional]
**channels** | **Set&lt;String&gt;** | List of free-form identifiers that endpoints can filter by |  [optional]
**eventId** | **String** | Optional unique identifier for the message |  [optional]
**eventType** | **String** | The event type&#39;s name | 
**payload** | **Object** |  | 
**payloadRetentionPeriod** | **Long** |  |  [optional]
**headers** | **Map&lt;String, String&gt;** |  |  [optional]
**tags** | **Set&lt;String&gt;** | List of free-form tags that can be filtered by when listing messages |  [optional]
**transformationsParams** | **Object** | Extra parameters to pass to Transformations (for future use) |  [optional]



