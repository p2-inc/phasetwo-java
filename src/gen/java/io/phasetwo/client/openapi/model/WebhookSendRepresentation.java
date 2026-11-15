package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

@JsonTypeName("WebhookSendRepresentation")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public class WebhookSendRepresentation {
  private String id;
  private String type;
  private Integer status;
  private String statusMessage;
  private Integer retries;
  private Long sentAt;
  private String eventId;
  private String keycloakEventType;
  private String keycloakEventId;
  private WebhookRepresentation webhook;
  private String payload;

  public WebhookSendRepresentation() {}

  /** */
  public WebhookSendRepresentation id(String id) {
    this.id = id;
    return this;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /** */
  public WebhookSendRepresentation type(String type) {
    this.type = type;
    return this;
  }

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /** */
  public WebhookSendRepresentation status(Integer status) {
    this.status = status;
    return this;
  }

  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(Integer status) {
    this.status = status;
  }

  /** */
  public WebhookSendRepresentation statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  @JsonProperty("status_message")
  public String getStatusMessage() {
    return statusMessage;
  }

  @JsonProperty("status_message")
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  /** */
  public WebhookSendRepresentation retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  @JsonProperty("retries")
  public Integer getRetries() {
    return retries;
  }

  @JsonProperty("retries")
  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  /** When the send was attempted, in milliseconds since the epoch. */
  public WebhookSendRepresentation sentAt(Long sentAt) {
    this.sentAt = sentAt;
    return this;
  }

  @JsonProperty("sent_at")
  public Long getSentAt() {
    return sentAt;
  }

  @JsonProperty("sent_at")
  public void setSentAt(Long sentAt) {
    this.sentAt = sentAt;
  }

  /** */
  public WebhookSendRepresentation eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  @JsonProperty("event_id")
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /** */
  public WebhookSendRepresentation keycloakEventType(String keycloakEventType) {
    this.keycloakEventType = keycloakEventType;
    return this;
  }

  @JsonProperty("keycloak_event_type")
  public String getKeycloakEventType() {
    return keycloakEventType;
  }

  @JsonProperty("keycloak_event_type")
  public void setKeycloakEventType(String keycloakEventType) {
    this.keycloakEventType = keycloakEventType;
  }

  /** */
  public WebhookSendRepresentation keycloakEventId(String keycloakEventId) {
    this.keycloakEventId = keycloakEventId;
    return this;
  }

  @JsonProperty("keycloak_event_id")
  public String getKeycloakEventId() {
    return keycloakEventId;
  }

  @JsonProperty("keycloak_event_id")
  public void setKeycloakEventId(String keycloakEventId) {
    this.keycloakEventId = keycloakEventId;
  }

  /** */
  public WebhookSendRepresentation webhook(WebhookRepresentation webhook) {
    this.webhook = webhook;
    return this;
  }

  @JsonProperty("webhook")
  public WebhookRepresentation getWebhook() {
    return webhook;
  }

  @JsonProperty("webhook")
  public void setWebhook(WebhookRepresentation webhook) {
    this.webhook = webhook;
  }

  /** */
  public WebhookSendRepresentation payload(String payload) {
    this.payload = payload;
    return this;
  }

  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }

  @JsonProperty("payload")
  public void setPayload(String payload) {
    this.payload = payload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSendRepresentation webhookSendRepresentation = (WebhookSendRepresentation) o;
    return Objects.equals(this.id, webhookSendRepresentation.id)
        && Objects.equals(this.type, webhookSendRepresentation.type)
        && Objects.equals(this.status, webhookSendRepresentation.status)
        && Objects.equals(this.statusMessage, webhookSendRepresentation.statusMessage)
        && Objects.equals(this.retries, webhookSendRepresentation.retries)
        && Objects.equals(this.sentAt, webhookSendRepresentation.sentAt)
        && Objects.equals(this.eventId, webhookSendRepresentation.eventId)
        && Objects.equals(this.keycloakEventType, webhookSendRepresentation.keycloakEventType)
        && Objects.equals(this.keycloakEventId, webhookSendRepresentation.keycloakEventId)
        && Objects.equals(this.webhook, webhookSendRepresentation.webhook)
        && Objects.equals(this.payload, webhookSendRepresentation.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        type,
        status,
        statusMessage,
        retries,
        sentAt,
        eventId,
        keycloakEventType,
        keycloakEventId,
        webhook,
        payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSendRepresentation {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    keycloakEventType: ").append(toIndentedString(keycloakEventType)).append("\n");
    sb.append("    keycloakEventId: ").append(toIndentedString(keycloakEventId)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
