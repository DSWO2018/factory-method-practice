package mx.iteso;

import mx.iteso.icecreams.*;
import mx.iteso.icecreams.water.*;

public class WaterIceCreamStore {
    public IceCream createWaterIceCream(String flavor){

        if(flavor.equals("Strawberry")){
            return new StrawberryWaterIceCream();
        } else if (flavor.equals("Pineapple")){
            return new PineappleWaterIceCream();
        } else if (flavor.equals("Mango")){
            return new MangoWaterIceCream();
        } else if (flavor.equals("Guava")){
            return new GuavaWaterIceCream();
        }
        return null;
    }
}
