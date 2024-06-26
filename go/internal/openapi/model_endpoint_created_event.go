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

// EndpointCreatedEvent Sent when an endpoint is created.
type EndpointCreatedEvent struct {
	Data EndpointCreatedEventData `json:"data"`
	Type string `json:"type"`
}

// NewEndpointCreatedEvent instantiates a new EndpointCreatedEvent object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEndpointCreatedEvent(data EndpointCreatedEventData, type_ string) *EndpointCreatedEvent {
	this := EndpointCreatedEvent{}
	this.Data = data
	this.Type = type_
	return &this
}

// NewEndpointCreatedEventWithDefaults instantiates a new EndpointCreatedEvent object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEndpointCreatedEventWithDefaults() *EndpointCreatedEvent {
	this := EndpointCreatedEvent{}
	var type_ string = "endpoint.created"
	this.Type = type_
	return &this
}

// GetData returns the Data field value
func (o *EndpointCreatedEvent) GetData() EndpointCreatedEventData {
	if o == nil {
		var ret EndpointCreatedEventData
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *EndpointCreatedEvent) GetDataOk() (*EndpointCreatedEventData, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Data, true
}

// SetData sets field value
func (o *EndpointCreatedEvent) SetData(v EndpointCreatedEventData) {
	o.Data = v
}

// GetType returns the Type field value
func (o *EndpointCreatedEvent) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *EndpointCreatedEvent) GetTypeOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *EndpointCreatedEvent) SetType(v string) {
	o.Type = v
}

func (o EndpointCreatedEvent) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["data"] = o.Data
	}
	if true {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

type NullableEndpointCreatedEvent struct {
	value *EndpointCreatedEvent
	isSet bool
}

func (v NullableEndpointCreatedEvent) Get() *EndpointCreatedEvent {
	return v.value
}

func (v *NullableEndpointCreatedEvent) Set(val *EndpointCreatedEvent) {
	v.value = val
	v.isSet = true
}

func (v NullableEndpointCreatedEvent) IsSet() bool {
	return v.isSet
}

func (v *NullableEndpointCreatedEvent) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEndpointCreatedEvent(val *EndpointCreatedEvent) *NullableEndpointCreatedEvent {
	return &NullableEndpointCreatedEvent{value: val, isSet: true}
}

func (v NullableEndpointCreatedEvent) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEndpointCreatedEvent) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


