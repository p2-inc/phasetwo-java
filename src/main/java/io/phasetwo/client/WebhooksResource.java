package io.phasetwo.client;

import io.phasetwo.client.openapi.api.*;
import io.phasetwo.client.openapi.model.*;
import java.util.List;

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
    return impl.getWebhooks(realm);
  }

  public void update(String id, WebhookRepresentation webhookRepresentation) {
    impl.updateWebhook(realm, id, webhookRepresentation);
  }
}
