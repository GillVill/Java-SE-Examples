package com.sametdemirel.koleksiyonlar;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements {
    public static void main(String[] args) {

        final Product defaultProduct = new Product(-1,  "Whatever the customer wants",100);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        Product result = idToProduct.getOrDefault(10, defaultProduct);
        //getOrDefault metodu eğer girilen id Map'te varsa değeri getirir yoksa default olarak verilen değeri getirir.
        System.out.println(result); //getOrDefault metodu sayesinde default değer döndürülür
        System.out.println(idToProduct.get(10)); //Fakat getOrDefault metoduyla Map'e ekleme yapılmaz bu nedenle null döner...
        System.out.println();

        Product result1 = idToProduct.replace(1, new Product(1, "Big Door", 50));
        //replace metodu ile ilk olarak id'e ait değer atanır sonrasında id'ye ait değer üzerinde değişiklik yapılır...
        System.out.println(result1); // Bu nedenle result1 1 nolu id'ye sahip değeri barındırır...
        System.out.println(idToProduct.get(1)); // Fakat Map arabiriminde 1 nolu id'nin değeri değişmiş olur...
        System.out.println();

        /* Fakat Map arabiriminde 4 id değeri bulunmadığından dolayı hem result1 hem de idToProduct.get(4) null döndürür...
        Product result1 = idToProduct.replace(4, new Product(1, "Big Door", 50));
        System.out.println(result1);
        System.out.println(idToProduct.get(4));
        System.out.println();*/

        System.out.println(idToProduct);
        idToProduct.replaceAll((id, oldProduct) -> new Product(id, oldProduct.getName(), oldProduct.getWeight()+10));
        System.out.println(idToProduct);
        System.out.println();

        Product result2 = idToProduct
                .computeIfAbsent(10, id -> new Product(id, "Custom Product", 10));
        System.out.println(result2);
        System.out.println(idToProduct.get(10));
        System.out.println();

        System.out.println(idToProduct);
        idToProduct.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
