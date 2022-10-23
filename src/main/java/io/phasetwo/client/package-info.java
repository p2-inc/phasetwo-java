/**
 * Java SDK for Phase Two API. @see <a href="https://phasetwo.io/api/">API Reference</a>.
 *
 * <pre>{@code
 * // Set up the Phase Two SDK
 * String serverUrl = "https://my-phasetwo-host/auth";
 * String realm = "my_realm_name";
 * Keycloak keycloak = KeycloakBuilder.builder()
 *     .serverUrl(serverUrl)
 *     .realm(realm)
 *     .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
 *     .clientId("my_client_id")
 *     .clientSecret("my_client_secret")
 *     .build();
 * PhaseTwo phaseTwo = new PhaseTwo(keycloak, serverUrl);
 * 
 * // Use it
 * OrganizationRepresentation org = new OrganizationRepresentation().name("example");
 * phaseTwo.organizations(realm).create(org);
 * }</pre>
 */
package io.phasetwo.client;
