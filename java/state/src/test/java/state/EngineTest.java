package state;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * User: Sina Jahan
 * Date: 12-11-06
 */
public class EngineTest {
    @Test
    public void shouldGoUp() {
        MyEngine engine = new MyEngine();
        engine.up();
        int state = engine.getLocation();
        assertEquals(1, state);
    }

    @Test
    public void shouldntGoHigherThan3(){
        MyEngine engine = new MyEngine();
        engine.up();
        engine.up();
        engine.up();
        engine.up();
        assertEquals(3, engine.getLocation());
    }

}
