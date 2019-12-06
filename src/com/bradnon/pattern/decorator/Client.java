package com.bradnon.pattern.decorator;

public class Client {

    public static void main(String[] args) {
        Component window = new Window();
        Component scrollBar = new ScrollBarDecorator(window);
        Component blackBorder = new BlackBorderDecorator(scrollBar);
        blackBorder.display();
    }
}
