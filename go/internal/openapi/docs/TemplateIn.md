# TemplateIn

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
**Name** | **string** |  | 
**Transformation** | **string** |  | 

## Methods

### NewTemplateIn

`func NewTemplateIn(logo string, name string, transformation string, ) *TemplateIn`

NewTemplateIn instantiates a new TemplateIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTemplateInWithDefaults

`func NewTemplateInWithDefaults() *TemplateIn`

NewTemplateInWithDefaults instantiates a new TemplateIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *TemplateIn) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *TemplateIn) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *TemplateIn) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *TemplateIn) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetFeatureFlag

`func (o *TemplateIn) GetFeatureFlag() string`

GetFeatureFlag returns the FeatureFlag field if non-nil, zero value otherwise.

### GetFeatureFlagOk

`func (o *TemplateIn) GetFeatureFlagOk() (*string, bool)`

GetFeatureFlagOk returns a tuple with the FeatureFlag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeatureFlag

`func (o *TemplateIn) SetFeatureFlag(v string)`

SetFeatureFlag sets FeatureFlag field to given value.

### HasFeatureFlag

`func (o *TemplateIn) HasFeatureFlag() bool`

HasFeatureFlag returns a boolean if a field has been set.

### SetFeatureFlagNil

`func (o *TemplateIn) SetFeatureFlagNil(b bool)`

 SetFeatureFlagNil sets the value for FeatureFlag to be an explicit nil

### UnsetFeatureFlag
`func (o *TemplateIn) UnsetFeatureFlag()`

UnsetFeatureFlag ensures that no value is present for FeatureFlag, not even an explicit nil
### GetFilterTypes

`func (o *TemplateIn) GetFilterTypes() []string`

GetFilterTypes returns the FilterTypes field if non-nil, zero value otherwise.

### GetFilterTypesOk

`func (o *TemplateIn) GetFilterTypesOk() (*[]string, bool)`

GetFilterTypesOk returns a tuple with the FilterTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterTypes

`func (o *TemplateIn) SetFilterTypes(v []string)`

SetFilterTypes sets FilterTypes field to given value.

### HasFilterTypes

`func (o *TemplateIn) HasFilterTypes() bool`

HasFilterTypes returns a boolean if a field has been set.

### SetFilterTypesNil

`func (o *TemplateIn) SetFilterTypesNil(b bool)`

 SetFilterTypesNil sets the value for FilterTypes to be an explicit nil

### UnsetFilterTypes
`func (o *TemplateIn) UnsetFilterTypes()`

UnsetFilterTypes ensures that no value is present for FilterTypes, not even an explicit nil
### GetInstructions

`func (o *TemplateIn) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *TemplateIn) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *TemplateIn) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.

### HasInstructions

`func (o *TemplateIn) HasInstructions() bool`

HasInstructions returns a boolean if a field has been set.

### GetInstructionsLink

`func (o *TemplateIn) GetInstructionsLink() string`

GetInstructionsLink returns the InstructionsLink field if non-nil, zero value otherwise.

### GetInstructionsLinkOk

`func (o *TemplateIn) GetInstructionsLinkOk() (*string, bool)`

GetInstructionsLinkOk returns a tuple with the InstructionsLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructionsLink

`func (o *TemplateIn) SetInstructionsLink(v string)`

SetInstructionsLink sets InstructionsLink field to given value.

### HasInstructionsLink

`func (o *TemplateIn) HasInstructionsLink() bool`

HasInstructionsLink returns a boolean if a field has been set.

### SetInstructionsLinkNil

`func (o *TemplateIn) SetInstructionsLinkNil(b bool)`

 SetInstructionsLinkNil sets the value for InstructionsLink to be an explicit nil

### UnsetInstructionsLink
`func (o *TemplateIn) UnsetInstructionsLink()`

UnsetInstructionsLink ensures that no value is present for InstructionsLink, not even an explicit nil
### GetKind

`func (o *TemplateIn) GetKind() TransformationTemplateKind`

GetKind returns the Kind field if non-nil, zero value otherwise.

### GetKindOk

`func (o *TemplateIn) GetKindOk() (*TransformationTemplateKind, bool)`

GetKindOk returns a tuple with the Kind field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKind

`func (o *TemplateIn) SetKind(v TransformationTemplateKind)`

SetKind sets Kind field to given value.

### HasKind

`func (o *TemplateIn) HasKind() bool`

HasKind returns a boolean if a field has been set.

### GetLogo

`func (o *TemplateIn) GetLogo() string`

GetLogo returns the Logo field if non-nil, zero value otherwise.

### GetLogoOk

`func (o *TemplateIn) GetLogoOk() (*string, bool)`

GetLogoOk returns a tuple with the Logo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogo

`func (o *TemplateIn) SetLogo(v string)`

SetLogo sets Logo field to given value.


### GetName

`func (o *TemplateIn) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *TemplateIn) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *TemplateIn) SetName(v string)`

SetName sets Name field to given value.


### GetTransformation

`func (o *TemplateIn) GetTransformation() string`

GetTransformation returns the Transformation field if non-nil, zero value otherwise.

### GetTransformationOk

`func (o *TemplateIn) GetTransformationOk() (*string, bool)`

GetTransformationOk returns a tuple with the Transformation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransformation

`func (o *TemplateIn) SetTransformation(v string)`

SetTransformation sets Transformation field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


