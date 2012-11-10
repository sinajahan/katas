package com.samthecoder.singleton;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class EagerInitialization {
    private EagerInitialization() {
        // empty as it is singleton
    }

    private static final EagerInitialization instance = new EagerInitialization();

    public static EagerInitialization getInstance() {
        return instance;
    }
}
