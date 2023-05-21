package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.InvitationRepresentation;
import io.phasetwo.client.openapi.model.InvitationRequestRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/invitations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-21T14:48:52.320815Z[Etc/UTC]")
public interface OrganizationInvitationsApi {

    @POST
    @Consumes({ "application/json" })
    void addOrganizationInvitation(@PathParam("realm") String realm,@PathParam("orgId") String orgId,InvitationRequestRepresentation invitationRequestRepresentation);

    @GET
    @Produces({ "application/json" })
    List<InvitationRepresentation> getOrganizationInvitations(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@QueryParam("search")   String search,@QueryParam("first")   Integer first,@QueryParam("max")   Integer max);

    @DELETE
    @Path("/{invitationId}")
    void removeOrganizationInvitation(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("invitationId") String invitationId);
}
