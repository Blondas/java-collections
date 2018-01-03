package com.krisdrum.collections.set;

import com.krisdrum.collections.Product;

import java.util.*;

public class ProductCatalogue implements Iterable<Product> {
    private final SortedSet<Product> products = new TreeSet<>(Product.BY_WEIGHT);

    public void isSupliedBy(Supplier supplier) {
        products.addAll(supplier.products());
    }

    public Set<Product> lightVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.headSet(heaviestLightVanProduct);
    }

    public Set<Product> heavyVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.tailSet(heaviestLightVanProduct);
    }

    public Product findHeaviestLightVanProduct() {
        for (Product product: products) {
            if (product.getWeight() > 20) {
                return product;
            }
        }
        return products.last();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
