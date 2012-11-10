package com.samthecoder.singleton;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class StaticInitialization {

    private StaticInitialization() {
        // empty as it is singleton
    }

    private static StaticInitialization instance = null;

    static {
        instance = new StaticInitialization();
    }

    public static StaticInitialization getInstance() {
        return instance;
    }
}
