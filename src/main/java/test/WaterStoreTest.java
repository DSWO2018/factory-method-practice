package test;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;
import mx.iteso.stores.WaterStore;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/****/
public class WaterStoreTest {
    /****/
    private IceCreamStore iceCreamStore;
    /****/
    private IceCream iceCream;

    /****/
    @org.junit.Before
    public final void setUp() {
        iceCreamStore = new WaterStore();
    }

    /****/
    @org.junit.Test
    public final void createIceCreamCone() {
        iceCream = iceCreamStore.createIceCreamCone("Guava");
        assertThat(iceCream, instanceOf(GuavaWaterIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Mango");
        assertThat(iceCream, instanceOf(MangoWaterIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Pineapple");
        assertThat(iceCream, instanceOf(PineappleWaterIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Strawberry");
        assertThat(iceCream, instanceOf(StrawberryWaterIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Something");
        assertEquals(iceCream, null);
    }
}
