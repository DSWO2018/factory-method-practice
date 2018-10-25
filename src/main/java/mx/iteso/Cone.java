package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 * Cone a type of serving for a frozen dessert.
 */
public class Cone {
    /**
     * Prepare a cone.
     */
    final void prepare() {
        System.out.println("Creating an awesome and delicious cone");
    }

    /**
     * Adding specific Icecream.
     * @param iceCream sasasasa.
     */
    final void addIceCream(final IceCream iceCream) {
        System.out.println("Adding special love through=" + iceCream.getName());
    }

    /**
     * Serving a cone.
     */
    final void serve() {
        System.out.println("Now is time to enjoy yourselfe by presenting this");
    }
}
