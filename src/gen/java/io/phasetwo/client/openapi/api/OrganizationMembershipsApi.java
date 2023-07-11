package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.UserRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/members")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-06-05T12:39:00.868500Z[Etc/UTC]")
public interface OrganizationMembershipsApi {

    @PUT
    @Path("/{userId}")
    void addOrganizationMember(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("userId") String userId);

    @GET
    @Path("/{userId}")
    Response checkOrganizationMembership(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("userId") String userId);

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
