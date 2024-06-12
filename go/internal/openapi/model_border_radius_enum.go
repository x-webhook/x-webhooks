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
	"fmt"
)

// BorderRadiusEnum the model 'BorderRadiusEnum'
type BorderRadiusEnum string

// List of BorderRadiusEnum
const (
	BORDERRADIUSENUM_NONE BorderRadiusEnum = "none"
	BORDERRADIUSENUM_LG BorderRadiusEnum = "lg"
	BORDERRADIUSENUM_MD BorderRadiusEnum = "md"
	BORDERRADIUSENUM_SM BorderRadiusEnum = "sm"
	BORDERRADIUSENUM_FULL BorderRadiusEnum = "full"
)

var allowedBorderRadiusEnumEnumValues = []BorderRadiusEnum{
	"none",
	"lg",
	"md",
	"sm",
	"full",
}

func (v *BorderRadiusEnum) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := BorderRadiusEnum(value)
	for _, existing := range allowedBorderRadiusEnumEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid BorderRadiusEnum", value)
}

// NewBorderRadiusEnumFromValue returns a pointer to a valid BorderRadiusEnum
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewBorderRadiusEnumFromValue(v string) (*BorderRadiusEnum, error) {
	ev := BorderRadiusEnum(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for BorderRadiusEnum: valid values are %v", v, allowedBorderRadiusEnumEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v BorderRadiusEnum) IsValid() bool {
	for _, existing := range allowedBorderRadiusEnumEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to BorderRadiusEnum value
func (v BorderRadiusEnum) Ptr() *BorderRadiusEnum {
	return &v
}

type NullableBorderRadiusEnum struct {
	value *BorderRadiusEnum
	isSet bool
}

func (v NullableBorderRadiusEnum) Get() *BorderRadiusEnum {
	return v.value
}

func (v *NullableBorderRadiusEnum) Set(val *BorderRadiusEnum) {
	v.value = val
	v.isSet = true
}

func (v NullableBorderRadiusEnum) IsSet() bool {
	return v.isSet
}

func (v *NullableBorderRadiusEnum) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBorderRadiusEnum(val *BorderRadiusEnum) *NullableBorderRadiusEnum {
	return &NullableBorderRadiusEnum{value: val, isSet: true}
}

func (v NullableBorderRadiusEnum) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBorderRadiusEnum) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

