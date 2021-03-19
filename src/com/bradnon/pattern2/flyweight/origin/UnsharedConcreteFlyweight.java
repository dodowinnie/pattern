package com.bradnon.pattern2.flyweight.origin;

/**
 * @Description: 非享元角色
 * @author: Brandon
 * @date 2021/3/18 14:30
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
