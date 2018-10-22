package mx.iteso.icecreams;

import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;

public class MIiceCream {
    public IceCream createIceCream(final String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryMilkIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleMilkIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoMilkIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaMilkIceCream();
        }
        return null;


    }
}
