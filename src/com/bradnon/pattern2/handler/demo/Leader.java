package com.bradnon.pattern2.handler.demo;

/**
 * @Description: 抽象处理者
 * @author: Brandon
 * @date 2021/3/19 13:34
 */
abstract class Leader {

    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public abstract void handleRequest(int leaveDays);
}
