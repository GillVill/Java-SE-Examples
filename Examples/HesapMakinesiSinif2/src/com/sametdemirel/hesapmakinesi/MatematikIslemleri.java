package com.sametdemirel.hesapmakinesi;

public interface MatematikIslemleri {
    String AYIRICI = " ";
    String getAnahtarKelime(); //Toplama
    char getSembol(); // +
    double hesaplamaYap(double ilkDeger, double ikinciDeger);

}
