package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * SAML client that receives IdP-initiated logins brokered through an identity provider of this
 * organization and sends the user on to the target application.
 */
@JsonTypeName("IdpInitiatedClientRepresentation")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public class IdpInitiatedClientRepresentation {
  public enum ProtocolEnum {
    SAML(String.valueOf("saml"));

    private String value;

    ProtocolEnum(String v) {
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
    public static ProtocolEnum fromString(String s) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProtocolEnum protocol;
  private String clientId;
  private String name;
  private String description;
  private IdpInitiatedClientRepresentationAttributes attributes;

  public IdpInitiatedClientRepresentation() {}

  @JsonCreator
  public IdpInitiatedClientRepresentation(
      @JsonProperty(required = true, value = "protocol") ProtocolEnum protocol,
      @JsonProperty(required = true, value = "clientId") String clientId) {
    this.protocol = protocol;
    this.clientId = clientId;
  }

  /** */
  public IdpInitiatedClientRepresentation protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

  @JsonProperty(required = true, value = "protocol")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  @JsonProperty(required = true, value = "protocol")
  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  /**
   * Must start with &#x60;idp-initiated-&#x60;. By convention &#x60;idp-initiated-{alias}&#x60;,
   * where &#x60;{alias}&#x60; is the identity provider alias.
   */
  public IdpInitiatedClientRepresentation clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  @JsonProperty(required = true, value = "clientId")
  public String getClientId() {
    return clientId;
  }

  @JsonProperty(required = true, value = "clientId")
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /** */
  public IdpInitiatedClientRepresentation name(String name) {
    this.name = name;
    return this;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /** */
  public IdpInitiatedClientRepresentation description(String description) {
    this.description = description;
    return this;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /** */
  public IdpInitiatedClientRepresentation attributes(
      IdpInitiatedClientRepresentationAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  @JsonProperty("attributes")
  public IdpInitiatedClientRepresentationAttributes getAttributes() {
    return attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(IdpInitiatedClientRepresentationAttributes attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdpInitiatedClientRepresentation idpInitiatedClientRepresentation =
        (IdpInitiatedClientRepresentation) o;
    return Objects.equals(this.protocol, idpInitiatedClientRepresentation.protocol)
        && Objects.equals(this.clientId, idpInitiatedClientRepresentation.clientId)
        && Objects.equals(this.name, idpInitiatedClientRepresentation.name)
        && Objects.equals(this.description, idpInitiatedClientRepresentation.description)
        && Objects.equals(this.attributes, idpInitiatedClientRepresentation.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, clientId, name, description, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdpInitiatedClientRepresentation {\n");

    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
