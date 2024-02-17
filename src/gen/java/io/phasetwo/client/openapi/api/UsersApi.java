package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.BulkResponseItem;
import java.util.List;
import io.phasetwo.client.openapi.model.MagicLinkRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
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

    @PATCH
    @Path("/users/{userId}/orgs/{orgId}/roles")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<BulkResponseItem> realmUsersUserIdOrgsOrgIdRolesPatch(@PathParam("realm") String realm,@PathParam("userId") String userId,@PathParam("orgId") String orgId,List<OrganizationRoleRepresentation> organizationRoleRepresentation);

    @PUT
    @Path("/users/{userId}/orgs/{orgId}/roles")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<BulkResponseItem> realmUsersUserIdOrgsOrgIdRolesPut(@PathParam("realm") String realm,@PathParam("userId") String userId,@PathParam("orgId") String orgId,List<OrganizationRoleRepresentation> organizationRoleRepresentation);
}
