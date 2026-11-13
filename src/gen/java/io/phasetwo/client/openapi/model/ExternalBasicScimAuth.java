package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/** HTTP Basic auth. The password is hashed with Argon2id before storage. */
@JsonTypeName("ExternalBasicScimAuth")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public class ExternalBasicScimAuth {
  public enum TypeEnum {
    EXTERNAL_BASIC(String.valueOf("EXTERNAL_BASIC"));

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
  private String username;
  private String password;

  public ExternalBasicScimAuth() {}

  @JsonCreator
  public ExternalBasicScimAuth(@JsonProperty(required = true, value = "type") TypeEnum type) {
    this.type = type;
  }

  /** */
  public ExternalBasicScimAuth type(TypeEnum type) {
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

  /** Username for HTTP Basic auth. Stored in cleartext. */
  public ExternalBasicScimAuth username(String username) {
    this.username = username;
    return this;
  }

  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Password for HTTP Basic auth. Cleartext on submit; hashed at rest. Omit on update to keep the
   * existing password.
   */
  public ExternalBasicScimAuth password(String password) {
    this.password = password;
    return this;
  }

  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalBasicScimAuth externalBasicScimAuth = (ExternalBasicScimAuth) o;
    return Objects.equals(this.type, externalBasicScimAuth.type)
        && Objects.equals(this.username, externalBasicScimAuth.username)
        && Objects.equals(this.password, externalBasicScimAuth.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalBasicScimAuth {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
