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

// RotatedUrlOut struct for RotatedUrlOut
type RotatedUrlOut struct {
	Url string `json:"url"`
}

// NewRotatedUrlOut instantiates a new RotatedUrlOut object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRotatedUrlOut(url string) *RotatedUrlOut {
	this := RotatedUrlOut{}
	this.Url = url
	return &this
}

// NewRotatedUrlOutWithDefaults instantiates a new RotatedUrlOut object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRotatedUrlOutWithDefaults() *RotatedUrlOut {
	this := RotatedUrlOut{}
	return &this
}

// GetUrl returns the Url field value
func (o *RotatedUrlOut) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *RotatedUrlOut) GetUrlOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *RotatedUrlOut) SetUrl(v string) {
	o.Url = v
}

func (o RotatedUrlOut) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["url"] = o.Url
	}
	return json.Marshal(toSerialize)
}

type NullableRotatedUrlOut struct {
	value *RotatedUrlOut
	isSet bool
}

func (v NullableRotatedUrlOut) Get() *RotatedUrlOut {
	return v.value
}

func (v *NullableRotatedUrlOut) Set(val *RotatedUrlOut) {
	v.value = val
	v.isSet = true
}

func (v NullableRotatedUrlOut) IsSet() bool {
	return v.isSet
}

func (v *NullableRotatedUrlOut) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRotatedUrlOut(val *RotatedUrlOut) *NullableRotatedUrlOut {
	return &NullableRotatedUrlOut{value: val, isSet: true}
}

func (v NullableRotatedUrlOut) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRotatedUrlOut) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


