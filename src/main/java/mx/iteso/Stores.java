package mx.iteso;

import mx.iteso.IceCreamStores.*;
/**
 * Created by Palaf on 22/10/2018.
 */
public class Stores {
    public static void main(String[] args) {
        IceCreamStore storeMilk = new IceCreamStoreMilk();
        storeMilk.prepareCone("Mango");
        IceCreamStore storeWater = new IceCreamStoreWater();
        storeWater.prepareCone("Mango");
        IceCreamStore storeYogurt = new IceCreamStoreYogurt();
        storeYogurt.prepareCone("Mango");

    }
}
