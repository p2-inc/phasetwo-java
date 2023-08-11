package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.MyOrganizationRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRepresentation;
import io.phasetwo.client.openapi.model.PortalLinkRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
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
    List<OrganizationRepresentation> getOrganizations(@PathParam("realm") String realm,@QueryParam("search")   String search,@QueryParam("first")   Integer first,@QueryParam("max")   Integer max,@QueryParam("q")   String q);

    @GET
    @Path("/count")
    @Produces({ "application/json" })
    Integer getOrganizationsCount(@PathParam("realm") String realm,@QueryParam("search")   String search);

    @PUT
    @Path("/{orgId}")
    @Consumes({ "application/json" })
    void updateOrganization(@PathParam("realm") String realm,@PathParam("orgId") String orgId,OrganizationRepresentation organizationRepresentation);
}
