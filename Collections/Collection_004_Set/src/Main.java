package com.sametdemirel.koleksiyonlar;

import static com.sametdemirel.koleksiyonlar.UrunlerDemirbas.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UrunKatalog urunKatalog = new UrunKatalog(); //UrunKatalog sınıfından bir nesne türetiyoruz...

        System.out.println(samet); // Samet adındaki tedarikçiden elde edilen ürünleri inceleyebiliriz.
        urunKatalog.tedarikEden(samet); //Urunkatalog'a samet adındaki tedarikçiden tedarik edilen ürünleri ekliyoruz
        System.out.println(urunKatalog.getUrunler()); //Ürünleri ekrana bastırıyoruz

        System.out.println();

        System.out.println(aysenur);
        urunKatalog.tedarikEden(aysenur); //urunKatalog'a ayşenur adındaki tedarikçiden tedarik edilen ürünleri ekliyoruz
        System.out.println(urunKatalog.getUrunler()); // Ürünleri listeliyoruz. Ayşenur ve samet'ten parke ortak olarak tedarik ediliyor fakat ürünler listelenirken tek bir ürün yazılıyor.

        System.out.println();

        TreeUrunKatalog treeUrunKatalog = new TreeUrunKatalog();

        treeUrunKatalog.tedarikEden(samet);
        treeUrunKatalog.tedarikEden(aysenur);

        System.out.println(treeUrunKatalog.hafifUrunler());
        System.out.println(treeUrunKatalog.agirUrunler());
        System.out.println(treeUrunKatalog.getUrunlerIsimSırali());
    }
}
