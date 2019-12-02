package com.bradnon.pattern.factory.abstractfactory;

public class TCLTelevision implements Television {
    @Override
    public void show() {
        System.out.println("这是TCL电视机，TCL电视机收看电视");
    }
}
