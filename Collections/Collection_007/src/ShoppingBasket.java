package com.sametdemirel.koleksiyonlar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sametdemirel.koleksiyonlar.ProductFixtures.*;

public class ShoppingBasket {

    private final List<Product> items = new ArrayList<>();
    private int totalWeight = 0;

    public void add(Product product){
        items.add(product);
        totalWeight += product.getWeight();
    }

    public List<Product> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public String toString() {
        return "Shopping basket of \n" + items + "\nwith weight: " + totalWeight;
    }

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        basket.add(door);
        System.out.println(basket);

        basket.getItems().add(window);
        System.out.println(basket);

    }
}
