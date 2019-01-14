package com.sametdemirel.generics_class;

public class Person<E> {
    private E e;

    public void setPerson(E e){
        this.e = e;
    }

    public E getPerson(){
        return e;
    }
}
