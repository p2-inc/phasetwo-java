package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.OrganizationGroupRepresentation;
import io.phasetwo.client.openapi.model.OrganizationRoleRepresentation;
import io.phasetwo.client.openapi.model.UserRepresentation;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/{realm}/orgs/{orgId}/groups")
public interface OrganizationGroupsApi {

  @GET
  @Produces({ "application/json" })
  List<OrganizationGroupRepresentation> getOrganizationGroups(@PathParam("realm") String realm, @PathParam("orgId") String orgId);

  @POST
  @Consumes({ "application/json" })
  Response createOrganizationGroup(@PathParam("realm") String realm, @PathParam("orgId") String orgId, @NotNull OrganizationGroupRepresentation organizationGroupRepresentation);

  @GET
  @Path("/{groupId}")
  @Produces({ "application/json" })
  OrganizationGroupRepresentation getOrganizationGroup(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("groupId") String groupId);

  @DELETE
  @Path("/{groupId}")
  void deleteOrganizationGroup(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("groupId") String groupId);

  @PUT
  @Path("/{groupId}")
  @Consumes({ "application/json" })
  void updateOrganizationGroup(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("groupId") String groupId,@NotNull OrganizationGroupRepresentation organizationGroupRepresentation);  

  @GET
  @Path("/{groupId}/roles/{roleName}")
  Response checkGroupOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("groupId") String groupId,@PathParam("roleName") String roleName);

  @GET
  @Path("/{groupId}/roles")
  @Produces({ "application/json" })
  List<OrganizationRoleRepresentation> getOrganizationGroupRoles(@PathParam("realm") String realm, @PathParam("orgId") String orgId, @PathParam("groupId") String groupId);

  @PUT
  @Path("/{groupId}/roles/{roleName}")
  void grantGroupOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("groupId") String groupId,@PathParam("roleName") String roleName);

  @DELETE
  @Path("/{groupId}/roles/{roleName}")
  void revokeGroupOrganizationRole(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("groupId") String groupId,@PathParam("roleName") String roleName);

  @GET
  @Path("/{groupId}/users/{userId}")
  Response isMemberOfOrganizationGroup(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("groupId") String groupId,@PathParam("userId") String userId);

  @DELETE
  @Path("/{groupId}/users/{userId}")
  void removeUserFromOrganizationGroup(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("groupId") String groupId,@PathParam("userId") String userId);

  @GET
  @Path("/{groupId}/users")
  @Produces({ "application/json" })
  List<UserRepresentation> getUsersFromOrganizationGroup(@PathParam("realm") String realm, @PathParam("orgId") String orgId, @PathParam("groupId") String groupId);

  @PUT
  @Path("/{groupId}/users/{userId}")
  void addUserToOrganizationGroup(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("groupId") String groupId,@PathParam("userId") String userId);

  @GET
  @Path("/{groupId}/children")
  @Produces({ "application/json" })
  List<OrganizationGroupRepresentation> getOrganizationGroupChildren(@PathParam("realm") String realm, @PathParam("orgId") String orgId, @PathParam("groupId") String groupId);

}
