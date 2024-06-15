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

// ApplicationIn struct for ApplicationIn
type ApplicationIn struct {
	Metadata *map[string]string `json:"metadata,omitempty"`
	Name string `json:"name"`
	RateLimit NullableInt32 `json:"rateLimit,omitempty"`
	// Optional unique identifier for the application
	Uid NullableString `json:"uid,omitempty"`
	// The application description
	Description NullableString `json:"description,omitempty"`
}

// NewApplicationIn instantiates a new ApplicationIn object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewApplicationIn(name string) *ApplicationIn {
	this := ApplicationIn{}
	this.Name = name
	return &this
}

// NewApplicationInWithDefaults instantiates a new ApplicationIn object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewApplicationInWithDefaults() *ApplicationIn {
	this := ApplicationIn{}
	return &this
}

// GetMetadata returns the Metadata field value if set, zero value otherwise.
func (o *ApplicationIn) GetMetadata() map[string]string {
	if o == nil || o.Metadata == nil {
		var ret map[string]string
		return ret
	}
	return *o.Metadata
}

// GetMetadataOk returns a tuple with the Metadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApplicationIn) GetMetadataOk() (*map[string]string, bool) {
	if o == nil || o.Metadata == nil {
		return nil, false
	}
	return o.Metadata, true
}

// HasMetadata returns a boolean if a field has been set.
func (o *ApplicationIn) HasMetadata() bool {
	if o != nil && o.Metadata != nil {
		return true
	}

	return false
}

// SetMetadata gets a reference to the given map[string]string and assigns it to the Metadata field.
func (o *ApplicationIn) SetMetadata(v map[string]string) {
	o.Metadata = &v
}

// GetName returns the Name field value
func (o *ApplicationIn) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *ApplicationIn) GetNameOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *ApplicationIn) SetName(v string) {
	o.Name = v
}

// GetRateLimit returns the RateLimit field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ApplicationIn) GetRateLimit() int32 {
	if o == nil || o.RateLimit.Get() == nil {
		var ret int32
		return ret
	}
	return *o.RateLimit.Get()
}

// GetRateLimitOk returns a tuple with the RateLimit field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ApplicationIn) GetRateLimitOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return o.RateLimit.Get(), o.RateLimit.IsSet()
}

// HasRateLimit returns a boolean if a field has been set.
func (o *ApplicationIn) HasRateLimit() bool {
	if o != nil && o.RateLimit.IsSet() {
		return true
	}

	return false
}

// SetRateLimit gets a reference to the given NullableInt32 and assigns it to the RateLimit field.
func (o *ApplicationIn) SetRateLimit(v int32) {
	o.RateLimit.Set(&v)
}
// SetRateLimitNil sets the value for RateLimit to be an explicit nil
func (o *ApplicationIn) SetRateLimitNil() {
	o.RateLimit.Set(nil)
}

// UnsetRateLimit ensures that no value is present for RateLimit, not even an explicit nil
func (o *ApplicationIn) UnsetRateLimit() {
	o.RateLimit.Unset()
}

// GetUid returns the Uid field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ApplicationIn) GetUid() string {
	if o == nil || o.Uid.Get() == nil {
		var ret string
		return ret
	}
	return *o.Uid.Get()
}

// GetUidOk returns a tuple with the Uid field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ApplicationIn) GetUidOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Uid.Get(), o.Uid.IsSet()
}

// HasUid returns a boolean if a field has been set.
func (o *ApplicationIn) HasUid() bool {
	if o != nil && o.Uid.IsSet() {
		return true
	}

	return false
}

// SetUid gets a reference to the given NullableString and assigns it to the Uid field.
func (o *ApplicationIn) SetUid(v string) {
	o.Uid.Set(&v)
}
// SetUidNil sets the value for Uid to be an explicit nil
func (o *ApplicationIn) SetUidNil() {
	o.Uid.Set(nil)
}

// UnsetUid ensures that no value is present for Uid, not even an explicit nil
func (o *ApplicationIn) UnsetUid() {
	o.Uid.Unset()
}

// GetDescription returns the Description field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ApplicationIn) GetDescription() string {
	if o == nil || o.Description.Get() == nil {
		var ret string
		return ret
	}
	return *o.Description.Get()
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ApplicationIn) GetDescriptionOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Description.Get(), o.Description.IsSet()
}

// HasDescription returns a boolean if a field has been set.
func (o *ApplicationIn) HasDescription() bool {
	if o != nil && o.Description.IsSet() {
		return true
	}

	return false
}

// SetDescription gets a reference to the given NullableString and assigns it to the Description field.
func (o *ApplicationIn) SetDescription(v string) {
	o.Description.Set(&v)
}
// SetDescriptionNil sets the value for Description to be an explicit nil
func (o *ApplicationIn) SetDescriptionNil() {
	o.Description.Set(nil)
}

// UnsetDescription ensures that no value is present for Description, not even an explicit nil
func (o *ApplicationIn) UnsetDescription() {
	o.Description.Unset()
}

func (o ApplicationIn) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Metadata != nil {
		toSerialize["metadata"] = o.Metadata
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if o.RateLimit.IsSet() {
		toSerialize["rateLimit"] = o.RateLimit.Get()
	}
	if o.Uid.IsSet() {
		toSerialize["uid"] = o.Uid.Get()
	}
	if o.Description.IsSet() {
		toSerialize["description"] = o.Description.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableApplicationIn struct {
	value *ApplicationIn
	isSet bool
}

func (v NullableApplicationIn) Get() *ApplicationIn {
	return v.value
}

func (v *NullableApplicationIn) Set(val *ApplicationIn) {
	v.value = val
	v.isSet = true
}

func (v NullableApplicationIn) IsSet() bool {
	return v.isSet
}

func (v *NullableApplicationIn) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApplicationIn(val *ApplicationIn) *NullableApplicationIn {
	return &NullableApplicationIn{value: val, isSet: true}
}

func (v NullableApplicationIn) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApplicationIn) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


