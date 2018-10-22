package mx.iteso;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yoghurt.GuavaYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.MangoYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.PineappleYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.StrawberryYoghurtIceCream;

/**
 * Empty Class.
 */
public class YoghurtIceCreamStore extends IceCreamStore {
    /**
     * Water Creator.
     * @param flavor Sabor del helado.
     * @return helado.
     */
    public final IceCream createIceCream(final String flavor) {

        if (flavor.equals("Strawberry")) {
            return new StrawberryYoghurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYoghurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYoghurtIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaYoghurtIceCream();
        }
        return null;
    }
}
