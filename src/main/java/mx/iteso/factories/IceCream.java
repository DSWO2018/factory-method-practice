package mx.iteso.factories;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class IceCream {

    private String iceCname;

    public void setName(final String nombre) {
        this.iceCname = nombre;
    }

    public abstract String getName();
}