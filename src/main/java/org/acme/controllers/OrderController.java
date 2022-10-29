package org.acme.controllers;

import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.acme.repository.OrderRepository;
import org.acme.domain.cart.CartProduct;
import org.acme.domain.order.Order;
import org.acme.services.order.OrderServiceUpdate;
import org.acme.services.order.OrderServiceAll;
import org.acme.services.order.OrderServiceGet;
import org.acme.services.order.OrderServiceDelete;
import org.acme.services.order.OrderServiceCreate;

@Path("/order")
public class OrderController {
    
    @Inject
    OrderRepository repository;

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") String userId) {
        return Response.ok(OrderServiceGet.execute(repository, userId)).build();
    }

    @GET
    public Response getAll() {
        return Response.ok(OrderServiceAll.execute(repository)).build();
    }


   
    @PUT
    @Path("/{id}")
    public Response update(Order order, @PathParam("id") String orderId) {
        OrderServiceUpdate.execute(repository, order, orderId);
        return Response.ok(order).build();
    }

    @POST
    public Response create( Order order ) throws URISyntaxException {
        return Response.ok( OrderServiceCreate.execute(repository,order)).build();
    
    }

    @DELETE
    public Response delete(String userId) {
        OrderServiceDelete.execute(repository,userId);
        return Response.noContent().build();
    }
}