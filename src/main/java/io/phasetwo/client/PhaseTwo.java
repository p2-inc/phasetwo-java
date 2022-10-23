package io.phasetwo.client;

import static io.phasetwo.client.openapi.RestResourceRoot.APPLICATION_PATH;
import io.phasetwo.client.openapi.api.*;
import java.lang.reflect.Field;
import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.resource.BearerAuthFilter;

/**
 * Main entry point for API. Use the {@link PhaseTwo#organizations(String)},
 * {@link PhaseTwo#attributes(String)},
 * {@link PhaseTwo#events(String)} and
 * {@link PhaseTwo#webhooks(String)} methods.
 * The *Api methods are for direct access to the generated utilities.
 */
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

  /**
   * Events resource for publishing user events. This requires the access token of the
   * currently logged in user. This will cause the authDetails of the event to represent
   * the user.
   * @param realm Realm name
   * @param accessToken Valid access token for the logged in user
   */
  public EventsResource userEvents(String realm, String accessToken) {
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
  
  public EventsApi getEventsApiWithToken(String accessToken) {
    return proxy(EventsApi.class, accessToken);
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
  
  <T> T proxy(Class<T> proxyClass, String accessToken) {
    try {
      Field privateField = Keycloak.class.getDeclaredField("client");
      privateField.setAccessible(true);
      Client client = (Client)privateField.get(keycloak);
      
      WebTarget register = client.target(absoluteUri).register(new BearerAuthFilter(accessToken));
      return Keycloak.getClientProvider().targetProxy(register, proxyClass);
    } catch (Exception e) {
      throw new IllegalStateException("Unable to access private field 'client'", e);
    }
  }
  
}

