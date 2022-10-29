package org.acme.services.order;

import org.acme.domain.order.*;
import org.acme.repository.OrderRepository;
import java.util.List;

public class OrderServiceAll{

    public static List<Order> execute(OrderRepository repository){
        return repository.listAll();
    }

}