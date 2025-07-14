package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.IdentityProviderMapperRepresentation;
import io.phasetwo.client.openapi.model.IdentityProviderRepresentation;
import io.phasetwo.client.openapi.model.LinkIdentityProviderRepresentation;
import java.util.Map;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/orgs/{orgId}/idps")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface IdentityProvidersApi {

    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param alias 
     * @param identityProviderMapperRepresentation 
     * @return success
     */
    @POST
    @Path("/{alias}/mappers")
    @Consumes({ "application/json" })
    Response addIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,IdentityProviderMapperRepresentation identityProviderMapperRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param identityProviderRepresentation JSON body
     * @return success
     */
    @POST
    @Consumes({ "application/json" })
    Response createIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,IdentityProviderRepresentation identityProviderRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param alias Identity Provider alias
     * @return success
     */
    @DELETE
    @Path("/{alias}")
    void deleteIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param alias 
     * @param id Mapper id
     * @return success
     */
    @DELETE
    @Path("/{alias}/mappers/{id}")
    void deleteIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,@PathParam("id") String id);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param alias Identity Provider alias
     * @return success
     */
    @GET
    @Path("/{alias}")
    @Produces({ "application/json" })
    IdentityProviderRepresentation getIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param alias 
     * @param id Mapper id
     * @return success
     */
    @GET
    @Path("/{alias}/mappers/{id}")
    @Produces({ "application/json" })
    IdentityProviderMapperRepresentation getIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,@PathParam("id") String id);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param alias 
     * @return success
     */
    @GET
    @Path("/{alias}/mappers")
    @Produces({ "application/json" })
    List<IdentityProviderMapperRepresentation> getIdpMappers(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @GET
    @Produces({ "application/json" })
    List<IdentityProviderRepresentation> getIdps(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @return success
     */
    @POST
    @Path("/import-config")
    @Produces({ "application/json" })
    Map<String, Object> importIdpJson(@PathParam("realm") String realm,@PathParam("orgId") String orgId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param linkIdentityProviderRepresentation JSON body
     * @return success
     */
    @POST
    @Path("/link")
    @Consumes({ "application/json" })
    Response linkIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,LinkIdentityProviderRepresentation linkIdentityProviderRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param idpAlias idp alias
     * @return success
     */
    @POST
    @Path("/${idpAlias}/unlink")
    void unlinkIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("idpAlias") String idpAlias);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param alias Identity Provider alias
     * @param identityProviderRepresentation 
     * @return success
     */
    @PUT
    @Path("/{alias}")
    @Consumes({ "application/json" })
    void updateIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,IdentityProviderRepresentation identityProviderRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param orgId organization id
     * @param alias 
     * @param id Mapper id
     * @param identityProviderMapperRepresentation 
     * @return success
     */
    @PUT
    @Path("/{alias}/mappers/{id}")
    @Consumes({ "application/json" })
    void updateIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,@PathParam("id") String id,IdentityProviderMapperRepresentation identityProviderMapperRepresentation);

}
