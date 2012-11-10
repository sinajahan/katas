package com.samthecoder.singleton;

import com.samthecoder.singleton.EagerInitialization;
import com.samthecoder.singleton.LazyInitialization;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class SingletonTest {
    @Test
    public void testLazy() {
        LazyInitialization item = LazyInitialization.getInstance();
        assertNotNull(item);
        LazyInitialization thesame = LazyInitialization.getInstance();
        assertEquals("should be the same object", item, thesame);
    }

    @Test
    public void testEager() {
        EagerInitialization item = EagerInitialization.getInstance();
        assertNotNull(item);
        EagerInitialization thesame = EagerInitialization.getInstance();
        assertEquals("should be the same object", item, thesame);
    }

    @Test
    public void testStatic() {
        StaticInitialization item = StaticInitialization.getInstance();
        assertNotNull(item);
        StaticInitialization thesame = StaticInitialization.getInstance();
        assertEquals("should be the same object", item, thesame);
    }

    @Test
    public void testNested() {
        NestedInitialization item = NestedInitialization.getInstance();
        assertNotNull(item);
        NestedInitialization thesame = NestedInitialization.getInstance();
        assertEquals("should be the same object", item, thesame);
    }


    @Test
    public void testEnum() {
        EnumInitialization item = EnumInitialization.INSTANCE;
        assertNotNull(item);
        EnumInitialization thesame = EnumInitialization.INSTANCE;
        assertEquals("should be the same object", item, thesame);
    }
}
