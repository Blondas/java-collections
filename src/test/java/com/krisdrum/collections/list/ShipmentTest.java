package com.krisdrum.collections.list;

import org.junit.Test;

import static com.krisdrum.collections.ProductFixtures.door;
import static com.krisdrum.collections.ProductFixtures.window;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class ShipmentTest {
    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception {
        shipment.add(door);
        shipment.add(window);

        assertThat(shipment, contains(door, window));
    }
}
