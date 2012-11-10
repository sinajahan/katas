package com.samthecoder;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public abstract class Shop {
    public Pizza orderFromCustomer(String order) {
        return create(order);
    }

    abstract Pizza create(String order);
}
