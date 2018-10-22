package mx.iteso.IceCreamStores;

import mx.iteso.cones.Cone;
import mx.iteso.icecreams.IceCream;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/18
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class IceCreamStore {



    public abstract IceCream createIceCream(String flavor);

    public void prepareCone(String flavor) {
        IceCream iceCream;
        Cone cone = new Cone();
        cone.prepare();
        iceCream = createIceCream(flavor);
        cone.addIceCream(iceCream);
        System.out.println(iceCream);
        cone.serve();
        System.out.println();
    }


}
