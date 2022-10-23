package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Optional;
import javax.ws.rs.core.Response;

public class OrganizationsResource  {

  private final String realm;
  private final OrganizationsApi impl;
  private final PhaseTwo p2;
  
  OrganizationsResource(String realm, OrganizationsApi impl, PhaseTwo p2) {
    this.realm = realm;
    this.impl = impl;
    this.p2 = p2;
  }

  public OrganizationResource organization(String orgId) {
    return new OrganizationResource(orgId, realm, impl, p2);
  }

  public String create(OrganizationRepresentation organizationRepresentation) {
    Optional<String> id = Resources.getIdFromResponse(impl.createOrganization(realm, organizationRepresentation));
    if (id.isPresent()) return id.get();
    else throw new IllegalStateException("Unable to create organization for "+organizationRepresentation.getName());
  }
  
  public List<OrganizationRepresentation> get() {
    return get(Optional.empty(), Optional.empty(), Optional.empty());
  }
  
  public List<OrganizationRepresentation> get(Optional<String> search, Optional<Integer> first, Optional<Integer> max) {
    return impl.getOrganizations(realm, search.orElse(null), first.orElse(null), max.orElse(null));
  }
}
