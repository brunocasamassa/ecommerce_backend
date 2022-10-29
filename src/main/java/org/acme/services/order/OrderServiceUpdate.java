package org.acme.services.order;


import org.acme.domain.order.Order;
import org.acme.repository.OrderRepository;
import org.bson.types.ObjectId;

public class OrderServiceUpdate{

    public static void execute(OrderRepository repository, Order order, String orderId){
        Order requestOrder = repository.findById(new ObjectId(orderId));
        requestOrder.setListOfProducts(order.getListOfProducts());
        requestOrder.setTotalPrice(order.getTotalPrice());
         repository.update(requestOrder);
    }


}