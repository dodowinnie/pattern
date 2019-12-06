package com.bradnon.pattern.decorator;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void setBlackBorder(){
        System.out.println("为构件添加黑色边框~");
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }
}
