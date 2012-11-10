package com.samthecoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class CommandTest {
    @Test
    public void testOnCommand() {
        Command up = new UpCommand(new Mover());
        assertEquals("up", up.execute());
    }

}
