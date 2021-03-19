package com.bradnon.pattern2.adapter.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/17 15:49
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
