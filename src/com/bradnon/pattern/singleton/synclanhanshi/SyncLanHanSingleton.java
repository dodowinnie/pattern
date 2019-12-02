package com.bradnon.pattern.singleton.synclanhanshi;

/**
 * 添加同步，但是线程也不安全
 */
public class SyncLanHanSingleton {

    private static SyncLanHanSingleton singleton;

    private SyncLanHanSingleton(){}

    public static SyncLanHanSingleton getInstance(){
        if(singleton == null){
            synchronized (SyncLanHanSingleton.class){
                singleton = new SyncLanHanSingleton();
            }
        }
        return singleton;
    }
}
