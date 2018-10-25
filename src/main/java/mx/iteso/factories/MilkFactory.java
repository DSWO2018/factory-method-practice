package mx.iteso.factories;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;

public class MilkFactory extends IceCreamStore {
    /**
     *
     */
    public final IceCream createIceCreamCone(final String flavor) {
        if (flavor.equals("Guava")) {
            return new GuavaMilkIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoMilkIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleMilkIceCream();
        } else if (flavor.equals("Strawberry")) {
            return new StrawberryMilkIceCream();
        } else {
            return null;
        }
    }
}
