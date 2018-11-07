package com.sametdemirel.koleksiyonlar;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;

import static java.util.Comparator.comparing;

public class Urunler {

    public static final Comparator<Urunler> BY_AGIRLIK = comparing(Urunler::getUrunAgirlik);
    public static final Comparator<Urunler> BY_NAME = comparing(Urunler::getUrunAdi);


    private final String urunAdi;   // Ürünün adı
    private final int urunAgirlik;  // Ürünün ağırlığı

    //Kurucu fonksiyonda ürünün özelliklerini belirliyoruz

    public Urunler(String urunAdi, int urunAgirlik) {
        this.urunAdi = urunAdi;
        this.urunAgirlik = urunAgirlik;
    }

    //Ürünün özelliklerini geri döndüren metotlar

    public String getUrunAdi() {
        return urunAdi;
    }

    public int getUrunAgirlik() {
        return urunAgirlik;
    }

    //Object sınıfından toString metodunu override ediyoruz ürünleri istediğimiz formatta ekrana basabilmek için
    @Override
    public String toString() {

        return "Ürün{" +
                "Ürün Adı:'" + urunAdi +
                "', Ürün Ağırlığı=" + urunAgirlik + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Urunler urunler = (Urunler) o;

        if (urunAgirlik != urunler.urunAgirlik) return false;
        //return urunAdi != null ? urunAdi.equals(urunler.urunAdi) : urunler.urunAdi == null;
        return Objects.equals(urunAdi, urunler.urunAdi);
    }

    @Override
    public int hashCode() {
        /*int result = urunAdi != null ? urunAdi.hashCode() : 0;
        result = 31 * result + urunAgirlik;
        return result;*/
        return Objects.hash(urunAdi, urunAgirlik);
    }
}
