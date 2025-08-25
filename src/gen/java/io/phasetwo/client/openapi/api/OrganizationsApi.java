package io.phasetwo.client.openapi.api;

import java.util.Map;
import io.phasetwo.client.openapi.model.MyOrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.PortalLinkRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/orgs")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface OrganizationsApi {

    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param organizationRepresentation 
     * @return success
     */
    @POST
    @Consumes({ "application/json" })
    Response createOrganization(@PathParam("realm") String realm, OrganizationRepresentation organizationRepresentation);


    /**
     * Create a link for this organizations admin portal. This link encodes an action token on behalf of the organization's default admin user, or the user that is optionally specified in this request. The user specified must be a member of this organization, and have full organization admin roles.
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param userId 
     * @return success
     */
    @POST
    @Path("/{orgId}/portal-link")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    PortalLinkRepresentation createPortalLink(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@FormParam(value = "userId")  String userId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @DELETE
    @Path("/{orgId}")
    void deleteOrganization(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * Get a list of all organizations that the user is a member and their roles in those organizations. Similar idea to /userinfo in OIDC.
     *
     * @param realm realm name (not id!)
     * @return success
     */
    @GET
    @Path("/me")
    @Produces({ "application/json" })
    Map<String, MyOrganizationRepresentation> getMe(@PathParam("realm") String realm);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @GET
    @Path("/{orgId}")
    @Produces({ "application/json" })
    OrganizationRepresentation getOrganizationById(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * Get a paginated list of organizations using optional search query parameters.
     *
     * @param realm realm name (not id!)
     * @param search search by name
     * @param first 
     * @param max 
     * @param q search by attributes using the format (space separated) &#x60;k1:v1 k2:v2&#x60;
     * @return success
     */
    @GET
    @Produces({ "application/json" })
    List<OrganizationRepresentation> getOrganizations(@PathParam("realm") String realm,@QueryParam("search")   String search,@QueryParam("first")   Integer first,@QueryParam("max")   Integer max,@QueryParam("q")   String q);


    /**
     * Get a count of organizations using an optional search query.
     *
     * @param realm realm name (not id!)
     * @param search 
     * @param q search by attributes using the format (space separated) &#x60;k1:v1 k2:v2&#x60;
     * @return success
     */
    @GET
    @Path("/count")
    @Produces({ "application/json" })
    Integer getOrganizationsCount(@PathParam("realm") String realm,@QueryParam("search")   String search,@QueryParam("q")   String q);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param organizationRepresentation 
     * @return success
     */
    @PUT
    @Path("/{orgId}")
    @Consumes({ "application/json" })
    void updateOrganization(@PathParam("realm") String realm,@PathParam("orgId") String orgId,OrganizationRepresentation organizationRepresentation);

}
