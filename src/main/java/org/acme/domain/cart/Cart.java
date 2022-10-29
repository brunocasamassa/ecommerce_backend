package org.acme.domain.cart;

import java.util.ArrayList;

import org.acme.domain.products.Product;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Cart  extends PanacheMongoEntity{
    
    private ArrayList<CartProduct> listOfProducts;
    private Double totalPrice;
    private String userId;

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


    public Cart(){

    }


    public Cart(ArrayList<CartProduct> list, Double price, String userId){
        this.listOfProducts = list;
        this.totalPrice = price;
        this.userId =userId;
    }
}
