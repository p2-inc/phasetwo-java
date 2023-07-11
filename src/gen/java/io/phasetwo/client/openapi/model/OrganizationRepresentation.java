package io.phasetwo.client.openapi.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrganizationRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-06-05T12:39:00.868500Z[Etc/UTC]")
public class OrganizationRepresentation   {
  private String id;
  private String name;
  private String displayName;
  private String url;
  private String realm;
  private List<String> domains = null;
  private Map<String, List<String>> attributes = null;

  /**
   **/
  public OrganizationRepresentation id(String id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public OrganizationRepresentation name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public OrganizationRepresentation displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  public OrganizationRepresentation url(String url) {
    this.url = url;
    return this;
  }

  
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  public OrganizationRepresentation realm(String realm) {
    this.realm = realm;
    return this;
  }

  
  @JsonProperty("realm")
  public String getRealm() {
    return realm;
  }

  @JsonProperty("realm")
  public void setRealm(String realm) {
    this.realm = realm;
  }

  /**
   **/
  public OrganizationRepresentation domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  
  @JsonProperty("domains")
  public List<String> getDomains() {
    return domains;
  }

  @JsonProperty("domains")
  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public OrganizationRepresentation addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }

    this.domains.add(domainsItem);
    return this;
  }

  public OrganizationRepresentation removeDomainsItem(String domainsItem) {
    if (domainsItem != null && this.domains != null) {
      this.domains.remove(domainsItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationRepresentation attributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @JsonProperty("attributes")
  public Map<String, List<String>> getAttributes() {
    return attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
  }

  public OrganizationRepresentation putAttributesItem(String key, List<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }

    this.attributes.put(key, attributesItem);
    return this;
  }

  public OrganizationRepresentation removeAttributesItem(List<String> attributesItem) {
    if (attributesItem != null && this.attributes != null) {
      this.attributes.remove(attributesItem);
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
    OrganizationRepresentation organizationRepresentation = (OrganizationRepresentation) o;
    return Objects.equals(this.id, organizationRepresentation.id) &&
        Objects.equals(this.name, organizationRepresentation.name) &&
        Objects.equals(this.displayName, organizationRepresentation.displayName) &&
        Objects.equals(this.url, organizationRepresentation.url) &&
        Objects.equals(this.realm, organizationRepresentation.realm) &&
        Objects.equals(this.domains, organizationRepresentation.domains) &&
        Objects.equals(this.attributes, organizationRepresentation.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, url, realm, domains, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationRepresentation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

