package org.acme.services.cart;
 
import org.acme.domain.cart.Cart;
import org.acme.repository.CartRepository;
import org.bson.types.ObjectId;
 
public class CartServiceDelete{

    public static void execute(CartRepository repository,String userId){
  
        Cart cart = repository.findById(new ObjectId(userId));
        repository.delete(cart);
    }


}