package io.phasetwo.client.openapi.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("OrganizationConfigRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class OrganizationConfigRepresentation   {
  private Boolean createAdminUser;
  private Boolean sharedIdps;
  private Boolean adminEventsEnabled;
  private Boolean eventsEnabled;
  private String defaultPostBrokerFlow;
  private String defaultSyncMode;
  private Map<String, List<String>> attributes = new HashMap<>();

  public OrganizationConfigRepresentation() {
  }

  /**
   * Whether to create a default admin user for new organizations
   **/
  public OrganizationConfigRepresentation createAdminUser(Boolean createAdminUser) {
    this.createAdminUser = createAdminUser;
    return this;
  }

  
  @JsonProperty("createAdminUser")
  public Boolean getCreateAdminUser() {
    return createAdminUser;
  }

  @JsonProperty("createAdminUser")
  public void setCreateAdminUser(Boolean createAdminUser) {
    this.createAdminUser = createAdminUser;
  }

  /**
   * Whether identity providers can be shared across organizations
   **/
  public OrganizationConfigRepresentation sharedIdps(Boolean sharedIdps) {
    this.sharedIdps = sharedIdps;
    return this;
  }

  
  @JsonProperty("sharedIdps")
  public Boolean getSharedIdps() {
    return sharedIdps;
  }

  @JsonProperty("sharedIdps")
  public void setSharedIdps(Boolean sharedIdps) {
    this.sharedIdps = sharedIdps;
  }

  /**
   * Whether admin events are enabled for organization operations
   **/
  public OrganizationConfigRepresentation adminEventsEnabled(Boolean adminEventsEnabled) {
    this.adminEventsEnabled = adminEventsEnabled;
    return this;
  }

  
  @JsonProperty("adminEventsEnabled")
  public Boolean getAdminEventsEnabled() {
    return adminEventsEnabled;
  }

  @JsonProperty("adminEventsEnabled")
  public void setAdminEventsEnabled(Boolean adminEventsEnabled) {
    this.adminEventsEnabled = adminEventsEnabled;
  }

  /**
   * Whether user events are enabled for organization operations
   **/
  public OrganizationConfigRepresentation eventsEnabled(Boolean eventsEnabled) {
    this.eventsEnabled = eventsEnabled;
    return this;
  }

  
  @JsonProperty("eventsEnabled")
  public Boolean getEventsEnabled() {
    return eventsEnabled;
  }

  @JsonProperty("eventsEnabled")
  public void setEventsEnabled(Boolean eventsEnabled) {
    this.eventsEnabled = eventsEnabled;
  }

  /**
   * Default post broker login flow for organization identity providers
   **/
  public OrganizationConfigRepresentation defaultPostBrokerFlow(String defaultPostBrokerFlow) {
    this.defaultPostBrokerFlow = defaultPostBrokerFlow;
    return this;
  }

  
  @JsonProperty("defaultPostBrokerFlow")
  public String getDefaultPostBrokerFlow() {
    return defaultPostBrokerFlow;
  }

  @JsonProperty("defaultPostBrokerFlow")
  public void setDefaultPostBrokerFlow(String defaultPostBrokerFlow) {
    this.defaultPostBrokerFlow = defaultPostBrokerFlow;
  }

  /**
   * Default sync mode for organization identity providers
   **/
  public OrganizationConfigRepresentation defaultSyncMode(String defaultSyncMode) {
    this.defaultSyncMode = defaultSyncMode;
    return this;
  }

  
  @JsonProperty("defaultSyncMode")
  public String getDefaultSyncMode() {
    return defaultSyncMode;
  }

  @JsonProperty("defaultSyncMode")
  public void setDefaultSyncMode(String defaultSyncMode) {
    this.defaultSyncMode = defaultSyncMode;
  }

  /**
   * Additional configuration attributes
   **/
  public OrganizationConfigRepresentation attributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @JsonProperty("attributes")
  public Map<String, List<String>> getAttributes() {
    return attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
  }

  public OrganizationConfigRepresentation putAttributesItem(String key, List<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }

    this.attributes.put(key, attributesItem);
    return this;
  }

  public OrganizationConfigRepresentation removeAttributesItem(String key) {
    if (this.attributes != null) {
      this.attributes.remove(key);
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
    OrganizationConfigRepresentation organizationConfigRepresentation = (OrganizationConfigRepresentation) o;
    return Objects.equals(this.createAdminUser, organizationConfigRepresentation.createAdminUser) &&
        Objects.equals(this.sharedIdps, organizationConfigRepresentation.sharedIdps) &&
        Objects.equals(this.adminEventsEnabled, organizationConfigRepresentation.adminEventsEnabled) &&
        Objects.equals(this.eventsEnabled, organizationConfigRepresentation.eventsEnabled) &&
        Objects.equals(this.defaultPostBrokerFlow, organizationConfigRepresentation.defaultPostBrokerFlow) &&
        Objects.equals(this.defaultSyncMode, organizationConfigRepresentation.defaultSyncMode) &&
        Objects.equals(this.attributes, organizationConfigRepresentation.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createAdminUser, sharedIdps, adminEventsEnabled, eventsEnabled, defaultPostBrokerFlow, defaultSyncMode, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationConfigRepresentation {\n");
    
    sb.append("    createAdminUser: ").append(toIndentedString(createAdminUser)).append("\n");
    sb.append("    sharedIdps: ").append(toIndentedString(sharedIdps)).append("\n");
    sb.append("    adminEventsEnabled: ").append(toIndentedString(adminEventsEnabled)).append("\n");
    sb.append("    eventsEnabled: ").append(toIndentedString(eventsEnabled)).append("\n");
    sb.append("    defaultPostBrokerFlow: ").append(toIndentedString(defaultPostBrokerFlow)).append("\n");
    sb.append("    defaultSyncMode: ").append(toIndentedString(defaultSyncMode)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
