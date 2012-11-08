package decorator;

/**
 * User: Sina Jahan
 * Date: 12-11-07
 */
public class FlavorB implements Flavor {
    private Flavor flavor;

    public FlavorB(Flavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getTaste() {
        return "b" + flavor.getTaste();
    }
}
