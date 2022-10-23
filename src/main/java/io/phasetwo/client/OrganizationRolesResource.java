package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Optional;
import javax.ws.rs.core.Response;

public class OrganizationRolesResource  {

  private final String orgId;
  private final String realm;
  private final OrganizationRolesApi impl;
  
  OrganizationRolesResource(String orgId, String realm, OrganizationRolesApi impl) {
    this.orgId = orgId;
    this.realm = realm;
    this.impl = impl;
  }

  public boolean hasRole(String role, String userId) {
    return (impl.checkUserOrganizationRole(realm, orgId, role, userId).getStatus() == Response.Status.NO_CONTENT.getStatusCode());
  }

  public void create(OrganizationRoleRepresentation organizationRoleRepresentation) {
    impl.createOrganizationRole(realm, orgId, organizationRoleRepresentation);
  }

  public void delete(String role) {
    impl.deleteOrganizationRole(realm, orgId, role);
  }

  public OrganizationRoleRepresentation get(String role) {
    return impl.getOrganizationRole(realm, orgId, role);
  }

  public List<OrganizationRoleRepresentation> get() {
    return impl.getOrganizationRoles(realm, orgId);
  }

  public List<UserRepresentation> users(String role) {
    return impl.getUserOrganizationRoles(realm, orgId, role);
  }

  public void grant(String role, String userId) {
    impl.grantUserOrganizationRole(realm, orgId, role, userId);
  }

  public void revoke(String role, String userId) {
    impl.revokeUserOrganizationRole(realm, orgId, role, userId);
  }

  public void update(String role, OrganizationRoleRepresentation organizationRoleRepresentation) {
    impl.updateOrganizationRole(realm, orgId, role, organizationRoleRepresentation);
  }
  
}
