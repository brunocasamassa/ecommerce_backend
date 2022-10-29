package org.acme.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.acme.domain.products.Product;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Sort;

@ApplicationScoped
public class ProductsRepository implements PanacheMongoRepository<Product> {

    public Product findByName(String name) {
        return find("name", name).firstResult();
    }

    public List<Product> findOrderedName() {
        return listAll(Sort.by("name"));
    }
    
}
