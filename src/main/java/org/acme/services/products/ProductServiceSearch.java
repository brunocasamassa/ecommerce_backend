package org.acme.services.products;

import org.acme.domain.products.*;
import org.acme.repository.ProductsRepository;

public class ProductServiceSearch{

    public static Product execute(ProductsRepository repository,String name){
        return repository.findByName(name);
    }

}