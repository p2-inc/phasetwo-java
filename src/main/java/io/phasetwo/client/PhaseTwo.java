package io.phasetwo.client;

import static io.phasetwo.client.openapi.RestResourceRoot.APPLICATION_PATH;
import io.phasetwo.client.openapi.api.*;
import java.net.URI;
import org.keycloak.admin.client.Keycloak;

public class PhaseTwo {

  private final Keycloak keycloak;
  private final String serverUrl;
  private final URI absoluteUri;

  public PhaseTwo(Keycloak keycloak, String serverUrl) {
    this.keycloak = keycloak;
    this.serverUrl = serverUrl;
    try {
      this.absoluteUri = new URI(serverUrl).resolve(APPLICATION_PATH);
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
  
  public AttributesApi attributes() {
    return keycloak.proxy(AttributesApi.class, absoluteUri);
  }
  
  public EventsApi events() {
    return keycloak.proxy(EventsApi.class, absoluteUri);
  }
  
  public IdentityProvidersApi identityProviders() {
    return keycloak.proxy(IdentityProvidersApi.class, absoluteUri);
  }
  
  public OrganizationDomainsApi organizationDomains() {
    return keycloak.proxy(OrganizationDomainsApi.class, absoluteUri);
  }
  
  public OrganizationInvitationsApi organizationInvitations() {
    return keycloak.proxy(OrganizationInvitationsApi.class, absoluteUri);
  }
  
  public OrganizationMembershipsApi organizationMemberships() {
    return keycloak.proxy(OrganizationMembershipsApi.class, absoluteUri);
  }
  
  public OrganizationRolesApi organizationRoles() {
    return keycloak.proxy(OrganizationRolesApi.class, absoluteUri);
  }
  
  public OrganizationsApi organizations() {
    return keycloak.proxy(OrganizationsApi.class, absoluteUri);
  }
  
  public UsersApi users() {
    return keycloak.proxy(UsersApi.class, absoluteUri);
  }
  
}

