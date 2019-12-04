package com.bradnon.pattern.adapter.shuangxiang;

public class ConcreteAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("具体适配者的specificRequest方法。。。。。。。。。。。。");
    }
}
