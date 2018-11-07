package com.sametdemirel.koleksiyonlar;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeUrunKatalog implements Iterable<Urunler> {

    public static final double HAFIF_URUN_AZAMI_AGIRLIK = 20;

    private final SortedSet<Urunler> urunler = new TreeSet<>(Urunler.BY_AGIRLIK);
    private final SortedSet<Urunler> urunlerIsimSırali = new TreeSet<>(Urunler.BY_NAME);

    public void tedarikEden(Tedarikci tedarikci){
        urunler.addAll(tedarikci.getUrunler());
        urunlerIsimSırali.addAll(tedarikci.getUrunler());
    }

    @Override
    public Iterator<Urunler> iterator() {
        return urunler.iterator();
    }

    public SortedSet<Urunler> getUrunlerIsimSırali() {
        return urunlerIsimSırali;
    }

    public SortedSet<Urunler> hafifUrunler() {
        Urunler enHafifUrun = enHafifUrunBul();
        return urunler.headSet(enHafifUrun);
    }

    public SortedSet<Urunler> agirUrunler() {
        Urunler enHafifUrun = enHafifUrunBul();
        return urunler.tailSet(enHafifUrun);
    }

    private Urunler enHafifUrunBul() {
        for(Urunler urun : urunler){
            if(urun.getUrunAgirlik()> HAFIF_URUN_AZAMI_AGIRLIK){
                return urun;
            }
        }
        return urunler.last();
    }
}
