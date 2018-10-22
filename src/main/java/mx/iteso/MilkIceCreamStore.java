package mx.iteso;

import mx.iteso.icecreams.*;
import mx.iteso.icecreams.milk.*;

public class MilkIceCreamStore {
    public IceCream createMilkIceCream(String flavor){

        if(flavor.equals("Strawberry")){
            return new StrawberryMilkIceCream();
        } else if (flavor.equals("Pineapple")){
            return new PineappleMilkIceCream();
        } else if (flavor.equals("Mango")){
            return new MangoMilkIceCream();
        } else if (flavor.equals("Guava")){
            return new GuavaMilkIceCream();
        }
        return null;
    }
}
