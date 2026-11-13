package io.phasetwo.client.openapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

@JsonTypeName("SwitchOrganizationRepresentation")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public class SwitchOrganizationRepresentation {
  private String id;

  public SwitchOrganizationRepresentation() {}

  @JsonCreator
  public SwitchOrganizationRepresentation(@JsonProperty(required = true, value = "id") String id) {
    this.id = id;
  }

  /** The ID of the organization to switch to */
  public SwitchOrganizationRepresentation id(String id) {
    this.id = id;
    return this;
  }

  @JsonProperty(required = true, value = "id")
  public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchOrganizationRepresentation switchOrganizationRepresentation =
        (SwitchOrganizationRepresentation) o;
    return Objects.equals(this.id, switchOrganizationRepresentation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchOrganizationRepresentation {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
