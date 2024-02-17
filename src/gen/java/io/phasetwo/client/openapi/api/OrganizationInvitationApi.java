package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.InvitationRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/invitations/{invitationId}")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface OrganizationInvitationApi {

    @GET
    @Produces({ "application/json" })
    InvitationRepresentation getOrganizationInvitationById(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("invitationId") String invitationId);

    @PUT
    @Path("/resend-email")
    void resendOrganizationInvitation(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("invitationId") String invitationId);
}
