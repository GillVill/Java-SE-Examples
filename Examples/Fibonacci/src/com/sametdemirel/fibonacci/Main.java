package com.sametdemirel.fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.print("Fibonacci dizisi kaç eleman olsun: ");

        int fibonacci1 = 0, fibonacci2 = 1, gecici, diziBoyutu = tara.nextInt();

        System.out.print(fibonacci1+" "+fibonacci2);

        for(int i=0; i<diziBoyutu-2; i++){
            gecici = fibonacci1 + fibonacci2;
            System.out.print(" "+gecici);

            fibonacci1 = fibonacci2;
            fibonacci2 = gecici;
        }

        /*int[] fibonacci = new int[diziBoyutu];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i=0; i<fibonacci.length-2; i++){
            fibonacci[i+2] = fibonacci[i] + fibonacci[i+1];
        }

        for (int fibonacciIterator: fibonacci
             ) {
            System.out.print(fibonacciIterator+"    ");
        }*/
    }



}
