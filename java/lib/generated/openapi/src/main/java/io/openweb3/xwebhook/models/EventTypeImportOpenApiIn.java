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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Import a list of event types from webhooks defined in an OpenAPI spec.  The OpenAPI spec can be specified as either &#x60;spec&#x60; given the spec as a JSON object, or as &#x60;specRaw&#x60; (a &#x60;string&#x60;) which will be parsed as YAML or JSON by the server. Sending neither or both is invalid, resulting in a &#x60;400&#x60; **Bad Request**.
 */
@ApiModel(description = "Import a list of event types from webhooks defined in an OpenAPI spec.  The OpenAPI spec can be specified as either `spec` given the spec as a JSON object, or as `specRaw` (a `string`) which will be parsed as YAML or JSON by the server. Sending neither or both is invalid, resulting in a `400` **Bad Request**.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T18:09:09.017597+08:00[Asia/Shanghai]")
public class EventTypeImportOpenApiIn {
  public static final String SERIALIZED_NAME_DRY_RUN = "dry_run";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun = false;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private Map<String, Object> spec = null;

  public static final String SERIALIZED_NAME_SPEC_RAW = "specRaw";
  @SerializedName(SERIALIZED_NAME_SPEC_RAW)
  private String specRaw;


  public EventTypeImportOpenApiIn dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * If &#x60;true&#x60;, return the event types that would be modified without actually modifying them.
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, return the event types that would be modified without actually modifying them.")

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public EventTypeImportOpenApiIn spec(Map<String, Object> spec) {
    
    this.spec = spec;
    return this;
  }

  public EventTypeImportOpenApiIn putSpecItem(String key, Object specItem) {
    if (this.spec == null) {
      this.spec = new HashMap<>();
    }
    this.spec.put(key, specItem);
    return this;
  }

   /**
   * A pre-parsed JSON spec.
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"info\":{\"title\":\"Webhook Example\",\"version\":\"1.0.0\"},\"openapi\":\"3.1.0\",\"webhooks\":{\"pet.new\":{\"post\":{\"requestBody\":{\"content\":{\"application/json\":{\"schema\":{\"properties\":{\"id\":{\"format\":\"int64\",\"type\":\"integer\"},\"name\":{\"type\":\"string\"},\"tag\":{\"type\":\"string\"}},\"required\":[\"id\",\"name\"]}}},\"description\":\"Information about a new pet in the system\"},\"responses\":{\"200\":{\"description\":\"Return a 200 status to indicate that the data was received successfully\"}}}}}}", value = "A pre-parsed JSON spec.")

  public Map<String, Object> getSpec() {
    return spec;
  }


  public void setSpec(Map<String, Object> spec) {
    this.spec = spec;
  }


  public EventTypeImportOpenApiIn specRaw(String specRaw) {
    
    this.specRaw = specRaw;
    return this;
  }

   /**
   * A string, parsed by the server as YAML or JSON.
   * @return specRaw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"info\":{\"title\":\"Webhook Example\",\"version\":\"1.0.0\"},\"openapi\":\"3.1.0\",\"webhooks\":{\"pet.new\":{\"post\":{\"requestBody\":{\"content\":{\"application/json\":{\"schema\":{\"properties\":{\"id\":{\"format\":\"int64\",\"type\":\"integer\"},\"name\":{\"type\":\"string\"},\"tag\":{\"type\":\"string\"}},\"required\":[\"id\",\"name\"]}}},\"description\":\"Information about a new pet in the system\"},\"responses\":{\"200\":{\"description\":\"Return a 200 status to indicate that the data was received successfully\"}}}}}}", value = "A string, parsed by the server as YAML or JSON.")

  public String getSpecRaw() {
    return specRaw;
  }


  public void setSpecRaw(String specRaw) {
    this.specRaw = specRaw;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTypeImportOpenApiIn eventTypeImportOpenApiIn = (EventTypeImportOpenApiIn) o;
    return Objects.equals(this.dryRun, eventTypeImportOpenApiIn.dryRun) &&
        Objects.equals(this.spec, eventTypeImportOpenApiIn.spec) &&
        Objects.equals(this.specRaw, eventTypeImportOpenApiIn.specRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, spec, specRaw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTypeImportOpenApiIn {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    specRaw: ").append(toIndentedString(specRaw)).append("\n");
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

