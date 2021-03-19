package com.bradnon.pattern2.decorator.origin;

/**
 * @Description: 抽象装饰角色
 * @author: Brandon
 * @date 2021/3/18 13:46
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
