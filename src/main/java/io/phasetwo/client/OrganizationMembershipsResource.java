package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Optional;
import jakarta.ws.rs.core.Response;

public class OrganizationMembershipsResource  {

  private final String orgId;
  private final String realm;
  private final OrganizationMembershipsApi impl;
  
  OrganizationMembershipsResource(String orgId, String realm, OrganizationMembershipsApi impl) {
    this.orgId = orgId;
    this.realm = realm;
    this.impl = impl;
  }

  public void add(String userId) {
    impl.addOrganizationMember(realm, orgId, userId);
  }

  public boolean isMember(String userId) {
    return (impl.checkOrganizationMembership(realm, orgId, userId).getStatus() == Response.Status.NO_CONTENT.getStatusCode());
  }

  public List<UserWithOrgsRepresentation> members() {
    return members(Optional.empty(), Optional.empty(), Optional.empty(), false, false);
  }

  public List<UserWithOrgsRepresentation> members(Optional<String> search, Optional<Integer> first, Optional<Integer> max, boolean excludeAccounts, boolean includeOrgs) {
    return impl.getOrganizationMemberships(realm, orgId, search.orElse(null), first.orElse(null), max.orElse(null), excludeAccounts, includeOrgs);
  }

  public Integer count(boolean excludeAdminAccounts) {
    return impl.getOrganizationMembershipsCount(realm, orgId, excludeAdminAccounts);
  }

  public void remove(String userId) {
    impl.removeOrganizationMember(realm, orgId, userId);
  }
}
