package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.OrganizationScimRepresentation;
import jakarta.ws.rs.*;

/** Represents a collection of functions to interact with the API endpoints. */
@Path("/{realm}/orgs/{orgId}/scim")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public interface OrganizationScimApi {

  /**
   * Creates the SCIM 2.0 service-provider configuration for the organization. Requires
   * `manage-organizations` or `manage-identity-providers` on the organization. Returns 404 if the
   * realm-level SCIM flag is off, and 409 if a configuration already exists for the organization.
   * Cleartext secrets and basic passwords submitted here are hashed with Argon2id before
   * persistence.
   *
   * @param realm realm name (not id!)
   * @param orgId organization id
   * @param organizationScimRepresentation
   * @return SCIM configuration created
   * @return Insufficient permission
   * @return SCIM disabled at realm level
   * @return SCIM configuration already exists for this organization
   */
  @POST
  @Consumes({"application/json"})
  @Produces({"application/json"})
  OrganizationScimRepresentation createOrganizationScimConfig(
      @PathParam("realm") String realm,
      @PathParam("orgId") String orgId,
      OrganizationScimRepresentation organizationScimRepresentation);

  /**
   * Removes the SCIM 2.0 service-provider configuration for the organization. Requires
   * `manage-organizations` or `manage-identity-providers` on the organization.
   *
   * @param realm realm name (not id!)
   * @param orgId organization id
   * @return SCIM configuration deleted
   * @return Insufficient permission
   * @return SCIM disabled at realm level, or no configuration exists for this organization
   */
  @DELETE
  void deleteOrganizationScimConfig(
      @PathParam("realm") String realm, @PathParam("orgId") String orgId);

  /**
   * Returns the SCIM 2.0 service-provider configuration for the organization. Requires
   * `view-organizations` or `view-identity-providers` on the organization. Returns 404 if the
   * realm-level SCIM flag (`scimEnabled` in the orgs config) is off, or if no configuration exists
   * for the organization yet.
   *
   * @param realm realm name (not id!)
   * @param orgId organization id
   * @return success
   * @return Insufficient permission
   * @return SCIM disabled at realm level, or no configuration exists for this organization
   */
  @GET
  @Produces({"application/json"})
  OrganizationScimRepresentation getOrganizationScimConfig(
      @PathParam("realm") String realm, @PathParam("orgId") String orgId);

  /**
   * Updates the SCIM 2.0 service-provider configuration for the organization. Requires
   * `manage-organizations` or `manage-identity-providers` on the organization. Omit secret/password
   * fields on `auth` to preserve the existing stored credential; supply a new value to rotate.
   *
   * @param realm realm name (not id!)
   * @param orgId organization id
   * @param organizationScimRepresentation
   * @return success
   * @return Insufficient permission
   * @return SCIM disabled at realm level, or no configuration exists for this organization
   */
  @PUT
  @Consumes({"application/json"})
  @Produces({"application/json"})
  OrganizationScimRepresentation updateOrganizationScimConfig(
      @PathParam("realm") String realm,
      @PathParam("orgId") String orgId,
      OrganizationScimRepresentation organizationScimRepresentation);
}
