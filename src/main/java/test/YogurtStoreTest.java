package test;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.PinnapleYogurtIceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;
import mx.iteso.stores.YogurtStore;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/****/
public class YogurtStoreTest {
    /****/
    private IceCreamStore iceCreamStore;
    /****/
    private IceCream iceCream;

    /****/
    @org.junit.Before
    public final void setUp() {
        iceCreamStore = new YogurtStore();
    }

    /****/
    @org.junit.Test
    public final void createIceCreamCone() {
        iceCream = iceCreamStore.createIceCreamCone("Guava");
        assertThat(iceCream, instanceOf(GuavaYogurtIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Mango");
        assertThat(iceCream, instanceOf(MangoYogurtIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Pineapple");
        assertThat(iceCream, instanceOf(PinnapleYogurtIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Strawberry");
        assertThat(iceCream, instanceOf(StrawberryYogurtIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Something");
        assertEquals(iceCream, null);
    }

}
