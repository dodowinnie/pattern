package com.bradnon.pattern.factory.abstractfactory;

public class TCLFactory extends AbFactory {
    @Override
    Fridge createFridge() {
        return new TCLFridge();
    }

    @Override
    Television createTelevision() {
        return new TCLTelevision();
    }
}
