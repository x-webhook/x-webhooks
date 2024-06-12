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

// BorderRadiusConfig struct for BorderRadiusConfig
type BorderRadiusConfig struct {
	Button *BorderRadiusEnum `json:"button,omitempty"`
	Card *BorderRadiusEnum `json:"card,omitempty"`
	Input *BorderRadiusEnum `json:"input,omitempty"`
}

// NewBorderRadiusConfig instantiates a new BorderRadiusConfig object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBorderRadiusConfig() *BorderRadiusConfig {
	this := BorderRadiusConfig{}
	return &this
}

// NewBorderRadiusConfigWithDefaults instantiates a new BorderRadiusConfig object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBorderRadiusConfigWithDefaults() *BorderRadiusConfig {
	this := BorderRadiusConfig{}
	return &this
}

// GetButton returns the Button field value if set, zero value otherwise.
func (o *BorderRadiusConfig) GetButton() BorderRadiusEnum {
	if o == nil || o.Button == nil {
		var ret BorderRadiusEnum
		return ret
	}
	return *o.Button
}

// GetButtonOk returns a tuple with the Button field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BorderRadiusConfig) GetButtonOk() (*BorderRadiusEnum, bool) {
	if o == nil || o.Button == nil {
		return nil, false
	}
	return o.Button, true
}

// HasButton returns a boolean if a field has been set.
func (o *BorderRadiusConfig) HasButton() bool {
	if o != nil && o.Button != nil {
		return true
	}

	return false
}

// SetButton gets a reference to the given BorderRadiusEnum and assigns it to the Button field.
func (o *BorderRadiusConfig) SetButton(v BorderRadiusEnum) {
	o.Button = &v
}

// GetCard returns the Card field value if set, zero value otherwise.
func (o *BorderRadiusConfig) GetCard() BorderRadiusEnum {
	if o == nil || o.Card == nil {
		var ret BorderRadiusEnum
		return ret
	}
	return *o.Card
}

// GetCardOk returns a tuple with the Card field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BorderRadiusConfig) GetCardOk() (*BorderRadiusEnum, bool) {
	if o == nil || o.Card == nil {
		return nil, false
	}
	return o.Card, true
}

// HasCard returns a boolean if a field has been set.
func (o *BorderRadiusConfig) HasCard() bool {
	if o != nil && o.Card != nil {
		return true
	}

	return false
}

// SetCard gets a reference to the given BorderRadiusEnum and assigns it to the Card field.
func (o *BorderRadiusConfig) SetCard(v BorderRadiusEnum) {
	o.Card = &v
}

// GetInput returns the Input field value if set, zero value otherwise.
func (o *BorderRadiusConfig) GetInput() BorderRadiusEnum {
	if o == nil || o.Input == nil {
		var ret BorderRadiusEnum
		return ret
	}
	return *o.Input
}

// GetInputOk returns a tuple with the Input field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BorderRadiusConfig) GetInputOk() (*BorderRadiusEnum, bool) {
	if o == nil || o.Input == nil {
		return nil, false
	}
	return o.Input, true
}

// HasInput returns a boolean if a field has been set.
func (o *BorderRadiusConfig) HasInput() bool {
	if o != nil && o.Input != nil {
		return true
	}

	return false
}

// SetInput gets a reference to the given BorderRadiusEnum and assigns it to the Input field.
func (o *BorderRadiusConfig) SetInput(v BorderRadiusEnum) {
	o.Input = &v
}

func (o BorderRadiusConfig) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Button != nil {
		toSerialize["button"] = o.Button
	}
	if o.Card != nil {
		toSerialize["card"] = o.Card
	}
	if o.Input != nil {
		toSerialize["input"] = o.Input
	}
	return json.Marshal(toSerialize)
}

type NullableBorderRadiusConfig struct {
	value *BorderRadiusConfig
	isSet bool
}

func (v NullableBorderRadiusConfig) Get() *BorderRadiusConfig {
	return v.value
}

func (v *NullableBorderRadiusConfig) Set(val *BorderRadiusConfig) {
	v.value = val
	v.isSet = true
}

func (v NullableBorderRadiusConfig) IsSet() bool {
	return v.isSet
}

func (v *NullableBorderRadiusConfig) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBorderRadiusConfig(val *BorderRadiusConfig) *NullableBorderRadiusConfig {
	return &NullableBorderRadiusConfig{value: val, isSet: true}
}

func (v NullableBorderRadiusConfig) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBorderRadiusConfig) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


