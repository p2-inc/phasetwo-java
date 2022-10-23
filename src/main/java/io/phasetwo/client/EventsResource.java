package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Optional;

public class EventsResource  {

  private final String realm;
  private final EventsApi impl;
  
  EventsResource(String realm, EventsApi impl) {
    this.realm = realm;
    this.impl = impl;
  }

  public void send(EventRepresentation eventRepresentation) {
    impl.createEvent(realm, eventRepresentation);
  }

}
