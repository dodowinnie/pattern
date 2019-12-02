package com.bradnon.pattern.factory.abstractfactory;

public class TCLFridge implements Fridge {
    @Override
    public void freeze() {
        System.out.println("这是TCL冰箱，TCL冰箱冷冻食物");
    }
}
