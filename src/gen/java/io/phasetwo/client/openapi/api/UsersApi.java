package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.MagicLinkRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-06-05T12:39:00.868500Z[Etc/UTC]")
public interface UsersApi {

    @POST
    @Path("/magic-link")
    @Consumes({ "application/json" })
    void createMagicLink(@PathParam("realm") String realm,MagicLinkRepresentation magicLinkRepresentation);

    @GET
    @Path("/users/{userId}/orgs")
    @Produces({ "application/json" })
    List<OrganizationRepresentation> realmUsersUserIdOrgsGet(@PathParam("realm") String realm,@PathParam("userId") String userId);

    @GET
    @Path("/users/{userId}/orgs/{orgId}/roles")
    @Produces({ "application/json" })
    List<OrganizationRoleRepresentation> realmUsersUserIdOrgsOrgIdRolesGet(@PathParam("realm") String realm,@PathParam("userId") String userId,@PathParam("orgId") String orgId);
}
