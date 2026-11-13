package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.BulkResponseItem;
import io.phasetwo.client.openapi.model.MagicLinkRequest;
import io.phasetwo.client.openapi.model.MagicLinkResponse;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;
import io.phasetwo.client.openapi.model.SwitchOrganizationRepresentation;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import java.util.List;

/** Represents a collection of functions to interact with the API endpoints. */
@Path("")
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
    comments = "Generator version: 7.27.0")
public interface UsersApi {

  /**
   * @param realm realm name (not id!)
   * @param magicLinkRequest JSON body
   * @return Magic Link created
   * @return Malformed request
   * @return User or Client not found
   */
  @POST
  @Path("/{realm}/magic-link")
  @Consumes({"application/json"})
  @Produces({"application/json"})
  MagicLinkResponse createMagicLink(
      @PathParam("realm") String realm, MagicLinkRequest magicLinkRequest);

  /**
   * Get the currently active organization for the authenticated user
   *
   * @param realm realm name (not id!)
   * @return success
   * @return No active organization set
   */
  @GET
  @Path("/{realm}/users/active-organization")
  @Produces({"application/json"})
  OrganizationRepresentation getActiveOrganization(@PathParam("realm") String realm);

  /**
   * @param realm realm name (not id!)
   * @param userId user id
   * @param orgId organization id
   * @param organizationRoleRepresentation
   * @return Multi Status
   */
  @PUT
  @Path("/{realm}/users/{userId}/orgs/{orgId}/roles")
  @Consumes({"application/json"})
  @Produces({"application/json"})
  List<BulkResponseItem> grantUserRolesInOrganization(
      @PathParam("realm") String realm,
      @PathParam("userId") String userId,
      @PathParam("orgId") String orgId,
      List<OrganizationRoleRepresentation> organizationRoleRepresentation);

  /**
   * @param realm realm name (not id!)
   * @param userId user id
   * @return success
   */
  @GET
  @Path("/{realm}/users/{userId}/orgs")
  @Produces({"application/json"})
  List<OrganizationRepresentation> listUserOrganizations(
      @PathParam("realm") String realm, @PathParam("userId") String userId);

  /**
   * @param realm realm name (not id!)
   * @param userId user id
   * @param orgId organization id
   * @return success
   */
  @GET
  @Path("/{realm}/users/{userId}/orgs/{orgId}/roles")
  @Produces({"application/json"})
  List<OrganizationRoleRepresentation> listUserRolesInOrganization(
      @PathParam("realm") String realm,
      @PathParam("userId") String userId,
      @PathParam("orgId") String orgId);

  /**
   * @param realm realm name (not id!)
   * @param userId user id
   * @param orgId organization id
   * @param organizationRoleRepresentation
   * @return Multi Status
   */
  @PATCH
  @Path("/{realm}/users/{userId}/orgs/{orgId}/roles")
  @Consumes({"application/json"})
  @Produces({"application/json"})
  List<BulkResponseItem> revokeUserRolesInOrganization(
      @PathParam("realm") String realm,
      @PathParam("userId") String userId,
      @PathParam("orgId") String orgId,
      List<OrganizationRoleRepresentation> organizationRoleRepresentation);

  /**
   * Switch the active organization context for the authenticated user
   *
   * @param realm realm name (not id!)
   * @param switchOrganizationRepresentation
   * @return Active organization switched successfully. Returns a new token set reflecting the
   *     updated active organization; clients should replace their stored tokens with these.
   * @return Malformed request body
   * @return User is not a member of this organization
   * @return Organization not found
   */
  @PUT
  @Path("/{realm}/users/switch-organization")
  @Consumes({"application/json"})
  @Produces({"application/json"})
  Response switchActiveOrganization(
      @PathParam("realm") String realm,
      SwitchOrganizationRepresentation switchOrganizationRepresentation);
}
