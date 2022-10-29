package org.acme.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.acme.domain.order.Order;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Sort;
 
@ApplicationScoped
public class OrderRepository implements PanacheMongoRepository<Order> {

    public Order findByName(String name) {
        return find("name", name).firstResult();
    }

    public List<Order> findOrderedName() {
        return listAll(Sort.by("name"));
    }
}
