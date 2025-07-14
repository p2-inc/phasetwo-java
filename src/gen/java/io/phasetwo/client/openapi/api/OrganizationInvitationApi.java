package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.InvitationRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/orgs/{orgId}/invitations")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface OrganizationInvitationApi {

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
