package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Validates an inbound JWT issued by an external IdP. The token&#39;s issuer and audience must
 * match the configured values, and the signature is verified against keys fetched from the
 * configured JWKS URI.
 */
@JsonTypeName("ExternalJwtScimAuth")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public class ExternalJwtScimAuth {
  public enum TypeEnum {
    EXTERNAL_JWT(String.valueOf("EXTERNAL_JWT"));

    private String value;

    TypeEnum(String v) {
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
    public static TypeEnum fromString(String s) {
      for (TypeEnum b : TypeEnum.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;
  private String issuer;
  private String audience;
  private String jwksUri;

  public ExternalJwtScimAuth() {}

  @JsonCreator
  public ExternalJwtScimAuth(@JsonProperty(required = true, value = "type") TypeEnum type) {
    this.type = type;
  }

  /** */
  public ExternalJwtScimAuth type(TypeEnum type) {
    this.type = type;
    return this;
  }

  @JsonProperty(required = true, value = "type")
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /** Expected &#x60;iss&#x60; claim. Must exactly match the upstream IdP&#39;s issuer URL. */
  public ExternalJwtScimAuth issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  @JsonProperty("issuer")
  public String getIssuer() {
    return issuer;
  }

  @JsonProperty("issuer")
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /** Expected &#x60;aud&#x60; claim. */
  public ExternalJwtScimAuth audience(String audience) {
    this.audience = audience;
    return this;
  }

  @JsonProperty("audience")
  public String getAudience() {
    return audience;
  }

  @JsonProperty("audience")
  public void setAudience(String audience) {
    this.audience = audience;
  }

  /** URL the server fetches to validate the JWT signature. */
  public ExternalJwtScimAuth jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  @JsonProperty("jwks_uri")
  public String getJwksUri() {
    return jwksUri;
  }

  @JsonProperty("jwks_uri")
  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalJwtScimAuth externalJwtScimAuth = (ExternalJwtScimAuth) o;
    return Objects.equals(this.type, externalJwtScimAuth.type)
        && Objects.equals(this.issuer, externalJwtScimAuth.issuer)
        && Objects.equals(this.audience, externalJwtScimAuth.audience)
        && Objects.equals(this.jwksUri, externalJwtScimAuth.jwksUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, issuer, audience, jwksUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalJwtScimAuth {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
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
