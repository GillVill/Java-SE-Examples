package com.sametdemirel.siralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizi kaç elemanlı olsun? ");
        int boyut = scan.nextInt();

        int[] dizi = new int[boyut];

        for(int i=0; i<boyut; i++){
            System.out.print("Dizinin "+ (i+1)+ ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
        }

        for(int i=0; i<dizi.length; i++){
            for(int j=i+1; j<dizi.length; j++){
                if(dizi[j]<dizi[i]){
                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }

        for (int sayi: dizi
             ) {
            System.out.print(sayi+"\t");
        }

    }
}
