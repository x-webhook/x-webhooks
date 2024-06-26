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

// EndpointUpdatedEvent Sent when an endpoint is updated.
type EndpointUpdatedEvent struct {
	Data EndpointUpdatedEventData `json:"data"`
	Type string `json:"type"`
}

// NewEndpointUpdatedEvent instantiates a new EndpointUpdatedEvent object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEndpointUpdatedEvent(data EndpointUpdatedEventData, type_ string) *EndpointUpdatedEvent {
	this := EndpointUpdatedEvent{}
	this.Data = data
	this.Type = type_
	return &this
}

// NewEndpointUpdatedEventWithDefaults instantiates a new EndpointUpdatedEvent object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEndpointUpdatedEventWithDefaults() *EndpointUpdatedEvent {
	this := EndpointUpdatedEvent{}
	var type_ string = "endpoint.updated"
	this.Type = type_
	return &this
}

// GetData returns the Data field value
func (o *EndpointUpdatedEvent) GetData() EndpointUpdatedEventData {
	if o == nil {
		var ret EndpointUpdatedEventData
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *EndpointUpdatedEvent) GetDataOk() (*EndpointUpdatedEventData, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Data, true
}

// SetData sets field value
func (o *EndpointUpdatedEvent) SetData(v EndpointUpdatedEventData) {
	o.Data = v
}

// GetType returns the Type field value
func (o *EndpointUpdatedEvent) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *EndpointUpdatedEvent) GetTypeOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *EndpointUpdatedEvent) SetType(v string) {
	o.Type = v
}

func (o EndpointUpdatedEvent) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["data"] = o.Data
	}
	if true {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

type NullableEndpointUpdatedEvent struct {
	value *EndpointUpdatedEvent
	isSet bool
}

func (v NullableEndpointUpdatedEvent) Get() *EndpointUpdatedEvent {
	return v.value
}

func (v *NullableEndpointUpdatedEvent) Set(val *EndpointUpdatedEvent) {
	v.value = val
	v.isSet = true
}

func (v NullableEndpointUpdatedEvent) IsSet() bool {
	return v.isSet
}

func (v *NullableEndpointUpdatedEvent) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEndpointUpdatedEvent(val *EndpointUpdatedEvent) *NullableEndpointUpdatedEvent {
	return &NullableEndpointUpdatedEvent{value: val, isSet: true}
}

func (v NullableEndpointUpdatedEvent) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEndpointUpdatedEvent) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


