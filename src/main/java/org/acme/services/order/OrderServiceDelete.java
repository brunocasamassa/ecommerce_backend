package org.acme.services.order;
 
 import org.acme.domain.order.Order;
 import org.acme.repository.OrderRepository;
import org.bson.types.ObjectId;
 
public class OrderServiceDelete{

    public static void execute(OrderRepository repository,String orderId){
  
        Order order = repository.findById(new ObjectId(orderId));
        repository.delete(order);
    }


}