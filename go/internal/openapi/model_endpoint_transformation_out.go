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

// EndpointTransformationOut struct for EndpointTransformationOut
type EndpointTransformationOut struct {
	Code NullableString `json:"code,omitempty"`
	Enabled *bool `json:"enabled,omitempty"`
}

// NewEndpointTransformationOut instantiates a new EndpointTransformationOut object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEndpointTransformationOut() *EndpointTransformationOut {
	this := EndpointTransformationOut{}
	var enabled bool = false
	this.Enabled = &enabled
	return &this
}

// NewEndpointTransformationOutWithDefaults instantiates a new EndpointTransformationOut object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEndpointTransformationOutWithDefaults() *EndpointTransformationOut {
	this := EndpointTransformationOut{}
	var enabled bool = false
	this.Enabled = &enabled
	return &this
}

// GetCode returns the Code field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointTransformationOut) GetCode() string {
	if o == nil || o.Code.Get() == nil {
		var ret string
		return ret
	}
	return *o.Code.Get()
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointTransformationOut) GetCodeOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Code.Get(), o.Code.IsSet()
}

// HasCode returns a boolean if a field has been set.
func (o *EndpointTransformationOut) HasCode() bool {
	if o != nil && o.Code.IsSet() {
		return true
	}

	return false
}

// SetCode gets a reference to the given NullableString and assigns it to the Code field.
func (o *EndpointTransformationOut) SetCode(v string) {
	o.Code.Set(&v)
}
// SetCodeNil sets the value for Code to be an explicit nil
func (o *EndpointTransformationOut) SetCodeNil() {
	o.Code.Set(nil)
}

// UnsetCode ensures that no value is present for Code, not even an explicit nil
func (o *EndpointTransformationOut) UnsetCode() {
	o.Code.Unset()
}

// GetEnabled returns the Enabled field value if set, zero value otherwise.
func (o *EndpointTransformationOut) GetEnabled() bool {
	if o == nil || o.Enabled == nil {
		var ret bool
		return ret
	}
	return *o.Enabled
}

// GetEnabledOk returns a tuple with the Enabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EndpointTransformationOut) GetEnabledOk() (*bool, bool) {
	if o == nil || o.Enabled == nil {
		return nil, false
	}
	return o.Enabled, true
}

// HasEnabled returns a boolean if a field has been set.
func (o *EndpointTransformationOut) HasEnabled() bool {
	if o != nil && o.Enabled != nil {
		return true
	}

	return false
}

// SetEnabled gets a reference to the given bool and assigns it to the Enabled field.
func (o *EndpointTransformationOut) SetEnabled(v bool) {
	o.Enabled = &v
}

func (o EndpointTransformationOut) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Code.IsSet() {
		toSerialize["code"] = o.Code.Get()
	}
	if o.Enabled != nil {
		toSerialize["enabled"] = o.Enabled
	}
	return json.Marshal(toSerialize)
}

type NullableEndpointTransformationOut struct {
	value *EndpointTransformationOut
	isSet bool
}

func (v NullableEndpointTransformationOut) Get() *EndpointTransformationOut {
	return v.value
}

func (v *NullableEndpointTransformationOut) Set(val *EndpointTransformationOut) {
	v.value = val
	v.isSet = true
}

func (v NullableEndpointTransformationOut) IsSet() bool {
	return v.isSet
}

func (v *NullableEndpointTransformationOut) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEndpointTransformationOut(val *EndpointTransformationOut) *NullableEndpointTransformationOut {
	return &NullableEndpointTransformationOut{value: val, isSet: true}
}

func (v NullableEndpointTransformationOut) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEndpointTransformationOut) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


