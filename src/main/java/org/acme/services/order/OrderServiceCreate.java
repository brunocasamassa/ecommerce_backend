package org.acme.services.order;

import org.acme.domain.cart.CartProduct;
import org.acme.domain.order.Order;
import org.acme.repository.OrderRepository;
 
public class OrderServiceCreate{

    public static Order execute(OrderRepository repository, Order orderBody){
        Double totalPrice = 0.0;

        Order order = new Order();
        order.setListOfProducts(orderBody.getListOfProducts());
        order.setUserId(orderBody.getUserId());
        order.setOrderId(order.id.toString());

        for (CartProduct cartProduct : order.getListOfProducts()) {totalPrice += cartProduct.getPrice();}
        
        order.setTotalPrice(totalPrice);
        repository.persist(order);

        return order;
    }


}