package com.sametdemirel.hesapmakinesi;

public class Cikarma extends HesaplamaTemel {

    public Cikarma(){

    }

    public Cikarma(double ilkDeger, double ikinciDeger){
        super(ilkDeger, ikinciDeger);
    }

    @Override
    public void hesapla() {
        double deger = getIlkDeger() - getIkinciDeger();
        super.setSonuc(deger);
    }
}
