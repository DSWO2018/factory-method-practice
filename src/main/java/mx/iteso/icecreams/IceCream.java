package mx.iteso.icecreams;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class IceCream {
    /**
     * Name of the flavor.
     */
    private String flavorname;

    /**
     * Sets the name of the flavor.
     * @param nameflavor Nombre.
     */
    public final void setName(final  String nameflavor) {
        this.flavorname = nameflavor;
    }

    /**
     * Return the name of the flavor.
     * @return The name.
     */
    public abstract String getName();
}
