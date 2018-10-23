package mx.iteso;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/18
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class IceCreamStore {

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

    public void prepareCone(String base, String flavor){
        IceCream iceCream = new IceCream();
        Cone cone = new Cone();

        cone.prepare();

        if (base.equals("milk")){
            iceCream = createMilkIceCream(flavor);
        } else if (base.equals("water")){
            iceCream = createWaterIceCream(flavor);
        }
        cone.addIceCream(iceCream);
        cone.serve();

    }

}
