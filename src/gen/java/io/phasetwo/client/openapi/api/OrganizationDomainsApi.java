package io.phasetwo.client.openapi.api;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/orgs/{orgId}/domains/{domainName}/verify")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.21.0")
public interface OrganizationDomainsApi {

    /**
     * Initiate a verification check for the domain name owned by this organization
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param domainName domain name
     * @return success
     */
    @POST
    Response verifyDomain(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("domainName") String domainName);

}
