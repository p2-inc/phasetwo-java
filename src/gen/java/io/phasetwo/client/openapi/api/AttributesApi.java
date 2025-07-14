package io.phasetwo.client.openapi.api;

import java.util.Map;
import io.phasetwo.client.openapi.model.RealmAttributeRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}/attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface AttributesApi {

    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param realmAttributeRepresentation JSON body
     * @return Attribute created
     * @return Malformed attribute
     */
    @POST
    @Consumes({ "application/json" })
    void createRealmAttribute(@PathParam("realm") String realm,RealmAttributeRepresentation realmAttributeRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param attributeKey attribute key
     * @return success
     * @return Realm attribute doesn't exist
     */
    @DELETE
    @Path("/{attributeKey}")
    void deleteRealmAttribute(@PathParam("realm") String realm,@PathParam("attributeKey") String attributeKey);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param attributeKey attribute key
     * @return success
     * @return Realm attribute doesn't exist
     */
    @GET
    @Path("/{attributeKey}")
    @Produces({ "application/json" })
    RealmAttributeRepresentation getRealmAttributeByKey(@PathParam("realm") String realm,@PathParam("attributeKey") String attributeKey);


    /**
     * Get a list of attributes for this realm
     *
     * @param realm realm name (not id!)
     * @return success
     */
    @GET
    @Produces({ "application/json" })
    List<Map<String, RealmAttributeRepresentation>> getRealmAttributes(@PathParam("realm") String realm);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param attributeKey attribute key
     * @param realmAttributeRepresentation 
     * @return success
     * @return Realm attribute doesn't exist
     */
    @PUT
    @Path("/{attributeKey}")
    @Consumes({ "application/json" })
    void updateRealmAttributeByKey(@PathParam("realm") String realm,@PathParam("attributeKey") String attributeKey,RealmAttributeRepresentation realmAttributeRepresentation);

}
