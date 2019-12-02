package com.bradnon.pattern.factory.abstractfactory;

/**
 * 海尔冰箱
 */
public class HaiErFridge implements Fridge {
    @Override
    public void freeze() {
        System.out.println("这是海尔冰箱，海尔冰箱冷冻食物");
    }
}
