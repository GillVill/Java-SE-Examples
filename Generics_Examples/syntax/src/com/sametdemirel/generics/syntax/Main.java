package com.sametdemirel.generics.syntax;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList a = new ArrayList();
//        a.add(15);
//        a.add("Samet");
//        Integer sayi1 = (Integer) a.get(1);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        //arrayList.add("Samet"); compile time error, string cannot be cast to Integer

        Pair<String, Integer> p1 = new OrderedPair<>("Samet", 1);
        Pair<Integer, String> p2 = new OrderedPair<>(2, "Ayşenur");

        print(p1.getKey(), p1.getValue());
        print(p2.getKey(), p2.getValue());
        print("Hello", "World");
    }

    public static <K, V> void print(K key, V value){
        System.out.println("Key: "+ key);
        System.out.println("Value: "+value);
    }
}
