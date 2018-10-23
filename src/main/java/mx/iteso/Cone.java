package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 *
 */
public class Cone {
    /**
     *
     */
    final void prepare() {
        System.out.println("Preparing cone...");
    }

    /**
     * @param iceCream .
     */
    final void addIceCream(final IceCream iceCream) {
        System.out.println("Adding" + iceCream.getName());
    }

    /**
     *
     */
    final void serve() {
        System.out.println("Serving...");
    }
}
