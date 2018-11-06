package com.sametdemirel.koleksiyonlar;

import java.util.Comparator;

public class Urunler {
    public static final Comparator<Urunler> BY_AGIRLIK = new Comparator<Urunler>() {
        @Override
        public int compare(Urunler urun1, Urunler urun2) {
            return Integer.compare(urun1.getUrunAgirlik(), urun2.getUrunAgirlik());
        }
    };
    private final String urunAdi;
    private final int urunAgirlik;

    public Urunler(String urunAdi, int urunAgirlik) {
        this.urunAdi = urunAdi;
        this.urunAgirlik = urunAgirlik;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public int getUrunAgirlik() {
        return urunAgirlik;
    }

    @Override
    public String toString() {
        return "Ürün{"+"Ürün Adı:'"+urunAdi+
                "', Ürün Ağırlığı="+urunAgirlik+"}";
    }
}
