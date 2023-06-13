package io.phasetwo.client;

import io.phasetwo.client.openapi.api.UsersApi;

public class UsersResource {

  private final String realm;
  private final UsersApi impl;

  public UsersResource(String realm, UsersApi impl) {
    this.realm = realm;
    this.impl = impl;
  }

  public UserResource user(String userId) {
    return new UserResource(userId, realm, impl);
  }
}
