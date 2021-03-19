package com.bradnon.pattern2.strategy.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/18 16:25
 */
public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStragety(new ConcreteStragetyA());
        context.stargetyMethod();
        context.setStragety(new ConcreteStragetyB());
        context.stargetyMethod();
    }
}
