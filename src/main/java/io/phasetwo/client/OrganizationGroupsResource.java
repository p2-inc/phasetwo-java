package io.phasetwo.client;

import io.phasetwo.client.openapi.api.OrganizationGroupsApi;
import io.phasetwo.client.openapi.model.OrganizationGroupRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;

import java.util.List;
import java.util.Optional;

import static io.phasetwo.client.Resources.getIdFromResponse;

public class OrganizationGroupsResource {

  private final String orgId;
  private final String realm;
  private final OrganizationGroupsApi impl;

  public OrganizationGroupsResource(String orgId, String realm, OrganizationGroupsApi impl) {
    this.orgId = orgId;
    this.realm = realm;
    this.impl = impl;
  }

  public OrganizationGroupResource group(String groupId) {
    return new OrganizationGroupResource(groupId, orgId, realm, impl);
  }

  public String create(OrganizationGroupRepresentation representation) {
    return getIdFromResponse(impl.createOrganizationGroup(realm, orgId, representation))
            .orElseThrow(() -> new IllegalStateException("Unable to create organization group for " + representation.getName()));
  }

  public List<OrganizationGroupRepresentation> get() {
    return impl.getOrganizationGroups(realm, orgId);
  }
}
