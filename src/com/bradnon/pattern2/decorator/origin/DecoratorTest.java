package com.bradnon.pattern2.decorator.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/18 13:49
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
//        component.operation();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
