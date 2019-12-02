package com.bradnon.pattern.factory.abstractfactory;

public class HaiErTelevision implements Television {
    @Override
    public void show() {
        System.out.println("这是海尔电视机，海尔电视机收看电视");
    }
}
