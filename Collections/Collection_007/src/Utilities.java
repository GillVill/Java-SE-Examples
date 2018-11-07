package com.sametdemirel.koleksiyonlar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sametdemirel.koleksiyonlar.Product.*;

public class Utilities {
    public static void main(String[] args) {

        Product door = ProductFixtures.door;
        Product floorPanel = ProductFixtures.floorPanel;
        Product window = ProductFixtures.window;

        List<Product> productList = new ArrayList<>();
        /*productList.add(door);
        productList.add(floorPanel);
        productList.add(window);*/
        Collections.addAll(productList, door, floorPanel, window);
        System.out.println(productList);

        final Product nameMin = Collections.min(productList, BY_NAME);
        System.out.println("Alfabetik sıraya göre ilk ürün -> " + nameMin);

        final Product weightMax = Collections.max(productList, BY_WEIGHT);
        System.out.println("En Ağır Ürün -> " + weightMax);

    }
}
