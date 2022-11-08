package org.acme.controllers;

import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.acme.domain.user.User;
import org.acme.repository.UserRepository;
import org.acme.services.user.UserServiceAll;
import org.acme.services.user.UserServiceCreate;
import org.acme.services.user.UserServiceDelete;
import org.acme.services.user.UserServiceGet;
import org.acme.services.user.UserServiceUpdate;


@Path("/user")
public class UserController {
    
    @Inject
    UserRepository repository;

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") String userId) {
        return Response.ok(UserServiceGet.execute(repository, userId)).build();
    }

    @GET
    public Response getAll() {
        return Response.ok(UserServiceAll.execute(repository)).build();
    }


    @PUT
    @Path("/{id}")
    public Response update(User user, @PathParam("id") String userId) {
        UserServiceUpdate.execute(repository, user, userId);
        return Response.ok(user).build();
    }

    @POST
    public Response create(User user) throws URISyntaxException {
        return Response.ok( UserServiceCreate.execute(repository, user)).build();
    
    }

    @DELETE
    public Response delete(String userId) {
        UserServiceDelete.execute(repository,userId);
        return Response.noContent().build();
    }
}