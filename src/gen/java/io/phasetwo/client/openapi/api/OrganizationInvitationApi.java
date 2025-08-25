package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.InvitationRepresentation;
import io.phasetwo.client.openapi.model.InvitationRequestRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/orgs/{orgId}/invitations")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface OrganizationInvitationApi {

    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param invitationRequestRepresentation 
     * @return success
     * @return invitation already exists
     */
    @POST
    @Consumes({ "application/json" })
    Response addOrganizationInvitation(@PathParam("realm") String realm, @PathParam("orgId") String orgId, InvitationRequestRepresentation invitationRequestRepresentation);


    /**
     * Get an invitation to an organization by its uuid.
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param invitationId invitation id
     * @return success
     */
    @GET
    @Path("/{invitationId}")
    @Produces({ "application/json" })
    InvitationRepresentation getOrganizationInvitationById(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("invitationId") String invitationId);


    /**
     * Get a count of invitations to an organization
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @GET
    @Path("/count")
    @Produces({ "application/json" })
    Integer getOrganizationInvitationCount(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * Get a paginated list of invitations to an organization, using an optional search query for email address.
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param search 
     * @param first 
     * @param max 
     * @return success
     */
    @GET
    @Produces({ "application/json" })
    List<InvitationRepresentation> getOrganizationInvitations(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@QueryParam("search")   String search,@QueryParam("first")   Integer first,@QueryParam("max")   Integer max);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param invitationId invitation id
     * @return success
     */
    @DELETE
    @Path("/{invitationId}")
    void removeOrganizationInvitation(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("invitationId") String invitationId);


    /**
     * Resend the email for an existing Organization Invitation
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param invitationId invitation id
     * @return success
     */
    @PUT
    @Path("/{invitationId}/resend-email")
    void resendOrganizationInvitation(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("invitationId") String invitationId);

}
