package com.sametdemirel.hesapmakinesi;

public class Toplama extends HesaplamaTemel implements MatematikIslemleri{

    public Toplama(){

    }

    public Toplama(double ilkDeger, double ikinciDeger){
        super(ilkDeger, ikinciDeger);
    }

    @Override
    public void hesapla() {
        double deger = getIlkDeger() + getIkinciDeger();
        setSonuc(deger);
    }

    @Override
    public String getAnahtarKelime() {
        return "Toplama";
    }

    @Override
    public char getSembol() {
        return '+';
    }

    @Override
    public double hesaplamaYap(double ilkDeger, double ikinciDeger) {
        setIlkDeger(ilkDeger);
        setIkinciDeger(ikinciDeger);
        hesapla();
        return getSonuc();
    }
}
