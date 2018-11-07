package com.sametdemirel.hesapmakinesi;

public class Bolme extends HesaplamaTemel {

    public Bolme(){

    }

    public Bolme(double ilkDeger, double ikinciDeger){
        super(ilkDeger, ikinciDeger);
    }

    @Override
    public void hesapla() {
        /*double deger;
        if(getIkinciDeger() != 0)
            deger = getIlkDeger() / getIkinciDeger();
        else
            deger = 0.0d;*/

        double deger  = getIkinciDeger() != 0.0d ? getIlkDeger() / getIkinciDeger() : 0.0d;

        setSonuc(deger);
    }
}
