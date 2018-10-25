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
     * @param flavor IceCreamFlavor.
     * @return  icecream.
     */
    public abstract IceCream createIceCream(String flavor);

    /**
    * @param Base .
     * @param flavor .
     */
    public final void prepareCone(final String Base, final String flavor) {
        IceCream iceCream = new IceCream();
        Cone cone = new Cone();

        cone.prepare();

        iceCream = createIceCream(flavor);
        cone.addIceCream(iceCream);
        cone.serve();
    }
}
