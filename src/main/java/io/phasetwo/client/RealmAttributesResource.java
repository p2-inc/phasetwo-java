package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class RealmAttributesResource  {

  private final String realm;
  private final AttributesApi impl;
  
  RealmAttributesResource(String realm, AttributesApi impl) {
    this.realm = realm;
    this.impl = impl;
  }

  public void create(RealmAttributeRepresentation realmAttributeRepresentation) {
    impl.createRealmAttribute(realm, realmAttributeRepresentation);
  }

  public void delete(String key) {
    impl.deleteRealmAttribute(realm, key);
  }

  public RealmAttributeRepresentation get(String key) {
    return impl.getRealmAttributeByKey(realm, key);
  }

  public List<Map<String, RealmAttributeRepresentation>> get() {
    return impl.getRealmAttributes(realm);
  }

  public void update(String key, RealmAttributeRepresentation realmAttributeRepresentation) {
    impl.updateRealmAttributeByKey(realm, key, realmAttributeRepresentation);
  }
}
