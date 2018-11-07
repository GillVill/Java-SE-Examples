package com.sametdemirel.koleksiyonlar;

import static com.sametdemirel.koleksiyonlar.UrunlerDemirbas.*;

public class Main {
    public static void main(String args[]){

        Sevkiyat sevkiyat = new Sevkiyat();

        sevkiyat.add(kapi);
        sevkiyat.add(pencere);
        sevkiyat.add(parke);

        sevkiyat.prepare();

        System.out.println("Ağır ürünler: "+sevkiyat.getAgirUrunlerList());
        System.out.println("Hafif ürünler:"+sevkiyat.getHafifUrunlerList());
    }
}
