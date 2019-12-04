package com.bradnon.pattern.adapter.shuangxiang;

public class Client {

    public static void main(String[] args) {
        ConcreteTarget concreteTarget = new ConcreteTarget();
        Adapter adapter = new Adapter(concreteTarget);
        adapter.specificRequest();
    }
}
