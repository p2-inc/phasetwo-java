package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * Per-organization SCIM 2.0 service-provider configuration. One of these backs the SCIM endpoint at
 * &#x60;{authServerUrl}/realms/{realm}/scim/v2/organizations/{orgId}/&#x60;.
 */
@JsonTypeName("OrganizationScimRepresentation")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public class OrganizationScimRepresentation {
  private Boolean enabled;
  private Boolean emailAsUsername;
  private Boolean linkIdp;
  private OrganizationScimAuth auth;

  public OrganizationScimRepresentation() {}

  /**
   * Whether the organization&#39;s SCIM endpoint accepts inbound traffic. Turn this off to pause
   * provisioning without losing the configuration.
   */
  public OrganizationScimRepresentation enabled(Boolean enabled) {
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
   * When true, the provisioned user&#39;s &#x60;username&#x60; mirrors their &#x60;email&#x60;, and
   * subsequent SCIM update operations do not change the username.
   */
  public OrganizationScimRepresentation emailAsUsername(Boolean emailAsUsername) {
    this.emailAsUsername = emailAsUsername;
    return this;
  }

  @JsonProperty("email_as_username")
  public Boolean getEmailAsUsername() {
    return emailAsUsername;
  }

  @JsonProperty("email_as_username")
  public void setEmailAsUsername(Boolean emailAsUsername) {
    this.emailAsUsername = emailAsUsername;
  }

  /**
   * When true, provisioned users are federated with the organization&#39;s configured identity
   * provider so they can sign in via the org&#39;s SSO immediately after provisioning.
   */
  public OrganizationScimRepresentation linkIdp(Boolean linkIdp) {
    this.linkIdp = linkIdp;
    return this;
  }

  @JsonProperty("link_idp")
  public Boolean getLinkIdp() {
    return linkIdp;
  }

  @JsonProperty("link_idp")
  public void setLinkIdp(Boolean linkIdp) {
    this.linkIdp = linkIdp;
  }

  /** */
  public OrganizationScimRepresentation auth(OrganizationScimAuth auth) {
    this.auth = auth;
    return this;
  }

  @JsonProperty("auth")
  public OrganizationScimAuth getAuth() {
    return auth;
  }

  @JsonProperty("auth")
  public void setAuth(OrganizationScimAuth auth) {
    this.auth = auth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationScimRepresentation organizationScimRepresentation =
        (OrganizationScimRepresentation) o;
    return Objects.equals(this.enabled, organizationScimRepresentation.enabled)
        && Objects.equals(this.emailAsUsername, organizationScimRepresentation.emailAsUsername)
        && Objects.equals(this.linkIdp, organizationScimRepresentation.linkIdp)
        && Objects.equals(this.auth, organizationScimRepresentation.auth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, emailAsUsername, linkIdp, auth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationScimRepresentation {\n");

    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    emailAsUsername: ").append(toIndentedString(emailAsUsername)).append("\n");
    sb.append("    linkIdp: ").append(toIndentedString(linkIdp)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
