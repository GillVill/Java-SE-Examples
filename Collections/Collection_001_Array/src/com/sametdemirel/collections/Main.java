package com.sametdemirel.collections;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Product door = new Product("Door", 50);
        Product floorPanel = new Product("Floor Panel", 35);

        Product[] products = {door, floorPanel};

        // Yazdırma
        System.out.println(Arrays.toString(products));

        //Ekleme
        //Dizi boyutu otomatik olarak genişletilemediğinden dolayı aşağıdaki kod parçası hata verir...
        /*productDizisi[2] = new Product("Pencere", 40);
        System.out.println(productDizisi[2]);*/

        //Bunun için yeni bir metod yazarak diziyi genişletmeye çalışacağız...

        final Product window = new Product("Window", 40);
        products = add(window, products);

        //Yeniden Yazdırma
        System.out.println(Arrays.toString(products));
    }

    private static Product[] add(Product product, Product[] products) {

        int size = products.length; //Dizinin uzunluğunu alıyoruz...
        Product[] newProducts = Arrays.copyOf(products, size+1); //Dizinin boyutunu 1 artırıyoruz
        newProducts[size] = product; //Yeni dizinin sonuna gelen urunu ekliyoruz...
        return newProducts;
    }

}
