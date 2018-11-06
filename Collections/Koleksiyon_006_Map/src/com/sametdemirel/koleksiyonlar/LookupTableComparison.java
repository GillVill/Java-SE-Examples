package com.sametdemirel.koleksiyonlar;

import java.util.*;

public class LookupTableComparison {

    private static final int NUMBER_OF_PRODUCTS = 20_000;
    public static final int ITERATIONS = 5;

    private static final List<Product> productList = generateProducts();

    private static List<Product> generateProducts() {

        final List<Product> productList = new ArrayList<>();
        final Random weightGenerator = new Random();
        for(int i =0; i < NUMBER_OF_PRODUCTS; i++){
            productList.add(new Product(i, "Product" +i, 10 + weightGenerator.nextInt(10)));
        }
        Collections.shuffle(productList);
        Collections.shuffle(productList);
        Collections.shuffle(productList);
        return productList;
    }

    public static void main(String[] args) {
        runLookups(new MapProductLookupTable());
        runLookups(new NaiveProductLookupTable());
    }

    private static void runLookups(final ProductLookupTable productLookupTable) {
        final List<Product> productList = LookupTableComparison.productList;
        System.out.println("Running lookups with "+ productLookupTable.getClass().getSimpleName());

        for(int i = 0; i< ITERATIONS; i++){
            final long startTime = System.currentTimeMillis();

            for (Product product: productList) {
                productLookupTable.addProduct(product);
            }

            for(Product product: productList){
                final Product result = productLookupTable.lookupById(product.getId());
                if(result != product){
                    throw new IllegalStateException("Lookup Table returned wrong result for " + product);
                }
            }

            productLookupTable.clear();

            System.out.println(System.currentTimeMillis() - startTime + "ms");
        }
    }
}
