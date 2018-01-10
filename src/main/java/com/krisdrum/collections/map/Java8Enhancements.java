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

        Product result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);
    }
}
