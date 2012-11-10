package com.samthecoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class MoverTest {
    @Test
    public void testMover() {
        Mover mover = new Mover();
        assertEquals("up", mover.up());
    }
}
