package tests;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;
import mx.iteso.factories.WaterFactory;
import mx.iteso.factories.IceCream;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class WaterTest {

    private IceCreamStore iceCreamStore;
    private IceCream icecream;

    @org.junit.Before
    public final void setUp() {
        iceCreamStore = new WaterFactory();
    }

    @org.junit.Test
    public final void createIceCreamCone() {
        icecreamream = iceCreamStore.createIceCreamCone("Guava");
        assertThat(icecreamream, instanceOf(GuavaWaterIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Mango");
        assertThat(icecream, instanceOf(MangoWaterIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Pineapple");
        assertThat(icecream, instanceOf(PineappleWaterIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Strawberry");
        assertThat(icecream, instanceOf(StrawberryWaterIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Chocolate");
        assertEquals(icecream, null);
    }
}