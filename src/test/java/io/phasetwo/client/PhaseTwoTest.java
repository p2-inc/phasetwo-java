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
      new KeycloakContainer("quay.io/phasetwo/phasetwo-keycloak:19.0.3-alpha").withContextPath("/auth").withReuse(true);

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
    OrganizationsApi orgApi = api.organizations();
    
    OrganizationRepresentation org = new OrganizationRepresentation().name("example");
    orgApi.createOrganization("master", org);

    try {
      List<OrganizationRepresentation> orgs = orgApi.getOrganizations("master", null, null, null);
      org = orgs.get(0);
    } catch (Exception e) {
      e.printStackTrace();
    }
    assertThat(org, notNullValue());
    assertThat(org.getName(), is("example"));
    
    orgApi.deleteOrganization("master", org.getId());
  }

}
