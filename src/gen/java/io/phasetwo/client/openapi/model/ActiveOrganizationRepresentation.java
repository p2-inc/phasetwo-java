package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ActiveOrganizationRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class ActiveOrganizationRepresentation   {
  private String organizationId;
  private String organizationName;
  private String displayName;
  private List<String> roles = new ArrayList<>();
  private Date switchedAt;

  public ActiveOrganizationRepresentation() {
  }

  /**
   * The ID of the active organization
   **/
  public ActiveOrganizationRepresentation organizationId(String organizationId) {
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
   * The name of the active organization
   **/
  public ActiveOrganizationRepresentation organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  
  @JsonProperty("organizationName")
  public String getOrganizationName() {
    return organizationName;
  }

  @JsonProperty("organizationName")
  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  /**
   * The display name of the active organization
   **/
  public ActiveOrganizationRepresentation displayName(String displayName) {
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
   * User&#39;s roles in the active organization
   **/
  public ActiveOrganizationRepresentation roles(List<String> roles) {
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

  public ActiveOrganizationRepresentation addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }

    this.roles.add(rolesItem);
    return this;
  }

  public ActiveOrganizationRepresentation removeRolesItem(String rolesItem) {
    if (rolesItem != null && this.roles != null) {
      this.roles.remove(rolesItem);
    }

    return this;
  }
  /**
   * When the organization was last switched to
   **/
  public ActiveOrganizationRepresentation switchedAt(Date switchedAt) {
    this.switchedAt = switchedAt;
    return this;
  }

  
  @JsonProperty("switchedAt")
  public Date getSwitchedAt() {
    return switchedAt;
  }

  @JsonProperty("switchedAt")
  public void setSwitchedAt(Date switchedAt) {
    this.switchedAt = switchedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveOrganizationRepresentation activeOrganizationRepresentation = (ActiveOrganizationRepresentation) o;
    return Objects.equals(this.organizationId, activeOrganizationRepresentation.organizationId) &&
        Objects.equals(this.organizationName, activeOrganizationRepresentation.organizationName) &&
        Objects.equals(this.displayName, activeOrganizationRepresentation.displayName) &&
        Objects.equals(this.roles, activeOrganizationRepresentation.roles) &&
        Objects.equals(this.switchedAt, activeOrganizationRepresentation.switchedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, organizationName, displayName, roles, switchedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveOrganizationRepresentation {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    switchedAt: ").append(toIndentedString(switchedAt)).append("\n");
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
