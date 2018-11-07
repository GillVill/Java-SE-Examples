package com.sametdemirel.koleksiyonlar;

public class Customer {
    public static final Customer JACK = new Customer("Jack");
    public static final Customer JILL = new Customer("Jill");
    public static final Customer MARY = new Customer("Mary");

    private final String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void reply(String message){
        System.out.printf("%s: %s\n", customerName, message);
    }
}
