package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.UserRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/orgs/{orgId}/members")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface OrganizationMembershipsApi {

    /**
     * Add the specified user to the specified organization as a member
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param userId user id
     * @return success
     */
    @PUT
    @Path("/{userId}")
    void addOrganizationMember(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("userId") String userId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param userId user id
     * @return success
     */
    @GET
    @Path("/{userId}")
    Response checkOrganizationMembership(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("userId") String userId);


    /**
     * Get a paginated list of users who are a member of the specified organization.
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
    List<UserRepresentation> getOrganizationMemberships(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@QueryParam("search")   String search,@QueryParam("first")   Integer first,@QueryParam("max")   Integer max);


    /**
     * Get total number of members of a given organization
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @GET
    @Path("/count")
    @Produces({ "application/json" })
    Integer getOrganizationMembershipsCount(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * Remove the specified user from the specified organization as a member
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param userId user id
     * @return success
     */
    @DELETE
    @Path("/{userId}")
    void removeOrganizationMember(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("userId") String userId);

}
