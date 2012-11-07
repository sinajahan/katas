package strategy;

/**
 * User: Sina Jahan
 * Date: 12-11-06
 */
public class Engine {
    private Algorithm algorithm;

    public Engine(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public int doIt() {
        return algorithm.doSomething();
    }
}
