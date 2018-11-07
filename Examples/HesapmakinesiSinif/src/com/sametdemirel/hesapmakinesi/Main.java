package com.sametdemirel.hesapmakinesi;

public class Main {

    public static void main(String[] args) {

        Hesaplama[] hesaplamalar = new Hesaplama[4];
        hesaplamalar[0] = new Hesaplama("Bolme", 100.0d, 50.0d);
        hesaplamalar[1] = new Hesaplama("Toplama", 95.0d, 22.0d);
        hesaplamalar[2] = new Hesaplama("Cikarma", 225.0d, 17.0d);
        hesaplamalar[3] = new Hesaplama("Carpma", 11.0d, 3.0d);

        //hesaplamalar[0] = olustur(100.0d,50.0d, "Bolme");
        //hesaplamalar[1] = olustur(95.0d, 22.0d, "Toplama");
        //hesaplamalar[2] = olustur(225.0d, 17.0d, "Cikarma");
        //hesaplamalar[3] = olustur(11.0d, 3.0d, "Carpma");

        for (Hesaplama hesaplama : hesaplamalar
                ) {
            hesaplama.hesapla();
            System.out.println("Sonuc: " + hesaplama.getSonuc());
        }

        System.out.println();
        System.out.println("Overload Metot Kullanıyoruz");
        System.out.println();

        Hesaplama hesaplamaOverload = new Hesaplama("Bolme");

        double ilkDegerDouble = 9.0d, ikinciDegerDouble = 4.0d;
        int ilkDegerInteger = 9, ikinciDegerInterger = 4;

        hesaplamaOverload.hesapla(ilkDegerDouble, ikinciDegerDouble);
        System.out.println("Overload Double Parametreli Sonuc: " + hesaplamaOverload.getSonuc());

        // Burada int otomatik olarak double'a dönüştürülecektir
        // Daha sonra int parametre alan bir metot daha yazdık o yüzden o metot çağırılır ve sonuç int olarak yazılır.
        hesaplamaOverload.hesapla(ilkDegerInteger, ikinciDegerInterger);
        System.out.println("Overload Integer Parametreli Sonuc: " +hesaplamaOverload.getSonuc());

        //Burada Integer olan ilk değer double'a cast edildiğinden dolayı sistem
        // otamatik olarak ikinci değeri de double'a cast edip double parametreli hesapla fonksiyonunu çalıştırır
        hesaplamaOverload.hesapla((double) ilkDegerInteger, ikinciDegerInterger);
        System.out.println("Sonuc: " +hesaplamaOverload.getSonuc());

        //hesaplamalar[0].ilkDeger = 100.0d;
        //hesaplamalar[0].ikinciDeger = 50.0d;
        //hesaplamalar[0].islemTipi = "Bolme";

        System.out.println();
        System.out.println("Kalıtım Kullanarak Dört İşlem...");

        HesaplamaTemel[] hesaplamaKalitim = {new Toplama(10,5),
        new Cikarma(18,8),
        new Carpma(11,3),
        new Bolme(15,0)};

        /* Normal For Döngüsü
        for(int i=0; i<hesaplamaKalitim.length; i++){
            hesaplamaKalitim[i].hesapla();
            System.out.println("Sonuc: "+ hesaplamaKalitim[i].getSonuc());
        }*/

        // For-each döngüsü
        for (HesaplamaTemel hesaplamaKalitimIterator:hesaplamaKalitim
             ) {
            hesaplamaKalitimIterator.hesapla();
            System.out.println("Sonuc: " + hesaplamaKalitimIterator.getSonuc());
        }


    }
    public static Hesaplama olustur(double gelenIlkDeger, double gelenIkinciDeger, String gelenIslemTipi){
        Hesaplama hesaplama = new Hesaplama();

        //hesaplama.ilkDeger = gelenIlkDeger;
        //hesaplama.ikinciDeger = gelenIkinciDeger;
        //hesaplama.islemTipi = gelenIslemTipi;

        hesaplama.setIlkDeger(gelenIlkDeger);
        hesaplama.setIkinciDeger(gelenIkinciDeger);
        hesaplama.setIslemTipi(gelenIslemTipi);

        return hesaplama;
    }
}
