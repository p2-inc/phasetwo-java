package io.phasetwo.client.openapi.model;

import io.phasetwo.client.openapi.model.OrganizationsImportResultRepresentationErrorsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("OrganizationsImportResultRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class OrganizationsImportResultRepresentation   {
  private Integer imported;
  private Integer updated;
  private Integer skipped;
  private List<OrganizationsImportResultRepresentationErrorsInner> errors = new ArrayList<>();

  public OrganizationsImportResultRepresentation() {
  }

  /**
   * Number of organizations successfully imported
   **/
  public OrganizationsImportResultRepresentation imported(Integer imported) {
    this.imported = imported;
    return this;
  }

  
  @JsonProperty("imported")
  public Integer getImported() {
    return imported;
  }

  @JsonProperty("imported")
  public void setImported(Integer imported) {
    this.imported = imported;
  }

  /**
   * Number of organizations updated
   **/
  public OrganizationsImportResultRepresentation updated(Integer updated) {
    this.updated = updated;
    return this;
  }

  
  @JsonProperty("updated")
  public Integer getUpdated() {
    return updated;
  }

  @JsonProperty("updated")
  public void setUpdated(Integer updated) {
    this.updated = updated;
  }

  /**
   * Number of organizations skipped
   **/
  public OrganizationsImportResultRepresentation skipped(Integer skipped) {
    this.skipped = skipped;
    return this;
  }

  
  @JsonProperty("skipped")
  public Integer getSkipped() {
    return skipped;
  }

  @JsonProperty("skipped")
  public void setSkipped(Integer skipped) {
    this.skipped = skipped;
  }

  /**
   **/
  public OrganizationsImportResultRepresentation errors(List<OrganizationsImportResultRepresentationErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  
  @JsonProperty("errors")
  public List<OrganizationsImportResultRepresentationErrorsInner> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<OrganizationsImportResultRepresentationErrorsInner> errors) {
    this.errors = errors;
  }

  public OrganizationsImportResultRepresentation addErrorsItem(OrganizationsImportResultRepresentationErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public OrganizationsImportResultRepresentation removeErrorsItem(OrganizationsImportResultRepresentationErrorsInner errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
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
    OrganizationsImportResultRepresentation organizationsImportResultRepresentation = (OrganizationsImportResultRepresentation) o;
    return Objects.equals(this.imported, organizationsImportResultRepresentation.imported) &&
        Objects.equals(this.updated, organizationsImportResultRepresentation.updated) &&
        Objects.equals(this.skipped, organizationsImportResultRepresentation.skipped) &&
        Objects.equals(this.errors, organizationsImportResultRepresentation.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imported, updated, skipped, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsImportResultRepresentation {\n");
    
    sb.append("    imported: ").append(toIndentedString(imported)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
