/*
 * Xwebhook API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openweb3.xwebhook.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.openweb3.xwebhook.models.TransformationTemplateKind;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * TemplateUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-18T01:36:53.552111+08:00[Asia/Shanghai]")
public class TemplateUpdate {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "";

  public static final String SERIALIZED_NAME_FEATURE_FLAG = "featureFlag";
  @SerializedName(SERIALIZED_NAME_FEATURE_FLAG)
  private String featureFlag;

  public static final String SERIALIZED_NAME_FILTER_TYPES = "filterTypes";
  @SerializedName(SERIALIZED_NAME_FILTER_TYPES)
  private Set<String> filterTypes = null;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private String instructions = "";

  public static final String SERIALIZED_NAME_INSTRUCTIONS_LINK = "instructionsLink";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS_LINK)
  private URI instructionsLink;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private TransformationTemplateKind kind;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private URI logo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "";

  public static final String SERIALIZED_NAME_TRANSFORMATION = "transformation";
  @SerializedName(SERIALIZED_NAME_TRANSFORMATION)
  private String transformation;


  public TemplateUpdate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TemplateUpdate featureFlag(String featureFlag) {
    
    this.featureFlag = featureFlag;
    return this;
  }

   /**
   * Get featureFlag
   * @return featureFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cool-new-feature", value = "")

  public String getFeatureFlag() {
    return featureFlag;
  }


  public void setFeatureFlag(String featureFlag) {
    this.featureFlag = featureFlag;
  }


  public TemplateUpdate filterTypes(Set<String> filterTypes) {
    
    this.filterTypes = filterTypes;
    return this;
  }

  public TemplateUpdate addFilterTypesItem(String filterTypesItem) {
    if (this.filterTypes == null) {
      this.filterTypes = new LinkedHashSet<>();
    }
    this.filterTypes.add(filterTypesItem);
    return this;
  }

   /**
   * Get filterTypes
   * @return filterTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"user.signup\",\"user.deleted\"]", value = "")

  public Set<String> getFilterTypes() {
    return filterTypes;
  }


  public void setFilterTypes(Set<String> filterTypes) {
    this.filterTypes = filterTypes;
  }


  public TemplateUpdate instructions(String instructions) {
    
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstructions() {
    return instructions;
  }


  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public TemplateUpdate instructionsLink(URI instructionsLink) {
    
    this.instructionsLink = instructionsLink;
    return this;
  }

   /**
   * Get instructionsLink
   * @return instructionsLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getInstructionsLink() {
    return instructionsLink;
  }


  public void setInstructionsLink(URI instructionsLink) {
    this.instructionsLink = instructionsLink;
  }


  public TemplateUpdate kind(TransformationTemplateKind kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransformationTemplateKind getKind() {
    return kind;
  }


  public void setKind(TransformationTemplateKind kind) {
    this.kind = kind;
  }


  public TemplateUpdate logo(URI logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @ApiModelProperty(required = true, value = "")

  public URI getLogo() {
    return logo;
  }


  public void setLogo(URI logo) {
    this.logo = logo;
  }


  public TemplateUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplateUpdate transformation(String transformation) {
    
    this.transformation = transformation;
    return this;
  }

   /**
   * Get transformation
   * @return transformation
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTransformation() {
    return transformation;
  }


  public void setTransformation(String transformation) {
    this.transformation = transformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateUpdate templateUpdate = (TemplateUpdate) o;
    return Objects.equals(this.description, templateUpdate.description) &&
        Objects.equals(this.featureFlag, templateUpdate.featureFlag) &&
        Objects.equals(this.filterTypes, templateUpdate.filterTypes) &&
        Objects.equals(this.instructions, templateUpdate.instructions) &&
        Objects.equals(this.instructionsLink, templateUpdate.instructionsLink) &&
        Objects.equals(this.kind, templateUpdate.kind) &&
        Objects.equals(this.logo, templateUpdate.logo) &&
        Objects.equals(this.name, templateUpdate.name) &&
        Objects.equals(this.transformation, templateUpdate.transformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, featureFlag, filterTypes, instructions, instructionsLink, kind, logo, name, transformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateUpdate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    featureFlag: ").append(toIndentedString(featureFlag)).append("\n");
    sb.append("    filterTypes: ").append(toIndentedString(filterTypes)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    instructionsLink: ").append(toIndentedString(instructionsLink)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transformation: ").append(toIndentedString(transformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

