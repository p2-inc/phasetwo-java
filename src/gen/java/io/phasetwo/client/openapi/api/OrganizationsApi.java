package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.MyOrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.PortalLinkRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-21T14:48:52.320815Z[Etc/UTC]")
public interface OrganizationsApi {

    @POST
    @Consumes({ "application/json" })
    Response createOrganization(@PathParam("realm") String realm,OrganizationRepresentation organizationRepresentation);

    @POST
    @Path("/{orgId}/portal-link")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    PortalLinkRepresentation createPortalLink(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@FormParam(value = "userId")  String userId);

    @DELETE
    @Path("/{orgId}")
    void deleteOrganization(@PathParam("realm") String realm,@PathParam("orgId") String orgId);

    @GET
    @Path("/me")
    @Produces({ "application/json" })
    Map<String, MyOrganizationRepresentation> getMe(@PathParam("realm") String realm);

    @GET
    @Path("/{orgId}")
    @Produces({ "application/json" })
    OrganizationRepresentation getOrganizationById(@PathParam("realm") String realm,@PathParam("orgId") String orgId);

    @GET
    @Produces({ "application/json" })
    List<OrganizationRepresentation> getOrganizations(@PathParam("realm") String realm,@QueryParam("search")   String search,@QueryParam("first")   Integer first,@QueryParam("max")   Integer max);

    @GET
    @Path("/count")
    @Produces({ "application/json" })
    Integer getOrganizationsCount(@PathParam("realm") String realm,@QueryParam("search")   String search);

    @PUT
    @Path("/{orgId}")
    @Consumes({ "application/json" })
    void updateOrganization(@PathParam("realm") String realm,@PathParam("orgId") String orgId,OrganizationRepresentation organizationRepresentation);
}
