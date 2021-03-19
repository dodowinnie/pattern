package com.bradnon.pattern2.flyweight.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/18 14:38
 */
public class FlyweightPattern {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight a = flyweightFactory.getFlyweight("a");
        Flyweight aa = flyweightFactory.getFlyweight("a");
        a.operation(new UnsharedConcreteFlyweight("第一次调用a"));
        aa.operation(new UnsharedConcreteFlyweight("第二次调用a"));
    }
}
