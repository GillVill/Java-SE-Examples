package com.sametdemirel.collections;

public class Product {

    private final String productName;
    private final int productWeight;

    public Product(String productName, int productWeight){
        this.productName = productName;
        this.productWeight = productWeight;
    }

    public String getProductName(){
        return this.productName;
    }

    public int getProductWeight(){
        return this.productWeight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productWeight=" + productWeight +
                '}';
    }
}
