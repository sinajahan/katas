package com.samthecoder;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public final class ChicagoPizzaShop extends Shop {
    @Override
    Pizza create(final String order) {
        if ("vegie".equals(order)) {
            return new ChicagoVegetarian();
        } else {
            throw new IllegalArgumentException("bad order:" + order);
        }
    }
}
