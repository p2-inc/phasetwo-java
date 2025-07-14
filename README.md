> :bug: **This is alpha software**

# Java SDK for Phase Two API

The Phase Two Java SDK library provides access to the Phase Two API from applications written in JVM-compatible languages.

## Documentation

See the [API Reference]([https://phasetwo.io/api/](https://phasetwo.io/api/phase-two-admin-rest-api)) and [Javadoc](https://javadoc.io/doc/io.phasetwo/phasetwo-admin-client)

## Installation

### Maven

```
<dependency>
  <groupId>io.phasetwo</groupId>
  <artifactId>phasetwo-admin-client</artifactId>
  <version>VERSION</version>
</dependency>
```

### Gradle

```
dependencies {
  implementation 'io.phasetwo:phasetwo-admin-client:VERSION'
}
```

## Use

The Java SDK assumes the use of the offical Keycloak Admin API Client to create a connection to the Phase Two API.

```java
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import io.phasetwo.client.PhaseTwo;
import java.util.Optional;

// Configure the API connection
// use they Keycloak "authServerUrl" that contains the relative path
String serverUrl = "https://my-phasetwo-host/auth";
String realm = "my_realm_name";

Keycloak keycloak = KeycloakBuilder.builder()
    .serverUrl(serverUrl)
    .realm(realm)
    .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
    .clientId("my_client_id")
    .clientSecret("my_client_secret")
    .build();

PhaseTwo phaseTwo = new PhaseTwo(keycloak, serverUrl);

// Create an Organization
OrganizationRepresentation org = new OrganizationRepresentation().name("example");
String orgId = phaseTwo.organizations(realm).create(org);

// Create an Admin Portal link for the Organization
phaseTwo.organizations(realm).organization(orgId).portalLink(Optional.empty());

// Create and publish an Audit Event
phaseTwo.events(realm).send(new EventRepresentation()
    .type("foo.bar")
    .organizationId(orgId)
    .time(System.currentTimeMillis()));
```

## Generating sources from openapi.yaml

1. create an empty directory `local`
2. copy the current `openapi.yml` from the `phasetwo-docs` repo to that directory
3. run the generator in the `local` directory
```
docker run --rm --user $(id -u):$(id -g) -v $PWD:/local openapitools/openapi-generator-cli generate -i /local/openapi.yaml -g jaxrs-spec -o /local/java-sdk  --additional-properties=groupId=io.phasetwo,artifactId=phasetwo-admin-client,apiPackage=io.phasetwo.client.openapi.api,modelPackage=io.phasetwo.client.openapi.model,useSwaggerAnnotations=false,useBeanValidation=false,useTags=true,interfaceOnly=true,useJakartaEe=true,hideGenerationTimestamp=true
```
4. copy the relevant files
```
cp java-sdk/src/gen/java/io/phasetwo/client/openapi/*.java $PWD/../src/gen/java/io/phasetwo/client/openapi/
cp java-sdk/src/gen/java/io/phasetwo/client/openapi/api/*.java $PWD/../src/gen/java/io/phasetwo/client/openapi/api/
cp java-sdk/src/gen/java/io/phasetwo/client/openapi/model/*.java $PWD/../src/gen/java/io/phasetwo/client/openapi/model/
cp java-sdk/src/main/openapi/openapi.yaml $PWD/../src/main/openapi/openapi.yaml
```
5. resolve all of the `Response` issues in the `*Api` classes. This is because we need the response object in order to get the status code and `Location` header, but openapi and this generator doesn't give us a good way to specify that or do it by default.
6. push a pr and merge to main. auto releases using `.github/workflows/release.yml`

---

All documentation, source code and other files in this repository are Copyright 2025 Phase Two, Inc.
