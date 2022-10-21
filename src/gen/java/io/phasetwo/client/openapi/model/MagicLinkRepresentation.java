package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("MagicLinkRepresentation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T13:51:00.208924Z[Etc/UTC]")
public class MagicLinkRepresentation   {
  private String email;
  private String clientId;
  private String redirectUri;
  private Integer expirationSeconds;
  private Boolean forceCreate;
  private Boolean sendEmail;

  /**
   **/
  public MagicLinkRepresentation email(String email) {
    this.email = email;
    return this;
  }

  
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public MagicLinkRepresentation clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }

  @JsonProperty("client_id")
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  public MagicLinkRepresentation redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  
  @JsonProperty("redirect_uri")
  public String getRedirectUri() {
    return redirectUri;
  }

  @JsonProperty("redirect_uri")
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  /**
   **/
  public MagicLinkRepresentation expirationSeconds(Integer expirationSeconds) {
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
  public MagicLinkRepresentation forceCreate(Boolean forceCreate) {
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
  public MagicLinkRepresentation sendEmail(Boolean sendEmail) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicLinkRepresentation magicLinkRepresentation = (MagicLinkRepresentation) o;
    return Objects.equals(this.email, magicLinkRepresentation.email) &&
        Objects.equals(this.clientId, magicLinkRepresentation.clientId) &&
        Objects.equals(this.redirectUri, magicLinkRepresentation.redirectUri) &&
        Objects.equals(this.expirationSeconds, magicLinkRepresentation.expirationSeconds) &&
        Objects.equals(this.forceCreate, magicLinkRepresentation.forceCreate) &&
        Objects.equals(this.sendEmail, magicLinkRepresentation.sendEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, clientId, redirectUri, expirationSeconds, forceCreate, sendEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicLinkRepresentation {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
    sb.append("    forceCreate: ").append(toIndentedString(forceCreate)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
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

