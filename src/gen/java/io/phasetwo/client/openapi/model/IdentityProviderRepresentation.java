package io.phasetwo.client.openapi.model;

import java.util.HashMap;
import java.util.Map;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("IdentityProviderRepresentation")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T13:51:00.208924Z[Etc/UTC]")
public class IdentityProviderRepresentation   {
  private Boolean addReadTokenRoleOnCreate;
  private String alias;
  private Map<String, Object> config = null;
  private String displayName;
  private Boolean enabled;
  private String firstBrokerLoginFlowAlias;
  private String internalId;
  private Boolean linkOnly;
  private String postBrokerLoginFlowAlias;
  private String providerId;
  private Boolean storeToken;
  private Boolean trustEmail;

  /**
   **/
  public IdentityProviderRepresentation addReadTokenRoleOnCreate(Boolean addReadTokenRoleOnCreate) {
    this.addReadTokenRoleOnCreate = addReadTokenRoleOnCreate;
    return this;
  }

  
  @JsonProperty("addReadTokenRoleOnCreate")
  public Boolean getAddReadTokenRoleOnCreate() {
    return addReadTokenRoleOnCreate;
  }

  @JsonProperty("addReadTokenRoleOnCreate")
  public void setAddReadTokenRoleOnCreate(Boolean addReadTokenRoleOnCreate) {
    this.addReadTokenRoleOnCreate = addReadTokenRoleOnCreate;
  }

  /**
   **/
  public IdentityProviderRepresentation alias(String alias) {
    this.alias = alias;
    return this;
  }

  
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }

  @JsonProperty("alias")
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   **/
  public IdentityProviderRepresentation config(Map<String, Object> config) {
    this.config = config;
    return this;
  }

  
  @JsonProperty("config")
  public Map<String, Object> getConfig() {
    return config;
  }

  @JsonProperty("config")
  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }

  public IdentityProviderRepresentation putConfigItem(String key, Object configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }

    this.config.put(key, configItem);
    return this;
  }

  public IdentityProviderRepresentation removeConfigItem(Object configItem) {
    if (configItem != null && this.config != null) {
      this.config.remove(configItem);
    }

    return this;
  }
  /**
   **/
  public IdentityProviderRepresentation displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  public IdentityProviderRepresentation enabled(Boolean enabled) {
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
  public IdentityProviderRepresentation firstBrokerLoginFlowAlias(String firstBrokerLoginFlowAlias) {
    this.firstBrokerLoginFlowAlias = firstBrokerLoginFlowAlias;
    return this;
  }

  
  @JsonProperty("firstBrokerLoginFlowAlias")
  public String getFirstBrokerLoginFlowAlias() {
    return firstBrokerLoginFlowAlias;
  }

  @JsonProperty("firstBrokerLoginFlowAlias")
  public void setFirstBrokerLoginFlowAlias(String firstBrokerLoginFlowAlias) {
    this.firstBrokerLoginFlowAlias = firstBrokerLoginFlowAlias;
  }

  /**
   **/
  public IdentityProviderRepresentation internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  
  @JsonProperty("internalId")
  public String getInternalId() {
    return internalId;
  }

  @JsonProperty("internalId")
  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  /**
   **/
  public IdentityProviderRepresentation linkOnly(Boolean linkOnly) {
    this.linkOnly = linkOnly;
    return this;
  }

  
  @JsonProperty("linkOnly")
  public Boolean getLinkOnly() {
    return linkOnly;
  }

  @JsonProperty("linkOnly")
  public void setLinkOnly(Boolean linkOnly) {
    this.linkOnly = linkOnly;
  }

  /**
   **/
  public IdentityProviderRepresentation postBrokerLoginFlowAlias(String postBrokerLoginFlowAlias) {
    this.postBrokerLoginFlowAlias = postBrokerLoginFlowAlias;
    return this;
  }

  
  @JsonProperty("postBrokerLoginFlowAlias")
  public String getPostBrokerLoginFlowAlias() {
    return postBrokerLoginFlowAlias;
  }

  @JsonProperty("postBrokerLoginFlowAlias")
  public void setPostBrokerLoginFlowAlias(String postBrokerLoginFlowAlias) {
    this.postBrokerLoginFlowAlias = postBrokerLoginFlowAlias;
  }

  /**
   **/
  public IdentityProviderRepresentation providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  
  @JsonProperty("providerId")
  public String getProviderId() {
    return providerId;
  }

  @JsonProperty("providerId")
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  /**
   **/
  public IdentityProviderRepresentation storeToken(Boolean storeToken) {
    this.storeToken = storeToken;
    return this;
  }

  
  @JsonProperty("storeToken")
  public Boolean getStoreToken() {
    return storeToken;
  }

  @JsonProperty("storeToken")
  public void setStoreToken(Boolean storeToken) {
    this.storeToken = storeToken;
  }

  /**
   **/
  public IdentityProviderRepresentation trustEmail(Boolean trustEmail) {
    this.trustEmail = trustEmail;
    return this;
  }

  
  @JsonProperty("trustEmail")
  public Boolean getTrustEmail() {
    return trustEmail;
  }

  @JsonProperty("trustEmail")
  public void setTrustEmail(Boolean trustEmail) {
    this.trustEmail = trustEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityProviderRepresentation identityProviderRepresentation = (IdentityProviderRepresentation) o;
    return Objects.equals(this.addReadTokenRoleOnCreate, identityProviderRepresentation.addReadTokenRoleOnCreate) &&
        Objects.equals(this.alias, identityProviderRepresentation.alias) &&
        Objects.equals(this.config, identityProviderRepresentation.config) &&
        Objects.equals(this.displayName, identityProviderRepresentation.displayName) &&
        Objects.equals(this.enabled, identityProviderRepresentation.enabled) &&
        Objects.equals(this.firstBrokerLoginFlowAlias, identityProviderRepresentation.firstBrokerLoginFlowAlias) &&
        Objects.equals(this.internalId, identityProviderRepresentation.internalId) &&
        Objects.equals(this.linkOnly, identityProviderRepresentation.linkOnly) &&
        Objects.equals(this.postBrokerLoginFlowAlias, identityProviderRepresentation.postBrokerLoginFlowAlias) &&
        Objects.equals(this.providerId, identityProviderRepresentation.providerId) &&
        Objects.equals(this.storeToken, identityProviderRepresentation.storeToken) &&
        Objects.equals(this.trustEmail, identityProviderRepresentation.trustEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addReadTokenRoleOnCreate, alias, config, displayName, enabled, firstBrokerLoginFlowAlias, internalId, linkOnly, postBrokerLoginFlowAlias, providerId, storeToken, trustEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityProviderRepresentation {\n");
    
    sb.append("    addReadTokenRoleOnCreate: ").append(toIndentedString(addReadTokenRoleOnCreate)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    firstBrokerLoginFlowAlias: ").append(toIndentedString(firstBrokerLoginFlowAlias)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    linkOnly: ").append(toIndentedString(linkOnly)).append("\n");
    sb.append("    postBrokerLoginFlowAlias: ").append(toIndentedString(postBrokerLoginFlowAlias)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    storeToken: ").append(toIndentedString(storeToken)).append("\n");
    sb.append("    trustEmail: ").append(toIndentedString(trustEmail)).append("\n");
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

