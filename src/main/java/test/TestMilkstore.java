package test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;
import mx.iteso.stores.Milkstore;

/**
 *
 */
public class TestMilkstore {
    /**
     *
     **/
     private IceCreamStore iceCreamStore;
     /**
     *
     */
    private IceCream iceCream;

    /**
     *
     **/
    @org.junit.Before
    public final void setUp() {
        iceCreamStore = new Milkstore();
    }

    /**
     *
     **/
    @org.junit.Test
    public final void createIceCreamCone() {
        iceCream = iceCreamStore.createIceCreamCone("Guava");
        assertThat(iceCream, instanceOf(GuavaMilkIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Mango");
        assertThat(iceCream, instanceOf(MangoMilkIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Pineapple");
        assertThat(iceCream, instanceOf(PineappleMilkIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Strawberry");
        assertThat(iceCream, instanceOf(StrawberryMilkIceCream.class));

        iceCream = iceCreamStore.createIceCreamCone("Something");
        assertEquals(iceCream, null);
    }

}
