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

// OneTimeTokenOut struct for OneTimeTokenOut
type OneTimeTokenOut struct {
	Token string `json:"token"`
}

// NewOneTimeTokenOut instantiates a new OneTimeTokenOut object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOneTimeTokenOut(token string) *OneTimeTokenOut {
	this := OneTimeTokenOut{}
	this.Token = token
	return &this
}

// NewOneTimeTokenOutWithDefaults instantiates a new OneTimeTokenOut object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOneTimeTokenOutWithDefaults() *OneTimeTokenOut {
	this := OneTimeTokenOut{}
	return &this
}

// GetToken returns the Token field value
func (o *OneTimeTokenOut) GetToken() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Token
}

// GetTokenOk returns a tuple with the Token field value
// and a boolean to check if the value has been set.
func (o *OneTimeTokenOut) GetTokenOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Token, true
}

// SetToken sets field value
func (o *OneTimeTokenOut) SetToken(v string) {
	o.Token = v
}

func (o OneTimeTokenOut) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["token"] = o.Token
	}
	return json.Marshal(toSerialize)
}

type NullableOneTimeTokenOut struct {
	value *OneTimeTokenOut
	isSet bool
}

func (v NullableOneTimeTokenOut) Get() *OneTimeTokenOut {
	return v.value
}

func (v *NullableOneTimeTokenOut) Set(val *OneTimeTokenOut) {
	v.value = val
	v.isSet = true
}

func (v NullableOneTimeTokenOut) IsSet() bool {
	return v.isSet
}

func (v *NullableOneTimeTokenOut) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOneTimeTokenOut(val *OneTimeTokenOut) *NullableOneTimeTokenOut {
	return &NullableOneTimeTokenOut{value: val, isSet: true}
}

func (v NullableOneTimeTokenOut) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOneTimeTokenOut) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


