package com.sametdemirel.koleksiyonlar;

import java.util.*;

public class ViewsOverMaps {
    public static void main(String[] args) {

        final Map<Integer, Product> idToProduct = new HashMap<>();

        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        System.out.println(idToProduct);
        System.out.println();

        final Set<Integer> ids = idToProduct.keySet(); // Map'teki id değerlerini almamamızı sağlayan metot keySet()...
        System.out.println(ids);

        ids.remove(1); // Burada Set arabirimindeki 1'i siliyoruz ve bu durumda
                          // hem Set hem de Map arabirimindeki 1 key değerine sahip eleman silinecektir.
        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println();

        // ids.add(4); // Fakat bu ifade hata verir. Çünkü Map'te 4 anahtar değeri ile ilişkilendirilecek
                   // veri yoktur bu yüzden böyle bir ekleme yapabilmemiz söz konusu değildir...

        final Collection<Product> products = idToProduct.values();
        System.out.println(products);
        System.out.println();

        products.remove(ProductFixtures.floorPanel); // remove metotu ile hem Collection hem de Map arabiriminden
                                                    // floorPanel ürününü kaldırıyoruz...
        System.out.println(products);
        System.out.println(idToProduct);
        System.out.println();

        //products.add(ProductFixtures.floorPanel); // Fakat bu ifade hata verir çünkü
                                                   // derleyici floorPanel'i hangi id ile ilişkilendireceğini bilemez.

        final Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
        for (Map.Entry<Integer, Product> entry: entries) {
            System.out.println(entry.getKey() + " -> "+ entry.getValue()); // EntrySet ile Map arabirimindeki key ve value değerlerini alabiliriz
            entry.setValue(ProductFixtures.floorPanel); // Aynı zamanda set metotu ile Map arabiriminde ilişkili id'nin değerini değiştirebiliriz...
        }
        System.out.println(idToProduct);
    }
}
