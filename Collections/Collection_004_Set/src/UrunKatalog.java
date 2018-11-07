package com.sametdemirel.koleksiyonlar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Burada Urunler sınıfını implement ediyoruz ürünleri dolaşabilmek için
public class UrunKatalog implements Iterable<Urunler>{

    private final Set<Urunler> urunler = new HashSet<>(); //Burada tedarikçilerden gelen ürünleri Set'e atıyoruz.
    // Farklı kullanıcılardan aynı ürünler gelebileceği için Set kullanıyoruz.

    public Set<Urunler> getUrunler() {
        return urunler;
    }

    //Bu metod sayesinde tedarikçilerdeki ürünleri Set'e ekliyoruz...
    public void tedarikEden(Tedarikci tedarikci){
        urunler.addAll(tedarikci.getUrunler());
    }

    @Override
    public Iterator<Urunler> iterator() {
        return urunler.iterator();
    }
}
