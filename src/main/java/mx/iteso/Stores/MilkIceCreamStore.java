package mx.iteso.Stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;

public class MilkIceCreamStore extends IceCreamStore {
    public IceCream createIceCream(String flavor){
        if(flavor.equals("guava")){
            return new GuavaMilkIceCream();
        }else if(flavor.equals("mango")){
            return new MangoMilkIceCream();
        }else if(flavor.equals("pineapple")){
            return new PineappleMilkIceCream();
        }else if(flavor.equals("strawberry")){
            return new StrawberryMilkIceCream();
        }else{
            return null;
        }
    }
}
