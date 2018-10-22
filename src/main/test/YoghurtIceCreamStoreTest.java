import mx.iteso.IceCreamStore;
import mx.iteso.YoghurtIceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yoghurt.GuavaYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.MangoYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.PineappleYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.StrawberryYoghurtIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class YoghurtIceCreamStoreTest {
    private IceCreamStore store;
    private IceCream ic;
    @Before
    public void setUp(){
        store = new YoghurtIceCreamStore();
    }

    @Test
    public void createIceCreamTest() {
        ic = store.createIceCream("Guava");
        assertThat(ic,instanceOf(GuavaYoghurtIceCream.class));

        ic = store.createIceCream("Strawberry");
        assertThat(ic,instanceOf(StrawberryYoghurtIceCream.class));

        ic = store.createIceCream("Pineapple");
        assertThat(ic,instanceOf(PineappleYoghurtIceCream.class));

        ic = store.createIceCream("Mango");
        assertThat(ic,instanceOf(MangoYoghurtIceCream.class));

        ic = store.createIceCream("Piña con Peras");
        assertEquals(ic,null);
    }
}
