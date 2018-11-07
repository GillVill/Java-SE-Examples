package com.sametdemirel.koleksiyonlar;

public class UrunlerDemirbas {

    // Burada Ürünleri ve tedarikçileri oluşturuyoruz...

    public static Urunler kapi = new Urunler("Kapı", 35);
    public static Urunler parke = new Urunler("Parke", 25);
    public static Urunler pencere = new Urunler("Pencere",10);

    public static Tedarikci samet = new Tedarikci("Samet'in şirketi");
    public static Tedarikci aysenur = new Tedarikci("Ayşenur'un şirketi");

    //Burada tedarikçilerin tedarik ettiği ürünleri ekliyoruz...
    static {
        samet.getUrunler().add(kapi);
        samet.getUrunler().add(parke);

        aysenur.getUrunler().add(parke);
        aysenur.getUrunler().add(new Urunler("Pencere",10));
    }
}
