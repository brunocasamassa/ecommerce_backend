package org.acme.services.order;

import org.acme.domain.order.Order;
import org.acme.repository.OrderRepository;
import org.bson.types.ObjectId;

public class OrderServiceGet{

    public static Order execute(OrderRepository repository, String orderId){
        return repository.findById(new ObjectId(orderId));
    }


}