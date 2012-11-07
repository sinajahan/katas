package strategy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * User: Sina Jahan
 * Date: 12-11-06
 */
public class SecondAlgorithmTest {
    @Test
    public void shouldReturnTwo() {
        SecondImplementation alg = new SecondImplementation();
        int result = alg.doSomething();
        assertEquals(2, result);

    }
}
