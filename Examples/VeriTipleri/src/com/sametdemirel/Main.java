package com.sametdemirel;

public class Main {

    public static void main(String[] args) {
        float floatDeger = 1.0f;
        double doubleDeger = 4.0d;
        byte byteDeger = 7;
        short shortDeger = 7;
        long longDeger = 5;

        /*short sonuc1 = byteDeger; Byte shorttan daha az veri kapladığı için otomatik dönüştürülür*/
        /*short sonuc1 = longDeger; Long shorttan daha büyük veri tipi olduğu için cast operatörü kullanmak zorundayız*/
        short sonuc1 = (short) longDeger;
        System.out.println(sonuc1);

        /* short sonuc2 = byteDeger - longDeger; Veri tipleri birbiriyle uyuşmadığı için çıkarma işlemi yapılamaz*/
        short sonuc2 = (short) (byteDeger - longDeger); //Burada byte değer ifadesini otomatik olarak long yapar ve çıkarma işleminden sonra longu shorta dönüştürür
        System.out.println(sonuc2);

        /* long sonuc3 = longDeger - floatDeger; Burada sonucun float tipinde olması gerekiyor*/
        /* long sonuc3 = (long) (longDeger - floatDeger); Çıkarma işleminin sonucu float veritipinde, sonucu longa çeviriyoruz.  */
        /*float sonuc3 = longDeger - floatDeger;*/
        double sonuc3 = longDeger - doubleDeger;
        long sonuc4 = (long)(shortDeger - longDeger + floatDeger +doubleDeger);
    }
}
