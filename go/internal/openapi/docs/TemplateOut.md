# TemplateOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **time.Time** |  | 
**Description** | **string** |  | 
**FeatureFlag** | Pointer to **NullableString** |  | [optional] 
**FilterTypes** | Pointer to **[]string** |  | [optional] 
**Id** | **string** |  | 
**Instructions** | **string** |  | 
**InstructionsLink** | Pointer to **NullableString** |  | [optional] 
**Kind** | [**TransformationTemplateKind**](TransformationTemplateKind.md) |  | 
**Logo** | **string** |  | 
**Name** | **string** |  | 
**OrgId** | **string** |  | 
**Transformation** | **string** |  | 
**UpdatedAt** | **time.Time** |  | 

## Methods

### NewTemplateOut

`func NewTemplateOut(createdAt time.Time, description string, id string, instructions string, kind TransformationTemplateKind, logo string, name string, orgId string, transformation string, updatedAt time.Time, ) *TemplateOut`

NewTemplateOut instantiates a new TemplateOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTemplateOutWithDefaults

`func NewTemplateOutWithDefaults() *TemplateOut`

NewTemplateOutWithDefaults instantiates a new TemplateOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedAt

`func (o *TemplateOut) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *TemplateOut) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *TemplateOut) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetDescription

`func (o *TemplateOut) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *TemplateOut) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *TemplateOut) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetFeatureFlag

`func (o *TemplateOut) GetFeatureFlag() string`

GetFeatureFlag returns the FeatureFlag field if non-nil, zero value otherwise.

### GetFeatureFlagOk

`func (o *TemplateOut) GetFeatureFlagOk() (*string, bool)`

GetFeatureFlagOk returns a tuple with the FeatureFlag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeatureFlag

`func (o *TemplateOut) SetFeatureFlag(v string)`

SetFeatureFlag sets FeatureFlag field to given value.

### HasFeatureFlag

`func (o *TemplateOut) HasFeatureFlag() bool`

HasFeatureFlag returns a boolean if a field has been set.

### SetFeatureFlagNil

`func (o *TemplateOut) SetFeatureFlagNil(b bool)`

 SetFeatureFlagNil sets the value for FeatureFlag to be an explicit nil

### UnsetFeatureFlag
`func (o *TemplateOut) UnsetFeatureFlag()`

UnsetFeatureFlag ensures that no value is present for FeatureFlag, not even an explicit nil
### GetFilterTypes

`func (o *TemplateOut) GetFilterTypes() []string`

GetFilterTypes returns the FilterTypes field if non-nil, zero value otherwise.

### GetFilterTypesOk

`func (o *TemplateOut) GetFilterTypesOk() (*[]string, bool)`

GetFilterTypesOk returns a tuple with the FilterTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterTypes

`func (o *TemplateOut) SetFilterTypes(v []string)`

SetFilterTypes sets FilterTypes field to given value.

### HasFilterTypes

`func (o *TemplateOut) HasFilterTypes() bool`

HasFilterTypes returns a boolean if a field has been set.

### SetFilterTypesNil

`func (o *TemplateOut) SetFilterTypesNil(b bool)`

 SetFilterTypesNil sets the value for FilterTypes to be an explicit nil

### UnsetFilterTypes
`func (o *TemplateOut) UnsetFilterTypes()`

UnsetFilterTypes ensures that no value is present for FilterTypes, not even an explicit nil
### GetId

`func (o *TemplateOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TemplateOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TemplateOut) SetId(v string)`

SetId sets Id field to given value.


### GetInstructions

`func (o *TemplateOut) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *TemplateOut) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *TemplateOut) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.


### GetInstructionsLink

`func (o *TemplateOut) GetInstructionsLink() string`

GetInstructionsLink returns the InstructionsLink field if non-nil, zero value otherwise.

### GetInstructionsLinkOk

`func (o *TemplateOut) GetInstructionsLinkOk() (*string, bool)`

GetInstructionsLinkOk returns a tuple with the InstructionsLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructionsLink

`func (o *TemplateOut) SetInstructionsLink(v string)`

SetInstructionsLink sets InstructionsLink field to given value.

### HasInstructionsLink

`func (o *TemplateOut) HasInstructionsLink() bool`

HasInstructionsLink returns a boolean if a field has been set.

### SetInstructionsLinkNil

`func (o *TemplateOut) SetInstructionsLinkNil(b bool)`

 SetInstructionsLinkNil sets the value for InstructionsLink to be an explicit nil

### UnsetInstructionsLink
`func (o *TemplateOut) UnsetInstructionsLink()`

UnsetInstructionsLink ensures that no value is present for InstructionsLink, not even an explicit nil
### GetKind

`func (o *TemplateOut) GetKind() TransformationTemplateKind`

GetKind returns the Kind field if non-nil, zero value otherwise.

### GetKindOk

`func (o *TemplateOut) GetKindOk() (*TransformationTemplateKind, bool)`

GetKindOk returns a tuple with the Kind field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKind

`func (o *TemplateOut) SetKind(v TransformationTemplateKind)`

SetKind sets Kind field to given value.


### GetLogo

`func (o *TemplateOut) GetLogo() string`

GetLogo returns the Logo field if non-nil, zero value otherwise.

### GetLogoOk

`func (o *TemplateOut) GetLogoOk() (*string, bool)`

GetLogoOk returns a tuple with the Logo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogo

`func (o *TemplateOut) SetLogo(v string)`

SetLogo sets Logo field to given value.


### GetName

`func (o *TemplateOut) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *TemplateOut) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *TemplateOut) SetName(v string)`

SetName sets Name field to given value.


### GetOrgId

`func (o *TemplateOut) GetOrgId() string`

GetOrgId returns the OrgId field if non-nil, zero value otherwise.

### GetOrgIdOk

`func (o *TemplateOut) GetOrgIdOk() (*string, bool)`

GetOrgIdOk returns a tuple with the OrgId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrgId

`func (o *TemplateOut) SetOrgId(v string)`

SetOrgId sets OrgId field to given value.


### GetTransformation

`func (o *TemplateOut) GetTransformation() string`

GetTransformation returns the Transformation field if non-nil, zero value otherwise.

### GetTransformationOk

`func (o *TemplateOut) GetTransformationOk() (*string, bool)`

GetTransformationOk returns a tuple with the Transformation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransformation

`func (o *TemplateOut) SetTransformation(v string)`

SetTransformation sets Transformation field to given value.


### GetUpdatedAt

`func (o *TemplateOut) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *TemplateOut) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *TemplateOut) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


