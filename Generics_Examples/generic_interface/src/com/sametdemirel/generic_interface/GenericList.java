package com.sametdemirel.generic_interface;

public class GenericList <T> implements GenericInterface<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }
}
