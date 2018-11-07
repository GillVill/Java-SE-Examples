package com.sametdemirel.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employeeOne = new Employee("Samet Demirel");
        Employee employeeTwo = new Employee("Ayşenur Erdoğan");

        employeeOne.setAge(25); employeeOne.setDesignation("Software Developer"); employeeOne.setSalary(8000);
        employeeTwo.setAge(25); employeeTwo.setDesignation("Industrial Engineer"); employeeTwo.setSalary(6000);

        System.out.println(employeeOne);
        System.out.println(employeeTwo);
    }
}
