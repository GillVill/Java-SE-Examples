package com.sametdemirel;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int ilkDeger = 10, ikinciDeger = 15;

        System.out.println("Birinci Deger: " + ilkDeger);
        System.out.println("İkinci Deger: "+ ikinciDeger);

        System.out.println("-------- Method Kullanımından Sonra --------");

        degistir(ilkDeger, ikinciDeger);
        System.out.println("Birinci Deger: " + ilkDeger);
        System.out.println("İkinci Deger: "+ ikinciDeger);
    }
    public static void degistir(int ilkDeger, int ikinciDeger){
        int temp = ilkDeger;
        ilkDeger = ikinciDeger;
        ikinciDeger = temp;
    }
}
