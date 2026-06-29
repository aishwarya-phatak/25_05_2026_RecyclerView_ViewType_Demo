package com.example.a25_05_2026_recyclerview_viewtype;

import androidx.annotation.NonNull;

public class Product {

    private int productId;
    private String productName;
    private int productPrice;

    public Product(){
        this.productId = 100;
        this.productName = "Washing Machine";
        this.productPrice = 5000;
    }

    public Product(int prId,String prName, int prPrice){
        this.productId = prId;
        this.productName = prName;
        this.productPrice = prPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}