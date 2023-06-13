package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.Optional;

public class OrganizationResource  {

  private final String orgId;
  private final String realm;
  private final OrganizationsApi impl;
  private final PhaseTwo p2;
  
  OrganizationResource(String orgId, String realm, OrganizationsApi impl, PhaseTwo p2) {
    this.orgId = orgId;
    this.realm = realm;
    this.impl = impl;
    this.p2 = p2;
  }

  public OrganizationIdentityProvidersResource identityProviders() {
    return new OrganizationIdentityProvidersResource(orgId, realm, p2.getIdentityProvidersApi());
  }

  public OrganizationDomainsResource domains() {
    return new OrganizationDomainsResource(orgId, realm, p2.getOrganizationDomainsApi());
  }

  public OrganizationInvitationsResource invitations() {
    return new OrganizationInvitationsResource(orgId, realm, p2.getOrganizationInvitationsApi());
  }

  public OrganizationMembershipsResource memberships() {
    return new OrganizationMembershipsResource(orgId, realm, p2.getOrganizationMembershipsApi());
  }

  public OrganizationRolesResource roles() {
    return new OrganizationRolesResource(orgId, realm, p2.getOrganizationRolesApi());
  }
  
  public PortalLinkRepresentation portalLink(Optional<String> userId) {
    return impl.createPortalLink(realm, orgId, userId.orElse(null));
  }

  public OrganizationGroupsResource groups() {
    return new OrganizationGroupsResource(orgId, realm, p2.getOrganizationGroupsApi());
  }

  public void delete() {
    impl.deleteOrganization(realm, orgId);
  }

  public OrganizationRepresentation get() {
    return impl.getOrganizationById(realm, orgId);
  }

  public void update(OrganizationRepresentation organizationRepresentation) {
    impl.updateOrganization(realm, orgId, organizationRepresentation);
  }
}
