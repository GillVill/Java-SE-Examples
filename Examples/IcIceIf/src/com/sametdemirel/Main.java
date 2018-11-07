package com.sametdemirel;

public class Main {

    public static void main(String[] args) {
        float ogrenci = 0.0f, sinif = 4.0f;

        if (ogrenci > 0.0f){
            if (sinif > 0.0f)
            System.out.println("Sınıf Başına Öğrenci Sayısı: "+(ogrenci/sinif));
        }
        else
            System.out.println("Öğrenci Yok");
    }
}
