package mx.iteso.Stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;

public class WaterIceCreamStore extends IceCreamStore {
    public IceCream createIceCream(String flavor){
        if(flavor.equals("guava")){
            return new GuavaWaterIceCream();
        }else if(flavor.equals("mango")){
            return new MangoWaterIceCream();
        }else if(flavor.equals("pineapple")){
            return new PineappleWaterIceCream();
        }else if(flavor.equals("strawberry")){
            return new StrawberryWaterIceCream();
        }else{
            return null;
        }
    }
}
