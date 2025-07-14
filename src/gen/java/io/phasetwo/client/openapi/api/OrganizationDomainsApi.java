package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.OrganizationDomainRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/orgs/{orgId}/domains")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface OrganizationDomainsApi {

    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param domainName domain name
     * @return success
     */
    @GET
    @Path("/{domainName}")
    @Produces({ "application/json" })
    OrganizationDomainRepresentation getOrganizationDomain(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("domainName") String domainName);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @GET
    @Produces({ "application/json" })
    List<OrganizationDomainRepresentation> getOrganizationDomains(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * Initiate a verification check for the domain name owned by this organization
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param domainName domain name
     * @return success
     */
    @POST
    @Path("/{domainName}/verify")
    void verifyDomain(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("domainName") String domainName);

}
