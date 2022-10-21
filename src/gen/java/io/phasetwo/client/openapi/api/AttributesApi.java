package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.RealmAttributeRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-21T13:51:00.208924Z[Etc/UTC]")
public interface AttributesApi {

    @POST
    @Consumes({ "application/json" })
    void createRealmAttribute(@PathParam("realm") String realm,RealmAttributeRepresentation realmAttributeRepresentation);

    @DELETE
    @Path("/{attributeKey}")
    void deleteRealmAttribute(@PathParam("realm") String realm,@PathParam("attributeKey") String attributeKey);

    @GET
    @Path("/{attributeKey}")
    @Produces({ "application/json" })
    RealmAttributeRepresentation getRealmAttributeByKey(@PathParam("realm") String realm,@PathParam("attributeKey") String attributeKey);

    @GET
    @Produces({ "application/json" })
    List<Map<String, RealmAttributeRepresentation>> getRealmAttributes(@PathParam("realm") String realm);

    @PUT
    @Path("/{attributeKey}")
    @Consumes({ "application/json" })
    void updateRealmAttributeByKey(@PathParam("realm") String realm,@PathParam("attributeKey") String attributeKey,RealmAttributeRepresentation realmAttributeRepresentation);
}
