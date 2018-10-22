import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.stores.MilkStore;
import mx.iteso.stores.WaterStore;
import mx.iteso.stores.YogurtStore;

public class IceCreamTestDrive {
    public static void main(String[] args){
        IceCreamStore milkIceCream  = new MilkStore();
        IceCreamStore waterIceCream = new WaterStore();
        IceCreamStore yogurtIceCream = new YogurtStore();

        IceCream iceCream = milkIceCream.createIceCreamCone("Strawberry");
        System.out.println("Fist order is: "+ iceCream.getName());
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
