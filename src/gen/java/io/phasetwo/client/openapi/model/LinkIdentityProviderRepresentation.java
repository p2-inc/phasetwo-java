package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("LinkIdentityProviderRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class LinkIdentityProviderRepresentation   {
  private String alias;
  private String postBrokerFlow;
  private String syncMode;

  /**
   **/
  public LinkIdentityProviderRepresentation alias(String alias) {
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
  public LinkIdentityProviderRepresentation postBrokerFlow(String postBrokerFlow) {
    this.postBrokerFlow = postBrokerFlow;
    return this;
  }

  
  @JsonProperty("post_broker_flow")
  public String getPostBrokerFlow() {
    return postBrokerFlow;
  }

  @JsonProperty("post_broker_flow")
  public void setPostBrokerFlow(String postBrokerFlow) {
    this.postBrokerFlow = postBrokerFlow;
  }

  /**
   **/
  public LinkIdentityProviderRepresentation syncMode(String syncMode) {
    this.syncMode = syncMode;
    return this;
  }

  
  @JsonProperty("sync_mode")
  public String getSyncMode() {
    return syncMode;
  }

  @JsonProperty("sync_mode")
  public void setSyncMode(String syncMode) {
    this.syncMode = syncMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkIdentityProviderRepresentation linkIdentityProviderRepresentation = (LinkIdentityProviderRepresentation) o;
    return Objects.equals(this.alias, linkIdentityProviderRepresentation.alias) &&
        Objects.equals(this.postBrokerFlow, linkIdentityProviderRepresentation.postBrokerFlow) &&
        Objects.equals(this.syncMode, linkIdentityProviderRepresentation.syncMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, postBrokerFlow, syncMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkIdentityProviderRepresentation {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    postBrokerFlow: ").append(toIndentedString(postBrokerFlow)).append("\n");
    sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
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

