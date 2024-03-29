package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Optional;

import static io.phasetwo.client.Resources.getIdFromResponse;

public class OrganizationInvitationsResource  {

  private final String orgId;
  private final String realm;
  private final OrganizationInvitationsApi impl;
  
  OrganizationInvitationsResource(String orgId, String realm, OrganizationInvitationsApi impl) {
    this.orgId = orgId;
    this.realm = realm;
    this.impl = impl;
  }

  public String add(InvitationRequestRepresentation representation) {
    return getIdFromResponse(impl.addOrganizationInvitation(realm, orgId, representation))
            .orElseThrow(() -> new IllegalStateException("Unable to create invitation for " + representation));
  }

  public List<InvitationRepresentation> get() {
    return get(Optional.empty(), Optional.empty(), Optional.empty());
  }
  
  public List<InvitationRepresentation> get(Optional<String> search, Optional<Integer> first, Optional<Integer> max) {
    return impl.getOrganizationInvitations(realm, orgId, search.orElse(null), first.orElse(null), max.orElse(null));
  }

  public void delete(String invitationId) {
    impl.removeOrganizationInvitation(realm, orgId, invitationId);
  }
}
