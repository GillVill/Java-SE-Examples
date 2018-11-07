package com.sametdemirel.fibonaccirekursif;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // İsteen sayıda elemana sahip Fibonacci dizisini ekrana yazdıralım(Rekürsif Fonksiyon ile)

        Scanner tara = new Scanner(System.in);
        System.out.print("Fibonacci dizisi kaç eleman olsun: ");
        int elemanSayisi = tara.nextInt();

        for(int i=0; i<elemanSayisi; i++){
            System.out.print(fibonacciHesapla(i)+" ");
        }
    }
    public static int fibonacciHesapla(int elemanSayisi){
        if(elemanSayisi==1) return 1;
        if(elemanSayisi==0) return 1;
        return fibonacciHesapla(elemanSayisi-1)+fibonacciHesapla(elemanSayisi-2);
    }
}

