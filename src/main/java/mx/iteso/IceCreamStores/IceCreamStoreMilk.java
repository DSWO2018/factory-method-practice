package mx.iteso.IceCreamStores;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.*;
/**
 * Created by Palaf on 22/10/2018.
 */
public class IceCreamStoreMilk extends IceCreamStore {
    @Override
    public void prepareCone(String flavor) {
        super.prepareCone(flavor);
    }

    @Override
    public IceCream createIceCream(String flavor) {
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
