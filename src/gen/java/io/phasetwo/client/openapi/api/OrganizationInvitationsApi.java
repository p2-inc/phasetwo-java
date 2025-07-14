package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.InvitationRepresentation;
import io.phasetwo.client.openapi.model.InvitationRequestRepresentation;

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
public interface OrganizationInvitationsApi {

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
    Response addOrganizationInvitation(@PathParam("realm") String realm,@PathParam("orgId") String orgId,InvitationRequestRepresentation invitationRequestRepresentation);


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

}
