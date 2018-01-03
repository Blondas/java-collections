package com.krisdrum.collections;

import set.Supplier;

import static com.krisdrum.collections.ProductFixtures.door;
import static com.krisdrum.collections.ProductFixtures.floorPanel;
import static com.krisdrum.collections.ProductFixtures.window;

public class SupplierFixture {
    public static Supplier bobs = new Supplier("Bob's household goods");
    public static Supplier kates = new Supplier("Kate's household goods");

    static {
        bobs.products().add(door);
        bobs.products().add(floorPanel);
        bobs.products().add(window);

        kates.products().add(floorPanel);
        kates.products().add(door);
        kates.products().add(window);
    }
}
