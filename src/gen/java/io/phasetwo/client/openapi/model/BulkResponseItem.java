package io.phasetwo.client.openapi.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("BulkResponseItem")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public class BulkResponseItem   {
  private Integer status;
  private String error;
  private Object item;

  public BulkResponseItem() {
  }

  /**
   **/
  public BulkResponseItem status(Integer status) {
    this.status = status;
    return this;
  }

  
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   **/
  public BulkResponseItem error(String error) {
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
  public BulkResponseItem item(Object item) {
    this.item = item;
    return this;
  }

  
  @JsonProperty("item")
  public Object getItem() {
    return item;
  }

  @JsonProperty("item")
  public void setItem(Object item) {
    this.item = item;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkResponseItem bulkResponseItem = (BulkResponseItem) o;
    return Objects.equals(this.status, bulkResponseItem.status) &&
        Objects.equals(this.error, bulkResponseItem.error) &&
        Objects.equals(this.item, bulkResponseItem.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponseItem {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

