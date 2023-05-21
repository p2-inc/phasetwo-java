package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.UserRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/members")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-21T14:48:52.320815Z[Etc/UTC]")
public interface OrganizationMembershipsApi {

    @PUT
    @Path("/{userId}")
    void addOrganizationMember(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("userId") String userId);

    @GET
    @Path("/{userId}")
    void checkOrganizationMembership(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("userId") String userId);

    @GET
    @Produces({ "application/json" })
    List<UserRepresentation> getOrganizationMemberships(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@QueryParam("search")   String search,@QueryParam("first")   Integer first,@QueryParam("max")   Integer max);

    @GET
    @Path("/count")
    @Produces({ "application/json" })
    Integer getOrganizationMembershipsCount(@PathParam("realm") String realm,@PathParam("orgId") String orgId);

    @DELETE
    @Path("/{userId}")
    void removeOrganizationMember(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("userId") String userId);
}
