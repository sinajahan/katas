package com.samthecoder.singleton;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class LazyInitialization {
    private LazyInitialization() {
        // empty to avoid instanciation
    }

    private static volatile LazyInitialization instance;


    public static LazyInitialization getInstance() {
        if (instance == null) {
            synchronized (LazyInitialization.class) {
                if (instance == null) {
                    instance = new LazyInitialization();
                }
            }
        }
        return instance;
    }
}
