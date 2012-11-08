package decorator;

/**
 * User: Sina Jahan
 * Date: 12-11-07
 */
public class Base implements Flavor {

    @Override
    public String getTaste() {
        return "base";
    }
}
