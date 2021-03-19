package com.bradnon.pattern2.bridge.origin;

/**
 * @Description: 抽象化角色
 * @author: Brandon
 * @date 2021/3/17 17:00
 */
abstract class Abstraction {

    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void operation();

}
