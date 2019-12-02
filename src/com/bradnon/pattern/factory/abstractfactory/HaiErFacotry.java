package com.bradnon.pattern.factory.abstractfactory;

public class HaiErFacotry extends AbFactory {

    private static HaiErFacotry factory = new HaiErFacotry();

    private HaiErFacotry(){

    }

    public static HaiErFacotry getInstance(){

        return factory;
    }


    @Override
    Fridge createFridge() {
        return new HaiErFridge();
    }

    @Override
    Television createTelevision() {
        return new HaiErTelevision();
    }
}
