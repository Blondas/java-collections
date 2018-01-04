package com.krisdrum.collections;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

public class Product {
    private final int id;
    private final String name;
    private final int weight;

    public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);
    public static final Comparator<Product> BY_NAME = comparing(Product::getName);

    public Product(String name, int weight) {
        id = -1;
        this.name = name;
        this.weight = weight;
    }

    public Product(final int id, final String name, final int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
        return Objects.equals(name, weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
