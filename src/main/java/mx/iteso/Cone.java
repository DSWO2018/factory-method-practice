package mx.iteso;

import mx.iteso.icecreams.IceCream;

public class Cone {
    public void prepare() {
        System.out.println("Preparing cone..." );
    }

    public void addIceCream(IceCream iceCream) {
        System.out.println("Adding" + iceCream.getName());
    }

    public void serve() {
        System.out.println("Serving...");
    }
}
