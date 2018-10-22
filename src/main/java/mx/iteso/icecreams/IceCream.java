package mx.iteso.icecreams;

import mx.iteso.icecreams.yougurt.GuavaYougurtIceCream;
import mx.iteso.icecreams.yougurt.MangoYougurtIceCream;
import mx.iteso.icecreams.yougurt.PineappleYougurtIceCream;
import mx.iteso.icecreams.yougurt.StrawberryYougurtIceCream;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class IceCream {
    public IceCream createIceCream(String flavor){
        if(flavor.equals("guava")){
            return new GuavaYougurtIceCream();
        }else if(flavor.equals("mango")){
            return new MangoYougurtIceCream();
        }else if(flavor.equals("pineapple")){
            return new PineappleYougurtIceCream();
        }else if(flavor.equals("strawberry")){
            return new StrawberryYougurtIceCream();
        }else{
            return null;
        }
    }
}
