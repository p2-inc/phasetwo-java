package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.BulkResponseItem;
import io.phasetwo.client.openapi.model.MagicLinkRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface UsersApi {

    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param magicLinkRepresentation JSON body
     * @return Magic Link created
     * @return Malformed request
     * @return User or Client not found
     */
    @POST
    @Path("/magic-link")
    @Consumes({ "application/json" })
    void createMagicLink(@PathParam("realm") String realm,MagicLinkRepresentation magicLinkRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param userId user id
     * @return success
     */
    @GET
    @Path("/users/{userId}/orgs")
    @Produces({ "application/json" })
    List<OrganizationRepresentation> realmUsersUserIdOrgsGet(@PathParam("realm") String realm,@PathParam("userId") String userId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param userId user id
     * @param orgId organization id
     * @return success
     */
    @GET
    @Path("/users/{userId}/orgs/{orgId}/roles")
    @Produces({ "application/json" })
    List<OrganizationRoleRepresentation> realmUsersUserIdOrgsOrgIdRolesGet(@PathParam("realm") String realm,@PathParam("userId") String userId,@PathParam("orgId") String orgId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param userId user id
     * @param orgId organization id
     * @param organizationRoleRepresentation 
     * @return Multi Status
     */
    @PATCH
    @Path("/users/{userId}/orgs/{orgId}/roles")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<BulkResponseItem> realmUsersUserIdOrgsOrgIdRolesPatch(@PathParam("realm") String realm,@PathParam("userId") String userId,@PathParam("orgId") String orgId,List<OrganizationRoleRepresentation> organizationRoleRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param userId user id
     * @param orgId organization id
     * @param organizationRoleRepresentation 
     * @return Multi Status
     */
    @PUT
    @Path("/users/{userId}/orgs/{orgId}/roles")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<BulkResponseItem> realmUsersUserIdOrgsOrgIdRolesPut(@PathParam("realm") String realm,@PathParam("userId") String userId,@PathParam("orgId") String orgId,List<OrganizationRoleRepresentation> organizationRoleRepresentation);

}
