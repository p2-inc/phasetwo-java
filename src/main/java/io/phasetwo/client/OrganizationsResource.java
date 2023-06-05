package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.ws.rs.core.Response;

import static io.phasetwo.client.Resources.getIdFromResponse;

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

  public String create(OrganizationRepresentation representation) {
    return getIdFromResponse(impl.createOrganization(realm, representation))
            .orElseThrow(() -> new IllegalStateException("Unable to create organization for " + representation.getName()));
  }
  
  public List<OrganizationRepresentation> get() {
    return get(Optional.empty(), Optional.empty(), Optional.empty());
  }
  
  public List<OrganizationRepresentation> get(Optional<String> search, Optional<Integer> first, Optional<Integer> max) {
    return impl.getOrganizations(realm, search.orElse(null), first.orElse(null), max.orElse(null), null);
  }

  public List<OrganizationRepresentation> get(Optional<String> search, Optional<String> attrSearch, Optional<Integer> first, Optional<Integer> max) {
    return impl.getOrganizations(realm, search.orElse(null), first.orElse(null), max.orElse(null), attrSearch.orElse(null));
  }

  public Integer count(Optional<String> search) {
    return impl.getOrganizationsCount(realm, search.orElse(null));
  }

  public Map<String, MyOrganizationRepresentation> me() {
    return impl.getMe(realm);
  }
}
