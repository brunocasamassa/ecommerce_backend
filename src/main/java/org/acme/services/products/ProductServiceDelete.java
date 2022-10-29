package org.acme.services.products;

import org.acme.domain.products.*;
import org.acme.repository.ProductsRepository;
import org.bson.types.ObjectId;
 
public class ProductServiceDelete{

    public static void execute(ProductsRepository repository, String id){
        Product product = repository.findById(new ObjectId(id));
        repository.delete(product);
    }


}