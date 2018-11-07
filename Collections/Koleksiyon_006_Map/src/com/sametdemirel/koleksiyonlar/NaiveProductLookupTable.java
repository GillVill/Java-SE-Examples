package com.sametdemirel.koleksiyonlar;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable {

    private final List<Product> productList = new ArrayList<>();

    @Override
    public Product lookupById(final int id) {
        for (Product product: productList) {
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(final Product productToAdd) {

        final int uniqueId = productToAdd.getId();
        for (Product product: productList) {
            if(product.getId() == uniqueId){
                throw new IllegalArgumentException("Unable to add product, duplicate id for "
                + productToAdd);
            }
        }
        productList.add(productToAdd);
    }

    @Override
    public void clear() {
        productList.clear();
    }
}
