package com.sametdemirel.generics.method;

public class GenericMethodExamples {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};
        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Funday"};

        print(numbers);
        print(dayOfWeek);
        System.out.println(countGreaterThan(numbers, 50));
    }

    public static <E> void print(E[] list){
        for (E element: list){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] list, T elem){
        int count = 0;
        for(T element: list){
            if(element.compareTo(elem)>0)
                count++;
        }
        return count;
    }
}
