package com.bradnon.pattern2.handler.origin;

/**
 * @Description: 具体处理者
 * @author: Brandon
 * @date 2021/3/19 11:47
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2处理该请求");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("到头了，没人处理,handler2");
            }
        }
    }
}
