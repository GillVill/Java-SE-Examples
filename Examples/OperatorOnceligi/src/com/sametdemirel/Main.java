package com.sametdemirel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int deger1 = 21;
        int deger2 = 6;
        int deger3 = 3;
        int deger4 = 1;

        int sonuc1 = deger1 - deger2 / deger3;
        int sonuc2 = (deger1 - deger2) / deger3;

        System.out.println("Parantezsiz Sonuc: " + sonuc1);
        System.out.println("Parantezli Sonuc: " + sonuc2);

        int sonuc3 = deger1 / deger3 * deger4 + deger2;
        int sonuc4 = deger1 / (deger3 * (deger4 +deger2));

        System.out.println("Parantezsiz Sonuc3: " + sonuc3);
        System.out.println("Parantezli Sonuc4: " + sonuc4);

    }
}
