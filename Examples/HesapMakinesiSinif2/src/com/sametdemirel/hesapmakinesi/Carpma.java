package com.sametdemirel.hesapmakinesi;

public class Carpma extends HesaplamaTemel {

    public Carpma(){

    }

    public Carpma(double ilkDeger, double ikinciDeger){
        super(ilkDeger, ikinciDeger);
    }

    @Override
    public void hesapla() {
        double deger = getIlkDeger() * getIkinciDeger();
        setSonuc(deger);
    }
}
