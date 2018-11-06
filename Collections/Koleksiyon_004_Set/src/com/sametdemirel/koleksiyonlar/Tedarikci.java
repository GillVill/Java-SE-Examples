package com.sametdemirel.koleksiyonlar;

import java.util.ArrayList;
import java.util.List;

public class Tedarikci {

    private final String tedarikciAdı; //Tedarikçinin ismi...
    private final List<Urunler> urunler = new ArrayList<>(); //Tedarikçinin tedarik ettiği ürünlerin listesi...

    public Tedarikci(String tedarikciAdı) {
        this.tedarikciAdı = tedarikciAdı;
    }

    public String getTedarikciAdı() {
        return tedarikciAdı;
    }

    //Tedarikçinin bize tedarik ettiği ürünleri listeliyoruz...
    public List<Urunler> getUrunler() {
        return urunler;
    }

    // İstediğimiz formatta yazabilmek için toString metodunu override ediyoruz...
    @Override
    public String toString() {
        return "Tedarikçi{" +
                "Tedarikçi Adı:'" + tedarikciAdı +
                "', Ürünler: " + urunler + "}";
    }
}

