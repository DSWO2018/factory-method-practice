import mx.iteso.IceCreamStore;
import mx.iteso.MilkIceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MilkIceCreamStoreTest {
    private IceCreamStore store;
    private IceCream ic;
    @Before
    public void setUp(){
        store = new MilkIceCreamStore();
    }

    @Test
    public void createIceCreamTest() {
        ic = store.createIceCream("Guava");
        assertThat(ic,instanceOf(GuavaMilkIceCream.class));

        ic = store.createIceCream("Strawberry");
        assertThat(ic,instanceOf(StrawberryMilkIceCream.class));

        ic = store.createIceCream("Pineapple");
        assertThat(ic,instanceOf(PineappleMilkIceCream.class));

        ic = store.createIceCream("Mango");
        assertThat(ic,instanceOf(MangoMilkIceCream.class));

        ic = store.createIceCream("Piña con Peras");
        assertEquals(ic,null);
    }
}
