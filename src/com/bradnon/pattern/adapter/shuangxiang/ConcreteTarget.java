package com.bradnon.pattern.adapter.shuangxiang;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("具体目标的request方法。。。。。。。。。。");
    }
}
