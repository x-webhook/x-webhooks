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

// EventExampleIn struct for EventExampleIn
type EventExampleIn struct {
	// The event type's name
	EventType string `json:"eventType"`
}

// NewEventExampleIn instantiates a new EventExampleIn object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEventExampleIn(eventType string) *EventExampleIn {
	this := EventExampleIn{}
	this.EventType = eventType
	return &this
}

// NewEventExampleInWithDefaults instantiates a new EventExampleIn object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEventExampleInWithDefaults() *EventExampleIn {
	this := EventExampleIn{}
	return &this
}

// GetEventType returns the EventType field value
func (o *EventExampleIn) GetEventType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.EventType
}

// GetEventTypeOk returns a tuple with the EventType field value
// and a boolean to check if the value has been set.
func (o *EventExampleIn) GetEventTypeOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.EventType, true
}

// SetEventType sets field value
func (o *EventExampleIn) SetEventType(v string) {
	o.EventType = v
}

func (o EventExampleIn) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["eventType"] = o.EventType
	}
	return json.Marshal(toSerialize)
}

type NullableEventExampleIn struct {
	value *EventExampleIn
	isSet bool
}

func (v NullableEventExampleIn) Get() *EventExampleIn {
	return v.value
}

func (v *NullableEventExampleIn) Set(val *EventExampleIn) {
	v.value = val
	v.isSet = true
}

func (v NullableEventExampleIn) IsSet() bool {
	return v.isSet
}

func (v *NullableEventExampleIn) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEventExampleIn(val *EventExampleIn) *NullableEventExampleIn {
	return &NullableEventExampleIn{value: val, isSet: true}
}

func (v NullableEventExampleIn) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEventExampleIn) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


