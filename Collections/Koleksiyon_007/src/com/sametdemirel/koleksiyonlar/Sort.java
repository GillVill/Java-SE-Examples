package com.sametdemirel.koleksiyonlar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

import static com.sametdemirel.koleksiyonlar.Product.*;

public class Sort {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(ProductFixtures.door);
        productList.add(ProductFixtures.floorPanel);
        productList.add(ProductFixtures.window);

        System.out.println(productList);
        System.out.println();

        //Collections.sort(productList, BY_NAME);
        productList.sort(BY_NAME);
        System.out.println(productList);
        System.out.println();

        //Collections.sort(productList, BY_WEIGHT);
        productList.sort(BY_WEIGHT);
        System.out.println(productList);

    }
}
