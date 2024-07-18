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

// EndpointUpdate struct for EndpointUpdate
type EndpointUpdate struct {
	// List of message channels this endpoint listens to (omit for all)
	Channels []string `json:"channels,omitempty"`
	Description *string `json:"description,omitempty"`
	Disabled *bool `json:"disabled,omitempty"`
	FilterTypes []string `json:"filterTypes,omitempty"`
	Metadata map[string]interface{} `json:"metadata,omitempty"`
	RateLimit NullableInt32 `json:"rateLimit,omitempty"`
	// Optional unique identifier for the endpoint
	Uid NullableString `json:"uid,omitempty"`
	Url string `json:"url"`
	Version NullableInt32 `json:"version,omitempty"`
}

// NewEndpointUpdate instantiates a new EndpointUpdate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEndpointUpdate(url string) *EndpointUpdate {
	this := EndpointUpdate{}
	var description string = ""
	this.Description = &description
	var disabled bool = false
	this.Disabled = &disabled
	this.Url = url
	var version int32 = 1
	this.Version = *NewNullableInt32(&version)
	return &this
}

// NewEndpointUpdateWithDefaults instantiates a new EndpointUpdate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEndpointUpdateWithDefaults() *EndpointUpdate {
	this := EndpointUpdate{}
	var description string = ""
	this.Description = &description
	var disabled bool = false
	this.Disabled = &disabled
	var version int32 = 1
	this.Version = *NewNullableInt32(&version)
	return &this
}

// GetChannels returns the Channels field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetChannels() []string {
	if o == nil  {
		var ret []string
		return ret
	}
	return o.Channels
}

// GetChannelsOk returns a tuple with the Channels field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetChannelsOk() (*[]string, bool) {
	if o == nil || o.Channels == nil {
		return nil, false
	}
	return &o.Channels, true
}

// HasChannels returns a boolean if a field has been set.
func (o *EndpointUpdate) HasChannels() bool {
	if o != nil && o.Channels != nil {
		return true
	}

	return false
}

// SetChannels gets a reference to the given []string and assigns it to the Channels field.
func (o *EndpointUpdate) SetChannels(v []string) {
	o.Channels = v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *EndpointUpdate) GetDescription() string {
	if o == nil || o.Description == nil {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EndpointUpdate) GetDescriptionOk() (*string, bool) {
	if o == nil || o.Description == nil {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *EndpointUpdate) HasDescription() bool {
	if o != nil && o.Description != nil {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *EndpointUpdate) SetDescription(v string) {
	o.Description = &v
}

// GetDisabled returns the Disabled field value if set, zero value otherwise.
func (o *EndpointUpdate) GetDisabled() bool {
	if o == nil || o.Disabled == nil {
		var ret bool
		return ret
	}
	return *o.Disabled
}

// GetDisabledOk returns a tuple with the Disabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EndpointUpdate) GetDisabledOk() (*bool, bool) {
	if o == nil || o.Disabled == nil {
		return nil, false
	}
	return o.Disabled, true
}

// HasDisabled returns a boolean if a field has been set.
func (o *EndpointUpdate) HasDisabled() bool {
	if o != nil && o.Disabled != nil {
		return true
	}

	return false
}

// SetDisabled gets a reference to the given bool and assigns it to the Disabled field.
func (o *EndpointUpdate) SetDisabled(v bool) {
	o.Disabled = &v
}

// GetFilterTypes returns the FilterTypes field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetFilterTypes() []string {
	if o == nil  {
		var ret []string
		return ret
	}
	return o.FilterTypes
}

// GetFilterTypesOk returns a tuple with the FilterTypes field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetFilterTypesOk() (*[]string, bool) {
	if o == nil || o.FilterTypes == nil {
		return nil, false
	}
	return &o.FilterTypes, true
}

// HasFilterTypes returns a boolean if a field has been set.
func (o *EndpointUpdate) HasFilterTypes() bool {
	if o != nil && o.FilterTypes != nil {
		return true
	}

	return false
}

// SetFilterTypes gets a reference to the given []string and assigns it to the FilterTypes field.
func (o *EndpointUpdate) SetFilterTypes(v []string) {
	o.FilterTypes = v
}

// GetMetadata returns the Metadata field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetMetadata() map[string]interface{} {
	if o == nil  {
		var ret map[string]interface{}
		return ret
	}
	return o.Metadata
}

// GetMetadataOk returns a tuple with the Metadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetMetadataOk() (*map[string]interface{}, bool) {
	if o == nil || o.Metadata == nil {
		return nil, false
	}
	return &o.Metadata, true
}

// HasMetadata returns a boolean if a field has been set.
func (o *EndpointUpdate) HasMetadata() bool {
	if o != nil && o.Metadata != nil {
		return true
	}

	return false
}

// SetMetadata gets a reference to the given map[string]interface{} and assigns it to the Metadata field.
func (o *EndpointUpdate) SetMetadata(v map[string]interface{}) {
	o.Metadata = v
}

