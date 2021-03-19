package com.bradnon.pattern2.handler.origin;

/**
 * @Description: 抽象处理者角色
 * @author: Brandon
 * @date 2021/3/19 11:45
 */
abstract class Handler {

    private Handler next; // 后继者

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    // 处理请求的方法
    public abstract void handleRequest(String request);
}
