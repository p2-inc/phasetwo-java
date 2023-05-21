package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.IdentityProviderMapperRepresentation;
import io.phasetwo.client.openapi.model.IdentityProviderRepresentation;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/idps")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-21T14:48:52.320815Z[Etc/UTC]")
public interface IdentityProvidersApi {

    @POST
    @Path("/{alias}/mappers")
    @Consumes({ "application/json" })
    void addIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,IdentityProviderMapperRepresentation identityProviderMapperRepresentation);

    @POST
    @Consumes({ "application/json" })
    void createIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,IdentityProviderRepresentation identityProviderRepresentation);

    @DELETE
    @Path("/{alias}")
    void deleteIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias);

    @DELETE
    @Path("/{alias}/mappers/{id}")
    void deleteIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,@PathParam("id") String id);

    @GET
    @Path("/{alias}")
    @Produces({ "application/json" })
    IdentityProviderRepresentation getIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias);

    @GET
    @Path("/{alias}/mappers/{id}")
    @Produces({ "application/json" })
    IdentityProviderMapperRepresentation getIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,@PathParam("id") String id);

    @GET
    @Path("/{alias}/mappers")
    @Produces({ "application/json" })
    List<IdentityProviderMapperRepresentation> getIdpMappers(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias);

    @GET
    @Produces({ "application/json" })
    List<IdentityProviderRepresentation> getIdps(@PathParam("realm") String realm,@PathParam("orgId") String orgId);

    @POST
    @Path("/import-config")
    @Produces({ "application/json" })
    Map<String, Object> importIdpJson(@PathParam("realm") String realm,@PathParam("orgId") String orgId);

    @PUT
    @Path("/{alias}")
    @Consumes({ "application/json" })
    void updateIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,IdentityProviderRepresentation identityProviderRepresentation);

    @PUT
    @Path("/{alias}/mappers/{id}")
    @Consumes({ "application/json" })
    void updateIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,@PathParam("id") String id,IdentityProviderMapperRepresentation identityProviderMapperRepresentation);
}
