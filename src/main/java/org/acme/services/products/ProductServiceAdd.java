package org.acme.services.products;

import org.acme.domain.products.*;
import org.acme.repository.ProductsRepository;
 
public class ProductServiceAdd{

    public static void execute(ProductsRepository repository, Product product){
        product.setProductId(product.id.toString());
        repository.persist(product);
    }


}