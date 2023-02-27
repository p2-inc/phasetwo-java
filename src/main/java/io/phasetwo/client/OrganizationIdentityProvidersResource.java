package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Optional;

import static io.phasetwo.client.Resources.getIdFromResponse;

public class OrganizationIdentityProvidersResource  {

  private final String orgId;
  private final String realm;
  private final IdentityProvidersApi impl;
  
  OrganizationIdentityProvidersResource(String orgId, String realm, IdentityProvidersApi impl) {
    this.orgId = orgId;
    this.realm = realm;
    this.impl = impl;
  }

  public String addMapper(String alias, IdentityProviderMapperRepresentation representation) {
    return getIdFromResponse(impl.addIdpMapper(realm, orgId, alias, representation))
            .orElseThrow(() -> new IllegalStateException("Unable to create mapper for " + alias));
  }

  public String create(IdentityProviderRepresentation representation) {
    return getIdFromResponse(impl.createIdp(realm, orgId, representation))
            .orElseThrow(() -> new IllegalStateException("Unable to create mapper for " + representation.getAlias()));
  }

  public void delete(String alias) {
    impl.deleteIdp(realm, orgId, alias);
  }

  public IdentityProviderRepresentation get(String alias) {
    return impl.getIdp(realm, orgId, alias);
  }

  public IdentityProviderMapperRepresentation getMapper(String alias, String id) {
    return impl.getIdpMapper(realm, orgId, alias, id);
  }

  public List<IdentityProviderMapperRepresentation> getMappers(String alias) {
    return impl.getIdpMappers(realm, orgId, alias);
  }

  public List<IdentityProviderRepresentation> get() {
    return impl.getIdps(realm, orgId);
  }

  public void update(String alias, IdentityProviderRepresentation identityProviderRepresentation) {
    impl.updateIdp(realm, orgId, alias, identityProviderRepresentation);
  }

  public void updateMapper(String alias, String id, IdentityProviderMapperRepresentation identityProviderMapperRepresentation) {
    impl.updateIdpMapper(realm, orgId, alias, id, identityProviderMapperRepresentation);
  }

  public void deleteMapper(String alias, String id) {
    impl.deleteIdpMapper(realm, orgId, alias, id);
  }
}
