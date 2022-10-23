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

  public OrganizationsResource organizations(String realm) {
    return new OrganizationsResource(realm, getOrganizationsApi(), this);
  }


  public RealmAttributesResource attributes(String realm) {
    return new RealmAttributesResource(realm, getAttributesApi());
  }

  public EventsResource events(String realm) {
    return new EventsResource(realm, getEventsApi());
  }

  public WebhooksResource webhooks(String realm) {
    return new WebhooksResource(realm, getEventsApi());
  }

  public AttributesApi getAttributesApi() {
    return keycloak.proxy(AttributesApi.class, absoluteUri);
  }
  
  public EventsApi getEventsApi() {
    return keycloak.proxy(EventsApi.class, absoluteUri);
  }
  
  public IdentityProvidersApi getIdentityProvidersApi() {
    return keycloak.proxy(IdentityProvidersApi.class, absoluteUri);
  }
  
  public OrganizationDomainsApi getOrganizationDomainsApi() {
    return keycloak.proxy(OrganizationDomainsApi.class, absoluteUri);
  }
  
  public OrganizationInvitationsApi getOrganizationInvitationsApi() {
    return keycloak.proxy(OrganizationInvitationsApi.class, absoluteUri);
  }
  
  public OrganizationMembershipsApi getOrganizationMembershipsApi() {
    return keycloak.proxy(OrganizationMembershipsApi.class, absoluteUri);
  }
  
  public OrganizationRolesApi getOrganizationRolesApi() {
    return keycloak.proxy(OrganizationRolesApi.class, absoluteUri);
  }
  
  public OrganizationsApi getOrganizationsApi() {
    return keycloak.proxy(OrganizationsApi.class, absoluteUri);
  }
  
  public UsersApi getUsersApi() {
    return keycloak.proxy(UsersApi.class, absoluteUri);
  }
  
}

