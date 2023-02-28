package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Optional;
import javax.ws.rs.core.Response;

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
    return Resources.isNoContent(impl.checkOrganizationMembership(realm, orgId, userId));
  }

  public List<UserRepresentation> members() {
    return members(Optional.empty(), Optional.empty());
  }

  public List<UserRepresentation> members(Optional<Integer> first, Optional<Integer> max) {
    return impl.getOrganizationMemberships(realm, orgId, first.orElse(null), max.orElse(null));
  }

  public void remove(String userId) {
    impl.removeOrganizationMember(realm, orgId, userId);
  }
}
