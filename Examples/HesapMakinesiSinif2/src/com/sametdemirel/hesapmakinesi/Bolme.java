package com.sametdemirel.hesapmakinesi;

public class Bolme extends HesaplamaTemel {

    public Bolme(){

    }

    public Bolme(double ilkDeger, double ikinciDeger){
        super(ilkDeger, ikinciDeger);
    }

    @Override
    public void hesapla() {
        double deger = getIkinciDeger() != 0 ? getIlkDeger() /getIkinciDeger() : 0.0d;
        setSonuc(deger);
    }
}
