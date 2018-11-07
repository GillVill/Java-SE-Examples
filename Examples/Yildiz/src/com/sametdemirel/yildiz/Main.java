package com.sametdemirel.yildiz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int satir = tara.nextInt();

        for (int i=0; i<satir; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
