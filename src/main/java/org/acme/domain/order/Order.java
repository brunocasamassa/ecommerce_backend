package org.acme.domain.order;

import java.util.ArrayList;

import org.acme.domain.cart.CartProduct;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Order extends PanacheMongoEntity{
    
    private ArrayList<CartProduct> listOfProducts;
    private Double totalPrice;
    private String userId;
    private String orderId;

    public String getOrderId() {
        return orderId;
    }


    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    public ArrayList<CartProduct> getListOfProducts() {
        return listOfProducts;
    }


    public void setListOfProducts(ArrayList<CartProduct> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }



    public Double getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    } 


    public Order(){

    }

    public Order (ArrayList<CartProduct> cartProducts, String userId){
        this.listOfProducts = cartProducts;
        this.userId = userId;
    }

    public Order(ArrayList<CartProduct> list, Double price, String userId, String orderId){
        this.listOfProducts = list;
        this.totalPrice = price;
        this.userId =userId;
        this.orderId = orderId;
    }
}
