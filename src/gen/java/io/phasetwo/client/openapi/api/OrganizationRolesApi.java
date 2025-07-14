package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.BulkResponseItem;
import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;
import io.phasetwo.client.openapi.model.UserRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/orgs/{orgId}/roles")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface OrganizationRolesApi {

    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param name organization role name
     * @param userId user id
     * @return success
     */
    @GET
    @Path("/{name}/users/{userId}")
    Response checkUserOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name,@PathParam("userId") String userId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param organizationRoleRepresentation 
     * @return success
     */
    @POST
    @Consumes({ "application/json" })
    Response createOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,OrganizationRoleRepresentation organizationRoleRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param organizationRoleRepresentation 
     * @return Multi Status
     */
    @PUT
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<BulkResponseItem> createOrganizationRoles(@PathParam("realm") String realm,@PathParam("orgId") String orgId,List<OrganizationRoleRepresentation> organizationRoleRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param name organization role name
     * @return success
     */
    @DELETE
    @Path("/{name}")
    void deleteOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param organizationRoleRepresentation 
     * @return Multi Status
     */
    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<BulkResponseItem> deleteOrganizationRoles(@PathParam("realm") String realm,@PathParam("orgId") String orgId,List<OrganizationRoleRepresentation> organizationRoleRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param name organization role name
     * @return success
     */
    @GET
    @Path("/{name}")
    @Produces({ "application/json" })
    OrganizationRoleRepresentation getOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @GET
    @Produces({ "application/json" })
    List<OrganizationRoleRepresentation> getOrganizationRoles(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param name organization role name
     * @return success
     */
    @GET
    @Path("/{name}/users")
    @Produces({ "application/json" })
    List<UserRepresentation> getUserOrganizationRoles(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name);


    /**
     * Grant the specified user to the specified organization role
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param name organization role name
     * @param userId user id
     * @return success
     */
    @PUT
    @Path("/{name}/users/{userId}")
    void grantUserOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name,@PathParam("userId") String userId);


    /**
     * Revoke the specified organization role from the specified user
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param name organization role name
     * @param userId user id
     * @return success
     */
    @DELETE
    @Path("/{name}/users/{userId}")
    void revokeUserOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name,@PathParam("userId") String userId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param name organization role name
     * @param organizationRoleRepresentation 
     * @return success
     */
    @PUT
    @Path("/{name}")
    @Consumes({ "application/json" })
    void updateOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("name") String name,OrganizationRoleRepresentation organizationRoleRepresentation);

}
