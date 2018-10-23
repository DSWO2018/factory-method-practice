package mx.iteso.factories;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.yogurt.*;

public class YogurtFactory extends IceCreamStore {


    public final IceCream createIceCreamCone(final String flavor) {
        if (flavor.equals("Guava")) {
            return new GuavaYogurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYogurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYogurtIceCream();
        } else if (flavor.equals("Strawberry")) {
            return new StrawberryYogurtIceCream();
        } else {
            return null;
        }
    }
}
