# AttemptStatisticsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**AttemptStatisticsData**](AttemptStatisticsData.md) |  | 
**EndDate** | **time.Time** |  | 
**Period** | [**StatisticsPeriod**](StatisticsPeriod.md) |  | 
**StartDate** | **time.Time** |  | 

## Methods

### NewAttemptStatisticsResponse

`func NewAttemptStatisticsResponse(data AttemptStatisticsData, endDate time.Time, period StatisticsPeriod, startDate time.Time, ) *AttemptStatisticsResponse`

NewAttemptStatisticsResponse instantiates a new AttemptStatisticsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAttemptStatisticsResponseWithDefaults

`func NewAttemptStatisticsResponseWithDefaults() *AttemptStatisticsResponse`

NewAttemptStatisticsResponseWithDefaults instantiates a new AttemptStatisticsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *AttemptStatisticsResponse) GetData() AttemptStatisticsData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *AttemptStatisticsResponse) GetDataOk() (*AttemptStatisticsData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *AttemptStatisticsResponse) SetData(v AttemptStatisticsData)`

SetData sets Data field to given value.


### GetEndDate

`func (o *AttemptStatisticsResponse) GetEndDate() time.Time`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *AttemptStatisticsResponse) GetEndDateOk() (*time.Time, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *AttemptStatisticsResponse) SetEndDate(v time.Time)`

SetEndDate sets EndDate field to given value.


### GetPeriod

`func (o *AttemptStatisticsResponse) GetPeriod() StatisticsPeriod`

GetPeriod returns the Period field if non-nil, zero value otherwise.

### GetPeriodOk

`func (o *AttemptStatisticsResponse) GetPeriodOk() (*StatisticsPeriod, bool)`

GetPeriodOk returns a tuple with the Period field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeriod

`func (o *AttemptStatisticsResponse) SetPeriod(v StatisticsPeriod)`

SetPeriod sets Period field to given value.


### GetStartDate

`func (o *AttemptStatisticsResponse) GetStartDate() time.Time`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *AttemptStatisticsResponse) GetStartDateOk() (*time.Time, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *AttemptStatisticsResponse) SetStartDate(v time.Time)`

SetStartDate sets StartDate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


