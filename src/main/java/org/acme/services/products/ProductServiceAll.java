package org.acme.services.products;

import org.acme.domain.products.*;
import org.acme.repository.ProductsRepository;
import java.util.List;

public class ProductServiceAll{

    public static List<Product> execute(ProductsRepository repository){
        return repository.listAll();
    }


}