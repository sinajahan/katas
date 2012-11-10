package com.samthecoder;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public final class NewYorkPizzaShop extends Shop {
    @Override
    Pizza create(final String order) {
        if ("vegie".equals(order)) {
            return new NyVegetarian();
        } else throw new IllegalArgumentException("Unknown order:" + order);
    }

}
