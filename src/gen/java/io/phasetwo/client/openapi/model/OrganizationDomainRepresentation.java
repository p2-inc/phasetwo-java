package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrganizationDomainRepresentation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-06-05T12:39:00.868500Z[Etc/UTC]")
public class OrganizationDomainRepresentation   {
  private String domainName;
  private Boolean verified;
  private String recordKey;
  private String recordValue;
  private String type;

  /**
   **/
  public OrganizationDomainRepresentation domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  
  @JsonProperty("domain_name")
  public String getDomainName() {
    return domainName;
  }

  @JsonProperty("domain_name")
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  /**
   **/
  public OrganizationDomainRepresentation verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  @JsonProperty("verified")
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  /**
   **/
  public OrganizationDomainRepresentation recordKey(String recordKey) {
    this.recordKey = recordKey;
    return this;
  }

  
  @JsonProperty("record_key")
  public String getRecordKey() {
    return recordKey;
  }

  @JsonProperty("record_key")
  public void setRecordKey(String recordKey) {
    this.recordKey = recordKey;
  }

  /**
   **/
  public OrganizationDomainRepresentation recordValue(String recordValue) {
    this.recordValue = recordValue;
    return this;
  }

  
  @JsonProperty("record_value")
  public String getRecordValue() {
    return recordValue;
  }

  @JsonProperty("record_value")
  public void setRecordValue(String recordValue) {
    this.recordValue = recordValue;
  }

  /**
   **/
  public OrganizationDomainRepresentation type(String type) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationDomainRepresentation organizationDomainRepresentation = (OrganizationDomainRepresentation) o;
    return Objects.equals(this.domainName, organizationDomainRepresentation.domainName) &&
        Objects.equals(this.verified, organizationDomainRepresentation.verified) &&
        Objects.equals(this.recordKey, organizationDomainRepresentation.recordKey) &&
        Objects.equals(this.recordValue, organizationDomainRepresentation.recordValue) &&
        Objects.equals(this.type, organizationDomainRepresentation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, verified, recordKey, recordValue, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationDomainRepresentation {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    recordKey: ").append(toIndentedString(recordKey)).append("\n");
    sb.append("    recordValue: ").append(toIndentedString(recordValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

