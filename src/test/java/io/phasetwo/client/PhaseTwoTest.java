package io.phasetwo.client;

import org.keycloak.admin.client.Keycloak;
import dasniko.testcontainers.keycloak.KeycloakContainer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import java.util.List;

public class PhaseTwoTest {

  public static final KeycloakContainer container =
      new KeycloakContainer("quay.io/phasetwo/phasetwo-keycloak:24.0.4").withContextPath("/auth").withReuse(true);

  @BeforeAll
  public static void beforeAll() {
    container.start();
  }

  @AfterAll
  public static void afterAll() {
    container.stop();
  }

  @Test
  public void createOrg() throws Exception {
    PhaseTwo api = new PhaseTwo(container.getKeycloakAdminClient(), container.getAuthServerUrl());
    OrganizationRepresentation org = new OrganizationRepresentation().name("example");
    OrganizationsResource orgs = api.organizations("master");
    String orgId = orgs.create(org);

    try {
      List<OrganizationRepresentation> orglist = orgs.get();
      org = orglist.get(0);
    } catch (Exception e) {
      e.printStackTrace();
    }
    assertThat(org, notNullValue());
    assertThat(org.getName(), is("example"));
    assertThat(org.getId(), is(orgId));
    
    orgs.organization(org.getId()).delete();
  }

}
