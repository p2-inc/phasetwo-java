package io.phasetwo.client;

import io.phasetwo.client.openapi.model.EventRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.PortalLinkRepresentation;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.WebApplicationException;
import java.util.List;
import java.util.Optional;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;

/**
 * The code shown in the README. {@link QuickstartTest} runs it against Phase Two Keycloak, and
 * phasetwo-sdk-generator copies the snippet regions into README.md.
 */
public class QuickstartExample {

  static String quickstart(
      String serverUrl, String realm, String clientId, String clientSecret, String userId) {
    // snippet:start quickstart
    // Authenticate as a service account (client credentials grant).
    Keycloak keycloak =
        KeycloakBuilder.builder()
            .serverUrl(serverUrl) // e.g. "https://euc1.auth.ac/auth"
            .realm(realm)
            .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
            .clientId(clientId)
            .clientSecret(clientSecret)
            .build();
    PhaseTwo phaseTwo = new PhaseTwo(keycloak, serverUrl);

    // Create an organization. create() returns the new id (from the Location header).
    OrganizationsResource orgs = phaseTwo.organizations(realm);
    String orgId =
        orgs.create(
            new OrganizationRepresentation()
                .name("acme")
                .displayName("Acme, Inc.")
                .domains(List.of("acme.example")));
    OrganizationResource org = orgs.organization(orgId);

    // Add an existing user as a member.
    org.memberships().add(userId);

    // Create a link to the IdP Wizard / admin portal for the organization.
    PortalLinkRepresentation portal = org.portalLink(Optional.empty());
    System.out.println("Portal link: " + portal.getLink());

    // Send an audit event.
    phaseTwo
        .events(realm)
        .send(
            new EventRepresentation()
                .type("acme.onboarded")
                .representation("{\"orgId\":\"" + orgId + "\"}")
                .time(System.currentTimeMillis()));
    // snippet:end quickstart
    return orgId;
  }

  static boolean exists(PhaseTwo phaseTwo, String realm, String orgId) {
    boolean found = true;
    // snippet:start errors
    try {
      phaseTwo.organizations(realm).organization(orgId).get();
    } catch (NotFoundException e) {
      // 404
      found = false;
    } catch (WebApplicationException e) {
      // any other non-2xx response
      throw new IllegalStateException("HTTP " + e.getResponse().getStatus(), e);
    }
    // snippet:end errors
    return found;
  }
}
