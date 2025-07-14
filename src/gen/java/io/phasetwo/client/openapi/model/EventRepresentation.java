package io.phasetwo.client.openapi.model;

import io.phasetwo.client.openapi.model.AuthDetailsRepresentation;
import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("EventRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public class EventRepresentation   {
  private String uid;
  private Integer time;
  private String realmId;
  private String organizationId;
  private String type;
  private String representation;
  private String operationType;
  private String resourcePath;
  private String resourceType;
  private String error;
  private AuthDetailsRepresentation authDetails;
  private Map<String, Object> details = new HashMap<>();

  public EventRepresentation() {
  }

  /**
   **/
  public EventRepresentation uid(String uid) {
    this.uid = uid;
    return this;
  }

  
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  @JsonProperty("uid")
  public void setUid(String uid) {
    this.uid = uid;
  }

  /**
   **/
  public EventRepresentation time(Integer time) {
    this.time = time;
    return this;
  }

  
  @JsonProperty("time")
  public Integer getTime() {
    return time;
  }

  @JsonProperty("time")
  public void setTime(Integer time) {
    this.time = time;
  }

  /**
   **/
  public EventRepresentation realmId(String realmId) {
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
  public EventRepresentation organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("organizationId")
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   **/
  public EventRepresentation type(String type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public EventRepresentation representation(String representation) {
    this.representation = representation;
    return this;
  }

  
  @JsonProperty("representation")
  public String getRepresentation() {
    return representation;
  }

  @JsonProperty("representation")
  public void setRepresentation(String representation) {
    this.representation = representation;
  }

  /**
   **/
  public EventRepresentation operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @JsonProperty("operationType")
  public String getOperationType() {
    return operationType;
  }

  @JsonProperty("operationType")
  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  /**
   **/
  public EventRepresentation resourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
    return this;
  }

  
  @JsonProperty("resourcePath")
  public String getResourcePath() {
    return resourcePath;
  }

  @JsonProperty("resourcePath")
  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }

  /**
   **/
  public EventRepresentation resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }

  @JsonProperty("resourceType")
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  /**
   **/
  public EventRepresentation error(String error) {
    this.error = error;
    return this;
  }

  
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  @JsonProperty("error")
  public void setError(String error) {
    this.error = error;
  }

  /**
   **/
  public EventRepresentation authDetails(AuthDetailsRepresentation authDetails) {
    this.authDetails = authDetails;
    return this;
  }

  
  @JsonProperty("authDetails")
  public AuthDetailsRepresentation getAuthDetails() {
    return authDetails;
  }

  @JsonProperty("authDetails")
  public void setAuthDetails(AuthDetailsRepresentation authDetails) {
    this.authDetails = authDetails;
  }

  /**
   **/
  public EventRepresentation details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  
  @JsonProperty("details")
  public Map<String, Object> getDetails() {
    return details;
  }

  @JsonProperty("details")
  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }

  public EventRepresentation putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }

    this.details.put(key, detailsItem);
    return this;
  }

  public EventRepresentation removeDetailsItem(String key) {
    if (this.details != null) {
      this.details.remove(key);
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
    EventRepresentation eventRepresentation = (EventRepresentation) o;
    return Objects.equals(this.uid, eventRepresentation.uid) &&
        Objects.equals(this.time, eventRepresentation.time) &&
        Objects.equals(this.realmId, eventRepresentation.realmId) &&
        Objects.equals(this.organizationId, eventRepresentation.organizationId) &&
        Objects.equals(this.type, eventRepresentation.type) &&
        Objects.equals(this.representation, eventRepresentation.representation) &&
        Objects.equals(this.operationType, eventRepresentation.operationType) &&
        Objects.equals(this.resourcePath, eventRepresentation.resourcePath) &&
        Objects.equals(this.resourceType, eventRepresentation.resourceType) &&
        Objects.equals(this.error, eventRepresentation.error) &&
        Objects.equals(this.authDetails, eventRepresentation.authDetails) &&
        Objects.equals(this.details, eventRepresentation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, time, realmId, organizationId, type, representation, operationType, resourcePath, resourceType, error, authDetails, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRepresentation {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    realmId: ").append(toIndentedString(realmId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    representation: ").append(toIndentedString(representation)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    authDetails: ").append(toIndentedString(authDetails)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

