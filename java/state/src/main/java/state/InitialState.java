package state;

/**
 * User: Sina Jahan
 * Date: 12-11-06
 */
public class InitialState implements MyState {

    private MyEngine engine;

    public InitialState(MyEngine en){
        this.engine = en;
    }

    @Override
    public void down() {
        engine.setLocation(engine.getLocation() - 1);
    }

    @Override
    public void up() {
        int current = engine.getLocation();
        engine.setLocation(++current);
        if (current == 3) {
            engine.setState(engine.getFinishedState());
        }
    }
}
