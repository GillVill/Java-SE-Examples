package com.sametdemirel.benimuygulamam;

import com.sametdemirel.hesapmakinesi.*;

public class Main {
    public static void main(String[] args) {

        //hesaplamaYardimcikullan();

        String[] ifadeler = {
                "Toplama 92.0 25.0", // 92.0 + 25.0 = 117.0
                "KuvvetAl 5.0 2.0" // 5.0 ^ 2.0 = 25.0
        };

        DinamikYardimci dinamikYardimci = new DinamikYardimci(new MatematikIslemleri[] {new Toplama(), new KuvvetAl()});
        for (String ifade: ifadeler
             ) {
            String cikti = dinamikYardimci.islem(ifade);
            System.out.println(cikti);
        }
    }
    static void hesaplamaYardimcikullan(){
        String[] ifadeler = {
                "Toplama 1.0", //Hata: Eksik deger(ikinci deger yok)
                "Toplama xx 25.0", //Hata: Numerik olmayan karakter(xx)
                "ToplamaX 0.0 0.0", //Hata: Geçersiz işlem tipi
                "Toplama 12.0 8.0", // 12.0 + 8.0 = 20.0
                "Cikarma 25.0 30.0", // 25.0 - 30.0 = - 5.0
                "Carpma 33.0 3.0", // 33.0 * 3.0 = 99.0
                "Bolme 100.0 50.0" // 100.0 / 50.0 = 2
        };
        HesaplamaYardimci hesaplayici = new HesaplamaYardimci();

        for (String ifade: ifadeler
                ) {
            try {
                hesaplayici.islem(ifade);
                System.out.println(hesaplayici);
            } catch (GecersizIfadeException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println(" Asıl Hata: " + e.getCause().getMessage());
            }
        }
    }
}
