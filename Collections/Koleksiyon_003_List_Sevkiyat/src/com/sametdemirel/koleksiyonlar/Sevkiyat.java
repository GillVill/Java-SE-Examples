package com.sametdemirel.koleksiyonlar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sevkiyat implements Iterable<Urunler>{

    public static final int URUN_YOKSA = -1;
    public static final int HAFIF_URUNLER_AZAMI_AGIRLIK = 20;

    private final List<Urunler> urunlerList = new ArrayList<>();
    private List<Urunler> hafifUrunlerList;
    private List<Urunler> agirUrunlerList;

    public void add(Urunler urun){
        urunlerList.add(urun);
    }

    public void replace(Urunler eskiUrun, Urunler yeniUrun){
        int indeks = urunlerList.indexOf(eskiUrun);
        if(indeks != URUN_YOKSA){
            urunlerList.set(indeks, yeniUrun);
        }
    }

    public void prepare(){
        urunlerList.sort(Urunler.BY_AGIRLIK);

        int ayirmaNoktası = ayirmaNoktasıBul();

        hafifUrunlerList = urunlerList.subList(0, ayirmaNoktası);
        agirUrunlerList = urunlerList.subList(ayirmaNoktası, urunlerList.size());
    }

    private int ayirmaNoktasıBul() {
        
        for(int i=0; i<urunlerList.size(); i++){
            final Urunler urun = urunlerList.get(i);
            if(urun.getUrunAgirlik()> HAFIF_URUNLER_AZAMI_AGIRLIK){
                return i;
            }
        }
        return urunlerList.size();
    }

    public List<Urunler> getHafifUrunlerList() {
        return hafifUrunlerList;
    }

    public List<Urunler> getAgirUrunlerList() {
        return agirUrunlerList;
    }

    @Override
    public Iterator<Urunler> iterator() {
        return urunlerList.iterator();
    }
}
