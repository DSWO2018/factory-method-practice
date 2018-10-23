package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/18
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class IceCreamStore {
    /**
     * @param flavor .
     */
    final void prepareCone(final String flavor) {
        IceCream iceCream = new IceCream();
        Cone cone = new Cone();

        cone.prepare();

       iceCream =  createIceCreamCone(flavor);

        cone.addIceCream(iceCream);
        cone.serve();
    }

    /**
     * @param flavor .
     * @return .
     */
    public abstract IceCream createIceCreamCone(String flavor);

}
