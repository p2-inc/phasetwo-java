package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.InvitationRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/invitations")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface OrganizationInvitationApi {

    @GET
    @Path("/{invitationId}")
    @Produces({ "application/json" })
    InvitationRepresentation getOrganizationInvitationById(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("invitationId") String invitationId);

    @GET
    @Path("/count")
    @Produces({ "application/json" })
    Integer getOrganizationInvitationCount(@PathParam("realm") String realm,@PathParam("orgId") String orgId);

    @PUT
    @Path("/{invitationId}/resend-email")
    void resendOrganizationInvitation(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("invitationId") String invitationId);
}
