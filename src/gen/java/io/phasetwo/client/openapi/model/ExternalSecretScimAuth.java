package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Bearer-style shared secret. The client sends &#x60;Authorization: Bearer &lt;secret&gt;&#x60;;
 * the server compares the value against a stored Argon2id hash.
 */
@JsonTypeName("ExternalSecretScimAuth")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public class ExternalSecretScimAuth {
  public enum TypeEnum {
    EXTERNAL_SECRET(String.valueOf("EXTERNAL_SECRET"));

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
  private String sharedSecret;

  public ExternalSecretScimAuth() {}

  @JsonCreator
  public ExternalSecretScimAuth(@JsonProperty(required = true, value = "type") TypeEnum type) {
    this.type = type;
  }

  /** */
  public ExternalSecretScimAuth type(TypeEnum type) {
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

  /**
   * Random opaque value. Cleartext on submit; hashed at rest. Omit on update to keep the existing
   * secret.
   */
  public ExternalSecretScimAuth sharedSecret(String sharedSecret) {
    this.sharedSecret = sharedSecret;
    return this;
  }

  @JsonProperty("shared_secret")
  public String getSharedSecret() {
    return sharedSecret;
  }

  @JsonProperty("shared_secret")
  public void setSharedSecret(String sharedSecret) {
    this.sharedSecret = sharedSecret;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalSecretScimAuth externalSecretScimAuth = (ExternalSecretScimAuth) o;
    return Objects.equals(this.type, externalSecretScimAuth.type)
        && Objects.equals(this.sharedSecret, externalSecretScimAuth.sharedSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sharedSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalSecretScimAuth {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sharedSecret: ").append(toIndentedString(sharedSecret)).append("\n");
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
