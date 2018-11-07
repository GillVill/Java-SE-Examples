package com.sametdemirel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double deger1, deger2, sonuc = 0;
        String islemTipi;

        Scanner tara = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        deger1 = tara.nextDouble();
        System.out.print("İkinci sayıyı giriniz:");
        deger2 = tara.nextDouble();
        System.out.print("Hangi işlemi yapmak istiyorsunuz? Toplama/Çıkarma/Bölme/Çarpma: ");
        Scanner tara2 = new Scanner(System.in);
        islemTipi = tara2.nextLine();

        if(islemTipi.equalsIgnoreCase("Toplama"))
            sonuc = deger1 + deger2;
        else if (islemTipi.equalsIgnoreCase("Cikarma"))
            sonuc = deger1 - deger2;
        else if(islemTipi.equalsIgnoreCase("Bolme"))
            if(deger2 == 0.0d)
                System.out.println("İkinci sayı sıfır olduğundan bölme işlemi yapılamaz.");
            else
                sonuc = deger1 / deger2;
        else if(islemTipi.equalsIgnoreCase("Carpma"))
            sonuc = deger1 * deger2;
        else
            System.out.println("Hatalı işlem tipi girdiniz...");
        System.out.println("Sonuc: "+sonuc);
    }
}
