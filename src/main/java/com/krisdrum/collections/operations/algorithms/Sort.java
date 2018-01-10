package com.krisdrum.collections.operations.algorithms;

import com.krisdrum.collections.Product;
import com.krisdrum.collections.map.viewsOverMaps.ProductFixtures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.door);
        products.add(ProductFixtures.floorPanel);
        products.add(ProductFixtures.window);

        System.out.println(products);

        Collections.sort(products, Product.BY_NAME);
        System.out.println(products);

        Collections.sort(products, Product.BY_WEIGHT);
        System.out.println(products);
    }
}
