package com.krisdrum.collections.list;

import com.krisdrum.collections.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private List<Product> products = new ArrayList<>();

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {
        //todo
    }

    public List<Product> getLightVanProducts() {
        return null;
    }

    public List<Product> getHeavyVanProducts() {
        return null;
    }
}
