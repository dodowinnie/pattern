package com.bradnon.pattern2.flyweight.origin;

/**
 * @Description: 具体享元角色
 * @author: Brandon
 * @date 2021/3/18 14:32
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元" + key + "被调用");
        System.out.println("非享元信息是：" + state.getInfo());
    }
}
