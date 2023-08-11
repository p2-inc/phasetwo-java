> :bug: **This is alpha software**

# Java SDK for Phase Two API

The Phase Two Java SDK library provides access to the Phase Two API from applications written in JVM-compatible languages.

## Documentation

See the [API Reference](https://phasetwo.io/api/) and [Javadoc](https://javadoc.io/doc/io.phasetwo/phasetwo-admin-client)

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

---

All documentation, source code and other files in this repository are Copyright 2023 Phase Two, Inc.
