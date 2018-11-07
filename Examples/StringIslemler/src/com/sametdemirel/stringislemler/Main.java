package com.sametdemirel.stringislemler;

public class Main {

    public static void main(String[] args) {

        String cumle = "Benim adım Samet Demirel";

        System.out.println(cumle);
        System.out.println(cumle.toUpperCase());

        int ilkBosluk = cumle.indexOf(" ");
        String ilkKelime = cumle.substring(0, ilkBosluk);

        int sonBosluk = cumle.lastIndexOf(" ");
        String sonKelime = cumle.substring(sonBosluk);

        System.out.println("İlk Kelime: "+ ilkKelime);
        System.out.println("Son Kelime: "+ sonKelime);

        System.out.println("Cümledeki 8. Karakter: "+ cumle.charAt(9));
    }
}
