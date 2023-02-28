package io.phasetwo.client;

import java.util.Optional;
import java.util.function.Supplier;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.Response;

public class Resources {

  public static boolean isNoContent(Response response) {
    return response.getStatus() == Response.Status.NO_CONTENT.getStatusCode();
  }

  public static Optional<String> getIdFromResponse(Response resp) {
    int status = resp.getStatus();
    // client status code
    if (status / 100 == 4) {
      throw new ClientErrorException(resp);
    }

    if (status == Response.Status.CREATED.getStatusCode() && resp.getHeaders() != null && resp.getHeaders().getFirst("Location") != null) {
      String loc = resp.getHeaders().getFirst("Location").toString();
      return Optional.of(loc.substring(loc.lastIndexOf("/")+1));
    }
    return Optional.empty();
  }
}
