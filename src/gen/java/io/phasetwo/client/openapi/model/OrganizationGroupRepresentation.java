package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@JsonTypeName("OrganizationGroupRepresentation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-28T14:31:13.402523Z[Etc/UTC]")
public class OrganizationGroupRepresentation {
  
  private @Valid String id;
  private @Valid String name;
  private @Valid String description;
  private @Valid String parentId;
  private @Valid Map<String, List<String>> attributes = new HashMap<String, List<String>>();

  /**
   **/
  public OrganizationGroupRepresentation id(String id) {
    this.id = id;
    return this;
  }

  

  
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   **/
  public OrganizationGroupRepresentation name(String name) {
    this.name = name;
    return this;
  }

  

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

/**
   **/
  public OrganizationGroupRepresentation description(String description) {
    this.description = description;
    return this;
  }

  

  
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

/**
   **/
  public OrganizationGroupRepresentation parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  

  
  @JsonProperty("parentId")
  public String getParentId() {
    return parentId;
  }

  @JsonProperty("parentId")
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

/**
   **/
  public OrganizationGroupRepresentation attributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
    return this;
  }

  

  
  @JsonProperty("attributes")
  public Map<String, List<String>> getAttributes() {
    return attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
  }

  public OrganizationGroupRepresentation putAttributesItem(String key, List<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, List<String>>();
    }

    this.attributes.put(key, attributesItem);
    return this;
  }

  public OrganizationGroupRepresentation removeAttributesItem(List<String> attributesItem) {
    if (attributesItem != null && this.attributes != null) {
      this.attributes.remove(attributesItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationGroupRepresentation organizationGroupRepresentation = (OrganizationGroupRepresentation) o;
    return Objects.equals(this.id, organizationGroupRepresentation.id) &&
        Objects.equals(this.name, organizationGroupRepresentation.name) &&
        Objects.equals(this.description, organizationGroupRepresentation.description) &&
        Objects.equals(this.parentId, organizationGroupRepresentation.parentId) &&
        Objects.equals(this.attributes, organizationGroupRepresentation.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, parentId, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationGroupRepresentation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

