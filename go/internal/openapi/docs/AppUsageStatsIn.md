# AppUsageStatsIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppIds** | Pointer to **[]string** |  | [optional] 
**Since** | **time.Time** |  | 
**Until** | **time.Time** |  | 

## Methods

### NewAppUsageStatsIn

`func NewAppUsageStatsIn(since time.Time, until time.Time, ) *AppUsageStatsIn`

NewAppUsageStatsIn instantiates a new AppUsageStatsIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAppUsageStatsInWithDefaults

`func NewAppUsageStatsInWithDefaults() *AppUsageStatsIn`

NewAppUsageStatsInWithDefaults instantiates a new AppUsageStatsIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppIds

`func (o *AppUsageStatsIn) GetAppIds() []string`

GetAppIds returns the AppIds field if non-nil, zero value otherwise.

### GetAppIdsOk

`func (o *AppUsageStatsIn) GetAppIdsOk() (*[]string, bool)`

GetAppIdsOk returns a tuple with the AppIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppIds

`func (o *AppUsageStatsIn) SetAppIds(v []string)`

SetAppIds sets AppIds field to given value.

### HasAppIds

`func (o *AppUsageStatsIn) HasAppIds() bool`

HasAppIds returns a boolean if a field has been set.

### SetAppIdsNil

`func (o *AppUsageStatsIn) SetAppIdsNil(b bool)`

 SetAppIdsNil sets the value for AppIds to be an explicit nil

### UnsetAppIds
`func (o *AppUsageStatsIn) UnsetAppIds()`

UnsetAppIds ensures that no value is present for AppIds, not even an explicit nil
### GetSince

`func (o *AppUsageStatsIn) GetSince() time.Time`

GetSince returns the Since field if non-nil, zero value otherwise.

### GetSinceOk

`func (o *AppUsageStatsIn) GetSinceOk() (*time.Time, bool)`

GetSinceOk returns a tuple with the Since field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSince

`func (o *AppUsageStatsIn) SetSince(v time.Time)`

SetSince sets Since field to given value.


### GetUntil

`func (o *AppUsageStatsIn) GetUntil() time.Time`

GetUntil returns the Until field if non-nil, zero value otherwise.

### GetUntilOk

`func (o *AppUsageStatsIn) GetUntilOk() (*time.Time, bool)`

GetUntilOk returns a tuple with the Until field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUntil

`func (o *AppUsageStatsIn) SetUntil(v time.Time)`

SetUntil sets Until field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


