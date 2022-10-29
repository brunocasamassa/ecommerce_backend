package org.acme.services.cart;

import org.acme.domain.cart.CartProduct;
import org.acme.domain.cart.Cart;
import org.acme.repository.CartRepository;
 
public class CartServiceCreate{

    public static void execute(CartRepository repository, Cart cart){
        Double totalPrice = 0.0;
        for (CartProduct cartProduct : cart.getListOfProducts()) {totalPrice += cartProduct.getPrice();}
        
        cart.setTotalPrice(totalPrice);
        repository.persist(cart);
    }


}