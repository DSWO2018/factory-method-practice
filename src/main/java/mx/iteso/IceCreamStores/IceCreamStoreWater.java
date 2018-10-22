package mx.iteso.IceCreamStores;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.*;

/**
 * Created by Palaf on 22/10/2018.
 */
public class IceCreamStoreWater extends IceCreamStore {
    @Override
    public IceCream createIceCream(String flavor) {
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

    @Override
    public void prepareCone(String flavor) {
        super.prepareCone(flavor);
    }
}
