package io.phasetwo.client.openapi.model;

import io.phasetwo.client.openapi.model.OrganizationExportRepresentation;
import io.phasetwo.client.openapi.model.OrganizationsConfigRepresentation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("OrganizationsExportRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class OrganizationsExportRepresentation   {
  private String version;
  private String realm;
  private Date exportedAt;
  private List<OrganizationExportRepresentation> organizations = new ArrayList<>();
  private OrganizationsConfigRepresentation config;

  public OrganizationsExportRepresentation() {
  }

  /**
   * Export format version
   **/
  public OrganizationsExportRepresentation version(String version) {
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
   * Source realm name
   **/
  public OrganizationsExportRepresentation realm(String realm) {
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
   * Export timestamp
   **/
  public OrganizationsExportRepresentation exportedAt(Date exportedAt) {
    this.exportedAt = exportedAt;
    return this;
  }

  
  @JsonProperty("exportedAt")
  public Date getExportedAt() {
    return exportedAt;
  }

  @JsonProperty("exportedAt")
  public void setExportedAt(Date exportedAt) {
    this.exportedAt = exportedAt;
  }

  /**
   **/
  public OrganizationsExportRepresentation organizations(List<OrganizationExportRepresentation> organizations) {
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

  public OrganizationsExportRepresentation addOrganizationsItem(OrganizationExportRepresentation organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<>();
    }

    this.organizations.add(organizationsItem);
    return this;
  }

  public OrganizationsExportRepresentation removeOrganizationsItem(OrganizationExportRepresentation organizationsItem) {
    if (organizationsItem != null && this.organizations != null) {
      this.organizations.remove(organizationsItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationsExportRepresentation config(OrganizationsConfigRepresentation config) {
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
    OrganizationsExportRepresentation organizationsExportRepresentation = (OrganizationsExportRepresentation) o;
    return Objects.equals(this.version, organizationsExportRepresentation.version) &&
        Objects.equals(this.realm, organizationsExportRepresentation.realm) &&
        Objects.equals(this.exportedAt, organizationsExportRepresentation.exportedAt) &&
        Objects.equals(this.organizations, organizationsExportRepresentation.organizations) &&
        Objects.equals(this.config, organizationsExportRepresentation.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, realm, exportedAt, organizations, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsExportRepresentation {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    exportedAt: ").append(toIndentedString(exportedAt)).append("\n");
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
