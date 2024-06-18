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


@Path("/{realm}/orgs/{orgId}/idps")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface IdentityProvidersApi {

    @POST
    @Path("/{alias}/mappers")
    @Consumes({ "application/json" })
    Response addIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,IdentityProviderMapperRepresentation identityProviderMapperRepresentation);

    @POST
    @Consumes({ "application/json" })
    Response createIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,IdentityProviderRepresentation identityProviderRepresentation);

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

    @POST
    @Path("/link")
    @Consumes({ "application/json" })
    Response linkIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,LinkIdentityProviderRepresentation linkIdentityProviderRepresentation);

    @POST
    @Path("/{alias}/unlink")
    void unlinkIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias);

    @PUT
    @Path("/{alias}")
    @Consumes({ "application/json" })
    void updateIdp(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,IdentityProviderRepresentation identityProviderRepresentation);

    @PUT
    @Path("/{alias}/mappers/{id}")
    @Consumes({ "application/json" })
    void updateIdpMapper(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("alias") String alias,@PathParam("id") String id,IdentityProviderMapperRepresentation identityProviderMapperRepresentation);
}
