package org.acme.services.products;

import org.acme.domain.products.*;
import org.acme.repository.ProductsRepository;
import org.bson.types.ObjectId;


public class ProductServiceGet{

    public static Product execute(ProductsRepository repository, String id){
        return repository.findById(new ObjectId(id));
    }


}