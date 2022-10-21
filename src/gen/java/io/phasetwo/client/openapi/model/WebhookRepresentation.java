package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("WebhookRepresentation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T13:51:00.208924Z[Etc/UTC]")
public class WebhookRepresentation   {
  private Object attributes;
  private String id;
  private Boolean enabled;
  private String url;
  private String secret;
  private String createdBy;
  private String createdAt;
  private String realm;
  private List<String> eventTypes = null;

  /**
   **/
  public WebhookRepresentation attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @JsonProperty("attributes")
  public Object getAttributes() {
    return attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  /**
   **/
  public WebhookRepresentation id(String id) {
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

  /**
   **/
  public WebhookRepresentation enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  public WebhookRepresentation url(String url) {
    this.url = url;
    return this;
  }

  
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  public WebhookRepresentation secret(String secret) {
    this.secret = secret;
    return this;
  }

  
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }

  @JsonProperty("secret")
  public void setSecret(String secret) {
    this.secret = secret;
  }

  /**
   **/
  public WebhookRepresentation createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  
  @JsonProperty("created_by")
  public String getCreatedBy() {
    return createdBy;
  }

  @JsonProperty("created_by")
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   **/
  public WebhookRepresentation createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public WebhookRepresentation realm(String realm) {
    this.realm = realm;
    return this;
  }

  
  @JsonProperty("realm")
  public String getRealm() {
    return realm;
  }

  @JsonProperty("realm")
  public void setRealm(String realm) {
    this.realm = realm;
  }

  /**
   **/
  public WebhookRepresentation eventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  
  @JsonProperty("event_types")
  public List<String> getEventTypes() {
    return eventTypes;
  }

  @JsonProperty("event_types")
  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }

  public WebhookRepresentation addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }

    this.eventTypes.add(eventTypesItem);
    return this;
  }

  public WebhookRepresentation removeEventTypesItem(String eventTypesItem) {
    if (eventTypesItem != null && this.eventTypes != null) {
      this.eventTypes.remove(eventTypesItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRepresentation webhookRepresentation = (WebhookRepresentation) o;
    return Objects.equals(this.attributes, webhookRepresentation.attributes) &&
        Objects.equals(this.id, webhookRepresentation.id) &&
        Objects.equals(this.enabled, webhookRepresentation.enabled) &&
        Objects.equals(this.url, webhookRepresentation.url) &&
        Objects.equals(this.secret, webhookRepresentation.secret) &&
        Objects.equals(this.createdBy, webhookRepresentation.createdBy) &&
        Objects.equals(this.createdAt, webhookRepresentation.createdAt) &&
        Objects.equals(this.realm, webhookRepresentation.realm) &&
        Objects.equals(this.eventTypes, webhookRepresentation.eventTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, enabled, url, secret, createdBy, createdAt, realm, eventTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRepresentation {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

