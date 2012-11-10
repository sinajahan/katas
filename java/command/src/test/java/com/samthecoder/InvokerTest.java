package com.samthecoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class InvokerTest {
    @Test
    public void testExecute() {
        Command up = new UpCommand(new Mover());
        MyInvoker invoker = new MyInvoker();
        assertEquals("up", invoker.storeAndExecute(up));

    }
}
