import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.stores.Milkstore;
import mx.iteso.stores.Waterstore;
import mx.iteso.stores.Yogurtstore;

/**
 * Prueba.
 */
public final class IceCreamTest {
    /**
     * Prueba de fuego.
     */
    private IceCreamTest() {

    }
    /**
     * @param args muchos.
     */
    public static void main(final String[] args) {
        IceCreamStore milkIceCream  = new Milkstore();
        IceCreamStore waterIceCream = new Waterstore();
        IceCreamStore yogurtIceCream = new Yogurtstore();

        IceCream iceCream = milkIceCream.createIceCreamCone("Guava");
        System.out.println("Ordering as: " + iceCream.getName() + "/n");

        iceCream = waterIceCream.createIceCreamCone("Guava");
        System.out.println("Ordering next: " + iceCream.getName() + "/n");

        iceCream = yogurtIceCream.createIceCreamCone("Mango");
        System.out.println("Last one is: " + iceCream.getName() + "/n");
    }
}
