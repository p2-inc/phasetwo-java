package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.OrganizationDomainRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/domains")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface OrganizationDomainsApi {

    @GET
    @Path("/{domainName}")
    @Produces({ "application/json" })
    OrganizationDomainRepresentation getOrganizationDomain(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("domainName") String domainName);

    @GET
    @Produces({ "application/json" })
    List<OrganizationDomainRepresentation> getOrganizationDomains(@PathParam("realm") String realm,@PathParam("orgId") String orgId);

    @POST
    @Path("/{domainName}/verify")
    void verifyDomain(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("domainName") String domainName);
}
