package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UserRepresentation")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-21T14:48:52.320815Z[Etc/UTC]")
public class UserRepresentation   {
  private Map<String, Object> attributes = null;
  private Long createdTimestamp;
  private String email;
  private Boolean emailVerified;
  private Boolean enabled;
  private String firstName;
  private List<String> groups = null;
  private String id;
  private String lastName;
  private String username;

  /**
   **/
  public UserRepresentation attributes(Map<String, Object> attributes) {
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

  public UserRepresentation putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }

    this.attributes.put(key, attributesItem);
    return this;
  }

  public UserRepresentation removeAttributesItem(Object attributesItem) {
    if (attributesItem != null && this.attributes != null) {
      this.attributes.remove(attributesItem);
    }

    return this;
  }
  /**
   **/
  public UserRepresentation createdTimestamp(Long createdTimestamp) {
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
  public UserRepresentation email(String email) {
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
  public UserRepresentation emailVerified(Boolean emailVerified) {
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
  public UserRepresentation enabled(Boolean enabled) {
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
  public UserRepresentation firstName(String firstName) {
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
  public UserRepresentation groups(List<String> groups) {
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

  public UserRepresentation addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }

    this.groups.add(groupsItem);
    return this;
  }

  public UserRepresentation removeGroupsItem(String groupsItem) {
    if (groupsItem != null && this.groups != null) {
      this.groups.remove(groupsItem);
    }

    return this;
  }
  /**
   **/
  public UserRepresentation id(String id) {
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
  public UserRepresentation lastName(String lastName) {
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
  public UserRepresentation username(String username) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRepresentation userRepresentation = (UserRepresentation) o;
    return Objects.equals(this.attributes, userRepresentation.attributes) &&
        Objects.equals(this.createdTimestamp, userRepresentation.createdTimestamp) &&
        Objects.equals(this.email, userRepresentation.email) &&
        Objects.equals(this.emailVerified, userRepresentation.emailVerified) &&
        Objects.equals(this.enabled, userRepresentation.enabled) &&
        Objects.equals(this.firstName, userRepresentation.firstName) &&
        Objects.equals(this.groups, userRepresentation.groups) &&
        Objects.equals(this.id, userRepresentation.id) &&
        Objects.equals(this.lastName, userRepresentation.lastName) &&
        Objects.equals(this.username, userRepresentation.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, createdTimestamp, email, emailVerified, enabled, firstName, groups, id, lastName, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRepresentation {\n");
    
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

