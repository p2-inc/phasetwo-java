package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrganizationsImportRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class OrganizationsImportRepresentation   {
  private String version;
  private List<OrganizationExportRepresentation> organizations = new ArrayList<>();
  private OrganizationsConfigRepresentation config;

  public OrganizationsImportRepresentation() {
  }

  /**
   * Import format version
   **/
  public OrganizationsImportRepresentation version(String version) {
    this.version = version;
    return this;
  }

  
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  public OrganizationsImportRepresentation organizations(List<OrganizationExportRepresentation> organizations) {
    this.organizations = organizations;
    return this;
  }

  
  @JsonProperty("organizations")
  public List<OrganizationExportRepresentation> getOrganizations() {
    return organizations;
  }

  @JsonProperty("organizations")
  public void setOrganizations(List<OrganizationExportRepresentation> organizations) {
    this.organizations = organizations;
  }

  public OrganizationsImportRepresentation addOrganizationsItem(OrganizationExportRepresentation organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<>();
    }

    this.organizations.add(organizationsItem);
    return this;
  }

  public OrganizationsImportRepresentation removeOrganizationsItem(OrganizationExportRepresentation organizationsItem) {
    if (organizationsItem != null && this.organizations != null) {
      this.organizations.remove(organizationsItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationsImportRepresentation config(OrganizationsConfigRepresentation config) {
    this.config = config;
    return this;
  }

  
  @JsonProperty("config")
  public OrganizationsConfigRepresentation getConfig() {
    return config;
  }

  @JsonProperty("config")
  public void setConfig(OrganizationsConfigRepresentation config) {
    this.config = config;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsImportRepresentation organizationsImportRepresentation = (OrganizationsImportRepresentation) o;
    return Objects.equals(this.version, organizationsImportRepresentation.version) &&
        Objects.equals(this.organizations, organizationsImportRepresentation.organizations) &&
        Objects.equals(this.config, organizationsImportRepresentation.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, organizations, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsImportRepresentation {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
