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

// TransformationSimulateOut struct for TransformationSimulateOut
type TransformationSimulateOut struct {
	Method *TransformationHttpMethod `json:"method,omitempty"`
	Payload string `json:"payload"`
	Url string `json:"url"`
}

// NewTransformationSimulateOut instantiates a new TransformationSimulateOut object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTransformationSimulateOut(payload string, url string) *TransformationSimulateOut {
	this := TransformationSimulateOut{}
	this.Payload = payload
	this.Url = url
	return &this
}

// NewTransformationSimulateOutWithDefaults instantiates a new TransformationSimulateOut object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTransformationSimulateOutWithDefaults() *TransformationSimulateOut {
	this := TransformationSimulateOut{}
	return &this
}

// GetMethod returns the Method field value if set, zero value otherwise.
func (o *TransformationSimulateOut) GetMethod() TransformationHttpMethod {
	if o == nil || o.Method == nil {
		var ret TransformationHttpMethod
		return ret
	}
	return *o.Method
}

// GetMethodOk returns a tuple with the Method field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TransformationSimulateOut) GetMethodOk() (*TransformationHttpMethod, bool) {
	if o == nil || o.Method == nil {
		return nil, false
	}
	return o.Method, true
}

// HasMethod returns a boolean if a field has been set.
func (o *TransformationSimulateOut) HasMethod() bool {
	if o != nil && o.Method != nil {
		return true
	}

	return false
}

// SetMethod gets a reference to the given TransformationHttpMethod and assigns it to the Method field.
func (o *TransformationSimulateOut) SetMethod(v TransformationHttpMethod) {
	o.Method = &v
}

// GetPayload returns the Payload field value
func (o *TransformationSimulateOut) GetPayload() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Payload
}

// GetPayloadOk returns a tuple with the Payload field value
// and a boolean to check if the value has been set.
func (o *TransformationSimulateOut) GetPayloadOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Payload, true
}

// SetPayload sets field value
func (o *TransformationSimulateOut) SetPayload(v string) {
	o.Payload = v
}

// GetUrl returns the Url field value
func (o *TransformationSimulateOut) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *TransformationSimulateOut) GetUrlOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *TransformationSimulateOut) SetUrl(v string) {
	o.Url = v
}

func (o TransformationSimulateOut) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Method != nil {
		toSerialize["method"] = o.Method
	}
	if true {
		toSerialize["payload"] = o.Payload
	}
	if true {
		toSerialize["url"] = o.Url
	}
	return json.Marshal(toSerialize)
}

type NullableTransformationSimulateOut struct {
	value *TransformationSimulateOut
	isSet bool
}

func (v NullableTransformationSimulateOut) Get() *TransformationSimulateOut {
	return v.value
}

func (v *NullableTransformationSimulateOut) Set(val *TransformationSimulateOut) {
	v.value = val
	v.isSet = true
}

func (v NullableTransformationSimulateOut) IsSet() bool {
	return v.isSet
}

func (v *NullableTransformationSimulateOut) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTransformationSimulateOut(val *TransformationSimulateOut) *NullableTransformationSimulateOut {
	return &NullableTransformationSimulateOut{value: val, isSet: true}
}

func (v NullableTransformationSimulateOut) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTransformationSimulateOut) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


