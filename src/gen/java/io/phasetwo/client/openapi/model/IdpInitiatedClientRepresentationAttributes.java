package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/** String values only, including booleans (\&quot;true\&quot;/\&quot;false\&quot;). */
@JsonTypeName("IdpInitiatedClientRepresentation_attributes")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public class IdpInitiatedClientRepresentationAttributes {
  private String samlIdpInitiatedSsoUrlName;
  private String samlIdpInitiatedSsoRelayState;

  public enum SamlForcePostBindingEnum {
    TRUE(String.valueOf("true")),
    FALSE(String.valueOf("false"));

    private String value;

    SamlForcePostBindingEnum(String v) {
      value = v;
    }

    public String value() {
      return value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the <a
     * href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS
     * 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SamlForcePostBindingEnum fromString(String s) {
      for (SamlForcePostBindingEnum b : SamlForcePostBindingEnum.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static SamlForcePostBindingEnum fromValue(String value) {
      for (SamlForcePostBindingEnum b : SamlForcePostBindingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SamlForcePostBindingEnum samlForcePostBinding;
  private String samlAssertionConsumerUrlRedirect;
  private String samlAssertionConsumerUrlPost;
  private String phasetwoIdpInitiatedAlias;

  public IdpInitiatedClientRepresentationAttributes() {}

  /**
   * Must equal &#x60;clientId&#x60;. The identity provider posts to
   * &#x60;/realms/{realm}/broker/{alias}/endpoint/clients/{value}&#x60;.
   */
  public IdpInitiatedClientRepresentationAttributes samlIdpInitiatedSsoUrlName(
      String samlIdpInitiatedSsoUrlName) {
    this.samlIdpInitiatedSsoUrlName = samlIdpInitiatedSsoUrlName;
    return this;
  }

  @JsonProperty("saml_idp_initiated_sso_url_name")
  public String getSamlIdpInitiatedSsoUrlName() {
    return samlIdpInitiatedSsoUrlName;
  }

  @JsonProperty("saml_idp_initiated_sso_url_name")
  public void setSamlIdpInitiatedSsoUrlName(String samlIdpInitiatedSsoUrlName) {
    this.samlIdpInitiatedSsoUrlName = samlIdpInitiatedSsoUrlName;
  }

  /** RelayState sent to the target application. */
  public IdpInitiatedClientRepresentationAttributes samlIdpInitiatedSsoRelayState(
      String samlIdpInitiatedSsoRelayState) {
    this.samlIdpInitiatedSsoRelayState = samlIdpInitiatedSsoRelayState;
    return this;
  }

  @JsonProperty("saml_idp_initiated_sso_relay_state")
  public String getSamlIdpInitiatedSsoRelayState() {
    return samlIdpInitiatedSsoRelayState;
  }

  @JsonProperty("saml_idp_initiated_sso_relay_state")
  public void setSamlIdpInitiatedSsoRelayState(String samlIdpInitiatedSsoRelayState) {
    this.samlIdpInitiatedSsoRelayState = samlIdpInitiatedSsoRelayState;
  }

  /** Send the response to the target application with the POST binding. */
  public IdpInitiatedClientRepresentationAttributes samlForcePostBinding(
      SamlForcePostBindingEnum samlForcePostBinding) {
    this.samlForcePostBinding = samlForcePostBinding;
    return this;
  }

  @JsonProperty("saml.force.post.binding")
  public SamlForcePostBindingEnum getSamlForcePostBinding() {
    return samlForcePostBinding;
  }

  @JsonProperty("saml.force.post.binding")
  public void setSamlForcePostBinding(SamlForcePostBindingEnum samlForcePostBinding) {
    this.samlForcePostBinding = samlForcePostBinding;
  }

  /**
   * Where to send the user after login. For an OIDC application, its home page; for a SAML
   * application using the Redirect binding, its ACS URL.
   */
  public IdpInitiatedClientRepresentationAttributes samlAssertionConsumerUrlRedirect(
      String samlAssertionConsumerUrlRedirect) {
    this.samlAssertionConsumerUrlRedirect = samlAssertionConsumerUrlRedirect;
    return this;
  }

  @JsonProperty("saml_assertion_consumer_url_redirect")
  public String getSamlAssertionConsumerUrlRedirect() {
    return samlAssertionConsumerUrlRedirect;
  }

  @JsonProperty("saml_assertion_consumer_url_redirect")
  public void setSamlAssertionConsumerUrlRedirect(String samlAssertionConsumerUrlRedirect) {
    this.samlAssertionConsumerUrlRedirect = samlAssertionConsumerUrlRedirect;
  }

  /** ACS URL of a SAML application using the POST binding. */
  public IdpInitiatedClientRepresentationAttributes samlAssertionConsumerUrlPost(
      String samlAssertionConsumerUrlPost) {
    this.samlAssertionConsumerUrlPost = samlAssertionConsumerUrlPost;
    return this;
  }

  @JsonProperty("saml_assertion_consumer_url_post")
  public String getSamlAssertionConsumerUrlPost() {
    return samlAssertionConsumerUrlPost;
  }

  @JsonProperty("saml_assertion_consumer_url_post")
  public void setSamlAssertionConsumerUrlPost(String samlAssertionConsumerUrlPost) {
    this.samlAssertionConsumerUrlPost = samlAssertionConsumerUrlPost;
  }

  /** Alias of the identity provider this client is paired with. */
  public IdpInitiatedClientRepresentationAttributes phasetwoIdpInitiatedAlias(
      String phasetwoIdpInitiatedAlias) {
    this.phasetwoIdpInitiatedAlias = phasetwoIdpInitiatedAlias;
    return this;
  }

  @JsonProperty("phasetwo.idp-initiated.alias")
  public String getPhasetwoIdpInitiatedAlias() {
    return phasetwoIdpInitiatedAlias;
  }

  @JsonProperty("phasetwo.idp-initiated.alias")
  public void setPhasetwoIdpInitiatedAlias(String phasetwoIdpInitiatedAlias) {
    this.phasetwoIdpInitiatedAlias = phasetwoIdpInitiatedAlias;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdpInitiatedClientRepresentationAttributes idpInitiatedClientRepresentationAttributes =
        (IdpInitiatedClientRepresentationAttributes) o;
    return Objects.equals(
            this.samlIdpInitiatedSsoUrlName,
            idpInitiatedClientRepresentationAttributes.samlIdpInitiatedSsoUrlName)
        && Objects.equals(
            this.samlIdpInitiatedSsoRelayState,
            idpInitiatedClientRepresentationAttributes.samlIdpInitiatedSsoRelayState)
        && Objects.equals(
            this.samlForcePostBinding,
            idpInitiatedClientRepresentationAttributes.samlForcePostBinding)
        && Objects.equals(
            this.samlAssertionConsumerUrlRedirect,
            idpInitiatedClientRepresentationAttributes.samlAssertionConsumerUrlRedirect)
        && Objects.equals(
            this.samlAssertionConsumerUrlPost,
            idpInitiatedClientRepresentationAttributes.samlAssertionConsumerUrlPost)
        && Objects.equals(
            this.phasetwoIdpInitiatedAlias,
            idpInitiatedClientRepresentationAttributes.phasetwoIdpInitiatedAlias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        samlIdpInitiatedSsoUrlName,
        samlIdpInitiatedSsoRelayState,
        samlForcePostBinding,
        samlAssertionConsumerUrlRedirect,
        samlAssertionConsumerUrlPost,
        phasetwoIdpInitiatedAlias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdpInitiatedClientRepresentationAttributes {\n");

    sb.append("    samlIdpInitiatedSsoUrlName: ")
        .append(toIndentedString(samlIdpInitiatedSsoUrlName))
        .append("\n");
    sb.append("    samlIdpInitiatedSsoRelayState: ")
        .append(toIndentedString(samlIdpInitiatedSsoRelayState))
        .append("\n");
    sb.append("    samlForcePostBinding: ")
        .append(toIndentedString(samlForcePostBinding))
        .append("\n");
    sb.append("    samlAssertionConsumerUrlRedirect: ")
        .append(toIndentedString(samlAssertionConsumerUrlRedirect))
        .append("\n");
    sb.append("    samlAssertionConsumerUrlPost: ")
        .append(toIndentedString(samlAssertionConsumerUrlPost))
        .append("\n");
    sb.append("    phasetwoIdpInitiatedAlias: ")
        .append(toIndentedString(phasetwoIdpInitiatedAlias))
        .append("\n");
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
