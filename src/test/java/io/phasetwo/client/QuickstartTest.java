package io.phasetwo.client;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import jakarta.ws.rs.core.Response;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.ClientRepresentation;
import org.keycloak.representations.idm.RealmRepresentation;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;

/** Runs the README quick start ({@link QuickstartExample}) against Phase Two Keycloak. */
public class QuickstartTest {

  private static final String REALM = "quickstart";
  private static final String CLIENT_ID = "quickstart-sa";
  private static final String CLIENT_SECRET = "quickstart-secret";

  @Test
  public void quickstart() {
    PhaseTwoTest.container.start();
    Keycloak admin = PhaseTwoTest.container.getKeycloakAdminClient();
    String serverUrl = PhaseTwoTest.container.getAuthServerUrl();
    String userId = setUpRealm(admin);

    String orgId =
        QuickstartExample.quickstart(serverUrl, REALM, CLIENT_ID, CLIENT_SECRET, userId);

    PhaseTwo phaseTwo = new PhaseTwo(admin, serverUrl);
    OrganizationResource org = phaseTwo.organizations(REALM).organization(orgId);
    OrganizationRepresentation rep = org.get();
    assertThat(rep, notNullValue());
    assertThat(rep.getName(), is("acme"));
    assertThat(org.memberships().isMember(userId), is(true));

    assertThat(QuickstartExample.exists(phaseTwo, REALM, orgId), is(true));
    org.delete();
    assertThat(QuickstartExample.exists(phaseTwo, REALM, orgId), is(false));
    admin.realm(REALM).remove();
  }

  /** A realm with a service-account client allowed to manage it, and one user. */
  private static String setUpRealm(Keycloak admin) {
    RealmRepresentation realm = new RealmRepresentation();
    realm.setRealm(REALM);
    realm.setEnabled(true);
    admin.realms().create(realm);
    RealmResource r = admin.realm(REALM);

    ClientRepresentation client = new ClientRepresentation();
    client.setClientId(CLIENT_ID);
    client.setSecret(CLIENT_SECRET);
    client.setPublicClient(false);
    client.setServiceAccountsEnabled(true);
    client.setStandardFlowEnabled(false);
    r.clients().create(client).close();
    String clientUuid = r.clients().findByClientId(CLIENT_ID).get(0).getId();
    UserRepresentation sa = r.clients().get(clientUuid).getServiceAccountUser();
    String rm = r.clients().findByClientId("realm-management").get(0).getId();
    RoleRepresentation realmAdmin = r.clients().get(rm).roles().get("realm-admin").toRepresentation();
    r.users().get(sa.getId()).roles().clientLevel(rm).add(List.of(realmAdmin));

    UserRepresentation user = new UserRepresentation();
    user.setUsername("jane");
    user.setEmail("jane@acme.example");
    user.setEnabled(true);
    try (Response resp = r.users().create(user)) {
      String path = resp.getLocation().getPath();
      return path.substring(path.lastIndexOf('/') + 1);
    }
  }
}
