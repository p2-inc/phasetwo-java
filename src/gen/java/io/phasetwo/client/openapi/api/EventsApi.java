package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.EventRepresentation;
import io.phasetwo.client.openapi.model.WebhookRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface EventsApi {

    @POST
    @Path("/events")
    @Consumes({ "application/json" })
    Response createEvent(@PathParam("realm") String realm,EventRepresentation eventRepresentation);

    @POST
    @Path("/webhooks")
    @Consumes({ "application/json" })
    Response createWebhook(@PathParam("realm") String realm,WebhookRepresentation webhookRepresentation);

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
