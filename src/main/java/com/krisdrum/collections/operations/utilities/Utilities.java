package com.krisdrum.collections.operations.utilities;

import com.krisdrum.collections.Product;
import com.krisdrum.collections.map.viewsOverMaps.ProductFixtures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilities {
    public static void main(String[] args) {
        Product door = ProductFixtures.door;
        Product floorPanel = ProductFixtures.floorPanel;
        Product window = ProductFixtures.window;

        // addAll
        List<Product> products = new ArrayList<>();
        Collections.addAll(products, door, floorPanel, window);
        System.out.println(products);

        // min, max:
        final Product min = Collections.min(products, Product.BY_NAME);
        System.out.println(min);
        final Product max = Collections.min(products, Product.BY_WEIGHT);
        System.out.println(max);

    }
}
