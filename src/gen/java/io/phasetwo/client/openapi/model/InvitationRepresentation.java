package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InvitationRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public class InvitationRepresentation   {
  private String id;
  private String createdAt;
  private String email;
  private String inviterId;
  private String invitationUrl;
  private String organizationId;
  private List<String> roles = new ArrayList<>();
  private Map<String, List<String>> attributes = new HashMap<>();

  public InvitationRepresentation() {
  }

  /**
   **/
  public InvitationRepresentation id(String id) {
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
  public InvitationRepresentation createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("createdAt")
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public InvitationRepresentation email(String email) {
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
  public InvitationRepresentation inviterId(String inviterId) {
    this.inviterId = inviterId;
    return this;
  }

  
  @JsonProperty("inviterId")
  public String getInviterId() {
    return inviterId;
  }

  @JsonProperty("inviterId")
  public void setInviterId(String inviterId) {
    this.inviterId = inviterId;
  }

  /**
   **/
  public InvitationRepresentation invitationUrl(String invitationUrl) {
    this.invitationUrl = invitationUrl;
    return this;
  }

  
  @JsonProperty("invitationUrl")
  public String getInvitationUrl() {
    return invitationUrl;
  }

  @JsonProperty("invitationUrl")
  public void setInvitationUrl(String invitationUrl) {
    this.invitationUrl = invitationUrl;
  }

  /**
   **/
  public InvitationRepresentation organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("organizationId")
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   **/
  public InvitationRepresentation roles(List<String> roles) {
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

  public InvitationRepresentation addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }

    this.roles.add(rolesItem);
    return this;
  }

  public InvitationRepresentation removeRolesItem(String rolesItem) {
    if (rolesItem != null && this.roles != null) {
      this.roles.remove(rolesItem);
    }

    return this;
  }
  /**
   **/
  public InvitationRepresentation attributes(Map<String, List<String>> attributes) {
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

  public InvitationRepresentation putAttributesItem(String key, List<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }

    this.attributes.put(key, attributesItem);
    return this;
  }

  public InvitationRepresentation removeAttributesItem(String key) {
    if (this.attributes != null) {
      this.attributes.remove(key);
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
    InvitationRepresentation invitationRepresentation = (InvitationRepresentation) o;
    return Objects.equals(this.id, invitationRepresentation.id) &&
        Objects.equals(this.createdAt, invitationRepresentation.createdAt) &&
        Objects.equals(this.email, invitationRepresentation.email) &&
        Objects.equals(this.inviterId, invitationRepresentation.inviterId) &&
        Objects.equals(this.invitationUrl, invitationRepresentation.invitationUrl) &&
        Objects.equals(this.organizationId, invitationRepresentation.organizationId) &&
        Objects.equals(this.roles, invitationRepresentation.roles) &&
        Objects.equals(this.attributes, invitationRepresentation.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, email, inviterId, invitationUrl, organizationId, roles, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationRepresentation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    inviterId: ").append(toIndentedString(inviterId)).append("\n");
    sb.append("    invitationUrl: ").append(toIndentedString(invitationUrl)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

