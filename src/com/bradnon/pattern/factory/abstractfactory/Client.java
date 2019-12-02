package com.bradnon.pattern.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        TCLFactory tclFactory = new TCLFactory();
        Fridge fridge = HaiErFacotry.getInstance().createFridge();
        fridge.freeze();
        Television television = tclFactory.createTelevision();
        television.show();
    }
}
