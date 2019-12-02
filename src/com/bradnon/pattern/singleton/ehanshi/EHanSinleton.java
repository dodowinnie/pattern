package com.bradnon.pattern.singleton.ehanshi;

/**
 * 效率不高
 */
public class EHanSinleton {

    private static EHanSinleton singleton = new EHanSinleton();

    private EHanSinleton(){}

    public static EHanSinleton getInstance(){
        return singleton;
    }
}
