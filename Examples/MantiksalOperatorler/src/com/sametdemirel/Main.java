package com.sametdemirel;

public class Main {

    public static void main(String[] args) {
	    int ogrenciler = 150, sinif = 0;

	    /* Burada sıfıra bölme hatası verir çünkü ikinci koşul da inceleneceği için 0'a bölme işlemi yapılamaz.
	    if(sinif > 0 & ogrenciler/sinif >0){

	        System.out.println("Sınıf kalabalık...");
        }*/
	    /* Burada ilk koşul gerçekleştirilemediği için derleme hatası verecektir. Çünkü 0'a bölme işlemi yapılamaz.
        if(ogrenciler/sinif > 0 && sinif >0){

            System.out.println("Sınıf kalabalık...");
        }*/

	    //Burada ilk koşul yanlış olduğu için ikinci koşul incelenmeyecek ve hata üretilmeyecektir.
        if(sinif > 0 && ogrenciler/sinif >0){

            System.out.println("Sınıf kalabalık...");
        }

    }
}
