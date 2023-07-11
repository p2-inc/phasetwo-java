package io.phasetwo.client.openapi.model;

import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("IdentityProviderMapperRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-06-05T12:39:00.868500Z[Etc/UTC]")
public class IdentityProviderMapperRepresentation   {
  private Map<String, Object> config = null;
  private String id;
  private String identityProviderAlias;
  private String identityProviderMapper;
  private String name;

  /**
   **/
  public IdentityProviderMapperRepresentation config(Map<String, Object> config) {
    this.config = config;
    return this;
  }

  
  @JsonProperty("config")
  public Map<String, Object> getConfig() {
    return config;
  }

  @JsonProperty("config")
  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }

  public IdentityProviderMapperRepresentation putConfigItem(String key, Object configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }

    this.config.put(key, configItem);
    return this;
  }

  public IdentityProviderMapperRepresentation removeConfigItem(Object configItem) {
    if (configItem != null && this.config != null) {
      this.config.remove(configItem);
    }

    return this;
  }
  /**
   **/
  public IdentityProviderMapperRepresentation id(String id) {
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
  public IdentityProviderMapperRepresentation identityProviderAlias(String identityProviderAlias) {
    this.identityProviderAlias = identityProviderAlias;
    return this;
  }

  
  @JsonProperty("identityProviderAlias")
  public String getIdentityProviderAlias() {
    return identityProviderAlias;
  }

  @JsonProperty("identityProviderAlias")
  public void setIdentityProviderAlias(String identityProviderAlias) {
    this.identityProviderAlias = identityProviderAlias;
  }

  /**
   **/
  public IdentityProviderMapperRepresentation identityProviderMapper(String identityProviderMapper) {
    this.identityProviderMapper = identityProviderMapper;
    return this;
  }

  
  @JsonProperty("identityProviderMapper")
  public String getIdentityProviderMapper() {
    return identityProviderMapper;
  }

  @JsonProperty("identityProviderMapper")
  public void setIdentityProviderMapper(String identityProviderMapper) {
    this.identityProviderMapper = identityProviderMapper;
  }

  /**
   **/
  public IdentityProviderMapperRepresentation name(String name) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityProviderMapperRepresentation identityProviderMapperRepresentation = (IdentityProviderMapperRepresentation) o;
    return Objects.equals(this.config, identityProviderMapperRepresentation.config) &&
        Objects.equals(this.id, identityProviderMapperRepresentation.id) &&
        Objects.equals(this.identityProviderAlias, identityProviderMapperRepresentation.identityProviderAlias) &&
        Objects.equals(this.identityProviderMapper, identityProviderMapperRepresentation.identityProviderMapper) &&
        Objects.equals(this.name, identityProviderMapperRepresentation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, id, identityProviderAlias, identityProviderMapper, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityProviderMapperRepresentation {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identityProviderAlias: ").append(toIndentedString(identityProviderAlias)).append("\n");
    sb.append("    identityProviderMapper: ").append(toIndentedString(identityProviderMapper)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

