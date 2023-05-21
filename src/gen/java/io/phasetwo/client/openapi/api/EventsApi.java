package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.EventRepresentation;
import io.phasetwo.client.openapi.model.WebhookRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-21T14:48:52.320815Z[Etc/UTC]")
public interface EventsApi {

    @POST
    @Path("/events")
    @Consumes({ "application/json" })
    void createEvent(@PathParam("realm") String realm,EventRepresentation eventRepresentation);

    @POST
    @Path("/webhooks")
    @Consumes({ "application/json" })
    void createWebhook(@PathParam("realm") String realm,WebhookRepresentation webhookRepresentation);

    @DELETE
    @Path("/webhooks/{webhookId}")
    void deleteWebhook(@PathParam("realm") String realm,@PathParam("webhookId") String webhookId);

    @GET
    @Path("/webhooks/{webhookId}")
    @Produces({ "application/json" })
    WebhookRepresentation getWebhookById(@PathParam("realm") String realm,@PathParam("webhookId") String webhookId);

    @GET
    @Path("/webhooks")
    @Produces({ "application/json" })
    List<WebhookRepresentation> getWebhooks(@PathParam("realm") String realm);

    @PUT
    @Path("/webhooks/{webhookId}")
    @Consumes({ "application/json" })
    void updateWebhook(@PathParam("realm") String realm,@PathParam("webhookId") String webhookId,WebhookRepresentation webhookRepresentation);
}
