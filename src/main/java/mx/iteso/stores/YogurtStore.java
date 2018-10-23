package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.PinneaokeYogurtIceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;

public class YogurtStore extends IceCreamStore {

    public IceCream orderIceCream(String flavor) {

        if (flavor.equals("Guava"))
            return new GuavaYogurtIceCream();

        else if (flavor.equals("Mango"))
            return new MangoYogurtIceCream();

        else if (flavor.equals("Pineapple"))
            return new PinneaokeYogurtIceCream();

        else if (flavor.equals("Strawberry"))
            return new StrawberryYogurtIceCream();

        else
            return null;
    }
}
