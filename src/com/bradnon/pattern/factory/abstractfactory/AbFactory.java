package com.bradnon.pattern.factory.abstractfactory;
// 抽象工厂
public abstract class AbFactory {

    /**
     * 生成冰箱
     * @return
     */
    abstract Fridge createFridge();

    /**
     * 生产电视
     * @return
     */
    abstract Television createTelevision();
}
