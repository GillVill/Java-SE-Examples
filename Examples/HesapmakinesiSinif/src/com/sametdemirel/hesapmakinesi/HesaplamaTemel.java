package com.sametdemirel.hesapmakinesi;

public abstract class HesaplamaTemel {
    private double ilkDeger;
    private double ikinciDeger;
    private double sonuc;

    public double getIlkDeger() {
        return ilkDeger;
    }

    public void setIlkDeger(double ilkDeger) {
        this.ilkDeger = ilkDeger;
    }

    public double getIkinciDeger() {
        return ikinciDeger;
    }

    public void setIkinciDeger(double ikinciDeger) {
        this.ikinciDeger = ikinciDeger;
    }

    public double getSonuc() {
        return sonuc;
    }

    public void setSonuc(double sonuc) {
        this.sonuc = sonuc;
    }

    public HesaplamaTemel(){

    }

    public HesaplamaTemel(double ilkDeger, double ikinciDeger){
        this.ilkDeger = ilkDeger;
        this.ikinciDeger = ikinciDeger;
    }

    public abstract void hesapla();
}
