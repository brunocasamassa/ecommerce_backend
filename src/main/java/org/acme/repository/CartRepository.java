package org.acme.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.acme.domain.cart.Cart;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class CartRepository implements PanacheMongoRepository<Cart> {

}
