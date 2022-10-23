package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Optional;

public class OrganizationDomainsResource  {

  private final String orgId;
  private final String realm;
  private final OrganizationDomainsApi impl;
  
  OrganizationDomainsResource(String orgId, String realm, OrganizationDomainsApi impl) {
    this.orgId = orgId;
    this.realm = realm;
    this.impl = impl;
  }

  public List<OrganizationDomainRepresentation> get() {
    return impl.getOrganizationDomains(realm, orgId);
  }

  public OrganizationDomainRepresentation get(String domainName) {
    return impl.getOrganizationDomain(realm, orgId, domainName);
  }

  public void verify(String domainName) {
    impl.verifyDomain(realm, orgId, domainName);
  }
}
