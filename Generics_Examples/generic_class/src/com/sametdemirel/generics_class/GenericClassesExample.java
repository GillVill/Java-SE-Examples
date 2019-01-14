package com.sametdemirel.generics_class;

public class GenericClassesExample {
    public static void main(String[] args) {
        Person<Contact> c = new Person<>();
        Person<Employee> e = new Person<>();

        Contact c1 = new Contact("Mr","Samet","Demirel","544695xxxx");
        Employee e1 = new Employee("Ayşenur","Erdoğan","1");
        c.setPerson(c1);
        e.setPerson(e1);

        System.out.println(c.getPerson().toString());
        System.out.println(e.getPerson().toString());
    }
}
