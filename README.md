# Phase Two Java SDK

<!-- phasetwo:banner:start - managed by p2-inc/shared-github-actions, edit there -->
[![Maven Central](https://img.shields.io/maven-central/v/io.phasetwo/phasetwo-admin-client?label=maven%20central)](https://central.sonatype.com/artifact/io.phasetwo/phasetwo-admin-client) [![license](https://img.shields.io/badge/license-Apache--2.0-blue)](COPYING) [![docs](https://img.shields.io/badge/docs-phasetwo.io-blue)](https://phasetwo.io/docs/api/sdks/)

📚 [Documentation](https://phasetwo.io/docs/api/sdks/) • 🚀 [Hosted Keycloak](https://dash.phasetwo.io/?utm_source=github&utm_medium=readme&utm_campaign=phasetwo-java) • 🤖 [Keycloak Skills](https://github.com/p2-inc/keycloak-skills) • 💬 [Support](mailto:support@phasetwo.io)

> [!TIP]
> **Run this in our cloud, no setup needed.** Phase Two hosts Keycloak with all of our extensions built in. [Try it free with your own cluster →](https://dash.phasetwo.io/?utm_source=github&utm_medium=readme&utm_campaign=phasetwo-java)
>
> **Using a coding agent?** Add the Phase Two Keycloak skills ([launch post](https://phasetwo.io/blog/keycloak-skills-mcp-launch)) to Claude Code, Cursor or Codex so your agent can set up passwordless login, SSO, organizations and clusters for you:
>
> ```sh
> # Install the skills (connects to our hosted MCP server)
> claude plugin marketplace add p2-inc/keycloak-skills
> claude plugin install phasetwo@keycloak-skills
> # Or connect to the MCP server directly
> claude mcp add --transport http keycloak https://mcp.phasetwo.io/mcp
> ```
<!-- phasetwo:banner:end -->

Java client for the [Phase Two](https://phasetwo.io) extensions to the Keycloak Admin API: organizations, members, roles, domains, identity providers, invitations, SCIM, webhooks and audit events, realm attributes and magic links. For core Keycloak administration (realms, users, clients), use the official [Keycloak admin client](https://www.keycloak.org/securing-apps/admin-client), which this SDK builds on. See the [API reference](https://phasetwo.io/api/phase-two-admin-rest-api/) for every endpoint.

> [!NOTE]
> Pre-1.0: minor versions can include breaking changes. All Phase Two SDKs share a version: release X.Y.* implements Phase Two API X.Y.

## Installation

Java 17 or newer. Find the latest version on [Maven Central](https://central.sonatype.com/artifact/io.phasetwo/phasetwo-admin-client).

Maven:

```xml
<dependency>
  <groupId>io.phasetwo</groupId>
  <artifactId>phasetwo-admin-client</artifactId>
  <version>VERSION</version>
</dependency>
```

Gradle (Kotlin):

```kotlin
dependencies {
    implementation("io.phasetwo:phasetwo-admin-client:VERSION")
}
```

Gradle (Groovy):

```groovy
dependencies {
    implementation 'io.phasetwo:phasetwo-admin-client:VERSION'
}
```

The SDK depends on `org.keycloak:keycloak-admin-client`, so you get it transitively.

## Quick start

Create an organization, add a member, create an IdP Wizard link for it and send an audit event. This code runs in CI against Phase Two Keycloak ([`QuickstartExample.java`](src/test/java/io/phasetwo/client/QuickstartExample.java)).

<!-- phasetwo:snippet quickstart src/test/java/io/phasetwo/client/QuickstartExample.java -->
```java
// Authenticate as a service account (client credentials grant).
Keycloak keycloak =
    KeycloakBuilder.builder()
        .serverUrl(serverUrl) // e.g. "https://euc1.auth.ac/auth"
        .realm(realm)
        .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
        .clientId(clientId)
        .clientSecret(clientSecret)
        .build();
PhaseTwo phaseTwo = new PhaseTwo(keycloak, serverUrl);

// Create an organization. create() returns the new id (from the Location header).
OrganizationsResource orgs = phaseTwo.organizations(realm);
String orgId =
    orgs.create(
        new OrganizationRepresentation()
            .name("acme")
            .displayName("Acme, Inc.")
            .domains(List.of("acme.example")));
OrganizationResource org = orgs.organization(orgId);

// Add an existing user as a member.
org.memberships().add(userId);

// Create a link to the IdP Wizard / admin portal for the organization.
PortalLinkRepresentation portal = org.portalLink(Optional.empty());
System.out.println("Portal link: " + portal.getLink());

// Send an audit event.
phaseTwo
    .events(realm)
    .send(
        new EventRepresentation()
            .type("acme.onboarded")
            .representation("{\"orgId\":\"" + orgId + "\"}")
            .time(System.currentTimeMillis()));
```
<!-- /phasetwo:snippet -->

## Authentication

Use a [service account](https://phasetwo.io/docs/api/service-accounts/): a confidential client in your realm with *Service accounts* enabled, whose service account user has the `realm-management` roles the calls need (`realm-admin` covers all of them). The quick start authenticates with its client ID and secret (client credentials grant); `KeycloakBuilder` fetches and refreshes the token.

`serverUrl` is the Keycloak base URL including any context path, e.g. `https://euc1.auth.ac/auth` for Phase Two hosted clusters.

To call the API with a token you already have, build the `Keycloak` client with `.authorization(token)` instead of a grant. To send events as the signed-in user (so the event records that user), use `phaseTwo.userEvents(realm, userAccessToken)`.

## Usage

- `PhaseTwo` is the entry point. `phaseTwo.organizations(realm)`, `.events(realm)`, `.webhooks(realm)` and `.attributes(realm)` return resource objects; `organization(orgId)` gives you `memberships()`, `roles()`, `domains()`, `invitations()` and `identityProviders()`.
- Request and response bodies are the generated models in `io.phasetwo.client.openapi.model`, with fluent setters (`new OrganizationRepresentation().name("acme")`).
- Optional query parameters are `Optional<...>` arguments.
- Creates return the new resource's id, read from the `Location` header.
- For anything the resource objects don't wrap, `phaseTwo.getOrganizationsApi()` and the other `get*Api()` methods return the generated JAX-RS interfaces, one method per operation, named after its `operationId`.

### Errors

A non-2xx response throws a `jakarta.ws.rs.WebApplicationException` subclass: `NotFoundException` for 404, `ForbiddenException` for 403, `BadRequestException` for 400, and so on. `e.getResponse()` has the status and body.

<!-- phasetwo:snippet errors src/test/java/io/phasetwo/client/QuickstartExample.java -->
```java
try {
  phaseTwo.organizations(realm).organization(orgId).get();
} catch (NotFoundException e) {
  // 404
  found = false;
} catch (WebApplicationException e) {
  // any other non-2xx response
  throw new IllegalStateException("HTTP " + e.getResponse().getStatus(), e);
}
```
<!-- /phasetwo:snippet -->

## Compatibility

| SDK | Phase Two API (`info.version`) | Tested against |
|---|---|---|
| 0.2.x | 0.2 | `quay.io/phasetwo/phasetwo-keycloak:26.5.6` |

The API version and spec commit each release was generated from are in [`sdk-generator.json`](sdk-generator.json). The integration tests run against the Phase Two Keycloak image in [`PhaseTwoTest.java`](src/test/java/io/phasetwo/client/PhaseTwoTest.java).

## API reference

- [Javadoc](https://javadoc.io/doc/io.phasetwo/phasetwo-admin-client)
- [Phase Two Admin REST API](https://phasetwo.io/api/phase-two-admin-rest-api/)
- [SDKs for other languages](https://phasetwo.io/docs/api/sdks/)

## Generated code

The interfaces and models in `src/gen/java/io/phasetwo/client/openapi` (and `src/main/openapi/openapi.yaml`) are generated from the [Phase Two OpenAPI spec](https://github.com/p2-inc/phasetwo-docs/blob/main/openapi.yaml) by [phasetwo-sdk-generator](https://github.com/p2-inc/phasetwo-sdk-generator). Don't edit them by hand: CI regenerates them and fails on any difference. The README code blocks are copied from the example files the same way. Everything in `src/main` is hand-written.

## License

Apache License 2.0, see [COPYING](COPYING).
