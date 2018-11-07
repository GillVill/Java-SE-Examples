package com.sametdemirel.hesapmakinesi;

public class Toplama extends HesaplamaTemel {

    public Toplama(){

    }

    public Toplama(double ilkDeger, double ikinciDeger){
        super(ilkDeger, ikinciDeger);
    }

    @Override
    public void hesapla() {
        double deger = getIlkDeger() + getIkinciDeger();
        super.setSonuc(deger);
    }
}
