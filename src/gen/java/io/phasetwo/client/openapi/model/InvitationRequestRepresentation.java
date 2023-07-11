package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InvitationRequestRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-06-05T12:39:00.868500Z[Etc/UTC]")
public class InvitationRequestRepresentation   {
  private String email;
  private Boolean send;
  private String inviterId;
  private String redirectUri;
  private List<String> roles = null;

  /**
   **/
  public InvitationRequestRepresentation email(String email) {
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
  public InvitationRequestRepresentation send(Boolean send) {
    this.send = send;
    return this;
  }

  
  @JsonProperty("send")
  public Boolean getSend() {
    return send;
  }

  @JsonProperty("send")
  public void setSend(Boolean send) {
    this.send = send;
  }

  /**
   **/
  public InvitationRequestRepresentation inviterId(String inviterId) {
    this.inviterId = inviterId;
    return this;
  }

  
  @JsonProperty("inviterId")
  public String getInviterId() {
    return inviterId;
  }

  @JsonProperty("inviterId")
  public void setInviterId(String inviterId) {
    this.inviterId = inviterId;
  }

  /**
   **/
  public InvitationRequestRepresentation redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }

  @JsonProperty("redirectUri")
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  /**
   **/
  public InvitationRequestRepresentation roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }

  @JsonProperty("roles")
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public InvitationRequestRepresentation addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }

    this.roles.add(rolesItem);
    return this;
  }

  public InvitationRequestRepresentation removeRolesItem(String rolesItem) {
    if (rolesItem != null && this.roles != null) {
      this.roles.remove(rolesItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationRequestRepresentation invitationRequestRepresentation = (InvitationRequestRepresentation) o;
    return Objects.equals(this.email, invitationRequestRepresentation.email) &&
        Objects.equals(this.send, invitationRequestRepresentation.send) &&
        Objects.equals(this.inviterId, invitationRequestRepresentation.inviterId) &&
        Objects.equals(this.redirectUri, invitationRequestRepresentation.redirectUri) &&
        Objects.equals(this.roles, invitationRequestRepresentation.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, send, inviterId, redirectUri, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationRequestRepresentation {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    send: ").append(toIndentedString(send)).append("\n");
    sb.append("    inviterId: ").append(toIndentedString(inviterId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

