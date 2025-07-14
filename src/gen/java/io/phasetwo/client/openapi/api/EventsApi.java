package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.EventRepresentation;
import io.phasetwo.client.openapi.model.WebhookRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/{realm}")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.14.0")
public interface EventsApi {

    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param eventRepresentation JSON body
     * @return Event received
     * @return Malformed event
     * @return Rate limit exceeded
     * @return Reserved event type
     */
    @POST
    @Path("/events")
    @Consumes({ "application/json" })
    Response createEvent(@PathParam("realm") String realm,EventRepresentation eventRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param webhookRepresentation JSON body
     * @return Webhook created
     * @return Malformed webhook
     */
    @POST
    @Path("/webhooks")
    @Consumes({ "application/json" })
    Response createWebhook(@PathParam("realm") String realm,WebhookRepresentation webhookRepresentation);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param webhookId webhook id
     * @return success
     * @return Webhook doesn't exist
     */
    @DELETE
    @Path("/webhooks/{webhookId}")
    void deleteWebhook(@PathParam("realm") String realm,@PathParam("webhookId") String webhookId);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param webhookId webhook id
     * @return success
     * @return Webhook doesn't exist
     */
    @GET
    @Path("/webhooks/{webhookId}")
    @Produces({ "application/json" })
    WebhookRepresentation getWebhookById(@PathParam("realm") String realm,@PathParam("webhookId") String webhookId);


    /**
     * Get a list of webhooks for this realm
     *
     * @param realm realm name (not id!)
     * @return success
     */
    @GET
    @Path("/webhooks")
    @Produces({ "application/json" })
    List<WebhookRepresentation> getWebhooks(@PathParam("realm") String realm);


    /**
     * 
     *
     * @param realm realm name (not id!)
     * @param webhookId webhook id
     * @param webhookRepresentation 
     * @return success
     * @return Webhook doesn't exist
     */
    @PUT
    @Path("/webhooks/{webhookId}")
    @Consumes({ "application/json" })
    void updateWebhook(@PathParam("realm") String realm,@PathParam("webhookId") String webhookId,WebhookRepresentation webhookRepresentation);

}
