package mx.iteso;

import mx.iteso.icecreams.Yoghurt.GuavaYoghurticeCream;
import mx.iteso.icecreams.Yoghurt.MangoYoghurticeCream;
import mx.iteso.icecreams.Yoghurt.PineappleYoghurticeCream;
import mx.iteso.icecreams.Yoghurt.StrawberryYoghurticeCream;



public class YoghurticecreamStore extends IceCreamStore {

    public IceCream createIceCream(String flavor) {

        if (flavor.equals("Strawberry")) {
            return new StrawberryYoghurticeCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYoghurticeCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYoghurticeCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaYoghurticeCream();
        }
        return null;
    }
}
