package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UserWithOrgsRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public class UserWithOrgsRepresentation   {
  private Map<String, Object> attributes = new HashMap<>();
  private Long createdTimestamp;
  private String email;
  private Boolean emailVerified;
  private Boolean enabled;
  private String firstName;
  private List<String> groups = new ArrayList<>();
  private String id;
  private String lastName;
  private String username;
  private Map<String, List<OrganizationRoleRepresentation>> organizations = new HashMap<>();

  public UserWithOrgsRepresentation() {
  }

  /**
   **/
  public UserWithOrgsRepresentation attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @JsonProperty("attributes")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public UserWithOrgsRepresentation putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }

    this.attributes.put(key, attributesItem);
    return this;
  }

  public UserWithOrgsRepresentation removeAttributesItem(String key) {
    if (this.attributes != null) {
      this.attributes.remove(key);
    }

    return this;
  }
  /**
   **/
  public UserWithOrgsRepresentation createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  
  @JsonProperty("createdTimestamp")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  @JsonProperty("createdTimestamp")
  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   **/
  public UserWithOrgsRepresentation email(String email) {
    this.email = email;
    return this;
  }

  
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public UserWithOrgsRepresentation emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

  
  @JsonProperty("emailVerified")
  public Boolean getEmailVerified() {
    return emailVerified;
  }

  @JsonProperty("emailVerified")
  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  /**
   **/
  public UserWithOrgsRepresentation enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  public UserWithOrgsRepresentation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty("firstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  public UserWithOrgsRepresentation groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }

  @JsonProperty("groups")
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public UserWithOrgsRepresentation addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }

    this.groups.add(groupsItem);
    return this;
  }

  public UserWithOrgsRepresentation removeGroupsItem(String groupsItem) {
    if (groupsItem != null && this.groups != null) {
      this.groups.remove(groupsItem);
    }

    return this;
  }
  /**
   **/
  public UserWithOrgsRepresentation id(String id) {
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
  public UserWithOrgsRepresentation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("lastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  public UserWithOrgsRepresentation username(String username) {
    this.username = username;
    return this;
  }

  
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  public UserWithOrgsRepresentation organizations(Map<String, List<OrganizationRoleRepresentation>> organizations) {
    this.organizations = organizations;
    return this;
  }

  
  @JsonProperty("organizations")
  public Map<String, List<OrganizationRoleRepresentation>> getOrganizations() {
    return organizations;
  }

  @JsonProperty("organizations")
  public void setOrganizations(Map<String, List<OrganizationRoleRepresentation>> organizations) {
    this.organizations = organizations;
  }

  public UserWithOrgsRepresentation putOrganizationsItem(String key, List<OrganizationRoleRepresentation> organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new HashMap<>();
    }

    this.organizations.put(key, organizationsItem);
    return this;
  }

  public UserWithOrgsRepresentation removeOrganizationsItem(String key) {
    if (this.organizations != null) {
      this.organizations.remove(key);
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
    UserWithOrgsRepresentation userWithOrgsRepresentation = (UserWithOrgsRepresentation) o;
    return Objects.equals(this.attributes, userWithOrgsRepresentation.attributes) &&
        Objects.equals(this.createdTimestamp, userWithOrgsRepresentation.createdTimestamp) &&
        Objects.equals(this.email, userWithOrgsRepresentation.email) &&
        Objects.equals(this.emailVerified, userWithOrgsRepresentation.emailVerified) &&
        Objects.equals(this.enabled, userWithOrgsRepresentation.enabled) &&
        Objects.equals(this.firstName, userWithOrgsRepresentation.firstName) &&
        Objects.equals(this.groups, userWithOrgsRepresentation.groups) &&
        Objects.equals(this.id, userWithOrgsRepresentation.id) &&
        Objects.equals(this.lastName, userWithOrgsRepresentation.lastName) &&
        Objects.equals(this.username, userWithOrgsRepresentation.username) &&
        Objects.equals(this.organizations, userWithOrgsRepresentation.organizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, createdTimestamp, email, emailVerified, enabled, firstName, groups, id, lastName, username, organizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWithOrgsRepresentation {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
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

