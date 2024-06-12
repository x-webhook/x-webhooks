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
	"time"
)

// EnvironmentIn struct for EnvironmentIn
type EnvironmentIn struct {
	CreatedAt time.Time `json:"createdAt"`
	EventTypes []EventTypeIn `json:"eventTypes,omitempty"`
	Settings *SettingsIn `json:"settings,omitempty"`
	Version int32 `json:"version"`
}

// NewEnvironmentIn instantiates a new EnvironmentIn object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEnvironmentIn(createdAt time.Time, version int32) *EnvironmentIn {
	this := EnvironmentIn{}
	this.CreatedAt = createdAt
	this.Version = version
	return &this
}

// NewEnvironmentInWithDefaults instantiates a new EnvironmentIn object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEnvironmentInWithDefaults() *EnvironmentIn {
	this := EnvironmentIn{}
	return &this
}

// GetCreatedAt returns the CreatedAt field value
func (o *EnvironmentIn) GetCreatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *EnvironmentIn) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *EnvironmentIn) SetCreatedAt(v time.Time) {
	o.CreatedAt = v
}

// GetEventTypes returns the EventTypes field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EnvironmentIn) GetEventTypes() []EventTypeIn {
	if o == nil  {
		var ret []EventTypeIn
		return ret
	}
	return o.EventTypes
}

// GetEventTypesOk returns a tuple with the EventTypes field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EnvironmentIn) GetEventTypesOk() (*[]EventTypeIn, bool) {
	if o == nil || o.EventTypes == nil {
		return nil, false
	}
	return &o.EventTypes, true
}

// HasEventTypes returns a boolean if a field has been set.
func (o *EnvironmentIn) HasEventTypes() bool {
	if o != nil && o.EventTypes != nil {
		return true
	}

	return false
}

// SetEventTypes gets a reference to the given []EventTypeIn and assigns it to the EventTypes field.
func (o *EnvironmentIn) SetEventTypes(v []EventTypeIn) {
	o.EventTypes = v
}

// GetSettings returns the Settings field value if set, zero value otherwise.
func (o *EnvironmentIn) GetSettings() SettingsIn {
	if o == nil || o.Settings == nil {
		var ret SettingsIn
		return ret
	}
	return *o.Settings
}

// GetSettingsOk returns a tuple with the Settings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EnvironmentIn) GetSettingsOk() (*SettingsIn, bool) {
	if o == nil || o.Settings == nil {
		return nil, false
	}
	return o.Settings, true
}

// HasSettings returns a boolean if a field has been set.
func (o *EnvironmentIn) HasSettings() bool {
	if o != nil && o.Settings != nil {
		return true
	}

	return false
}

// SetSettings gets a reference to the given SettingsIn and assigns it to the Settings field.
func (o *EnvironmentIn) SetSettings(v SettingsIn) {
	o.Settings = &v
}

// GetVersion returns the Version field value
func (o *EnvironmentIn) GetVersion() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Version
}

// GetVersionOk returns a tuple with the Version field value
// and a boolean to check if the value has been set.
func (o *EnvironmentIn) GetVersionOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Version, true
}

// SetVersion sets field value
func (o *EnvironmentIn) SetVersion(v int32) {
	o.Version = v
}

func (o EnvironmentIn) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["createdAt"] = o.CreatedAt
	}
	if o.EventTypes != nil {
		toSerialize["eventTypes"] = o.EventTypes
	}
	if o.Settings != nil {
		toSerialize["settings"] = o.Settings
	}
	if true {
		toSerialize["version"] = o.Version
	}
	return json.Marshal(toSerialize)
}

type NullableEnvironmentIn struct {
	value *EnvironmentIn
	isSet bool
}

func (v NullableEnvironmentIn) Get() *EnvironmentIn {
	return v.value
}

func (v *NullableEnvironmentIn) Set(val *EnvironmentIn) {
	v.value = val
	v.isSet = true
}

func (v NullableEnvironmentIn) IsSet() bool {
	return v.isSet
}

func (v *NullableEnvironmentIn) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEnvironmentIn(val *EnvironmentIn) *NullableEnvironmentIn {
	return &NullableEnvironmentIn{value: val, isSet: true}
}

func (v NullableEnvironmentIn) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEnvironmentIn) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


