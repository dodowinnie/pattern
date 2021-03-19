package com.bradnon.pattern2.decorator.origin;

/**
 * @Description: 具体装饰角色
 * @author: Brandon
 * @date 2021/3/18 13:47
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("为具体构建角色增加额外功能addedFunction()");

    }
}
