package com.sametdemirel.loopexamples;

public class Main {

    public static void main(String[] args) {
        // Print from 1 to 10 with for loop
        System.out.println("\t\t\tNumbers from 1 to 10");
       for(int i=0; i<10; i+=1){
           System.out.print((i+1)+"\t");
       }
       System.out.println("\n\t\t\tOdd Numbers between 1 and 20");
       //Print odd numbers from 1 to 20 with for loop
        for(int i=0; i<10; i++){
            System.out.print((2*i+1)+"\t");
        }
        //Print odd numbers between 100 and 1
        System.out.println("\n\t\t\tOdd Numbers between 100 and 1");
        for(int i=0; i<50; i++){
            System.out.print(100-(2*i+1)+"\t");
        }
        //Numbers between 0 and 100 that can be divided each 3 and 7
        System.out.println("\n\t\t\t Numbers between 0 and 100 divided into both 3 and 7");
        for(int i=0; i<4; i++){
            System.out.print(21*(i+1)+"\t");
        }
        //1 2 4 8 16 32 64
        System.out.println("\n\t\t\t 2^x");
        for(int i=0; i<7; i++){
            System.out.print((int)Math.pow(2, i)+"\t");
        }
        //Numbers between 0 and 5 divided into 5
        System.out.println("\n\t\t\t Numbers between 0 and 5 divided into 5 include 5");
        for(int i=0; i<5; i++){
            if((i+1)%5==0)
                System.out.println(i+1);
        }
    }
}
