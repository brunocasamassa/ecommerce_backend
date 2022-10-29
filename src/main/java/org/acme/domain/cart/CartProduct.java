package org.acme.domain.cart;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class CartProduct extends PanacheMongoEntity {

    private int cartQuantity;
    private String name;
    private Double price;

    public int getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {
        this.cartQuantity = cartQuantity;
    }


    public CartProduct(){

    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }


    public CartProduct(String name, Double price, int quantity){
        this.setName(name);
        this.setPrice(price);
        this.setCartQuantity(quantity);
    }

    
}
