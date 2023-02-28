package io.phasetwo.client;

import io.phasetwo.client.openapi.api.OrganizationGroupsApi;
import io.phasetwo.client.openapi.model.OrganizationGroupRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;
import io.phasetwo.client.openapi.model.UserRepresentation;

import java.util.List;

public class OrganizationGroupResource {

  private final String groupId;
  private final String orgId;
  private final String realm;
  private final OrganizationGroupsApi impl;

  public OrganizationGroupResource(String groupId, String orgId, String realm, OrganizationGroupsApi impl) {
    this.groupId = groupId;
    this.orgId = orgId;
    this.realm = realm;
    this.impl = impl;
  }

  public OrganizationGroupRepresentation get() {
    return impl.getOrganizationGroup(realm, orgId, groupId);
  }

  public void delete() {
    impl.deleteOrganizationGroup(realm, orgId, groupId);
  }

  public void update(OrganizationGroupRepresentation representation) {
    impl.updateOrganizationGroup(realm, orgId, groupId, representation);
  }

  public List<UserRepresentation> users() {
    return impl.getUsersFromOrganizationGroup(realm, orgId, groupId);
  }

  public void addUser(String userId) {
    impl.addUserToOrganizationGroup(realm, orgId, groupId, userId);
  }

  public void removeUser(String userId) {
    impl.removeUserFromOrganizationGroup(realm, orgId, groupId, userId);
  }

  public boolean isMember(String userId) {
    return Resources.isNoContent(impl.isMemberOfOrganizationGroup(realm, orgId, groupId, userId));
  }

  public List<OrganizationRoleRepresentation> roles() {
    return impl.getOrganizationGroupRoles(realm, orgId, groupId);
  }

  public void addRole(String roleName) {
    impl.grantGroupOrganizationRole(realm, orgId, groupId, roleName);
  }

  public void removeRole(String  roleName) {
    impl.revokeGroupOrganizationRole(realm, orgId, groupId, roleName);
  }

  public boolean containsRole(String roleName) {
    return Resources.isNoContent(impl.checkGroupOrganizationRole(realm, orgId, groupId, roleName));
  }

  public List<OrganizationGroupRepresentation> children() {
    return impl.getOrganizationGroupChildren(realm, orgId, groupId);
  }
}
