package com.bradnon.pattern.adapter.test;

public class Adpater implements TargetOperation {

    private Adaptee adaptee;

    public Adpater() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.specificRequst();
    }
}
