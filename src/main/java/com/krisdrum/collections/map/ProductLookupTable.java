package com.krisdrum.collections.map;

import com.krisdrum.collections.Product;

public interface ProductLookupTable {
    public void addProduct(final Product productToAdd);
    public Product lookupById(final int id);
    void clear();
}
