package mx.iteso.icecreams;

import mx.iteso.icecreams.IceCream;
import mx.iteso.*;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;
import mx.iteso.icecreams.yoghurt.GuavaYoghurtrIceCream;
import mx.iteso.icecreams.yoghurt.MangoYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.PineappleYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.StrawberryYoghurtIceCream;

public class YiceCream extends IceCreamStore {

    public IceCream createIceCream(final String flavor) {
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