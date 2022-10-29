package org.acme.services.cart;

import org.acme.domain.cart.CartProduct;
import org.acme.domain.cart.Cart;
import org.acme.repository.CartRepository;
import org.bson.types.ObjectId;

public class CartServiceUpdate{

    public static void execute(CartRepository repository, CartProduct product, String userId){
        Cart cart = repository.findById(new ObjectId(userId));
        cart.getListOfProducts().add(product);
         repository.update(cart);
    }


}