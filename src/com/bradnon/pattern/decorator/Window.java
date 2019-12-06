package com.bradnon.pattern.decorator;

public class Window implements Component {
    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}
