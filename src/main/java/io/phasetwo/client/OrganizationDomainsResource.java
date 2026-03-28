package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;

public class OrganizationDomainsResource  {

  private final String orgId;
  private final String realm;
  private final OrganizationApi impl;
  private final OrganizationDomainsApi domainsImpl;
  
  OrganizationDomainsResource(String orgId, String realm, OrganizationApi impl, OrganizationDomainsApi domainsImpl) {
    this.orgId = orgId;
    this.realm = realm;
    this.impl = impl;
    this.domainsImpl = domainsImpl;
  }

  public List<OrganizationDomainRepresentation> get() {
    return impl.getOrganizationDomains(realm, orgId);
  }

  public OrganizationDomainRepresentation get(String domainName) {
    return impl.getOrganizationDomain(realm, orgId, domainName);
  }

  public void verify(String domainName) {
    domainsImpl.verifyDomain(realm, orgId, domainName);
  }
}
