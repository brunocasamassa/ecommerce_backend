package org.acme.services.products;

import org.acme.domain.products.*;
import org.acme.repository.ProductsRepository;
 
public class ProductServiceAdd{

    public static String execute(ProductsRepository repository, Product bodyProduct){
        Product product = new Product();
        product.setName(bodyProduct.getName());
        product.setPrice(bodyProduct.getPrice());
        repository.persist(product);
        return product.getProductId();
    }


}