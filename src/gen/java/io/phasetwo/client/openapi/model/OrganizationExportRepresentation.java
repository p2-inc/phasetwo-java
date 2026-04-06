package io.phasetwo.client.openapi.model;

import io.phasetwo.client.openapi.model.IdentityProviderRepresentation;
import io.phasetwo.client.openapi.model.OrganizationExportRepresentationAllOfMembers;
import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;
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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("OrganizationExportRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class OrganizationExportRepresentation   {
  private String id;
  private String name;
  private String displayName;
  private String url;
  private String realm;
  private List<String> domains = new ArrayList<>();
  private Map<String, List<String>> attributes = new HashMap<>();
  private List<OrganizationRoleRepresentation> roles = new ArrayList<>();
  private List<IdentityProviderRepresentation> identityProviders = new ArrayList<>();
  private List<OrganizationExportRepresentationAllOfMembers> members = new ArrayList<>();

  public OrganizationExportRepresentation() {
  }

  /**
   **/
  public OrganizationExportRepresentation id(String id) {
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
  public OrganizationExportRepresentation name(String name) {
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
  public OrganizationExportRepresentation displayName(String displayName) {
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
  public OrganizationExportRepresentation url(String url) {
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
  public OrganizationExportRepresentation realm(String realm) {
    this.realm = realm;
    return this;
  }

  
  @JsonProperty("realm")
  public String getRealm() {
    return realm;
  }

  @JsonProperty("realm")
  public void setRealm(String realm) {
    this.realm = realm;
  }

  /**
   **/
  public OrganizationExportRepresentation domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  
  @JsonProperty("domains")
  public List<String> getDomains() {
    return domains;
  }

  @JsonProperty("domains")
  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public OrganizationExportRepresentation addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }

    this.domains.add(domainsItem);
    return this;
  }

  public OrganizationExportRepresentation removeDomainsItem(String domainsItem) {
    if (domainsItem != null && this.domains != null) {
      this.domains.remove(domainsItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationExportRepresentation attributes(Map<String, List<String>> attributes) {
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

  public OrganizationExportRepresentation putAttributesItem(String key, List<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }

    this.attributes.put(key, attributesItem);
    return this;
  }

  public OrganizationExportRepresentation removeAttributesItem(String key) {
    if (this.attributes != null) {
      this.attributes.remove(key);
    }

    return this;
  }
  /**
   **/
  public OrganizationExportRepresentation roles(List<OrganizationRoleRepresentation> roles) {
    this.roles = roles;
    return this;
  }

  
  @JsonProperty("roles")
  public List<OrganizationRoleRepresentation> getRoles() {
    return roles;
  }

  @JsonProperty("roles")
  public void setRoles(List<OrganizationRoleRepresentation> roles) {
    this.roles = roles;
  }

  public OrganizationExportRepresentation addRolesItem(OrganizationRoleRepresentation rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }

    this.roles.add(rolesItem);
    return this;
  }

  public OrganizationExportRepresentation removeRolesItem(OrganizationRoleRepresentation rolesItem) {
    if (rolesItem != null && this.roles != null) {
      this.roles.remove(rolesItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationExportRepresentation identityProviders(List<IdentityProviderRepresentation> identityProviders) {
    this.identityProviders = identityProviders;
    return this;
  }

  
  @JsonProperty("identityProviders")
  public List<IdentityProviderRepresentation> getIdentityProviders() {
    return identityProviders;
  }

  @JsonProperty("identityProviders")
  public void setIdentityProviders(List<IdentityProviderRepresentation> identityProviders) {
    this.identityProviders = identityProviders;
  }

  public OrganizationExportRepresentation addIdentityProvidersItem(IdentityProviderRepresentation identityProvidersItem) {
    if (this.identityProviders == null) {
      this.identityProviders = new ArrayList<>();
    }

    this.identityProviders.add(identityProvidersItem);
    return this;
  }

  public OrganizationExportRepresentation removeIdentityProvidersItem(IdentityProviderRepresentation identityProvidersItem) {
    if (identityProvidersItem != null && this.identityProviders != null) {
      this.identityProviders.remove(identityProvidersItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationExportRepresentation members(List<OrganizationExportRepresentationAllOfMembers> members) {
    this.members = members;
    return this;
  }

  
  @JsonProperty("members")
  public List<OrganizationExportRepresentationAllOfMembers> getMembers() {
    return members;
  }

  @JsonProperty("members")
  public void setMembers(List<OrganizationExportRepresentationAllOfMembers> members) {
    this.members = members;
  }

  public OrganizationExportRepresentation addMembersItem(OrganizationExportRepresentationAllOfMembers membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }

    this.members.add(membersItem);
    return this;
  }

  public OrganizationExportRepresentation removeMembersItem(OrganizationExportRepresentationAllOfMembers membersItem) {
    if (membersItem != null && this.members != null) {
      this.members.remove(membersItem);
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
    OrganizationExportRepresentation organizationExportRepresentation = (OrganizationExportRepresentation) o;
    return Objects.equals(this.id, organizationExportRepresentation.id) &&
        Objects.equals(this.name, organizationExportRepresentation.name) &&
        Objects.equals(this.displayName, organizationExportRepresentation.displayName) &&
        Objects.equals(this.url, organizationExportRepresentation.url) &&
        Objects.equals(this.realm, organizationExportRepresentation.realm) &&
        Objects.equals(this.domains, organizationExportRepresentation.domains) &&
        Objects.equals(this.attributes, organizationExportRepresentation.attributes) &&
        Objects.equals(this.roles, organizationExportRepresentation.roles) &&
        Objects.equals(this.identityProviders, organizationExportRepresentation.identityProviders) &&
        Objects.equals(this.members, organizationExportRepresentation.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, url, realm, domains, attributes, roles, identityProviders, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationExportRepresentation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    identityProviders: ").append(toIndentedString(identityProviders)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
