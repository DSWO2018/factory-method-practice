package mx.iteso.IceCreamStores;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurt.*;

/**
 * Created by Palaf on 22/10/2018.
 */
public class IceCreamStoreYogurt extends IceCreamStore{
    @Override
    public IceCream createIceCream(String flavor) {
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

    @Override
    public void prepareCone(String flavor) {
        super.prepareCone(flavor);
    }
}
