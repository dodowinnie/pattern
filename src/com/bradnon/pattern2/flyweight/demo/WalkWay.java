package com.bradnon.pattern2.flyweight.demo;

/**
 * @Description: 具体享元角色
 * @author: Brandon
 * @date 2021/3/18 14:54
 */
public class WalkWay implements Way {
    @Override
    public void way() {
        System.out.println("走路去公司。。。。");
    }
}
