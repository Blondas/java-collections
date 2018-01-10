package com.krisdrum.collections.map;

import com.krisdrum.collections.Product;
import com.krisdrum.collections.map.viewsOverMaps.ProductFixtures;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements {

    public static void main(String[] args) {
        final Product defaultProduct = new Product(-1, "whatever the customer wants", 100);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        // getOrDefault:
        Product result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);

        // replace:
        Product result1 = idToProduct.replace(1, new Product("Big Door", 50));
        System.out.println(result1);
        System.out.println(idToProduct.get(1));

        //  replaceAll:
        idToProduct.replaceAll((id, oldProduct) ->
            new Product(id, oldProduct.getName(), oldProduct.getWeight() + 10));

        System.out.println(idToProduct);

        // computeIfAbsent:
        Product result2 = idToProduct.computeIfAbsent(10, (id) -> new Product(id, "CustomProduct", 10));
        System.out.println(result2);

        // forEach:

        idToProduct.forEach((key, value) ->
                System.out.println(key + " -> " + value)
        );
    }
}
