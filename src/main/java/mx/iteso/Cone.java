package mx.iteso;

import mx.iteso.icecreams.IceCream;

public class Cone {

    public void prepare() {
        System.out.println("Preparing your cone");
    }

    public void addIceCream(IceCream iceCream) {
        System.out.println("Adding some " + iceCream.iceCreamFlavor + " to your cone");
    }

    public void serve() {
        System.out.println("Serving your cone");
    }
}
