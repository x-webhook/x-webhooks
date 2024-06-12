# ApplicationStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | **string** | The app&#39;s ID | 
**AppUid** | Pointer to **NullableString** | The app&#39;s UID | [optional] 
**MessageDestinations** | **int32** |  | 

## Methods

### NewApplicationStats

`func NewApplicationStats(appId string, messageDestinations int32, ) *ApplicationStats`

NewApplicationStats instantiates a new ApplicationStats object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApplicationStatsWithDefaults

`func NewApplicationStatsWithDefaults() *ApplicationStats`

NewApplicationStatsWithDefaults instantiates a new ApplicationStats object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppId

`func (o *ApplicationStats) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *ApplicationStats) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *ApplicationStats) SetAppId(v string)`

SetAppId sets AppId field to given value.


### GetAppUid

`func (o *ApplicationStats) GetAppUid() string`

GetAppUid returns the AppUid field if non-nil, zero value otherwise.

### GetAppUidOk

`func (o *ApplicationStats) GetAppUidOk() (*string, bool)`

GetAppUidOk returns a tuple with the AppUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppUid

`func (o *ApplicationStats) SetAppUid(v string)`

SetAppUid sets AppUid field to given value.

### HasAppUid

`func (o *ApplicationStats) HasAppUid() bool`

HasAppUid returns a boolean if a field has been set.

### SetAppUidNil

`func (o *ApplicationStats) SetAppUidNil(b bool)`

 SetAppUidNil sets the value for AppUid to be an explicit nil

### UnsetAppUid
`func (o *ApplicationStats) UnsetAppUid()`

UnsetAppUid ensures that no value is present for AppUid, not even an explicit nil
### GetMessageDestinations

`func (o *ApplicationStats) GetMessageDestinations() int32`

GetMessageDestinations returns the MessageDestinations field if non-nil, zero value otherwise.

### GetMessageDestinationsOk

`func (o *ApplicationStats) GetMessageDestinationsOk() (*int32, bool)`

GetMessageDestinationsOk returns a tuple with the MessageDestinations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageDestinations

`func (o *ApplicationStats) SetMessageDestinations(v int32)`

SetMessageDestinations sets MessageDestinations field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


