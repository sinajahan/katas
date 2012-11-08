package decoratortest;

import decorator.Base;
import decorator.Flavor;
import decorator.FlavorA;
import decorator.FlavorB;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * User: Sina Jahan
 * Date: 12-11-07
 */
public final class FlavorTest {
    @Test
    public void decorate() {
        Base base = new Base();
        Flavor a = new FlavorA(base);
        Flavor b = new FlavorB(a);
        assertEquals("babase", b.getTaste());
    }

}
