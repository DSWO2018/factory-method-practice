package mx.iteso.factories;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;

public class WaterFactory extends IceCreamStore {
    /**
     *
     */
    public final IceCream createIceCreamCone(final String flavor) {
        if (flavor.equals("Guava")) {
            return new GuavaWaterIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoWaterIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleWaterIceCream();
        } else if (flavor.equals("Strawberry")) {
            return new StrawberryWaterIceCream();
        } else {
            return null;
        }
    }
}
