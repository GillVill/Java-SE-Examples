package com.sametdemirel.koleksiyonlar;

public class Product {

    private final String name;
    private final int weight;
    private final int id;

    public Product(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", id=" + id +
                '}';
    }
}
