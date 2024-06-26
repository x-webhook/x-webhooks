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

// MessageBroadcastOut struct for MessageBroadcastOut
type MessageBroadcastOut struct {
	Id string `json:"id"`
	Status BackgroundTaskStatus `json:"status"`
	Task BackgroundTaskType `json:"task"`
}

// NewMessageBroadcastOut instantiates a new MessageBroadcastOut object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMessageBroadcastOut(id string, status BackgroundTaskStatus, task BackgroundTaskType) *MessageBroadcastOut {
	this := MessageBroadcastOut{}
	this.Id = id
	this.Status = status
	this.Task = task
	return &this
}

// NewMessageBroadcastOutWithDefaults instantiates a new MessageBroadcastOut object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMessageBroadcastOutWithDefaults() *MessageBroadcastOut {
	this := MessageBroadcastOut{}
	return &this
}

// GetId returns the Id field value
func (o *MessageBroadcastOut) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *MessageBroadcastOut) GetIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *MessageBroadcastOut) SetId(v string) {
	o.Id = v
}

// GetStatus returns the Status field value
func (o *MessageBroadcastOut) GetStatus() BackgroundTaskStatus {
	if o == nil {
		var ret BackgroundTaskStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *MessageBroadcastOut) GetStatusOk() (*BackgroundTaskStatus, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *MessageBroadcastOut) SetStatus(v BackgroundTaskStatus) {
	o.Status = v
}

// GetTask returns the Task field value
func (o *MessageBroadcastOut) GetTask() BackgroundTaskType {
	if o == nil {
		var ret BackgroundTaskType
		return ret
	}

	return o.Task
}

// GetTaskOk returns a tuple with the Task field value
// and a boolean to check if the value has been set.
func (o *MessageBroadcastOut) GetTaskOk() (*BackgroundTaskType, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Task, true
}

// SetTask sets field value
func (o *MessageBroadcastOut) SetTask(v BackgroundTaskType) {
	o.Task = v
}

func (o MessageBroadcastOut) MarshalJSON() ([]byte, error) {
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

type NullableMessageBroadcastOut struct {
	value *MessageBroadcastOut
	isSet bool
}

func (v NullableMessageBroadcastOut) Get() *MessageBroadcastOut {
	return v.value
}

func (v *NullableMessageBroadcastOut) Set(val *MessageBroadcastOut) {
	v.value = val
	v.isSet = true
}

func (v NullableMessageBroadcastOut) IsSet() bool {
	return v.isSet
}

func (v *NullableMessageBroadcastOut) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMessageBroadcastOut(val *MessageBroadcastOut) *NullableMessageBroadcastOut {
	return &NullableMessageBroadcastOut{value: val, isSet: true}
}

func (v NullableMessageBroadcastOut) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMessageBroadcastOut) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


