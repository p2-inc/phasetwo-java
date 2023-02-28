package io.phasetwo.client;

import io.phasetwo.client.openapi.api.UsersApi;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;

import java.util.List;

public class UserResource {
  private final String userId;
  private final String realm;
  private final UsersApi impl;

  public UserResource(String userId, String realm, UsersApi impl) {
    this.userId = userId;
    this.realm = realm;
    this.impl = impl;
  }

  public List<OrganizationRepresentation> getOrganizations() {
    return impl.realmUsersUserIdOrgsGet(realm, userId);
  }

  public List<OrganizationRoleRepresentation> getRoles(String organizationId) {
    return impl.realmUsersUserIdOrgsOrgIdRolesGet(realm, userId, organizationId);
  }
}
