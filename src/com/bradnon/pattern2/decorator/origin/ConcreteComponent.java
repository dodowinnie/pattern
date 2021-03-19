package com.bradnon.pattern2.decorator.origin;

/**
 * @Description: 具体构件角色
 * @author: Brandon
 * @date 2021/3/18 13:44
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
