package com.krisdrum.collections.set;

import org.junit.Test;
import set.ProductCatalogue;

import static com.krisdrum.collections.ProductFixtures.door;
import static com.krisdrum.collections.ProductFixtures.floorPanel;
import static com.krisdrum.collections.SupplierFixture.bobs;
import static com.krisdrum.collections.SupplierFixture.kates;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class ProductCatalogueTest {
    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception {
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSupliedBy(bobs);
        catalogue.isSupliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel));
    }
}
