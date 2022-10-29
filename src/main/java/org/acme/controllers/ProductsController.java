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

import org.acme.domain.products.Product;
import org.acme.repository.ProductsRepository;
import org.acme.services.products.ProductServiceAdd;
import org.acme.services.products.ProductServiceAll;
import org.acme.services.products.ProductServiceDelete;
import org.acme.services.products.ProductServiceGet;
import org.acme.services.products.ProductServiceUpdate;
import org.acme.services.products.ProductServiceSearch;

@Path("/products")
public class ProductsController {
    
    @Inject
    ProductsRepository repository;

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") String id) {
        return Response.ok(ProductServiceGet.execute(repository,id)).build();
    }

    @GET
    public Response get() {
        return Response.ok(ProductServiceAll.execute(repository)).build();
    }

    @GET
    @Path("/search/{name}")
    public Response search(@PathParam("name") String name) {
        Product product = ProductServiceSearch.execute(repository, name);
        return product != null ? Response.ok(product).build()
                : Response.status(Status.NOT_FOUND).build();
    }

    @POST
    public Response create(Product product) throws URISyntaxException {
        ProductServiceAdd.execute(repository,product);
        return Response.created(new URI("/" + product.id)).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") String id, Product product) {
        ProductServiceUpdate.execute(repository,product,id);
        return Response.ok(product).build();

    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") String id) {
        ProductServiceDelete.execute(repository , id);
        return Response.noContent().build();
    }
}