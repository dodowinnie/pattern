package com.bradnon.pattern2.handler.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/19 11:50
 */
public class HandlerDemo {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("3");
    }
}
