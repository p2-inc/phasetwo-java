package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrganizationsConfigRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public class OrganizationsConfigRepresentation   {
  private Boolean createAdminUserEnabled;
  private Boolean sharedIdpsEnabled;

  public OrganizationsConfigRepresentation() {
  }

  /**
   * Whether to create a default admin user for new organizations
   **/
  public OrganizationsConfigRepresentation createAdminUserEnabled(Boolean createAdminUserEnabled) {
    this.createAdminUserEnabled = createAdminUserEnabled;
    return this;
  }

  
  @JsonProperty("createAdminUserEnabled")
  public Boolean getCreateAdminUserEnabled() {
    return createAdminUserEnabled;
  }

  @JsonProperty("createAdminUserEnabled")
  public void setCreateAdminUserEnabled(Boolean createAdminUserEnabled) {
    this.createAdminUserEnabled = createAdminUserEnabled;
  }

  /**
   * Whether identity providers can be shared across organizations
   **/
  public OrganizationsConfigRepresentation sharedIdpsEnabled(Boolean sharedIdpsEnabled) {
    this.sharedIdpsEnabled = sharedIdpsEnabled;
    return this;
  }

  
  @JsonProperty("sharedIdpsEnabled")
  public Boolean getSharedIdpsEnabled() {
    return sharedIdpsEnabled;
  }

  @JsonProperty("sharedIdpsEnabled")
  public void setSharedIdpsEnabled(Boolean sharedIdpsEnabled) {
    this.sharedIdpsEnabled = sharedIdpsEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsConfigRepresentation organizationsConfigRepresentation = (OrganizationsConfigRepresentation) o;
    return Objects.equals(this.createAdminUserEnabled, organizationsConfigRepresentation.createAdminUserEnabled) &&
        Objects.equals(this.sharedIdpsEnabled, organizationsConfigRepresentation.sharedIdpsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createAdminUserEnabled, sharedIdpsEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsConfigRepresentation {\n");
    
    sb.append("    createAdminUserEnabled: ").append(toIndentedString(createAdminUserEnabled)).append("\n");
    sb.append("    sharedIdpsEnabled: ").append(toIndentedString(sharedIdpsEnabled)).append("\n");
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
