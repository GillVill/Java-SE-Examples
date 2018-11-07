package com.sametdemirel.hesapmakinesi;

public class KuvvetAl implements MatematikIslemleri{

    @Override
    public String getAnahtarKelime() {
        return "KuvvetAl";
    }

    @Override
    public char getSembol() {
        return '^';
    }

    @Override
    public double hesaplamaYap(double ilkDeger, double ikinciDeger) {
        return Math.pow(ilkDeger, ikinciDeger);
    }
}
