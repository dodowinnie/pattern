package com.bradnon.pattern2.template.origin;

/**
 * @Description: 抽象类
 * @author: Brandon
 * @date 2021/3/18 15:33
 */
abstract class AbstractClass {

    // 模板方法
    public void templateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    // 具体方法
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用。。。");
    }

    public abstract void abstractMethod1(); // 抽象方法1
    public abstract void abstractMethod2(); // 抽象方法2


}
