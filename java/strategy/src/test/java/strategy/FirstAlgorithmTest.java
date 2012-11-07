package strategy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * User: Sina Jahan
 * Date: 12-11-06
 */
public final class FirstAlgorithmTest {
    @Test
    public void shouldReturnOne() {
        FirstImplementation alg = new FirstImplementation();
        int result = alg.doSomething();
        assertEquals(1, result);
    }

}
