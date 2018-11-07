package com.sametdemirel.koleksiyonlar;

public class Urunler {

    private final String urunAdi;
    private final int urunAgirlik;

    public Urunler(String urunAdi, int urunAgirlik) {
        this.urunAdi = urunAdi;
        this.urunAgirlik = urunAgirlik;
    }

    public String getUrunAdi() { return urunAdi; }

    public int getUrunAgirlik() {
        return urunAgirlik;
    }

    @Override
    public String toString() {
        return "Ürün{"+"Ürün Adı:'"+urunAdi+
                "', Ürün Ağırlığı="+urunAgirlik+"}";
    }
}
