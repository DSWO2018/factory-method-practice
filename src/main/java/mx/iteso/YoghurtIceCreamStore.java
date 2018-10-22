package mx.iteso;

import mx.iteso.icecreams.*;
import mx.iteso.icecreams.yoghurt.*;


public class YoghurtIceCreamStore {
    public IceCream createYoghurtIceCream(String flavor){

        if(flavor.equals("Strawberry")){
            return new StrawberryYoghurtIceCream();
        } else if (flavor.equals("Pineapple")){
            return new PineappleYoghurtIceCream();
        } else if (flavor.equals("Mango")){
            return new MangoYoghurtIceCream();
        } else if (flavor.equals("Guava")){
            return new GuavaYoghurtIceCream();
        }
        return null;
    }
}
