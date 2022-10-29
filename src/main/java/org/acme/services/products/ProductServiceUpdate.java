package org.acme.services.products;

import org.acme.domain.products.*;
import org.acme.repository.ProductsRepository;
import org.bson.types.ObjectId;
 
public class ProductServiceUpdate{

    public static void execute(ProductsRepository repository, Product product, String id){
        product.id = new ObjectId(id);
        repository.update(product);
    }


}