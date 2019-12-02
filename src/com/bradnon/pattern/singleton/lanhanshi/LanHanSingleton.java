package com.bradnon.pattern.singleton.lanhanshi;

/**
 * 懒汉式，线程不安全
 */
public class LanHanSingleton {
    private static LanHanSingleton singleton;

    private LanHanSingleton(){}

    public static LanHanSingleton getInstance(){
        if(singleton == null){
            singleton = new LanHanSingleton();
        }
        return singleton;
    }


}