// GetRateLimit returns the RateLimit field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetRateLimit() int32 {
	if o == nil || o.RateLimit.Get() == nil {
		var ret int32
		return ret
	}
	return *o.RateLimit.Get()
}

// GetRateLimitOk returns a tuple with the RateLimit field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetRateLimitOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return o.RateLimit.Get(), o.RateLimit.IsSet()
}

// HasRateLimit returns a boolean if a field has been set.
func (o *EndpointUpdate) HasRateLimit() bool {
	if o != nil && o.RateLimit.IsSet() {
		return true
	}

	return false
}

// SetRateLimit gets a reference to the given NullableInt32 and assigns it to the RateLimit field.
func (o *EndpointUpdate) SetRateLimit(v int32) {
	o.RateLimit.Set(&v)
}
// SetRateLimitNil sets the value for RateLimit to be an explicit nil
func (o *EndpointUpdate) SetRateLimitNil() {
	o.RateLimit.Set(nil)
}

// UnsetRateLimit ensures that no value is present for RateLimit, not even an explicit nil
func (o *EndpointUpdate) UnsetRateLimit() {
	o.RateLimit.Unset()
}

// GetUid returns the Uid field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetUid() string {
	if o == nil || o.Uid.Get() == nil {
		var ret string
		return ret
	}
	return *o.Uid.Get()
}

// GetUidOk returns a tuple with the Uid field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetUidOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Uid.Get(), o.Uid.IsSet()
}

// HasUid returns a boolean if a field has been set.
func (o *EndpointUpdate) HasUid() bool {
	if o != nil && o.Uid.IsSet() {
		return true
	}

	return false
}

// SetUid gets a reference to the given NullableString and assigns it to the Uid field.
func (o *EndpointUpdate) SetUid(v string) {
	o.Uid.Set(&v)
}
// SetUidNil sets the value for Uid to be an explicit nil
func (o *EndpointUpdate) SetUidNil() {
	o.Uid.Set(nil)
}

// UnsetUid ensures that no value is present for Uid, not even an explicit nil
func (o *EndpointUpdate) UnsetUid() {
	o.Uid.Unset()
}

// GetUrl returns the Url field value
func (o *EndpointUpdate) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *EndpointUpdate) GetUrlOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *EndpointUpdate) SetUrl(v string) {
	o.Url = v
}

// GetVersion returns the Version field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetVersion() int32 {
	if o == nil || o.Version.Get() == nil {
		var ret int32
		return ret
	}
	return *o.Version.Get()
}

// GetVersionOk returns a tuple with the Version field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetVersionOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Version.Get(), o.Version.IsSet()
}

// HasVersion returns a boolean if a field has been set.
func (o *EndpointUpdate) HasVersion() bool {
	if o != nil && o.Version.IsSet() {
		return true
	}

	return false
}

// SetVersion gets a reference to the given NullableInt32 and assigns it to the Version field.
func (o *EndpointUpdate) SetVersion(v int32) {
	o.Version.Set(&v)
}
// SetVersionNil sets the value for Version to be an explicit nil
func (o *EndpointUpdate) SetVersionNil() {
	o.Version.Set(nil)
}

// UnsetVersion ensures that no value is present for Version, not even an explicit nil
func (o *EndpointUpdate) UnsetVersion() {
	o.Version.Unset()
}

func (o EndpointUpdate) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Channels != nil {
		toSerialize["channels"] = o.Channels
	}
	if o.Description != nil {
		toSerialize["description"] = o.Description
	}
	if o.Disabled != nil {
		toSerialize["disabled"] = o.Disabled
	}
	if o.FilterTypes != nil {
		toSerialize["filterTypes"] = o.FilterTypes
	}
	if o.Metadata != nil {
		toSerialize["metadata"] = o.Metadata
	}
	if o.RateLimit.IsSet() {
		toSerialize["rateLimit"] = o.RateLimit.Get()
	}
	if o.Uid.IsSet() {
		toSerialize["uid"] = o.Uid.Get()
	}
	if true {
		toSerialize["url"] = o.Url
	}
	if o.Version.IsSet() {
		toSerialize["version"] = o.Version.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableEndpointUpdate struct {
	value *EndpointUpdate
	isSet bool
}

func (v NullableEndpointUpdate) Get() *EndpointUpdate {
	return v.value
}

func (v *NullableEndpointUpdate) Set(val *EndpointUpdate) {
	v.value = val
	v.isSet = true
}

func (v NullableEndpointUpdate) IsSet() bool {
	return v.isSet
}

func (v *NullableEndpointUpdate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEndpointUpdate(val *EndpointUpdate) *NullableEndpointUpdate {
	return &NullableEndpointUpdate{value: val, isSet: true}
}

func (v NullableEndpointUpdate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEndpointUpdate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


