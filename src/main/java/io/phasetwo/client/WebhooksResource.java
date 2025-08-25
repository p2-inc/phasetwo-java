package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;
import java.util.Optional;

import static io.phasetwo.client.Resources.getIdFromResponse;

public class WebhooksResource  {

  private final String realm;
  private final EventsApi impl;
  
  WebhooksResource(String realm, EventsApi impl) {
    this.realm = realm;
    this.impl = impl;
  }

  public String create(WebhookRepresentation webhookRepresentation) {
    return getIdFromResponse(impl.createWebhook(realm, webhookRepresentation))
            .orElseThrow(() -> new IllegalStateException("Unable to create webhook for " + realm));
  }

  public void delete(String id) {
    impl.deleteWebhook(realm, id);
  }

  public WebhookRepresentation get(String id) {
    return impl.getWebhookById(realm, id);
  }

  public List<WebhookRepresentation> get() {
    return impl.getWebhooks(realm,0, Integer.MAX_VALUE);
  }

  public List<WebhookRepresentation> get(Optional<Integer> first, Optional<Integer> max) {
    return impl.getWebhooks(realm, first.orElse(null), max.orElse(null));
  }

  public void update(String id, WebhookRepresentation webhookRepresentation) {
    impl.updateWebhook(realm, id, webhookRepresentation);
  }
}
