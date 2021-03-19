package com.bradnon.pattern2.bridge.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/17 17:25
 */
public class BridgeTest {

    public static void main(String[] args) {
        Implementor imple = new ConcreteImplemetorA();
        Abstraction abs = new RefineAbstraction(imple);
        abs.operation();
    }
}
