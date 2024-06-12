/*
 * Xwebhook API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.1.1
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// ExportEventTypeOut struct for ExportEventTypeOut
type ExportEventTypeOut struct {
	Id string `json:"id"`
	Status BackgroundTaskStatus `json:"status"`
	Task BackgroundTaskType `json:"task"`
}

// NewExportEventTypeOut instantiates a new ExportEventTypeOut object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewExportEventTypeOut(id string, status BackgroundTaskStatus, task BackgroundTaskType) *ExportEventTypeOut {
	this := ExportEventTypeOut{}
	this.Id = id
	this.Status = status
	this.Task = task
	return &this
}

// NewExportEventTypeOutWithDefaults instantiates a new ExportEventTypeOut object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewExportEventTypeOutWithDefaults() *ExportEventTypeOut {
	this := ExportEventTypeOut{}
	return &this
}

// GetId returns the Id field value
func (o *ExportEventTypeOut) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ExportEventTypeOut) GetIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ExportEventTypeOut) SetId(v string) {
	o.Id = v
}

// GetStatus returns the Status field value
func (o *ExportEventTypeOut) GetStatus() BackgroundTaskStatus {
	if o == nil {
		var ret BackgroundTaskStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *ExportEventTypeOut) GetStatusOk() (*BackgroundTaskStatus, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *ExportEventTypeOut) SetStatus(v BackgroundTaskStatus) {
	o.Status = v
}

// GetTask returns the Task field value
func (o *ExportEventTypeOut) GetTask() BackgroundTaskType {
	if o == nil {
		var ret BackgroundTaskType
		return ret
	}

	return o.Task
}

// GetTaskOk returns a tuple with the Task field value
// and a boolean to check if the value has been set.
func (o *ExportEventTypeOut) GetTaskOk() (*BackgroundTaskType, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Task, true
}

// SetTask sets field value
func (o *ExportEventTypeOut) SetTask(v BackgroundTaskType) {
	o.Task = v
}

func (o ExportEventTypeOut) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if true {
		toSerialize["task"] = o.Task
	}
	return json.Marshal(toSerialize)
}

type NullableExportEventTypeOut struct {
	value *ExportEventTypeOut
	isSet bool
}

func (v NullableExportEventTypeOut) Get() *ExportEventTypeOut {
	return v.value
}

func (v *NullableExportEventTypeOut) Set(val *ExportEventTypeOut) {
	v.value = val
	v.isSet = true
}

func (v NullableExportEventTypeOut) IsSet() bool {
	return v.isSet
}

func (v *NullableExportEventTypeOut) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableExportEventTypeOut(val *ExportEventTypeOut) *NullableExportEventTypeOut {
	return &NullableExportEventTypeOut{value: val, isSet: true}
}

func (v NullableExportEventTypeOut) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableExportEventTypeOut) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


