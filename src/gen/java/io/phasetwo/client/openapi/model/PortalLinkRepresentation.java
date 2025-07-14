package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PortalLinkRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public class PortalLinkRepresentation   {
  private String user;
  private String link;
  private String redirect;

  public PortalLinkRepresentation() {
  }

  /**
   **/
  public PortalLinkRepresentation user(String user) {
    this.user = user;
    return this;
  }

  
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(String user) {
    this.user = user;
  }

  /**
   **/
  public PortalLinkRepresentation link(String link) {
    this.link = link;
    return this;
  }

  
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  public PortalLinkRepresentation redirect(String redirect) {
    this.redirect = redirect;
    return this;
  }

  
  @JsonProperty("redirect")
  public String getRedirect() {
    return redirect;
  }

  @JsonProperty("redirect")
  public void setRedirect(String redirect) {
    this.redirect = redirect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortalLinkRepresentation portalLinkRepresentation = (PortalLinkRepresentation) o;
    return Objects.equals(this.user, portalLinkRepresentation.user) &&
        Objects.equals(this.link, portalLinkRepresentation.link) &&
        Objects.equals(this.redirect, portalLinkRepresentation.redirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, link, redirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalLinkRepresentation {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
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

