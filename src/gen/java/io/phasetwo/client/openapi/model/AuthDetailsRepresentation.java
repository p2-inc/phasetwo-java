package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AuthDetailsRepresentation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-21T14:48:52.320815Z[Etc/UTC]")
public class AuthDetailsRepresentation   {
  private String realmId;
  private String clientId;
  private String userId;
  private String ipAddress;
  private String username;
  private String sessionId;

  /**
   **/
  public AuthDetailsRepresentation realmId(String realmId) {
    this.realmId = realmId;
    return this;
  }

  
  @JsonProperty("realmId")
  public String getRealmId() {
    return realmId;
  }

  @JsonProperty("realmId")
  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  /**
   **/
  public AuthDetailsRepresentation clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  @JsonProperty("clientId")
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  public AuthDetailsRepresentation userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  public AuthDetailsRepresentation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }

  @JsonProperty("ipAddress")
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   **/
  public AuthDetailsRepresentation username(String username) {
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
   **/
  public AuthDetailsRepresentation sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }

  @JsonProperty("sessionId")
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthDetailsRepresentation authDetailsRepresentation = (AuthDetailsRepresentation) o;
    return Objects.equals(this.realmId, authDetailsRepresentation.realmId) &&
        Objects.equals(this.clientId, authDetailsRepresentation.clientId) &&
        Objects.equals(this.userId, authDetailsRepresentation.userId) &&
        Objects.equals(this.ipAddress, authDetailsRepresentation.ipAddress) &&
        Objects.equals(this.username, authDetailsRepresentation.username) &&
        Objects.equals(this.sessionId, authDetailsRepresentation.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realmId, clientId, userId, ipAddress, username, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthDetailsRepresentation {\n");
    
    sb.append("    realmId: ").append(toIndentedString(realmId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

