package strategy;

import org.hamcrest.core.AllOf;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * User: Sina Jahan
 * Date: 12-11-06
 */
public class StrategyTest {

    @Test
    public void shouldPassToAlgorithm() {
        Algorithm first = mock(FirstImplementation.class);
        when(first.doSomething()).thenReturn(1);
        Engine engine = new Engine(first);
        int result = engine.doIt();
        assertEquals(1, result);
        verify(first).doSomething();
    }

    @Test
    public void shouldChangeAlgorithmOnTheFly() {
        Algorithm first = new FirstImplementation();
        Algorithm second = new SecondImplementation();
        Engine engine = new Engine(first);
        int firstResult = engine.doIt();
        assertEquals(1, firstResult);
        engine = new Engine(second);
        int secondResult = engine.doIt();
        assertEquals(2, secondResult);




    }

}
