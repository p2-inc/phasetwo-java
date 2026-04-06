package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("OrganizationDomainRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class OrganizationDomainRepresentation   {
  private String domainName;
  private Boolean verified;
  private String recordKey;
  private String recordValue;

  public OrganizationDomainRepresentation() {
  }

  @JsonCreator
  public OrganizationDomainRepresentation(
    @JsonProperty(required = true, value = "domain_name") String domainName,
    @JsonProperty(required = true, value = "verified") Boolean verified,
    @JsonProperty(required = true, value = "record_key") String recordKey,
    @JsonProperty(required = true, value = "record_value") String recordValue
  ) {
    this.domainName = domainName;
    this.verified = verified;
    this.recordKey = recordKey;
    this.recordValue = recordValue;
  }

  /**
   **/
  public OrganizationDomainRepresentation domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  
  @JsonProperty(required = true, value = "domain_name")
  public String getDomainName() {
    return domainName;
  }

  @JsonProperty(required = true, value = "domain_name")
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  /**
   **/
  public OrganizationDomainRepresentation verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  
  @JsonProperty(required = true, value = "verified")
  public Boolean getVerified() {
    return verified;
  }

  @JsonProperty(required = true, value = "verified")
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  /**
   **/
  public OrganizationDomainRepresentation recordKey(String recordKey) {
    this.recordKey = recordKey;
    return this;
  }

  
  @JsonProperty(required = true, value = "record_key")
  public String getRecordKey() {
    return recordKey;
  }

  @JsonProperty(required = true, value = "record_key")
  public void setRecordKey(String recordKey) {
    this.recordKey = recordKey;
  }

  /**
   **/
  public OrganizationDomainRepresentation recordValue(String recordValue) {
    this.recordValue = recordValue;
    return this;
  }

  
  @JsonProperty(required = true, value = "record_value")
  public String getRecordValue() {
    return recordValue;
  }

  @JsonProperty(required = true, value = "record_value")
  public void setRecordValue(String recordValue) {
    this.recordValue = recordValue;
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
        Objects.equals(this.recordValue, organizationDomainRepresentation.recordValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, verified, recordKey, recordValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationDomainRepresentation {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    recordKey: ").append(toIndentedString(recordKey)).append("\n");
    sb.append("    recordValue: ").append(toIndentedString(recordValue)).append("\n");
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
