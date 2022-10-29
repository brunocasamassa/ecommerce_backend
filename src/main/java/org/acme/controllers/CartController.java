package org.acme.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.acme.domain.cart.CartProduct;
import org.acme.domain.cart.Cart;
import org.acme.repository.CartRepository;
import org.acme.services.cart.CartServiceCreate;
import org.acme.services.cart.CartServiceDelete;
import org.acme.services.cart.CartServiceGet;
import org.acme.services.cart.CartServiceUpdate;
import org.bson.types.ObjectId;

@Path("/cart")
public class CartController {
    
    @Inject
    CartRepository repository;

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") String userId) {
        return Response.ok(CartServiceGet.execute(repository, userId)).build();
    }

   
    @PUT
    @Path("/{id}")
    public Response updateToCart(CartProduct cartProduct, @PathParam("id") String userId) {
        CartServiceUpdate.execute(repository, cartProduct, userId);
        return Response.ok(cartProduct).build();
    }

    @POST
    public Response createCart( Cart cart) throws URISyntaxException {
        CartServiceCreate.execute(repository, cart);
        return Response.ok(cart).build();
    
    }

    @DELETE
    public Response deleteCart(String userId) {
        CartServiceDelete.execute(repository,userId);
  
        return Response.noContent().build();
    }
}