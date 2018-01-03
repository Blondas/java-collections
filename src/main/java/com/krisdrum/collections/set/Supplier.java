package com.krisdrum.collections.set;

import com.krisdrum.collections.Product;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    String name;

    public Supplier(String name) {
        this.name = name;
    }

    ArrayList<Product> products = new ArrayList<>();
    public List<Product> products() {
        return products;
    }
}
