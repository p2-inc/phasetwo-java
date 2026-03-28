package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UserBriefRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class UserBriefRepresentation   {
  private Long createdTimestamp;
  private String email;
  private Boolean emailVerified;
  private Boolean enabled;
  private String firstName;
  private List<String> groups = new ArrayList<>();
  private String id;
  private String lastName;
  private String username;

  public UserBriefRepresentation() {
  }

  /**
   **/
  public UserBriefRepresentation createdTimestamp(Long createdTimestamp) {
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
  public UserBriefRepresentation email(String email) {
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
  public UserBriefRepresentation emailVerified(Boolean emailVerified) {
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
  public UserBriefRepresentation enabled(Boolean enabled) {
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
  public UserBriefRepresentation firstName(String firstName) {
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
  public UserBriefRepresentation groups(List<String> groups) {
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

  public UserBriefRepresentation addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }

    this.groups.add(groupsItem);
    return this;
  }

  public UserBriefRepresentation removeGroupsItem(String groupsItem) {
    if (groupsItem != null && this.groups != null) {
      this.groups.remove(groupsItem);
    }

    return this;
  }
  /**
   **/
  public UserBriefRepresentation id(String id) {
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
  public UserBriefRepresentation lastName(String lastName) {
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
  public UserBriefRepresentation username(String username) {
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
    UserBriefRepresentation userBriefRepresentation = (UserBriefRepresentation) o;
    return Objects.equals(this.createdTimestamp, userBriefRepresentation.createdTimestamp) &&
        Objects.equals(this.email, userBriefRepresentation.email) &&
        Objects.equals(this.emailVerified, userBriefRepresentation.emailVerified) &&
        Objects.equals(this.enabled, userBriefRepresentation.enabled) &&
        Objects.equals(this.firstName, userBriefRepresentation.firstName) &&
        Objects.equals(this.groups, userBriefRepresentation.groups) &&
        Objects.equals(this.id, userBriefRepresentation.id) &&
        Objects.equals(this.lastName, userBriefRepresentation.lastName) &&
        Objects.equals(this.username, userBriefRepresentation.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTimestamp, email, emailVerified, enabled, firstName, groups, id, lastName, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBriefRepresentation {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
