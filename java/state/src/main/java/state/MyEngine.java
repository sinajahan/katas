package state;

/**
 * User: Sina Jahan
 * Date: 12-11-06
 */
public class MyEngine {

    private int location;

    private MyState initialState;
    private MyState finishedState;

    public MyState getInitialState() {
        return initialState;
    }

    public MyState getFinishedState() {
        return finishedState;
    }

    private MyState state;

    public MyEngine() {
        initialState = new InitialState(this);
        finishedState = new FinalState(this);

        state = initialState;
    }


    public void up() {
        state.up();
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setState(MyState state){
        this.state = state;
    }
}
