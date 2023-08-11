package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("MyOrganizationRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class MyOrganizationRepresentation   {
  private String name;
  private String displayName;
  private String url;
  private Map<String, List<String>> attributes = null;
  private List<String> roles = null;

  /**
   **/
  public MyOrganizationRepresentation name(String name) {
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
  public MyOrganizationRepresentation displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  public MyOrganizationRepresentation url(String url) {
    this.url = url;
    return this;
  }

  
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  public MyOrganizationRepresentation attributes(Map<String, List<String>> attributes) {
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

  public MyOrganizationRepresentation putAttributesItem(String key, List<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }

    this.attributes.put(key, attributesItem);
    return this;
  }

  public MyOrganizationRepresentation removeAttributesItem(List<String> attributesItem) {
    if (attributesItem != null && this.attributes != null) {
      this.attributes.remove(attributesItem);
    }

    return this;
  }
  /**
   **/
  public MyOrganizationRepresentation roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }

  @JsonProperty("roles")
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public MyOrganizationRepresentation addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }

    this.roles.add(rolesItem);
    return this;
  }

  public MyOrganizationRepresentation removeRolesItem(String rolesItem) {
    if (rolesItem != null && this.roles != null) {
      this.roles.remove(rolesItem);
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
    MyOrganizationRepresentation myOrganizationRepresentation = (MyOrganizationRepresentation) o;
    return Objects.equals(this.name, myOrganizationRepresentation.name) &&
        Objects.equals(this.displayName, myOrganizationRepresentation.displayName) &&
        Objects.equals(this.url, myOrganizationRepresentation.url) &&
        Objects.equals(this.attributes, myOrganizationRepresentation.attributes) &&
        Objects.equals(this.roles, myOrganizationRepresentation.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, url, attributes, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyOrganizationRepresentation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

