package mx.iteso;

import mx.iteso.factories.IceCream;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/18
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class IceCreamStore {

    final void prepareCone(final String flavor) {
        Cone cone = new Cone();
        IceCream icecream;

        cone.prepare();
        icecream =  createIceCreamCone(flavor);
        cone.addIceCream(icecream);
        cone.serve();

    }
    public abstract IceCream createIceCreamCone(String flavor);

}
