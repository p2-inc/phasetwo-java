package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;
import io.phasetwo.client.openapi.model.UserRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/roles")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-21T14:48:52.320815Z[Etc/UTC]")
public interface OrganizationRolesApi {

    @GET
    @Path("/{name}/users/{userId}")
    Response checkUserOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name,@PathParam("userId") String userId);

    @POST
    @Consumes({ "application/json" })
    Response createOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,OrganizationRoleRepresentation organizationRoleRepresentation);

    @DELETE
    @Path("/{name}")
    void deleteOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name);

    @GET
    @Path("/{name}")
    @Produces({ "application/json" })
    OrganizationRoleRepresentation getOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name);

    @GET
    @Produces({ "application/json" })
    List<OrganizationRoleRepresentation> getOrganizationRoles(@PathParam("realm") String realm,@PathParam("orgId") String orgId);

    @GET
    @Path("/{name}/users")
    @Produces({ "application/json" })
    List<UserRepresentation> getUserOrganizationRoles(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name);

    @PUT
    @Path("/{name}/users/{userId}")
    void grantUserOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name,@PathParam("userId") String userId);

    @DELETE
    @Path("/{name}/users/{userId}")
    void revokeUserOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name,@PathParam("userId") String userId);

    @PUT
    @Path("/{name}")
    @Consumes({ "application/json" })
    void updateOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name,OrganizationRoleRepresentation organizationRoleRepresentation);
}
