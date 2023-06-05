package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.OrganizationDomainRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/domains")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-06-05T12:39:00.868500Z[Etc/UTC]")
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
