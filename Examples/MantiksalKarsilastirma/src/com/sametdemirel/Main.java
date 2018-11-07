package com.sametdemirel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner tara = new Scanner(System.in);

        System.out.print("Birinci Sayiyi Giriniz:");
        int sayi1 = tara.nextInt();

        System.out.print("İkinci Sayiyi Giriniz:");
        int sayi2 = tara.nextInt();

        String sonuc = sayi1 > sayi2 ? "Birinci sayı ikinciden büyük" : "İkinci sayı birinciden büyük";
        System.out.println(sonuc);
    }
}
