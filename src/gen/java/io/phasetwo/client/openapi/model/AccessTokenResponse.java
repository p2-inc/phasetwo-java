package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * A freshly issued OIDC token set, reflecting the user&#39;s new active organization. The
 * &#x60;refresh_token&#x60; is only present when the client is configured to use refresh tokens,
 * and &#x60;id_token&#x60; only for OIDC requests.
 */
@JsonTypeName("AccessTokenResponse")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public class AccessTokenResponse {
  private String accessToken;
  private Long expiresIn;
  private Long refreshExpiresIn;
  private String refreshToken;
  private String tokenType;
  private String idToken;
  private Long notBeforePolicy;
  private String sessionState;
  private String scope;

  public AccessTokenResponse() {}

  /** */
  public AccessTokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty("access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /** */
  public AccessTokenResponse expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  @JsonProperty("expires_in")
  public Long getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("expires_in")
  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  /** */
  public AccessTokenResponse refreshExpiresIn(Long refreshExpiresIn) {
    this.refreshExpiresIn = refreshExpiresIn;
    return this;
  }

  @JsonProperty("refresh_expires_in")
  public Long getRefreshExpiresIn() {
    return refreshExpiresIn;
  }

  @JsonProperty("refresh_expires_in")
  public void setRefreshExpiresIn(Long refreshExpiresIn) {
    this.refreshExpiresIn = refreshExpiresIn;
  }

  /** */
  public AccessTokenResponse refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  @JsonProperty("refresh_token")
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /** */
  public AccessTokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  @JsonProperty("token_type")
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  /** */
  public AccessTokenResponse idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

  @JsonProperty("id_token")
  public String getIdToken() {
    return idToken;
  }

  @JsonProperty("id_token")
  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  /** */
  public AccessTokenResponse notBeforePolicy(Long notBeforePolicy) {
    this.notBeforePolicy = notBeforePolicy;
    return this;
  }

  @JsonProperty("not-before-policy")
  public Long getNotBeforePolicy() {
    return notBeforePolicy;
  }

  @JsonProperty("not-before-policy")
  public void setNotBeforePolicy(Long notBeforePolicy) {
    this.notBeforePolicy = notBeforePolicy;
  }

  /** */
  public AccessTokenResponse sessionState(String sessionState) {
    this.sessionState = sessionState;
    return this;
  }

  @JsonProperty("session_state")
  public String getSessionState() {
    return sessionState;
  }

  @JsonProperty("session_state")
  public void setSessionState(String sessionState) {
    this.sessionState = sessionState;
  }

  /** */
  public AccessTokenResponse scope(String scope) {
    this.scope = scope;
    return this;
  }

  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  @JsonProperty("scope")
  public void setScope(String scope) {
    this.scope = scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenResponse accessTokenResponse = (AccessTokenResponse) o;
    return Objects.equals(this.accessToken, accessTokenResponse.accessToken)
        && Objects.equals(this.expiresIn, accessTokenResponse.expiresIn)
        && Objects.equals(this.refreshExpiresIn, accessTokenResponse.refreshExpiresIn)
        && Objects.equals(this.refreshToken, accessTokenResponse.refreshToken)
        && Objects.equals(this.tokenType, accessTokenResponse.tokenType)
        && Objects.equals(this.idToken, accessTokenResponse.idToken)
        && Objects.equals(this.notBeforePolicy, accessTokenResponse.notBeforePolicy)
        && Objects.equals(this.sessionState, accessTokenResponse.sessionState)
        && Objects.equals(this.scope, accessTokenResponse.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessToken,
        expiresIn,
        refreshExpiresIn,
        refreshToken,
        tokenType,
        idToken,
        notBeforePolicy,
        sessionState,
        scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenResponse {\n");

    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshExpiresIn: ").append(toIndentedString(refreshExpiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    notBeforePolicy: ").append(toIndentedString(notBeforePolicy)).append("\n");
    sb.append("    sessionState: ").append(toIndentedString(sessionState)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
