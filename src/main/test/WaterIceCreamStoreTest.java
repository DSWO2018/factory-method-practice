import mx.iteso.IceCreamStore;
import mx.iteso.WaterIceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class WaterIceCreamStoreTest {
    private IceCreamStore store;
    private IceCream ic;
    @Before
    public void setUp(){
        store = new WaterIceCreamStore();
    }

    @Test
    public void createIceCreamTest() {
        ic = store.createIceCream("Guava");
        assertThat(ic,instanceOf(GuavaWaterIceCream.class));

        ic = store.createIceCream("Strawberry");
        assertThat(ic,instanceOf(StrawberryWaterIceCream.class));

        ic = store.createIceCream("Pineapple");
        assertThat(ic,instanceOf(PineappleWaterIceCream.class));

        ic = store.createIceCream("Mango");
        assertThat(ic,instanceOf(MangoWaterIceCream.class));

        ic = store.createIceCream("Piña con Peras");
        assertEquals(ic,null);
    }
}
