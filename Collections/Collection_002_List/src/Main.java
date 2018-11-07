package com.sametdemirel.koleksiyonlar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Kapı, parke ve pencere ürünleri oluşturuluyor...
        Urunler kapi = new Urunler("Kapı", 35);
        Urunler parke = new Urunler("Laminat Parke", 25);
        Urunler pencere = new Urunler("Pencere", 10);
        Urunler kapiKolu = new Urunler("Kapı Kolu", 5);
        Urunler sandalye = new Urunler("Sandalye", 20);

        Collection<Urunler> urunlerListesi = new ArrayList<>();
        urunlerListesi.add(kapi); //Kapı listeye ekleniyor
        urunlerListesi.add(parke); //Parke listeye ekleniyor
        urunlerListesi.add(pencere); //Pencere listeye ekleniyor
        urunlerListesi.add(kapiKolu); // Kapı kolu listeye ekleniyor
        urunlerListesi.add(sandalye); // Sandalye listeye ekleniyor

        System.out.println(urunlerListesi); //Liste ekrana yazdırılıyor...

        // Ürün adı ile silmek için kullanıcıdan ürün adı alabiliriz...
        /*Scanner tara = new Scanner(System.in);
        System.out.println("Silenecek ürünün adını giriniz: ");
        String silinecekUrun = tara.nextLine();*/

        //Listeyi dolaşacak bir iteratör tanımlanıyor...
        Iterator<Urunler> urunListesiIterator = urunlerListesi.iterator();
        //hasNext() fonksiyonu listede eleman olup olmadığını kontrol eder, eğer dolaşacak eleman varsa devam eder yoksa döngü sonlanır
        while(urunListesiIterator.hasNext()){
            Urunler urun = urunListesiIterator.next(); //Listedeki elemanlar alınıyor
            if(urun.getUrunAgirlik() > 20){
                System.out.println(urun); //Ağırlığı 20'den büyük olan ürünler ekrana basılıyor...
            }
            else{
                urunListesiIterator.remove(); //Ağırlığı 20'den az olan ürünler listeden çıkarılıyor...
            }
            /*if(urun.getUrunAdi().equalsIgnoreCase(silinecekUrun)){
                urunListesiIterator.remove();
            }*/
            //System.out.println(urun); //Ürünler teker teker ekrana basılıyor
        }
        System.out.println(urunlerListesi); //Ürünler yazdırılıyor...

        System.out.println(urunlerListesi.size()); //Listenin boyutu yazdırılıyor...
        System.out.println(urunlerListesi.isEmpty()); //Listede eleman var mı yok mu? Varsa false yoksa true döndürecek...

        System.out.println(urunlerListesi.contains(kapi)); //Listede kapı varsa true dönecek yoksa false
        System.out.println(urunlerListesi.contains(pencere)); //Listede pencere varsa true dönecek yoksa false

        Collection<Urunler> digerUrunler = new ArrayList<>();
        digerUrunler.add(pencere);
        digerUrunler.add(kapi);

        urunlerListesi.removeAll(digerUrunler); //digerUrunler listesindeki elemanlar urunlerListesi listesinden kaldıırlıyor
        //urunlerListesi.removeAll(pencere); //Pencere tek bir eleman bu method parametre olarak bir koleksiyon ister...
        urunlerListesi.remove(pencere);
        System.out.println(urunlerListesi);
        //Aynı işlemi foreach döngüsü kullanarak da gerçekleştirebiliriz... Fakat foreach döngüsüyle aynı anda silme işlemi yapamayız...
        /*System.out.println(); System.out.println("Foreach döngüsüyle yazıyoruz...."); System.out.println();
        for (Urunler urun: urunlerListesi
             ) {
            System.out.println(urun);
        }*/
    }
}
