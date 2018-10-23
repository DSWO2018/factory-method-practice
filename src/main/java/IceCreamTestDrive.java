import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.stores.MilkStore;
import mx.iteso.stores.WaterStore;
import mx.iteso.stores.YogurtStore;

/**
 * Main.
 */
final class IceCreamTestDrive {
    /**
     *
     */
    private IceCreamTestDrive() {

    }
    /**
     * @param args .
     */
    public static void main(final String[] args) {
        IceCreamStore milkIceCream  = new MilkStore();
        IceCreamStore waterIceCream = new WaterStore();
        IceCreamStore yogurtIceCream = new YogurtStore();

        IceCream iceCream = milkIceCream.createIceCreamCone("Strawberry");
        System.out.println("Fist order is: " + iceCream.getName());
        System.out.println();
        System.out.println();

        iceCream = waterIceCream.createIceCreamCone("Guava");
        System.out.println("Second order is: " + iceCream.getName());
        System.out.println();
        System.out.println();

        iceCream = yogurtIceCream.createIceCreamCone("Mango");
        System.out.println("Third order is: " + iceCream.getName());


    }
}
