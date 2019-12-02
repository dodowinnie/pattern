package com.bradnon.pattern.singleton.doubleclock;

/**
 * 双重检查锁模式，效率不高，线程安全
 */
public class DoubleClockSingleton {
    private static volatile DoubleClockSingleton singleton;

    private DoubleClockSingleton() {
    }

    public static DoubleClockSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleClockSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleClockSingleton();
                }
            }
        }
        return singleton;
    }
}
