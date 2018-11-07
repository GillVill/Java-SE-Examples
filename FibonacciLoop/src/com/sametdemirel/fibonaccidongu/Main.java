package com.sametdemirel.fibonaccidongu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // İstenen sayıda elemana sahip Fibonacci Serisini Ekrana Yazdıran Kod

        Scanner tara = new Scanner(System.in);
        System.out.print("Fibonacci dizisi kaç elemandan oluşsun: ");

        int elemanSayisi = tara.nextInt();
        int fibonacciIlk = 1, fibonacciIki = 1, geciciFibonacci;
        System.out.print(fibonacciIlk+" "+fibonacciIki);

        for(int i=0; i<elemanSayisi-2; i++){
            geciciFibonacci = fibonacciIlk + fibonacciIki;
            fibonacciIlk = fibonacciIki;
            fibonacciIki = geciciFibonacci;
            System.out.print(" "+ geciciFibonacci);
        }
    }
}
