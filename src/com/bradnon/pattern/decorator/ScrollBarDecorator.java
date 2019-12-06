package com.bradnon.pattern.decorator;

public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display(){
        setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("为构件添加滚动条");
    }
}
