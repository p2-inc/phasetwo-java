package io.phasetwo.client.openapi.api;

import java.io.File;
import io.phasetwo.client.openapi.model.InvitationRepresentation;
import java.util.Map;
import io.phasetwo.client.openapi.model.MyOrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationConfigRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationsExportRepresentation;
import io.phasetwo.client.openapi.model.OrganizationsImportRepresentation;
import io.phasetwo.client.openapi.model.OrganizationsImportResultRepresentation;
import io.phasetwo.client.openapi.model.PortalLinkRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/orgs")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public interface OrganizationsApi {

    /**
     * Accept invitation for authenticated user.
     *
     * @param realm realm name (not id!)
     * @param invitationId invitation UUID
     * @return success
     */
    @POST
    @Path("/me/invitations/{invitationId}")
    Response acceptInvitation(@PathParam("realm") String realm,@PathParam("invitationId") String invitationId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param organizationRepresentation 
     * @return success
     */
    @POST
    @Consumes({ "application/json" })
    Response createOrganization(@PathParam("realm") String realm,OrganizationRepresentation organizationRepresentation);


    /**
     * Create a link for this organization's IdP Wizard. This link encodes an action token on behalf of the organization's default admin user, or the user that is optionally specified in this request. The user specified must be a member of this organization, and have full organization admin roles.
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param userId 
     * @return success
     */
    @POST
    @Path("/{orgId}/portal-link")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    PortalLinkRepresentation createPortalLink(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@FormParam(value = "userId")  String userId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @DELETE
    @Path("/{orgId}")
    void deleteOrganization(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * Export all organizations and their configurations from this realm
     *
     * @param realm realm name (not id!)
     * @param includeMembers Include organization members in the export
     * @param includeRoles Include organization roles in the export
     * @param includeIdps Include identity providers in the export
     * @param orgIds Specific organization IDs to export (if not provided, exports all)
     * @return success
     */
    @GET
    @Path("/export")
    @Produces({ "application/json", "application/octet-stream" })
    OrganizationsExportRepresentation exportOrganizations(@PathParam("realm") String realm,@QueryParam("includeMembers") @DefaultValue("false")   Boolean includeMembers,@QueryParam("includeRoles") @DefaultValue("true")   Boolean includeRoles,@QueryParam("includeIdps") @DefaultValue("true")   Boolean includeIdps,@QueryParam("orgIds")   List<String> orgIds);


    /**
     * Get a list of all organizations that the user is a member and their roles in those organizations. Similar idea to /userinfo in OIDC.
     *
     * @param realm realm name (not id!)
     * @return success
     */
    @GET
    @Path("/me")
    @Produces({ "application/json" })
    Map<String, MyOrganizationRepresentation> getMe(@PathParam("realm") String realm);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @GET
    @Path("/{orgId}")
    @Produces({ "application/json" })
    OrganizationRepresentation getOrganizationById(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * Get the global organization configuration for this realm
     *
     * @param realm realm name (not id!)
     * @return success
     */
    @GET
    @Path("/config")
    @Produces({ "application/json" })
    OrganizationConfigRepresentation getOrganizationConfig(@PathParam("realm") String realm);


    /**
     * Get a paginated list of organizations using optional search query parameters.
     *
     * @param realm realm name (not id!)
     * @param search search by name
     * @param first 
     * @param max 
     * @param q search by attributes using the format (space separated) &#x60;k1:v1 k2:v2&#x60;
     * @return success
     */
    @GET
    @Produces({ "application/json" })
    List<OrganizationRepresentation> getOrganizations(@PathParam("realm") String realm,@QueryParam("search")   String search,@QueryParam("first")   Integer first,@QueryParam("max")   Integer max,@QueryParam("q")   String q);


    /**
     * Get a count of organizations using an optional search query.
     *
     * @param realm realm name (not id!)
     * @param search 
     * @param q search by attributes using the format (space separated) &#x60;k1:v1 k2:v2&#x60;
     * @return success
     */
    @GET
    @Path("/count")
    @Produces({ "application/json" })
    Integer getOrganizationsCount(@PathParam("realm") String realm,@QueryParam("search")   String search,@QueryParam("q")   String q);


    /**
     * Import organizations and their configurations into this realm
     *
     * @param realm realm name (not id!)
     * @param organizationsImportRepresentation 
     * @param skipExisting Skip organizations that already exist instead of updating them
     * @param importMembers Import organization members (requires existing users in realm)
     * @return success
     * @return Invalid import data or format
     * @return Conflicts with existing organizations
     */
    @POST
    @Path("/import")
    @Consumes({ "application/json", "multipart/form-data" })
    @Produces({ "application/json" })
    OrganizationsImportResultRepresentation importOrganizations(@PathParam("realm") String realm,OrganizationsImportRepresentation organizationsImportRepresentation,@QueryParam("skipExisting") @DefaultValue("false")   Boolean skipExisting,@QueryParam("importMembers") @DefaultValue("false")   Boolean importMembers);


    /**
     * Get a list of all invitations for the user.
     *
     * @param realm realm name (not id!)
     * @return success
     */
    @GET
    @Path("/me/invitations")
    @Produces({ "application/json" })
    InvitationRepresentation invitations(@PathParam("realm") String realm);


    /**
     * Reject invitation for authenticated user.
     *
     * @param realm realm name (not id!)
     * @param invitationId invitation UUID
     * @return success
     */
    @DELETE
    @Path("/me/invitations/{invitationId}")
    void rejectInvitation(@PathParam("realm") String realm,@PathParam("invitationId") String invitationId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param organizationRepresentation 
     * @return success
     */
    @PUT
    @Path("/{orgId}")
    @Consumes({ "application/json" })
    void updateOrganization(@PathParam("realm") String realm,@PathParam("orgId") String orgId,OrganizationRepresentation organizationRepresentation);


    /**
     * Update the global organization configuration for this realm
     *
     * @param realm realm name (not id!)
     * @param organizationConfigRepresentation 
     * @return success
     * @return Invalid configuration
     */
    @PUT
    @Path("/config")
    @Consumes({ "application/json" })
    Response updateOrganizationConfig(@PathParam("realm") String realm,OrganizationConfigRepresentation organizationConfigRepresentation);

}
