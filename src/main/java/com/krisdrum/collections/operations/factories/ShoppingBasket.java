package com.krisdrum.collections.operations.factories;

import com.krisdrum.collections.Product;
import com.krisdrum.collections.map.viewsOverMaps.ProductFixtures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingBasket {
    private final List<Product> items = new ArrayList<>();
    private int totalWeight = 0;

    public void add(Product product) {
        items.add(product);
        totalWeight += product.getWeight();
    }

    public List<Product> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public String toString() {
        return "ShoppingBasket{" +
                "items=" + items +
                ", totalWeight=" + totalWeight +
                '}';
    }

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        basket.add(ProductFixtures.door);
        System.out.println(basket);

        basket.getItems().add(ProductFixtures.window);
        System.out.println(basket);
    }
}
