package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MagicLinkResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class MagicLinkResponse   {
  private String userId;
  private String link;
  private Boolean sent;

  public MagicLinkResponse() {
  }

  /**
   **/
  public MagicLinkResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  @JsonProperty("user_id")
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  public MagicLinkResponse link(String link) {
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
  public MagicLinkResponse sent(Boolean sent) {
    this.sent = sent;
    return this;
  }

  
  @JsonProperty("sent")
  public Boolean getSent() {
    return sent;
  }

  @JsonProperty("sent")
  public void setSent(Boolean sent) {
    this.sent = sent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicLinkResponse magicLinkResponse = (MagicLinkResponse) o;
    return Objects.equals(this.userId, magicLinkResponse.userId) &&
        Objects.equals(this.link, magicLinkResponse.link) &&
        Objects.equals(this.sent, magicLinkResponse.sent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, link, sent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicLinkResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
