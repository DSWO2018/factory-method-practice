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
     *
     */
    private String name;

    /**
     * @param nombre .
     */
    public final void setName(final String nombre) {
        this.name = nombre;
    }

    /**
     * @return .
     */
    public abstract String getName();
}
