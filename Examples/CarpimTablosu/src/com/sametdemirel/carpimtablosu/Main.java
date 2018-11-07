package com.sametdemirel.carpimtablosu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner tara = new Scanner(System.in);

        System.out.print("Hangi Sayının Faktoriyelini Almak İstiyorsunuz: ");
        int sonuc=1, faktoriyel = tara.nextInt();

        for(int i = 1; i<=faktoriyel; i++){
            sonuc *= i;
        }
        System.out.print(faktoriyel + "! = "+ sonuc);*/

        /*                  Fibonacci Serisi
        Scanner tara = new Scanner(System.in);

        System.out.print("Fibonacci Serisi Kaç Eleman Olsun: ");
        int fibonacciElemanSayisi = tara.nextInt();

        int[] fibonacciSerisi = new int[fibonacciElemanSayisi];
        fibonacciSerisi[0] = 0;
        fibonacciSerisi[1] = 1;

        for(int i=0; i<fibonacciSerisi.length-2; i++){
            fibonacciSerisi[i+2] = fibonacciSerisi[i] + fibonacciSerisi[i+1];
        }

        for (int fibonacciIterator: fibonacciSerisi
             ) {
                System.out.print(fibonacciIterator+ " ");
        }*/

                         //Çarpım Tablosu
        for(int i=1; i<11; i++){

            for(int j=1; j<11; j++){
                System.out.print(i+"x"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
