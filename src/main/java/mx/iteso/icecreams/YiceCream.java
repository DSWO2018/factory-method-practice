package mx.iteso.icecreams;

import mx.iteso.IceCreamStore;

import mx.iteso.icecreams.yoghurt.GuavaYoghurtrIceCream;
import mx.iteso.icecreams.yoghurt.MangoYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.PineappleYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.StrawberryYoghurtIceCream;

/**
 * clase yicecream.
 */
public class YiceCream extends IceCreamStore {
    /**
     * crear helado.
     * @param flavor .
     * @return     */
    public final IceCream createIceCream(final String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryYoghurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYoghurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYoghurtIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaYoghurtrIceCream();
        }
        return null;


    }
}
