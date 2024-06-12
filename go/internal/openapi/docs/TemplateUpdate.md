# TemplateUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** |  | [optional] [default to ""]
**FeatureFlag** | Pointer to **NullableString** |  | [optional] 
**FilterTypes** | Pointer to **[]string** |  | [optional] 
**Instructions** | Pointer to **string** |  | [optional] [default to ""]
**InstructionsLink** | Pointer to **NullableString** |  | [optional] 
**Kind** | Pointer to [**TransformationTemplateKind**](TransformationTemplateKind.md) |  | [optional] 
**Logo** | **string** |  | 
**Name** | Pointer to **string** |  | [optional] [default to ""]
**Transformation** | **string** |  | 

## Methods

### NewTemplateUpdate

`func NewTemplateUpdate(logo string, transformation string, ) *TemplateUpdate`

NewTemplateUpdate instantiates a new TemplateUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTemplateUpdateWithDefaults

`func NewTemplateUpdateWithDefaults() *TemplateUpdate`

NewTemplateUpdateWithDefaults instantiates a new TemplateUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *TemplateUpdate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *TemplateUpdate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *TemplateUpdate) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *TemplateUpdate) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetFeatureFlag

`func (o *TemplateUpdate) GetFeatureFlag() string`

GetFeatureFlag returns the FeatureFlag field if non-nil, zero value otherwise.

### GetFeatureFlagOk

`func (o *TemplateUpdate) GetFeatureFlagOk() (*string, bool)`

GetFeatureFlagOk returns a tuple with the FeatureFlag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeatureFlag

`func (o *TemplateUpdate) SetFeatureFlag(v string)`

SetFeatureFlag sets FeatureFlag field to given value.

### HasFeatureFlag

`func (o *TemplateUpdate) HasFeatureFlag() bool`

HasFeatureFlag returns a boolean if a field has been set.

### SetFeatureFlagNil

`func (o *TemplateUpdate) SetFeatureFlagNil(b bool)`

 SetFeatureFlagNil sets the value for FeatureFlag to be an explicit nil

### UnsetFeatureFlag
`func (o *TemplateUpdate) UnsetFeatureFlag()`

UnsetFeatureFlag ensures that no value is present for FeatureFlag, not even an explicit nil
### GetFilterTypes

`func (o *TemplateUpdate) GetFilterTypes() []string`

GetFilterTypes returns the FilterTypes field if non-nil, zero value otherwise.

### GetFilterTypesOk

`func (o *TemplateUpdate) GetFilterTypesOk() (*[]string, bool)`

GetFilterTypesOk returns a tuple with the FilterTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterTypes

`func (o *TemplateUpdate) SetFilterTypes(v []string)`

SetFilterTypes sets FilterTypes field to given value.

### HasFilterTypes

`func (o *TemplateUpdate) HasFilterTypes() bool`

HasFilterTypes returns a boolean if a field has been set.

### SetFilterTypesNil

`func (o *TemplateUpdate) SetFilterTypesNil(b bool)`

 SetFilterTypesNil sets the value for FilterTypes to be an explicit nil

### UnsetFilterTypes
`func (o *TemplateUpdate) UnsetFilterTypes()`

UnsetFilterTypes ensures that no value is present for FilterTypes, not even an explicit nil
### GetInstructions

`func (o *TemplateUpdate) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *TemplateUpdate) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *TemplateUpdate) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.

### HasInstructions

`func (o *TemplateUpdate) HasInstructions() bool`

HasInstructions returns a boolean if a field has been set.

### GetInstructionsLink

`func (o *TemplateUpdate) GetInstructionsLink() string`

GetInstructionsLink returns the InstructionsLink field if non-nil, zero value otherwise.

### GetInstructionsLinkOk

`func (o *TemplateUpdate) GetInstructionsLinkOk() (*string, bool)`

GetInstructionsLinkOk returns a tuple with the InstructionsLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructionsLink

`func (o *TemplateUpdate) SetInstructionsLink(v string)`

SetInstructionsLink sets InstructionsLink field to given value.

### HasInstructionsLink

`func (o *TemplateUpdate) HasInstructionsLink() bool`

HasInstructionsLink returns a boolean if a field has been set.

### SetInstructionsLinkNil

`func (o *TemplateUpdate) SetInstructionsLinkNil(b bool)`

 SetInstructionsLinkNil sets the value for InstructionsLink to be an explicit nil

### UnsetInstructionsLink
`func (o *TemplateUpdate) UnsetInstructionsLink()`

UnsetInstructionsLink ensures that no value is present for InstructionsLink, not even an explicit nil
### GetKind

`func (o *TemplateUpdate) GetKind() TransformationTemplateKind`

GetKind returns the Kind field if non-nil, zero value otherwise.

### GetKindOk

`func (o *TemplateUpdate) GetKindOk() (*TransformationTemplateKind, bool)`

GetKindOk returns a tuple with the Kind field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKind

`func (o *TemplateUpdate) SetKind(v TransformationTemplateKind)`

SetKind sets Kind field to given value.

### HasKind

`func (o *TemplateUpdate) HasKind() bool`

HasKind returns a boolean if a field has been set.

### GetLogo

`func (o *TemplateUpdate) GetLogo() string`

GetLogo returns the Logo field if non-nil, zero value otherwise.

### GetLogoOk

`func (o *TemplateUpdate) GetLogoOk() (*string, bool)`

GetLogoOk returns a tuple with the Logo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogo

`func (o *TemplateUpdate) SetLogo(v string)`

SetLogo sets Logo field to given value.


### GetName

`func (o *TemplateUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *TemplateUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *TemplateUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *TemplateUpdate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTransformation

`func (o *TemplateUpdate) GetTransformation() string`

GetTransformation returns the Transformation field if non-nil, zero value otherwise.

### GetTransformationOk

`func (o *TemplateUpdate) GetTransformationOk() (*string, bool)`

GetTransformationOk returns a tuple with the Transformation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransformation

`func (o *TemplateUpdate) SetTransformation(v string)`

SetTransformation sets Transformation field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


