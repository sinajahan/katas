package decorator;

/**
 * User: Sina Jahan
 * Date: 12-11-07
 */
public class FlavorA implements Flavor {

    private Flavor flavor;

    public FlavorA(Flavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getTaste() {
        return "a" + flavor.getTaste();
    }
}
