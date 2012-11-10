package com.samthecoder.singleton;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class NestedInitialization {
    private NestedInitialization() {
        // empty as it is singleton
    }

    private static class SingletonHolder {
        public static NestedInitialization instance = new NestedInitialization();
    }

    public static NestedInitialization getInstance() {
        return SingletonHolder.instance;
    }


}
