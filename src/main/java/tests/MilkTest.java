package tests;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;
import mx.iteso.factories.MilkFactory;
import mx.iteso.factories.IceCream;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MilkTest {

    private IceCreamStore iceCreamStore;
    private IceCream icecream;

    @org.junit.Before
    public final void setUp() {
        iceCreamStore = new MilkFactory();
    }

    @org.junit.Test
    public final void createIceCreamCone() {
        icecreamream = iceCreamStore.createIceCreamCone("Guava");
        assertThat(icecreamream, instanceOf(GuavaMilkIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Mango");
        assertThat(icecream, instanceOf(MangoMilkIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Pineapple");
        assertThat(icecream, instanceOf(PineappleMilkIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Strawberry");
        assertThat(icecream, instanceOf(StrawberryMilkIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Chocolate");
        assertEquals(icecream, null);
    }
}