package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;

public class MilkStore extends IceCreamStore {


    public IceCream orderIceCream(String flavor) {

        if(flavor.equals("Guava"))
            return new GuavaMilkIceCream();

        else if (flavor.equals("Mango"))
            return new MangoMilkIceCream();

        else if(flavor.equals("Pineapple"))
            return new PineappleMilkIceCream();

        else if (flavor.equals("Strawberry"))
            return new StrawberryMilkIceCream();

        else
            return null;
    }
}
