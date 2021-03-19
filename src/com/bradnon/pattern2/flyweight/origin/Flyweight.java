package com.bradnon.pattern2.flyweight.origin;

/**
 * @Description: 抽象享元角色
 * @author: Brandon
 * @date 2021/3/18 14:31
 */
public interface Flyweight {

    public void operation(UnsharedConcreteFlyweight state);
}
