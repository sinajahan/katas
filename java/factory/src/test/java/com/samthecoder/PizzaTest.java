package com.samthecoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public final class PizzaTest {
    @Test
    public void testNYVegetarian() {
        Pizza pizza = new NyVegetarian();
        assertEquals("New York vegetarian", pizza.getDescription());
    }

    @Test
    public void testChicagoVegetarian() {
        Pizza pizza = new ChicagoVegetarian();
        assertEquals("Chicago Vegetarian", pizza.getDescription());

    }
}
