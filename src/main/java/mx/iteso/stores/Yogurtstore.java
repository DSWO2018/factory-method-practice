package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.PineappleYogurtIceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;

public class Yogurtstore extends IceCreamStore {
    public IceCream createIceCreamCone(String flavor){

        if(flavor.equals("Strawberry")){
            return new StrawberryYogurtIceCream();
        } else if (flavor.equals("Pineapple")){
            return new PineappleYogurtIceCream();
        } else if (flavor.equals("Mango")){
            return new MangoYogurtIceCream();
        } else if (flavor.equals("Guava")){
            return new GuavaYogurtIceCream();
        }
        return null;
    }
}
