package mx.iteso.cones;

import mx.iteso.icecreams.IceCream;

public class Cone {
    public void prepare() {
        System.out.println("preparing...");
    }

    public void addIceCream(IceCream iceCream) {
        System.out.println("Adding ice-cream...");
    }

    public void serve() {
        System.out.println("Served!");
    }
}
