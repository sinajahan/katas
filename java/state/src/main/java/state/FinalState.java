package state;

/**
 * User: Sina Jahan
 * Date: 12-11-06
 */
public class FinalState implements MyState {
    private MyEngine myEngine;

    public FinalState(MyEngine myEngine) {
        this.myEngine = myEngine;
    }

    @Override
    public void down() {
        int location = myEngine.getLocation();
        myEngine.setLocation(--location);
    }

    @Override
    public void up() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
