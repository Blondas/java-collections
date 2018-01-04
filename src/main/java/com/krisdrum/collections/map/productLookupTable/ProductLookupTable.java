package com.krisdrum.collections.map.productLookupTable;

import com.krisdrum.collections.Product;

public interface ProductLookupTable {
    public void addProduct(final Product productToAdd);
    public Product lookupById(final int id);
    void clear();
}
