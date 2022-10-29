package org.acme.services.cart;

import org.acme.domain.cart.Cart;
import org.acme.repository.CartRepository;
import org.bson.types.ObjectId;

public class CartServiceGet{

    public static Cart execute(CartRepository repository, String userId){
        return repository.findById(new ObjectId(userId));
    }


}