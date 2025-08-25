package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("MagicLinkRequest")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public class MagicLinkRequest   {
  private String email;
  private String clientId;
  private String redirectUri;
  private Integer expirationSeconds;
  private Boolean forceCreate;
  private Boolean sendEmail;
  private Boolean updateProfile;
  private Boolean updatePassword;
  private String scope;
  private String nonce;
  private String codeChallenge;
  private String codeChallengeMethod;
  private Boolean rememberMe;
  private Boolean reusable;

  public MagicLinkRequest() {
  }

  @JsonCreator
  public MagicLinkRequest(
    @JsonProperty(required = true, value = "email") String email,
    @JsonProperty(required = true, value = "client_id") String clientId,
    @JsonProperty(required = true, value = "redirect_uri") String redirectUri
  ) {
    this.email = email;
    this.clientId = clientId;
    this.redirectUri = redirectUri;
  }

  /**
   **/
  public MagicLinkRequest email(String email) {
    this.email = email;
    return this;
  }

  
  @JsonProperty(required = true, value = "email")
  public String getEmail() {
    return email;
  }

  @JsonProperty(required = true, value = "email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public MagicLinkRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @JsonProperty(required = true, value = "client_id")
  public String getClientId() {
    return clientId;
  }

  @JsonProperty(required = true, value = "client_id")
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  public MagicLinkRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  
  @JsonProperty(required = true, value = "redirect_uri")
  public String getRedirectUri() {
    return redirectUri;
  }

  @JsonProperty(required = true, value = "redirect_uri")
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  /**
   **/
  public MagicLinkRequest expirationSeconds(Integer expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return this;
  }

  
  @JsonProperty("expiration_seconds")
  public Integer getExpirationSeconds() {
    return expirationSeconds;
  }

  @JsonProperty("expiration_seconds")
  public void setExpirationSeconds(Integer expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }

  /**
   **/
  public MagicLinkRequest forceCreate(Boolean forceCreate) {
    this.forceCreate = forceCreate;
    return this;
  }

  
  @JsonProperty("force_create")
  public Boolean getForceCreate() {
    return forceCreate;
  }

  @JsonProperty("force_create")
  public void setForceCreate(Boolean forceCreate) {
    this.forceCreate = forceCreate;
  }

  /**
   **/
  public MagicLinkRequest sendEmail(Boolean sendEmail) {
    this.sendEmail = sendEmail;
    return this;
  }

  
  @JsonProperty("send_email")
  public Boolean getSendEmail() {
    return sendEmail;
  }

  @JsonProperty("send_email")
  public void setSendEmail(Boolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  /**
   **/
  public MagicLinkRequest updateProfile(Boolean updateProfile) {
    this.updateProfile = updateProfile;
    return this;
  }

  
  @JsonProperty("update_profile")
  public Boolean getUpdateProfile() {
    return updateProfile;
  }

  @JsonProperty("update_profile")
  public void setUpdateProfile(Boolean updateProfile) {
    this.updateProfile = updateProfile;
  }

  /**
   **/
  public MagicLinkRequest updatePassword(Boolean updatePassword) {
    this.updatePassword = updatePassword;
    return this;
  }

  
  @JsonProperty("update_password")
  public Boolean getUpdatePassword() {
    return updatePassword;
  }

  @JsonProperty("update_password")
  public void setUpdatePassword(Boolean updatePassword) {
    this.updatePassword = updatePassword;
  }

  /**
   **/
  public MagicLinkRequest scope(String scope) {
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

  /**
   **/
  public MagicLinkRequest nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

  
  @JsonProperty("nonce")
  public String getNonce() {
    return nonce;
  }

  @JsonProperty("nonce")
  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  /**
   **/
  public MagicLinkRequest codeChallenge(String codeChallenge) {
    this.codeChallenge = codeChallenge;
    return this;
  }

  
  @JsonProperty("code_challenge")
  public String getCodeChallenge() {
    return codeChallenge;
  }

  @JsonProperty("code_challenge")
  public void setCodeChallenge(String codeChallenge) {
    this.codeChallenge = codeChallenge;
  }

  /**
   **/
  public MagicLinkRequest codeChallengeMethod(String codeChallengeMethod) {
    this.codeChallengeMethod = codeChallengeMethod;
    return this;
  }

  
  @JsonProperty("code_challenge_method")
  public String getCodeChallengeMethod() {
    return codeChallengeMethod;
  }

  @JsonProperty("code_challenge_method")
  public void setCodeChallengeMethod(String codeChallengeMethod) {
    this.codeChallengeMethod = codeChallengeMethod;
  }

  /**
   **/
  public MagicLinkRequest rememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
    return this;
  }

  
  @JsonProperty("remember_me")
  public Boolean getRememberMe() {
    return rememberMe;
  }

  @JsonProperty("remember_me")
  public void setRememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
  }

  /**
   **/
  public MagicLinkRequest reusable(Boolean reusable) {
    this.reusable = reusable;
    return this;
  }

  
  @JsonProperty("reusable")
  public Boolean getReusable() {
    return reusable;
  }

  @JsonProperty("reusable")
  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicLinkRequest magicLinkRequest = (MagicLinkRequest) o;
    return Objects.equals(this.email, magicLinkRequest.email) &&
        Objects.equals(this.clientId, magicLinkRequest.clientId) &&
        Objects.equals(this.redirectUri, magicLinkRequest.redirectUri) &&
        Objects.equals(this.expirationSeconds, magicLinkRequest.expirationSeconds) &&
        Objects.equals(this.forceCreate, magicLinkRequest.forceCreate) &&
        Objects.equals(this.sendEmail, magicLinkRequest.sendEmail) &&
        Objects.equals(this.updateProfile, magicLinkRequest.updateProfile) &&
        Objects.equals(this.updatePassword, magicLinkRequest.updatePassword) &&
        Objects.equals(this.scope, magicLinkRequest.scope) &&
        Objects.equals(this.nonce, magicLinkRequest.nonce) &&
        Objects.equals(this.codeChallenge, magicLinkRequest.codeChallenge) &&
        Objects.equals(this.codeChallengeMethod, magicLinkRequest.codeChallengeMethod) &&
        Objects.equals(this.rememberMe, magicLinkRequest.rememberMe) &&
        Objects.equals(this.reusable, magicLinkRequest.reusable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, clientId, redirectUri, expirationSeconds, forceCreate, sendEmail, updateProfile, updatePassword, scope, nonce, codeChallenge, codeChallengeMethod, rememberMe, reusable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicLinkRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
    sb.append("    forceCreate: ").append(toIndentedString(forceCreate)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
    sb.append("    updateProfile: ").append(toIndentedString(updateProfile)).append("\n");
    sb.append("    updatePassword: ").append(toIndentedString(updatePassword)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    codeChallenge: ").append(toIndentedString(codeChallenge)).append("\n");
    sb.append("    codeChallengeMethod: ").append(toIndentedString(codeChallengeMethod)).append("\n");
    sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
    sb.append("    reusable: ").append(toIndentedString(reusable)).append("\n");
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

