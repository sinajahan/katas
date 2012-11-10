package com.samthecoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public final class ShopTest {

    @Test
    public void testOrderVegieInNewYork() {
        Shop shop = new NewYorkPizzaShop();
        Pizza myorder = shop.orderFromCustomer("vegie");
        assertEquals("New York vegetarian", myorder.getDescription());
    }

    @Test
    public void testOrderVegieInChicago(){
        Shop shop = new ChicagoPizzaShop();
        assertEquals("Chicago Vegetarian", shop.orderFromCustomer("vegie").getDescription());
    }
}
