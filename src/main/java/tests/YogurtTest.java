package tests;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.PineappleYogurtIceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;
import mx.iteso.factories.YogurtFactory;
import mx.iteso.factories.IceCream;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class YogurtTest {

    private IceCreamStore iceCreamStore;
    private IceCream icecream;

    @org.junit.Before
    public final void setUp() {
        iceCreamStore = new MilkFactory();
    }

    @org.junit.Test
    public final void createIceCreamCone() {
        icecreamream = iceCreamStore.createIceCreamCone("Guava");
        assertThat(icecreamream, instanceOf(GuavaYogurtIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Mango");
        assertThat(icecream, instanceOf(MangoYogurtIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Pineapple");
        assertThat(icecream, instanceOf(PineappleYogurtIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Strawberry");
        assertThat(icecream, instanceOf(StrawberryYogurtIceCream.class));

        icecream = iceCreamStore.createIceCreamCone("Chocolate");
        assertEquals(icecream, null);
    }
}