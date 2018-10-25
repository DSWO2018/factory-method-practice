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
     * Store.
     * @param flavor sabor.
     */
    final void prepareCone(final String flavor) {
        IceCream iceCream;
        Cone cone = new Cone();
        cone.prepare();
        iceCream = createIceCreamCone(flavor);

        cone.addIceCream(iceCream);
        cone.serve();

    }

    /**
     * Creates a cone.
     * @param flavor flavor choosen.
     * @return icecreamcone.
     */
    public abstract IceCream createIceCreamCone(String flavor);
}
