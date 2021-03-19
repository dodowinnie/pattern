package com.bradnon.pattern2.template.origin;

/**
 * @Description: 具体子类
 * @author: Brandon
 * @date 2021/3/18 15:35
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用。。。");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用。。。");
    }
}
