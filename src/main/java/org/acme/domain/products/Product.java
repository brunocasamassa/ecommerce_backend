package org.acme.domain.products;

import java.util.Random;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Product  extends PanacheMongoEntity{
    
    private String productId;
    public String getProductId() {
        return productId;
    }


    public void setProductId(String id) {
        this.productId = id;
    }


    private  String name;
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    private Double price;


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }


    public Product(){
       this.productId=String.valueOf(new Random().nextInt(9999));
    }


    public Product(String name, Double price, int cartQuantity){
        this.name = name;
        this.price = price;
    }
}
