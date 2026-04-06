package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("OrganizationsImportResultRepresentation_errors_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class OrganizationsImportResultRepresentationErrorsInner   {
  private String organizationName;
  private String error;

  public OrganizationsImportResultRepresentationErrorsInner() {
  }

  /**
   **/
  public OrganizationsImportResultRepresentationErrorsInner organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  
  @JsonProperty("organizationName")
  public String getOrganizationName() {
    return organizationName;
  }

  @JsonProperty("organizationName")
  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  /**
   **/
  public OrganizationsImportResultRepresentationErrorsInner error(String error) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsImportResultRepresentationErrorsInner organizationsImportResultRepresentationErrorsInner = (OrganizationsImportResultRepresentationErrorsInner) o;
    return Objects.equals(this.organizationName, organizationsImportResultRepresentationErrorsInner.organizationName) &&
        Objects.equals(this.error, organizationsImportResultRepresentationErrorsInner.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationName, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsImportResultRepresentationErrorsInner {\n");
    
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
