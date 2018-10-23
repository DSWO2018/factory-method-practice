package mx.iteso;

import mx.iteso.stores.MilkStore;
import mx.iteso.stores.YogurtStore;

public class Example {

    public static void main(String[] args) {

        IceCreamStore OnlyMilkIceCreamStore = new MilkStore();
        IceCreamStore OnlyWaterIceCreamStore = new MilkStore();
        IceCreamStore OnlyYogurtIceCreamStore = new YogurtStore();

        OnlyMilkIceCreamStore.prepareCone("Pineapple");
        OnlyWaterIceCreamStore.prepareCone("Mango");
        OnlyYogurtIceCreamStore.prepareCone("Strawberry");

    }
}
