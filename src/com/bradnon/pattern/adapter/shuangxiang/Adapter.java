package com.bradnon.pattern.adapter.shuangxiang;

public class Adapter implements Adaptee, Target {

    private Adaptee adaptee;
    private Target target;

    public Adapter(Target target) {
        this.target = target;
    }

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
